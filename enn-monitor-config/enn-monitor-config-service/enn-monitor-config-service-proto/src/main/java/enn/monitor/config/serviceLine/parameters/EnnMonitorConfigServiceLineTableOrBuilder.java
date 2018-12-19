// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/serviceLineParameters.proto

package enn.monitor.config.serviceLine.parameters;

public interface EnnMonitorConfigServiceLineTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorConfigServiceLineTable)
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
   * <code>optional .EnnMonitorConfigServiceLineStatus status = 3;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .EnnMonitorConfigServiceLineStatus status = 3;</code>
   */
  enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineStatus getStatus();

  /**
   * <code>optional string serviceLineName = 4;</code>
   */
  java.lang.String getServiceLineName();
  /**
   * <code>optional string serviceLineName = 4;</code>
   */
  com.google.protobuf.ByteString
      getServiceLineNameBytes();

  /**
   * <code>optional uint64 belongToCluster = 5;</code>
   */
  long getBelongToCluster();

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