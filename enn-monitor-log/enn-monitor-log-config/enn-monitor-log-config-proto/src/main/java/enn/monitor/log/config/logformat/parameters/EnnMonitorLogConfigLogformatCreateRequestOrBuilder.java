// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logformatParameters.proto

package enn.monitor.log.config.logformat.parameters;

public interface EnnMonitorLogConfigLogformatCreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorLogConfigLogformatCreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string regex = 1;</code>
   */
  java.lang.String getRegex();
  /**
   * <code>optional string regex = 1;</code>
   */
  com.google.protobuf.ByteString
      getRegexBytes();

  /**
   * <code>optional string logformat = 2;</code>
   */
  java.lang.String getLogformat();
  /**
   * <code>optional string logformat = 2;</code>
   */
  com.google.protobuf.ByteString
      getLogformatBytes();

  /**
   * <code>optional uint64 belongToServiceId = 3;</code>
   */
  long getBelongToServiceId();

  /**
   * <code>optional string createUser = 4;</code>
   */
  java.lang.String getCreateUser();
  /**
   * <code>optional string createUser = 4;</code>
   */
  com.google.protobuf.ByteString
      getCreateUserBytes();
}
