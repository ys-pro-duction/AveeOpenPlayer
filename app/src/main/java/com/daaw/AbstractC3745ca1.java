package com.daaw;

/* JADX INFO: renamed from: com.daaw.ca1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3745ca1 {
    public static final int a(long j, long j2) {
        return G10.i(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    public static final double b(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final String c(long j, int i) {
        if (j >= 0) {
            String string = Long.toString(j, AbstractC9956yk.a(i));
            G10.f(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        StringBuilder sb = new StringBuilder();
        String string2 = Long.toString(j3, AbstractC9956yk.a(i));
        G10.f(string2, "toString(...)");
        sb.append(string2);
        String string3 = Long.toString(j4, AbstractC9956yk.a(i));
        G10.f(string3, "toString(...)");
        sb.append(string3);
        return sb.toString();
    }
}
