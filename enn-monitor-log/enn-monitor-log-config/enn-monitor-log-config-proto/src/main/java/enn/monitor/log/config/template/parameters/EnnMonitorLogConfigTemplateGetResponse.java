// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/logTemplateParameters.proto

package enn.monitor.log.config.template.parameters;

/**
 * Protobuf type {@code EnnMonitorLogConfigTemplateGetResponse}
 */
public  final class EnnMonitorLogConfigTemplateGetResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogConfigTemplateGetResponse)
    EnnMonitorLogConfigTemplateGetResponseOrBuilder {
  // Use EnnMonitorLogConfigTemplateGetResponse.newBuilder() to construct.
  private EnnMonitorLogConfigTemplateGetResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogConfigTemplateGetResponse() {
    isSuccess_ = false;
    templateTable_ = java.util.Collections.emptyList();
    error_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogConfigTemplateGetResponse(
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
              templateTable_ = new java.util.ArrayList<enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable>();
              mutable_bitField0_ |= 0x00000002;
            }
            templateTable_.add(
                input.readMessage(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.parser(), extensionRegistry));
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
        templateTable_ = java.util.Collections.unmodifiableList(templateTable_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetResponse_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse.class, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse.Builder.class);
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

  public static final int TEMPLATETABLE_FIELD_NUMBER = 2;
  private java.util.List<enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable> templateTable_;
  /**
   * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
   */
  public java.util.List<enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable> getTemplateTableList() {
    return templateTable_;
  }
  /**
   * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
   */
  public java.util.List<? extends enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTableOrBuilder> 
      getTemplateTableOrBuilderList() {
    return templateTable_;
  }
  /**
   * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
   */
  public int getTemplateTableCount() {
    return templateTable_.size();
  }
  /**
   * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
   */
  public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable getTemplateTable(int index) {
    return templateTable_.get(index);
  }
  /**
   * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
   */
  public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTableOrBuilder getTemplateTableOrBuilder(
      int index) {
    return templateTable_.get(index);
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
    for (int i = 0; i < templateTable_.size(); i++) {
      output.writeMessage(2, templateTable_.get(i));
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
    for (int i = 0; i < templateTable_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, templateTable_.get(i));
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
    if (!(obj instanceof enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse)) {
      return super.equals(obj);
    }
    enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse other = (enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse) obj;

    boolean result = true;
    result = result && (getIsSuccess()
        == other.getIsSuccess());
    result = result && getTemplateTableList()
        .equals(other.getTemplateTableList());
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
    if (getTemplateTableCount() > 0) {
      hash = (37 * hash) + TEMPLATETABLE_FIELD_NUMBER;
      hash = (53 * hash) + getTemplateTableList().hashCode();
    }
    hash = (37 * hash) + ERROR_FIELD_NUMBER;
    hash = (53 * hash) + getError().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse prototype) {
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
   * Protobuf type {@code EnnMonitorLogConfigTemplateGetResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogConfigTemplateGetResponse)
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetResponse_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse.class, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse.Builder.class);
    }

    // Construct using enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse.newBuilder()
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
        getTemplateTableFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      isSuccess_ = false;

      if (templateTableBuilder_ == null) {
        templateTable_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
      } else {
        templateTableBuilder_.clear();
      }
      error_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateParameters.internal_static_EnnMonitorLogConfigTemplateGetResponse_descriptor;
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse getDefaultInstanceForType() {
      return enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse.getDefaultInstance();
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse build() {
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse buildPartial() {
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse result = new enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse(this);
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      result.isSuccess_ = isSuccess_;
      if (templateTableBuilder_ == null) {
        if (((bitField0_ & 0x00000002) == 0x00000002)) {
          templateTable_ = java.util.Collections.unmodifiableList(templateTable_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.templateTable_ = templateTable_;
      } else {
        result.templateTable_ = templateTableBuilder_.build();
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
      if (other instanceof enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse) {
        return mergeFrom((enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse other) {
      if (other == enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse.getDefaultInstance()) return this;
      if (other.getIsSuccess() != false) {
        setIsSuccess(other.getIsSuccess());
      }
      if (templateTableBuilder_ == null) {
        if (!other.templateTable_.isEmpty()) {
          if (templateTable_.isEmpty()) {
            templateTable_ = other.templateTable_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureTemplateTableIsMutable();
            templateTable_.addAll(other.templateTable_);
          }
          onChanged();
        }
      } else {
        if (!other.templateTable_.isEmpty()) {
          if (templateTableBuilder_.isEmpty()) {
            templateTableBuilder_.dispose();
            templateTableBuilder_ = null;
            templateTable_ = other.templateTable_;
            bitField0_ = (bitField0_ & ~0x00000002);
            templateTableBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getTemplateTableFieldBuilder() : null;
          } else {
            templateTableBuilder_.addAllMessages(other.templateTable_);
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
      enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse) e.getUnfinishedMessage();
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

    private java.util.List<enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable> templateTable_ =
      java.util.Collections.emptyList();
    private void ensureTemplateTableIsMutable() {
      if (!((bitField0_ & 0x00000002) == 0x00000002)) {
        templateTable_ = new java.util.ArrayList<enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable>(templateTable_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTableOrBuilder> templateTableBuilder_;

    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public java.util.List<enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable> getTemplateTableList() {
      if (templateTableBuilder_ == null) {
        return java.util.Collections.unmodifiableList(templateTable_);
      } else {
        return templateTableBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public int getTemplateTableCount() {
      if (templateTableBuilder_ == null) {
        return templateTable_.size();
      } else {
        return templateTableBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable getTemplateTable(int index) {
      if (templateTableBuilder_ == null) {
        return templateTable_.get(index);
      } else {
        return templateTableBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder setTemplateTable(
        int index, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable value) {
      if (templateTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplateTableIsMutable();
        templateTable_.set(index, value);
        onChanged();
      } else {
        templateTableBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder setTemplateTable(
        int index, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder builderForValue) {
      if (templateTableBuilder_ == null) {
        ensureTemplateTableIsMutable();
        templateTable_.set(index, builderForValue.build());
        onChanged();
      } else {
        templateTableBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder addTemplateTable(enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable value) {
      if (templateTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplateTableIsMutable();
        templateTable_.add(value);
        onChanged();
      } else {
        templateTableBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder addTemplateTable(
        int index, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable value) {
      if (templateTableBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureTemplateTableIsMutable();
        templateTable_.add(index, value);
        onChanged();
      } else {
        templateTableBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder addTemplateTable(
        enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder builderForValue) {
      if (templateTableBuilder_ == null) {
        ensureTemplateTableIsMutable();
        templateTable_.add(builderForValue.build());
        onChanged();
      } else {
        templateTableBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder addTemplateTable(
        int index, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder builderForValue) {
      if (templateTableBuilder_ == null) {
        ensureTemplateTableIsMutable();
        templateTable_.add(index, builderForValue.build());
        onChanged();
      } else {
        templateTableBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder addAllTemplateTable(
        java.lang.Iterable<? extends enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable> values) {
      if (templateTableBuilder_ == null) {
        ensureTemplateTableIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, templateTable_);
        onChanged();
      } else {
        templateTableBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder clearTemplateTable() {
      if (templateTableBuilder_ == null) {
        templateTable_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        templateTableBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public Builder removeTemplateTable(int index) {
      if (templateTableBuilder_ == null) {
        ensureTemplateTableIsMutable();
        templateTable_.remove(index);
        onChanged();
      } else {
        templateTableBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder getTemplateTableBuilder(
        int index) {
      return getTemplateTableFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTableOrBuilder getTemplateTableOrBuilder(
        int index) {
      if (templateTableBuilder_ == null) {
        return templateTable_.get(index);  } else {
        return templateTableBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public java.util.List<? extends enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTableOrBuilder> 
         getTemplateTableOrBuilderList() {
      if (templateTableBuilder_ != null) {
        return templateTableBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(templateTable_);
      }
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder addTemplateTableBuilder() {
      return getTemplateTableFieldBuilder().addBuilder(
          enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder addTemplateTableBuilder(
        int index) {
      return getTemplateTableFieldBuilder().addBuilder(
          index, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.getDefaultInstance());
    }
    /**
     * <code>repeated .EnnMonitorLogConfigTemplateTable templateTable = 2;</code>
     */
    public java.util.List<enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder> 
         getTemplateTableBuilderList() {
      return getTemplateTableFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTableOrBuilder> 
        getTemplateTableFieldBuilder() {
      if (templateTableBuilder_ == null) {
        templateTableBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTable.Builder, enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateTableOrBuilder>(
                templateTable_,
                ((bitField0_ & 0x00000002) == 0x00000002),
                getParentForChildren(),
                isClean());
        templateTable_ = null;
      }
      return templateTableBuilder_;
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogConfigTemplateGetResponse)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogConfigTemplateGetResponse)
  private static final enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse();
  }

  public static enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetResponse>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogConfigTemplateGetResponse>() {
    public EnnMonitorLogConfigTemplateGetResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogConfigTemplateGetResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogConfigTemplateGetResponse> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.config.template.parameters.EnnMonitorLogConfigTemplateGetResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

