// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logTemplateParameters.proto

package enn.monitor.log.config.template.parameters;

public final class EnnMonitorLogConfigTemplateParameters {
  private EnnMonitorLogConfigTemplateParameters() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateTable_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateTable_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateCreateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateCreateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateCreateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateCreateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateUpdateRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateUpdateRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateUpdateResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateUpdateResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateDeleteRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateDeleteRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateDeleteResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateDeleteResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetValidDataListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetValidDataListResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetDeletedData_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetDeletedData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n$protobuf/logTemplateParameters.proto\"\273" +
      "\002\n EnnMonitorLogConfigTemplateTable\022\n\n\002i" +
      "d\030\001 \001(\004\022\r\n\005seqNo\030\002 \001(\004\022\023\n\013templateKey\030\003 " +
      "\001(\t\022\036\n\026belongToParentTemplate\030\004 \001(\t\022\031\n\021b" +
      "elongToServiceId\030\005 \001(\004\0224\n\007setType\030\006 \001(\0162" +
      "#.EnnMonitorLogConfigTemplateSetType\022\r\n\005" +
      "tagId\030\007 \001(\004\022\017\n\007batchId\030\010 \001(\004\022\022\n\ncreateTi" +
      "me\030\t \001(\004\022\026\n\016lastUpdateTime\030\n \001(\004\022\022\n\ncrea" +
      "teUser\030\013 \001(\t\022\026\n\016lastUpdateUser\030\014 \001(\t\"\200\002\n" +
      "%EnnMonitorLogConfigTemplateGetRequest\022\n",
      "\n\002id\030\001 \001(\004\022\036\n\026belongToParentTemplate\030\002 \001" +
      "(\t\022\031\n\021belongToServiceId\030\003 \001(\004\0224\n\007setType" +
      "\030\004 \001(\0162#.EnnMonitorLogConfigTemplateSetT" +
      "ype\022\r\n\005tagId\030\005 \001(\004\022\016\n\006isRoot\030\006 \001(\010\022\017\n\007ba" +
      "tchId\030\007 \001(\004\022\022\n\ncreateUser\030\010 \001(\t\022\026\n\016lastU" +
      "pdateUser\030\t \001(\t\"\204\001\n&EnnMonitorLogConfigT" +
      "emplateGetResponse\022\021\n\tisSuccess\030\001 \001(\010\0228\n" +
      "\rtemplateTable\030\002 \003(\0132!.EnnMonitorLogConf" +
      "igTemplateTable\022\r\n\005error\030\003 \001(\t\"\344\001\n(EnnMo" +
      "nitorLogConfigTemplateCreateRequest\022\023\n\013t",
      "emplateKey\030\001 \001(\t\022\036\n\026belongToParentTempla" +
      "te\030\002 \001(\t\022\031\n\021belongToServiceId\030\003 \001(\004\0224\n\007s" +
      "etType\030\004 \001(\0162#.EnnMonitorLogConfigTempla" +
      "teSetType\022\r\n\005tagId\030\005 \001(\004\022\017\n\007batchId\030\006 \001(" +
      "\004\022\022\n\ncreateUser\030\007 \001(\t\"M\n)EnnMonitorLogCo" +
      "nfigTemplateCreateResponse\022\021\n\tisSuccess\030" +
      "\001 \001(\010\022\r\n\005error\030\002 \001(\t\"\343\001\n(EnnMonitorLogCo" +
      "nfigTemplateUpdateRequest\022\n\n\002id\030\001 \001(\004\022\023\n" +
      "\013templateKey\030\002 \001(\t\022\036\n\026belongToParentTemp" +
      "late\030\003 \001(\t\022\031\n\021belongToServiceId\030\004 \001(\004\0224\n",
      "\007setType\030\005 \001(\0162#.EnnMonitorLogConfigTemp" +
      "lateSetType\022\r\n\005tagId\030\006 \001(\004\022\026\n\016lastUpdate" +
      "User\030\007 \001(\t\"M\n)EnnMonitorLogConfigTemplat" +
      "eUpdateResponse\022\021\n\tisSuccess\030\001 \001(\010\022\r\n\005er" +
      "ror\030\002 \001(\t\"G\n(EnnMonitorLogConfigTemplate" +
      "DeleteRequest\022\n\n\002id\030\001 \001(\004\022\017\n\007batchId\030\002 \001" +
      "(\004\"M\n)EnnMonitorLogConfigTemplateDeleteR" +
      "esponse\022\021\n\tisSuccess\030\001 \001(\010\022\r\n\005error\030\002 \001(" +
      "\t\"1\n/EnnMonitorLogConfigTemplateGetMaxDe" +
      "letedRequest\"c\n0EnnMonitorLogConfigTempl",
      "ateGetMaxDeletedResponse\022\021\n\tisSuccess\030\001 " +
      "\001(\010\022\r\n\005error\030\002 \001(\t\022\r\n\005seqNo\030\003 \001(\004\"\253\001\n2En" +
      "nMonitorLogConfigTemplateGetValidDataLis" +
      "tRequest\022\022\n\nstartSeqNo\030\001 \001(\004\022\020\n\010batchNum" +
      "\030\002 \001(\r\022\031\n\021belongToServiceId\030\003 \001(\004\0224\n\007set" +
      "Type\030\004 \001(\0162#.EnnMonitorLogConfigTemplate" +
      "SetType\"\221\001\n3EnnMonitorLogConfigTemplateG" +
      "etValidDataListResponse\022\021\n\tisSuccess\030\001 \001" +
      "(\010\022\r\n\005error\030\002 \001(\t\0228\n\rtemplateTable\030\003 \003(\013" +
      "2!.EnnMonitorLogConfigTemplateTable\"\\\n4E",
      "nnMonitorLogConfigTemplateGetDeletedData" +
      "ListRequest\022\022\n\nstartSeqNo\030\001 \001(\004\022\020\n\010batch" +
      "Num\030\002 \001(\r\"F\n)EnnMonitorLogConfigTemplate" +
      "GetDeletedData\022\n\n\002id\030\001 \001(\004\022\r\n\005seqNo\030\002 \001(" +
      "\004\"\236\001\n5EnnMonitorLogConfigTemplateGetDele" +
      "tedDataListResponse\022\021\n\tisSuccess\030\001 \001(\010\022\r" +
      "\n\005error\030\002 \001(\t\022C\n\017deletedDataList\030\003 \003(\0132*" +
      ".EnnMonitorLogConfigTemplateGetDeletedDa" +
      "ta*D\n\"EnnMonitorLogConfigTemplateSetType" +
      "\022\010\n\004None\020\000\022\n\n\006Manual\020\001\022\010\n\004Auto\020\002BU\n*enn.",
      "monitor.log.config.template.parametersB%" +
      "EnnMonitorLogConfigTemplateParametersP\001b" +
      "\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_EnnMonitorLogConfigTemplateTable_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_EnnMonitorLogConfigTemplateTable_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateTable_descriptor,
        new java.lang.String[] { "Id", "SeqNo", "TemplateKey", "BelongToParentTemplate", "BelongToServiceId", "SetType", "TagId", "BatchId", "CreateTime", "LastUpdateTime", "CreateUser", "LastUpdateUser", });
    internal_static_EnnMonitorLogConfigTemplateGetRequest_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_EnnMonitorLogConfigTemplateGetRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetRequest_descriptor,
        new java.lang.String[] { "Id", "BelongToParentTemplate", "BelongToServiceId", "SetType", "TagId", "IsRoot", "BatchId", "CreateUser", "LastUpdateUser", });
    internal_static_EnnMonitorLogConfigTemplateGetResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_EnnMonitorLogConfigTemplateGetResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "TemplateTable", "Error", });
    internal_static_EnnMonitorLogConfigTemplateCreateRequest_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_EnnMonitorLogConfigTemplateCreateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateCreateRequest_descriptor,
        new java.lang.String[] { "TemplateKey", "BelongToParentTemplate", "BelongToServiceId", "SetType", "TagId", "BatchId", "CreateUser", });
    internal_static_EnnMonitorLogConfigTemplateCreateResponse_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_EnnMonitorLogConfigTemplateCreateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateCreateResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Error", });
    internal_static_EnnMonitorLogConfigTemplateUpdateRequest_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_EnnMonitorLogConfigTemplateUpdateRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateUpdateRequest_descriptor,
        new java.lang.String[] { "Id", "TemplateKey", "BelongToParentTemplate", "BelongToServiceId", "SetType", "TagId", "LastUpdateUser", });
    internal_static_EnnMonitorLogConfigTemplateUpdateResponse_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_EnnMonitorLogConfigTemplateUpdateResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateUpdateResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Error", });
    internal_static_EnnMonitorLogConfigTemplateDeleteRequest_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_EnnMonitorLogConfigTemplateDeleteRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateDeleteRequest_descriptor,
        new java.lang.String[] { "Id", "BatchId", });
    internal_static_EnnMonitorLogConfigTemplateDeleteResponse_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_EnnMonitorLogConfigTemplateDeleteResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateDeleteResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Error", });
    internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedRequest_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedRequest_descriptor,
        new java.lang.String[] { });
    internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedResponse_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetMaxDeletedResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Error", "SeqNo", });
    internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_descriptor,
        new java.lang.String[] { "StartSeqNo", "BatchNum", "BelongToServiceId", "SetType", });
    internal_static_EnnMonitorLogConfigTemplateGetValidDataListResponse_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_EnnMonitorLogConfigTemplateGetValidDataListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetValidDataListResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Error", "TemplateTable", });
    internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListRequest_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListRequest_descriptor,
        new java.lang.String[] { "StartSeqNo", "BatchNum", });
    internal_static_EnnMonitorLogConfigTemplateGetDeletedData_descriptor =
      getDescriptor().getMessageTypes().get(14);
    internal_static_EnnMonitorLogConfigTemplateGetDeletedData_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetDeletedData_descriptor,
        new java.lang.String[] { "Id", "SeqNo", });
    internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListResponse_descriptor =
      getDescriptor().getMessageTypes().get(15);
    internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_EnnMonitorLogConfigTemplateGetDeletedDataListResponse_descriptor,
        new java.lang.String[] { "IsSuccess", "Error", "DeletedDataList", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}