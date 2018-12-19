// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/gatewayParameters.proto

#define INTERNAL_SUPPRESS_PROTOBUF_FIELD_DEPRECATION
#include "protobuf/gatewayParameters.pb.h"

#include <algorithm>

#include <google/protobuf/stubs/common.h>
#include <google/protobuf/stubs/port.h>
#include <google/protobuf/stubs/once.h>
#include <google/protobuf/io/coded_stream.h>
#include <google/protobuf/wire_format_lite_inl.h>
#include <google/protobuf/descriptor.h>
#include <google/protobuf/generated_message_reflection.h>
#include <google/protobuf/reflection_ops.h>
#include <google/protobuf/wire_format.h>
// @@protoc_insertion_point(includes)

namespace {

const ::google::protobuf::Descriptor* EnnMonitorSecurityGatewayRequest_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  EnnMonitorSecurityGatewayRequest_reflection_ = NULL;
const ::google::protobuf::Descriptor* EnnMonitorSecurityGatewayResponse_descriptor_ = NULL;
const ::google::protobuf::internal::GeneratedMessageReflection*
  EnnMonitorSecurityGatewayResponse_reflection_ = NULL;

}  // namespace


void protobuf_AssignDesc_protobuf_2fgatewayParameters_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AssignDesc_protobuf_2fgatewayParameters_2eproto() {
  protobuf_AddDesc_protobuf_2fgatewayParameters_2eproto();
  const ::google::protobuf::FileDescriptor* file =
    ::google::protobuf::DescriptorPool::generated_pool()->FindFileByName(
      "protobuf/gatewayParameters.proto");
  GOOGLE_CHECK(file != NULL);
  EnnMonitorSecurityGatewayRequest_descriptor_ = file->message_type(0);
  static const int EnnMonitorSecurityGatewayRequest_offsets_[3] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayRequest, source_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayRequest, token_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayRequest, jsonlist_),
  };
  EnnMonitorSecurityGatewayRequest_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      EnnMonitorSecurityGatewayRequest_descriptor_,
      EnnMonitorSecurityGatewayRequest::default_instance_,
      EnnMonitorSecurityGatewayRequest_offsets_,
      -1,
      -1,
      -1,
      sizeof(EnnMonitorSecurityGatewayRequest),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayRequest, _internal_metadata_),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayRequest, _is_default_instance_));
  EnnMonitorSecurityGatewayResponse_descriptor_ = file->message_type(1);
  static const int EnnMonitorSecurityGatewayResponse_offsets_[2] = {
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayResponse, issuccess_),
    GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayResponse, error_),
  };
  EnnMonitorSecurityGatewayResponse_reflection_ =
    ::google::protobuf::internal::GeneratedMessageReflection::NewGeneratedMessageReflection(
      EnnMonitorSecurityGatewayResponse_descriptor_,
      EnnMonitorSecurityGatewayResponse::default_instance_,
      EnnMonitorSecurityGatewayResponse_offsets_,
      -1,
      -1,
      -1,
      sizeof(EnnMonitorSecurityGatewayResponse),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayResponse, _internal_metadata_),
      GOOGLE_PROTOBUF_GENERATED_MESSAGE_FIELD_OFFSET(EnnMonitorSecurityGatewayResponse, _is_default_instance_));
}

namespace {

GOOGLE_PROTOBUF_DECLARE_ONCE(protobuf_AssignDescriptors_once_);
inline void protobuf_AssignDescriptorsOnce() {
  ::google::protobuf::GoogleOnceInit(&protobuf_AssignDescriptors_once_,
                 &protobuf_AssignDesc_protobuf_2fgatewayParameters_2eproto);
}

void protobuf_RegisterTypes(const ::std::string&) GOOGLE_ATTRIBUTE_COLD;
void protobuf_RegisterTypes(const ::std::string&) {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      EnnMonitorSecurityGatewayRequest_descriptor_, &EnnMonitorSecurityGatewayRequest::default_instance());
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedMessage(
      EnnMonitorSecurityGatewayResponse_descriptor_, &EnnMonitorSecurityGatewayResponse::default_instance());
}

}  // namespace

