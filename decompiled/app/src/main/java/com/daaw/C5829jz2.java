package com.daaw;

/* JADX INFO: renamed from: com.daaw.jz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5829jz2 {
    public long[] a;

    public C5829jz2(int i) {
        int i2 = 16;
        if (Integer.bitCount(16) != 1) {
            int iHighestOneBit = Integer.highestOneBit(15);
            i2 = iHighestOneBit + iHighestOneBit;
        }
        this.a = new long[i2];
    }
}
