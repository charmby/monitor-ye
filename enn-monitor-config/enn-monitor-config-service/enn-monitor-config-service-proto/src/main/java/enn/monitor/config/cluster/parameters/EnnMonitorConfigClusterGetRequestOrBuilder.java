// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/clusterParameters.proto

package enn.monitor.config.cluster.parameters;

public interface EnnMonitorConfigClusterGetRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorConfigClusterGetRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 id = 1;</code>
   */
  long getId();

  /**
   * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
   */
  int getStatusValue();
  /**
   * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
   */
  enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus getStatus();

  /**
   * <code>optional string clusterName = 3;</code>
   */
  java.lang.String getClusterName();
  /**
   * <code>optional string clusterName = 3;</code>
   */
  com.google.protobuf.ByteString
      getClusterNameBytes();

  /**
   * <code>optional string createUser = 4;</code>
   */
  java.lang.String getCreateUser();
  /**
   * <code>optional string createUser = 4;</code>
   */
  com.google.protobuf.ByteString
      getCreateUserBytes();

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
