// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/serviceLineParameters.proto

package enn.monitor.config.serviceLine.parameters;

public interface EnnMonitorConfigServiceLineGetResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorConfigServiceLineGetResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional bool isSuccess = 1;</code>
   */
  boolean getIsSuccess();

  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  java.util.List<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable> 
      getServiceLineTableList();
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable getServiceLineTable(int index);
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  int getServiceLineTableCount();
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  java.util.List<? extends enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder> 
      getServiceLineTableOrBuilderList();
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder getServiceLineTableOrBuilder(
      int index);

  /**
   * <code>optional string error = 3;</code>
   */
  java.lang.String getError();
  /**
   * <code>optional string error = 3;</code>
   */
  com.google.protobuf.ByteString
      getErrorBytes();
}
