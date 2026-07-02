package com.daaw;

import com.google.android.exoplayer2.Format;

/* JADX INFO: loaded from: classes.dex */
public final class U41 {
    public final int a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final Format f;
    public final int g;
    public final long[] h;
    public final long[] i;
    public final int j;
    public final W41[] k;

    public U41(int i, int i2, long j, long j2, long j3, Format format, int i3, W41[] w41Arr, int i4, long[] jArr, long[] jArr2) {
        this.a = i;
        this.b = i2;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = format;
        this.g = i3;
        this.k = w41Arr;
        this.j = i4;
        this.h = jArr;
        this.i = jArr2;
    }

    public W41 a(int i) {
        W41[] w41Arr = this.k;
        if (w41Arr == null) {
            return null;
        }
        return w41Arr[i];
    }
}
