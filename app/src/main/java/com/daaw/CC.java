package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class CC {
    public static final int a(long j, long j2) {
        boolean zD = d(j);
        return zD != d(j2) ? zD ? -1 : 1 : (int) Math.signum(c(j) - c(j2));
    }

    public static final float c(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final boolean d(long j) {
        return ((int) (j & 4294967295L)) != 0;
    }

    public static long b(long j) {
        return j;
    }
}
