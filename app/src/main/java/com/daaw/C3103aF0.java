package com.daaw;

/* JADX INFO: renamed from: com.daaw.aF0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3103aF0 {
    public static final a e = new a(null);
    public static final C3103aF0 f = new C3103aF0(0.0f, 0.0f, 0.0f, 0.0f);
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    /* JADX INFO: renamed from: com.daaw.aF0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final C3103aF0 a() {
            return C3103aF0.f;
        }

        public a() {
        }
    }

    public C3103aF0(float f2, float f3, float f4, float f5) {
        this.a = f2;
        this.b = f3;
        this.c = f4;
        this.d = f5;
    }

    public final boolean b(long j) {
        return C9982yp0.l(j) >= this.a && C9982yp0.l(j) < this.c && C9982yp0.m(j) >= this.b && C9982yp0.m(j) < this.d;
    }

    public final float c() {
        return this.d;
    }

    public final long d() {
        return AbstractC0460Bp0.a(this.a + (j() / 2.0f), this.b + (e() / 2.0f));
    }

    public final float e() {
        return this.d - this.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3103aF0)) {
            return false;
        }
        C3103aF0 c3103aF0 = (C3103aF0) obj;
        return G10.c(Float.valueOf(this.a), Float.valueOf(c3103aF0.a)) && G10.c(Float.valueOf(this.b), Float.valueOf(c3103aF0.b)) && G10.c(Float.valueOf(this.c), Float.valueOf(c3103aF0.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(c3103aF0.d));
    }

    public final float f() {
        return this.a;
    }

    public final float g() {
        return this.c;
    }

    public final long h() {
        return BT0.a(j(), e());
    }

    public int hashCode() {
        return (((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d);
    }

    public final float i() {
        return this.b;
    }

    public final float j() {
        return this.c - this.a;
    }

    public final C3103aF0 k(C3103aF0 c3103aF0) {
        G10.g(c3103aF0, "other");
        return new C3103aF0(Math.max(this.a, c3103aF0.a), Math.max(this.b, c3103aF0.b), Math.min(this.c, c3103aF0.c), Math.min(this.d, c3103aF0.d));
    }

    public final boolean l(C3103aF0 c3103aF0) {
        G10.g(c3103aF0, "other");
        return this.c > c3103aF0.a && c3103aF0.c > this.a && this.d > c3103aF0.b && c3103aF0.d > this.b;
    }

    public final C3103aF0 m(float f2, float f3) {
        return new C3103aF0(this.a + f2, this.b + f3, this.c + f2, this.d + f3);
    }

    public final C3103aF0 n(long j) {
        return new C3103aF0(this.a + C9982yp0.l(j), this.b + C9982yp0.m(j), this.c + C9982yp0.l(j), this.d + C9982yp0.m(j));
    }

    public String toString() {
        return "Rect.fromLTRB(" + AbstractC8472tS.a(this.a, 1) + ", " + AbstractC8472tS.a(this.b, 1) + ", " + AbstractC8472tS.a(this.c, 1) + ", " + AbstractC8472tS.a(this.d, 1) + ')';
    }
}
