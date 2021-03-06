// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: heatmap/heatmap.proto

package com.proto.heatmap;

/**
 * Protobuf type {@code heatmap.heatmapResponse}
 */
public  final class heatmapResponse extends
    com.google.protobuf.GeneratedMessageLite<
        heatmapResponse, heatmapResponse.Builder> implements
    // @@protoc_insertion_point(message_implements:heatmap.heatmapResponse)
    heatmapResponseOrBuilder {
  private heatmapResponse() {
    heatmap_ = com.google.protobuf.ByteString.EMPTY;
  }
  public static final int HEATMAP_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString heatmap_;
  /**
   * <code>bytes heatmap = 1;</code>
   * @return The heatmap.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getHeatmap() {
    return heatmap_;
  }
  /**
   * <code>bytes heatmap = 1;</code>
   * @param value The heatmap to set.
   */
  private void setHeatmap(com.google.protobuf.ByteString value) {
    java.lang.Class<?> valueClass = value.getClass();
  
    heatmap_ = value;
  }
  /**
   * <code>bytes heatmap = 1;</code>
   */
  private void clearHeatmap() {
    
    heatmap_ = getDefaultInstance().getHeatmap();
  }

  public static com.proto.heatmap.heatmapResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, data, extensionRegistry);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.heatmap.heatmapResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input);
  }
  public static com.proto.heatmap.heatmapResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input);
  }
  public static com.proto.heatmap.heatmapResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageLite.parseFrom(
        DEFAULT_INSTANCE, input, extensionRegistry);
  }

  public static Builder newBuilder() {
    return (Builder) DEFAULT_INSTANCE.createBuilder();
  }
  public static Builder newBuilder(com.proto.heatmap.heatmapResponse prototype) {
    return (Builder) DEFAULT_INSTANCE.createBuilder(prototype);
  }

  /**
   * Protobuf type {@code heatmap.heatmapResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageLite.Builder<
        com.proto.heatmap.heatmapResponse, Builder> implements
      // @@protoc_insertion_point(builder_implements:heatmap.heatmapResponse)
      com.proto.heatmap.heatmapResponseOrBuilder {
    // Construct using com.proto.heatmap.heatmapResponse.newBuilder()
    private Builder() {
      super(DEFAULT_INSTANCE);
    }


    /**
     * <code>bytes heatmap = 1;</code>
     * @return The heatmap.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getHeatmap() {
      return instance.getHeatmap();
    }
    /**
     * <code>bytes heatmap = 1;</code>
     * @param value The heatmap to set.
     * @return This builder for chaining.
     */
    public Builder setHeatmap(com.google.protobuf.ByteString value) {
      copyOnWrite();
      instance.setHeatmap(value);
      return this;
    }
    /**
     * <code>bytes heatmap = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHeatmap() {
      copyOnWrite();
      instance.clearHeatmap();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:heatmap.heatmapResponse)
  }
  @java.lang.Override
  @java.lang.SuppressWarnings({"unchecked", "fallthrough"})
  protected final java.lang.Object dynamicMethod(
      com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
      java.lang.Object arg0, java.lang.Object arg1) {
    switch (method) {
      case NEW_MUTABLE_INSTANCE: {
        return new com.proto.heatmap.heatmapResponse();
      }
      case NEW_BUILDER: {
        return new Builder();
      }
      case BUILD_MESSAGE_INFO: {
          java.lang.Object[] objects = new java.lang.Object[] {
            "heatmap_",
          };
          java.lang.String info =
              "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\n";
          return newMessageInfo(DEFAULT_INSTANCE, info, objects);
      }
      // fall through
      case GET_DEFAULT_INSTANCE: {
        return DEFAULT_INSTANCE;
      }
      case GET_PARSER: {
        com.google.protobuf.Parser<com.proto.heatmap.heatmapResponse> parser = PARSER;
        if (parser == null) {
          synchronized (com.proto.heatmap.heatmapResponse.class) {
            parser = PARSER;
            if (parser == null) {
              parser =
                  new DefaultInstanceBasedParser<com.proto.heatmap.heatmapResponse>(
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


  // @@protoc_insertion_point(class_scope:heatmap.heatmapResponse)
  private static final com.proto.heatmap.heatmapResponse DEFAULT_INSTANCE;
  static {
    heatmapResponse defaultInstance = new heatmapResponse();
    // New instances are implicitly immutable so no need to make
    // immutable.
    DEFAULT_INSTANCE = defaultInstance;
    com.google.protobuf.GeneratedMessageLite.registerDefaultInstance(
      heatmapResponse.class, defaultInstance);
  }

  public static com.proto.heatmap.heatmapResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static volatile com.google.protobuf.Parser<heatmapResponse> PARSER;

  public static com.google.protobuf.Parser<heatmapResponse> parser() {
    return DEFAULT_INSTANCE.getParserForType();
  }
}

