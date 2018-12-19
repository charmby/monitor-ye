// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/configEmailParameter.proto

package enn.monitor.alarm.config.email.parameter;

/**
 * Protobuf type {@code EnnMonitorAlarmConfigEmailGetValidResponse}
 */
public  final class EnnMonitorAlarmConfigEmailGetValidResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorAlarmConfigEmailGetValidResponse)
    EnnMonitorAlarmConfigEmailGetValidResponseOrBuilder {
  // Use EnnMonitorAlarmConfigEmailGetValidResponse.newBuilder() to construct.
  private EnnMonitorAlarmConfigEmailGetValidResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorAlarmConfigEmailGetValidResponse() {
    isSuccess_ = false;
    error_ = "";
    ennMonitorAlarmConfigEmailTableList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorAlarmConfigEmailGetValidResponse(
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
              ennMonitorAlarmConfigEmailTableList_ = new java.util.ArrayList<enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable>();
              mutable_bitField0_ |= 0x00000004;
            }
            ennMonitorAlarmConfigEmailTableList_.add(
                input.readMessage(enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.parser(), extensionRegistry));
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
        ennMonitorAlarmConfigEmailTableList_ = java.util.Collections.unmodifiableList(ennMonitorAlarmConfigEmailTableList_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailParameter.internal_static_EnnMonitorAlarmConfigEmailGetValidResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailParameter.internal_static_EnnMonitorAlarmConfigEmailGetValidResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse.class, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse.Builder.class);
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

  public static final int ENNMONITORALARMCONFIGEMAILTABLELIST_FIELD_NUMBER = 3;
  private java.util.List<enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable> ennMonitorAlarmConfigEmailTableList_;
  /**
   * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
   */
  public java.util.List<enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable> getEnnMonitorAlarmConfigEmailTableListList() {
    return ennMonitorAlarmConfigEmailTableList_;
  }
  /**
   * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
   */
  public java.util.List<? extends enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTableOrBuilder> 
      getEnnMonitorAlarmConfigEmailTableListOrBuilderList() {
    return ennMonitorAlarmConfigEmailTableList_;
  }
  /**
   * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
   */
  public int getEnnMonitorAlarmConfigEmailTableListCount() {
    return ennMonitorAlarmConfigEmailTableList_.size();
  }
  /**
   * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
   */
  public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable getEnnMonitorAlarmConfigEmailTableList(int index) {
    return ennMonitorAlarmConfigEmailTableList_.get(index);
  }
  /**
   * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
   */
  public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTableOrBuilder getEnnMonitorAlarmConfigEmailTableListOrBuilder(
      int index) {
    return ennMonitorAlarmConfigEmailTableList_.get(index);
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
    for (int i = 0; i < ennMonitorAlarmConfigEmailTableList_.size(); i++) {
      output.writeMessage(3, ennMonitorAlarmConfigEmailTableList_.get(i));
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
    for (int i = 0; i < ennMonitorAlarmConfigEmailTableList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, ennMonitorAlarmConfigEmailTableList_.get(i));
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
    if (!(obj instanceof enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse)) {
      return super.equals(obj);
    }
    enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse other = (enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse) obj;

    boolean result = true;
    result = result && (getIsSuccess()
        == other.getIsSuccess());
    result = result && getError()
        .equals(other.getError());
    result = result && getEnnMonitorAlarmConfigEmailTableListList()
        .equals(other.getEnnMonitorAlarmConfigEmailTableListList());
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
    if (getEnnMonitorAlarmConfigEmailTableListCount() > 0) {
      hash = (37 * hash) + ENNMONITORALARMCONFIGEMAILTABLELIST_FIELD_NUMBER;
      hash = (53 * hash) + getEnnMonitorAlarmConfigEmailTableListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parseFrom(
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
  public static Builder newBuilder(enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse prototype) {
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
   * Protobuf type {@code EnnMonitorAlarmConfigEmailGetValidResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorAlarmConfigEmailGetValidResponse)
      enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailParameter.internal_static_EnnMonitorAlarmConfigEmailGetValidResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailParameter.internal_static_EnnMonitorAlarmConfigEmailGetValidResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse.class, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse.Builder.class);
    }

    // Construct using enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse.newBuilder()
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
        getEnnMonitorAlarmConfigEmailTableListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      isSuccess_ = false;

      error_ = "";

      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ennMonitorAlarmConfigEmailTableList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailParameter.internal_static_EnnMonitorAlarmConfigEmailGetValidResponse_descriptor;
    }

    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse getDefaultInstanceForType() {
      return enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse.getDefaultInstance();
    }

    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse build() {
      enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse buildPartial() {
      enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse result = new enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isSuccess_ = isSuccess_;
      result.error_ = error_;
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          ennMonitorAlarmConfigEmailTableList_ = java.util.Collections.unmodifiableList(ennMonitorAlarmConfigEmailTableList_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.ennMonitorAlarmConfigEmailTableList_ = ennMonitorAlarmConfigEmailTableList_;
      } else {
        result.ennMonitorAlarmConfigEmailTableList_ = ennMonitorAlarmConfigEmailTableListBuilder_.build();
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
      if (other instanceof enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse) {
        return mergeFrom((enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse other) {
      if (other == enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        if (!other.ennMonitorAlarmConfigEmailTableList_.isEmpty()) {
          if (ennMonitorAlarmConfigEmailTableList_.isEmpty()) {
            ennMonitorAlarmConfigEmailTableList_ = other.ennMonitorAlarmConfigEmailTableList_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
            ennMonitorAlarmConfigEmailTableList_.addAll(other.ennMonitorAlarmConfigEmailTableList_);
          }
          onChanged();
        }
      } else {
        if (!other.ennMonitorAlarmConfigEmailTableList_.isEmpty()) {
          if (ennMonitorAlarmConfigEmailTableListBuilder_.isEmpty()) {
            ennMonitorAlarmConfigEmailTableListBuilder_.dispose();
            ennMonitorAlarmConfigEmailTableListBuilder_ = null;
            ennMonitorAlarmConfigEmailTableList_ = other.ennMonitorAlarmConfigEmailTableList_;
            bitField0_ = (bitField0_ & ~0x00000004);
            ennMonitorAlarmConfigEmailTableListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEnnMonitorAlarmConfigEmailTableListFieldBuilder() : null;
          } else {
            ennMonitorAlarmConfigEmailTableListBuilder_.addAllMessages(other.ennMonitorAlarmConfigEmailTableList_);
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
      enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse) e.getUnfinishedMessage();
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

    private java.util.List<enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable> ennMonitorAlarmConfigEmailTableList_ =
      java.util.Collections.emptyList();
    private void ensureEnnMonitorAlarmConfigEmailTableListIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        ennMonitorAlarmConfigEmailTableList_ = new java.util.ArrayList<enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable>(ennMonitorAlarmConfigEmailTableList_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTableOrBuilder> ennMonitorAlarmConfigEmailTableListBuilder_;

    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public java.util.List<enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable> getEnnMonitorAlarmConfigEmailTableListList() {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ennMonitorAlarmConfigEmailTableList_);
      } else {
        return ennMonitorAlarmConfigEmailTableListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public int getEnnMonitorAlarmConfigEmailTableListCount() {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        return ennMonitorAlarmConfigEmailTableList_.size();
      } else {
        return ennMonitorAlarmConfigEmailTableListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable getEnnMonitorAlarmConfigEmailTableList(int index) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        return ennMonitorAlarmConfigEmailTableList_.get(index);
      } else {
        return ennMonitorAlarmConfigEmailTableListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder setEnnMonitorAlarmConfigEmailTableList(
        int index, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable value) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        ennMonitorAlarmConfigEmailTableList_.set(index, value);
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder setEnnMonitorAlarmConfigEmailTableList(
        int index, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder builderForValue) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        ennMonitorAlarmConfigEmailTableList_.set(index, builderForValue.build());
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmConfigEmailTableList(enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable value) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        ennMonitorAlarmConfigEmailTableList_.add(value);
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmConfigEmailTableList(
        int index, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable value) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        ennMonitorAlarmConfigEmailTableList_.add(index, value);
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmConfigEmailTableList(
        enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder builderForValue) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        ennMonitorAlarmConfigEmailTableList_.add(builderForValue.build());
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder addEnnMonitorAlarmConfigEmailTableList(
        int index, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder builderForValue) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        ennMonitorAlarmConfigEmailTableList_.add(index, builderForValue.build());
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder addAllEnnMonitorAlarmConfigEmailTableList(
        java.lang.Iterable<? extends enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable> values) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ennMonitorAlarmConfigEmailTableList_);
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder clearEnnMonitorAlarmConfigEmailTableList() {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ennMonitorAlarmConfigEmailTableList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public Builder removeEnnMonitorAlarmConfigEmailTableList(int index) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ensureEnnMonitorAlarmConfigEmailTableListIsMutable();
        ennMonitorAlarmConfigEmailTableList_.remove(index);
        onChanged();
      } else {
        ennMonitorAlarmConfigEmailTableListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder getEnnMonitorAlarmConfigEmailTableListBuilder(
        int index) {
      return getEnnMonitorAlarmConfigEmailTableListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTableOrBuilder getEnnMonitorAlarmConfigEmailTableListOrBuilder(
        int index) {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        return ennMonitorAlarmConfigEmailTableList_.get(index);  } else {
        return ennMonitorAlarmConfigEmailTableListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public java.util.List<? extends enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTableOrBuilder> 
         getEnnMonitorAlarmConfigEmailTableListOrBuilderList() {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ != null) {
        return ennMonitorAlarmConfigEmailTableListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ennMonitorAlarmConfigEmailTableList_);
      }
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder addEnnMonitorAlarmConfigEmailTableListBuilder() {
      return getEnnMonitorAlarmConfigEmailTableListFieldBuilder().addBuilder(
          enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder addEnnMonitorAlarmConfigEmailTableListBuilder(
        int index) {
      return getEnnMonitorAlarmConfigEmailTableListFieldBuilder().addBuilder(
          index, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorAlarmConfigEmailTable ennMonitorAlarmConfigEmailTableList = 3;</code>
     */
    public java.util.List<enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder> 
         getEnnMonitorAlarmConfigEmailTableListBuilderList() {
      return getEnnMonitorAlarmConfigEmailTableListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTableOrBuilder> 
        getEnnMonitorAlarmConfigEmailTableListFieldBuilder() {
      if (ennMonitorAlarmConfigEmailTableListBuilder_ == null) {
        ennMonitorAlarmConfigEmailTableListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTable.Builder, enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailTableOrBuilder>(
                ennMonitorAlarmConfigEmailTableList_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        ennMonitorAlarmConfigEmailTableList_ = null;
      }
      return ennMonitorAlarmConfigEmailTableListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EnnMonitorAlarmConfigEmailGetValidResponse)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorAlarmConfigEmailGetValidResponse)
  private static final enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse();
  }

  public static enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorAlarmConfigEmailGetValidResponse>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorAlarmConfigEmailGetValidResponse>() {
    public EnnMonitorAlarmConfigEmailGetValidResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorAlarmConfigEmailGetValidResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorAlarmConfigEmailGetValidResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorAlarmConfigEmailGetValidResponse> getParserForType() {
    return PARSER;
  }

  public enn.monitor.alarm.config.email.parameter.EnnMonitorAlarmConfigEmailGetValidResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

