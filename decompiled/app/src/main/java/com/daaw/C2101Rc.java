package com.daaw;

import com.daaw.YH;

/* JADX INFO: renamed from: com.daaw.Rc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2101Rc extends YH {
    public final long b;
    public final int c;
    public final int d;
    public final long e;
    public final int f;

    /* JADX INFO: renamed from: com.daaw.Rc$b */
    public static final class b extends YH.a {
        public Long a;
        public Integer b;
        public Integer c;
        public Long d;
        public Integer e;

        @Override // com.daaw.YH.a
        public YH a() {
            String str = "";
            if (this.a == null) {
                str = " maxStorageSizeInBytes";
            }
            if (this.b == null) {
                str = str + " loadBatchSize";
            }
            if (this.c == null) {
                str = str + " criticalSectionEnterTimeoutMs";
            }
            if (this.d == null) {
                str = str + " eventCleanUpAge";
            }
            if (this.e == null) {
                str = str + " maxBlobByteSizePerRow";
            }
            if (str.isEmpty()) {
                return new C2101Rc(this.a.longValue(), this.b.intValue(), this.c.intValue(), this.d.longValue(), this.e.intValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.YH.a
        public YH.a b(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.YH.a
        public YH.a c(long j) {
            this.d = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.YH.a
        public YH.a d(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.YH.a
        public YH.a e(int i) {
            this.e = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.YH.a
        public YH.a f(long j) {
            this.a = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.YH
    public int b() {
        return this.d;
    }

    @Override // com.daaw.YH
    public long c() {
        return this.e;
    }

    @Override // com.daaw.YH
    public int d() {
        return this.c;
    }

    @Override // com.daaw.YH
    public int e() {
        return this.f;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof YH) {
            YH yh = (YH) obj;
            if (this.b == yh.f() && this.c == yh.d() && this.d == yh.b() && this.e == yh.c() && this.f == yh.e()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.daaw.YH
    public long f() {
        return this.b;
    }

    public int hashCode() {
        long j = this.b;
        int i = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ this.c) * 1000003) ^ this.d) * 1000003;
        long j2 = this.e;
        return this.f ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public String toString() {
        return "EventStoreConfig{maxStorageSizeInBytes=" + this.b + ", loadBatchSize=" + this.c + ", criticalSectionEnterTimeoutMs=" + this.d + ", eventCleanUpAge=" + this.e + ", maxBlobByteSizePerRow=" + this.f + "}";
    }

    public C2101Rc(long j, int i, int i2, long j2, int i3) {
        this.b = j;
        this.c = i;
        this.d = i2;
        this.e = j2;
        this.f = i3;
    }
}
