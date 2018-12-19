// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logAnalyseTermParameters.proto

package enn.monitor.log.config.analyse.term.parameters;

/**
 * Protobuf type {@code EnnMonitorLogConfigAnalyseTermUpdateRequest}
 */
public  final class EnnMonitorLogConfigAnalyseTermUpdateRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogConfigAnalyseTermUpdateRequest)
    EnnMonitorLogConfigAnalyseTermUpdateRequestOrBuilder {
  // Use EnnMonitorLogConfigAnalyseTermUpdateRequest.newBuilder() to construct.
  private EnnMonitorLogConfigAnalyseTermUpdateRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogConfigAnalyseTermUpdateRequest() {
    id_ = 0L;
    addTerm_ = "";
    filterTerm_ = "";
    belongToServiceId_ = 0L;
    lastUpdateUser_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogConfigAnalyseTermUpdateRequest(
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
          case 8: {

            id_ = input.readUInt64();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            addTerm_ = s;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            filterTerm_ = s;
            break;
          }
          case 32: {

            belongToServiceId_ = input.readUInt64();
            break;
          }
          case 42: {
            java.lang.String s = input.readStringRequireUtf8();

            lastUpdateUser_ = s;
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
    return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermUpdateRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermUpdateRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest.class, enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int ADDTERM_FIELD_NUMBER = 2;
  private volatile java.lang.Object addTerm_;
  /**
   * <code>optional string addTerm = 2;</code>
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
   * <code>optional string addTerm = 2;</code>
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

  public static final int FILTERTERM_FIELD_NUMBER = 3;
  private volatile java.lang.Object filterTerm_;
  /**
   * <code>optional string filterTerm = 3;</code>
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
   * <code>optional string filterTerm = 3;</code>
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

  public static final int BELONGTOSERVICEID_FIELD_NUMBER = 4;
  private long belongToServiceId_;
  /**
   * <code>optional uint64 belongToServiceId = 4;</code>
   */
  public long getBelongToServiceId() {
    return belongToServiceId_;
  }

  public static final int LASTUPDATEUSER_FIELD_NUMBER = 5;
  private volatile java.lang.Object lastUpdateUser_;
  /**
   * <code>optional string lastUpdateUser = 5;</code>
   */
  public java.lang.String getLastUpdateUser() {
    java.lang.Object ref = lastUpdateUser_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      lastUpdateUser_ = s;
      return s;
    }
  }
  /**
   * <code>optional string lastUpdateUser = 5;</code>
   */
  public com.google.protobuf.ByteString
      getLastUpdateUserBytes() {
    java.lang.Object ref = lastUpdateUser_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      lastUpdateUser_ = b;
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
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    if (!getAddTermBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, addTerm_);
    }
    if (!getFilterTermBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, filterTerm_);
    }
    if (belongToServiceId_ != 0L) {
      output.writeUInt64(4, belongToServiceId_);
    }
    if (!getLastUpdateUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, lastUpdateUser_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
    }
    if (!getAddTermBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, addTerm_);
    }
    if (!getFilterTermBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, filterTerm_);
    }
    if (belongToServiceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(4, belongToServiceId_);
    }
    if (!getLastUpdateUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, lastUpdateUser_);
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
    if (!(obj instanceof enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest)) {
      return super.equals(obj);
    }
    enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest other = (enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getAddTerm()
        .equals(other.getAddTerm());
    result = result && getFilterTerm()
        .equals(other.getFilterTerm());
    result = result && (getBelongToServiceId()
        == other.getBelongToServiceId());
    result = result && getLastUpdateUser()
        .equals(other.getLastUpdateUser());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + ADDTERM_FIELD_NUMBER;
    hash = (53 * hash) + getAddTerm().hashCode();
    hash = (37 * hash) + FILTERTERM_FIELD_NUMBER;
    hash = (53 * hash) + getFilterTerm().hashCode();
    hash = (37 * hash) + BELONGTOSERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBelongToServiceId());
    hash = (37 * hash) + LASTUPDATEUSER_FIELD_NUMBER;
    hash = (53 * hash) + getLastUpdateUser().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest prototype) {
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
   * Protobuf type {@code EnnMonitorLogConfigAnalyseTermUpdateRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogConfigAnalyseTermUpdateRequest)
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermUpdateRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermUpdateRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest.class, enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest.Builder.class);
    }

    // Construct using enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest.newBuilder()
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
      id_ = 0L;

      addTerm_ = "";

      filterTerm_ = "";

      belongToServiceId_ = 0L;

      lastUpdateUser_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermParameters.internal_static_EnnMonitorLogConfigAnalyseTermUpdateRequest_descriptor;
    }

    public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest getDefaultInstanceForType() {
      return enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest.getDefaultInstance();
    }

    public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest build() {
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest buildPartial() {
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest result = new enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest(this);
      result.id_ = id_;
      result.addTerm_ = addTerm_;
      result.filterTerm_ = filterTerm_;
      result.belongToServiceId_ = belongToServiceId_;
      result.lastUpdateUser_ = lastUpdateUser_;
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
      if (other instanceof enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest) {
        return mergeFrom((enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest other) {
      if (other == enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
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
      if (!other.getLastUpdateUser().isEmpty()) {
        lastUpdateUser_ = other.lastUpdateUser_;
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
      enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long id_ ;
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public Builder setId(long value) {
      
      id_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 id = 1;</code>
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object addTerm_ = "";
    /**
     * <code>optional string addTerm = 2;</code>
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
     * <code>optional string addTerm = 2;</code>
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
     * <code>optional string addTerm = 2;</code>
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
     * <code>optional string addTerm = 2;</code>
     */
    public Builder clearAddTerm() {
      
      addTerm_ = getDefaultInstance().getAddTerm();
      onChanged();
      return this;
    }
    /**
     * <code>optional string addTerm = 2;</code>
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
     * <code>optional string filterTerm = 3;</code>
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
     * <code>optional string filterTerm = 3;</code>
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
     * <code>optional string filterTerm = 3;</code>
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
     * <code>optional string filterTerm = 3;</code>
     */
    public Builder clearFilterTerm() {
      
      filterTerm_ = getDefaultInstance().getFilterTerm();
      onChanged();
      return this;
    }
    /**
     * <code>optional string filterTerm = 3;</code>
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
     * <code>optional uint64 belongToServiceId = 4;</code>
     */
    public long getBelongToServiceId() {
      return belongToServiceId_;
    }
    /**
     * <code>optional uint64 belongToServiceId = 4;</code>
     */
    public Builder setBelongToServiceId(long value) {
      
      belongToServiceId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 belongToServiceId = 4;</code>
     */
    public Builder clearBelongToServiceId() {
      
      belongToServiceId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object lastUpdateUser_ = "";
    /**
     * <code>optional string lastUpdateUser = 5;</code>
     */
    public java.lang.String getLastUpdateUser() {
      java.lang.Object ref = lastUpdateUser_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        lastUpdateUser_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string lastUpdateUser = 5;</code>
     */
    public com.google.protobuf.ByteString
        getLastUpdateUserBytes() {
      java.lang.Object ref = lastUpdateUser_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        lastUpdateUser_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string lastUpdateUser = 5;</code>
     */
    public Builder setLastUpdateUser(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastUpdateUser_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string lastUpdateUser = 5;</code>
     */
    public Builder clearLastUpdateUser() {
      
      lastUpdateUser_ = getDefaultInstance().getLastUpdateUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string lastUpdateUser = 5;</code>
     */
    public Builder setLastUpdateUserBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastUpdateUser_ = value;
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogConfigAnalyseTermUpdateRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogConfigAnalyseTermUpdateRequest)
  private static final enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest();
  }

  public static enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogConfigAnalyseTermUpdateRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogConfigAnalyseTermUpdateRequest>() {
    public EnnMonitorLogConfigAnalyseTermUpdateRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogConfigAnalyseTermUpdateRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogConfigAnalyseTermUpdateRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogConfigAnalyseTermUpdateRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.config.analyse.term.parameters.EnnMonitorLogConfigAnalyseTermUpdateRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

