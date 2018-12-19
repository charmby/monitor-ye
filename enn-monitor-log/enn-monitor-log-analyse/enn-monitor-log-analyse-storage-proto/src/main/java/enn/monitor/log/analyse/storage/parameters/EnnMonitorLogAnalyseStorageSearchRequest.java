// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/storageParameters.proto

package enn.monitor.log.analyse.storage.parameters;

/**
 * Protobuf type {@code EnnMonitorLogAnalyseStorageSearchRequest}
 */
public  final class EnnMonitorLogAnalyseStorageSearchRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorLogAnalyseStorageSearchRequest)
    EnnMonitorLogAnalyseStorageSearchRequestOrBuilder {
  // Use EnnMonitorLogAnalyseStorageSearchRequest.newBuilder() to construct.
  private EnnMonitorLogAnalyseStorageSearchRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorLogAnalyseStorageSearchRequest() {
    id_ = 0L;
    tokenId_ = 0L;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorLogAnalyseStorageSearchRequest(
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
          case 16: {

            tokenId_ = input.readUInt64();
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
    return enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageParameters.internal_static_EnnMonitorLogAnalyseStorageSearchRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageParameters.internal_static_EnnMonitorLogAnalyseStorageSearchRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest.class, enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int TOKENID_FIELD_NUMBER = 2;
  private long tokenId_;
  /**
   * <code>optional uint64 tokenId = 2;</code>
   */
  public long getTokenId() {
    return tokenId_;
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
    if (tokenId_ != 0L) {
      output.writeUInt64(2, tokenId_);
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
    if (tokenId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, tokenId_);
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
    if (!(obj instanceof enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest)) {
      return super.equals(obj);
    }
    enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest other = (enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && (getTokenId()
        == other.getTokenId());
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
    hash = (37 * hash) + TOKENID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTokenId());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest prototype) {
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
   * Protobuf type {@code EnnMonitorLogAnalyseStorageSearchRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorLogAnalyseStorageSearchRequest)
      enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageParameters.internal_static_EnnMonitorLogAnalyseStorageSearchRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageParameters.internal_static_EnnMonitorLogAnalyseStorageSearchRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest.class, enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest.Builder.class);
    }

    // Construct using enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest.newBuilder()
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

      tokenId_ = 0L;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageParameters.internal_static_EnnMonitorLogAnalyseStorageSearchRequest_descriptor;
    }

    public enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest getDefaultInstanceForType() {
      return enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest.getDefaultInstance();
    }

    public enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest build() {
      enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest buildPartial() {
      enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest result = new enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest(this);
      result.id_ = id_;
      result.tokenId_ = tokenId_;
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
      if (other instanceof enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest) {
        return mergeFrom((enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest other) {
      if (other == enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.getTokenId() != 0L) {
        setTokenId(other.getTokenId());
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
      enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest) e.getUnfinishedMessage();
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

    private long tokenId_ ;
    /**
     * <code>optional uint64 tokenId = 2;</code>
     */
    public long getTokenId() {
      return tokenId_;
    }
    /**
     * <code>optional uint64 tokenId = 2;</code>
     */
    public Builder setTokenId(long value) {
      
      tokenId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint64 tokenId = 2;</code>
     */
    public Builder clearTokenId() {
      
      tokenId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorLogAnalyseStorageSearchRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorLogAnalyseStorageSearchRequest)
  private static final enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest();
  }

  public static enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorLogAnalyseStorageSearchRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorLogAnalyseStorageSearchRequest>() {
    public EnnMonitorLogAnalyseStorageSearchRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorLogAnalyseStorageSearchRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorLogAnalyseStorageSearchRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorLogAnalyseStorageSearchRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.log.analyse.storage.parameters.EnnMonitorLogAnalyseStorageSearchRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
