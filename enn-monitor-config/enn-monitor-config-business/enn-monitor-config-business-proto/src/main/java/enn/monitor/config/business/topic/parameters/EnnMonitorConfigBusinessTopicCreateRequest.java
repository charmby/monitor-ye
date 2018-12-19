// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/topicParameters.proto

package enn.monitor.config.business.topic.parameters;

/**
 * Protobuf type {@code EnnMonitorConfigBusinessTopicCreateRequest}
 */
public  final class EnnMonitorConfigBusinessTopicCreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorConfigBusinessTopicCreateRequest)
    EnnMonitorConfigBusinessTopicCreateRequestOrBuilder {
  // Use EnnMonitorConfigBusinessTopicCreateRequest.newBuilder() to construct.
  private EnnMonitorConfigBusinessTopicCreateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorConfigBusinessTopicCreateRequest() {
    source_ = "";
    topic_ = "";
    createUser_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorConfigBusinessTopicCreateRequest(
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

            topic_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            createUser_ = s;
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
    return enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicParameters.internal_static_EnnMonitorConfigBusinessTopicCreateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicParameters.internal_static_EnnMonitorConfigBusinessTopicCreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest.class, enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest.Builder.class);
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

  public static final int TOPIC_FIELD_NUMBER = 2;
  private volatile java.lang.Object topic_;
  /**
   * <code>optional string topic = 2;</code>
   */
  public java.lang.String getTopic() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      topic_ = s;
      return s;
    }
  }
  /**
   * <code>optional string topic = 2;</code>
   */
  public com.google.protobuf.ByteString
      getTopicBytes() {
    java.lang.Object ref = topic_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      topic_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEUSER_FIELD_NUMBER = 3;
  private volatile java.lang.Object createUser_;
  /**
   * <code>optional string createUser = 3;</code>
   */
  public java.lang.String getCreateUser() {
    java.lang.Object ref = createUser_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      createUser_ = s;
      return s;
    }
  }
  /**
   * <code>optional string createUser = 3;</code>
   */
  public com.google.protobuf.ByteString
      getCreateUserBytes() {
    java.lang.Object ref = createUser_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      createUser_ = b;
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
    if (!getTopicBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, topic_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, createUser_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getSourceBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, source_);
    }
    if (!getTopicBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, topic_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, createUser_);
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
    if (!(obj instanceof enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest)) {
      return super.equals(obj);
    }
    enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest other = (enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest) obj;

    boolean result = true;
    result = result && getSource()
        .equals(other.getSource());
    result = result && getTopic()
        .equals(other.getTopic());
    result = result && getCreateUser()
        .equals(other.getCreateUser());
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
    hash = (37 * hash) + TOPIC_FIELD_NUMBER;
    hash = (53 * hash) + getTopic().hashCode();
    hash = (37 * hash) + CREATEUSER_FIELD_NUMBER;
    hash = (53 * hash) + getCreateUser().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest prototype) {
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
   * Protobuf type {@code EnnMonitorConfigBusinessTopicCreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorConfigBusinessTopicCreateRequest)
      enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicParameters.internal_static_EnnMonitorConfigBusinessTopicCreateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicParameters.internal_static_EnnMonitorConfigBusinessTopicCreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest.class, enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest.Builder.class);
    }

    // Construct using enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest.newBuilder()
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

      topic_ = "";

      createUser_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicParameters.internal_static_EnnMonitorConfigBusinessTopicCreateRequest_descriptor;
    }

    public enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest getDefaultInstanceForType() {
      return enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest.getDefaultInstance();
    }

    public enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest build() {
      enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest buildPartial() {
      enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest result = new enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest(this);
      result.source_ = source_;
      result.topic_ = topic_;
      result.createUser_ = createUser_;
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
      if (other instanceof enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest) {
        return mergeFrom((enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest other) {
      if (other == enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest.getDefaultInstance()) return this;
      if (!other.getSource().isEmpty()) {
        source_ = other.source_;
        onChanged();
      }
      if (!other.getTopic().isEmpty()) {
        topic_ = other.topic_;
        onChanged();
      }
      if (!other.getCreateUser().isEmpty()) {
        createUser_ = other.createUser_;
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
      enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest) e.getUnfinishedMessage();
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

    private java.lang.Object topic_ = "";
    /**
     * <code>optional string topic = 2;</code>
     */
    public java.lang.String getTopic() {
      java.lang.Object ref = topic_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        topic_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string topic = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTopicBytes() {
      java.lang.Object ref = topic_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        topic_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string topic = 2;</code>
     */
    public Builder setTopic(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      topic_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string topic = 2;</code>
     */
    public Builder clearTopic() {
      
      topic_ = getDefaultInstance().getTopic();
      onChanged();
      return this;
    }
    /**
     * <code>optional string topic = 2;</code>
     */
    public Builder setTopicBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      topic_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object createUser_ = "";
    /**
     * <code>optional string createUser = 3;</code>
     */
    public java.lang.String getCreateUser() {
      java.lang.Object ref = createUser_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        createUser_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string createUser = 3;</code>
     */
    public com.google.protobuf.ByteString
        getCreateUserBytes() {
      java.lang.Object ref = createUser_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        createUser_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string createUser = 3;</code>
     */
    public Builder setCreateUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      createUser_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string createUser = 3;</code>
     */
    public Builder clearCreateUser() {
      
      createUser_ = getDefaultInstance().getCreateUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string createUser = 3;</code>
     */
    public Builder setCreateUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      createUser_ = value;
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorConfigBusinessTopicCreateRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorConfigBusinessTopicCreateRequest)
  private static final enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest();
  }

  public static enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorConfigBusinessTopicCreateRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorConfigBusinessTopicCreateRequest>() {
    public EnnMonitorConfigBusinessTopicCreateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorConfigBusinessTopicCreateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorConfigBusinessTopicCreateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorConfigBusinessTopicCreateRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.config.business.topic.parameters.EnnMonitorConfigBusinessTopicCreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

