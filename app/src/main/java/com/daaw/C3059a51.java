package com.daaw;

/* JADX INFO: renamed from: com.daaw.a51, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3059a51 {
    public final int a;
    public final long[] b;
    public final int[] c;
    public final int d;
    public final long[] e;
    public final int[] f;
    public final long g;

    public C3059a51(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        AbstractC7115ob.a(iArr.length == jArr2.length);
        AbstractC7115ob.a(jArr.length == jArr2.length);
        AbstractC7115ob.a(iArr2.length == jArr2.length);
        this.b = jArr;
        this.c = iArr;
        this.d = i;
        this.e = jArr2;
        this.f = iArr2;
        this.g = j;
        this.a = jArr.length;
    }

    public int a(long j) {
        for (int iE = AbstractC6280lb1.e(this.e, j, true, false); iE >= 0; iE--) {
            if ((this.f[iE] & 1) != 0) {
                return iE;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int iC = AbstractC6280lb1.c(this.e, j, true, false); iC < this.e.length; iC++) {
            if ((this.f[iC] & 1) != 0) {
                return iC;
            }
        }
        return -1;
    }
}
