package mongo;

import Config.AppfileConfig;
import Config.SpringContext;
import com.mongodb.*;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Aggregates;
import com.mongodb.client.model.Filters;
import com.proto.common.Box;
import entities.BBox;
import org.bson.Document;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MongoHandler {
    private MongoClient mongoClient;
    private MongoDatabase database;
    public AppfileConfig appfileConfig;

    public MongoHandler() {
        appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);
        initMongoClient();
    }

    /**
     * Create Mongo client
     */
    public void initMongoClient() {
        MongoCredential credential = MongoCredential.createCredential(appfileConfig.mongUser, "admin", appfileConfig.mongoPass.toCharArray());
        mongoClient = new MongoClient(new ServerAddress(appfileConfig.mongoAddress, appfileConfig.mongoPort), Arrays.asList(credential));
        database = mongoClient.getDatabase(appfileConfig.mongoDatabase);
    }


    /**
     * Find the list of box with camID and time internal
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    public List<Box> findBoxes(String deviceId, long start, long end) {
        MongoCollection collection = database.getCollection(appfileConfig.boxCollection);
        List<Box> boxes = new ArrayList<>();
        //find match value
        FindIterable<Document> findIterable = collection.find(Filters.and(
                Filters.eq("camId", deviceId),
                Filters.gte("time", start),
                Filters.lte("time", end)
        ));
        MongoCursor<Document> cursor = findIterable.iterator();
        //convert all find Document to BBox

        while (cursor.hasNext()) {
            Document document = cursor.next();

            List<List> bboxes = (List<List>) document.get("boxes");


            boxes.addAll(bboxes.stream().map(document1 -> ListToBox(document1)).toList());

        }
//        System.out.println(boxes.size());

        return boxes;
    }

    /**
     * Find the background of camID in the time internal
     * @param deviceId
     * @param start
     * @param end
     * @return
     */
    public String[] findBackgroundPath(String deviceId, long start, long end) {
        try {
            //get Collecttion
            MongoCollection collection = database.getCollection(appfileConfig.backgroundCollection);
            //query and sort
            FindIterable<Document> findIterable = collection.find(Filters.and(
                    Filters.eq("camId", deviceId),
                    Filters.gte("time", start),
                    Filters.lte("time", end)
            )).sort(new BasicDBObject("time", 1));

            //convert to list String[]
            MongoCursor<Document> cursor = findIterable.iterator();
            List<String[]> list = new ArrayList<>();

            while (cursor.hasNext()) {
                Document document = cursor.next();
                if (!document.containsKey("path")) {
                    continue;
                }
                list.add(new String[]{
                        document.get("bucket").toString(),
                        document.get("path").toString()
                });
            }
            //return the closest to center
            return list.get(list.size() / 2);
        } catch (Exception e) {
            e.printStackTrace();
            return new String[2];
        }

    }

    public Set<Integer> findTrackID(String camId, long start, long end){

        //get Collection
        MongoCollection collection = database.getCollection(appfileConfig.trackCollection);

        //query
        FindIterable<Document> findIterable = collection.find(Filters.and(
                Filters.eq("camId", camId),
                Filters.gte("time", start),
                Filters.lte("time", end)
        ));

        MongoCursor<Document> cursor = findIterable.iterator();
        Set<Integer> list_trackId = new HashSet<>();

        //get list trackId
        while (cursor.hasNext()){
            Document document = cursor.next();
            if (!document.containsKey("boxes")){
                continue;
            }

            List<List> boxes = (List<List>) document.get("boxes");
            list_trackId.addAll(boxes.stream().map(box -> (int) box.get(4)).collect(Collectors.toList()));
        }
        return list_trackId;

    }

    /**
     * Convert x1y1x2y2 to xywh format
     * @param x1
     * @param y1
     * @param x2
     * @param y2
     * @return
     */
    private int[] x1y1x2y2_to_xywh(int x1, int y1, int x2, int y2){
        return (new int[]{
                (x2+x1)/2,
                (y2+y1)/2,
                x2-x1,
                y2-y1
        });
    }

    /**
     * Convert list (from mongo) to box response
     * @param box_value
     * @return
     */
    private Box ListToBox(List box_value){
        Box.Builder box = Box.newBuilder();
        //convert to xywh
        int[] xywh = x1y1x2y2_to_xywh((int) box_value.get(0), (int) box_value.get(1), (int) box_value.get(2), (int) box_value.get(3));

        box.setX(xywh[0]);
        box.setY(xywh[1]);
        box.setW(xywh[2]);
        box.setH(xywh[3]);
        box.setScore(0);
        return box.build();
    }

    /**
     * Convert document (from mongo) to box response
     * @param document
     * @return
     */
    private Box DocumentToBox(Document document){
        Box.Builder box = Box.newBuilder();
        //get box
        List box_value = (List) document;
        //convert to xywh
        int[] xywh = x1y1x2y2_to_xywh((int) box_value.get(0), (int) box_value.get(1), (int) box_value.get(2), (int) box_value.get(3));

        box.setX(xywh[0]);
        box.setY(xywh[1]);
        box.setW(xywh[2]);
        box.setH(xywh[3]);
        box.setScore(0);
        return box.build();
    }

    private Function<Document, Box> convertDocumentToBox() {
        return document -> DocumentToBox(document);
    }


}
