package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Iy2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1235Iy2 {
    public int a;
    public long[] b = new long[32];

    public C1235Iy2(int i) {
    }

    public final int a() {
        return this.a;
    }

    public final long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public final void c(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i + i);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }
}
