package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.de0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4043de0 {
    public int a;
    public long[] b;

    public C4043de0() {
        this(32);
    }

    public void a(long j) {
        int i = this.a;
        long[] jArr = this.b;
        if (i == jArr.length) {
            this.b = Arrays.copyOf(jArr, i * 2);
        }
        long[] jArr2 = this.b;
        int i2 = this.a;
        this.a = i2 + 1;
        jArr2[i2] = j;
    }

    public long b(int i) {
        if (i >= 0 && i < this.a) {
            return this.b[i];
        }
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + this.a);
    }

    public int c() {
        return this.a;
    }

    public long[] d() {
        return Arrays.copyOf(this.b, this.a);
    }

    public C4043de0(int i) {
        this.b = new long[i];
    }
}
