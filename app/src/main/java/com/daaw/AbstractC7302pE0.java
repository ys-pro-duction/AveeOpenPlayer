package com.daaw;

/* JADX INFO: renamed from: com.daaw.pE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7302pE0 {
    public static final String a(Object obj, Object obj2) {
        G10.g(obj, "from");
        G10.g(obj2, "until");
        return "Random range is empty: [" + obj + ", " + obj2 + ").";
    }

    public static final void b(long j, long j2) {
        if (j2 <= j) {
            throw new IllegalArgumentException(a(Long.valueOf(j), Long.valueOf(j2)).toString());
        }
    }

    public static final int c(int i) {
        return 31 - Integer.numberOfLeadingZeros(i);
    }

    public static final long d(AbstractC6465mE0 abstractC6465mE0, C6573me0 c6573me0) {
        G10.g(abstractC6465mE0, "<this>");
        G10.g(c6573me0, "range");
        if (!c6573me0.isEmpty()) {
            return c6573me0.s() < Long.MAX_VALUE ? abstractC6465mE0.f(c6573me0.p(), c6573me0.s() + 1) : c6573me0.p() > Long.MIN_VALUE ? abstractC6465mE0.f(c6573me0.p() - 1, c6573me0.s()) + 1 : abstractC6465mE0.e();
        }
        throw new IllegalArgumentException("Cannot get random in empty range: " + c6573me0);
    }

    public static final int e(int i, int i2) {
        return (i >>> (32 - i2)) & ((-i2) >> 31);
    }
}
