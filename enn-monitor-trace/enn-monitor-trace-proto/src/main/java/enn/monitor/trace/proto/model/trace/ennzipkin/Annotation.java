package enn.monitor.trace.proto.model.trace.ennzipkin;

import java.io.Serializable;

import enn.monitor.trace.proto.model.trace.ennzipkin.internal.JsonCodec;
import enn.monitor.trace.proto.model.trace.ennzipkin.internal.Nullable;


import static enn.monitor.trace.proto.model.trace.ennzipkin.internal.Util.UTF_8;
import static enn.monitor.trace.proto.model.trace.ennzipkin.internal.Util.checkNotNull;
import static enn.monitor.trace.proto.model.trace.ennzipkin.internal.Util.equal;

/**
 * Associates an event that explains latency with a timestamp.
 *
 * <p>Unlike log statements, annotations are often codes: Ex. {@link Constants#SERVER_RECV "sr"}.
 */
public final class Annotation implements Comparable<Annotation>, Serializable { // for Spark jobs
    private static final long serialVersionUID = 0L;

    public static Annotation create(long timestamp, String value, @Nullable Endpoint endpoint) {
        return new Annotation(timestamp, value, endpoint);
    }

    /**
     * Microseconds from epoch.
     *
     * <p>This value should be set directly by instrumentation, using the most precise value possible.
     * For example, {@code gettimeofday} or multiplying {@link System#currentTimeMillis} by 1000.
     */
    public final long timestamp;

    /**
     * Usually a short tag indicating an event, like {@link Constants#SERVER_RECV "sr"}. or {@link
     * Constants#ERROR "error"}
     */
    public final String value;

    /** The host that recorded {@link #value}, primarily for query by service name. */
    @Nullable
    public final Endpoint endpoint;

    Annotation(long timestamp, String value, @Nullable Endpoint endpoint) {
        this.timestamp = timestamp;
        this.value = checkNotNull(value, "value");
        this.endpoint = endpoint;
    }

    public Builder toBuilder(){
        return new Builder(this);
    }

    public static Builder builder(){
        return new Builder();
    }

    public static final class Builder {
        private Long timestamp;
        private String value;
        private Endpoint endpoint;

        Builder() {
        }

        Builder(Annotation source) {
            this.timestamp = source.timestamp;
            this.value = source.value;
            this.endpoint = source.endpoint;
        }

        /** @see Annotation#timestamp */
        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        /** @see Annotation#value */
        public Builder value(String value) {
            this.value = value;
            return this;
        }

        /** @see Annotation#endpoint */
        public Builder endpoint(Endpoint endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        public Annotation build() {
            return Annotation.create(timestamp, value, endpoint);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o instanceof Annotation) {
            Annotation that = (Annotation) o;
            return (this.timestamp == that.timestamp)
                    && (this.value.equals(that.value))
                    && equal(this.endpoint, that.endpoint);
        }
        return false;
    }

    @Override
    public int hashCode() {
        int h = 1;
        h *= 1000003;
        h ^= (int) (h ^ ((timestamp >>> 32) ^ timestamp));
        h *= 1000003;
        h ^= value.hashCode();
        h *= 1000003;
        h ^= (endpoint == null) ? 0 : endpoint.hashCode();
        return h;
    }

    /** Compares by {@link #timestamp}, then {@link #value}. */
    @Override
    public int compareTo(Annotation that) {
        if (this == that) return 0;
        int byTimestamp = timestamp < that.timestamp ? -1 : timestamp == that.timestamp ? 0 : 1;
        if (byTimestamp != 0) return byTimestamp;
        return value.compareTo(that.value);
    }

    @Override public String toString() {
        return new String(JsonCodec.writeAnnotation(this), UTF_8);
    }
}