void protobuf_ShutdownFile_protobuf_2fgatewayParameters_2eproto() {
  delete EnnMonitorSecurityGatewayRequest::default_instance_;
  delete EnnMonitorSecurityGatewayRequest_reflection_;
  delete EnnMonitorSecurityGatewayResponse::default_instance_;
  delete EnnMonitorSecurityGatewayResponse_reflection_;
}

void protobuf_AddDesc_protobuf_2fgatewayParameters_2eproto() GOOGLE_ATTRIBUTE_COLD;
void protobuf_AddDesc_protobuf_2fgatewayParameters_2eproto() {
  static bool already_here = false;
  if (already_here) return;
  already_here = true;
  GOOGLE_PROTOBUF_VERIFY_VERSION;

  ::google::protobuf::DescriptorPool::InternalAddGeneratedFile(
    "\n protobuf/gatewayParameters.proto\"S\n En"
    "nMonitorSecurityGatewayRequest\022\016\n\006source"
    "\030\001 \001(\t\022\r\n\005token\030\002 \001(\t\022\020\n\010jsonList\030\003 \001(\t\""
    "E\n!EnnMonitorSecurityGatewayResponse\022\021\n\t"
    "isSuccess\030\001 \001(\010\022\r\n\005error\030\002 \001(\tBP\n\'enn.mo"
    "nitor.security.gateway.parametersB#EnnMo"
    "nitorSecurityGatewayParametersP\001b\006proto3", 280);
  ::google::protobuf::MessageFactory::InternalRegisterGeneratedFile(
    "protobuf/gatewayParameters.proto", &protobuf_RegisterTypes);
  EnnMonitorSecurityGatewayRequest::default_instance_ = new EnnMonitorSecurityGatewayRequest();
  EnnMonitorSecurityGatewayResponse::default_instance_ = new EnnMonitorSecurityGatewayResponse();
  EnnMonitorSecurityGatewayRequest::default_instance_->InitAsDefaultInstance();
  EnnMonitorSecurityGatewayResponse::default_instance_->InitAsDefaultInstance();
  ::google::protobuf::internal::OnShutdown(&protobuf_ShutdownFile_protobuf_2fgatewayParameters_2eproto);
}

// Force AddDescriptors() to be called at static initialization time.
struct StaticDescriptorInitializer_protobuf_2fgatewayParameters_2eproto {
  StaticDescriptorInitializer_protobuf_2fgatewayParameters_2eproto() {
    protobuf_AddDesc_protobuf_2fgatewayParameters_2eproto();
  }
} static_descriptor_initializer_protobuf_2fgatewayParameters_2eproto_;

// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int EnnMonitorSecurityGatewayRequest::kSourceFieldNumber;
const int EnnMonitorSecurityGatewayRequest::kTokenFieldNumber;
const int EnnMonitorSecurityGatewayRequest::kJsonListFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

EnnMonitorSecurityGatewayRequest::EnnMonitorSecurityGatewayRequest()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  SharedCtor();
  // @@protoc_insertion_point(constructor:EnnMonitorSecurityGatewayRequest)
}

void EnnMonitorSecurityGatewayRequest::InitAsDefaultInstance() {
  _is_default_instance_ = true;
}

EnnMonitorSecurityGatewayRequest::EnnMonitorSecurityGatewayRequest(const EnnMonitorSecurityGatewayRequest& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  MergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:EnnMonitorSecurityGatewayRequest)
}

void EnnMonitorSecurityGatewayRequest::SharedCtor() {
    _is_default_instance_ = false;
  ::google::protobuf::internal::GetEmptyString();
  _cached_size_ = 0;
  source_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  token_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  jsonlist_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

EnnMonitorSecurityGatewayRequest::~EnnMonitorSecurityGatewayRequest() {
  // @@protoc_insertion_point(destructor:EnnMonitorSecurityGatewayRequest)
  SharedDtor();
}

void EnnMonitorSecurityGatewayRequest::SharedDtor() {
  source_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  token_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  jsonlist_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  if (this != default_instance_) {
  }
}

void EnnMonitorSecurityGatewayRequest::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* EnnMonitorSecurityGatewayRequest::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return EnnMonitorSecurityGatewayRequest_descriptor_;
}

