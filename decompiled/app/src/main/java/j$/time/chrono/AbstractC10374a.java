package j$.time.chrono;

import j$.time.DayOfWeek;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjusters;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10374a implements k {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();

    public abstract /* synthetic */ InterfaceC10375b n();

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return m().compareTo(((k) obj).m());
    }

    static {
        new Locale("ja", "JP", "JP");
    }

    public static k q(AbstractC10374a abstractC10374a, String str) {
        String strT;
        k kVar = (k) a.putIfAbsent(str, abstractC10374a);
        if (kVar == null && (strT = abstractC10374a.t()) != null) {
            b.putIfAbsent(strT, abstractC10374a);
        }
        return kVar;
    }

    @Override // j$.time.chrono.k
    public InterfaceC10375b D(Map map, j$.time.format.x xVar) {
        ChronoField chronoField = ChronoField.EPOCH_DAY;
        if (map.containsKey(chronoField)) {
            return l(((Long) map.remove(chronoField)).longValue());
        }
        u(map, xVar);
        InterfaceC10375b interfaceC10375bK = K(map, xVar);
        if (interfaceC10375bK != null) {
            return interfaceC10375bK;
        }
        ChronoField chronoField2 = ChronoField.YEAR;
        if (!map.containsKey(chronoField2)) {
            return null;
        }
        ChronoField chronoField3 = ChronoField.MONTH_OF_YEAR;
        if (map.containsKey(chronoField3)) {
            if (map.containsKey(ChronoField.DAY_OF_MONTH)) {
                return y(map, xVar);
            }
            ChronoField chronoField4 = ChronoField.ALIGNED_WEEK_OF_MONTH;
            if (map.containsKey(chronoField4)) {
                ChronoField chronoField5 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH;
                if (map.containsKey(chronoField5)) {
                    int iA = E(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (xVar == j$.time.format.x.LENIENT) {
                        long jV = j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField3)).longValue(), 1L);
                        return B(iA, 1, 1).e(jV, (TemporalUnit) ChronoUnit.MONTHS).e(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField4)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField5)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
                    }
                    int iA2 = E(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    int iA3 = E(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4);
                    InterfaceC10375b interfaceC10375bE = B(iA, iA2, 1).e((E(chronoField5).a(((Long) map.remove(chronoField5)).longValue(), chronoField5) - 1) + ((iA3 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
                    if (xVar != j$.time.format.x.STRICT || interfaceC10375bE.get(chronoField3) == iA2) {
                        return interfaceC10375bE;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
                ChronoField chronoField6 = ChronoField.DAY_OF_WEEK;
                if (map.containsKey(chronoField6)) {
                    int iA4 = E(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
                    if (xVar == j$.time.format.x.LENIENT) {
                        return r(B(iA4, 1, 1), j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField3)).longValue(), 1L), j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField4)).longValue(), 1L), j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField6)).longValue(), 1L));
                    }
                    int iA5 = E(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
                    InterfaceC10375b interfaceC10375bQ = B(iA4, iA5, 1).e((E(chronoField4).a(((Long) map.remove(chronoField4)).longValue(), chronoField4) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).q(new j$.time.temporal.m(DayOfWeek.of(E(chronoField6).a(((Long) map.remove(chronoField6)).longValue(), chronoField6)).getValue(), 0));
                    if (xVar != j$.time.format.x.STRICT || interfaceC10375bQ.get(chronoField3) == iA5) {
                        return interfaceC10375bQ;
                    }
                    throw new j$.time.b("Strict mode rejected resolved date as it is in a different month");
                }
            }
        }
        ChronoField chronoField7 = ChronoField.DAY_OF_YEAR;
        if (map.containsKey(chronoField7)) {
            int iA6 = E(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (xVar != j$.time.format.x.LENIENT) {
                return w(iA6, E(chronoField7).a(((Long) map.remove(chronoField7)).longValue(), chronoField7));
            }
            return w(iA6, 1).e(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField7)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField8 = ChronoField.ALIGNED_WEEK_OF_YEAR;
        if (!map.containsKey(chronoField8)) {
            return null;
        }
        ChronoField chronoField9 = ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR;
        if (map.containsKey(chronoField9)) {
            int iA7 = E(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
            if (xVar == j$.time.format.x.LENIENT) {
                return w(iA7, 1).e(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField8)).longValue(), 1L), (TemporalUnit) ChronoUnit.WEEKS).e(j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField9)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
            }
            int iA8 = E(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8);
            InterfaceC10375b interfaceC10375bE2 = w(iA7, 1).e((E(chronoField9).a(((Long) map.remove(chronoField9)).longValue(), chronoField9) - 1) + ((iA8 - 1) * 7), (TemporalUnit) ChronoUnit.DAYS);
            if (xVar != j$.time.format.x.STRICT || interfaceC10375bE2.get(chronoField2) == iA7) {
                return interfaceC10375bE2;
            }
            throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
        }
        ChronoField chronoField10 = ChronoField.DAY_OF_WEEK;
        if (!map.containsKey(chronoField10)) {
            return null;
        }
        int iA9 = E(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        if (xVar == j$.time.format.x.LENIENT) {
            return r(w(iA9, 1), 0L, j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField8)).longValue(), 1L), j$.com.android.tools.r8.a.V(((Long) map.remove(chronoField10)).longValue(), 1L));
        }
        InterfaceC10375b interfaceC10375bQ2 = w(iA9, 1).e((E(chronoField8).a(((Long) map.remove(chronoField8)).longValue(), chronoField8) - 1) * 7, (TemporalUnit) ChronoUnit.DAYS).q(new j$.time.temporal.m(DayOfWeek.of(E(chronoField10).a(((Long) map.remove(chronoField10)).longValue(), chronoField10)).getValue(), 0));
        if (xVar != j$.time.format.x.STRICT || interfaceC10375bQ2.get(chronoField2) == iA9) {
            return interfaceC10375bQ2;
        }
        throw new j$.time.b("Strict mode rejected resolved date as it is in a different year");
    }

    @Override // j$.time.chrono.k
    public ChronoLocalDateTime s(LocalDateTime localDateTime) {
        try {
            return p(localDateTime).x(LocalTime.M(localDateTime));
        } catch (j$.time.b e) {
            throw new j$.time.b("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e);
        }
    }

    public void u(Map map, j$.time.format.x xVar) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (xVar != j$.time.format.x.LENIENT) {
                chronoField.K(l.longValue());
            }
            InterfaceC10375b interfaceC10375bD = n().d(1L, (TemporalField) ChronoField.DAY_OF_MONTH).d(l.longValue(), (TemporalField) chronoField);
            k(map, ChronoField.MONTH_OF_YEAR, interfaceC10375bD.get(r0));
            k(map, ChronoField.YEAR, interfaceC10375bD.get(r0));
        }
    }

    public InterfaceC10375b K(Map map, j$.time.format.x xVar) {
        int iA;
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l == null) {
            ChronoField chronoField2 = ChronoField.ERA;
            if (!map.containsKey(chronoField2)) {
                return null;
            }
            E(chronoField2).b(((Long) map.get(chronoField2)).longValue(), chronoField2);
            return null;
        }
        Long l2 = (Long) map.remove(ChronoField.ERA);
        if (xVar != j$.time.format.x.LENIENT) {
            iA = E(chronoField).a(l.longValue(), chronoField);
        } else {
            long jLongValue = l.longValue();
            int i = (int) jLongValue;
            if (jLongValue != i) {
                throw new ArithmeticException();
            }
            iA = i;
        }
        if (l2 != null) {
            k(map, ChronoField.YEAR, g(I(E(r2).a(l2.longValue(), r2)), iA));
            return null;
        }
        ChronoField chronoField3 = ChronoField.YEAR;
        if (map.containsKey(chronoField3)) {
            k(map, chronoField3, g(w(E(chronoField3).a(((Long) map.get(chronoField3)).longValue(), chronoField3), 1).z(), iA));
            return null;
        }
        if (xVar == j$.time.format.x.STRICT) {
            map.put(chronoField, l);
            return null;
        }
        if (G().isEmpty()) {
            k(map, chronoField3, iA);
            return null;
        }
        k(map, chronoField3, g((l) r12.get(r12.size() - 1), iA));
        return null;
    }

    public InterfaceC10375b y(Map map, j$.time.format.x xVar) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = E(chronoField).a(((Long) map.remove(chronoField)).longValue(), chronoField);
        if (xVar == j$.time.format.x.LENIENT) {
            long jV = j$.com.android.tools.r8.a.V(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L);
            return B(iA, 1, 1).e(jV, (TemporalUnit) ChronoUnit.MONTHS).e(j$.com.android.tools.r8.a.V(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L), (TemporalUnit) ChronoUnit.DAYS);
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = E(chronoField2).a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = E(chronoField3).a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (xVar == j$.time.format.x.SMART) {
            try {
                return B(iA, iA2, iA3);
            } catch (j$.time.b unused) {
                return B(iA, iA2, 1).q(TemporalAdjusters.lastDayOfMonth());
            }
        }
        return B(iA, iA2, iA3);
    }

    public static InterfaceC10375b r(InterfaceC10375b interfaceC10375b, long j, long j2, long j3) {
        long j4;
        InterfaceC10375b interfaceC10375bE = interfaceC10375b.e(j, (TemporalUnit) ChronoUnit.MONTHS);
        ChronoUnit chronoUnit = ChronoUnit.WEEKS;
        InterfaceC10375b interfaceC10375bE2 = interfaceC10375bE.e(j2, (TemporalUnit) chronoUnit);
        if (j3 > 7) {
            long j5 = j3 - 1;
            interfaceC10375bE2 = interfaceC10375bE2.e(j5 / 7, (TemporalUnit) chronoUnit);
            j4 = j5 % 7;
        } else {
            if (j3 < 1) {
                interfaceC10375bE2 = interfaceC10375bE2.e(j$.com.android.tools.r8.a.V(j3, 7L) / 7, (TemporalUnit) chronoUnit);
                j4 = (j3 + 6) % 7;
            }
            return interfaceC10375bE2.q(new j$.time.temporal.m(DayOfWeek.of((int) j3).getValue(), 0));
        }
        j3 = j4 + 1;
        return interfaceC10375bE2.q(new j$.time.temporal.m(DayOfWeek.of((int) j3).getValue(), 0));
    }

    public static void k(Map map, ChronoField chronoField, long j) {
        Long l = (Long) map.get(chronoField);
        if (l != null && l.longValue() != j) {
            throw new j$.time.b("Conflict found: " + chronoField + " " + l + " differs from " + chronoField + " " + j);
        }
        map.put(chronoField, Long.valueOf(j));
    }

    @Override // j$.time.chrono.k
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC10374a) && m().compareTo(((AbstractC10374a) obj).m()) == 0;
    }

    @Override // j$.time.chrono.k
    public final int hashCode() {
        return getClass().hashCode() ^ m().hashCode();
    }

    @Override // j$.time.chrono.k
    public final String toString() {
        return m();
    }
}
