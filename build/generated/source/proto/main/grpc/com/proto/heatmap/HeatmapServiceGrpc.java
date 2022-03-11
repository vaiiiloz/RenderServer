package com.proto.heatmap;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: heatmap/heatmap.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HeatmapServiceGrpc {

  private HeatmapServiceGrpc() {}

  public static final String SERVICE_NAME = "heatmap.HeatmapService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.heatmap.heatmapRequest,
      com.proto.heatmap.heatmapResponse> getGetHeatmapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeatmap",
      requestType = com.proto.heatmap.heatmapRequest.class,
      responseType = com.proto.heatmap.heatmapResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.heatmap.heatmapRequest,
      com.proto.heatmap.heatmapResponse> getGetHeatmapMethod() {
    io.grpc.MethodDescriptor<com.proto.heatmap.heatmapRequest, com.proto.heatmap.heatmapResponse> getGetHeatmapMethod;
    if ((getGetHeatmapMethod = HeatmapServiceGrpc.getGetHeatmapMethod) == null) {
      synchronized (HeatmapServiceGrpc.class) {
        if ((getGetHeatmapMethod = HeatmapServiceGrpc.getGetHeatmapMethod) == null) {
          HeatmapServiceGrpc.getGetHeatmapMethod = getGetHeatmapMethod =
              io.grpc.MethodDescriptor.<com.proto.heatmap.heatmapRequest, com.proto.heatmap.heatmapResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHeatmap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.heatmap.heatmapRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.heatmap.heatmapResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHeatmapMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HeatmapServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeatmapServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeatmapServiceStub>() {
        @java.lang.Override
        public HeatmapServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeatmapServiceStub(channel, callOptions);
        }
      };
    return HeatmapServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HeatmapServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeatmapServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeatmapServiceBlockingStub>() {
        @java.lang.Override
        public HeatmapServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeatmapServiceBlockingStub(channel, callOptions);
        }
      };
    return HeatmapServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HeatmapServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HeatmapServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HeatmapServiceFutureStub>() {
        @java.lang.Override
        public HeatmapServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HeatmapServiceFutureStub(channel, callOptions);
        }
      };
    return HeatmapServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HeatmapServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHeatmap(com.proto.heatmap.heatmapRequest request,
        io.grpc.stub.StreamObserver<com.proto.heatmap.heatmapResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHeatmapMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHeatmapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.heatmap.heatmapRequest,
                com.proto.heatmap.heatmapResponse>(
                  this, METHODID_GET_HEATMAP)))
          .build();
    }
  }

  /**
   */
  public static final class HeatmapServiceStub extends io.grpc.stub.AbstractAsyncStub<HeatmapServiceStub> {
    private HeatmapServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatmapServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeatmapServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHeatmap(com.proto.heatmap.heatmapRequest request,
        io.grpc.stub.StreamObserver<com.proto.heatmap.heatmapResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHeatmapMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HeatmapServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HeatmapServiceBlockingStub> {
    private HeatmapServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatmapServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeatmapServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.heatmap.heatmapResponse getHeatmap(com.proto.heatmap.heatmapRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHeatmapMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HeatmapServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HeatmapServiceFutureStub> {
    private HeatmapServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HeatmapServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HeatmapServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.heatmap.heatmapResponse> getHeatmap(
        com.proto.heatmap.heatmapRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHeatmapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HEATMAP = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HeatmapServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HeatmapServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEATMAP:
          serviceImpl.getHeatmap((com.proto.heatmap.heatmapRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.heatmap.heatmapResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (HeatmapServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetHeatmapMethod())
              .build();
        }
      }
    }
    return result;
  }
}
