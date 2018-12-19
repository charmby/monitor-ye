// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logConfigCacheParameter.proto

package enn.monitor.log.config.cache.parameters;

/**
 * <pre>
 * create service
 * </pre>
 *
 * Protobuf type {@code EnnMonitorLogConfigCacheRequest}
 */
public  final class EnnMonitorLogConfigCacheRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogConfigCacheRequest)
    EnnMonitorLogConfigCacheRequestOrBuilder {
  // Use EnnMonitorLogConfigCacheRequest.newBuilder() to construct.
  private EnnMonitorLogConfigCacheRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogConfigCacheRequest() {
    templateKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogConfigCacheRequest(
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

            templateKey_ = s;
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
    return enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheParameters.internal_static_EnnMonitorLogConfigCacheRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheParameters.internal_static_EnnMonitorLogConfigCacheRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest.class, enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest.Builder.class);
  }

  public static final int TEMPLATEKEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object templateKey_;
  /**
   * <code>optional string templateKey = 1;</code>
   */
  public java.lang.String getTemplateKey() {
    java.lang.Object ref = templateKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      templateKey_ = s;
      return s;
    }
  }
  /**
   * <code>optional string templateKey = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTemplateKeyBytes() {
    java.lang.Object ref = templateKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      templateKey_ = b;
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
    if (!getTemplateKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, templateKey_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTemplateKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, templateKey_);
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
    if (!(obj instanceof enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest)) {
      return super.equals(obj);
    }
    enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest other = (enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest) obj;

    boolean result = true;
    result = result && getTemplateKey()
        .equals(other.getTemplateKey());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TEMPLATEKEY_FIELD_NUMBER;
    hash = (53 * hash) + getTemplateKey().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest prototype) {
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
   * <pre>
   * create service
   * </pre>
   *
   * Protobuf type {@code EnnMonitorLogConfigCacheRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogConfigCacheRequest)
      enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheParameters.internal_static_EnnMonitorLogConfigCacheRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheParameters.internal_static_EnnMonitorLogConfigCacheRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest.class, enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest.Builder.class);
    }

    // Construct using enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest.newBuilder()
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
      templateKey_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheParameters.internal_static_EnnMonitorLogConfigCacheRequest_descriptor;
    }

    public enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest getDefaultInstanceForType() {
      return enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest.getDefaultInstance();
    }

    public enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest build() {
      enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest buildPartial() {
      enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest result = new enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest(this);
      result.templateKey_ = templateKey_;
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
      if (other instanceof enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest) {
        return mergeFrom((enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest other) {
      if (other == enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest.getDefaultInstance()) return this;
      if (!other.getTemplateKey().isEmpty()) {
        templateKey_ = other.templateKey_;
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
      enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object templateKey_ = "";
    /**
     * <code>optional string templateKey = 1;</code>
     */
    public java.lang.String getTemplateKey() {
      java.lang.Object ref = templateKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        templateKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string templateKey = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTemplateKeyBytes() {
      java.lang.Object ref = templateKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        templateKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string templateKey = 1;</code>
     */
    public Builder setTemplateKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      templateKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string templateKey = 1;</code>
     */
    public Builder clearTemplateKey() {
      
      templateKey_ = getDefaultInstance().getTemplateKey();
      onChanged();
      return this;
    }
    /**
     * <code>optional string templateKey = 1;</code>
     */
    public Builder setTemplateKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      templateKey_ = value;
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogConfigCacheRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogConfigCacheRequest)
  private static final enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest();
  }

  public static enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogConfigCacheRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogConfigCacheRequest>() {
    public EnnMonitorLogConfigCacheRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogConfigCacheRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogConfigCacheRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogConfigCacheRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.config.cache.parameters.EnnMonitorLogConfigCacheRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

