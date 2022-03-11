package com.proto.oneserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: controller/Renderserver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class OneServiceGrpc {

  private OneServiceGrpc() {}

  public static final String SERVICE_NAME = "controller.OneService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.controller.ControllerRequest,
      com.proto.controller.ControllerResponse> getGetHeatmapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeatmap",
      requestType = com.proto.controller.ControllerRequest.class,
      responseType = com.proto.controller.ControllerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.controller.ControllerRequest,
      com.proto.controller.ControllerResponse> getGetHeatmapMethod() {
    io.grpc.MethodDescriptor<com.proto.controller.ControllerRequest, com.proto.controller.ControllerResponse> getGetHeatmapMethod;
    if ((getGetHeatmapMethod = OneServiceGrpc.getGetHeatmapMethod) == null) {
      synchronized (OneServiceGrpc.class) {
        if ((getGetHeatmapMethod = OneServiceGrpc.getGetHeatmapMethod) == null) {
          OneServiceGrpc.getGetHeatmapMethod = getGetHeatmapMethod =
              io.grpc.MethodDescriptor.<com.proto.controller.ControllerRequest, com.proto.controller.ControllerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHeatmap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.controller.ControllerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.controller.ControllerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHeatmapMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static OneServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OneServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OneServiceStub>() {
        @java.lang.Override
        public OneServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OneServiceStub(channel, callOptions);
        }
      };
    return OneServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static OneServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OneServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OneServiceBlockingStub>() {
        @java.lang.Override
        public OneServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OneServiceBlockingStub(channel, callOptions);
        }
      };
    return OneServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static OneServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<OneServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<OneServiceFutureStub>() {
        @java.lang.Override
        public OneServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new OneServiceFutureStub(channel, callOptions);
        }
      };
    return OneServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class OneServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHeatmap(com.proto.controller.ControllerRequest request,
        io.grpc.stub.StreamObserver<com.proto.controller.ControllerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHeatmapMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHeatmapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.controller.ControllerRequest,
                com.proto.controller.ControllerResponse>(
                  this, METHODID_GET_HEATMAP)))
          .build();
    }
  }

  /**
   */
  public static final class OneServiceStub extends io.grpc.stub.AbstractAsyncStub<OneServiceStub> {
    private OneServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OneServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OneServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHeatmap(com.proto.controller.ControllerRequest request,
        io.grpc.stub.StreamObserver<com.proto.controller.ControllerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHeatmapMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class OneServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<OneServiceBlockingStub> {
    private OneServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OneServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OneServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.controller.ControllerResponse getHeatmap(com.proto.controller.ControllerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHeatmapMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class OneServiceFutureStub extends io.grpc.stub.AbstractFutureStub<OneServiceFutureStub> {
    private OneServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected OneServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new OneServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.controller.ControllerResponse> getHeatmap(
        com.proto.controller.ControllerRequest request) {
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
    private final OneServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(OneServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEATMAP:
          serviceImpl.getHeatmap((com.proto.controller.ControllerRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.controller.ControllerResponse>) responseObserver);
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
      synchronized (OneServiceGrpc.class) {
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
