package com.daaw;

/* JADX INFO: renamed from: com.daaw.nr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6916nr {
    public static final long a(int i, int i2, int i3, int i4) {
        if (i2 < i) {
            throw new IllegalArgumentException(("maxWidth(" + i2 + ") must be >= than minWidth(" + i + ')').toString());
        }
        if (i4 < i3) {
            throw new IllegalArgumentException(("maxHeight(" + i4 + ") must be >= than minHeight(" + i3 + ')').toString());
        }
        if (i >= 0 && i3 >= 0) {
            return C6079kr.b.b(i, i2, i3, i4);
        }
        throw new IllegalArgumentException(("minWidth(" + i + ") and minHeight(" + i3 + ") must be >= 0").toString());
    }

    public static /* synthetic */ long b(int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = 0;
        }
        if ((i5 & 2) != 0) {
            i2 = Integer.MAX_VALUE;
        }
        if ((i5 & 4) != 0) {
            i3 = 0;
        }
        if ((i5 & 8) != 0) {
            i4 = Integer.MAX_VALUE;
        }
        return a(i, i2, i3, i4);
    }

    public static final int c(int i, int i2) {
        return i == Integer.MAX_VALUE ? i : AbstractC8417tE0.d(i + i2, 0);
    }

    public static final long d(long j, long j2) {
        return J00.a(AbstractC8417tE0.l(I00.g(j2), C6079kr.p(j), C6079kr.n(j)), AbstractC8417tE0.l(I00.f(j2), C6079kr.o(j), C6079kr.m(j)));
    }

    public static final long e(long j, long j2) {
        return a(AbstractC8417tE0.l(C6079kr.p(j2), C6079kr.p(j), C6079kr.n(j)), AbstractC8417tE0.l(C6079kr.n(j2), C6079kr.p(j), C6079kr.n(j)), AbstractC8417tE0.l(C6079kr.o(j2), C6079kr.o(j), C6079kr.m(j)), AbstractC8417tE0.l(C6079kr.m(j2), C6079kr.o(j), C6079kr.m(j)));
    }

    public static final int f(long j, int i) {
        return AbstractC8417tE0.l(i, C6079kr.o(j), C6079kr.m(j));
    }

    public static final int g(long j, int i) {
        return AbstractC8417tE0.l(i, C6079kr.p(j), C6079kr.n(j));
    }

    public static final long h(long j, int i, int i2) {
        return a(AbstractC8417tE0.d(C6079kr.p(j) + i, 0), c(C6079kr.n(j), i), AbstractC8417tE0.d(C6079kr.o(j) + i2, 0), c(C6079kr.m(j), i2));
    }
}
