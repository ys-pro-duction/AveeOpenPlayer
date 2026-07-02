package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class H21 {
    public static final long a(int i) {
        return b(i, i);
    }

    public static final long b(int i, int i2) {
        return G21.c(d(i, i2));
    }

    public static final long c(long j, int i, int i2) {
        int iL = AbstractC8417tE0.l(G21.j(j), i, i2);
        int iL2 = AbstractC8417tE0.l(G21.g(j), i, i2);
        return (iL == G21.j(j) && iL2 == G21.g(j)) ? j : b(iL, iL2);
    }

    public static final long d(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException(("start cannot be negative. [start: " + i + ']').toString());
        }
        if (i2 >= 0) {
            return (((long) i2) & 4294967295L) | (((long) i) << 32);
        }
        throw new IllegalArgumentException(("end cannot negative. [end: " + i2 + ']').toString());
    }
}
