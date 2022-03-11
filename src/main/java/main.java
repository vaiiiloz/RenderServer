import Config.AppfileConfig;
import Config.SpringContext;
import Controller.ControllerServerImpl;
import Controller.RenderServerImpl;
import heatmap.heatmapServiceImpl;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import mongo.mongoServiceImpl;
import org.springframework.boot.SpringApplication;

import java.io.IOException;

public class main {
    public static void main(final String[] args) throws IOException, InterruptedException {

        //run spring
        SpringContext springContext = new SpringContext();
        springContext.setApplicationContext(SpringApplication.run(AppfileConfig.class, args));
        AppfileConfig appfileConfig = SpringContext.context.getBean("appfileConfig", AppfileConfig.class);

//        startMultipleServer(appfileConfig);
        startOneServer(appfileConfig);

    }

    public static void startOneServer(AppfileConfig appfileConfig) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(appfileConfig.controllerServicePort).addService(new RenderServerImpl()).build();
        server.start();

        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            server.shutdown();
            System.out.println("Successfully stopped the server");
        }));
        server.awaitTermination();
    }

    public static void startMultipleServer(AppfileConfig appfileConfig) throws IOException, InterruptedException {
        Server serverController = ServerBuilder.forPort(appfileConfig.controllerServicePort).addService(new ControllerServerImpl()).build();
        serverController.start();


        Server serverMongo = ServerBuilder.forPort(appfileConfig.mongoServicePort).addService(new mongoServiceImpl()).build();
        serverMongo.start();


        Server serverHeatmap = ServerBuilder.forPort(appfileConfig.heatmapServicePort).addService(new heatmapServiceImpl()).build();
        serverHeatmap.start();


        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            serverController.shutdown();
            System.out.println("Successfully stopped the server");
        }));


        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            serverMongo.shutdown();
            System.out.println("Successfully stopped the server");
        }));


        Runtime.getRuntime().addShutdownHook(new Thread(() ->{
            serverHeatmap.shutdown();
            System.out.println("Successfully stopped the server");
        }));
        serverController.awaitTermination();
        serverMongo.awaitTermination();
        serverHeatmap.awaitTermination();
    }
}