const EnnMonitorSecurityGatewayRequest& EnnMonitorSecurityGatewayRequest::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_protobuf_2fgatewayParameters_2eproto();
  return *default_instance_;
}

EnnMonitorSecurityGatewayRequest* EnnMonitorSecurityGatewayRequest::default_instance_ = NULL;

EnnMonitorSecurityGatewayRequest* EnnMonitorSecurityGatewayRequest::New(::google::protobuf::Arena* arena) const {
  EnnMonitorSecurityGatewayRequest* n = new EnnMonitorSecurityGatewayRequest;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void EnnMonitorSecurityGatewayRequest::Clear() {
// @@protoc_insertion_point(message_clear_start:EnnMonitorSecurityGatewayRequest)
  source_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  token_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  jsonlist_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool EnnMonitorSecurityGatewayRequest::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:EnnMonitorSecurityGatewayRequest)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional string source = 1;
      case 1: {
        if (tag == 10) {
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_source()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->source().data(), this->source().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "EnnMonitorSecurityGatewayRequest.source"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(18)) goto parse_token;
        break;
      }

      // optional string token = 2;
      case 2: {
        if (tag == 18) {
         parse_token:
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_token()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->token().data(), this->token().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "EnnMonitorSecurityGatewayRequest.token"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(26)) goto parse_jsonList;
        break;
      }

      // optional string jsonList = 3;
      case 3: {
        if (tag == 26) {
         parse_jsonList:
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_jsonlist()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->jsonlist().data(), this->jsonlist().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "EnnMonitorSecurityGatewayRequest.jsonList"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:EnnMonitorSecurityGatewayRequest)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:EnnMonitorSecurityGatewayRequest)
  return false;
#undef DO_
}

void EnnMonitorSecurityGatewayRequest::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:EnnMonitorSecurityGatewayRequest)
  // optional string source = 1;
  if (this->source().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->source().data(), this->source().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayRequest.source");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      1, this->source(), output);
  }

  // optional string token = 2;
  if (this->token().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->token().data(), this->token().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayRequest.token");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      2, this->token(), output);
  }

  // optional string jsonList = 3;
  if (this->jsonlist().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->jsonlist().data(), this->jsonlist().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayRequest.jsonList");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      3, this->jsonlist(), output);
  }

  // @@protoc_insertion_point(serialize_end:EnnMonitorSecurityGatewayRequest)
}

::google::protobuf::uint8* EnnMonitorSecurityGatewayRequest::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  // @@protoc_insertion_point(serialize_to_array_start:EnnMonitorSecurityGatewayRequest)
  // optional string source = 1;
  if (this->source().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->source().data(), this->source().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayRequest.source");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        1, this->source(), target);
  }

  // optional string token = 2;
  if (this->token().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->token().data(), this->token().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayRequest.token");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        2, this->token(), target);
  }

  // optional string jsonList = 3;
  if (this->jsonlist().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->jsonlist().data(), this->jsonlist().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayRequest.jsonList");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        3, this->jsonlist(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:EnnMonitorSecurityGatewayRequest)
  return target;
}

int EnnMonitorSecurityGatewayRequest::ByteSize() const {
// @@protoc_insertion_point(message_byte_size_start:EnnMonitorSecurityGatewayRequest)
  int total_size = 0;

  // optional string source = 1;
  if (this->source().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->source());
  }

  // optional string token = 2;
  if (this->token().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->token());
  }

  // optional string jsonList = 3;
  if (this->jsonlist().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->jsonlist());
  }

  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void EnnMonitorSecurityGatewayRequest::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:EnnMonitorSecurityGatewayRequest)
  if (GOOGLE_PREDICT_FALSE(&from == this)) {
    ::google::protobuf::internal::MergeFromFail(__FILE__, __LINE__);
  }
  const EnnMonitorSecurityGatewayRequest* source = 
      ::google::protobuf::internal::DynamicCastToGenerated<const EnnMonitorSecurityGatewayRequest>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:EnnMonitorSecurityGatewayRequest)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:EnnMonitorSecurityGatewayRequest)
    MergeFrom(*source);
  }
}

