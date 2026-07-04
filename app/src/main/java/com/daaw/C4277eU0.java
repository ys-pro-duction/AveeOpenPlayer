package com.daaw;

/* JADX INFO: renamed from: com.daaw.eU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4277eU0 {
    public int a;
    public int[] b = new int[16];
    public int[] c = new int[16];
    public int[] d;
    public int e;

    public C4277eU0() {
        int[] iArr = new int[16];
        int i = 0;
        while (i < 16) {
            int i2 = i + 1;
            iArr[i] = i2;
            i = i2;
        }
        this.d = iArr;
    }

    public final int a(int i) {
        c(this.a + 1);
        int i2 = this.a;
        this.a = i2 + 1;
        int iB = b();
        this.b[i2] = i;
        this.c[i2] = iB;
        this.d[iB] = i2;
        h(i2);
        return iB;
    }

    public final int b() {
        int length = this.d.length;
        if (this.e >= length) {
            int i = length * 2;
            int[] iArr = new int[i];
            int i2 = 0;
            while (i2 < i) {
                int i3 = i2 + 1;
                iArr[i2] = i3;
                i2 = i3;
            }
            AbstractC5152hb.j(this.d, iArr, 0, 0, 0, 14, null);
            this.d = iArr;
        }
        int i4 = this.e;
        this.e = this.d[i4];
        return i4;
    }

    public final void c(int i) {
        int[] iArr = this.b;
        int length = iArr.length;
        if (i <= length) {
            return;
        }
        int i2 = length * 2;
        int[] iArr2 = new int[i2];
        int[] iArr3 = new int[i2];
        AbstractC5152hb.j(iArr, iArr2, 0, 0, 0, 14, null);
        AbstractC5152hb.j(this.c, iArr3, 0, 0, 0, 14, null);
        this.b = iArr2;
        this.c = iArr3;
    }

    public final void d(int i) {
        this.d[i] = this.e;
        this.e = i;
    }

    public final int e(int i) {
        return this.a > 0 ? this.b[0] : i;
    }

    public final void f(int i) {
        int i2 = this.d[i];
        i(i2, this.a - 1);
        this.a--;
        h(i2);
        g(i2);
        d(i);
    }

    public final void g(int i) {
        int i2;
        int[] iArr = this.b;
        int i3 = this.a >> 1;
        while (i < i3) {
            int i4 = (i + 1) << 1;
            int i5 = i4 - 1;
            if (i4 >= this.a || (i2 = iArr[i4]) >= iArr[i5]) {
                if (iArr[i5] >= iArr[i]) {
                    return;
                }
                i(i5, i);
                i = i5;
            } else {
                if (i2 >= iArr[i]) {
                    return;
                }
                i(i4, i);
                i = i4;
            }
        }
    }

    public final void h(int i) {
        int[] iArr = this.b;
        int i2 = iArr[i];
        while (i > 0) {
            int i3 = ((i + 1) >> 1) - 1;
            if (iArr[i3] <= i2) {
                return;
            }
            i(i3, i);
            i = i3;
        }
    }

    public final void i(int i, int i2) {
        int[] iArr = this.b;
        int[] iArr2 = this.c;
        int[] iArr3 = this.d;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = iArr2[i];
        iArr2[i] = iArr2[i2];
        iArr2[i2] = i4;
        iArr3[iArr2[i]] = i;
        iArr3[iArr2[i2]] = i2;
    }
}
