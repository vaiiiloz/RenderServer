package com.proto.mongoSearch;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.41.0)",
    comments = "Source: mongo/mongo.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class mongoSearchServiceGrpc {

  private mongoSearchServiceGrpc() {}

  public static final String SERVICE_NAME = "mongo.mongoSearchService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.proto.mongoSearch.mongoSearchRequest,
      com.proto.mongoSearch.mongoSearchResponse> getGetBoxesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getBoxes",
      requestType = com.proto.mongoSearch.mongoSearchRequest.class,
      responseType = com.proto.mongoSearch.mongoSearchResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.proto.mongoSearch.mongoSearchRequest,
      com.proto.mongoSearch.mongoSearchResponse> getGetBoxesMethod() {
    io.grpc.MethodDescriptor<com.proto.mongoSearch.mongoSearchRequest, com.proto.mongoSearch.mongoSearchResponse> getGetBoxesMethod;
    if ((getGetBoxesMethod = mongoSearchServiceGrpc.getGetBoxesMethod) == null) {
      synchronized (mongoSearchServiceGrpc.class) {
        if ((getGetBoxesMethod = mongoSearchServiceGrpc.getGetBoxesMethod) == null) {
          mongoSearchServiceGrpc.getGetBoxesMethod = getGetBoxesMethod =
              io.grpc.MethodDescriptor.<com.proto.mongoSearch.mongoSearchRequest, com.proto.mongoSearch.mongoSearchResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getBoxes"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.mongoSearch.mongoSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.lite.ProtoLiteUtils.marshaller(
                  com.proto.mongoSearch.mongoSearchResponse.getDefaultInstance()))
              .build();
        }
      }
    }
    return getGetBoxesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static mongoSearchServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<mongoSearchServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<mongoSearchServiceStub>() {
        @java.lang.Override
        public mongoSearchServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new mongoSearchServiceStub(channel, callOptions);
        }
      };
    return mongoSearchServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static mongoSearchServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<mongoSearchServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<mongoSearchServiceBlockingStub>() {
        @java.lang.Override
        public mongoSearchServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new mongoSearchServiceBlockingStub(channel, callOptions);
        }
      };
    return mongoSearchServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static mongoSearchServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<mongoSearchServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<mongoSearchServiceFutureStub>() {
        @java.lang.Override
        public mongoSearchServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new mongoSearchServiceFutureStub(channel, callOptions);
        }
      };
    return mongoSearchServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class mongoSearchServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getBoxes(com.proto.mongoSearch.mongoSearchRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongoSearch.mongoSearchResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetBoxesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetBoxesMethod(),
            io.grpc.stub.ServerCalls.asyncServerStreamingCall(
              new MethodHandlers<
                com.proto.mongoSearch.mongoSearchRequest,
                com.proto.mongoSearch.mongoSearchResponse>(
                  this, METHODID_GET_BOXES)))
          .build();
    }
  }

  /**
   */
  public static final class mongoSearchServiceStub extends io.grpc.stub.AbstractAsyncStub<mongoSearchServiceStub> {
    private mongoSearchServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected mongoSearchServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new mongoSearchServiceStub(channel, callOptions);
    }

    /**
     */
    public void getBoxes(com.proto.mongoSearch.mongoSearchRequest request,
        io.grpc.stub.StreamObserver<com.proto.mongoSearch.mongoSearchResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetBoxesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class mongoSearchServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<mongoSearchServiceBlockingStub> {
    private mongoSearchServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected mongoSearchServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new mongoSearchServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<com.proto.mongoSearch.mongoSearchResponse> getBoxes(
        com.proto.mongoSearch.mongoSearchRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetBoxesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class mongoSearchServiceFutureStub extends io.grpc.stub.AbstractFutureStub<mongoSearchServiceFutureStub> {
    private mongoSearchServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected mongoSearchServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new mongoSearchServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_BOXES = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final mongoSearchServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(mongoSearchServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_BOXES:
          serviceImpl.getBoxes((com.proto.mongoSearch.mongoSearchRequest) request,
              (io.grpc.stub.StreamObserver<com.proto.mongoSearch.mongoSearchResponse>) responseObserver);
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
      synchronized (mongoSearchServiceGrpc.class) {
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
