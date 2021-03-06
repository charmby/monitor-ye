// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/gatewayParameters.proto

package enn.monitor.security.gateway.parameters;

/**
 * Protobuf type {@code EnnMonitorSecurityGatewayRequest}
 */
public  final class EnnMonitorSecurityGatewayRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorSecurityGatewayRequest)
    EnnMonitorSecurityGatewayRequestOrBuilder {
  // Use EnnMonitorSecurityGatewayRequest.newBuilder() to construct.
  private EnnMonitorSecurityGatewayRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorSecurityGatewayRequest() {
    source_ = "";
    token_ = "";
    jsonList_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorSecurityGatewayRequest(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();

            source_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            token_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            jsonList_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayParameters.internal_static_EnnMonitorSecurityGatewayRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayParameters.internal_static_EnnMonitorSecurityGatewayRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest.class, enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest.Builder.class);
  }

  public static final int SOURCE_FIELD_NUMBER = 1;
  private volatile java.lang.Object source_;
  /**
   * <code>optional string source = 1;</code>
   */
  public java.lang.String getSource() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      source_ = s;
      return s;
    }
  }
  /**
   * <code>optional string source = 1;</code>
   */
  public com.google.protobuf.ByteString
      getSourceBytes() {
    java.lang.Object ref = source_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      source_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object token_;
  /**
   * <code>optional string token = 2;</code>
   */
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>optional string token = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JSONLIST_FIELD_NUMBER = 3;
  private volatile java.lang.Object jsonList_;
  /**
   * <code>optional string jsonList = 3;</code>
   */
  public java.lang.String getJsonList() {
    java.lang.Object ref = jsonList_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jsonList_ = s;
      return s;
    }
  }
  /**
   * <code>optional string jsonList = 3;</code>
   */
  public com.google.protobuf.ByteString
      getJsonListBytes() {
    java.lang.Object ref = jsonList_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      jsonList_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getSourceBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, source_);
    }
    if (!getTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, token_);
    }
    if (!getJsonListBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, jsonList_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
    }
    if (!getTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, token_);
    }
    if (!getJsonListBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, jsonList_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest)) {
      return super.equals(obj);
    }
    enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest other = (enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest) obj;

    boolean result = true;
    result = result && getSource()
        .equals(other.getSource());
    result = result && getToken()
        .equals(other.getToken());
    result = result && getJsonList()
        .equals(other.getJsonList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + SOURCE_FIELD_NUMBER;
    hash = (53 * hash) + getSource().hashCode();
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + JSONLIST_FIELD_NUMBER;
    hash = (53 * hash) + getJsonList().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code EnnMonitorSecurityGatewayRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorSecurityGatewayRequest)
      enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayParameters.internal_static_EnnMonitorSecurityGatewayRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayParameters.internal_static_EnnMonitorSecurityGatewayRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest.class, enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest.Builder.class);
    }

    // Construct using enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      source_ = "";

      token_ = "";

      jsonList_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayParameters.internal_static_EnnMonitorSecurityGatewayRequest_descriptor;
    }

    public enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest getDefaultInstanceForType() {
      return enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest.getDefaultInstance();
    }

    public enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest build() {
      enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest buildPartial() {
      enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest result = new enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest(this);
      result.source_ = source_;
      result.token_ = token_;
      result.jsonList_ = jsonList_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest) {
        return mergeFrom((enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest other) {
      if (other == enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest.getDefaultInstance()) return this;
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        onChanged();
      }
      if (!other.getJsonList().isEmpty()) {
        jsonList_ = other.jsonList_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object source_ = "";
    /**
     * <code>optional string source = 1;</code>
     */
    public java.lang.String getSource() {
      java.lang.Object ref = source_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        source_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string source = 1;</code>
     */
    public com.google.protobuf.ByteString
        getSourceBytes() {
      java.lang.Object ref = source_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        source_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string source = 1;</code>
     */
    public Builder setSource(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      source_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string source = 1;</code>
     */
    public Builder clearSource() {
      
      source_ = getDefaultInstance().getSource();
      onChanged();
      return this;
    }
    /**
     * <code>optional string source = 1;</code>
     */
    public Builder setSourceBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      source_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object token_ = "";
    /**
     * <code>optional string token = 2;</code>
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public Builder clearToken() {
      
      token_ = getDefaultInstance().getToken();
      onChanged();
      return this;
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object jsonList_ = "";
    /**
     * <code>optional string jsonList = 3;</code>
     */
    public java.lang.String getJsonList() {
      java.lang.Object ref = jsonList_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jsonList_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string jsonList = 3;</code>
     */
    public com.google.protobuf.ByteString
        getJsonListBytes() {
      java.lang.Object ref = jsonList_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        jsonList_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string jsonList = 3;</code>
     */
    public Builder setJsonList(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      jsonList_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string jsonList = 3;</code>
     */
    public Builder clearJsonList() {
      
      jsonList_ = getDefaultInstance().getJsonList();
      onChanged();
      return this;
    }
    /**
     * <code>optional string jsonList = 3;</code>
     */
    public Builder setJsonListBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      jsonList_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EnnMonitorSecurityGatewayRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorSecurityGatewayRequest)
  private static final enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest();
  }

  public static enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorSecurityGatewayRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorSecurityGatewayRequest>() {
    public EnnMonitorSecurityGatewayRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorSecurityGatewayRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorSecurityGatewayRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorSecurityGatewayRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.security.gateway.parameters.EnnMonitorSecurityGatewayRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

