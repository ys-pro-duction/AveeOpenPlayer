package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class BT0 {
    public static final long a(float f, float f2) {
        return C9879yT0.d((((long) Float.floatToIntBits(f2)) & 4294967295L) | (Float.floatToIntBits(f) << 32));
    }

    public static final long b(long j) {
        return AbstractC0460Bp0.a(C9879yT0.i(j) / 2.0f, C9879yT0.g(j) / 2.0f);
    }

    public static final C3103aF0 c(long j) {
        return AbstractC3939dF0.a(C9982yp0.b.c(), j);
    }
}
