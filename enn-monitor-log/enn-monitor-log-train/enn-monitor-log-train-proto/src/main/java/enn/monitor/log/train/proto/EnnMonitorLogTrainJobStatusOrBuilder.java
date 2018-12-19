// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/trainParameters.proto

package enn.monitor.log.train.proto;

public interface EnnMonitorLogTrainJobStatusOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorLogTrainJobStatus)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint64 jobId = 1;</code>
   */
  long getJobId();

  /**
   * <code>optional string identityId = 2;</code>
   */
  java.lang.String getIdentityId();
  /**
   * <code>optional string identityId = 2;</code>
   */
  com.google.protobuf.ByteString
      getIdentityIdBytes();

  /**
   * <code>optional string bestJob = 3;</code>
   */
  java.lang.String getBestJob();
  /**
   * <code>optional string bestJob = 3;</code>
   */
  com.google.protobuf.ByteString
      getBestJobBytes();

  /**
   * <code>optional uint64 bestGeneration = 4;</code>
   */
  long getBestGeneration();

  /**
   * <code>optional double bestError = 5;</code>
   */
  double getBestError();

  /**
   * <code>optional uint64 worstGeneration = 6;</code>
   */
  long getWorstGeneration();

  /**
   * <code>optional double worstError = 7;</code>
   */
  double getWorstError();
}