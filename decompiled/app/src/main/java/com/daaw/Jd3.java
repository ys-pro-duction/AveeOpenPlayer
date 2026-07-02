package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Jd3 {
    public static final /* synthetic */ int a = 0;

    public /* synthetic */ Jd3(Gd3 gd3) {
    }

    public static int a(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long b(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }
}
