package j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.InterfaceC10375b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalDate implements j$.time.temporal.k, TemporalAdjuster, InterfaceC10375b, Serializable {
    public static final LocalDate d = of(-999999999, 1, 1);
    public static final LocalDate e = of(999999999, 12, 31);
    private static final long serialVersionUID = 2942565459149668126L;
    public final int a;
    public final short b;
    public final short c;

    static {
        of(1970, 1, 1);
    }

    public static LocalDate Q(a aVar) {
        Objects.requireNonNull(aVar, "clock");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.c;
        long j = 1000;
        Instant instantK = Instant.K(j$.com.android.tools.r8.a.T(jCurrentTimeMillis, j), ((int) j$.com.android.tools.r8.a.S(jCurrentTimeMillis, j)) * UtilsKt.MICROS_MULTIPLIER);
        Objects.requireNonNull(instantK, "instant");
        ZoneId zoneId = aVar.a;
        Objects.requireNonNull(zoneId, "zone");
        return R(j$.com.android.tools.r8.a.T(instantK.a + ((long) zoneId.K().d(instantK).b), 86400));
    }

    public static LocalDate of(int i, int i2, int i3) {
        ChronoField.YEAR.K(i);
        ChronoField.MONTH_OF_YEAR.K(i2);
        ChronoField.DAY_OF_MONTH.K(i3);
        return L(i, i2, i3);
    }

    public static LocalDate ofYearDay(int i, int i2) {
        long j = i;
        ChronoField.YEAR.K(j);
        ChronoField.DAY_OF_YEAR.K(i2);
        j$.time.chrono.r.c.getClass();
        boolean zL = j$.time.chrono.r.L(j);
        if (i2 == 366 && !zL) {
            throw new b("Invalid date 'DayOfYear 366' as '" + i + "' is not a leap year");
        }
        Month monthN = Month.N(((i2 - 1) / 31) + 1);
        if (i2 > (monthN.L(zL) + monthN.K(zL)) - 1) {
            monthN = Month.a[((((int) 1) + 12) + monthN.ordinal()) % 12];
        }
        return new LocalDate(i, monthN.getValue(), (i2 - monthN.K(zL)) + 1);
    }

    public static LocalDate R(long j) {
        long j2;
        ChronoField.EPOCH_DAY.K(j);
        long j3 = 719468 + j;
        if (j3 < 0) {
            long j4 = ((j + 719469) / 146097) - 1;
            j2 = j4 * 400;
            j3 += (-j4) * 146097;
        } else {
            j2 = 0;
        }
        long j5 = ((j3 * 400) + 591) / 146097;
        long j6 = j3 - ((j5 / 400) + (((j5 / 4) + (j5 * 365)) - (j5 / 100)));
        if (j6 < 0) {
            j5--;
            j6 = j3 - ((j5 / 400) + (((j5 / 4) + (365 * j5)) - (j5 / 100)));
        }
        int i = (int) j6;
        int i2 = ((i * 5) + 2) / 153;
        int i3 = ((i2 + 2) % 12) + 1;
        int i4 = (i - (((i2 * 306) + 5) / 10)) + 1;
        long j7 = j5 + j2 + ((long) (i2 / 10));
        ChronoField chronoField = ChronoField.YEAR;
        return new LocalDate(chronoField.c.a(j7, chronoField), i3, i4);
    }

    public static LocalDate M(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        LocalDate localDate = (LocalDate) lVar.k(j$.time.temporal.o.f);
        if (localDate != null) {
            return localDate;
        }
        throw new b("Unable to obtain LocalDate from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public static LocalDate L(int i, int i2, int i3) {
        int i4 = 28;
        if (i3 > 28) {
            if (i2 != 2) {
                i4 = (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) ? 30 : 31;
            } else {
                j$.time.chrono.r.c.getClass();
                if (j$.time.chrono.r.L(i)) {
                    i4 = 29;
                }
            }
            if (i3 > i4) {
                if (i3 == 29) {
                    throw new b("Invalid date 'February 29' as '" + i + "' is not a leap year");
                }
                throw new b("Invalid date '" + Month.N(i2).name() + " " + i3 + "'");
            }
        }
        return new LocalDate(i, i2, i3);
    }

    public static LocalDate X(int i, int i2, int i3) {
        if (i2 == 2) {
            j$.time.chrono.r.c.getClass();
            i3 = Math.min(i3, j$.time.chrono.r.L((long) i) ? 29 : 28);
        } else if (i2 == 4 || i2 == 6 || i2 == 9 || i2 == 11) {
            i3 = Math.min(i3, 30);
        }
        return new LocalDate(i, i2, i3);
    }

    public LocalDate(int i, int i2, int i3) {
        this.a = i;
        this.b = (short) i2;
        this.c = (short) i3;
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.r(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.u(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        if (!chronoField.y()) {
            throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
        }
        int i = e.a[chronoField.ordinal()];
        if (i == 1) {
            return ValueRange.f(1L, lengthOfMonth());
        }
        if (i == 2) {
            return ValueRange.f(1L, lengthOfYear());
        }
        if (i != 3) {
            return i != 4 ? ((ChronoField) temporalField).c : this.a <= 0 ? ValueRange.f(1L, 1000000000L) : ValueRange.f(1L, 999999999L);
        }
        return ValueRange.f(1L, (Month.N(this.b) != Month.FEBRUARY || P()) ? 5L : 4L);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return N(temporalField);
        }
        return j$.time.temporal.o.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.EPOCH_DAY) {
                return v();
            }
            if (temporalField != ChronoField.PROLEPTIC_MONTH) {
                return N(temporalField);
            }
            return ((((long) this.a) * 12) + ((long) this.b)) - 1;
        }
        return temporalField.k(this);
    }

    public final int N(TemporalField temporalField) {
        int i;
        int i2 = e.a[((ChronoField) temporalField).ordinal()];
        short s = this.c;
        int i3 = this.a;
        switch (i2) {
            case 1:
                return s;
            case 2:
                return getDayOfYear();
            case 3:
                i = (s - 1) / 7;
                break;
            case 4:
                return i3 >= 1 ? i3 : 1 - i3;
            case 5:
                return getDayOfWeek().getValue();
            case 6:
                i = (s - 1) % 7;
                break;
            case 7:
                return ((getDayOfYear() - 1) % 7) + 1;
            case 8:
                throw new j$.time.temporal.p("Invalid field 'EpochDay' for get() method, use getLong() instead");
            case 9:
                return ((getDayOfYear() - 1) / 7) + 1;
            case 10:
                return this.b;
            case 11:
                throw new j$.time.temporal.p("Invalid field 'ProlepticMonth' for get() method, use getLong() instead");
            case 12:
                return i3;
            case 13:
                return i3 >= 1 ? 1 : 0;
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
        }
        return i + 1;
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final j$.time.chrono.k a() {
        return j$.time.chrono.r.c;
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final j$.time.chrono.l z() {
        return this.a >= 1 ? j$.time.chrono.s.CE : j$.time.chrono.s.BCE;
    }

    public int getDayOfYear() {
        return (Month.N(this.b).K(P()) + this.c) - 1;
    }

    public int getDayOfMonth() {
        return this.c;
    }

    public DayOfWeek getDayOfWeek() {
        return DayOfWeek.of(((int) j$.com.android.tools.r8.a.S(v() + 3, 7)) + 1);
    }

    public final boolean P() {
        j$.time.chrono.r rVar = j$.time.chrono.r.c;
        long j = this.a;
        rVar.getClass();
        return j$.time.chrono.r.L(j);
    }

    public int lengthOfMonth() {
        short s = this.b;
        return s != 2 ? (s == 4 || s == 6 || s == 9 || s == 11) ? 30 : 31 : P() ? 29 : 28;
    }

    public int lengthOfYear() {
        return P() ? 366 : 365;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final LocalDate q(TemporalAdjuster temporalAdjuster) {
        if (temporalAdjuster instanceof LocalDate) {
            return (LocalDate) temporalAdjuster;
        }
        return (LocalDate) temporalAdjuster.y(this);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final LocalDate d(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalDate) temporalField.r(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.K(j);
        int i = e.a[chronoField.ordinal()];
        short s = this.c;
        int i2 = this.a;
        short s2 = this.b;
        switch (i) {
            case 1:
                int i3 = (int) j;
                if (s != i3) {
                    return of(i2, s2, i3);
                }
                return this;
            case 2:
                int i4 = (int) j;
                if (getDayOfYear() != i4) {
                    return ofYearDay(i2, i4);
                }
                return this;
            case 3:
                return V(j - u(ChronoField.ALIGNED_WEEK_OF_MONTH));
            case 4:
                if (i2 < 1) {
                    j = 1 - j;
                }
                return a0((int) j);
            case 5:
                return T(j - ((long) getDayOfWeek().getValue()));
            case 6:
                return T(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 7:
                return T(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 8:
                return R(j);
            case 9:
                return V(j - u(ChronoField.ALIGNED_WEEK_OF_YEAR));
            case 10:
                int i5 = (int) j;
                if (s2 != i5) {
                    ChronoField.MONTH_OF_YEAR.K(i5);
                    return X(i2, i5, s);
                }
                return this;
            case 11:
                return U(j - (((((long) i2) * 12) + ((long) s2)) - 1));
            case 12:
                return a0((int) j);
            case 13:
                if (u(ChronoField.ERA) != j) {
                    return a0(1 - i2);
                }
                return this;
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalDate a0(int i) {
        if (this.a == i) {
            return this;
        }
        ChronoField.YEAR.K(i);
        return X(i, this.b, this.c);
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final InterfaceC10375b C(j$.time.temporal.n nVar) {
        if (c.b(nVar)) {
            n nVar2 = (n) nVar;
            return U((((long) nVar2.a) * 12) + ((long) nVar2.b)).T(nVar2.c);
        }
        Objects.requireNonNull(nVar, "amountToAdd");
        return (LocalDate) ((n) nVar).k(this);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
    public final LocalDate e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (LocalDate) temporalUnit.k(this, j);
        }
        switch (e.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return T(j);
            case 2:
                return V(j);
            case 3:
                return U(j);
            case 4:
                return W(j);
            case 5:
                return W(j$.com.android.tools.r8.a.U(j, 10));
            case 6:
                return W(j$.com.android.tools.r8.a.U(j, 100));
            case 7:
                return W(j$.com.android.tools.r8.a.U(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return d(j$.com.android.tools.r8.a.O(u(chronoField), j), chronoField);
            default:
                throw new j$.time.temporal.p("Unsupported unit: " + temporalUnit);
        }
    }

    public final LocalDate W(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return X(chronoField.c.a(((long) this.a) + j, chronoField), this.b, this.c);
    }

    public final LocalDate U(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.a) * 12) + ((long) (this.b - 1)) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return X(chronoField.c.a(j$.com.android.tools.r8.a.T(j2, j3), chronoField), ((int) j$.com.android.tools.r8.a.S(j2, j3)) + 1, this.c);
    }

    public final LocalDate V(long j) {
        return T(j$.com.android.tools.r8.a.U(j, 7));
    }

    public final LocalDate T(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.c) + j;
        if (j2 > 0) {
            short s = this.b;
            int i = this.a;
            if (j2 <= 28) {
                return new LocalDate(i, s, (int) j2);
            }
            if (j2 <= 59) {
                long jLengthOfMonth = lengthOfMonth();
                if (j2 <= jLengthOfMonth) {
                    return new LocalDate(i, s, (int) j2);
                }
                if (s < 12) {
                    return new LocalDate(i, s + 1, (int) (j2 - jLengthOfMonth));
                }
                int i2 = i + 1;
                ChronoField.YEAR.K(i2);
                return new LocalDate(i2, 1, (int) (j2 - jLengthOfMonth));
            }
        }
        return R(j$.com.android.tools.r8.a.O(v(), j));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    public LocalDate minusDays(long j) {
        return j == Long.MIN_VALUE ? T(Long.MAX_VALUE).T(1L) : T(-j);
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        return fVar == j$.time.temporal.o.f ? this : j$.com.android.tools.r8.a.t(this, fVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return j$.com.android.tools.r8.a.a(this, kVar);
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final ChronoLocalDateTime x(LocalTime localTime) {
        return LocalDateTime.N(this, localTime);
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final long v() {
        long j = this.a;
        long j2 = this.b;
        long j3 = 365 * j;
        long j4 = (((367 * j2) - 362) / 12) + (j >= 0 ? ((j + 399) / 400) + (((3 + j) / 4) - ((99 + j) / 100)) + j3 : j3 - ((j / (-400)) + ((j / (-4)) - (j / (-100))))) + ((long) (this.c - 1));
        if (j2 > 2) {
            j4 = !P() ? j4 - 2 : j4 - 1;
        }
        return j4 - 719528;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public final int compareTo(InterfaceC10375b interfaceC10375b) {
        if (interfaceC10375b instanceof LocalDate) {
            return K((LocalDate) interfaceC10375b);
        }
        return j$.com.android.tools.r8.a.f(this, interfaceC10375b);
    }

    public final int K(LocalDate localDate) {
        int i = this.a - localDate.a;
        if (i != 0) {
            return i;
        }
        int i2 = this.b - localDate.b;
        return i2 == 0 ? this.c - localDate.c : i2;
    }

    public final boolean O(LocalDate localDate) {
        return c.b(localDate) ? K(localDate) < 0 : v() < localDate.v();
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LocalDate) && K((LocalDate) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final int hashCode() {
        int i = this.a;
        return (((i << 11) + (this.b << 6)) + this.c) ^ (i & (-2048));
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final String toString() {
        int i = this.a;
        int iAbs = Math.abs(i);
        StringBuilder sb = new StringBuilder(10);
        if (iAbs >= 1000) {
            if (i > 9999) {
                sb.append('+');
            }
            sb.append(i);
        } else if (i < 0) {
            sb.append(i - 10000);
            sb.deleteCharAt(1);
        } else {
            sb.append(i + 10000);
            sb.deleteCharAt(0);
        }
        short s = this.b;
        sb.append(s < 10 ? "-0" : "-");
        sb.append((int) s);
        short s2 = this.c;
        sb.append(s2 < 10 ? "-0" : "-");
        sb.append((int) s2);
        return sb.toString();
    }

    private Object writeReplace() {
        return new o((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
