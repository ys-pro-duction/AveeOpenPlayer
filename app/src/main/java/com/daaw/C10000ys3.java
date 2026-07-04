package com.daaw;

import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.ys3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C10000ys3 {
    public final String[] a;
    public final int[] b;
    public final C6362lr3[] c;
    public final int[] d;
    public final int[][][] e;
    public final C6362lr3 f;

    public C10000ys3(String[] strArr, int[] iArr, C6362lr3[] c6362lr3Arr, int[] iArr2, int[][][] iArr3, C6362lr3 c6362lr3) {
        this.a = strArr;
        this.b = iArr;
        this.c = c6362lr3Arr;
        this.e = iArr3;
        this.d = iArr2;
        this.f = c6362lr3;
    }

    public final int a(int i, int i2, boolean z) {
        int i3 = this.c[i].b(i2).a;
        int[] iArr = new int[1];
        int i4 = 0;
        int i5 = 0;
        for (char c = 0; c <= 0; c = 1) {
            if ((this.e[i][i2][0] & 7) == 4) {
                iArr[i5] = 0;
                i5++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i5);
        String str = null;
        boolean z2 = false;
        int i6 = 0;
        int iMin = 16;
        while (i4 < iArrCopyOf.length) {
            String str2 = this.c[i].b(i2).b(iArrCopyOf[i4]).l;
            int i7 = i6 + 1;
            if (i6 == 0) {
                str = str2;
            } else {
                z2 |= !AbstractC9004vJ2.e(str, str2);
            }
            iMin = Math.min(iMin, this.e[i][i2][i4] & 24);
            i4++;
            i6 = i7;
        }
        return z2 ? Math.min(iMin, this.d[i]) : iMin;
    }

    public final int b(int i, int i2, int i3) {
        return this.e[i][i2][i3];
    }

    public final int c(int i) {
        return this.b[i];
    }

    public final C6362lr3 d(int i) {
        return this.c[i];
    }

    public final C6362lr3 e() {
        return this.f;
    }
}
