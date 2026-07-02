package com.daaw;

import com.daaw.LE;

/* JADX INFO: renamed from: com.daaw.ne0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6852ne0 {
    public static final long a(long j) {
        LE.a aVar = LE.B;
        return j < 0 ? aVar.b() : aVar.a();
    }

    public static final long b(long j, long j2, PE pe) {
        G10.g(pe, "unit");
        return (1 | (j2 - 1)) == Long.MAX_VALUE ? LE.J(a(j2)) : c(j, j2, pe);
    }

    public static final long c(long j, long j2, PE pe) {
        long j3 = j - j2;
        if (((j3 ^ j) & (~(j3 ^ j2))) >= 0) {
            return OE.p(j3, pe);
        }
        PE pe2 = PE.E;
        if (pe.compareTo(pe2) >= 0) {
            return LE.J(a(j3));
        }
        long jA = QE.a(1L, pe2, pe);
        long j4 = (j / jA) - (j2 / jA);
        long j5 = (j % jA) - (j2 % jA);
        LE.a aVar = LE.B;
        return LE.G(OE.p(j4, pe2), OE.p(j5, pe));
    }
}
