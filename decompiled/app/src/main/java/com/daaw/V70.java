package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class V70 {
    public static final long a(int i) {
        return G70.k((((long) i) << 32) | (((long) 0) & 4294967295L));
    }

    public static final int b(long j) {
        return (int) (j >> 32);
    }
}
