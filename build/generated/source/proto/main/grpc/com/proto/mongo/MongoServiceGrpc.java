package com.proto.mongo;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: mongo/mongo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class MongoServiceGrpc {

  private MongoServiceGrpc() {}

  public static final String SERVICE_NAME = "mongo.MongoService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.mongo.MongoRequest,
      com.proto.mongo.MongoResponse> getGetBoxesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBoxes",
      requestType = com.proto.mongo.MongoRequest.class,
      responseType = com.proto.mongo.MongoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.proto.mongo.MongoRequest,
      com.proto.mongo.MongoResponse> getGetBoxesMethod() {
    io.grpc.MethodDescriptor<com.proto.mongo.MongoRequest, com.proto.mongo.MongoResponse> getGetBoxesMethod;
    if ((getGetBoxesMethod = MongoServiceGrpc.getGetBoxesMethod) == null) {
      synchronized (MongoServiceGrpc.class) {
        if ((getGetBoxesMethod = MongoServiceGrpc.getGetBoxesMethod) == null) {
          MongoServiceGrpc.getGetBoxesMethod = getGetBoxesMethod =
              io.grpc.MethodDescriptor.<com.proto.mongo.MongoRequest, com.proto.mongo.MongoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBoxes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.mongo.MongoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.mongo.MongoResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBoxesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static MongoServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MongoServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MongoServiceStub>() {
        @java.lang.Override
        public MongoServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MongoServiceStub(channel, callOptions);
        }
      };
    return MongoServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MongoServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MongoServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MongoServiceBlockingStub>() {
        @java.lang.Override
        public MongoServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MongoServiceBlockingStub(channel, callOptions);
        }
      };
    return MongoServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static MongoServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MongoServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<MongoServiceFutureStub>() {
        @java.lang.Override
        public MongoServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new MongoServiceFutureStub(channel, callOptions);
        }
      };
    return MongoServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class MongoServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBoxes(com.proto.mongo.MongoRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.MongoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoxesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBoxesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.proto.mongo.MongoRequest,
                com.proto.mongo.MongoResponse>(
                  this, METHODID_GET_BOXES)))
          .build();
    }
  }

  /**
   */
  public static final class MongoServiceStub extends io.grpc.stub.AbstractAsyncStub<MongoServiceStub> {
    private MongoServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MongoServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MongoServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBoxes(com.proto.mongo.MongoRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongo.MongoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetBoxesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class MongoServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<MongoServiceBlockingStub> {
    private MongoServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MongoServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MongoServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.proto.mongo.MongoResponse getBoxes(com.proto.mongo.MongoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetBoxesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class MongoServiceFutureStub extends io.grpc.stub.AbstractFutureStub<MongoServiceFutureStub> {
    private MongoServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MongoServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MongoServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.proto.mongo.MongoResponse> getBoxes(
        com.proto.mongo.MongoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetBoxesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_BOXES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MongoServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MongoServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOXES:
          serviceImpl.getBoxes((com.proto.mongo.MongoRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.mongo.MongoResponse>) responseObserver);
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
      synchronized (MongoServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .addMethod(getGetBoxesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
