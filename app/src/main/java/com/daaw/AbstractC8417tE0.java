package com.daaw;

import com.daaw.F00;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.daaw.tE0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8417tE0 extends AbstractC8138sE0 {
    public static float c(float f, float f2) {
        return f < f2 ? f2 : f;
    }

    public static int d(int i, int i2) {
        return i < i2 ? i2 : i;
    }

    public static long e(long j, long j2) {
        return j < j2 ? j2 : j;
    }

    public static Comparable f(Comparable comparable, Comparable comparable2) {
        G10.g(comparable, "<this>");
        G10.g(comparable2, "minimumValue");
        return comparable.compareTo(comparable2) < 0 ? comparable2 : comparable;
    }

    public static float g(float f, float f2) {
        return f > f2 ? f2 : f;
    }

    public static int h(int i, int i2) {
        return i > i2 ? i2 : i;
    }

    public static long i(long j, long j2) {
        return j > j2 ? j2 : j;
    }

    public static double j(double d, double d2, double d3) {
        if (d2 <= d3) {
            return d < d2 ? d2 : d > d3 ? d3 : d;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + d3 + " is less than minimum " + d2 + '.');
    }

    public static float k(float f, float f2, float f3) {
        if (f2 <= f3) {
            return f < f2 ? f2 : f > f3 ? f3 : f;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + f3 + " is less than minimum " + f2 + '.');
    }

    public static int l(int i, int i2, int i3) {
        if (i2 <= i3) {
            return i < i2 ? i2 : i > i3 ? i3 : i;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i3 + " is less than minimum " + i2 + '.');
    }

    public static long m(long j, long j2, long j3) {
        if (j2 <= j3) {
            return j < j2 ? j2 : j > j3 ? j3 : j;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + j3 + " is less than minimum " + j2 + '.');
    }

    public static F00 n(int i, int i2) {
        return F00.E.a(i, i2, -1);
    }

    public static long o(C6573me0 c6573me0, AbstractC6465mE0 abstractC6465mE0) {
        G10.g(c6573me0, "<this>");
        G10.g(abstractC6465mE0, "random");
        try {
            return AbstractC7302pE0.d(abstractC6465mE0, c6573me0);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public static F00 p(F00 f00, int i) {
        G10.g(f00, "<this>");
        AbstractC8138sE0.a(i > 0, Integer.valueOf(i));
        F00.a aVar = F00.E;
        int iP = f00.p();
        int iS = f00.s();
        if (f00.v() <= 0) {
            i = -i;
        }
        return aVar.a(iP, iS, i);
    }

    public static H00 q(int i, int i2) {
        return i2 <= Integer.MIN_VALUE ? H00.F.a() : new H00(i, i2 - 1);
    }
}
