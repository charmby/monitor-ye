// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/clusterParameters.proto

package enn.monitor.config.cluster.parameters;

public interface EnnMonitorConfigClusterGetValidDataListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorConfigClusterGetValidDataListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool isSuccess = 1;</code>
   */
  boolean getIsSuccess();

  /**
   * <code>optional string error = 2;</code>
   */
  java.lang.String getError();
  /**
   * <code>optional string error = 2;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();

  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  java.util.List<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable> 
      getClusterTableListList();
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable getClusterTableList(int index);
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  int getClusterTableListCount();
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  java.util.List<? extends enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder> 
      getClusterTableListOrBuilderList();
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder getClusterTableListOrBuilder(
      int index);
}
