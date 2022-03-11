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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MongoHandler {
    private MongoClient mongoClient;
    private MongoDatabase database;
    public AppfileConfig appfileConfig;

    public MongoHandler() {
        appfileConfig = SpringContext.context.getBean("appfileConfig",AppfileConfig.class);
        initMongoClient();
    }

    public void initMongoClient(){
        MongoCredential credential = MongoCredential.createCredential(appfileConfig.mongUser, "admin", appfileConfig.mongoPass.toCharArray());
        mongoClient = new MongoClient(new ServerAddress(appfileConfig.mongoAddress, appfileConfig.mongoPort), Arrays.asList(credential));
        database = mongoClient.getDatabase(appfileConfig.mongoDatabase);
    }



    public List<Box> findBoxes(String deviceId, Date start, Date end){
        MongoCollection collection = database.getCollection(appfileConfig.mongoCollection);
        List<Box> boxes = new ArrayList<>();
        //find match value
        FindIterable<Document> findIterable = collection.find(Filters.and(
                Filters.eq("DeviceID", deviceId),
                Filters.gte("time", start),
                Filters.lte("time", end)
        ));
        MongoCursor<Document> cursor = findIterable.iterator();
        //convert all find Document to BBox

        while (cursor.hasNext()){
            Document document = cursor.next();
            List<Document> bboxes = (List<Document>) document.get("points");
            boxes.addAll(bboxes.stream().map(convertDocumentToBox()).collect(Collectors.toList()));
        }
        System.out.println(boxes.size());

        return boxes;
    }


    private Function<Document, Box> convertDocumentToBox(){
        return document -> {
            if (!document.containsKey("x")){
                return null;
            }
            Box.Builder box = Box.newBuilder();
            int x = (int) document.get("x");
            int y = (int) document.get("y");
            int w = (int) document.get("w");
            int h = (int) document.get("h");
            double score = (double) document.get("score");
            box.setX(x);
            box.setY(y);
            box.setW(w);
            box.setH(h);
            box.setScore((float) score);
            return box.build();
        };
    }



}
