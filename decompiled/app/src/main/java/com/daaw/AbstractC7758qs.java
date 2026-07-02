package com.daaw;

/* JADX INFO: renamed from: com.daaw.qs, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7758qs {
    public static final float e(long j, long j2) {
        return C9879yT0.g(j2) / C9879yT0.g(j);
    }

    public static final float f(long j, long j2) {
        return Math.max(h(j, j2), e(j, j2));
    }

    public static final float g(long j, long j2) {
        return Math.min(h(j, j2), e(j, j2));
    }

    public static final float h(long j, long j2) {
        return C9879yT0.i(j2) / C9879yT0.i(j);
    }
}
