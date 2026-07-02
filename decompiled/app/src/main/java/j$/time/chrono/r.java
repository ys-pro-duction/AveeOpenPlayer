package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.Month;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class r extends AbstractC10374a implements Serializable {
    public static final r c = new r();
    private static final long serialVersionUID = -1440403870442975015L;

    @Override // j$.time.chrono.k
    public final l I(int i) {
        if (i == 0) {
            return s.BCE;
        }
        if (i == 1) {
            return s.CE;
        }
        throw new j$.time.b("Invalid era: " + i);
    }

    @Override // j$.time.chrono.k
    public final String m() {
        return "ISO";
    }

    @Override // j$.time.chrono.k
    public final String t() {
        return "iso8601";
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b B(int i, int i2, int i3) {
        return LocalDate.of(i, i2, i3);
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b w(int i, int i2) {
        return LocalDate.ofYearDay(i, i2);
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b l(long j) {
        return LocalDate.R(j);
    }

    @Override // j$.time.chrono.k
    public final InterfaceC10375b p(j$.time.temporal.l lVar) {
        return LocalDate.M(lVar);
    }

    private r() {
    }

    @Override // j$.time.chrono.AbstractC10374a, j$.time.chrono.k
    public final ChronoLocalDateTime s(LocalDateTime localDateTime) {
        return LocalDateTime.L(localDateTime);
    }

    @Override // j$.time.chrono.k
    public final ChronoZonedDateTime F(Instant instant, ZoneId zoneId) {
        Objects.requireNonNull(instant, "instant");
        Objects.requireNonNull(zoneId, "zone");
        return ZonedDateTime.y(instant.a, instant.b, zoneId);
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final InterfaceC10375b n() {
        j$.time.a aVarZ = j$.com.android.tools.r8.a.Z();
        Objects.requireNonNull(aVarZ, "clock");
        return LocalDate.M(LocalDate.Q(aVarZ));
    }

    public static boolean L(long j) {
        if ((3 & j) == 0) {
            return j % 100 != 0 || j % 400 == 0;
        }
        return false;
    }

    @Override // j$.time.chrono.k
    public final int g(l lVar, int i) {
        if (lVar instanceof s) {
            return lVar == s.CE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be IsoEra");
    }

    @Override // j$.time.chrono.k
    public final List G() {
        return j$.com.android.tools.r8.a.Q(s.values());
    }

    @Override // j$.time.chrono.AbstractC10374a, j$.time.chrono.k
    public final InterfaceC10375b D(Map map, j$.time.format.x xVar) {
        return (LocalDate) super.D(map, xVar);
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final void u(Map map, j$.time.format.x xVar) {
        ChronoField chronoField = ChronoField.PROLEPTIC_MONTH;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (xVar != j$.time.format.x.LENIENT) {
                chronoField.K(l.longValue());
            }
            AbstractC10374a.k(map, ChronoField.MONTH_OF_YEAR, ((int) j$.com.android.tools.r8.a.S(l.longValue(), r4)) + 1);
            AbstractC10374a.k(map, ChronoField.YEAR, j$.com.android.tools.r8.a.T(l.longValue(), 12));
        }
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final InterfaceC10375b K(Map map, j$.time.format.x xVar) {
        ChronoField chronoField = ChronoField.YEAR_OF_ERA;
        Long l = (Long) map.remove(chronoField);
        if (l != null) {
            if (xVar != j$.time.format.x.LENIENT) {
                chronoField.K(l.longValue());
            }
            Long l2 = (Long) map.remove(ChronoField.ERA);
            if (l2 != null) {
                if (l2.longValue() == 1) {
                    AbstractC10374a.k(map, ChronoField.YEAR, l.longValue());
                    return null;
                }
                if (l2.longValue() == 0) {
                    AbstractC10374a.k(map, ChronoField.YEAR, j$.com.android.tools.r8.a.V(1L, l.longValue()));
                    return null;
                }
                throw new j$.time.b("Invalid value for era: " + l2);
            }
            ChronoField chronoField2 = ChronoField.YEAR;
            Long l3 = (Long) map.get(chronoField2);
            if (xVar != j$.time.format.x.STRICT) {
                AbstractC10374a.k(map, chronoField2, (l3 == null || l3.longValue() > 0) ? l.longValue() : j$.com.android.tools.r8.a.V(1L, l.longValue()));
                return null;
            }
            if (l3 != null) {
                long jLongValue = l3.longValue();
                long jLongValue2 = l.longValue();
                if (jLongValue <= 0) {
                    jLongValue2 = j$.com.android.tools.r8.a.V(1L, jLongValue2);
                }
                AbstractC10374a.k(map, chronoField2, jLongValue2);
                return null;
            }
            map.put(chronoField, l);
            return null;
        }
        ChronoField chronoField3 = ChronoField.ERA;
        if (!map.containsKey(chronoField3)) {
            return null;
        }
        chronoField3.K(((Long) map.get(chronoField3)).longValue());
        return null;
    }

    @Override // j$.time.chrono.AbstractC10374a
    public final InterfaceC10375b y(Map map, j$.time.format.x xVar) {
        ChronoField chronoField = ChronoField.YEAR;
        int iA = chronoField.c.a(((Long) map.remove(chronoField)).longValue(), chronoField);
        boolean z = true;
        if (xVar == j$.time.format.x.LENIENT) {
            return LocalDate.of(iA, 1, 1).U(j$.com.android.tools.r8.a.V(((Long) map.remove(ChronoField.MONTH_OF_YEAR)).longValue(), 1L)).T(j$.com.android.tools.r8.a.V(((Long) map.remove(ChronoField.DAY_OF_MONTH)).longValue(), 1L));
        }
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        int iA2 = chronoField2.c.a(((Long) map.remove(chronoField2)).longValue(), chronoField2);
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        int iA3 = chronoField3.c.a(((Long) map.remove(chronoField3)).longValue(), chronoField3);
        if (xVar == j$.time.format.x.SMART) {
            if (iA2 == 4 || iA2 == 6 || iA2 == 9 || iA2 == 11) {
                iA3 = Math.min(iA3, 30);
            } else if (iA2 == 2) {
                Month month = Month.FEBRUARY;
                long j = iA;
                int i = j$.time.q.b;
                if ((3 & j) != 0 || (j % 100 == 0 && j % 400 != 0)) {
                    z = false;
                }
                iA3 = Math.min(iA3, month.L(z));
            }
        }
        return LocalDate.of(iA, iA2, iA3);
    }

    @Override // j$.time.chrono.k
    public final ValueRange E(ChronoField chronoField) {
        return chronoField.c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public Object writeReplace() {
        return new D((byte) 1, this);
    }
}
