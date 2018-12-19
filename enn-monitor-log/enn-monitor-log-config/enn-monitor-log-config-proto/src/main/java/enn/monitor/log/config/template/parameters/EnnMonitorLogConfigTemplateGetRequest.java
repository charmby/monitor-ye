// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logTemplateParameters.proto

package enn.monitor.log.config.template.parameters;

/**
 * Protobuf type {@code EnnMonitorLogConfigTemplateGetRequest}
 */
public  final class EnnMonitorLogConfigTemplateGetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogConfigTemplateGetRequest)
    EnnMonitorLogConfigTemplateGetRequestOrBuilder {
  // Use EnnMonitorLogConfigTemplateGetRequest.newBuilder() to construct.
  private EnnMonitorLogConfigTemplateGetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogConfigTemplateGetRequest() {
    id_ = 0L;
    belongToParentTemplate_ = "";
    belongToServiceId_ = 0L;
    setType_ = 0;
    tagId_ = 0L;
    isRoot_ = false;
    batchId_ = 0L;
    createUser_ = "";
    lastUpdateUser_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogConfigTemplateGetRequest(
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

            belongToParentTemplate_ = s;
            break;
          }
          case 24: {

            belongToServiceId_ = input.readUInt64();
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            setType_ = rawValue;
            break;
          }
          case 40: {

            tagId_ = input.readUInt64();
            break;
          }
          case 48: {

            isRoot_ = input.readBool();
            break;
          }
          case 56: {

            batchId_ = input.readUInt64();
            break;
          }
          case 66: {
            java.lang.String s = input.readStringRequireUtf8();

            createUser_ = s;
            break;
          }
          case 74: {
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
    return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest.class, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int BELONGTOPARENTTEMPLATE_FIELD_NUMBER = 2;
  private volatile java.lang.Object belongToParentTemplate_;
  /**
   * <code>optional string belongToParentTemplate = 2;</code>
   */
  public java.lang.String getBelongToParentTemplate() {
    java.lang.Object ref = belongToParentTemplate_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      belongToParentTemplate_ = s;
      return s;
    }
  }
  /**
   * <code>optional string belongToParentTemplate = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBelongToParentTemplateBytes() {
    java.lang.Object ref = belongToParentTemplate_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      belongToParentTemplate_ = b;
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

  public static final int SETTYPE_FIELD_NUMBER = 4;
  private int setType_;
  /**
   * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 4;</code>
   */
  public int getSetTypeValue() {
    return setType_;
  }
  /**
   * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 4;</code>
   */
  public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType getSetType() {
    enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType result = enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.valueOf(setType_);
    return result == null ? enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.UNRECOGNIZED : result;
  }

  public static final int TAGID_FIELD_NUMBER = 5;
  private long tagId_;
  /**
   * <code>optional uint64 tagId = 5;</code>
   */
  public long getTagId() {
    return tagId_;
  }

  public static final int ISROOT_FIELD_NUMBER = 6;
  private boolean isRoot_;
  /**
   * <code>optional bool isRoot = 6;</code>
   */
  public boolean getIsRoot() {
    return isRoot_;
  }

  public static final int BATCHID_FIELD_NUMBER = 7;
  private long batchId_;
  /**
   * <code>optional uint64 batchId = 7;</code>
   */
  public long getBatchId() {
    return batchId_;
  }

  public static final int CREATEUSER_FIELD_NUMBER = 8;
  private volatile java.lang.Object createUser_;
  /**
   * <code>optional string createUser = 8;</code>
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
   * <code>optional string createUser = 8;</code>
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

  public static final int LASTUPDATEUSER_FIELD_NUMBER = 9;
  private volatile java.lang.Object lastUpdateUser_;
  /**
   * <code>optional string lastUpdateUser = 9;</code>
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
   * <code>optional string lastUpdateUser = 9;</code>
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
    if (!getBelongToParentTemplateBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, belongToParentTemplate_);
    }
    if (belongToServiceId_ != 0L) {
      output.writeUInt64(3, belongToServiceId_);
    }
    if (setType_ != enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.None.getNumber()) {
      output.writeEnum(4, setType_);
    }
    if (tagId_ != 0L) {
      output.writeUInt64(5, tagId_);
    }
    if (isRoot_ != false) {
      output.writeBool(6, isRoot_);
    }
    if (batchId_ != 0L) {
      output.writeUInt64(7, batchId_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 8, createUser_);
    }
    if (!getLastUpdateUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 9, lastUpdateUser_);
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
    if (!getBelongToParentTemplateBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, belongToParentTemplate_);
    }
    if (belongToServiceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, belongToServiceId_);
    }
    if (setType_ != enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.None.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, setType_);
    }
    if (tagId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(5, tagId_);
    }
    if (isRoot_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, isRoot_);
    }
    if (batchId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(7, batchId_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(8, createUser_);
    }
    if (!getLastUpdateUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(9, lastUpdateUser_);
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
    if (!(obj instanceof enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest)) {
      return super.equals(obj);
    }
    enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest other = (enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && getBelongToParentTemplate()
        .equals(other.getBelongToParentTemplate());
    result = result && (getBelongToServiceId()
        == other.getBelongToServiceId());
    result = result && setType_ == other.setType_;
    result = result && (getTagId()
        == other.getTagId());
    result = result && (getIsRoot()
        == other.getIsRoot());
    result = result && (getBatchId()
        == other.getBatchId());
    result = result && getCreateUser()
        .equals(other.getCreateUser());
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
    hash = (37 * hash) + BELONGTOPARENTTEMPLATE_FIELD_NUMBER;
    hash = (53 * hash) + getBelongToParentTemplate().hashCode();
    hash = (37 * hash) + BELONGTOSERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBelongToServiceId());
    hash = (37 * hash) + SETTYPE_FIELD_NUMBER;
    hash = (53 * hash) + setType_;
    hash = (37 * hash) + TAGID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTagId());
    hash = (37 * hash) + ISROOT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsRoot());
    hash = (37 * hash) + BATCHID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBatchId());
    hash = (37 * hash) + CREATEUSER_FIELD_NUMBER;
    hash = (53 * hash) + getCreateUser().hashCode();
    hash = (37 * hash) + LASTUPDATEUSER_FIELD_NUMBER;
    hash = (53 * hash) + getLastUpdateUser().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest prototype) {
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
   * Protobuf type {@code EnnMonitorLogConfigTemplateGetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogConfigTemplateGetRequest)
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest.class, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest.Builder.class);
    }

    // Construct using enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest.newBuilder()
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

      belongToParentTemplate_ = "";

      belongToServiceId_ = 0L;

      setType_ = 0;

      tagId_ = 0L;

      isRoot_ = false;

      batchId_ = 0L;

      createUser_ = "";

      lastUpdateUser_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetRequest_descriptor;
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest getDefaultInstanceForType() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest.getDefaultInstance();
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest build() {
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest buildPartial() {
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest result = new enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest(this);
      result.id_ = id_;
      result.belongToParentTemplate_ = belongToParentTemplate_;
      result.belongToServiceId_ = belongToServiceId_;
      result.setType_ = setType_;
      result.tagId_ = tagId_;
      result.isRoot_ = isRoot_;
      result.batchId_ = batchId_;
      result.createUser_ = createUser_;
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
      if (other instanceof enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest) {
        return mergeFrom((enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest other) {
      if (other == enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (!other.getBelongToParentTemplate().isEmpty()) {
        belongToParentTemplate_ = other.belongToParentTemplate_;
        onChanged();
      }
      if (other.getBelongToServiceId() != 0L) {
        setBelongToServiceId(other.getBelongToServiceId());
      }
      if (other.setType_ != 0) {
        setSetTypeValue(other.getSetTypeValue());
      }
      if (other.getTagId() != 0L) {
        setTagId(other.getTagId());
      }
      if (other.getIsRoot() != false) {
        setIsRoot(other.getIsRoot());
      }
      if (other.getBatchId() != 0L) {
        setBatchId(other.getBatchId());
      }
      if (!other.getCreateUser().isEmpty()) {
        createUser_ = other.createUser_;
        onChanged();
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
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest) e.getUnfinishedMessage();
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

    private java.lang.Object belongToParentTemplate_ = "";
    /**
     * <code>optional string belongToParentTemplate = 2;</code>
     */
    public java.lang.String getBelongToParentTemplate() {
      java.lang.Object ref = belongToParentTemplate_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        belongToParentTemplate_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string belongToParentTemplate = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBelongToParentTemplateBytes() {
      java.lang.Object ref = belongToParentTemplate_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        belongToParentTemplate_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string belongToParentTemplate = 2;</code>
     */
    public Builder setBelongToParentTemplate(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      belongToParentTemplate_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string belongToParentTemplate = 2;</code>
     */
    public Builder clearBelongToParentTemplate() {
      
      belongToParentTemplate_ = getDefaultInstance().getBelongToParentTemplate();
      onChanged();
      return this;
    }
    /**
     * <code>optional string belongToParentTemplate = 2;</code>
     */
    public Builder setBelongToParentTemplateBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      belongToParentTemplate_ = value;
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

    private int setType_ = 0;
    /**
     * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 4;</code>
     */
    public int getSetTypeValue() {
      return setType_;
    }
    /**
     * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 4;</code>
     */
    public Builder setSetTypeValue(int value) {
      setType_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 4;</code>
     */
    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType getSetType() {
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType result = enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.valueOf(setType_);
      return result == null ? enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 4;</code>
     */
    public Builder setSetType(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      setType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .EnnMonitorLogConfigTemplateSetType setType = 4;</code>
     */
    public Builder clearSetType() {
      
      setType_ = 0;
      onChanged();
      return this;
    }

    private long tagId_ ;
    /**
     * <code>optional uint64 tagId = 5;</code>
     */
    public long getTagId() {
      return tagId_;
    }
    /**
     * <code>optional uint64 tagId = 5;</code>
     */
    public Builder setTagId(long value) {
      
      tagId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 tagId = 5;</code>
     */
    public Builder clearTagId() {
      
      tagId_ = 0L;
      onChanged();
      return this;
    }

    private boolean isRoot_ ;
    /**
     * <code>optional bool isRoot = 6;</code>
     */
    public boolean getIsRoot() {
      return isRoot_;
    }
    /**
     * <code>optional bool isRoot = 6;</code>
     */
    public Builder setIsRoot(boolean value) {
      
      isRoot_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool isRoot = 6;</code>
     */
    public Builder clearIsRoot() {
      
      isRoot_ = false;
      onChanged();
      return this;
    }

    private long batchId_ ;
    /**
     * <code>optional uint64 batchId = 7;</code>
     */
    public long getBatchId() {
      return batchId_;
    }
    /**
     * <code>optional uint64 batchId = 7;</code>
     */
    public Builder setBatchId(long value) {
      
      batchId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 batchId = 7;</code>
     */
    public Builder clearBatchId() {
      
      batchId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object createUser_ = "";
    /**
     * <code>optional string createUser = 8;</code>
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
     * <code>optional string createUser = 8;</code>
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
     * <code>optional string createUser = 8;</code>
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
     * <code>optional string createUser = 8;</code>
     */
    public Builder clearCreateUser() {
      
      createUser_ = getDefaultInstance().getCreateUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string createUser = 8;</code>
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

    private java.lang.Object lastUpdateUser_ = "";
    /**
     * <code>optional string lastUpdateUser = 9;</code>
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
     * <code>optional string lastUpdateUser = 9;</code>
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
     * <code>optional string lastUpdateUser = 9;</code>
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
     * <code>optional string lastUpdateUser = 9;</code>
     */
    public Builder clearLastUpdateUser() {
      
      lastUpdateUser_ = getDefaultInstance().getLastUpdateUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string lastUpdateUser = 9;</code>
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogConfigTemplateGetRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogConfigTemplateGetRequest)
  private static final enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest();
  }

  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogConfigTemplateGetRequest>() {
    public EnnMonitorLogConfigTemplateGetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogConfigTemplateGetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

