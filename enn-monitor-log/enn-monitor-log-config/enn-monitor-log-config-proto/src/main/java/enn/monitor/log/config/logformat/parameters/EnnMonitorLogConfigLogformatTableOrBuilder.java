// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logformatParameters.proto

package enn.monitor.log.config.logformat.parameters;

public interface EnnMonitorLogConfigLogformatTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorLogConfigLogformatTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional uint64 seqNo = 2;</code>
   */
  long getSeqNo();

  /**
   * <code>optional string regex = 3;</code>
   */
  java.lang.String getRegex();
  /**
   * <code>optional string regex = 3;</code>
   */
  com.google.protobuf.ByteString
      getRegexBytes();

  /**
   * <code>optional string logformat = 4;</code>
   */
  java.lang.String getLogformat();
  /**
   * <code>optional string logformat = 4;</code>
   */
  com.google.protobuf.ByteString
      getLogformatBytes();

  /**
   * <code>optional uint64 belongToServiceId = 5;</code>
   */
  long getBelongToServiceId();

  /**
   * <code>optional uint64 createTime = 6;</code>
   */
  long getCreateTime();

  /**
   * <code>optional uint64 lastUpdateTime = 7;</code>
   */
  long getLastUpdateTime();

  /**
   * <code>optional string createUser = 8;</code>
   */
  java.lang.String getCreateUser();
  /**
   * <code>optional string createUser = 8;</code>
   */
  com.google.protobuf.ByteString
      getCreateUserBytes();

  /**
   * <code>optional string lastUpdateUser = 9;</code>
   */
  java.lang.String getLastUpdateUser();
  /**
   * <code>optional string lastUpdateUser = 9;</code>
   */
  com.google.protobuf.ByteString
      getLastUpdateUserBytes();
}
