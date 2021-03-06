// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mongo/mongo.proto

package com.proto.mongo;

/**
 * Protobuf type {@code mongo.MongoResponse}
 */
public  final class MongoResponse extends
    com.google.protobuf.GeneratedMessageLite<
        MongoResponse, MongoResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:mongo.MongoResponse)
    MongoResponseOrBuilder {
  private MongoResponse() {
    box_ = emptyProtobufList();
  }
  public static final int BOX_FIELD_NUMBER = 1;
  private com.google.protobuf.Internal.ProtobufList<com.proto.common.Box> box_;
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.proto.common.Box> getBoxList() {
    return box_;
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  public java.util.List<? extends com.proto.common.BoxOrBuilder> 
      getBoxOrBuilderList() {
    return box_;
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  @java.lang.Override
  public int getBoxCount() {
    return box_.size();
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  @java.lang.Override
  public com.proto.common.Box getBox(int index) {
    return box_.get(index);
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  public com.proto.common.BoxOrBuilder getBoxOrBuilder(
      int index) {
    return box_.get(index);
  }
  private void ensureBoxIsMutable() {
    com.google.protobuf.Internal.ProtobufList<com.proto.common.Box> tmp = box_;
    if (!tmp.isModifiable()) {
      box_ =
          com.google.protobuf.GeneratedMessageLite.mutableCopy(tmp);
     }
  }

  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  private void setBox(
      int index, com.proto.common.Box value) {
    value.getClass();
  ensureBoxIsMutable();
    box_.set(index, value);
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  private void addBox(com.proto.common.Box value) {
    value.getClass();
  ensureBoxIsMutable();
    box_.add(value);
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  private void addBox(
      int index, com.proto.common.Box value) {
    value.getClass();
  ensureBoxIsMutable();
    box_.add(index, value);
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  private void addAllBox(
      java.lang.Iterable<? extends com.proto.common.Box> values) {
    ensureBoxIsMutable();
    com.google.protobuf.AbstractMessageLite.addAll(
        values, box_);
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  private void clearBox() {
    box_ = emptyProtobufList();
  }
  /**
   * <code>repeated .common.Box box = 1;</code>
   */
  private void removeBox(int index) {
    ensureBoxIsMutable();
    box_.remove(index);
  }

  public static com.proto.mongo.MongoResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.mongo.MongoResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.mongo.MongoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.mongo.MongoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.mongo.MongoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.mongo.MongoResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.mongo.MongoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.mongo.MongoResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.mongo.MongoResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.mongo.MongoResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.mongo.MongoResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.mongo.MongoResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.mongo.MongoResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code mongo.MongoResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.mongo.MongoResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:mongo.MongoResponse)
      com.proto.mongo.MongoResponseOrBuilder {
    // Construct using com.proto.mongo.MongoResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    @java.lang.Override
    public java.util.List<com.proto.common.Box> getBoxList() {
      return java.util.Collections.unmodifiableList(
          instance.getBoxList());
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    @java.lang.Override
    public int getBoxCount() {
      return instance.getBoxCount();
    }/**
     * <code>repeated .common.Box box = 1;</code>
     */
    @java.lang.Override
    public com.proto.common.Box getBox(int index) {
      return instance.getBox(index);
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder setBox(
        int index, com.proto.common.Box value) {
      copyOnWrite();
      instance.setBox(index, value);
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder setBox(
        int index, com.proto.common.Box.Builder builderForValue) {
      copyOnWrite();
      instance.setBox(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder addBox(com.proto.common.Box value) {
      copyOnWrite();
      instance.addBox(value);
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder addBox(
        int index, com.proto.common.Box value) {
      copyOnWrite();
      instance.addBox(index, value);
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder addBox(
        com.proto.common.Box.Builder builderForValue) {
      copyOnWrite();
      instance.addBox(builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder addBox(
        int index, com.proto.common.Box.Builder builderForValue) {
      copyOnWrite();
      instance.addBox(index,
          builderForValue.build());
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder addAllBox(
        java.lang.Iterable<? extends com.proto.common.Box> values) {
      copyOnWrite();
      instance.addAllBox(values);
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder clearBox() {
      copyOnWrite();
      instance.clearBox();
      return this;
    }
    /**
     * <code>repeated .common.Box box = 1;</code>
     */
    public Builder removeBox(int index) {
      copyOnWrite();
      instance.removeBox(index);
      return this;
    }

    // @@protoc_insertion_point(builder_scope:mongo.MongoResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.mongo.MongoResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "box_",
            com.proto.common.Box.class,
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.mongo.MongoResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.mongo.MongoResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.mongo.MongoResponse>(
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


  // @@protoc_insertion_point(class_scope:mongo.MongoResponse)
  private static final com.proto.mongo.MongoResponse DEFAULT_INSTANCE;
  static {
    MongoResponse defaultInstance = new MongoResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      MongoResponse.class, defaultInstance);
  }

  public static com.proto.mongo.MongoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<MongoResponse> PARSER;

  public static com.google.protobuf.Parser<MongoResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