void EnnMonitorSecurityGatewayRequest::MergeFrom(const EnnMonitorSecurityGatewayRequest& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:EnnMonitorSecurityGatewayRequest)
  if (GOOGLE_PREDICT_FALSE(&from == this)) {
    ::google::protobuf::internal::MergeFromFail(__FILE__, __LINE__);
  }
  if (from.source().size() > 0) {

    source_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.source_);
  }
  if (from.token().size() > 0) {

    token_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.token_);
  }
  if (from.jsonlist().size() > 0) {

    jsonlist_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.jsonlist_);
  }
}

void EnnMonitorSecurityGatewayRequest::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:EnnMonitorSecurityGatewayRequest)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void EnnMonitorSecurityGatewayRequest::CopyFrom(const EnnMonitorSecurityGatewayRequest& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:EnnMonitorSecurityGatewayRequest)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool EnnMonitorSecurityGatewayRequest::IsInitialized() const {

  return true;
}

void EnnMonitorSecurityGatewayRequest::Swap(EnnMonitorSecurityGatewayRequest* other) {
  if (other == this) return;
  InternalSwap(other);
}
void EnnMonitorSecurityGatewayRequest::InternalSwap(EnnMonitorSecurityGatewayRequest* other) {
  source_.Swap(&other->source_);
  token_.Swap(&other->token_);
  jsonlist_.Swap(&other->jsonlist_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata EnnMonitorSecurityGatewayRequest::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = EnnMonitorSecurityGatewayRequest_descriptor_;
  metadata.reflection = EnnMonitorSecurityGatewayRequest_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// EnnMonitorSecurityGatewayRequest

// optional string source = 1;
void EnnMonitorSecurityGatewayRequest::clear_source() {
  source_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 const ::std::string& EnnMonitorSecurityGatewayRequest::source() const {
  // @@protoc_insertion_point(field_get:EnnMonitorSecurityGatewayRequest.source)
  return source_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayRequest::set_source(const ::std::string& value) {
  
  source_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:EnnMonitorSecurityGatewayRequest.source)
}
 void EnnMonitorSecurityGatewayRequest::set_source(const char* value) {
  
  source_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:EnnMonitorSecurityGatewayRequest.source)
}
 void EnnMonitorSecurityGatewayRequest::set_source(const char* value, size_t size) {
  
  source_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:EnnMonitorSecurityGatewayRequest.source)
}
 ::std::string* EnnMonitorSecurityGatewayRequest::mutable_source() {
  
  // @@protoc_insertion_point(field_mutable:EnnMonitorSecurityGatewayRequest.source)
  return source_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 ::std::string* EnnMonitorSecurityGatewayRequest::release_source() {
  // @@protoc_insertion_point(field_release:EnnMonitorSecurityGatewayRequest.source)
  
  return source_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayRequest::set_allocated_source(::std::string* source) {
  if (source != NULL) {
    
  } else {
    
  }
  source_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), source);
  // @@protoc_insertion_point(field_set_allocated:EnnMonitorSecurityGatewayRequest.source)
}

// optional string token = 2;
void EnnMonitorSecurityGatewayRequest::clear_token() {
  token_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 const ::std::string& EnnMonitorSecurityGatewayRequest::token() const {
  // @@protoc_insertion_point(field_get:EnnMonitorSecurityGatewayRequest.token)
  return token_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayRequest::set_token(const ::std::string& value) {
  
  token_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:EnnMonitorSecurityGatewayRequest.token)
}
 void EnnMonitorSecurityGatewayRequest::set_token(const char* value) {
  
  token_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:EnnMonitorSecurityGatewayRequest.token)
}
 void EnnMonitorSecurityGatewayRequest::set_token(const char* value, size_t size) {
  
  token_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:EnnMonitorSecurityGatewayRequest.token)
}
 ::std::string* EnnMonitorSecurityGatewayRequest::mutable_token() {
  
  // @@protoc_insertion_point(field_mutable:EnnMonitorSecurityGatewayRequest.token)
  return token_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 ::std::string* EnnMonitorSecurityGatewayRequest::release_token() {
  // @@protoc_insertion_point(field_release:EnnMonitorSecurityGatewayRequest.token)
  
  return token_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayRequest::set_allocated_token(::std::string* token) {
  if (token != NULL) {
    
  } else {
    
  }
  token_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), token);
  // @@protoc_insertion_point(field_set_allocated:EnnMonitorSecurityGatewayRequest.token)
}

