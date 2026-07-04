package com.daaw;

import java.math.RoundingMode;

/* JADX INFO: renamed from: com.daaw.aR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3153aR2 {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int a(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        int i3 = i / 8;
        int i4 = i - (i3 * 8);
        if (i4 != 0) {
            int i5 = ((i ^ 8) >> 31) | 1;
            switch (ZQ2.a[roundingMode.ordinal()]) {
                case 1:
                    if (i4 != 0) {
                        throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    if (i5 >= 0) {
                        return i3;
                    }
                    return i3 + i5;
                case 4:
                    return i3 + i5;
                case 5:
                    if (i5 <= 0) {
                        return i3;
                    }
                    return i3 + i5;
                case 6:
                case 7:
                case 8:
                    int iAbs = Math.abs(i4);
                    int iAbs2 = iAbs - (Math.abs(8) - iAbs);
                    if (iAbs2 == 0) {
                        if (roundingMode != RoundingMode.HALF_UP) {
                            if ((i3 & 1 & (roundingMode != RoundingMode.HALF_EVEN ? 0 : 1)) == 0) {
                                return i3;
                            }
                        }
                    } else if (iAbs2 <= 0) {
                        return i3;
                    }
                    return i3 + i5;
                default:
                    throw new AssertionError();
            }
        }
        return i3;
    }
}
