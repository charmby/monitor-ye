// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/serviceLineParameters.proto

package enn.monitor.config.serviceLine.parameters;

/**
 * Protobuf type {@code EnnMonitorConfigServiceLineGetResponse}
 */
public  final class EnnMonitorConfigServiceLineGetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorConfigServiceLineGetResponse)
    EnnMonitorConfigServiceLineGetResponseOrBuilder {
  // Use EnnMonitorConfigServiceLineGetResponse.newBuilder() to construct.
  private EnnMonitorConfigServiceLineGetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorConfigServiceLineGetResponse() {
    isSuccess_ = false;
    serviceLineTable_ = java.util.Collections.emptyList();
    error_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorConfigServiceLineGetResponse(
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
            if (!((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
              serviceLineTable_ = new java.util.ArrayList<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable>();
              mutable_bitField0_ |= 0x00000002;
            }
            serviceLineTable_.add(
                input.readMessage(enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.parser(), extensionRegistry));
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            error_ = s;
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
      if (((mutable_bitField0_ & 0x00000002) == 0x00000002)) {
        serviceLineTable_ = java.util.Collections.unmodifiableList(serviceLineTable_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineParameters.internal_static_EnnMonitorConfigServiceLineGetResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineParameters.internal_static_EnnMonitorConfigServiceLineGetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse.class, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse.Builder.class);
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

  public static final int SERVICELINETABLE_FIELD_NUMBER = 2;
  private java.util.List<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable> serviceLineTable_;
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  public java.util.List<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable> getServiceLineTableList() {
    return serviceLineTable_;
  }
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  public java.util.List<? extends enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder> 
      getServiceLineTableOrBuilderList() {
    return serviceLineTable_;
  }
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  public int getServiceLineTableCount() {
    return serviceLineTable_.size();
  }
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable getServiceLineTable(int index) {
    return serviceLineTable_.get(index);
  }
  /**
   * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
   */
  public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder getServiceLineTableOrBuilder(
      int index) {
    return serviceLineTable_.get(index);
  }

  public static final int ERROR_FIELD_NUMBER = 3;
  private volatile java.lang.Object error_;
  /**
   * <code>optional string error = 3;</code>
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
   * <code>optional string error = 3;</code>
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
    for (int i = 0; i < serviceLineTable_.size(); i++) {
      output.writeMessage(2, serviceLineTable_.get(i));
    }
    if (!getErrorBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, error_);
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
    for (int i = 0; i < serviceLineTable_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, serviceLineTable_.get(i));
    }
    if (!getErrorBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, error_);
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
    if (!(obj instanceof enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse)) {
      return super.equals(obj);
    }
    enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse other = (enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse) obj;

    boolean result = true;
    result = result && (getIsSuccess()
        == other.getIsSuccess());
    result = result && getServiceLineTableList()
        .equals(other.getServiceLineTableList());
    result = result && getError()
        .equals(other.getError());
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
    if (getServiceLineTableCount() > 0) {
      hash = (37 * hash) + SERVICELINETABLE_FIELD_NUMBER;
      hash = (53 * hash) + getServiceLineTableList().hashCode();
    }
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parseFrom(
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
  public static Builder newBuilder(enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse prototype) {
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
   * Protobuf type {@code EnnMonitorConfigServiceLineGetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorConfigServiceLineGetResponse)
      enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineParameters.internal_static_EnnMonitorConfigServiceLineGetResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineParameters.internal_static_EnnMonitorConfigServiceLineGetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse.class, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse.Builder.class);
    }

    // Construct using enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse.newBuilder()
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
        getServiceLineTableFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      isSuccess_ = false;

      if (serviceLineTableBuilder_ == null) {
        serviceLineTable_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        serviceLineTableBuilder_.clear();
      }
      error_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineParameters.internal_static_EnnMonitorConfigServiceLineGetResponse_descriptor;
    }

    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse getDefaultInstanceForType() {
      return enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse.getDefaultInstance();
    }

    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse build() {
      enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse buildPartial() {
      enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse result = new enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isSuccess_ = isSuccess_;
      if (serviceLineTableBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          serviceLineTable_ = java.util.Collections.unmodifiableList(serviceLineTable_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.serviceLineTable_ = serviceLineTable_;
      } else {
        result.serviceLineTable_ = serviceLineTableBuilder_.build();
      }
      result.error_ = error_;
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
      if (other instanceof enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse) {
        return mergeFrom((enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse other) {
      if (other == enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (serviceLineTableBuilder_ == null) {
        if (!other.serviceLineTable_.isEmpty()) {
          if (serviceLineTable_.isEmpty()) {
            serviceLineTable_ = other.serviceLineTable_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureServiceLineTableIsMutable();
            serviceLineTable_.addAll(other.serviceLineTable_);
          }
          onChanged();
        }
      } else {
        if (!other.serviceLineTable_.isEmpty()) {
          if (serviceLineTableBuilder_.isEmpty()) {
            serviceLineTableBuilder_.dispose();
            serviceLineTableBuilder_ = null;
            serviceLineTable_ = other.serviceLineTable_;
            bitField0_ = (bitField0_ & ~0x00000002);
            serviceLineTableBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getServiceLineTableFieldBuilder() : null;
          } else {
            serviceLineTableBuilder_.addAllMessages(other.serviceLineTable_);
          }
        }
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
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
      enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse) e.getUnfinishedMessage();
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

    private java.util.List<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable> serviceLineTable_ =
      java.util.Collections.emptyList();
    private void ensureServiceLineTableIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        serviceLineTable_ = new java.util.ArrayList<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable>(serviceLineTable_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder> serviceLineTableBuilder_;

    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public java.util.List<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable> getServiceLineTableList() {
      if (serviceLineTableBuilder_ == null) {
        return java.util.Collections.unmodifiableList(serviceLineTable_);
      } else {
        return serviceLineTableBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public int getServiceLineTableCount() {
      if (serviceLineTableBuilder_ == null) {
        return serviceLineTable_.size();
      } else {
        return serviceLineTableBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable getServiceLineTable(int index) {
      if (serviceLineTableBuilder_ == null) {
        return serviceLineTable_.get(index);
      } else {
        return serviceLineTableBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder setServiceLineTable(
        int index, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable value) {
      if (serviceLineTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceLineTableIsMutable();
        serviceLineTable_.set(index, value);
        onChanged();
      } else {
        serviceLineTableBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder setServiceLineTable(
        int index, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder builderForValue) {
      if (serviceLineTableBuilder_ == null) {
        ensureServiceLineTableIsMutable();
        serviceLineTable_.set(index, builderForValue.build());
        onChanged();
      } else {
        serviceLineTableBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder addServiceLineTable(enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable value) {
      if (serviceLineTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceLineTableIsMutable();
        serviceLineTable_.add(value);
        onChanged();
      } else {
        serviceLineTableBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder addServiceLineTable(
        int index, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable value) {
      if (serviceLineTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServiceLineTableIsMutable();
        serviceLineTable_.add(index, value);
        onChanged();
      } else {
        serviceLineTableBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder addServiceLineTable(
        enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder builderForValue) {
      if (serviceLineTableBuilder_ == null) {
        ensureServiceLineTableIsMutable();
        serviceLineTable_.add(builderForValue.build());
        onChanged();
      } else {
        serviceLineTableBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder addServiceLineTable(
        int index, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder builderForValue) {
      if (serviceLineTableBuilder_ == null) {
        ensureServiceLineTableIsMutable();
        serviceLineTable_.add(index, builderForValue.build());
        onChanged();
      } else {
        serviceLineTableBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder addAllServiceLineTable(
        java.lang.Iterable<? extends enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable> values) {
      if (serviceLineTableBuilder_ == null) {
        ensureServiceLineTableIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, serviceLineTable_);
        onChanged();
      } else {
        serviceLineTableBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder clearServiceLineTable() {
      if (serviceLineTableBuilder_ == null) {
        serviceLineTable_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        serviceLineTableBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public Builder removeServiceLineTable(int index) {
      if (serviceLineTableBuilder_ == null) {
        ensureServiceLineTableIsMutable();
        serviceLineTable_.remove(index);
        onChanged();
      } else {
        serviceLineTableBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder getServiceLineTableBuilder(
        int index) {
      return getServiceLineTableFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder getServiceLineTableOrBuilder(
        int index) {
      if (serviceLineTableBuilder_ == null) {
        return serviceLineTable_.get(index);  } else {
        return serviceLineTableBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public java.util.List<? extends enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder> 
         getServiceLineTableOrBuilderList() {
      if (serviceLineTableBuilder_ != null) {
        return serviceLineTableBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(serviceLineTable_);
      }
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder addServiceLineTableBuilder() {
      return getServiceLineTableFieldBuilder().addBuilder(
          enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder addServiceLineTableBuilder(
        int index) {
      return getServiceLineTableFieldBuilder().addBuilder(
          index, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorConfigServiceLineTable serviceLineTable = 2;</code>
     */
    public java.util.List<enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder> 
         getServiceLineTableBuilderList() {
      return getServiceLineTableFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder> 
        getServiceLineTableFieldBuilder() {
      if (serviceLineTableBuilder_ == null) {
        serviceLineTableBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTable.Builder, enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineTableOrBuilder>(
                serviceLineTable_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        serviceLineTable_ = null;
      }
      return serviceLineTableBuilder_;
    }

    private java.lang.Object error_ = "";
    /**
     * <code>optional string error = 3;</code>
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
     * <code>optional string error = 3;</code>
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
     * <code>optional string error = 3;</code>
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
     * <code>optional string error = 3;</code>
     */
    public Builder clearError() {
      
      error_ = getDefaultInstance().getError();
      onChanged();
      return this;
    }
    /**
     * <code>optional string error = 3;</code>
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
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EnnMonitorConfigServiceLineGetResponse)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorConfigServiceLineGetResponse)
  private static final enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse();
  }

  public static enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorConfigServiceLineGetResponse>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorConfigServiceLineGetResponse>() {
    public EnnMonitorConfigServiceLineGetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorConfigServiceLineGetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorConfigServiceLineGetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorConfigServiceLineGetResponse> getParserForType() {
    return PARSER;
  }

  public enn.monitor.config.serviceLine.parameters.EnnMonitorConfigServiceLineGetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

