// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logAnalyseTermServer.proto

package enn.monitor.log.config.analyse.term.server;

public final class EnnMonitorLogConfigAnalyseTermConnection {
  private EnnMonitorLogConfigAnalyseTermConnection() {}
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
      "\n#protobuf/logAnalyseTermServer.proto\032\'p" +
      "rotobuf/logAnalyseTermParameters.proto2\355" +
      "\003\n$EnnMonitorLogConfigAnalyseTermServer\022" +
      "i\n\016GetAnalyseTerm\022).EnnMonitorLogConfigA" +
      "nalyseTermGetRequest\032*.EnnMonitorLogConf" +
      "igAnalyseTermGetResponse\"\000\022r\n\021CreateAnal" +
      "yseTerm\022,.EnnMonitorLogConfigAnalyseTerm" +
      "CreateRequest\032-.EnnMonitorLogConfigAnaly" +
      "seTermCreateResponse\"\000\022r\n\021UpdateAnalyseT" +
      "erm\022,.EnnMonitorLogConfigAnalyseTermUpda",
      "teRequest\032-.EnnMonitorLogConfigAnalyseTe" +
      "rmUpdateResponse\"\000\022r\n\021DeleteAnalyseTerm\022" +
      ",.EnnMonitorLogConfigAnalyseTermDeleteRe" +
      "quest\032-.EnnMonitorLogConfigAnalyseTermDe" +
      "leteResponse\"\000BX\n*enn.monitor.log.config" +
      ".analyse.term.serverB(EnnMonitorLogConfi" +
      "gAnalyseTermConnectionP\001b\006proto3"
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
          enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.getDescriptor(),
        }, assigner);
    enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}