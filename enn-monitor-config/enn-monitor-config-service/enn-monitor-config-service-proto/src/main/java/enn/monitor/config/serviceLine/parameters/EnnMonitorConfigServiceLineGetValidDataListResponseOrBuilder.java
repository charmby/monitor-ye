// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/serviceLineParameters.proto

package enn.monitor.config.serviceLine.parameters;

public interface EnnMonitorConfigServiceLineGetValidDataListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorConfigServiceLineGetValidDataListResponse)
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
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTableList = 3;</code>
   */
  java.util.List<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable> 
      getServiceLineTableListList();
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTableList = 3;</code>
   */
  enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable getServiceLineTableList(int index);
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTableList = 3;</code>
   */
  int getServiceLineTableListCount();
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTableList = 3;</code>
   */
  java.util.List<? extends enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder> 
      getServiceLineTableListOrBuilderList();
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTableList = 3;</code>
   */
  enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder getServiceLineTableListOrBuilder(
      int index);
}
