package com.daaw;

/* JADX INFO: renamed from: com.daaw.cK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3680cK0 {
    public static final a i = new a(null);
    public static final C3680cK0 j = AbstractC3959dK0.c(0.0f, 0.0f, 0.0f, 0.0f, AbstractC2791Xs.a.a());
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;

    /* JADX INFO: renamed from: com.daaw.cK0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ C3680cK0(float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, f3, f4, j2, j3, j4, j5);
    }

    public final float a() {
        return this.d;
    }

    public final long b() {
        return this.h;
    }

    public final long c() {
        return this.g;
    }

    public final float d() {
        return this.d - this.b;
    }

    public final float e() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3680cK0)) {
            return false;
        }
        C3680cK0 c3680cK0 = (C3680cK0) obj;
        return G10.c(Float.valueOf(this.a), Float.valueOf(c3680cK0.a)) && G10.c(Float.valueOf(this.b), Float.valueOf(c3680cK0.b)) && G10.c(Float.valueOf(this.c), Float.valueOf(c3680cK0.c)) && G10.c(Float.valueOf(this.d), Float.valueOf(c3680cK0.d)) && AbstractC2791Xs.c(this.e, c3680cK0.e) && AbstractC2791Xs.c(this.f, c3680cK0.f) && AbstractC2791Xs.c(this.g, c3680cK0.g) && AbstractC2791Xs.c(this.h, c3680cK0.h);
    }

    public final float f() {
        return this.c;
    }

    public final float g() {
        return this.b;
    }

    public final long h() {
        return this.e;
    }

    public int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.a) * 31) + Float.floatToIntBits(this.b)) * 31) + Float.floatToIntBits(this.c)) * 31) + Float.floatToIntBits(this.d)) * 31) + AbstractC2791Xs.f(this.e)) * 31) + AbstractC2791Xs.f(this.f)) * 31) + AbstractC2791Xs.f(this.g)) * 31) + AbstractC2791Xs.f(this.h);
    }

    public final long i() {
        return this.f;
    }

    public final float j() {
        return this.c - this.a;
    }

    public String toString() {
        long j2 = this.e;
        long j3 = this.f;
        long j4 = this.g;
        long j5 = this.h;
        String str = AbstractC8472tS.a(this.a, 1) + ", " + AbstractC8472tS.a(this.b, 1) + ", " + AbstractC8472tS.a(this.c, 1) + ", " + AbstractC8472tS.a(this.d, 1);
        if (!AbstractC2791Xs.c(j2, j3) || !AbstractC2791Xs.c(j3, j4) || !AbstractC2791Xs.c(j4, j5)) {
            return "RoundRect(rect=" + str + ", topLeft=" + ((Object) AbstractC2791Xs.g(j2)) + ", topRight=" + ((Object) AbstractC2791Xs.g(j3)) + ", bottomRight=" + ((Object) AbstractC2791Xs.g(j4)) + ", bottomLeft=" + ((Object) AbstractC2791Xs.g(j5)) + ')';
        }
        if (AbstractC2791Xs.d(j2) == AbstractC2791Xs.e(j2)) {
            return "RoundRect(rect=" + str + ", radius=" + AbstractC8472tS.a(AbstractC2791Xs.d(j2), 1) + ')';
        }
        return "RoundRect(rect=" + str + ", x=" + AbstractC8472tS.a(AbstractC2791Xs.d(j2), 1) + ", y=" + AbstractC8472tS.a(AbstractC2791Xs.e(j2), 1) + ')';
    }

    public C3680cK0(float f, float f2, float f3, float f4, long j2, long j3, long j4, long j5) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = j2;
        this.f = j3;
        this.g = j4;
        this.h = j5;
    }
}