// optional string jsonList = 3;
void EnnMonitorSecurityGatewayRequest::clear_jsonlist() {
  jsonlist_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 const ::std::string& EnnMonitorSecurityGatewayRequest::jsonlist() const {
  // @@protoc_insertion_point(field_get:EnnMonitorSecurityGatewayRequest.jsonList)
  return jsonlist_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayRequest::set_jsonlist(const ::std::string& value) {
  
  jsonlist_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:EnnMonitorSecurityGatewayRequest.jsonList)
}
 void EnnMonitorSecurityGatewayRequest::set_jsonlist(const char* value) {
  
  jsonlist_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:EnnMonitorSecurityGatewayRequest.jsonList)
}
 void EnnMonitorSecurityGatewayRequest::set_jsonlist(const char* value, size_t size) {
  
  jsonlist_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:EnnMonitorSecurityGatewayRequest.jsonList)
}
 ::std::string* EnnMonitorSecurityGatewayRequest::mutable_jsonlist() {
  
  // @@protoc_insertion_point(field_mutable:EnnMonitorSecurityGatewayRequest.jsonList)
  return jsonlist_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 ::std::string* EnnMonitorSecurityGatewayRequest::release_jsonlist() {
  // @@protoc_insertion_point(field_release:EnnMonitorSecurityGatewayRequest.jsonList)
  
  return jsonlist_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayRequest::set_allocated_jsonlist(::std::string* jsonlist) {
  if (jsonlist != NULL) {
    
  } else {
    
  }
  jsonlist_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), jsonlist);
  // @@protoc_insertion_point(field_set_allocated:EnnMonitorSecurityGatewayRequest.jsonList)
}

#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// ===================================================================

#if !defined(_MSC_VER) || _MSC_VER >= 1900
const int EnnMonitorSecurityGatewayResponse::kIsSuccessFieldNumber;
const int EnnMonitorSecurityGatewayResponse::kErrorFieldNumber;
#endif  // !defined(_MSC_VER) || _MSC_VER >= 1900

EnnMonitorSecurityGatewayResponse::EnnMonitorSecurityGatewayResponse()
  : ::google::protobuf::Message(), _internal_metadata_(NULL) {
  SharedCtor();
  // @@protoc_insertion_point(constructor:EnnMonitorSecurityGatewayResponse)
}

void EnnMonitorSecurityGatewayResponse::InitAsDefaultInstance() {
  _is_default_instance_ = true;
}

EnnMonitorSecurityGatewayResponse::EnnMonitorSecurityGatewayResponse(const EnnMonitorSecurityGatewayResponse& from)
  : ::google::protobuf::Message(),
    _internal_metadata_(NULL) {
  SharedCtor();
  MergeFrom(from);
  // @@protoc_insertion_point(copy_constructor:EnnMonitorSecurityGatewayResponse)
}

