package com.daaw;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class PT0 {
    public static final int A(int[] iArr, int i) {
        int i2 = i * 5;
        return i2 >= iArr.length ? iArr.length : iArr[i2 + 4] + D(iArr[i2 + 1] >> 29);
    }

    public static final boolean B(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 201326592) != 0;
    }

    public static final boolean C(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 67108864) != 0;
    }

    public static final int D(int i) {
        switch (i) {
            case 0:
                return 0;
            case 1:
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 1;
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final int E(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final int F(int[] iArr, int i) {
        return iArr[(i * 5) + 1];
    }

    public static final int G(int[] iArr, int i) {
        return iArr[(i * 5) + 3];
    }

    public static final boolean H(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0;
    }

    public static final boolean I(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 134217728) != 0;
    }

    public static final boolean J(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 536870912) != 0;
    }

    public static final void K(int[] iArr, int i, int i2, boolean z, boolean z2, boolean z3, int i3, int i4) {
        int i5 = z ? 1073741824 : 0;
        int i6 = z2 ? 536870912 : 0;
        int i7 = z3 ? 268435456 : 0;
        int i8 = i * 5;
        iArr[i8] = i2;
        iArr[i8 + 1] = i5 | i6 | i7;
        iArr[i8 + 2] = i3;
        iArr[i8 + 3] = 0;
        iArr[i8 + 4] = i4;
    }

    public static final boolean L(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 1073741824) != 0;
    }

    public static final int M(int[] iArr, int i) {
        return iArr[i * 5];
    }

    public static final int N(ArrayList arrayList, int i, int i2) {
        int iS = S(arrayList, i, i2);
        return iS >= 0 ? iS : -(iS + 1);
    }

    public static final int O(int[] iArr, int i) {
        return iArr[(i * 5) + 1] & 67108863;
    }

    public static final int P(int[] iArr, int i) {
        return iArr[(i * 5) + 4];
    }

    public static final int Q(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + D(iArr[i2 + 1] >> 30);
    }

    public static final int R(int[] iArr, int i) {
        return iArr[(i * 5) + 2];
    }

    public static final int S(ArrayList arrayList, int i, int i2) {
        int size = arrayList.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iA = ((C4445f4) arrayList.get(i4)).a();
            if (iA < 0) {
                iA += i2;
            }
            int iH = G10.h(iA, i);
            if (iH < 0) {
                i3 = i4 + 1;
            } else {
                if (iH <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static final int T(int[] iArr, int i) {
        int i2 = i * 5;
        return iArr[i2 + 4] + D(iArr[i2 + 1] >> 28);
    }

    public static final void U(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 67108864;
        } else {
            iArr[i2] = iArr[i2] & (-67108865);
        }
    }

    public static final void V(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 4] = i2;
    }

    public static final void W(int[] iArr, int i, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        iArr[(i * 5) + 3] = i2;
    }

    public static final void X(int[] iArr, int i, boolean z) {
        int i2 = (i * 5) + 1;
        if (z) {
            iArr[i2] = iArr[i2] | 134217728;
        } else {
            iArr[i2] = iArr[i2] & (-134217729);
        }
    }

    public static final void Y(int[] iArr, int i, int i2) {
        if (i2 < 0 || i2 >= 67108863) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        int i3 = (i * 5) + 1;
        iArr[i3] = i2 | (iArr[i3] & (-67108864));
    }

    public static final void Z(int[] iArr, int i, int i2) {
        iArr[(i * 5) + 2] = i2;
    }
}
