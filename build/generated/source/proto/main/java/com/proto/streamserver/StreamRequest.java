// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: controller/streamserver.proto

package com.proto.streamserver;

/**
 * Protobuf type {@code controller.StreamRequest}
 */
public  final class StreamRequest extends
    com.google.protobuf.GeneratedMessageLite<
        StreamRequest, StreamRequest.Builder> implements
    // @@protoc_insertion_point(message_implements:controller.StreamRequest)
    StreamRequestOrBuilder {
  private StreamRequest() {
    userid_ = "";
    deviceId_ = "";
  }
  public static final int USERID_FIELD_NUMBER = 1;
  private java.lang.String userid_;
  /**
   * <code>string userid = 1;</code>
   * @return The userid.
   */
  @java.lang.Override
  public java.lang.String getUserid() {
    return userid_;
  }
  /**
   * <code>string userid = 1;</code>
   * @return The bytes for userid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUseridBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(userid_);
  }
  /**
   * <code>string userid = 1;</code>
   * @param value The userid to set.
   */
  private void setUserid(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    userid_ = value;
  }
  /**
   * <code>string userid = 1;</code>
   */
  private void clearUserid() {
    
    userid_ = getDefaultInstance().getUserid();
  }
  /**
   * <code>string userid = 1;</code>
   * @param value The bytes for userid to set.
   */
  private void setUseridBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    userid_ = value.toStringUtf8();
    
  }

  public static final int TIMEREQUEST_FIELD_NUMBER = 2;
  private com.proto.common.TimeRequest timeRequest_;
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  @java.lang.Override
  public boolean hasTimeRequest() {
    return timeRequest_ != null;
  }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  @java.lang.Override
  public com.proto.common.TimeRequest getTimeRequest() {
    return timeRequest_ == null ? com.proto.common.TimeRequest.getDefaultInstance() : timeRequest_;
  }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  private void setTimeRequest(com.proto.common.TimeRequest value) {
    value.getClass();
  timeRequest_ = value;
    
    }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  @java.lang.SuppressWarnings({"ReferenceEquality"})
  private void mergeTimeRequest(com.proto.common.TimeRequest value) {
    value.getClass();
  if (timeRequest_ != null &&
        timeRequest_ != com.proto.common.TimeRequest.getDefaultInstance()) {
      timeRequest_ =
        com.proto.common.TimeRequest.newBuilder(timeRequest_).mergeFrom(value).buildPartial();
    } else {
      timeRequest_ = value;
    }
    
  }
  /**
   * <code>.common.TimeRequest timeRequest = 2;</code>
   */
  private void clearTimeRequest() {  timeRequest_ = null;
    
  }

  public static final int DEVICEID_FIELD_NUMBER = 3;
  private java.lang.String deviceId_;
  /**
   * <code>string deviceId = 3;</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public java.lang.String getDeviceId() {
    return deviceId_;
  }
  /**
   * <code>string deviceId = 3;</code>
   * @return The bytes for deviceId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceIdBytes() {
    return com.google.protobuf.ByteString.copyFromUtf8(deviceId_);
  }
  /**
   * <code>string deviceId = 3;</code>
   * @param value The deviceId to set.
   */
  private void setDeviceId(
      java.lang.String value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    deviceId_ = value;
  }
  /**
   * <code>string deviceId = 3;</code>
   */
  private void clearDeviceId() {
    
    deviceId_ = getDefaultInstance().getDeviceId();
  }
  /**
   * <code>string deviceId = 3;</code>
   * @param value The bytes for deviceId to set.
   */
  private void setDeviceIdBytes(
      com.google.protobuf.ByteString value) {
    checkByteStringIsUtf8(value);
    deviceId_ = value.toStringUtf8();
    
  }

  public static final int WIDTH_FIELD_NUMBER = 4;
  private int width_;
  /**
   * <code>int32 width = 4;</code>
   * @return The width.
   */
  @java.lang.Override
  public int getWidth() {
    return width_;
  }
  /**
   * <code>int32 width = 4;</code>
   * @param value The width to set.
   */
  private void setWidth(int value) {
    
    width_ = value;
  }
  /**
   * <code>int32 width = 4;</code>
   */
  private void clearWidth() {
    
    width_ = 0;
  }

  public static final int HEIGHT_FIELD_NUMBER = 5;
  private int height_;
  /**
   * <code>int32 height = 5;</code>
   * @return The height.
   */
  @java.lang.Override
  public int getHeight() {
    return height_;
  }
  /**
   * <code>int32 height = 5;</code>
   * @param value The height to set.
   */
  private void setHeight(int value) {
    
    height_ = value;
  }
  /**
   * <code>int32 height = 5;</code>
   */
  private void clearHeight() {
    
    height_ = 0;
  }

  public static com.proto.streamserver.StreamRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.streamserver.StreamRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.streamserver.StreamRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.streamserver.StreamRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.streamserver.StreamRequest prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code controller.StreamRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.streamserver.StreamRequest, Builder> implements
      // @@protoc_insertion_point(builder_implements:controller.StreamRequest)
      com.proto.streamserver.StreamRequestOrBuilder {
    // Construct using com.proto.streamserver.StreamRequest.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>string userid = 1;</code>
     * @return The userid.
     */
    @java.lang.Override
    public java.lang.String getUserid() {
      return instance.getUserid();
    }
    /**
     * <code>string userid = 1;</code>
     * @return The bytes for userid.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getUseridBytes() {
      return instance.getUseridBytes();
    }
    /**
     * <code>string userid = 1;</code>
     * @param value The userid to set.
     * @return This builder for chaining.
     */
    public Builder setUserid(
        java.lang.String value) {
      copyOnWrite();
      instance.setUserid(value);
      return this;
    }
    /**
     * <code>string userid = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUserid() {
      copyOnWrite();
      instance.clearUserid();
      return this;
    }
    /**
     * <code>string userid = 1;</code>
     * @param value The bytes for userid to set.
     * @return This builder for chaining.
     */
    public Builder setUseridBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setUseridBytes(value);
      return this;
    }

    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    @java.lang.Override
    public boolean hasTimeRequest() {
      return instance.hasTimeRequest();
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    @java.lang.Override
    public com.proto.common.TimeRequest getTimeRequest() {
      return instance.getTimeRequest();
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder setTimeRequest(com.proto.common.TimeRequest value) {
      copyOnWrite();
      instance.setTimeRequest(value);
      return this;
      }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder setTimeRequest(
        com.proto.common.TimeRequest.Builder builderForValue) {
      copyOnWrite();
      instance.setTimeRequest(builderForValue.build());
      return this;
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder mergeTimeRequest(com.proto.common.TimeRequest value) {
      copyOnWrite();
      instance.mergeTimeRequest(value);
      return this;
    }
    /**
     * <code>.common.TimeRequest timeRequest = 2;</code>
     */
    public Builder clearTimeRequest() {  copyOnWrite();
      instance.clearTimeRequest();
      return this;
    }

    /**
     * <code>string deviceId = 3;</code>
     * @return The deviceId.
     */
    @java.lang.Override
    public java.lang.String getDeviceId() {
      return instance.getDeviceId();
    }
    /**
     * <code>string deviceId = 3;</code>
     * @return The bytes for deviceId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      return instance.getDeviceIdBytes();
    }
    /**
     * <code>string deviceId = 3;</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(
        java.lang.String value) {
      copyOnWrite();
      instance.setDeviceId(value);
      return this;
    }
    /**
     * <code>string deviceId = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      copyOnWrite();
      instance.clearDeviceId();
      return this;
    }
    /**
     * <code>string deviceId = 3;</code>
     * @param value The bytes for deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceIdBytes(
        com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setDeviceIdBytes(value);
      return this;
    }

    /**
     * <code>int32 width = 4;</code>
     * @return The width.
     */
    @java.lang.Override
    public int getWidth() {
      return instance.getWidth();
    }
    /**
     * <code>int32 width = 4;</code>
     * @param value The width to set.
     * @return This builder for chaining.
     */
    public Builder setWidth(int value) {
      copyOnWrite();
      instance.setWidth(value);
      return this;
    }
    /**
     * <code>int32 width = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearWidth() {
      copyOnWrite();
      instance.clearWidth();
      return this;
    }

    /**
     * <code>int32 height = 5;</code>
     * @return The height.
     */
    @java.lang.Override
    public int getHeight() {
      return instance.getHeight();
    }
    /**
     * <code>int32 height = 5;</code>
     * @param value The height to set.
     * @return This builder for chaining.
     */
    public Builder setHeight(int value) {
      copyOnWrite();
      instance.setHeight(value);
      return this;
    }
    /**
     * <code>int32 height = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeight() {
      copyOnWrite();
      instance.clearHeight();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:controller.StreamRequest)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.streamserver.StreamRequest();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "userid_",
            "timeRequest_",
            "deviceId_",
            "width_",
            "height_",
          };
          java.lang.String info =
              "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0208\u0002\t" +
              "\u0003\u0208\u0004\u0004\u0005\u0004";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.streamserver.StreamRequest> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.streamserver.StreamRequest.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.streamserver.StreamRequest>(
                      DEFAULT_INSTANCE);
              PARSER = parser;
            }
          }
        }
        return parser;
    }
    case GET_MEMOIZED_IS_INITIALIZED: {
      return (byte) 1;
    }
    case SET_MEMOIZED_IS_INITIALIZED: {
      return null;
    }
    }
    throw new UnsupportedOperationException();
  }


  // @@protoc_insertion_point(class_scope:controller.StreamRequest)
  private static final com.proto.streamserver.StreamRequest DEFAULT_INSTANCE;
  static {
    StreamRequest defaultInstance = new StreamRequest();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      StreamRequest.class, defaultInstance);
  }

  public static com.proto.streamserver.StreamRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<StreamRequest> PARSER;

  public static com.google.protobuf.Parser<StreamRequest> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

