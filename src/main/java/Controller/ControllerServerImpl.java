package Controller;

import Config.AppfileConfig;
import Config.SpringContext;
import com.proto.common.Time;
import com.proto.controller.*;
import com.proto.heatmap.HeatmapServiceGrpc;
import com.proto.heatmap.heatmapRequest;
import com.proto.mongo.MongoRequest;
import com.proto.mongo.MongoResponse;
import com.proto.mongo.MongoServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.StreamObserver;


import java.util.concurrent.CountDownLatch;

public class ControllerServerImpl extends ControllerServiceGrpc.ControllerServiceImplBase {
    public final int MONGO_SERVICE_PORT;
    public final int HEATMAP_SERVICE_PORT;
    private AppfileConfig appfileConfig;

    public ControllerServerImpl() {
        appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);
        //assign port to service
        MONGO_SERVICE_PORT = appfileConfig.mongoServicePort;
        HEATMAP_SERVICE_PORT = appfileConfig.heatmapServicePort;
    }

    @Override
    public void getHeatmap(ControllerRequest request, StreamObserver<ControllerResponse> responseObserver) {
        //get request value
        String userId = request.getUserid();
        String deviceId = request.getDeviceId();
        int width = request.getWidth();
        int height = request.getHeight();

        //intial server client
        MongoServiceGrpc.MongoServiceBlockingStub mongoClient = MongoServiceGrpc.newBlockingStub(getChannel(MONGO_SERVICE_PORT));

        HeatmapServiceGrpc.HeatmapServiceBlockingStub heatmapClient = HeatmapServiceGrpc.newBlockingStub(getChannel(HEATMAP_SERVICE_PORT));


        //sent to mongoclient
        MongoRequest.Builder mongoRequestBuilder = MongoRequest.newBuilder();
        mongoRequestBuilder.setTimeRequest(request.getTimeRequest());
        mongoRequestBuilder.setDeviceId(deviceId);

        MongoResponse mongoResponse = mongoClient.getBoxes(mongoRequestBuilder.build());

        //sentToHeatmap
        heatmapRequest.Builder heatmapRequestBuilder = heatmapRequest.newBuilder();
        heatmapRequestBuilder.setHeight(height);
        heatmapRequestBuilder.setWidth(width);
        heatmapRequestBuilder.addAllBoxes(mongoResponse.getBoxList());


        //return reponse
        responseObserver.onNext(ControllerResponse.newBuilder().setHeatmap(heatmapClient.getHeatmap(heatmapRequestBuilder.build()).getHeatmap()).build());

        responseObserver.onCompleted();
    }

    private ManagedChannel getChannel(int port) {
        return ManagedChannelBuilder.forAddress(appfileConfig.host, port).usePlaintext().build();
    }
}
