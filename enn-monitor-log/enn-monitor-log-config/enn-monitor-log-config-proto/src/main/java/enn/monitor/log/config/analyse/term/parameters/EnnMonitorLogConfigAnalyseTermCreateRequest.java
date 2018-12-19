// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logAnalyseTermParameters.proto

package enn.monitor.log.config.analyse.term.parameters;

/**
 * Protobuf type {@code EnnMonitorLogConfigAnalyseTermCreateRequest}
 */
public  final class EnnMonitorLogConfigAnalyseTermCreateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogConfigAnalyseTermCreateRequest)
    EnnMonitorLogConfigAnalyseTermCreateRequestOrBuilder {
  // Use EnnMonitorLogConfigAnalyseTermCreateRequest.newBuilder() to construct.
  private EnnMonitorLogConfigAnalyseTermCreateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogConfigAnalyseTermCreateRequest() {
    addTerm_ = "";
    filterTerm_ = "";
    belongToServiceId_ = 0L;
    createUser_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogConfigAnalyseTermCreateRequest(
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

            addTerm_ = s;
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            filterTerm_ = s;
            break;
          }
          case 24: {

            belongToServiceId_ = input.readUInt64();
            break;
          }
          case 34: {
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
    return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermCreateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermCreateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest.class, enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest.Builder.class);
  }

  public static final int ADDTERM_FIELD_NUMBER = 1;
  private volatile java.lang.Object addTerm_;
  /**
   * <code>optional string addTerm = 1;</code>
   */
  public java.lang.String getAddTerm() {
    java.lang.Object ref = addTerm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      addTerm_ = s;
      return s;
    }
  }
  /**
   * <code>optional string addTerm = 1;</code>
   */
  public com.google.protobuf.ByteString
      getAddTermBytes() {
    java.lang.Object ref = addTerm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      addTerm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int FILTERTERM_FIELD_NUMBER = 2;
  private volatile java.lang.Object filterTerm_;
  /**
   * <code>optional string filterTerm = 2;</code>
   */
  public java.lang.String getFilterTerm() {
    java.lang.Object ref = filterTerm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      filterTerm_ = s;
      return s;
    }
  }
  /**
   * <code>optional string filterTerm = 2;</code>
   */
  public com.google.protobuf.ByteString
      getFilterTermBytes() {
    java.lang.Object ref = filterTerm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      filterTerm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BELONGTOSERVICEID_FIELD_NUMBER = 3;
  private long belongToServiceId_;
  /**
   * <code>optional uint64 belongToServiceId = 3;</code>
   */
  public long getBelongToServiceId() {
    return belongToServiceId_;
  }

  public static final int CREATEUSER_FIELD_NUMBER = 4;
  private volatile java.lang.Object createUser_;
  /**
   * <code>optional string createUser = 4;</code>
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
   * <code>optional string createUser = 4;</code>
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
    if (!getAddTermBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, addTerm_);
    }
    if (!getFilterTermBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, filterTerm_);
    }
    if (belongToServiceId_ != 0L) {
      output.writeUInt64(3, belongToServiceId_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, createUser_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getAddTermBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, addTerm_);
    }
    if (!getFilterTermBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, filterTerm_);
    }
    if (belongToServiceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, belongToServiceId_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, createUser_);
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
    if (!(obj instanceof enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest)) {
      return super.equals(obj);
    }
    enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest other = (enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest) obj;

    boolean result = true;
    result = result && getAddTerm()
        .equals(other.getAddTerm());
    result = result && getFilterTerm()
        .equals(other.getFilterTerm());
    result = result && (getBelongToServiceId()
        == other.getBelongToServiceId());
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
    hash = (37 * hash) + ADDTERM_FIELD_NUMBER;
    hash = (53 * hash) + getAddTerm().hashCode();
    hash = (37 * hash) + FILTERTERM_FIELD_NUMBER;
    hash = (53 * hash) + getFilterTerm().hashCode();
    hash = (37 * hash) + BELONGTOSERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBelongToServiceId());
    hash = (37 * hash) + CREATEUSER_FIELD_NUMBER;
    hash = (53 * hash) + getCreateUser().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest prototype) {
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
   * Protobuf type {@code EnnMonitorLogConfigAnalyseTermCreateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogConfigAnalyseTermCreateRequest)
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermCreateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermCreateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest.class, enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest.Builder.class);
    }

    // Construct using enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest.newBuilder()
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
      addTerm_ = "";

      filterTerm_ = "";

      belongToServiceId_ = 0L;

      createUser_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermCreateRequest_descriptor;
    }

    public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest getDefaultInstanceForType() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest.getDefaultInstance();
    }

    public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest build() {
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest buildPartial() {
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest result = new enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest(this);
      result.addTerm_ = addTerm_;
      result.filterTerm_ = filterTerm_;
      result.belongToServiceId_ = belongToServiceId_;
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
      if (other instanceof enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest) {
        return mergeFrom((enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest other) {
      if (other == enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest.getDefaultInstance()) return this;
      if (!other.getAddTerm().isEmpty()) {
        addTerm_ = other.addTerm_;
        onChanged();
      }
      if (!other.getFilterTerm().isEmpty()) {
        filterTerm_ = other.filterTerm_;
        onChanged();
      }
      if (other.getBelongToServiceId() != 0L) {
        setBelongToServiceId(other.getBelongToServiceId());
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
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object addTerm_ = "";
    /**
     * <code>optional string addTerm = 1;</code>
     */
    public java.lang.String getAddTerm() {
      java.lang.Object ref = addTerm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        addTerm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string addTerm = 1;</code>
     */
    public com.google.protobuf.ByteString
        getAddTermBytes() {
      java.lang.Object ref = addTerm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        addTerm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string addTerm = 1;</code>
     */
    public Builder setAddTerm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      addTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string addTerm = 1;</code>
     */
    public Builder clearAddTerm() {
      
      addTerm_ = getDefaultInstance().getAddTerm();
      onChanged();
      return this;
    }
    /**
     * <code>optional string addTerm = 1;</code>
     */
    public Builder setAddTermBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      addTerm_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object filterTerm_ = "";
    /**
     * <code>optional string filterTerm = 2;</code>
     */
    public java.lang.String getFilterTerm() {
      java.lang.Object ref = filterTerm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filterTerm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string filterTerm = 2;</code>
     */
    public com.google.protobuf.ByteString
        getFilterTermBytes() {
      java.lang.Object ref = filterTerm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filterTerm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string filterTerm = 2;</code>
     */
    public Builder setFilterTerm(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      filterTerm_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string filterTerm = 2;</code>
     */
    public Builder clearFilterTerm() {
      
      filterTerm_ = getDefaultInstance().getFilterTerm();
      onChanged();
      return this;
    }
    /**
     * <code>optional string filterTerm = 2;</code>
     */
    public Builder setFilterTermBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      filterTerm_ = value;
      onChanged();
      return this;
    }

    private long belongToServiceId_ ;
    /**
     * <code>optional uint64 belongToServiceId = 3;</code>
     */
    public long getBelongToServiceId() {
      return belongToServiceId_;
    }
    /**
     * <code>optional uint64 belongToServiceId = 3;</code>
     */
    public Builder setBelongToServiceId(long value) {
      
      belongToServiceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 belongToServiceId = 3;</code>
     */
    public Builder clearBelongToServiceId() {
      
      belongToServiceId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object createUser_ = "";
    /**
     * <code>optional string createUser = 4;</code>
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
     * <code>optional string createUser = 4;</code>
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
     * <code>optional string createUser = 4;</code>
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
     * <code>optional string createUser = 4;</code>
     */
    public Builder clearCreateUser() {
      
      createUser_ = getDefaultInstance().getCreateUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string createUser = 4;</code>
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogConfigAnalyseTermCreateRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogConfigAnalyseTermCreateRequest)
  private static final enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest();
  }

  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogConfigAnalyseTermCreateRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogConfigAnalyseTermCreateRequest>() {
    public EnnMonitorLogConfigAnalyseTermCreateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogConfigAnalyseTermCreateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogConfigAnalyseTermCreateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogConfigAnalyseTermCreateRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermCreateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
