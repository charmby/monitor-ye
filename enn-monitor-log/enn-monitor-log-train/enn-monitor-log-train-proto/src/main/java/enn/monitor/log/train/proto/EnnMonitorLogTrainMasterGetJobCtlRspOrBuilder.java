// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/trainParameters.proto

package enn.monitor.log.train.proto;

public interface EnnMonitorLogTrainMasterGetJobCtlRspOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorLogTrainMasterGetJobCtlRsp)
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
   * <code>repeated .EnnMonitorLogTrainJobCtl jobCtl = 3;</code>
   */
  java.util.List<enn.monitor.log.train.proto.EnnMonitorLogTrainJobCtl> 
      getJobCtlList();
  /**
   * <code>repeated .EnnMonitorLogTrainJobCtl jobCtl = 3;</code>
   */
  enn.monitor.log.train.proto.EnnMonitorLogTrainJobCtl getJobCtl(int index);
  /**
   * <code>repeated .EnnMonitorLogTrainJobCtl jobCtl = 3;</code>
   */
  int getJobCtlCount();
  /**
   * <code>repeated .EnnMonitorLogTrainJobCtl jobCtl = 3;</code>
   */
  java.util.List<? extends enn.monitor.log.train.proto.EnnMonitorLogTrainJobCtlOrBuilder> 
      getJobCtlOrBuilderList();
  /**
   * <code>repeated .EnnMonitorLogTrainJobCtl jobCtl = 3;</code>
   */
  enn.monitor.log.train.proto.EnnMonitorLogTrainJobCtlOrBuilder getJobCtlOrBuilder(
      int index);
}
