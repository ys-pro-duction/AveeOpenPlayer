package com.daaw;

/* JADX INFO: renamed from: com.daaw.Dr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0684Dr {
    public static final int[] a = new int[0];
    public static final Object[] b = new Object[0];

    public static final int a(int[] iArr, int i, int i2) {
        G10.g(iArr, "<this>");
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else {
                if (i6 <= i2) {
                    return i5;
                }
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }
}
