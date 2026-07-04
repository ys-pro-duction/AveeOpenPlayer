package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public abstract class IP2 {
    public static int b(int i, int i2) {
        int i3 = i + (i >> 1) + 1;
        if (i3 < i2) {
            int iHighestOneBit = Integer.highestOneBit(i2 - 1);
            i3 = iHighestOneBit + iHighestOneBit;
        }
        if (i3 < 0) {
            return Integer.MAX_VALUE;
        }
        return i3;
    }

    public abstract IP2 a(Object obj);
}
