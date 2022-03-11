package Controller;

import com.google.protobuf.ByteString;
import com.proto.common.Box;

import com.proto.render_server.RenderServiceGrpc;
import com.proto.render_server.ServerRequest;
import com.proto.render_server.ServerResponse;


import heatmap.Renderer;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import mongo.MongoHandler;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

public class RenderServerImpl extends RenderServiceGrpc.RenderServiceImplBase {



    private MongoHandler mongoHandler;

    public RenderServerImpl() {
        mongoHandler = new MongoHandler();
    }


    private Date convertTime(String time, String format) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat(format);
        df.setTimeZone(TimeZone.getTimeZone("GMT"));
        return df.parse(time);
    }

    private ByteString getResponse(ServerRequest request){
        try {

            //get start end
            Date start = convertTime(request.getTimeRequest().getStart().getTime(),
                    request.getTimeRequest().getStart().getFormat());
            Date end = convertTime(request.getTimeRequest().getEnd().getTime(),
                    request.getTimeRequest().getEnd().getFormat());

            //find boxes in mongodb
            List<Box> boxes = mongoHandler.findBoxes(request.getDeviceId(), start, end);
            //render heatmap
            BufferedImage heatmap = Renderer.renderHeatMap(request.getWidth(), request.getHeight(), boxes);
            //convert heatmap
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(heatmap, "png", baos);
            baos.flush();
            byte[] bytes = baos.toByteArray();
            baos.close();
            ByteBuffer buf = ByteBuffer.wrap(bytes);

            ByteString byteString = ByteString.copyFrom(buf);
            return byteString;
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public StreamObserver<ServerRequest> getHeatmapStream(StreamObserver<ServerResponse> responseObserver) {
        StreamObserver<ServerRequest> streamObserver = new StreamObserver<ServerRequest>() {
            @Override
            public void onNext(ServerRequest value) {
                responseObserver.onNext(ServerResponse.newBuilder().setHeatmap(getResponse(value)).setUserid(value.getUserid()).build());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(Status.INTERNAL.withDescription("Internal server error").asRuntimeException());
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
        return streamObserver;
    }

    @Override
    public void getHeatmap(ServerRequest request, StreamObserver<ServerResponse> responseObserver) {
        responseObserver.onNext(ServerResponse.newBuilder().setHeatmap(getResponse(request)).setUserid(request.getUserid()).build());
        responseObserver.onCompleted();
    }


}
