package com.proto.render_server;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: controller/Renderserver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RenderServiceGrpc {

  private RenderServiceGrpc() {}

  public static final String SERVICE_NAME = "controller.RenderService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest,
      com.proto.render_server.ServerResponse> getGetHeatmapMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeatmap",
      requestType = com.proto.render_server.ServerRequest.class,
      responseType = com.proto.render_server.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest,
      com.proto.render_server.ServerResponse> getGetHeatmapMethod() {
    io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest, com.proto.render_server.ServerResponse> getGetHeatmapMethod;
    if ((getGetHeatmapMethod = RenderServiceGrpc.getGetHeatmapMethod) == null) {
      synchronized (RenderServiceGrpc.class) {
        if ((getGetHeatmapMethod = RenderServiceGrpc.getGetHeatmapMethod) == null) {
          RenderServiceGrpc.getGetHeatmapMethod = getGetHeatmapMethod =
              io.grpc.MethodDescriptor.<com.proto.render_server.ServerRequest, com.proto.render_server.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHeatmap"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.render_server.ServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.render_server.ServerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHeatmapMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest,
      com.proto.render_server.ServerResponse> getGetHeatmapStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getHeatmapStream",
      requestType = com.proto.render_server.ServerRequest.class,
      responseType = com.proto.render_server.ServerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest,
      com.proto.render_server.ServerResponse> getGetHeatmapStreamMethod() {
    io.grpc.MethodDescriptor<com.proto.render_server.ServerRequest, com.proto.render_server.ServerResponse> getGetHeatmapStreamMethod;
    if ((getGetHeatmapStreamMethod = RenderServiceGrpc.getGetHeatmapStreamMethod) == null) {
      synchronized (RenderServiceGrpc.class) {
        if ((getGetHeatmapStreamMethod = RenderServiceGrpc.getGetHeatmapStreamMethod) == null) {
          RenderServiceGrpc.getGetHeatmapStreamMethod = getGetHeatmapStreamMethod =
              io.grpc.MethodDescriptor.<com.proto.render_server.ServerRequest, com.proto.render_server.ServerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getHeatmapStream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.render_server.ServerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.render_server.ServerResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetHeatmapStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RenderServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RenderServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RenderServiceStub>() {
        @java.lang.Override
        public RenderServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RenderServiceStub(channel, callOptions);
        }
      };
    return RenderServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RenderServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RenderServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RenderServiceBlockingStub>() {
        @java.lang.Override
        public RenderServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RenderServiceBlockingStub(channel, callOptions);
        }
      };
    return RenderServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RenderServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RenderServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RenderServiceFutureStub>() {
        @java.lang.Override
        public RenderServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RenderServiceFutureStub(channel, callOptions);
        }
      };
    return RenderServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RenderServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getHeatmap(com.proto.render_server.ServerRequest request,
        io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetHeatmapMethod(), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.render_server.ServerRequest> getHeatmapStream(
        io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getGetHeatmapStreamMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetHeatmapMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.render_server.ServerRequest,
                com.proto.render_server.ServerResponse>(
                  this, METHODID_GET_HEATMAP)))
          .addMethod(
            getGetHeatmapStreamMethod(),
            io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
              new MethodHandlers<
                com.proto.render_server.ServerRequest,
                com.proto.render_server.ServerResponse>(
                  this, METHODID_GET_HEATMAP_STREAM)))
          .build();
    }
  }

  /**
   */
  public static final class RenderServiceStub extends io.grpc.stub.AbstractAsyncStub<RenderServiceStub> {
    private RenderServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RenderServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RenderServiceStub(channel, callOptions);
    }

    /**
     */
    public void getHeatmap(com.proto.render_server.ServerRequest request,
        io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetHeatmapMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.proto.render_server.ServerRequest> getHeatmapStream(
        io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getGetHeatmapStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   */
  public static final class RenderServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<RenderServiceBlockingStub> {
    private RenderServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RenderServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RenderServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.render_server.ServerResponse getHeatmap(com.proto.render_server.ServerRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetHeatmapMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RenderServiceFutureStub extends io.grpc.stub.AbstractFutureStub<RenderServiceFutureStub> {
    private RenderServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RenderServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RenderServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.render_server.ServerResponse> getHeatmap(
        com.proto.render_server.ServerRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetHeatmapMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_HEATMAP = 0;
  private static final int METHODID_GET_HEATMAP_STREAM = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RenderServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RenderServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_HEATMAP:
          serviceImpl.getHeatmap((com.proto.render_server.ServerRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse>) responseObserver);
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
        case METHODID_GET_HEATMAP_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.getHeatmapStream(
              (io.grpc.stub.StreamObserver<com.proto.render_server.ServerResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RenderServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetHeatmapMethod())
              .addMethod(getGetHeatmapStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
