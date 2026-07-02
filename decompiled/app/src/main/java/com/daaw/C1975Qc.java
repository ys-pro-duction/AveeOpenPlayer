package com.daaw;

import com.daaw.KH;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.Qc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1975Qc extends KH {
    public final String a;
    public final Integer b;
    public final C10105zG c;
    public final long d;
    public final long e;
    public final Map f;

    /* JADX INFO: renamed from: com.daaw.Qc$b */
    public static final class b extends KH.a {
        public String a;
        public Integer b;
        public C10105zG c;
        public Long d;
        public Long e;
        public Map f;

        @Override // com.daaw.KH.a
        public KH d() {
            String str = "";
            if (this.a == null) {
                str = " transportName";
            }
            if (this.c == null) {
                str = str + " encodedPayload";
            }
            if (this.d == null) {
                str = str + " eventMillis";
            }
            if (this.e == null) {
                str = str + " uptimeMillis";
            }
            if (this.f == null) {
                str = str + " autoMetadata";
            }
            if (str.isEmpty()) {
                return new C1975Qc(this.a, this.b, this.c, this.d.longValue(), this.e.longValue(), this.f);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.KH.a
        public Map e() {
            Map map = this.f;
            if (map != null) {
                return map;
            }
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }

        @Override // com.daaw.KH.a
        public KH.a f(Map map) {
            if (map == null) {
                throw new NullPointerException("Null autoMetadata");
            }
            this.f = map;
            return this;
        }

        @Override // com.daaw.KH.a
        public KH.a g(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.daaw.KH.a
        public KH.a h(C10105zG c10105zG) {
            if (c10105zG == null) {
                throw new NullPointerException("Null encodedPayload");
            }
            this.c = c10105zG;
            return this;
        }

        @Override // com.daaw.KH.a
        public KH.a i(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.KH.a
        public KH.a j(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.a = str;
            return this;
        }

        @Override // com.daaw.KH.a
        public KH.a k(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.KH
    public Map c() {
        return this.f;
    }

    @Override // com.daaw.KH
    public Integer d() {
        return this.b;
    }

    @Override // com.daaw.KH
    public C10105zG e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        Integer num;
        if (obj == this) {
            return true;
        }
        if (obj instanceof KH) {
            KH kh = (KH) obj;
            if (this.a.equals(kh.j()) && ((num = this.b) != null ? num.equals(kh.d()) : kh.d() == null) && this.c.equals(kh.e()) && this.d == kh.f() && this.e == kh.k() && this.f.equals(kh.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.KH
    public long f() {
        return this.d;
    }

    public int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode2 = (((iHashCode ^ (num == null ? 0 : num.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        int i = (iHashCode2 ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        long j2 = this.e;
        return ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.f.hashCode();
    }

    @Override // com.daaw.KH
    public String j() {
        return this.a;
    }

    @Override // com.daaw.KH
    public long k() {
        return this.e;
    }

    public String toString() {
        return "EventInternal{transportName=" + this.a + ", code=" + this.b + ", encodedPayload=" + this.c + ", eventMillis=" + this.d + ", uptimeMillis=" + this.e + ", autoMetadata=" + this.f + "}";
    }

    public C1975Qc(String str, Integer num, C10105zG c10105zG, long j, long j2, Map map) {
        this.a = str;
        this.b = num;
        this.c = c10105zG;
        this.d = j;
        this.e = j2;
        this.f = map;
    }
}
