// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logAnalyseTermParameters.proto

package enn.monitor.log.config.analyse.term.parameters;

public interface EnnMonitorLogConfigAnalyseTermTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorLogConfigAnalyseTermTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional uint64 belongToServiceId = 2;</code>
   */
  long getBelongToServiceId();

  /**
   * <code>optional string analyseTermKey = 3;</code>
   */
  java.lang.String getAnalyseTermKey();
  /**
   * <code>optional string analyseTermKey = 3;</code>
   */
  com.google.protobuf.ByteString
      getAnalyseTermKeyBytes();

  /**
   * <code>optional string addTerm = 4;</code>
   */
  java.lang.String getAddTerm();
  /**
   * <code>optional string addTerm = 4;</code>
   */
  com.google.protobuf.ByteString
      getAddTermBytes();

  /**
   * <code>optional string filterTerm = 5;</code>
   */
  java.lang.String getFilterTerm();
  /**
   * <code>optional string filterTerm = 5;</code>
   */
  com.google.protobuf.ByteString
      getFilterTermBytes();

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
