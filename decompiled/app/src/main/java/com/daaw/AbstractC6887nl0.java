package com.daaw;

/* JADX INFO: renamed from: com.daaw.nl0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6887nl0 {
    public static final float b(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j >> 32));
    }

    public static final float c(long j) {
        C3970dN c3970dN = C3970dN.a;
        return Float.intBitsToFloat((int) (j & 4294967295L));
    }

    public static long a(long j) {
        return j;
    }
}
