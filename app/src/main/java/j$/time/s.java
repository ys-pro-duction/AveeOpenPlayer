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
public final class s implements j$.time.temporal.k, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        s sVar = (s) obj;
        int i = this.a - sVar.a;
        return i == 0 ? this.b - sVar.b : i;
    }

    static {
        j$.time.format.o oVar = new j$.time.format.o();
        oVar.h(ChronoField.YEAR, 4, 10, y.EXCEEDS_PAD);
        oVar.c('-');
        oVar.g(ChronoField.MONTH_OF_YEAR, 2);
        oVar.l(Locale.getDefault(), x.SMART, null);
    }

    public s(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final s O(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new s(i, i2);
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.q(this);
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
        int i = r.a[((ChronoField) temporalField).ordinal()];
        if (i == 1) {
            return this.b;
        }
        if (i == 2) {
            return K();
        }
        int i2 = this.a;
        if (i == 3) {
            if (i2 < 1) {
                i2 = 1 - i2;
            }
            return i2;
        }
        if (i == 4) {
            return i2;
        }
        if (i == 5) {
            return i2 < 1 ? 0 : 1;
        }
        throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
    }

    public final long K() {
        return ((((long) this.a) * 12) + ((long) this.b)) - 1;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final s d(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (s) temporalField.r(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.K(j);
        int i = r.a[chronoField.ordinal()];
        int i2 = this.a;
        if (i == 1) {
            int i3 = (int) j;
            ChronoField.MONTH_OF_YEAR.K(i3);
            return O(i2, i3);
        }
        if (i == 2) {
            return M(j - K());
        }
        int i4 = this.b;
        if (i == 3) {
            if (i2 < 1) {
                j = 1 - j;
            }
            int i5 = (int) j;
            ChronoField.YEAR.K(i5);
            return O(i5, i4);
        }
        if (i == 4) {
            int i6 = (int) j;
            ChronoField.YEAR.K(i6);
            return O(i6, i4);
        }
        if (i != 5) {
            throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
        }
        if (u(ChronoField.ERA) == j) {
            return this;
        }
        int i7 = 1 - i2;
        ChronoField.YEAR.K(i7);
        return O(i7, i4);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final s e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (s) temporalUnit.k(this, j);
        }
        switch (r.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(j);
            case 2:
                return N(j);
            case 3:
                return N(j$.com.android.tools.r8.a.U(j, 10));
            case 4:
                return N(j$.com.android.tools.r8.a.U(j, 100));
            case 5:
                return N(j$.com.android.tools.r8.a.U(j, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return d(j$.com.android.tools.r8.a.O(u(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.p("Unsupported unit: " + temporalUnit);
        }
    }

    public final s N(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return O(chronoField.c.a(((long) this.a) + j, chronoField), this.b);
    }

    public final s M(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return O(chronoField.c.a(j$.com.android.tools.r8.a.T(j2, j3), chronoField), ((int) j$.com.android.tools.r8.a.S(j2, j3)) + 1);
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
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.o.c(this, fVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        if (!j$.com.android.tools.r8.a.M(kVar).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return kVar.d(K(), ChronoField.PROLEPTIC_MONTH);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            if (this.a == sVar.a && this.b == sVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b << 27) ^ this.a;
    }

    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(9);
        if (iAbs >= 1000) {
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        int i2 = this.b;
        sb.append(i2 < 10 ? "-0" : "-");
        sb.append(i2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new o((byte) 12, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (s) j$.com.android.tools.r8.a.a(localDate, this);
    }
}
