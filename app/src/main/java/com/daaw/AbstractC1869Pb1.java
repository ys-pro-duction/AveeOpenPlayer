package com.daaw;

/* JADX INFO: renamed from: com.daaw.Pb1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1869Pb1 {
    public static long a(long j, int i, int i2) {
        int i3 = (i2 / 8) * i;
        if (i3 == 0) {
            return 0L;
        }
        return j / ((long) i3);
    }

    public static int b(long j, int i, int i2, long j2) {
        return d(c(j, j2), i, i2);
    }

    public static int c(long j, long j2) {
        return (int) ((j2 / 1000000.0d) * j);
    }

    public static int d(long j, int i, int i2) {
        return (int) (j * ((long) ((i2 / 8) * i)));
    }

    public static long e(long j, long j2) {
        return (j * 1000000) / j2;
    }
}