void EnnMonitorSecurityGatewayResponse::SharedCtor() {
    _is_default_instance_ = false;
  ::google::protobuf::internal::GetEmptyString();
  _cached_size_ = 0;
  issuccess_ = false;
  error_.UnsafeSetDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

EnnMonitorSecurityGatewayResponse::~EnnMonitorSecurityGatewayResponse() {
  // @@protoc_insertion_point(destructor:EnnMonitorSecurityGatewayResponse)
  SharedDtor();
}

void EnnMonitorSecurityGatewayResponse::SharedDtor() {
  error_.DestroyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
  if (this != default_instance_) {
  }
}

void EnnMonitorSecurityGatewayResponse::SetCachedSize(int size) const {
  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
}
const ::google::protobuf::Descriptor* EnnMonitorSecurityGatewayResponse::descriptor() {
  protobuf_AssignDescriptorsOnce();
  return EnnMonitorSecurityGatewayResponse_descriptor_;
}

const EnnMonitorSecurityGatewayResponse& EnnMonitorSecurityGatewayResponse::default_instance() {
  if (default_instance_ == NULL) protobuf_AddDesc_protobuf_2fgatewayParameters_2eproto();
  return *default_instance_;
}

EnnMonitorSecurityGatewayResponse* EnnMonitorSecurityGatewayResponse::default_instance_ = NULL;

EnnMonitorSecurityGatewayResponse* EnnMonitorSecurityGatewayResponse::New(::google::protobuf::Arena* arena) const {
  EnnMonitorSecurityGatewayResponse* n = new EnnMonitorSecurityGatewayResponse;
  if (arena != NULL) {
    arena->Own(n);
  }
  return n;
}

void EnnMonitorSecurityGatewayResponse::Clear() {
// @@protoc_insertion_point(message_clear_start:EnnMonitorSecurityGatewayResponse)
  issuccess_ = false;
  error_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}

bool EnnMonitorSecurityGatewayResponse::MergePartialFromCodedStream(
    ::google::protobuf::io::CodedInputStream* input) {
#define DO_(EXPRESSION) if (!GOOGLE_PREDICT_TRUE(EXPRESSION)) goto failure
  ::google::protobuf::uint32 tag;
  // @@protoc_insertion_point(parse_start:EnnMonitorSecurityGatewayResponse)
  for (;;) {
    ::std::pair< ::google::protobuf::uint32, bool> p = input->ReadTagWithCutoff(127);
    tag = p.first;
    if (!p.second) goto handle_unusual;
    switch (::google::protobuf::internal::WireFormatLite::GetTagFieldNumber(tag)) {
      // optional bool isSuccess = 1;
      case 1: {
        if (tag == 8) {
          DO_((::google::protobuf::internal::WireFormatLite::ReadPrimitive<
                   bool, ::google::protobuf::internal::WireFormatLite::TYPE_BOOL>(
                 input, &issuccess_)));

        } else {
          goto handle_unusual;
        }
        if (input->ExpectTag(18)) goto parse_error;
        break;
      }

      // optional string error = 2;
      case 2: {
        if (tag == 18) {
         parse_error:
          DO_(::google::protobuf::internal::WireFormatLite::ReadString(
                input, this->mutable_error()));
          DO_(::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
            this->error().data(), this->error().length(),
            ::google::protobuf::internal::WireFormatLite::PARSE,
            "EnnMonitorSecurityGatewayResponse.error"));
        } else {
          goto handle_unusual;
        }
        if (input->ExpectAtEnd()) goto success;
        break;
      }

      default: {
      handle_unusual:
        if (tag == 0 ||
            ::google::protobuf::internal::WireFormatLite::GetTagWireType(tag) ==
            ::google::protobuf::internal::WireFormatLite::WIRETYPE_END_GROUP) {
          goto success;
        }
        DO_(::google::protobuf::internal::WireFormatLite::SkipField(input, tag));
        break;
      }
    }
  }
success:
  // @@protoc_insertion_point(parse_success:EnnMonitorSecurityGatewayResponse)
  return true;
failure:
  // @@protoc_insertion_point(parse_failure:EnnMonitorSecurityGatewayResponse)
  return false;
#undef DO_
}

