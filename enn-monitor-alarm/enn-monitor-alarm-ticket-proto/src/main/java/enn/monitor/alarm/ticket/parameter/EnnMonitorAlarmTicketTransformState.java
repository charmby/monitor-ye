// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/ticketParameter.proto

package enn.monitor.alarm.ticket.parameter;

/**
 * Protobuf type {@code EnnMonitorAlarmTicketTransformState}
 */
public  final class EnnMonitorAlarmTicketTransformState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorAlarmTicketTransformState)
    EnnMonitorAlarmTicketTransformStateOrBuilder {
  // Use EnnMonitorAlarmTicketTransformState.newBuilder() to construct.
  private EnnMonitorAlarmTicketTransformState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorAlarmTicketTransformState() {
    ticketKey_ = "";
    ticketTransformState_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorAlarmTicketTransformState(
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

            ticketKey_ = s;
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            ticketTransformState_ = rawValue;
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
    return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketTransformState_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketTransformState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState.class, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState.Builder.class);
  }

  public static final int TICKETKEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object ticketKey_;
  /**
   * <code>optional string ticketKey = 1;</code>
   */
  public java.lang.String getTicketKey() {
    java.lang.Object ref = ticketKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ticketKey_ = s;
      return s;
    }
  }
  /**
   * <code>optional string ticketKey = 1;</code>
   */
  public com.google.protobuf.ByteString
      getTicketKeyBytes() {
    java.lang.Object ref = ticketKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      ticketKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TICKETTRANSFORMSTATE_FIELD_NUMBER = 2;
  private int ticketTransformState_;
  /**
   * <code>optional .EnnMonitorAlarmTicketTransformStateEnum ticketTransformState = 2;</code>
   */
  public int getTicketTransformStateValue() {
    return ticketTransformState_;
  }
  /**
   * <code>optional .EnnMonitorAlarmTicketTransformStateEnum ticketTransformState = 2;</code>
   */
  public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum getTicketTransformState() {
    enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum result = enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum.valueOf(ticketTransformState_);
    return result == null ? enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum.UNRECOGNIZED : result;
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
    if (!getTicketKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, ticketKey_);
    }
    if (ticketTransformState_ != enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum.AutoRecoverFailed.getNumber()) {
      output.writeEnum(2, ticketTransformState_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getTicketKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, ticketKey_);
    }
    if (ticketTransformState_ != enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum.AutoRecoverFailed.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, ticketTransformState_);
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
    if (!(obj instanceof enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState)) {
      return super.equals(obj);
    }
    enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState other = (enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState) obj;

    boolean result = true;
    result = result && getTicketKey()
        .equals(other.getTicketKey());
    result = result && ticketTransformState_ == other.ticketTransformState_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TICKETKEY_FIELD_NUMBER;
    hash = (53 * hash) + getTicketKey().hashCode();
    hash = (37 * hash) + TICKETTRANSFORMSTATE_FIELD_NUMBER;
    hash = (53 * hash) + ticketTransformState_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parseFrom(
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
  public static Builder newBuilder(enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState prototype) {
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
   * Protobuf type {@code EnnMonitorAlarmTicketTransformState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorAlarmTicketTransformState)
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketTransformState_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketTransformState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState.class, enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState.Builder.class);
    }

    // Construct using enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState.newBuilder()
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
      ticketKey_ = "";

      ticketTransformState_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketParameter.internal_static_EnnMonitorAlarmTicketTransformState_descriptor;
    }

    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState getDefaultInstanceForType() {
      return enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState.getDefaultInstance();
    }

    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState build() {
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState buildPartial() {
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState result = new enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState(this);
      result.ticketKey_ = ticketKey_;
      result.ticketTransformState_ = ticketTransformState_;
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
      if (other instanceof enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState) {
        return mergeFrom((enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState other) {
      if (other == enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState.getDefaultInstance()) return this;
      if (!other.getTicketKey().isEmpty()) {
        ticketKey_ = other.ticketKey_;
        onChanged();
      }
      if (other.ticketTransformState_ != 0) {
        setTicketTransformStateValue(other.getTicketTransformStateValue());
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
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object ticketKey_ = "";
    /**
     * <code>optional string ticketKey = 1;</code>
     */
    public java.lang.String getTicketKey() {
      java.lang.Object ref = ticketKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ticketKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string ticketKey = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTicketKeyBytes() {
      java.lang.Object ref = ticketKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        ticketKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string ticketKey = 1;</code>
     */
    public Builder setTicketKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      ticketKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string ticketKey = 1;</code>
     */
    public Builder clearTicketKey() {
      
      ticketKey_ = getDefaultInstance().getTicketKey();
      onChanged();
      return this;
    }
    /**
     * <code>optional string ticketKey = 1;</code>
     */
    public Builder setTicketKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      ticketKey_ = value;
      onChanged();
      return this;
    }

    private int ticketTransformState_ = 0;
    /**
     * <code>optional .EnnMonitorAlarmTicketTransformStateEnum ticketTransformState = 2;</code>
     */
    public int getTicketTransformStateValue() {
      return ticketTransformState_;
    }
    /**
     * <code>optional .EnnMonitorAlarmTicketTransformStateEnum ticketTransformState = 2;</code>
     */
    public Builder setTicketTransformStateValue(int value) {
      ticketTransformState_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .EnnMonitorAlarmTicketTransformStateEnum ticketTransformState = 2;</code>
     */
    public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum getTicketTransformState() {
      enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum result = enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum.valueOf(ticketTransformState_);
      return result == null ? enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .EnnMonitorAlarmTicketTransformStateEnum ticketTransformState = 2;</code>
     */
    public Builder setTicketTransformState(enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformStateEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      ticketTransformState_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .EnnMonitorAlarmTicketTransformStateEnum ticketTransformState = 2;</code>
     */
    public Builder clearTicketTransformState() {
      
      ticketTransformState_ = 0;
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorAlarmTicketTransformState)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorAlarmTicketTransformState)
  private static final enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState();
  }

  public static enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorAlarmTicketTransformState>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorAlarmTicketTransformState>() {
    public EnnMonitorAlarmTicketTransformState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorAlarmTicketTransformState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorAlarmTicketTransformState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorAlarmTicketTransformState> getParserForType() {
    return PARSER;
  }

  public enn.monitor.alarm.ticket.parameter.EnnMonitorAlarmTicketTransformState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

