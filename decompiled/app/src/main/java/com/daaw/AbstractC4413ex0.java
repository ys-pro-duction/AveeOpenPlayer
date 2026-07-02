package com.daaw;

/* JADX INFO: renamed from: com.daaw.ex0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4413ex0 {
    public static final boolean a(C7223ox0 c7223ox0) {
        G10.g(c7223ox0, "<this>");
        return (c7223ox0.l() || c7223ox0.i() || !c7223ox0.g()) ? false : true;
    }

    public static final boolean b(C7223ox0 c7223ox0) {
        G10.g(c7223ox0, "<this>");
        return !c7223ox0.i() && c7223ox0.g();
    }

    public static final boolean c(C7223ox0 c7223ox0) {
        G10.g(c7223ox0, "<this>");
        return (c7223ox0.l() || !c7223ox0.i() || c7223ox0.g()) ? false : true;
    }

    public static final boolean d(C7223ox0 c7223ox0) {
        G10.g(c7223ox0, "<this>");
        return c7223ox0.i() && !c7223ox0.g();
    }

    public static final boolean e(C7223ox0 c7223ox0, long j) {
        G10.g(c7223ox0, "$this$isOutOfBounds");
        long jF = c7223ox0.f();
        float fL = C9982yp0.l(jF);
        float fM = C9982yp0.m(jF);
        return fL < 0.0f || fL > ((float) I00.g(j)) || fM < 0.0f || fM > ((float) I00.f(j));
    }

    public static final boolean f(C7223ox0 c7223ox0, long j, long j2) {
        G10.g(c7223ox0, "$this$isOutOfBounds");
        if (!AbstractC10298zx0.g(c7223ox0.j(), AbstractC10298zx0.a.d())) {
            return e(c7223ox0, j);
        }
        long jF = c7223ox0.f();
        float fL = C9982yp0.l(jF);
        float fM = C9982yp0.m(jF);
        return fL < (-C9879yT0.i(j2)) || fL > ((float) I00.g(j)) + C9879yT0.i(j2) || fM < (-C9879yT0.g(j2)) || fM > ((float) I00.f(j)) + C9879yT0.g(j2);
    }

    public static final long g(C7223ox0 c7223ox0) {
        G10.g(c7223ox0, "<this>");
        return i(c7223ox0, false);
    }

    public static final long h(C7223ox0 c7223ox0) {
        G10.g(c7223ox0, "<this>");
        return i(c7223ox0, true);
    }

    public static final long i(C7223ox0 c7223ox0, boolean z) {
        return (z || !c7223ox0.l()) ? C9982yp0.p(c7223ox0.f(), c7223ox0.h()) : C9982yp0.b.c();
    }

    public static final boolean j(C7223ox0 c7223ox0) {
        G10.g(c7223ox0, "<this>");
        return !C9982yp0.i(i(c7223ox0, true), C9982yp0.b.c());
    }
}
