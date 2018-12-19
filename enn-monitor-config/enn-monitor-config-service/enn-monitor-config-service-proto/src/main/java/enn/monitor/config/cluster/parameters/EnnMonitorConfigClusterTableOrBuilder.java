// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/clusterParameters.proto

package enn.monitor.config.cluster.parameters;

public interface EnnMonitorConfigClusterTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorConfigClusterTable)
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
   * <code>optional .EnnMonitorConfigClusterStatus status = 3;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .EnnMonitorConfigClusterStatus status = 3;</code>
   */
  enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus getStatus();

  /**
   * <code>optional string clusterName = 4;</code>
   */
  java.lang.String getClusterName();
  /**
   * <code>optional string clusterName = 4;</code>
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <code>optional uint64 createTime = 5;</code>
   */
  long getCreateTime();

  /**
   * <code>optional uint64 lastUpdateTime = 6;</code>
   */
  long getLastUpdateTime();

  /**
   * <code>optional string createUser = 7;</code>
   */
  java.lang.String getCreateUser();
  /**
   * <code>optional string createUser = 7;</code>
   */
  com.google.protobuf.ByteString
      getCreateUserBytes();

  /**
   * <code>optional string lastUpdateUser = 8;</code>
   */
  java.lang.String getLastUpdateUser();
  /**
   * <code>optional string lastUpdateUser = 8;</code>
   */
  com.google.protobuf.ByteString
      getLastUpdateUserBytes();
}