// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/serviceLineServer.proto

package enn.monitor.config.serviceLine.server;

public final class EnnMonitorConfigServiceLineConnection {
  private EnnMonitorConfigServiceLineConnection() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n protobuf/serviceLineServer.proto\032$prot" +
      "obuf/serviceLineParameters.proto2\204\010\n!Enn" +
      "MonitorConfigServiceLineServer\022c\n\016GetSer" +
      "viceLine\022&.EnnMonitorConfigServiceLineGe" +
      "tRequest\032\'.EnnMonitorConfigServiceLineGe" +
      "tResponse\"\000\022l\n\021CreateServiceLine\022).EnnMo" +
      "nitorConfigServiceLineCreateRequest\032*.En" +
      "nMonitorConfigServiceLineCreateResponse\"" +
      "\000\022l\n\021UpdateServiceLine\022).EnnMonitorConfi" +
      "gServiceLineUpdateRequest\032*.EnnMonitorCo",
      "nfigServiceLineUpdateResponse\"\000\022l\n\021Delet" +
      "eServiceLine\022).EnnMonitorConfigServiceLi" +
      "neDeleteRequest\032*.EnnMonitorConfigServic" +
      "eLineDeleteResponse\"\000\022{\n\022getMaxDeletedSe" +
      "qNo\0220.EnnMonitorConfigServiceLineGetMaxD" +
      "eletedRequest\0321.EnnMonitorConfigServiceL" +
      "ineGetMaxDeletedResponse\"\000\022\177\n\020getValidDa" +
      "taList\0223.EnnMonitorConfigServiceLineGetV" +
      "alidDataListRequest\0324.EnnMonitorConfigSe" +
      "rviceLineGetValidDataListResponse\"\000\022\205\001\n\022",
      "getDeletedDataList\0225.EnnMonitorConfigSer" +
      "viceLineGetDeletedDataListRequest\0326.EnnM" +
      "onitorConfigServiceLineGetDeletedDataLis" +
      "tResponse\"\000\022\251\001\n\036checkServiceLineIsExiste" +
      "dOrNot\022A.EnnMonitorConfigServiceLineChec" +
      "kServiceLineIsExistedOrNotRequest\032B.EnnM" +
      "onitorConfigServiceLineCheckServiceLineI" +
      "sExistedOrNotResponse\"\000BP\n%enn.monitor.c" +
      "onfig.serviceLine.serverB%EnnMonitorConf" +
      "igServiceLineConnectionP\001b\006proto3"
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
          enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineParameters.getDescriptor(),
        }, assigner);
    enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineParameters.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
