// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logformatParameters.proto

package enn.monitor.log.config.logformat.parameters;

public interface EnnMonitorLogConfigLogformatUpdateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorLogConfigLogformatUpdateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional string regex = 2;</code>
   */
  java.lang.String getRegex();
  /**
   * <code>optional string regex = 2;</code>
   */
  com.google.protobuf.ByteString
      getRegexBytes();

  /**
   * <code>optional string logformat = 3;</code>
   */
  java.lang.String getLogformat();
  /**
   * <code>optional string logformat = 3;</code>
   */
  com.google.protobuf.ByteString
      getLogformatBytes();

  /**
   * <code>optional uint64 belongToServiceId = 4;</code>
   */
  long getBelongToServiceId();

  /**
   * <code>optional string lastUpdateUser = 5;</code>
   */
  java.lang.String getLastUpdateUser();
  /**
   * <code>optional string lastUpdateUser = 5;</code>
   */
  com.google.protobuf.ByteString
      getLastUpdateUserBytes();
}
