package j$.time.temporal;

import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    public static final j$.time.f a = new j$.time.f(3);
    public static final j$.time.f b = new j$.time.f(4);
    public static final j$.time.f c = new j$.time.f(5);
    public static final j$.time.f d = new j$.time.f(6);
    public static final j$.time.f e = new j$.time.f(7);
    public static final j$.time.f f = new j$.time.f(8);
    public static final j$.time.f g = new j$.time.f(9);

    public static ValueRange d(l lVar, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            Objects.requireNonNull(temporalField, "field");
            return temporalField.u(lVar);
        }
        if (lVar.f(temporalField)) {
            return ((ChronoField) temporalField).c;
        }
        throw new p(j$.time.c.a("Unsupported field: ", temporalField));
    }

    public static int a(l lVar, TemporalField temporalField) {
        ValueRange valueRangeR = lVar.r(temporalField);
        if (!valueRangeR.d()) {
            throw new p("Invalid field " + temporalField + " for get() method, use getLong() instead");
        }
        long jU = lVar.u(temporalField);
        if (valueRangeR.e(jU)) {
            return (int) jU;
        }
        throw new j$.time.b("Invalid value for " + temporalField + " (valid values " + valueRangeR + "): " + jU);
    }

    public static Object c(l lVar, j$.time.f fVar) {
        if (fVar == a || fVar == b || fVar == c) {
            return null;
        }
        return fVar.h(lVar);
    }

    public static k b(k kVar, long j, TemporalUnit temporalUnit) {
        long j2;
        if (j == Long.MIN_VALUE) {
            kVar = kVar.e(Long.MAX_VALUE, temporalUnit);
            j2 = 1;
        } else {
            j2 = -j;
        }
        return kVar.e(j2, temporalUnit);
    }
}
