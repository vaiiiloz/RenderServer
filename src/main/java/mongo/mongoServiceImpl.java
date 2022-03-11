package mongo;

import com.proto.common.Box;
import com.proto.mongo.MongoRequest;
import com.proto.mongo.MongoResponse;
import com.proto.mongo.MongoServiceGrpc;
import entities.BBox;
import io.grpc.stub.StreamObserver;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class mongoServiceImpl extends MongoServiceGrpc.MongoServiceImplBase {

    private MongoHandler mongoHandler;
    public mongoServiceImpl() {
        mongoHandler = new MongoHandler();
    }

    private Date convertTime(String time, String format) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(format);
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df.parse(time);
    }


    @Override
    public void getBoxes(MongoRequest request, StreamObserver<MongoResponse> responseObserver) {
        //convert date

        try{

            //get start end
            Date start = convertTime(request.getTimeRequest().getStart().getTime(),
                    request.getTimeRequest().getStart().getFormat());
            Date end = convertTime(request.getTimeRequest().getEnd().getTime(),
                    request.getTimeRequest().getEnd().getFormat());


            //find boxes in mongodb
            List<Box> boxes = mongoHandler.findBoxes(request.getDeviceId(), start, end);

            MongoResponse.Builder mongoResponseBuilder = MongoResponse.newBuilder();
            //return response
//            boxes.forEach(box ->{
////                Box.Builder protobox = Box.newBuilder();
////                protobox.setX(box.getX());
////                protobox.setY(box.getY());
////                protobox.setW(box.getW());
////                protobox.setH(box.getH());
////                protobox.setScore((float) box.getScore());
//                mongoResponseBuilder.addBox(box);
//            });
            mongoResponseBuilder.addAllBox(boxes);


            responseObserver.onNext(mongoResponseBuilder.build());


            //complete service
            responseObserver.onCompleted();
        }catch(ParseException e){
            System.out.println("Parse Exception");
            e.printStackTrace();
        }


    }
}
