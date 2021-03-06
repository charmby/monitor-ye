// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logTemplateParameters.proto

package enn.monitor.log.config.template.parameters;

public interface EnnMonitorLogConfigTemplateTableOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorLogConfigTemplateTable)
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
   * <code>optional string templateKey = 3;</code>
   */
  java.lang.String getTemplateKey();
  /**
   * <code>optional string templateKey = 3;</code>
   */
  com.google.protobuf.ByteString
      getTemplateKeyBytes();

  /**
   * <code>optional string belongToParentTemplate = 4;</code>
   */
  java.lang.String getBelongToParentTemplate();
  /**
   * <code>optional string belongToParentTemplate = 4;</code>
   */
  com.google.protobuf.ByteString
      getBelongToParentTemplateBytes();

  /**
   * <code>optional uint64 belongToServiceId = 5;</code>
   */
  long getBelongToServiceId();

  /**
   * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 6;</code>
   */
  int getSetTypeValue();
  /**
   * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 6;</code>
   */
  enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType getSetType();

  /**
   * <code>optional uint64 tagId = 7;</code>
   */
  long getTagId();

  /**
   * <code>optional uint64 batchId = 8;</code>
   */
  long getBatchId();

  /**
   * <code>optional uint64 createTime = 9;</code>
   */
  long getCreateTime();

  /**
   * <code>optional uint64 lastUpdateTime = 10;</code>
   */
  long getLastUpdateTime();

  /**
   * <code>optional string createUser = 11;</code>
   */
  java.lang.String getCreateUser();
  /**
   * <code>optional string createUser = 11;</code>
   */
  com.google.protobuf.ByteString
      getCreateUserBytes();

  /**
   * <code>optional string lastUpdateUser = 12;</code>
   */
  java.lang.String getLastUpdateUser();
  /**
   * <code>optional string lastUpdateUser = 12;</code>
   */
  com.google.protobuf.ByteString
      getLastUpdateUserBytes();
}
