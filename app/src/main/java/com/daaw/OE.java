package com.daaw;

import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OE {
    public static final long h(long j, int i) {
        return LE.l((j << 1) + ((long) i));
    }

    public static final long i(long j) {
        return LE.l((j << 1) + 1);
    }

    public static final long j(long j) {
        return (-4611686018426L > j || j >= 4611686018427L) ? i(AbstractC8417tE0.m(j, -4611686018427387903L, 4611686018427387903L)) : k(m(j));
    }

    public static final long k(long j) {
        return LE.l(j << 1);
    }

    public static final long l(long j) {
        return (-4611686018426999999L > j || j >= 4611686018427000000L) ? i(n(j)) : k(j);
    }

    public static final long m(long j) {
        return j * ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    public static final long n(long j) {
        return j / ((long) UtilsKt.MICROS_MULTIPLIER);
    }

    public static final long o(int i, PE pe) {
        G10.g(pe, "unit");
        return pe.compareTo(PE.F) <= 0 ? k(QE.b(i, pe, PE.C)) : p(i, pe);
    }

    public static final long p(long j, PE pe) {
        G10.g(pe, "unit");
        PE pe2 = PE.C;
        long jB = QE.b(4611686018426999999L, pe2, pe);
        return ((-jB) > j || j > jB) ? i(AbstractC8417tE0.m(QE.a(j, pe, PE.E), -4611686018427387903L, 4611686018427387903L)) : k(QE.b(j, pe, pe2));
    }
}
