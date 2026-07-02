package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class CQ0 {
    public int a;
    public int b;
    public int c;
    public final int[] d = new int[10];

    public int a(int i) {
        return this.d[i];
    }

    public int b() {
        if ((this.a & 2) != 0) {
            return this.d[1];
        }
        return -1;
    }

    public int c(int i) {
        return (this.a & 32) != 0 ? this.d[5] : i;
    }

    public boolean d(int i) {
        return ((1 << i) & this.a) != 0;
    }

    public CQ0 e(int i, int i2, int i3) {
        int[] iArr = this.d;
        if (i >= iArr.length) {
            return this;
        }
        int i4 = 1 << i;
        this.a |= i4;
        if ((i2 & 1) != 0) {
            this.b |= i4;
        } else {
            this.b &= ~i4;
        }
        if ((i2 & 2) != 0) {
            this.c |= i4;
        } else {
            this.c &= ~i4;
        }
        iArr[i] = i3;
        return this;
    }

    public int f() {
        return Integer.bitCount(this.a);
    }
}
