// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/gatewayServer.proto

package enn.monitor.security.gateway.server;

public final class EnnMonitorSecurityGatewayConnection {
  private EnnMonitorSecurityGatewayConnection() {}
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
      "\n\034protobuf/gatewayServer.proto\032 protobuf" +
      "/gatewayParameters.proto2q\n\037EnnMonitorSe" +
      "curityGatewayServer\022N\n\003put\022!.EnnMonitorS" +
      "ecurityGatewayRequest\032\".EnnMonitorSecuri" +
      "tyGatewayResponse\"\000BL\n#enn.monitor.secur" +
      "ity.gateway.serverB#EnnMonitorSecurityGa" +
      "tewayConnectionP\001b\006proto3"
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
          enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayParameters.getDescriptor(),
        }, assigner);
    enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayParameters.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
