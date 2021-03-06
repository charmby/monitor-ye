// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/serviceParameters.proto

package enn.monitor.config.service.parameters;

public interface EnnMonitorConfigServiceCreateRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:EnnMonitorConfigServiceCreateRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string serviceName = 1;</code>
   */
  java.lang.String getServiceName();
  /**
   * <code>optional string serviceName = 1;</code>
   */
  com.google.protobuf.ByteString
      getServiceNameBytes();

  /**
   * <code>optional uint64 belongToServiceLine = 2;</code>
   */
  long getBelongToServiceLine();

  /**
   * <code>optional string token = 3;</code>
   */
  java.lang.String getToken();
  /**
   * <code>optional string token = 3;</code>
   */
  com.google.protobuf.ByteString
      getTokenBytes();

  /**
   * <code>optional string owner = 4;</code>
   */
  java.lang.String getOwner();
  /**
   * <code>optional string owner = 4;</code>
   */
  com.google.protobuf.ByteString
      getOwnerBytes();

  /**
   * <code>repeated string guest = 5;</code>
   */
  java.util.List<java.lang.String>
      getGuestList();
  /**
   * <code>repeated string guest = 5;</code>
   */
  int getGuestCount();
  /**
   * <code>repeated string guest = 5;</code>
   */
  java.lang.String getGuest(int index);
  /**
   * <code>repeated string guest = 5;</code>
   */
  com.google.protobuf.ByteString
      getGuestBytes(int index);
}
