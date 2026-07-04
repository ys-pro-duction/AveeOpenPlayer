package com.daaw;

/* JADX INFO: renamed from: com.daaw.qr1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7755qr1 {
    public final C6918nr1 a;
    public final int b;
    public final long[] c;
    public final int[] d;
    public final int e;
    public final long[] f;
    public final int[] g;
    public final long h;

    public C7755qr1(C6918nr1 c6918nr1, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        AbstractC6048km2.d(length == length2);
        int length3 = jArr.length;
        AbstractC6048km2.d(length3 == length2);
        int length4 = iArr2.length;
        AbstractC6048km2.d(length4 == length2);
        this.a = c6918nr1;
        this.c = jArr;
        this.d = iArr;
        this.e = i;
        this.f = jArr2;
        this.g = iArr2;
        this.h = j;
        this.b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    public final int a(long j) {
        for (int iO = AbstractC9004vJ2.o(this.f, j, true, false); iO >= 0; iO--) {
            if ((this.g[iO] & 1) != 0) {
                return iO;
            }
        }
        return -1;
    }

    public final int b(long j) {
        for (int iM = AbstractC9004vJ2.m(this.f, j, true, false); iM < this.f.length; iM++) {
            if ((this.g[iM] & 1) != 0) {
                return iM;
            }
        }
        return -1;
    }
}
