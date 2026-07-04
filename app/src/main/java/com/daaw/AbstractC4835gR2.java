package com.daaw;

/* JADX INFO: renamed from: com.daaw.gR2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4835gR2 extends AbstractC5114hR2 {
    public static int a(long j) {
        int i = (int) j;
        AbstractC5381iO2.g(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int b(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static int c(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
