package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class H32 {
    public static final String h = Integer.toString(0, 36);
    public static final String i = Integer.toString(1, 36);
    public static final String j = Integer.toString(2, 36);
    public static final String k = Integer.toString(3, 36);
    public static final String l = Integer.toString(4, 36);
    public static final InterfaceC9666xh3 m = new InterfaceC9666xh3() { // from class: com.daaw.d32
    };
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public B82 g = B82.e;

    public final int a(int i2) {
        return this.g.a(i2).b;
    }

    public final int b() {
        int i2 = this.g.a;
        return 0;
    }

    public final int c(long j2) {
        return -1;
    }

    public final int d(long j2) {
        this.g.b(-1);
        return -1;
    }

    public final int e(int i2) {
        return this.g.a(i2).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && H32.class.equals(obj.getClass())) {
            H32 h32 = (H32) obj;
            if (AbstractC9004vJ2.e(this.a, h32.a) && AbstractC9004vJ2.e(this.b, h32.b) && this.c == h32.c && this.d == h32.d && this.f == h32.f && AbstractC9004vJ2.e(this.g, h32.g)) {
                return true;
            }
        }
        return false;
    }

    public final int f(int i2, int i3) {
        return this.g.a(i2).a(i3);
    }

    public final int g() {
        int i2 = this.g.c;
        return 0;
    }

    public final long h(int i2, int i3) {
        CS1 cs1A = this.g.a(i2);
        if (cs1A.b != -1) {
            return cs1A.e[i3];
        }
        return -9223372036854775807L;
    }

    public final int hashCode() {
        Object obj = this.a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.b;
        int iHashCode2 = ((((iHashCode + 217) * 31) + (obj2 != null ? obj2.hashCode() : 0)) * 31) + this.c;
        long j2 = this.d;
        return (((((iHashCode2 * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 961) + (this.f ? 1 : 0)) * 31) + this.g.hashCode();
    }

    public final long i(int i2) {
        long j2 = this.g.a(i2).a;
        return 0L;
    }

    public final long j() {
        long j2 = this.g.b;
        return 0L;
    }

    public final long k(int i2) {
        long j2 = this.g.a(i2).f;
        return 0L;
    }

    public final H32 l(Object obj, Object obj2, int i2, long j2, long j3, B82 b82, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i2;
        this.d = j2;
        this.e = 0L;
        this.g = b82;
        this.f = z;
        return this;
    }

    public final boolean m(int i2) {
        b();
        if (i2 != -1) {
            return false;
        }
        this.g.b(-1);
        return false;
    }

    public final boolean n(int i2) {
        boolean z = this.g.a(i2).g;
        return false;
    }
}
