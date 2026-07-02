package j$.time.temporal;

import j$.time.DayOfWeek;
import j$.time.LocalDate;
import j$.time.chrono.r;
import j$.time.format.w;
import j$.time.format.x;
import java.util.HashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public abstract class f implements TemporalField {
    public static final f DAY_OF_QUARTER;
    public static final f QUARTER_OF_YEAR;
    public static final f WEEK_BASED_YEAR;
    public static final f WEEK_OF_WEEK_BASED_YEAR;
    public static final int[] a;
    public static final /* synthetic */ f[] b;

    public /* synthetic */ l n(HashMap map, w wVar, x xVar) {
        return null;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean y() {
        return true;
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) b.clone();
    }

    static {
        f fVar = new f() { // from class: j$.time.temporal.b
            @Override // j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ValueRange.g(90L, 92L);
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalUnit getBaseUnit() {
                return ChronoUnit.DAYS;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean q(l lVar) {
                if (!lVar.f(ChronoField.DAY_OF_YEAR) || !lVar.f(ChronoField.MONTH_OF_YEAR) || !lVar.f(ChronoField.YEAR)) {
                    return false;
                }
                f fVar2 = h.a;
                return j$.com.android.tools.r8.a.M(lVar).equals(r.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final ValueRange u(l lVar) {
                if (!q(lVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                long jU = lVar.u(f.QUARTER_OF_YEAR);
                if (jU == 1) {
                    long jU2 = lVar.u(ChronoField.YEAR);
                    r.c.getClass();
                    return r.L(jU2) ? ValueRange.f(1L, 91L) : ValueRange.f(1L, 90L);
                }
                if (jU == 2) {
                    return ValueRange.f(1L, 91L);
                }
                if (jU == 3 || jU == 4) {
                    return ValueRange.f(1L, 92L);
                }
                return range();
            }

            @Override // j$.time.temporal.TemporalField
            public final long k(l lVar) {
                if (!q(lVar)) {
                    throw new p("Unsupported field: DayOfQuarter");
                }
                int i = lVar.get(ChronoField.DAY_OF_YEAR);
                int i2 = lVar.get(ChronoField.MONTH_OF_YEAR);
                long jU = lVar.u(ChronoField.YEAR);
                int[] iArr = f.a;
                int i3 = (i2 - 1) / 3;
                r.c.getClass();
                return i - iArr[i3 + (r.L(jU) ? 4 : 0)];
            }

            @Override // j$.time.temporal.TemporalField
            public final k r(k kVar, long j) {
                long jK = k(kVar);
                range().b(j, this);
                ChronoField chronoField = ChronoField.DAY_OF_YEAR;
                return kVar.d((j - jK) + kVar.u(chronoField), chronoField);
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final l n(HashMap map, w wVar, x xVar) {
                LocalDate localDateU;
                long jV;
                ChronoField chronoField = ChronoField.YEAR;
                Long l = (Long) map.get(chronoField);
                TemporalField temporalField = f.QUARTER_OF_YEAR;
                Long l2 = (Long) map.get(temporalField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = chronoField.c.a(l.longValue(), chronoField);
                long jLongValue = ((Long) map.get(f.DAY_OF_QUARTER)).longValue();
                f fVar2 = h.a;
                if (!j$.com.android.tools.r8.a.M(wVar).equals(r.c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                if (xVar == x.LENIENT) {
                    localDateU = LocalDate.of(iA, 1, 1).U(j$.com.android.tools.r8.a.U(j$.com.android.tools.r8.a.V(l2.longValue(), 1L), 3));
                    jV = j$.com.android.tools.r8.a.V(jLongValue, 1L);
                } else {
                    LocalDate localDateOf = LocalDate.of(iA, ((temporalField.range().a(l2.longValue(), temporalField) - 1) * 3) + 1, 1);
                    if (jLongValue < 1 || jLongValue > 90) {
                        if (xVar == x.STRICT) {
                            u(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    localDateU = localDateOf;
                    jV = jLongValue - 1;
                }
                map.remove(this);
                map.remove(chronoField);
                map.remove(temporalField);
                return localDateU.T(jV);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "DayOfQuarter";
            }
        };
        DAY_OF_QUARTER = fVar;
        f fVar2 = new f() { // from class: j$.time.temporal.c
            @Override // j$.time.temporal.TemporalField
            public final TemporalUnit getBaseUnit() {
                return h.e;
            }

            @Override // j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ValueRange.f(1L, 4L);
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean q(l lVar) {
                if (!lVar.f(ChronoField.MONTH_OF_YEAR)) {
                    return false;
                }
                f fVar3 = h.a;
                return j$.com.android.tools.r8.a.M(lVar).equals(r.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final long k(l lVar) {
                if (!q(lVar)) {
                    throw new p("Unsupported field: QuarterOfYear");
                }
                return (lVar.u(ChronoField.MONTH_OF_YEAR) + 2) / 3;
            }

            @Override // j$.time.temporal.TemporalField
            public final ValueRange u(l lVar) {
                if (!q(lVar)) {
                    throw new p("Unsupported field: QuarterOfYear");
                }
                return range();
            }

            @Override // j$.time.temporal.TemporalField
            public final k r(k kVar, long j) {
                long jK = k(kVar);
                range().b(j, this);
                ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
                return kVar.d(((j - jK) * 3) + kVar.u(chronoField), chronoField);
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "QuarterOfYear";
            }
        };
        QUARTER_OF_YEAR = fVar2;
        f fVar3 = new f() { // from class: j$.time.temporal.d
            @Override // j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ValueRange.g(52L, 53L);
            }

            @Override // j$.time.temporal.TemporalField
            public final TemporalUnit getBaseUnit() {
                return ChronoUnit.WEEKS;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean q(l lVar) {
                if (!lVar.f(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar4 = h.a;
                return j$.com.android.tools.r8.a.M(lVar).equals(r.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final ValueRange u(l lVar) {
                if (q(lVar)) {
                    return f.N(LocalDate.M(lVar));
                }
                throw new p("Unsupported field: WeekOfWeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final long k(l lVar) {
                if (!q(lVar)) {
                    throw new p("Unsupported field: WeekOfWeekBasedYear");
                }
                return f.K(LocalDate.M(lVar));
            }

            @Override // j$.time.temporal.TemporalField
            public final k r(k kVar, long j) {
                range().b(j, this);
                return kVar.e(j$.com.android.tools.r8.a.V(j, k(kVar)), ChronoUnit.WEEKS);
            }

            @Override // j$.time.temporal.f, j$.time.temporal.TemporalField
            public final l n(HashMap map, w wVar, x xVar) {
                LocalDate localDateD;
                long j;
                long j2;
                TemporalField temporalField = f.WEEK_BASED_YEAR;
                Long l = (Long) map.get(temporalField);
                ChronoField chronoField = ChronoField.DAY_OF_WEEK;
                Long l2 = (Long) map.get(chronoField);
                if (l == null || l2 == null) {
                    return null;
                }
                int iA = temporalField.range().a(l.longValue(), temporalField);
                long jLongValue = ((Long) map.get(f.WEEK_OF_WEEK_BASED_YEAR)).longValue();
                f fVar4 = h.a;
                if (!j$.com.android.tools.r8.a.M(wVar).equals(r.c)) {
                    throw new j$.time.b("Resolve requires IsoChronology");
                }
                LocalDate localDateOf = LocalDate.of(iA, 1, 4);
                if (xVar == x.LENIENT) {
                    long jLongValue2 = l2.longValue();
                    if (jLongValue2 > 7) {
                        long j3 = jLongValue2 - 1;
                        j = 1;
                        localDateOf = localDateOf.V(j3 / 7);
                        j2 = j3 % 7;
                    } else {
                        j = 1;
                        if (jLongValue2 < 1) {
                            localDateOf = localDateOf.V(j$.com.android.tools.r8.a.V(jLongValue2, 7L) / 7);
                            j2 = (jLongValue2 + 6) % 7;
                        }
                        localDateD = localDateOf.V(j$.com.android.tools.r8.a.V(jLongValue, j)).d(jLongValue2, chronoField);
                    }
                    jLongValue2 = j2 + j;
                    localDateD = localDateOf.V(j$.com.android.tools.r8.a.V(jLongValue, j)).d(jLongValue2, chronoField);
                } else {
                    int iA2 = chronoField.c.a(l2.longValue(), chronoField);
                    if (jLongValue < 1 || jLongValue > 52) {
                        if (xVar == x.STRICT) {
                            f.N(localDateOf).b(jLongValue, this);
                        } else {
                            range().b(jLongValue, this);
                        }
                    }
                    localDateD = localDateOf.V(jLongValue - 1).d(iA2, chronoField);
                }
                map.remove(this);
                map.remove(temporalField);
                map.remove(chronoField);
                return localDateD;
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekOfWeekBasedYear";
            }
        };
        WEEK_OF_WEEK_BASED_YEAR = fVar3;
        f fVar4 = new f() { // from class: j$.time.temporal.e
            @Override // j$.time.temporal.TemporalField
            public final TemporalUnit getBaseUnit() {
                return h.d;
            }

            @Override // j$.time.temporal.TemporalField
            public final ValueRange range() {
                return ChronoField.YEAR.c;
            }

            @Override // j$.time.temporal.TemporalField
            public final boolean q(l lVar) {
                if (!lVar.f(ChronoField.EPOCH_DAY)) {
                    return false;
                }
                f fVar5 = h.a;
                return j$.com.android.tools.r8.a.M(lVar).equals(r.c);
            }

            @Override // j$.time.temporal.TemporalField
            public final long k(l lVar) {
                if (q(lVar)) {
                    return f.L(LocalDate.M(lVar));
                }
                throw new p("Unsupported field: WeekBasedYear");
            }

            @Override // j$.time.temporal.TemporalField
            public final ValueRange u(l lVar) {
                if (!q(lVar)) {
                    throw new p("Unsupported field: WeekBasedYear");
                }
                return range();
            }

            @Override // j$.time.temporal.TemporalField
            public final k r(k kVar, long j) {
                if (!q(kVar)) {
                    throw new p("Unsupported field: WeekBasedYear");
                }
                int iA = ChronoField.YEAR.c.a(j, f.WEEK_BASED_YEAR);
                LocalDate localDateM = LocalDate.M(kVar);
                int i = localDateM.get(ChronoField.DAY_OF_WEEK);
                int iK = f.K(localDateM);
                if (iK == 53 && f.M(iA) == 52) {
                    iK = 52;
                }
                return kVar.q(LocalDate.of(iA, 1, 4).T(((iK - 1) * 7) + (i - r6.get(r0))));
            }

            @Override // java.lang.Enum
            public final String toString() {
                return "WeekBasedYear";
            }
        };
        WEEK_BASED_YEAR = fVar4;
        b = new f[]{fVar, fVar2, fVar3, fVar4};
        a = new int[]{0, 90, 181, 273, 0, 91, 182, 274};
    }

    public static ValueRange N(LocalDate localDate) {
        return ValueRange.f(1L, M(L(localDate)));
    }

    public static int M(int i) {
        LocalDate localDateOf = LocalDate.of(i, 1, 1);
        if (localDateOf.getDayOfWeek() != DayOfWeek.THURSDAY) {
            return (localDateOf.getDayOfWeek() == DayOfWeek.WEDNESDAY && localDateOf.P()) ? 53 : 52;
        }
        return 53;
    }

    public static int K(LocalDate localDate) {
        int iOrdinal = localDate.getDayOfWeek().ordinal();
        int dayOfYear = localDate.getDayOfYear() - 1;
        int i = (3 - iOrdinal) + dayOfYear;
        int i2 = i - ((i / 7) * 7);
        int i3 = i2 - 3;
        if (i3 < -3) {
            i3 = i2 + 4;
        }
        if (dayOfYear >= i3) {
            int i4 = ((dayOfYear - i3) / 7) + 1;
            if (i4 != 53 || i3 == -3 || (i3 == -2 && localDate.P())) {
                return i4;
            }
            return 1;
        }
        if (localDate.getDayOfYear() != 180) {
            localDate = LocalDate.ofYearDay(localDate.a, 180);
        }
        return (int) N(localDate.W(-1L)).getMaximum();
    }

    public static int L(LocalDate localDate) {
        int i = localDate.a;
        int dayOfYear = localDate.getDayOfYear();
        if (dayOfYear <= 3) {
            return dayOfYear - localDate.getDayOfWeek().ordinal() < -2 ? i - 1 : i;
        }
        if (dayOfYear >= 363) {
            return ((dayOfYear - 363) - (localDate.P() ? 1 : 0)) - localDate.getDayOfWeek().ordinal() >= 0 ? i + 1 : i;
        }
        return i;
    }
}
