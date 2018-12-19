// Generated by the gRPC protobuf plugin.
// If you make any local change, they will be lost.
// source: protobuf/gatewayServer.proto

#include "protobuf/gatewayServer.pb.h"
#include "protobuf/gatewayServer.grpc.pb.h"

#include <grpc++/impl/codegen/async_stream.h>
#include <grpc++/impl/codegen/async_unary_call.h>
#include <grpc++/impl/codegen/channel_interface.h>
#include <grpc++/impl/codegen/client_unary_call.h>
#include <grpc++/impl/codegen/method_handler_impl.h>
#include <grpc++/impl/codegen/rpc_service_method.h>
#include <grpc++/impl/codegen/service_type.h>
#include <grpc++/impl/codegen/sync_stream.h>

static const char* EnnMonitorSecurityGatewayServer_method_names[] = {
  "/EnnMonitorSecurityGatewayServer/put",
};

std::unique_ptr< EnnMonitorSecurityGatewayServer::Stub> EnnMonitorSecurityGatewayServer::NewStub(const std::shared_ptr< ::grpc::ChannelInterface>& channel, const ::grpc::StubOptions& options) {
  std::unique_ptr< EnnMonitorSecurityGatewayServer::Stub> stub(new EnnMonitorSecurityGatewayServer::Stub(channel));
  return stub;
}

EnnMonitorSecurityGatewayServer::Stub::Stub(const std::shared_ptr< ::grpc::ChannelInterface>& channel)
  : channel_(channel), rpcmethod_put_(EnnMonitorSecurityGatewayServer_method_names[0], ::grpc::RpcMethod::NORMAL_RPC, channel)
  {}

::grpc::Status EnnMonitorSecurityGatewayServer::Stub::put(::grpc::ClientContext* context, const ::EnnMonitorSecurityGatewayRequest& request, ::EnnMonitorSecurityGatewayResponse* response) {
  return ::grpc::BlockingUnaryCall(channel_.get(), rpcmethod_put_, context, request, response);
}

::grpc::ClientAsyncResponseReader< ::EnnMonitorSecurityGatewayResponse>* EnnMonitorSecurityGatewayServer::Stub::AsyncputRaw(::grpc::ClientContext* context, const ::EnnMonitorSecurityGatewayRequest& request, ::grpc::CompletionQueue* cq) {
  return new ::grpc::ClientAsyncResponseReader< ::EnnMonitorSecurityGatewayResponse>(channel_.get(), cq, rpcmethod_put_, context, request);
}

EnnMonitorSecurityGatewayServer::Service::Service() {
  AddMethod(new ::grpc::RpcServiceMethod(
      EnnMonitorSecurityGatewayServer_method_names[0],
      ::grpc::RpcMethod::NORMAL_RPC,
      new ::grpc::RpcMethodHandler< EnnMonitorSecurityGatewayServer::Service, ::EnnMonitorSecurityGatewayRequest, ::EnnMonitorSecurityGatewayResponse>(
          std::mem_fn(&EnnMonitorSecurityGatewayServer::Service::put), this)));
}

EnnMonitorSecurityGatewayServer::Service::~Service() {
}

::grpc::Status EnnMonitorSecurityGatewayServer::Service::put(::grpc::ServerContext* context, const ::EnnMonitorSecurityGatewayRequest* request, ::EnnMonitorSecurityGatewayResponse* response) {
  (void) context;
  (void) request;
  (void) response;
  return ::grpc::Status(::grpc::StatusCode::UNIMPLEMENTED, "");
}

