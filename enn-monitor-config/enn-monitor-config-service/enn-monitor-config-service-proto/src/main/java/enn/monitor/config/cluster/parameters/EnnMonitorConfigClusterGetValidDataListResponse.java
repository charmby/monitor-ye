// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/clusterParameters.proto

package enn.monitor.config.cluster.parameters;

/**
 * Protobuf type {@code EnnMonitorConfigClusterGetValidDataListResponse}
 */
public  final class EnnMonitorConfigClusterGetValidDataListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorConfigClusterGetValidDataListResponse)
    EnnMonitorConfigClusterGetValidDataListResponseOrBuilder {
  // Use EnnMonitorConfigClusterGetValidDataListResponse.newBuilder() to construct.
  private EnnMonitorConfigClusterGetValidDataListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorConfigClusterGetValidDataListResponse() {
    isSuccess_ = false;
    error_ = "";
    clusterTableList_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorConfigClusterGetValidDataListResponse(
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
              clusterTableList_ = new java.util.ArrayList<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable>();
              mutable_bitField0_ |= 0x00000004;
            }
            clusterTableList_.add(
                input.readMessage(enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.parser(), extensionRegistry));
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
        clusterTableList_ = java.util.Collections.unmodifiableList(clusterTableList_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetValidDataListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetValidDataListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse.class, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse.Builder.class);
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

  public static final int CLUSTERTABLELIST_FIELD_NUMBER = 3;
  private java.util.List<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable> clusterTableList_;
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  public java.util.List<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable> getClusterTableListList() {
    return clusterTableList_;
  }
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  public java.util.List<? extends enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder> 
      getClusterTableListOrBuilderList() {
    return clusterTableList_;
  }
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  public int getClusterTableListCount() {
    return clusterTableList_.size();
  }
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable getClusterTableList(int index) {
    return clusterTableList_.get(index);
  }
  /**
   * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
   */
  public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder getClusterTableListOrBuilder(
      int index) {
    return clusterTableList_.get(index);
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
    for (int i = 0; i < clusterTableList_.size(); i++) {
      output.writeMessage(3, clusterTableList_.get(i));
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
    for (int i = 0; i < clusterTableList_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, clusterTableList_.get(i));
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
    if (!(obj instanceof enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse)) {
      return super.equals(obj);
    }
    enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse other = (enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse) obj;

    boolean result = true;
    result = result && (getIsSuccess()
        == other.getIsSuccess());
    result = result && getError()
        .equals(other.getError());
    result = result && getClusterTableListList()
        .equals(other.getClusterTableListList());
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
    if (getClusterTableListCount() > 0) {
      hash = (37 * hash) + CLUSTERTABLELIST_FIELD_NUMBER;
      hash = (53 * hash) + getClusterTableListList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parseFrom(
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
  public static Builder newBuilder(enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse prototype) {
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
   * Protobuf type {@code EnnMonitorConfigClusterGetValidDataListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorConfigClusterGetValidDataListResponse)
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetValidDataListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetValidDataListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse.class, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse.Builder.class);
    }

    // Construct using enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse.newBuilder()
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
        getClusterTableListFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      isSuccess_ = false;

      error_ = "";

      if (clusterTableListBuilder_ == null) {
        clusterTableList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        clusterTableListBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetValidDataListResponse_descriptor;
    }

    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse getDefaultInstanceForType() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse.getDefaultInstance();
    }

    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse build() {
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse buildPartial() {
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse result = new enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isSuccess_ = isSuccess_;
      result.error_ = error_;
      if (clusterTableListBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          clusterTableList_ = java.util.Collections.unmodifiableList(clusterTableList_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.clusterTableList_ = clusterTableList_;
      } else {
        result.clusterTableList_ = clusterTableListBuilder_.build();
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
      if (other instanceof enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse) {
        return mergeFrom((enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse other) {
      if (other == enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (clusterTableListBuilder_ == null) {
        if (!other.clusterTableList_.isEmpty()) {
          if (clusterTableList_.isEmpty()) {
            clusterTableList_ = other.clusterTableList_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureClusterTableListIsMutable();
            clusterTableList_.addAll(other.clusterTableList_);
          }
          onChanged();
        }
      } else {
        if (!other.clusterTableList_.isEmpty()) {
          if (clusterTableListBuilder_.isEmpty()) {
            clusterTableListBuilder_.dispose();
            clusterTableListBuilder_ = null;
            clusterTableList_ = other.clusterTableList_;
            bitField0_ = (bitField0_ & ~0x00000004);
            clusterTableListBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClusterTableListFieldBuilder() : null;
          } else {
            clusterTableListBuilder_.addAllMessages(other.clusterTableList_);
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
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse) e.getUnfinishedMessage();
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

    private java.util.List<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable> clusterTableList_ =
      java.util.Collections.emptyList();
    private void ensureClusterTableListIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        clusterTableList_ = new java.util.ArrayList<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable>(clusterTableList_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder> clusterTableListBuilder_;

    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public java.util.List<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable> getClusterTableListList() {
      if (clusterTableListBuilder_ == null) {
        return java.util.Collections.unmodifiableList(clusterTableList_);
      } else {
        return clusterTableListBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public int getClusterTableListCount() {
      if (clusterTableListBuilder_ == null) {
        return clusterTableList_.size();
      } else {
        return clusterTableListBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable getClusterTableList(int index) {
      if (clusterTableListBuilder_ == null) {
        return clusterTableList_.get(index);
      } else {
        return clusterTableListBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder setClusterTableList(
        int index, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable value) {
      if (clusterTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClusterTableListIsMutable();
        clusterTableList_.set(index, value);
        onChanged();
      } else {
        clusterTableListBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder setClusterTableList(
        int index, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder builderForValue) {
      if (clusterTableListBuilder_ == null) {
        ensureClusterTableListIsMutable();
        clusterTableList_.set(index, builderForValue.build());
        onChanged();
      } else {
        clusterTableListBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder addClusterTableList(enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable value) {
      if (clusterTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClusterTableListIsMutable();
        clusterTableList_.add(value);
        onChanged();
      } else {
        clusterTableListBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder addClusterTableList(
        int index, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable value) {
      if (clusterTableListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClusterTableListIsMutable();
        clusterTableList_.add(index, value);
        onChanged();
      } else {
        clusterTableListBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder addClusterTableList(
        enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder builderForValue) {
      if (clusterTableListBuilder_ == null) {
        ensureClusterTableListIsMutable();
        clusterTableList_.add(builderForValue.build());
        onChanged();
      } else {
        clusterTableListBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder addClusterTableList(
        int index, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder builderForValue) {
      if (clusterTableListBuilder_ == null) {
        ensureClusterTableListIsMutable();
        clusterTableList_.add(index, builderForValue.build());
        onChanged();
      } else {
        clusterTableListBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder addAllClusterTableList(
        java.lang.Iterable<? extends enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable> values) {
      if (clusterTableListBuilder_ == null) {
        ensureClusterTableListIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, clusterTableList_);
        onChanged();
      } else {
        clusterTableListBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder clearClusterTableList() {
      if (clusterTableListBuilder_ == null) {
        clusterTableList_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        clusterTableListBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public Builder removeClusterTableList(int index) {
      if (clusterTableListBuilder_ == null) {
        ensureClusterTableListIsMutable();
        clusterTableList_.remove(index);
        onChanged();
      } else {
        clusterTableListBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder getClusterTableListBuilder(
        int index) {
      return getClusterTableListFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder getClusterTableListOrBuilder(
        int index) {
      if (clusterTableListBuilder_ == null) {
        return clusterTableList_.get(index);  } else {
        return clusterTableListBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public java.util.List<? extends enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder> 
         getClusterTableListOrBuilderList() {
      if (clusterTableListBuilder_ != null) {
        return clusterTableListBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(clusterTableList_);
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder addClusterTableListBuilder() {
      return getClusterTableListFieldBuilder().addBuilder(
          enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder addClusterTableListBuilder(
        int index) {
      return getClusterTableListFieldBuilder().addBuilder(
          index, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorConfigClusterTable clusterTableList = 3;</code>
     */
    public java.util.List<enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder> 
         getClusterTableListBuilderList() {
      return getClusterTableListFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder> 
        getClusterTableListFieldBuilder() {
      if (clusterTableListBuilder_ == null) {
        clusterTableListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTable.Builder, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterTableOrBuilder>(
                clusterTableList_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        clusterTableList_ = null;
      }
      return clusterTableListBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EnnMonitorConfigClusterGetValidDataListResponse)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorConfigClusterGetValidDataListResponse)
  private static final enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse();
  }

  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorConfigClusterGetValidDataListResponse>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorConfigClusterGetValidDataListResponse>() {
    public EnnMonitorConfigClusterGetValidDataListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorConfigClusterGetValidDataListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorConfigClusterGetValidDataListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorConfigClusterGetValidDataListResponse> getParserForType() {
    return PARSER;
  }

  public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetValidDataListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

