// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/configServer.proto

package enn.monitor.alarm.config.Server;

public final class EnnMonitorAlarmConfigServers {
  private EnnMonitorAlarmConfigServers() {}
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
      "\n\033protobuf/configServer.proto\032#protobuf/" +
      "configEmailParameter.proto2\241\007\n EnnMonito" +
      "rAlarmConfigEmailServer\022p\n\035getEnnMonitor" +
      "AlarmConfigEmail\022%.EnnMonitorAlarmConfig" +
      "EmailGetRequest\032&.EnnMonitorAlarmConfigE" +
      "mailGetResponse\"\000\022y\n createEnnMonitorAla" +
      "rmConfigEmail\022(.EnnMonitorAlarmConfigEma" +
      "ilCreateRequest\032).EnnMonitorAlarmConfigE" +
      "mailCreateResponse\"\000\022y\n updateEnnMonitor" +
      "AlarmConfigEmail\022(.EnnMonitorAlarmConfig",
      "EmailUpdateRequest\032).EnnMonitorAlarmConf" +
      "igEmailUpdateResponse\"\000\022y\n deleteEnnMoni" +
      "torAlarmConfigEmail\022(.EnnMonitorAlarmCon" +
      "figEmailDeleteRequest\032).EnnMonitorAlarmC" +
      "onfigEmailDeleteResponse\"\000\022\220\001\n,getMaxEnn" +
      "MonitorAlarmConfigEmailDeletedSeqNo\022,.En" +
      "nMonitorAlarmConfigEmailMaxDeletedReques" +
      "t\0320.EnnMonitorAlarmConfigEmailGetMaxDele" +
      "tedResponse\"\000\022\177\n\"getEnnMonitorAlarmConfi" +
      "gEmailValid\022*.EnnMonitorAlarmConfigEmail",
      "GetValidRequest\032+.EnnMonitorAlarmConfigE" +
      "mailGetValidResponse\"\000\022\205\001\n$getEnnMonitor" +
      "AlarmConfigEmailDeleted\022,.EnnMonitorAlar" +
      "mConfigEmailGetDeletedRequest\032-.EnnMonit" +
      "orAlarmConfigEmailGetDeletedResponse\"\000BA" +
      "\n\037enn.monitor.alarm.config.ServerB\034EnnMo" +
      "nitorAlarmConfigServersP\001b\006proto3"
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
          enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailParameter.getDescriptor(),
        }, assigner);
    enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailParameter.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