void EnnMonitorSecurityGatewayResponse::SerializeWithCachedSizes(
    ::google::protobuf::io::CodedOutputStream* output) const {
  // @@protoc_insertion_point(serialize_start:EnnMonitorSecurityGatewayResponse)
  // optional bool isSuccess = 1;
  if (this->issuccess() != 0) {
    ::google::protobuf::internal::WireFormatLite::WriteBool(1, this->issuccess(), output);
  }

  // optional string error = 2;
  if (this->error().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->error().data(), this->error().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayResponse.error");
    ::google::protobuf::internal::WireFormatLite::WriteStringMaybeAliased(
      2, this->error(), output);
  }

  // @@protoc_insertion_point(serialize_end:EnnMonitorSecurityGatewayResponse)
}

::google::protobuf::uint8* EnnMonitorSecurityGatewayResponse::InternalSerializeWithCachedSizesToArray(
    bool deterministic, ::google::protobuf::uint8* target) const {
  // @@protoc_insertion_point(serialize_to_array_start:EnnMonitorSecurityGatewayResponse)
  // optional bool isSuccess = 1;
  if (this->issuccess() != 0) {
    target = ::google::protobuf::internal::WireFormatLite::WriteBoolToArray(1, this->issuccess(), target);
  }

  // optional string error = 2;
  if (this->error().size() > 0) {
    ::google::protobuf::internal::WireFormatLite::VerifyUtf8String(
      this->error().data(), this->error().length(),
      ::google::protobuf::internal::WireFormatLite::SERIALIZE,
      "EnnMonitorSecurityGatewayResponse.error");
    target =
      ::google::protobuf::internal::WireFormatLite::WriteStringToArray(
        2, this->error(), target);
  }

  // @@protoc_insertion_point(serialize_to_array_end:EnnMonitorSecurityGatewayResponse)
  return target;
}

int EnnMonitorSecurityGatewayResponse::ByteSize() const {
// @@protoc_insertion_point(message_byte_size_start:EnnMonitorSecurityGatewayResponse)
  int total_size = 0;

  // optional bool isSuccess = 1;
  if (this->issuccess() != 0) {
    total_size += 1 + 1;
  }

  // optional string error = 2;
  if (this->error().size() > 0) {
    total_size += 1 +
      ::google::protobuf::internal::WireFormatLite::StringSize(
        this->error());
  }

  GOOGLE_SAFE_CONCURRENT_WRITES_BEGIN();
  _cached_size_ = total_size;
  GOOGLE_SAFE_CONCURRENT_WRITES_END();
  return total_size;
}

void EnnMonitorSecurityGatewayResponse::MergeFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_merge_from_start:EnnMonitorSecurityGatewayResponse)
  if (GOOGLE_PREDICT_FALSE(&from == this)) {
    ::google::protobuf::internal::MergeFromFail(__FILE__, __LINE__);
  }
  const EnnMonitorSecurityGatewayResponse* source = 
      ::google::protobuf::internal::DynamicCastToGenerated<const EnnMonitorSecurityGatewayResponse>(
          &from);
  if (source == NULL) {
  // @@protoc_insertion_point(generalized_merge_from_cast_fail:EnnMonitorSecurityGatewayResponse)
    ::google::protobuf::internal::ReflectionOps::Merge(from, this);
  } else {
  // @@protoc_insertion_point(generalized_merge_from_cast_success:EnnMonitorSecurityGatewayResponse)
    MergeFrom(*source);
  }
}

void EnnMonitorSecurityGatewayResponse::MergeFrom(const EnnMonitorSecurityGatewayResponse& from) {
// @@protoc_insertion_point(class_specific_merge_from_start:EnnMonitorSecurityGatewayResponse)
  if (GOOGLE_PREDICT_FALSE(&from == this)) {
    ::google::protobuf::internal::MergeFromFail(__FILE__, __LINE__);
  }
  if (from.issuccess() != 0) {
    set_issuccess(from.issuccess());
  }
  if (from.error().size() > 0) {

    error_.AssignWithDefault(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), from.error_);
  }
}

