package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class K10 extends L10 {
    public static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
