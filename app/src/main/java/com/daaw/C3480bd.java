package com.daaw;

import com.daaw.AbstractC0516Cd0;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3480bd extends AbstractC0516Cd0 {
    public final long a;
    public final Integer b;
    public final long c;
    public final byte[] d;
    public final String e;
    public final long f;
    public final AbstractC0348An0 g;

    /* JADX INFO: renamed from: com.daaw.bd$b */
    public static final class b extends AbstractC0516Cd0.a {
        public Long a;
        public Integer b;
        public Long c;
        public byte[] d;
        public String e;
        public Long f;
        public AbstractC0348An0 g;

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0 a() {
            String str = "";
            if (this.a == null) {
                str = " eventTimeMs";
            }
            if (this.c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C3480bd(this.a.longValue(), this.b, this.c.longValue(), this.d, this.e, this.f.longValue(), this.g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0.a b(Integer num) {
            this.b = num;
            return this;
        }

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0.a c(long j) {
            this.a = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0.a d(long j) {
            this.c = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0.a e(AbstractC0348An0 abstractC0348An0) {
            this.g = abstractC0348An0;
            return this;
        }

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0.a f(byte[] bArr) {
            this.d = bArr;
            return this;
        }

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0.a g(String str) {
            this.e = str;
            return this;
        }

        @Override // com.daaw.AbstractC0516Cd0.a
        public AbstractC0516Cd0.a h(long j) {
            this.f = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.AbstractC0516Cd0
    public Integer b() {
        return this.b;
    }

    @Override // com.daaw.AbstractC0516Cd0
    public long c() {
        return this.a;
    }

    @Override // com.daaw.AbstractC0516Cd0
    public long d() {
        return this.c;
    }

    @Override // com.daaw.AbstractC0516Cd0
    public AbstractC0348An0 e() {
        return this.g;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        AbstractC0348An0 abstractC0348An0;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0516Cd0) {
            AbstractC0516Cd0 abstractC0516Cd0 = (AbstractC0516Cd0) obj;
            if (this.a == abstractC0516Cd0.c() && ((num = this.b) != null ? num.equals(abstractC0516Cd0.b()) : abstractC0516Cd0.b() == null) && this.c == abstractC0516Cd0.d()) {
                if (Arrays.equals(this.d, abstractC0516Cd0 instanceof C3480bd ? ((C3480bd) abstractC0516Cd0).d : abstractC0516Cd0.f()) && ((str = this.e) != null ? str.equals(abstractC0516Cd0.g()) : abstractC0516Cd0.g() == null) && this.f == abstractC0516Cd0.h() && ((abstractC0348An0 = this.g) != null ? abstractC0348An0.equals(abstractC0516Cd0.e()) : abstractC0516Cd0.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC0516Cd0
    public byte[] f() {
        return this.d;
    }

    @Override // com.daaw.AbstractC0516Cd0
    public String g() {
        return this.e;
    }

    @Override // com.daaw.AbstractC0516Cd0
    public long h() {
        return this.f;
    }

    public int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.b;
        int iHashCode = num == null ? 0 : num.hashCode();
        long j2 = this.c;
        int iHashCode2 = (((((i ^ iHashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.d)) * 1000003;
        String str = this.e;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f;
        int i2 = (((iHashCode2 ^ iHashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        AbstractC0348An0 abstractC0348An0 = this.g;
        return i2 ^ (abstractC0348An0 != null ? abstractC0348An0.hashCode() : 0);
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.a + ", eventCode=" + this.b + ", eventUptimeMs=" + this.c + ", sourceExtension=" + Arrays.toString(this.d) + ", sourceExtensionJsonProto3=" + this.e + ", timezoneOffsetSeconds=" + this.f + ", networkConnectionInfo=" + this.g + "}";
    }

    public C3480bd(long j, Integer num, long j2, byte[] bArr, String str, long j3, AbstractC0348An0 abstractC0348An0) {
        this.a = j;
        this.b = num;
        this.c = j2;
        this.d = bArr;
        this.e = str;
        this.f = j3;
        this.g = abstractC0348An0;
    }
}
