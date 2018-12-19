// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logEventParameters.proto

package enn.monitor.log.config.event.parameters;

/**
 * Protobuf type {@code EnnMonitorLogConfigEventGetValidDataListResponse}
 */
public  final class EnnMonitorLogConfigEventGetValidDataListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogConfigEventGetValidDataListResponse)
    EnnMonitorLogConfigEventGetValidDataListResponseOrBuilder {
  // Use EnnMonitorLogConfigEventGetValidDataListResponse.newBuilder() to construct.
  private EnnMonitorLogConfigEventGetValidDataListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogConfigEventGetValidDataListResponse() {
    isSuccess_ = false;
    error_ = "";
    eventTable_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogConfigEventGetValidDataListResponse(
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
              eventTable_ = new java.util.ArrayList<enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable>();
              mutable_bitField0_ |= 0x00000004;
            }
            eventTable_.add(
                input.readMessage(enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.parser(), extensionRegistry));
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
        eventTable_ = java.util.Collections.unmodifiableList(eventTable_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventParameters.internal_static_EnnMonitorLogConfigEventGetValidDataListResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventParameters.internal_static_EnnMonitorLogConfigEventGetValidDataListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse.class, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse.Builder.class);
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

  public static final int EVENTTABLE_FIELD_NUMBER = 3;
  private java.util.List<enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable> eventTable_;
  /**
   * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
   */
  public java.util.List<enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable> getEventTableList() {
    return eventTable_;
  }
  /**
   * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
   */
  public java.util.List<? extends enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTableOrBuilder> 
      getEventTableOrBuilderList() {
    return eventTable_;
  }
  /**
   * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
   */
  public int getEventTableCount() {
    return eventTable_.size();
  }
  /**
   * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
   */
  public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable getEventTable(int index) {
    return eventTable_.get(index);
  }
  /**
   * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
   */
  public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTableOrBuilder getEventTableOrBuilder(
      int index) {
    return eventTable_.get(index);
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
    for (int i = 0; i < eventTable_.size(); i++) {
      output.writeMessage(3, eventTable_.get(i));
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
    for (int i = 0; i < eventTable_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, eventTable_.get(i));
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
    if (!(obj instanceof enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse)) {
      return super.equals(obj);
    }
    enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse other = (enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse) obj;

    boolean result = true;
    result = result && (getIsSuccess()
        == other.getIsSuccess());
    result = result && getError()
        .equals(other.getError());
    result = result && getEventTableList()
        .equals(other.getEventTableList());
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
    if (getEventTableCount() > 0) {
      hash = (37 * hash) + EVENTTABLE_FIELD_NUMBER;
      hash = (53 * hash) + getEventTableList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse prototype) {
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
   * Protobuf type {@code EnnMonitorLogConfigEventGetValidDataListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogConfigEventGetValidDataListResponse)
      enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventParameters.internal_static_EnnMonitorLogConfigEventGetValidDataListResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventParameters.internal_static_EnnMonitorLogConfigEventGetValidDataListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse.class, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse.Builder.class);
    }

    // Construct using enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse.newBuilder()
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
        getEventTableFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      isSuccess_ = false;

      error_ = "";

      if (eventTableBuilder_ == null) {
        eventTable_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
      } else {
        eventTableBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventParameters.internal_static_EnnMonitorLogConfigEventGetValidDataListResponse_descriptor;
    }

    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse getDefaultInstanceForType() {
      return enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse.getDefaultInstance();
    }

    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse build() {
      enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse buildPartial() {
      enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse result = new enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isSuccess_ = isSuccess_;
      result.error_ = error_;
      if (eventTableBuilder_ == null) {
        if (((bitField0_ & 0x00000004) == 0x00000004)) {
          eventTable_ = java.util.Collections.unmodifiableList(eventTable_);
          bitField0_ = (bitField0_ & ~0x00000004);
        }
        result.eventTable_ = eventTable_;
      } else {
        result.eventTable_ = eventTableBuilder_.build();
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
      if (other instanceof enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse) {
        return mergeFrom((enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse other) {
      if (other == enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (!other.getError().isEmpty()) {
        error_ = other.error_;
        onChanged();
      }
      if (eventTableBuilder_ == null) {
        if (!other.eventTable_.isEmpty()) {
          if (eventTable_.isEmpty()) {
            eventTable_ = other.eventTable_;
            bitField0_ = (bitField0_ & ~0x00000004);
          } else {
            ensureEventTableIsMutable();
            eventTable_.addAll(other.eventTable_);
          }
          onChanged();
        }
      } else {
        if (!other.eventTable_.isEmpty()) {
          if (eventTableBuilder_.isEmpty()) {
            eventTableBuilder_.dispose();
            eventTableBuilder_ = null;
            eventTable_ = other.eventTable_;
            bitField0_ = (bitField0_ & ~0x00000004);
            eventTableBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEventTableFieldBuilder() : null;
          } else {
            eventTableBuilder_.addAllMessages(other.eventTable_);
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
      enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse) e.getUnfinishedMessage();
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

    private java.util.List<enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable> eventTable_ =
      java.util.Collections.emptyList();
    private void ensureEventTableIsMutable() {
      if (!((bitField0_ & 0x00000004) == 0x00000004)) {
        eventTable_ = new java.util.ArrayList<enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable>(eventTable_);
        bitField0_ |= 0x00000004;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTableOrBuilder> eventTableBuilder_;

    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public java.util.List<enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable> getEventTableList() {
      if (eventTableBuilder_ == null) {
        return java.util.Collections.unmodifiableList(eventTable_);
      } else {
        return eventTableBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public int getEventTableCount() {
      if (eventTableBuilder_ == null) {
        return eventTable_.size();
      } else {
        return eventTableBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable getEventTable(int index) {
      if (eventTableBuilder_ == null) {
        return eventTable_.get(index);
      } else {
        return eventTableBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder setEventTable(
        int index, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable value) {
      if (eventTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventTableIsMutable();
        eventTable_.set(index, value);
        onChanged();
      } else {
        eventTableBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder setEventTable(
        int index, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder builderForValue) {
      if (eventTableBuilder_ == null) {
        ensureEventTableIsMutable();
        eventTable_.set(index, builderForValue.build());
        onChanged();
      } else {
        eventTableBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder addEventTable(enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable value) {
      if (eventTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventTableIsMutable();
        eventTable_.add(value);
        onChanged();
      } else {
        eventTableBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder addEventTable(
        int index, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable value) {
      if (eventTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEventTableIsMutable();
        eventTable_.add(index, value);
        onChanged();
      } else {
        eventTableBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder addEventTable(
        enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder builderForValue) {
      if (eventTableBuilder_ == null) {
        ensureEventTableIsMutable();
        eventTable_.add(builderForValue.build());
        onChanged();
      } else {
        eventTableBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder addEventTable(
        int index, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder builderForValue) {
      if (eventTableBuilder_ == null) {
        ensureEventTableIsMutable();
        eventTable_.add(index, builderForValue.build());
        onChanged();
      } else {
        eventTableBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder addAllEventTable(
        java.lang.Iterable<? extends enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable> values) {
      if (eventTableBuilder_ == null) {
        ensureEventTableIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, eventTable_);
        onChanged();
      } else {
        eventTableBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder clearEventTable() {
      if (eventTableBuilder_ == null) {
        eventTable_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000004);
        onChanged();
      } else {
        eventTableBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public Builder removeEventTable(int index) {
      if (eventTableBuilder_ == null) {
        ensureEventTableIsMutable();
        eventTable_.remove(index);
        onChanged();
      } else {
        eventTableBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder getEventTableBuilder(
        int index) {
      return getEventTableFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTableOrBuilder getEventTableOrBuilder(
        int index) {
      if (eventTableBuilder_ == null) {
        return eventTable_.get(index);  } else {
        return eventTableBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public java.util.List<? extends enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTableOrBuilder> 
         getEventTableOrBuilderList() {
      if (eventTableBuilder_ != null) {
        return eventTableBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(eventTable_);
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder addEventTableBuilder() {
      return getEventTableFieldBuilder().addBuilder(
          enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder addEventTableBuilder(
        int index) {
      return getEventTableFieldBuilder().addBuilder(
          index, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorLogConfigEventTable eventTable = 3;</code>
     */
    public java.util.List<enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder> 
         getEventTableBuilderList() {
      return getEventTableFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTableOrBuilder> 
        getEventTableFieldBuilder() {
      if (eventTableBuilder_ == null) {
        eventTableBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTable.Builder, enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventTableOrBuilder>(
                eventTable_,
                ((bitField0_ & 0x00000004) == 0x00000004),
                getParentForChildren(),
                isClean());
        eventTable_ = null;
      }
      return eventTableBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogConfigEventGetValidDataListResponse)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogConfigEventGetValidDataListResponse)
  private static final enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse();
  }

  public static enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogConfigEventGetValidDataListResponse>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogConfigEventGetValidDataListResponse>() {
    public EnnMonitorLogConfigEventGetValidDataListResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogConfigEventGetValidDataListResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogConfigEventGetValidDataListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogConfigEventGetValidDataListResponse> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.config.event.parameters.EnnMonitorLogConfigEventGetValidDataListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

