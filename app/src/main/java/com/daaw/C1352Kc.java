package com.daaw;

import com.daaw.AbstractC1316Jt;

/* JADX INFO: renamed from: com.daaw.Kc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1352Kc extends AbstractC1316Jt.e.d.c {
    public final Double a;
    public final int b;
    public final boolean c;
    public final int d;
    public final long e;
    public final long f;

    /* JADX INFO: renamed from: com.daaw.Kc$b */
    public static final class b extends AbstractC1316Jt.e.d.c.a {
        public Double a;
        public Integer b;
        public Boolean c;
        public Integer d;
        public Long e;
        public Long f;

        @Override // com.daaw.AbstractC1316Jt.e.d.c.a
        public AbstractC1316Jt.e.d.c a() {
            String str = "";
            if (this.b == null) {
                str = " batteryVelocity";
            }
            if (this.c == null) {
                str = str + " proximityOn";
            }
            if (this.d == null) {
                str = str + " orientation";
            }
            if (this.e == null) {
                str = str + " ramUsed";
            }
            if (this.f == null) {
                str = str + " diskUsed";
            }
            if (str.isEmpty()) {
                return new C1352Kc(this.a, this.b.intValue(), this.c.booleanValue(), this.d.intValue(), this.e.longValue(), this.f.longValue());
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.c.a
        public AbstractC1316Jt.e.d.c.a b(Double d) {
            this.a = d;
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.c.a
        public AbstractC1316Jt.e.d.c.a c(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.c.a
        public AbstractC1316Jt.e.d.c.a d(long j) {
            this.f = Long.valueOf(j);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.c.a
        public AbstractC1316Jt.e.d.c.a e(int i) {
            this.d = Integer.valueOf(i);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.c.a
        public AbstractC1316Jt.e.d.c.a f(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        @Override // com.daaw.AbstractC1316Jt.e.d.c.a
        public AbstractC1316Jt.e.d.c.a g(long j) {
            this.e = Long.valueOf(j);
            return this;
        }
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.c
    public Double b() {
        return this.a;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.c
    public int c() {
        return this.b;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.c
    public long d() {
        return this.f;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.c
    public int e() {
        return this.d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1316Jt.e.d.c) {
            AbstractC1316Jt.e.d.c cVar = (AbstractC1316Jt.e.d.c) obj;
            Double d = this.a;
            if (d != null ? d.equals(cVar.b()) : cVar.b() == null) {
                if (this.b == cVar.c() && this.c == cVar.g() && this.d == cVar.e() && this.e == cVar.f() && this.f == cVar.d()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.c
    public long f() {
        return this.e;
    }

    @Override // com.daaw.AbstractC1316Jt.e.d.c
    public boolean g() {
        return this.c;
    }

    public int hashCode() {
        Double d = this.a;
        int iHashCode = ((((((((d == null ? 0 : d.hashCode()) ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ this.d) * 1000003;
        long j = this.e;
        long j2 = this.f;
        return ((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "Device{batteryLevel=" + this.a + ", batteryVelocity=" + this.b + ", proximityOn=" + this.c + ", orientation=" + this.d + ", ramUsed=" + this.e + ", diskUsed=" + this.f + "}";
    }

    public C1352Kc(Double d, int i, boolean z, int i2, long j, long j2) {
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = i2;
        this.e = j;
        this.f = j2;
    }
}
