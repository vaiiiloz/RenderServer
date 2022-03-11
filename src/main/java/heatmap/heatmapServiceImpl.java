package heatmap;

import com.google.protobuf.ByteString;
import com.proto.common.Box;
import com.proto.heatmap.HeatmapServiceGrpc;
import com.proto.heatmap.heatmapRequest;
import com.proto.heatmap.heatmapResponse;
import entities.BBox;
import io.grpc.stub.StreamObserver;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.List;

public class heatmapServiceImpl extends HeatmapServiceGrpc.HeatmapServiceImplBase {

    @Override
    public void getHeatmap(heatmapRequest request, StreamObserver<heatmapResponse> responseObserver) {
        try{

            List<Box> boxes = request.getBoxesList();

            //create heatmap
            BufferedImage heatmap = Renderer.renderHeatMap(request.getWidth(), request.getHeight(), boxes);


            //convert bufferedImage to bytearray
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ImageIO.write(heatmap, "png", baos);
            baos.flush();
            byte[] bytes = baos.toByteArray();

            baos.close();
            ByteBuffer buf = ByteBuffer.wrap(bytes);

            ByteString byteString = ByteString.copyFrom(buf);

//            System.out.println(byteString.size());
            heatmapResponse.Builder responseBuilder = heatmapResponse.newBuilder();
            responseBuilder.setHeatmap(byteString);

            //push response
            responseObserver.onNext(responseBuilder.build());
            //complete service
            responseObserver.onCompleted();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
