package com.daaw;

/* JADX INFO: renamed from: com.daaw.dK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3959dK0 {
    public static final C3680cK0 a(float f, float f2, float f3, float f4, float f5, float f6) {
        long jA = AbstractC2895Ys.a(f5, f6);
        return new C3680cK0(f, f2, f3, f4, jA, jA, jA, jA, null);
    }

    public static final C3680cK0 b(C3103aF0 c3103aF0, long j, long j2, long j3, long j4) {
        G10.g(c3103aF0, "rect");
        return new C3680cK0(c3103aF0.f(), c3103aF0.i(), c3103aF0.g(), c3103aF0.c(), j, j2, j3, j4, null);
    }

    public static final C3680cK0 c(float f, float f2, float f3, float f4, long j) {
        return a(f, f2, f3, f4, AbstractC2791Xs.d(j), AbstractC2791Xs.e(j));
    }

    public static final boolean d(C3680cK0 c3680cK0) {
        G10.g(c3680cK0, "<this>");
        return AbstractC2791Xs.d(c3680cK0.h()) == AbstractC2791Xs.e(c3680cK0.h()) && AbstractC2791Xs.d(c3680cK0.h()) == AbstractC2791Xs.d(c3680cK0.i()) && AbstractC2791Xs.d(c3680cK0.h()) == AbstractC2791Xs.e(c3680cK0.i()) && AbstractC2791Xs.d(c3680cK0.h()) == AbstractC2791Xs.d(c3680cK0.c()) && AbstractC2791Xs.d(c3680cK0.h()) == AbstractC2791Xs.e(c3680cK0.c()) && AbstractC2791Xs.d(c3680cK0.h()) == AbstractC2791Xs.d(c3680cK0.b()) && AbstractC2791Xs.d(c3680cK0.h()) == AbstractC2791Xs.e(c3680cK0.b());
    }
}
