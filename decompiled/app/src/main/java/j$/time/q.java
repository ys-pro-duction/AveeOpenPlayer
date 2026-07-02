package j$.time;

import j$.time.format.x;
import j$.time.format.y;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class q implements j$.time.temporal.k, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int b = 0;
    private static final long serialVersionUID = -23038383694477807L;
    public final int a;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.a - ((q) obj).a;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(ChronoField.YEAR, 4, 10, y.EXCEEDS_PAD);
        oVar.l(Locale.getDefault(), x.SMART, null);
    }

    public static q K(int i) {
        ChronoField.YEAR.K(i);
        return new q(i);
    }

    public q(int i) {
        this.a = i;
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.q(this);
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return ValueRange.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        return r(temporalField).a(u(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        int i = p.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 2) {
            return i2;
        }
        if (i == 3) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final q d(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (q) temporalField.r(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.K(j);
        int i = p.a[chronoField.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            if (i2 < 1) {
                j = 1 - j;
            }
            return K((int) j);
        }
        if (i == 2) {
            return K((int) j);
        }
        if (i == 3) {
            return u(ChronoField.ERA) == j ? this : K(1 - i2);
        }
        throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final q e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (q) temporalUnit.k(this, j);
        }
        int i = p.b[((ChronoUnit) temporalUnit).ordinal()];
        if (i == 1) {
            return M(j);
        }
        if (i == 2) {
            return M(j$.com.android.tools.r8.a.U(j, 10));
        }
        if (i == 3) {
            return M(j$.com.android.tools.r8.a.U(j, 100));
        }
        if (i == 4) {
            return M(j$.com.android.tools.r8.a.U(j, 1000));
        }
        if (i == 5) {
            ChronoField chronoField = ChronoField.ERA;
            return d(j$.com.android.tools.r8.a.O(u(chronoField), j), chronoField);
        }
        throw new j$.time.temporal.p("Unsupported unit: " + temporalUnit);
    }

    public final q M(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return K(chronoField.c.a(((long) this.a) + j, chronoField));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        if (fVar == j$.time.temporal.o.b) {
            return j$.time.chrono.r.c;
        }
        if (fVar == j$.time.temporal.o.c) {
            return ChronoUnit.YEARS;
        }
        return j$.time.temporal.o.c(this, fVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        if (!j$.com.android.tools.r8.a.M(kVar).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return kVar.d(this.a, ChronoField.YEAR);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            if (this.a == ((q) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    private Object writeReplace() {
        return new o((byte) 11, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (q) j$.com.android.tools.r8.a.a(localDate, this);
    }
}
