// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/ticketParameter.proto

package enn.monitor.alarm.ticket.parameter;

/**
 * Protobuf type {@code EnnMonitorAlarmTicketGetValidResponse}
 */
public  final class EnnMonitorAlarmTicketGetValidResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorAlarmTicketGetValidResponse)
    EnnMonitorAlarmTicketGetValidResponseOrBuilder {
  // Use EnnMonitorAlarmTicketGetValidResponse.newBuilder() to construct.
  private EnnMonitorAlarmTicketGetValidResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorAlarmTicketGetValidResponse() {
    isSuccess_ = false;
    error_ = "";
    ennMonitorAlarmTicketTableList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorAlarmTicketGetValidResponse(
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

            isSuccess_ = input.readBool();
            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
            break;
          }
          case 26: {
            if (!((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
              ennMonitorAlarmTicketTableList_ = new java.util.ArrayList<enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable>();
              mutable_bitField0_ |= 0x00000004;
            }
            ennMonitorAlarmTicketTableList_.add(
                input.readMessage(enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000004) == 0x00000004)) {
        ennMonitorAlarmTicketTableList_ = java.util.Collections.unmodifiableList(ennMonitorAlarmTicketTableList_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketGetValidResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketGetValidResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse.class, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ISSUCCESS_FIELD_NUMBER = 1;
  private boolean isSuccess_;
  /**
   * <code>optional bool isSuccess = 1;</code>
   */
  public boolean getIsSuccess() {
    return isSuccess_;
  }

  public static final int ERROR_FIELD_NUMBER = 2;
  private volatile java.lang.Object error_;
  /**
   * <code>optional string error = 2;</code>
   */
  public java.lang.String getError() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      error_ = s;
      return s;
    }
  }
  /**
   * <code>optional string error = 2;</code>
   */
  public com.google.protobuf.ByteString
      getErrorBytes() {
    java.lang.Object ref = error_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      error_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ENNMONITORALARMTICKETTABLELIST_FIELD_NUMBER = 3;
  private java.util.List<enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable> ennMonitorAlarmTicketTableList_;
  /**
   * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
   */
  public java.util.List<enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable> getEnnMonitorAlarmTicketTableListList() {
    return ennMonitorAlarmTicketTableList_;
  }
  /**
   * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
   */
  public java.util.List<? extends enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTableOrBuilder> 
      getEnnMonitorAlarmTicketTableListOrBuilderList() {
    return ennMonitorAlarmTicketTableList_;
  }
  /**
   * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
   */
  public int getEnnMonitorAlarmTicketTableListCount() {
    return ennMonitorAlarmTicketTableList_.size();
  }
  /**
   * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
   */
  public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable getEnnMonitorAlarmTicketTableList(int index) {
    return ennMonitorAlarmTicketTableList_.get(index);
  }
  /**
   * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
   */
  public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTableOrBuilder getEnnMonitorAlarmTicketTableListOrBuilder(
      int index) {
    return ennMonitorAlarmTicketTableList_.get(index);
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
    if (isSuccess_ != false) {
      output.writeBool(1, isSuccess_);
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, error_);
    }
    for (int i = 0; i < ennMonitorAlarmTicketTableList_.size(); i++) {
      output.writeMessage(3, ennMonitorAlarmTicketTableList_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (isSuccess_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(1, isSuccess_);
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, error_);
    }
    for (int i = 0; i < ennMonitorAlarmTicketTableList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, ennMonitorAlarmTicketTableList_.get(i));
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
    if (!(obj instanceof enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse)) {
      return super.equals(obj);
    }
    enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse other = (enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse) obj;

    boolean result = true;
    result = result && (getIsSuccess()
        == other.getIsSuccess());
    result = result && getError()
        .equals(other.getError());
    result = result && getEnnMonitorAlarmTicketTableListList()
        .equals(other.getEnnMonitorAlarmTicketTableListList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + ISSUCCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getIsSuccess());
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    if (getEnnMonitorAlarmTicketTableListCount() > 0) {
      hash = (37 * hash) + ENNMONITORALARMTICKETTABLELIST_FIELD_NUMBER;
      hash = (53 * hash) + getEnnMonitorAlarmTicketTableListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parseFrom(
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
  public static Builder newBuilder(enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse prototype) {
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
   * Protobuf type {@code EnnMonitorAlarmTicketGetValidResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorAlarmTicketGetValidResponse)
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketGetValidResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketGetValidResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse.class, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse.Builder.class);
    }

    // Construct using enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse.newBuilder()
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
        getEnnMonitorAlarmTicketTableListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      isSuccess_ = false;

      error_ = "";

      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ennMonitorAlarmTicketTableList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        ennMonitorAlarmTicketTableListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketGetValidResponse_descriptor;
    }

    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse getDefaultInstanceForType() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse.getDefaultInstance();
    }

    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse build() {
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse buildPartial() {
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse result = new enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isSuccess_ = isSuccess_;
      result.error_ = error_;
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          ennMonitorAlarmTicketTableList_ = java.util.Collections.unmodifiableList(ennMonitorAlarmTicketTableList_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.ennMonitorAlarmTicketTableList_ = ennMonitorAlarmTicketTableList_;
      } else {
        result.ennMonitorAlarmTicketTableList_ = ennMonitorAlarmTicketTableListBuilder_.build();
      }
      result.bitField0_ = to_bitField0_;
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
      if (other instanceof enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse) {
        return mergeFrom((enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse other) {
      if (other == enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        if (!other.ennMonitorAlarmTicketTableList_.isEmpty()) {
          if (ennMonitorAlarmTicketTableList_.isEmpty()) {
            ennMonitorAlarmTicketTableList_ = other.ennMonitorAlarmTicketTableList_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEnnMonitorAlarmTicketTableListIsMutable();
            ennMonitorAlarmTicketTableList_.addAll(other.ennMonitorAlarmTicketTableList_);
          }
          onChanged();
        }
      } else {
        if (!other.ennMonitorAlarmTicketTableList_.isEmpty()) {
          if (ennMonitorAlarmTicketTableListBuilder_.isEmpty()) {
            ennMonitorAlarmTicketTableListBuilder_.dispose();
            ennMonitorAlarmTicketTableListBuilder_ = null;
            ennMonitorAlarmTicketTableList_ = other.ennMonitorAlarmTicketTableList_;
            bitField0_ = (bitField0_ & ~0x00000004);
            ennMonitorAlarmTicketTableListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEnnMonitorAlarmTicketTableListFieldBuilder() : null;
          } else {
            ennMonitorAlarmTicketTableListBuilder_.addAllMessages(other.ennMonitorAlarmTicketTableList_);
          }
        }
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
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private boolean isSuccess_ ;
    /**
     * <code>optional bool isSuccess = 1;</code>
     */
    public boolean getIsSuccess() {
      return isSuccess_;
    }
    /**
     * <code>optional bool isSuccess = 1;</code>
     */
    public Builder setIsSuccess(boolean value) {
      
      isSuccess_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional bool isSuccess = 1;</code>
     */
    public Builder clearIsSuccess() {
      
      isSuccess_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>optional string error = 2;</code>
     */
    public java.lang.String getError() {
      java.lang.Object ref = error_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        error_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public com.google.protobuf.ByteString
        getErrorBytes() {
      java.lang.Object ref = error_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        error_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public Builder setError(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      error_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>optional string error = 2;</code>
     */
    public Builder setErrorBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      error_ = value;
      onChanged();
      return this;
    }

    private java.util.List<enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable> ennMonitorAlarmTicketTableList_ =
      java.util.Collections.emptyList();
    private void ensureEnnMonitorAlarmTicketTableListIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        ennMonitorAlarmTicketTableList_ = new java.util.ArrayList<enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable>(ennMonitorAlarmTicketTableList_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTableOrBuilder> ennMonitorAlarmTicketTableListBuilder_;

    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public java.util.List<enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable> getEnnMonitorAlarmTicketTableListList() {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ennMonitorAlarmTicketTableList_);
      } else {
        return ennMonitorAlarmTicketTableListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public int getEnnMonitorAlarmTicketTableListCount() {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        return ennMonitorAlarmTicketTableList_.size();
      } else {
        return ennMonitorAlarmTicketTableListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable getEnnMonitorAlarmTicketTableList(int index) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        return ennMonitorAlarmTicketTableList_.get(index);
      } else {
        return ennMonitorAlarmTicketTableListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder setEnnMonitorAlarmTicketTableList(
        int index, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable value) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        ennMonitorAlarmTicketTableList_.set(index, value);
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder setEnnMonitorAlarmTicketTableList(
        int index, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder builderForValue) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        ennMonitorAlarmTicketTableList_.set(index, builderForValue.build());
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmTicketTableList(enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable value) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        ennMonitorAlarmTicketTableList_.add(value);
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmTicketTableList(
        int index, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable value) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        ennMonitorAlarmTicketTableList_.add(index, value);
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmTicketTableList(
        enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder builderForValue) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        ennMonitorAlarmTicketTableList_.add(builderForValue.build());
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmTicketTableList(
        int index, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder builderForValue) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        ennMonitorAlarmTicketTableList_.add(index, builderForValue.build());
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder addAllEnnMonitorAlarmTicketTableList(
        java.lang.Iterable<? extends enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable> values) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ennMonitorAlarmTicketTableList_);
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder clearEnnMonitorAlarmTicketTableList() {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ennMonitorAlarmTicketTableList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public Builder removeEnnMonitorAlarmTicketTableList(int index) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ensureEnnMonitorAlarmTicketTableListIsMutable();
        ennMonitorAlarmTicketTableList_.remove(index);
        onChanged();
      } else {
        ennMonitorAlarmTicketTableListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder getEnnMonitorAlarmTicketTableListBuilder(
        int index) {
      return getEnnMonitorAlarmTicketTableListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTableOrBuilder getEnnMonitorAlarmTicketTableListOrBuilder(
        int index) {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        return ennMonitorAlarmTicketTableList_.get(index);  } else {
        return ennMonitorAlarmTicketTableListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public java.util.List<? extends enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTableOrBuilder> 
         getEnnMonitorAlarmTicketTableListOrBuilderList() {
      if (ennMonitorAlarmTicketTableListBuilder_ != null) {
        return ennMonitorAlarmTicketTableListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ennMonitorAlarmTicketTableList_);
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder addEnnMonitorAlarmTicketTableListBuilder() {
      return getEnnMonitorAlarmTicketTableListFieldBuilder().addBuilder(
          enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder addEnnMonitorAlarmTicketTableListBuilder(
        int index) {
      return getEnnMonitorAlarmTicketTableListFieldBuilder().addBuilder(
          index, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorAlarmTicketTable ennMonitorAlarmTicketTableList = 3;</code>
     */
    public java.util.List<enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder> 
         getEnnMonitorAlarmTicketTableListBuilderList() {
      return getEnnMonitorAlarmTicketTableListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTableOrBuilder> 
        getEnnMonitorAlarmTicketTableListFieldBuilder() {
      if (ennMonitorAlarmTicketTableListBuilder_ == null) {
        ennMonitorAlarmTicketTableListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTable.Builder, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTableOrBuilder>(
                ennMonitorAlarmTicketTableList_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        ennMonitorAlarmTicketTableList_ = null;
      }
      return ennMonitorAlarmTicketTableListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EnnMonitorAlarmTicketGetValidResponse)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorAlarmTicketGetValidResponse)
  private static final enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse();
  }

  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorAlarmTicketGetValidResponse>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorAlarmTicketGetValidResponse>() {
    public EnnMonitorAlarmTicketGetValidResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorAlarmTicketGetValidResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorAlarmTicketGetValidResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorAlarmTicketGetValidResponse> getParserForType() {
    return PARSER;
  }

  public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketGetValidResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
