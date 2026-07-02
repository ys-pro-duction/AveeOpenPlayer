package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class E00 {
    public static final long a(int i, int i2) {
        return D00.c((((long) i2) & 4294967295L) | (((long) i) << 32));
    }

    public static final long b(long j, long j2) {
        return AbstractC0460Bp0.a(C9982yp0.l(j) - D00.f(j2), C9982yp0.m(j) - D00.g(j2));
    }

    public static final long c(long j, long j2) {
        return AbstractC0460Bp0.a(C9982yp0.l(j) + D00.f(j2), C9982yp0.m(j) + D00.g(j2));
    }
}
