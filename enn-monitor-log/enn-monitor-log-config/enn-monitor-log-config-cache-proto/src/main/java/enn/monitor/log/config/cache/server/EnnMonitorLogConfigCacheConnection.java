// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logConfigCacheServer.proto

package enn.monitor.log.config.cache.server;

public final class EnnMonitorLogConfigCacheConnection {
  private EnnMonitorLogConfigCacheConnection() {}
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
      "\n#protobuf/logConfigCacheServer.proto\032&p" +
      "rotobuf/logConfigCacheParameter.proto2\343\001" +
      "\n\036EnnMonitorLogConfigCacheServer\022\\\n\023getT" +
      "agByTemplateKey\022 .EnnMonitorLogConfigCac" +
      "heRequest\032!.EnnMonitorLogConfigCacheResp" +
      "onse\"\000\022c\n\020getTagIdByTagKey\022%.EnnMonitorL" +
      "ogConfigCacheTagIdRequest\032&.EnnMonitorLo" +
      "gConfigCacheTagIdResponse\"\000BK\n#enn.monit" +
      "or.log.config.cache.serverB\"EnnMonitorLo" +
      "gConfigCacheConnectionP\001b\006proto3"
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
          enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheParameters.getDescriptor(),
        }, assigner);
    enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheParameters.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}