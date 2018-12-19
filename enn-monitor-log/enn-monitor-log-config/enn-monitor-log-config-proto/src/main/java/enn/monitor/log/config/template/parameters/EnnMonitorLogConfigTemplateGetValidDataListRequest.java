// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logTemplateParameters.proto

package enn.monitor.log.config.template.parameters;

/**
 * <pre>
 * get valid data list
 * </pre>
 *
 * Protobuf type {@code EnnMonitorLogConfigTemplateGetValidDataListRequest}
 */
public  final class EnnMonitorLogConfigTemplateGetValidDataListRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogConfigTemplateGetValidDataListRequest)
    EnnMonitorLogConfigTemplateGetValidDataListRequestOrBuilder {
  // Use EnnMonitorLogConfigTemplateGetValidDataListRequest.newBuilder() to construct.
  private EnnMonitorLogConfigTemplateGetValidDataListRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogConfigTemplateGetValidDataListRequest() {
    startSeqNo_ = 0L;
    batchNum_ = 0;
    belongToServiceId_ = 0L;
    setType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogConfigTemplateGetValidDataListRequest(
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

            startSeqNo_ = input.readUInt64();
            break;
          }
          case 16: {

            batchNum_ = input.readUInt32();
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
    return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest.class, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest.Builder.class);
  }

  public static final int STARTSEQNO_FIELD_NUMBER = 1;
  private long startSeqNo_;
  /**
   * <code>optional uint64 startSeqNo = 1;</code>
   */
  public long getStartSeqNo() {
    return startSeqNo_;
  }

  public static final int BATCHNUM_FIELD_NUMBER = 2;
  private int batchNum_;
  /**
   * <code>optional uint32 batchNum = 2;</code>
   */
  public int getBatchNum() {
    return batchNum_;
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
    if (startSeqNo_ != 0L) {
      output.writeUInt64(1, startSeqNo_);
    }
    if (batchNum_ != 0) {
      output.writeUInt32(2, batchNum_);
    }
    if (belongToServiceId_ != 0L) {
      output.writeUInt64(3, belongToServiceId_);
    }
    if (setType_ != enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.None.getNumber()) {
      output.writeEnum(4, setType_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (startSeqNo_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, startSeqNo_);
    }
    if (batchNum_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, batchNum_);
    }
    if (belongToServiceId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, belongToServiceId_);
    }
    if (setType_ != enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateSetType.None.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, setType_);
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
    if (!(obj instanceof enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest)) {
      return super.equals(obj);
    }
    enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest other = (enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest) obj;

    boolean result = true;
    result = result && (getStartSeqNo()
        == other.getStartSeqNo());
    result = result && (getBatchNum()
        == other.getBatchNum());
    result = result && (getBelongToServiceId()
        == other.getBelongToServiceId());
    result = result && setType_ == other.setType_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + STARTSEQNO_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartSeqNo());
    hash = (37 * hash) + BATCHNUM_FIELD_NUMBER;
    hash = (53 * hash) + getBatchNum();
    hash = (37 * hash) + BELONGTOSERVICEID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBelongToServiceId());
    hash = (37 * hash) + SETTYPE_FIELD_NUMBER;
    hash = (53 * hash) + setType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest prototype) {
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
   * get valid data list
   * </pre>
   *
   * Protobuf type {@code EnnMonitorLogConfigTemplateGetValidDataListRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogConfigTemplateGetValidDataListRequest)
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest.class, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest.Builder.class);
    }

    // Construct using enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest.newBuilder()
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
      startSeqNo_ = 0L;

      batchNum_ = 0;

      belongToServiceId_ = 0L;

      setType_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetValidDataListRequest_descriptor;
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest getDefaultInstanceForType() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest.getDefaultInstance();
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest build() {
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest buildPartial() {
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest result = new enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest(this);
      result.startSeqNo_ = startSeqNo_;
      result.batchNum_ = batchNum_;
      result.belongToServiceId_ = belongToServiceId_;
      result.setType_ = setType_;
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
      if (other instanceof enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest) {
        return mergeFrom((enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest other) {
      if (other == enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest.getDefaultInstance()) return this;
      if (other.getStartSeqNo() != 0L) {
        setStartSeqNo(other.getStartSeqNo());
      }
      if (other.getBatchNum() != 0) {
        setBatchNum(other.getBatchNum());
      }
      if (other.getBelongToServiceId() != 0L) {
        setBelongToServiceId(other.getBelongToServiceId());
      }
      if (other.setType_ != 0) {
        setSetTypeValue(other.getSetTypeValue());
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
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long startSeqNo_ ;
    /**
     * <code>optional uint64 startSeqNo = 1;</code>
     */
    public long getStartSeqNo() {
      return startSeqNo_;
    }
    /**
     * <code>optional uint64 startSeqNo = 1;</code>
     */
    public Builder setStartSeqNo(long value) {
      
      startSeqNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 startSeqNo = 1;</code>
     */
    public Builder clearStartSeqNo() {
      
      startSeqNo_ = 0L;
      onChanged();
      return this;
    }

    private int batchNum_ ;
    /**
     * <code>optional uint32 batchNum = 2;</code>
     */
    public int getBatchNum() {
      return batchNum_;
    }
    /**
     * <code>optional uint32 batchNum = 2;</code>
     */
    public Builder setBatchNum(int value) {
      
      batchNum_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 batchNum = 2;</code>
     */
    public Builder clearBatchNum() {
      
      batchNum_ = 0;
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogConfigTemplateGetValidDataListRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogConfigTemplateGetValidDataListRequest)
  private static final enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest();
  }

  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetValidDataListRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogConfigTemplateGetValidDataListRequest>() {
    public EnnMonitorLogConfigTemplateGetValidDataListRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogConfigTemplateGetValidDataListRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetValidDataListRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetValidDataListRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetValidDataListRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