void EnnMonitorSecurityGatewayResponse::CopyFrom(const ::google::protobuf::Message& from) {
// @@protoc_insertion_point(generalized_copy_from_start:EnnMonitorSecurityGatewayResponse)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

void EnnMonitorSecurityGatewayResponse::CopyFrom(const EnnMonitorSecurityGatewayResponse& from) {
// @@protoc_insertion_point(class_specific_copy_from_start:EnnMonitorSecurityGatewayResponse)
  if (&from == this) return;
  Clear();
  MergeFrom(from);
}

bool EnnMonitorSecurityGatewayResponse::IsInitialized() const {

  return true;
}

void EnnMonitorSecurityGatewayResponse::Swap(EnnMonitorSecurityGatewayResponse* other) {
  if (other == this) return;
  InternalSwap(other);
}
void EnnMonitorSecurityGatewayResponse::InternalSwap(EnnMonitorSecurityGatewayResponse* other) {
  std::swap(issuccess_, other->issuccess_);
  error_.Swap(&other->error_);
  _internal_metadata_.Swap(&other->_internal_metadata_);
  std::swap(_cached_size_, other->_cached_size_);
}

::google::protobuf::Metadata EnnMonitorSecurityGatewayResponse::GetMetadata() const {
  protobuf_AssignDescriptorsOnce();
  ::google::protobuf::Metadata metadata;
  metadata.descriptor = EnnMonitorSecurityGatewayResponse_descriptor_;
  metadata.reflection = EnnMonitorSecurityGatewayResponse_reflection_;
  return metadata;
}

#if PROTOBUF_INLINE_NOT_IN_HEADERS
// EnnMonitorSecurityGatewayResponse

// optional bool isSuccess = 1;
void EnnMonitorSecurityGatewayResponse::clear_issuccess() {
  issuccess_ = false;
}
 bool EnnMonitorSecurityGatewayResponse::issuccess() const {
  // @@protoc_insertion_point(field_get:EnnMonitorSecurityGatewayResponse.isSuccess)
  return issuccess_;
}
 void EnnMonitorSecurityGatewayResponse::set_issuccess(bool value) {
  
  issuccess_ = value;
  // @@protoc_insertion_point(field_set:EnnMonitorSecurityGatewayResponse.isSuccess)
}

// optional string error = 2;
void EnnMonitorSecurityGatewayResponse::clear_error() {
  error_.ClearToEmptyNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 const ::std::string& EnnMonitorSecurityGatewayResponse::error() const {
  // @@protoc_insertion_point(field_get:EnnMonitorSecurityGatewayResponse.error)
  return error_.GetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayResponse::set_error(const ::std::string& value) {
  
  error_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), value);
  // @@protoc_insertion_point(field_set:EnnMonitorSecurityGatewayResponse.error)
}
 void EnnMonitorSecurityGatewayResponse::set_error(const char* value) {
  
  error_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), ::std::string(value));
  // @@protoc_insertion_point(field_set_char:EnnMonitorSecurityGatewayResponse.error)
}
 void EnnMonitorSecurityGatewayResponse::set_error(const char* value, size_t size) {
  
  error_.SetNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(),
      ::std::string(reinterpret_cast<const char*>(value), size));
  // @@protoc_insertion_point(field_set_pointer:EnnMonitorSecurityGatewayResponse.error)
}
 ::std::string* EnnMonitorSecurityGatewayResponse::mutable_error() {
  
  // @@protoc_insertion_point(field_mutable:EnnMonitorSecurityGatewayResponse.error)
  return error_.MutableNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 ::std::string* EnnMonitorSecurityGatewayResponse::release_error() {
  // @@protoc_insertion_point(field_release:EnnMonitorSecurityGatewayResponse.error)
  
  return error_.ReleaseNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited());
}
 void EnnMonitorSecurityGatewayResponse::set_allocated_error(::std::string* error) {
  if (error != NULL) {
    
  } else {
    
  }
  error_.SetAllocatedNoArena(&::google::protobuf::internal::GetEmptyStringAlreadyInited(), error);
  // @@protoc_insertion_point(field_set_allocated:EnnMonitorSecurityGatewayResponse.error)
}

#endif  // PROTOBUF_INLINE_NOT_IN_HEADERS

// @@protoc_insertion_point(namespace_scope)

// @@protoc_insertion_point(global_scope)
