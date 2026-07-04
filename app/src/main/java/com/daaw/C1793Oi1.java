package com.daaw;

/* JADX INFO: renamed from: com.daaw.Oi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1793Oi1 {
    public static final String s = AbstractC1772Od0.f("WorkSpec");
    public static final InterfaceC6795nR t = new a();
    public String a;
    public EnumC9111vi1 b;
    public String c;
    public String d;
    public androidx.work.b e;
    public androidx.work.b f;
    public long g;
    public long h;
    public long i;
    public C6358lr j;
    public int k;
    public EnumC5167he l;
    public long m;
    public long n;
    public long o;
    public long p;
    public boolean q;
    public EnumC6638mr0 r;

    /* JADX INFO: renamed from: com.daaw.Oi1$a */
    public class a implements InterfaceC6795nR {
    }

    /* JADX INFO: renamed from: com.daaw.Oi1$b */
    public static class b {
        public String a;
        public EnumC9111vi1 b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.b != bVar.b) {
                return false;
            }
            return this.a.equals(bVar.a);
        }

        public int hashCode() {
            return (this.a.hashCode() * 31) + this.b.hashCode();
        }
    }

    public C1793Oi1(String str, String str2) {
        this.b = EnumC9111vi1.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = C6358lr.i;
        this.l = EnumC5167he.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = EnumC6638mr0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = str;
        this.c = str2;
    }

    public long a() {
        if (c()) {
            return this.n + Math.min(18000000L, this.l == EnumC5167he.LINEAR ? this.m * ((long) this.k) : (long) Math.scalb(this.m, this.k - 1));
        }
        if (!d()) {
            long jCurrentTimeMillis = this.n;
            if (jCurrentTimeMillis == 0) {
                jCurrentTimeMillis = System.currentTimeMillis();
            }
            return jCurrentTimeMillis + this.g;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        long j = this.n;
        long j2 = j == 0 ? jCurrentTimeMillis2 + this.g : j;
        long j3 = this.i;
        long j4 = this.h;
        if (j3 != j4) {
            return j2 + j4 + (j == 0 ? j3 * (-1) : 0L);
        }
        return j2 + (j != 0 ? j4 : 0L);
    }

    public boolean b() {
        return !C6358lr.i.equals(this.j);
    }

    public boolean c() {
        return this.b == EnumC9111vi1.ENQUEUED && this.k > 0;
    }

    public boolean d() {
        return this.h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1793Oi1.class == obj.getClass()) {
            C1793Oi1 c1793Oi1 = (C1793Oi1) obj;
            if (this.g != c1793Oi1.g || this.h != c1793Oi1.h || this.i != c1793Oi1.i || this.k != c1793Oi1.k || this.m != c1793Oi1.m || this.n != c1793Oi1.n || this.o != c1793Oi1.o || this.p != c1793Oi1.p || this.q != c1793Oi1.q || !this.a.equals(c1793Oi1.a) || this.b != c1793Oi1.b || !this.c.equals(c1793Oi1.c)) {
                return false;
            }
            String str = this.d;
            if (str == null ? c1793Oi1.d != null : !str.equals(c1793Oi1.d)) {
                return false;
            }
            if (this.e.equals(c1793Oi1.e) && this.f.equals(c1793Oi1.f) && this.j.equals(c1793Oi1.j) && this.l == c1793Oi1.l && this.r == c1793Oi1.r) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31;
        String str = this.d;
        int iHashCode2 = (((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31;
        long j = this.g;
        int i = (iHashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.h;
        int i2 = (i + ((int) (j2 ^ (j2 >>> 32)))) * 31;
        long j3 = this.i;
        int iHashCode3 = (((((((i2 + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.j.hashCode()) * 31) + this.k) * 31) + this.l.hashCode()) * 31;
        long j4 = this.m;
        int i3 = (iHashCode3 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
        long j5 = this.n;
        int i4 = (i3 + ((int) (j5 ^ (j5 >>> 32)))) * 31;
        long j6 = this.o;
        int i5 = (i4 + ((int) (j6 ^ (j6 >>> 32)))) * 31;
        long j7 = this.p;
        return ((((i5 + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.q ? 1 : 0)) * 31) + this.r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.a + "}";
    }

    public C1793Oi1(C1793Oi1 c1793Oi1) {
        this.b = EnumC9111vi1.ENQUEUED;
        androidx.work.b bVar = androidx.work.b.c;
        this.e = bVar;
        this.f = bVar;
        this.j = C6358lr.i;
        this.l = EnumC5167he.EXPONENTIAL;
        this.m = 30000L;
        this.p = -1L;
        this.r = EnumC6638mr0.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.a = c1793Oi1.a;
        this.c = c1793Oi1.c;
        this.b = c1793Oi1.b;
        this.d = c1793Oi1.d;
        this.e = new androidx.work.b(c1793Oi1.e);
        this.f = new androidx.work.b(c1793Oi1.f);
        this.g = c1793Oi1.g;
        this.h = c1793Oi1.h;
        this.i = c1793Oi1.i;
        this.j = new C6358lr(c1793Oi1.j);
        this.k = c1793Oi1.k;
        this.l = c1793Oi1.l;
        this.m = c1793Oi1.m;
        this.n = c1793Oi1.n;
        this.o = c1793Oi1.o;
        this.p = c1793Oi1.p;
        this.q = c1793Oi1.q;
        this.r = c1793Oi1.r;
    }
}
