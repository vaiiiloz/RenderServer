// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: mongo/mongo.proto

package com.proto.mongo;

public interface MongoRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:mongo.MongoRequest)
    com.google.protobuf.MessageLiteOrBuilder {

  /**
   * <code>.common.TimeRequest timeRequest = 1;</code>
   * @return Whether the timeRequest field is set.
   */
  boolean hasTimeRequest();
  /**
   * <code>.common.TimeRequest timeRequest = 1;</code>
   * @return The timeRequest.
   */
  com.proto.common.TimeRequest getTimeRequest();

  /**
   * <code>string deviceId = 2;</code>
   * @return The deviceId.
   */
  java.lang.String getDeviceId();
  /**
   * <code>string deviceId = 2;</code>
   * @return The bytes for deviceId.
   */
  com.google.protobuf.ByteString
      getDeviceIdBytes();
}
