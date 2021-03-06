// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protobuf/clusterParameters.proto

package enn.monitor.config.cluster.parameters;

/**
 * <pre>
 * get cluster
 * </pre>
 *
 * Protobuf type {@code EnnMonitorConfigClusterGetRequest}
 */
public  final class EnnMonitorConfigClusterGetRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:EnnMonitorConfigClusterGetRequest)
    EnnMonitorConfigClusterGetRequestOrBuilder {
  // Use EnnMonitorConfigClusterGetRequest.newBuilder() to construct.
  private EnnMonitorConfigClusterGetRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EnnMonitorConfigClusterGetRequest() {
    id_ = 0L;
    status_ = 0;
    clusterName_ = "";
    createUser_ = "";
    lastUpdateUser_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private EnnMonitorConfigClusterGetRequest(
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
            int rawValue = input.readEnum();

            status_ = rawValue;
            break;
          }
          case 26: {
            java.lang.String s = input.readStringRequireUtf8();

            clusterName_ = s;
            break;
          }
          case 34: {
            java.lang.String s = input.readStringRequireUtf8();

            createUser_ = s;
            break;
          }
          case 42: {
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
    return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetRequest_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest.class, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_;
  /**
   * <code>optional uint64 id = 1;</code>
   */
  public long getId() {
    return id_;
  }

  public static final int STATUS_FIELD_NUMBER = 2;
  private int status_;
  /**
   * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
   */
  public int getStatusValue() {
    return status_;
  }
  /**
   * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
   */
  public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus getStatus() {
    enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus result = enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus.valueOf(status_);
    return result == null ? enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus.UNRECOGNIZED : result;
  }

  public static final int CLUSTERNAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object clusterName_;
  /**
   * <code>optional string clusterName = 3;</code>
   */
  public java.lang.String getClusterName() {
    java.lang.Object ref = clusterName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clusterName_ = s;
      return s;
    }
  }
  /**
   * <code>optional string clusterName = 3;</code>
   */
  public com.google.protobuf.ByteString
      getClusterNameBytes() {
    java.lang.Object ref = clusterName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clusterName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CREATEUSER_FIELD_NUMBER = 4;
  private volatile java.lang.Object createUser_;
  /**
   * <code>optional string createUser = 4;</code>
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
   * <code>optional string createUser = 4;</code>
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

  public static final int LASTUPDATEUSER_FIELD_NUMBER = 5;
  private volatile java.lang.Object lastUpdateUser_;
  /**
   * <code>optional string lastUpdateUser = 5;</code>
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
   * <code>optional string lastUpdateUser = 5;</code>
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
    if (status_ != enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus.ClusterDefault.getNumber()) {
      output.writeEnum(2, status_);
    }
    if (!getClusterNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, clusterName_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, createUser_);
    }
    if (!getLastUpdateUserBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, lastUpdateUser_);
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
    if (status_ != enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus.ClusterDefault.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, status_);
    }
    if (!getClusterNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, clusterName_);
    }
    if (!getCreateUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, createUser_);
    }
    if (!getLastUpdateUserBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, lastUpdateUser_);
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
    if (!(obj instanceof enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest)) {
      return super.equals(obj);
    }
    enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest other = (enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest) obj;

    boolean result = true;
    result = result && (getId()
        == other.getId());
    result = result && status_ == other.status_;
    result = result && getClusterName()
        .equals(other.getClusterName());
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
    hash = (37 * hash) + STATUS_FIELD_NUMBER;
    hash = (53 * hash) + status_;
    hash = (37 * hash) + CLUSTERNAME_FIELD_NUMBER;
    hash = (53 * hash) + getClusterName().hashCode();
    hash = (37 * hash) + CREATEUSER_FIELD_NUMBER;
    hash = (53 * hash) + getCreateUser().hashCode();
    hash = (37 * hash) + LASTUPDATEUSER_FIELD_NUMBER;
    hash = (53 * hash) + getLastUpdateUser().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parseFrom(
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
  public static Builder newBuilder(enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest prototype) {
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
   * get cluster
   * </pre>
   *
   * Protobuf type {@code EnnMonitorConfigClusterGetRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:EnnMonitorConfigClusterGetRequest)
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetRequest_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest.class, enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest.Builder.class);
    }

    // Construct using enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest.newBuilder()
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

      status_ = 0;

      clusterName_ = "";

      createUser_ = "";

      lastUpdateUser_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterParameters.internal_static_EnnMonitorConfigClusterGetRequest_descriptor;
    }

    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest getDefaultInstanceForType() {
      return enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest.getDefaultInstance();
    }

    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest build() {
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest buildPartial() {
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest result = new enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest(this);
      result.id_ = id_;
      result.status_ = status_;
      result.clusterName_ = clusterName_;
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
      if (other instanceof enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest) {
        return mergeFrom((enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest other) {
      if (other == enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.status_ != 0) {
        setStatusValue(other.getStatusValue());
      }
      if (!other.getClusterName().isEmpty()) {
        clusterName_ = other.clusterName_;
        onChanged();
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
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest) e.getUnfinishedMessage();
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

    private int status_ = 0;
    /**
     * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
     */
    public int getStatusValue() {
      return status_;
    }
    /**
     * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
     */
    public Builder setStatusValue(int value) {
      status_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
     */
    public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus getStatus() {
      enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus result = enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus.valueOf(status_);
      return result == null ? enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
     */
    public Builder setStatus(enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterStatus value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      status_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .EnnMonitorConfigClusterStatus status = 2;</code>
     */
    public Builder clearStatus() {
      
      status_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object clusterName_ = "";
    /**
     * <code>optional string clusterName = 3;</code>
     */
    public java.lang.String getClusterName() {
      java.lang.Object ref = clusterName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clusterName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string clusterName = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClusterNameBytes() {
      java.lang.Object ref = clusterName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clusterName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string clusterName = 3;</code>
     */
    public Builder setClusterName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clusterName_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string clusterName = 3;</code>
     */
    public Builder clearClusterName() {
      
      clusterName_ = getDefaultInstance().getClusterName();
      onChanged();
      return this;
    }
    /**
     * <code>optional string clusterName = 3;</code>
     */
    public Builder setClusterNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clusterName_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object createUser_ = "";
    /**
     * <code>optional string createUser = 4;</code>
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
     * <code>optional string createUser = 4;</code>
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
     * <code>optional string createUser = 4;</code>
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
     * <code>optional string createUser = 4;</code>
     */
    public Builder clearCreateUser() {
      
      createUser_ = getDefaultInstance().getCreateUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string createUser = 4;</code>
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
     * <code>optional string lastUpdateUser = 5;</code>
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
     * <code>optional string lastUpdateUser = 5;</code>
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
     * <code>optional string lastUpdateUser = 5;</code>
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
     * <code>optional string lastUpdateUser = 5;</code>
     */
    public Builder clearLastUpdateUser() {
      
      lastUpdateUser_ = getDefaultInstance().getLastUpdateUser();
      onChanged();
      return this;
    }
    /**
     * <code>optional string lastUpdateUser = 5;</code>
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


    // @@protoc_insertion_point(builder_scope:EnnMonitorConfigClusterGetRequest)
  }

  // @@protoc_insertion_point(class_scope:EnnMonitorConfigClusterGetRequest)
  private static final enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest();
  }

  public static enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EnnMonitorConfigClusterGetRequest>
      PARSER = new com.google.protobuf.AbstractParser<EnnMonitorConfigClusterGetRequest>() {
    public EnnMonitorConfigClusterGetRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new EnnMonitorConfigClusterGetRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<EnnMonitorConfigClusterGetRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EnnMonitorConfigClusterGetRequest> getParserForType() {
    return PARSER;
  }

  public enn.monitor.config.cluster.parameters.EnnMonitorConfigClusterGetRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

