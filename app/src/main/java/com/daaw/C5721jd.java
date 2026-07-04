package com.daaw;

import com.daaw.AbstractC9018vN0;
import java.util.Set;

/* JADX INFO: renamed from: com.daaw.jd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5721jd extends AbstractC9018vN0.b {
    public final long a;
    public final long b;
    public final Set c;

    /* JADX INFO: renamed from: com.daaw.jd$b */
    public static final class b extends AbstractC9018vN0.b.a {
        public Long a;
        public Long b;
        public Set c;

        @Override // com.daaw.AbstractC9018vN0.b.a
        public AbstractC9018vN0.b a() {
            String str = "";
            if (this.a == null) {
                str = " delta";
            }
            if (this.b == null) {
                str = str + " maxAllowedDelay";
            }
            if (this.c == null) {
                str = str + " flags";
            }
            if (str.isEmpty()) {
                return new C5721jd(this.a.longValue(), this.b.longValue(), this.c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC9018vN0.b.a
        public AbstractC9018vN0.b.a b(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC9018vN0.b.a
        public AbstractC9018vN0.b.a c(Set set) {
            if (set == null) {
                throw new NullPointerException("Null flags");
            }
            this.c = set;
            return this;
        }

        @Override // com.daaw.AbstractC9018vN0.b.a
        public AbstractC9018vN0.b.a d(long j) {
            this.b = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.AbstractC9018vN0.b
    public long b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC9018vN0.b
    public Set c() {
        return this.c;
    }

    @Override // com.daaw.AbstractC9018vN0.b
    public long d() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC9018vN0.b) {
            AbstractC9018vN0.b bVar = (AbstractC9018vN0.b) obj;
            if (this.a == bVar.b() && this.b == bVar.d() && this.c.equals(bVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return this.c.hashCode() ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "ConfigValue{delta=" + this.a + ", maxAllowedDelay=" + this.b + ", flags=" + this.c + "}";
    }

    public C5721jd(long j, long j2, Set set) {
        this.a = j;
        this.b = j2;
        this.c = set;
    }
}
