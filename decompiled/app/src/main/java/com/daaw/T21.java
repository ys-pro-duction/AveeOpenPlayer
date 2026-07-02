package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class T21 {
    public static final long a(float f, long j) {
        return f(j, f);
    }

    public static final long b(double d) {
        return f(4294967296L, (float) d);
    }

    public static final long c(float f) {
        return f(4294967296L, f);
    }

    public static final long d(int i) {
        return f(4294967296L, i);
    }

    public static final boolean e(long j) {
        return S21.f(j) == 0;
    }

    public static final long f(long j, float f) {
        return S21.c(j | (((long) Float.floatToIntBits(f)) & 4294967295L));
    }
}
