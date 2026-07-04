package j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import j$.time.chrono.ChronoZonedDateTime;
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
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ZonedDateTime implements j$.time.temporal.k, ChronoZonedDateTime<LocalDate>, Serializable {
    private static final long serialVersionUID = -6260982410461394882L;
    public final LocalDateTime a;
    public final ZoneOffset b;
    public final ZoneId c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long J() {
        return j$.com.android.tools.r8.a.y(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.h(this, chronoZonedDateTime);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return compareTo((ChronoZonedDateTime) chronoZonedDateTime);
    }

    public static ZonedDateTime now() {
        a aVarZ = j$.com.android.tools.r8.a.Z();
        Objects.requireNonNull(aVarZ, "clock");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.c;
        long j = 1000;
        Instant instantK = Instant.K(j$.com.android.tools.r8.a.T(jCurrentTimeMillis, j), ((int) j$.com.android.tools.r8.a.S(jCurrentTimeMillis, j)) * UtilsKt.MICROS_MULTIPLIER);
        Objects.requireNonNull(instantK, "instant");
        ZoneId zoneId = aVarZ.a;
        Objects.requireNonNull(zoneId, "zone");
        return y(instantK.a, instantK.b, zoneId);
    }

    public static ZonedDateTime of(LocalDate localDate, LocalTime localTime, ZoneId zoneId) {
        return K(LocalDateTime.N(localDate, localTime), zoneId, null);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) c()).a();
    }

    public static ZonedDateTime of(int i, int i2, int i3, int i4, int i5, int i6, int i7, ZoneId zoneId) {
        LocalDateTime localDateTime = LocalDateTime.MIN;
        return K(new LocalDateTime(LocalDate.of(i, i2, i3), LocalTime.O(i4, i5, i6, i7)), zoneId, null);
    }

    public static ZonedDateTime K(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new ZonedDateTime(localDateTime, zoneId, (ZoneOffset) zoneId);
        }
        j$.time.zone.f fVarK = zoneId.K();
        List listF = fVarK.f(localDateTime);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) Objects.requireNonNull((ZoneOffset) listF.get(0), "offset");
            }
        } else {
            Object objE = fVarK.e(localDateTime);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            localDateTime = localDateTime.R(Duration.n(bVar.d.b - bVar.c.b, 0).a);
            zoneOffset = bVar.d;
        }
        return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
    }

    public final ZonedDateTime L(LocalDateTime localDateTime) {
        Objects.requireNonNull(localDateTime, "localDateTime");
        ZoneOffset zoneOffset = this.b;
        Objects.requireNonNull(zoneOffset, "offset");
        ZoneId zoneId = this.c;
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId.K().f(localDateTime).contains(zoneOffset)) {
            return new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        localDateTime.getClass();
        return y(j$.com.android.tools.r8.a.x(localDateTime, zoneOffset), localDateTime.b.d, zoneId);
    }

    public static ZonedDateTime y(long j, int i, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.K().d(Instant.L(j, i));
        return new ZonedDateTime(LocalDateTime.O(j, i, zoneOffsetD), zoneId, zoneOffsetD);
    }

    public ZonedDateTime(LocalDateTime localDateTime, ZoneId zoneId, ZoneOffset zoneOffset) {
        this.a = localDateTime;
        this.b = zoneOffset;
        this.c = zoneId;
    }

    public final ZonedDateTime M(LocalDateTime localDateTime) {
        return K(localDateTime, this.c, this.b);
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.q(this);
    }

    public int getHour() {
        return this.a.b.a;
    }

    public int getMinute() {
        return this.a.b.b;
    }

    public int getSecond() {
        return this.a.b.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC10375b c() {
        return this.a.a;
    }

    public int getYear() {
        return this.a.a.a;
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.OFFSET_SECONDS) {
                return ((ChronoField) temporalField).c;
            }
            return this.a.r(temporalField);
        }
        return temporalField.u(this);
    }

    public int getMonthValue() {
        return this.a.a.b;
    }

    public int getDayOfMonth() {
        return this.a.a.getDayOfMonth();
    }

    public Month getMonth() {
        return Month.N(this.a.a.b);
    }

    @Override // j$.time.temporal.l
    public int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = u.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                throw new j$.time.temporal.p("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i == 2) {
                return this.b.b;
            }
            return this.a.get(temporalField);
        }
        return j$.com.android.tools.r8.a.m(this, temporalField);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return this.a.b;
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        int i = u.a[((ChronoField) temporalField).ordinal()];
        return i != 1 ? i != 2 ? this.a.u(temporalField) : this.b.b : j$.com.android.tools.r8.a.y(this);
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime i(ZoneId zoneId) {
        Objects.requireNonNull(zoneId, "zone");
        return this.c.equals(zoneId) ? this : K(this.a, zoneId, this.b);
    }

    public ZonedDateTime withDayOfMonth(int i) {
        LocalDateTime localDateTime = this.a;
        LocalDate localDateOf = localDateTime.a;
        if (localDateOf.c != i) {
            localDateOf = LocalDate.of(localDateOf.a, localDateOf.b, i);
        }
        return M(localDateTime.U(localDateOf, localDateTime.b));
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    /* JADX INFO: renamed from: toLocalDateTime, reason: merged with bridge method [inline-methods] */
    public LocalDateTime A() {
        return this.a;
    }

    public ZonedDateTime truncatedTo(TemporalUnit temporalUnit) {
        LocalDateTime localDateTime = this.a;
        return M(localDateTime.U(localDateTime.a, localDateTime.b.truncatedTo(temporalUnit)));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: with, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime q(TemporalAdjuster temporalAdjuster) {
        boolean z = temporalAdjuster instanceof LocalDate;
        LocalDateTime localDateTime = this.a;
        if (z) {
            return M(LocalDateTime.N((LocalDate) temporalAdjuster, localDateTime.b));
        }
        if (temporalAdjuster instanceof LocalTime) {
            return M(LocalDateTime.N(localDateTime.a, (LocalTime) temporalAdjuster));
        }
        if (temporalAdjuster instanceof LocalDateTime) {
            return M((LocalDateTime) temporalAdjuster);
        }
        boolean z2 = temporalAdjuster instanceof OffsetDateTime;
        ZoneId zoneId = this.c;
        if (z2) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) temporalAdjuster;
            return K(offsetDateTime.toLocalDateTime(), zoneId, offsetDateTime.b);
        }
        if (temporalAdjuster instanceof Instant) {
            Instant instant = (Instant) temporalAdjuster;
            return y(instant.a, instant.b, zoneId);
        }
        if (temporalAdjuster instanceof ZoneOffset) {
            ZoneOffset zoneOffset = (ZoneOffset) temporalAdjuster;
            return (zoneOffset.equals(this.b) || !zoneId.K().f(localDateTime).contains(zoneOffset)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffset);
        }
        return (ZonedDateTime) temporalAdjuster.y(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k d(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            int i = u.a[chronoField.ordinal()];
            ZoneId zoneId = this.c;
            LocalDateTime localDateTime = this.a;
            if (i == 1) {
                return y(j, localDateTime.b.d, zoneId);
            }
            if (i == 2) {
                ZoneOffset zoneOffsetR = ZoneOffset.R(chronoField.c.a(j, chronoField));
                return (zoneOffsetR.equals(this.b) || !zoneId.K().f(localDateTime).contains(zoneOffsetR)) ? this : new ZonedDateTime(localDateTime, zoneId, zoneOffsetR);
            }
            return M(localDateTime.d(j, temporalField));
        }
        return (ZonedDateTime) temporalField.r(this, j);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: plus, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            ChronoUnit chronoUnit = (ChronoUnit) temporalUnit;
            int iCompareTo = chronoUnit.compareTo(ChronoUnit.DAYS);
            LocalDateTime localDateTime = this.a;
            if (iCompareTo >= 0 && chronoUnit != ChronoUnit.FOREVER) {
                return M(localDateTime.e(j, temporalUnit));
            }
            return L(localDateTime.e(j, temporalUnit));
        }
        return (ZonedDateTime) temporalUnit.k(this, j);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: minus, reason: merged with bridge method [inline-methods] */
    public ZonedDateTime n(long j, TemporalUnit temporalUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, temporalUnit).e(1L, temporalUnit) : e(-j, temporalUnit);
    }

    public ZonedDateTime minusYears(long j) {
        LocalDateTime localDateTime = this.a;
        if (j != Long.MIN_VALUE) {
            return M(localDateTime.U(localDateTime.a.W(-j), localDateTime.b));
        }
        ZonedDateTime zonedDateTimeM = M(localDateTime.U(localDateTime.a.W(Long.MAX_VALUE), localDateTime.b));
        LocalDateTime localDateTime2 = zonedDateTimeM.a;
        return zonedDateTimeM.M(localDateTime2.U(localDateTime2.a.W(1L), localDateTime2.b));
    }

    public ZonedDateTime minusMonths(long j) {
        LocalDateTime localDateTime = this.a;
        if (j != Long.MIN_VALUE) {
            return M(localDateTime.U(localDateTime.a.U(-j), localDateTime.b));
        }
        ZonedDateTime zonedDateTimeM = M(localDateTime.U(localDateTime.a.U(Long.MAX_VALUE), localDateTime.b));
        LocalDateTime localDateTime2 = zonedDateTimeM.a;
        return zonedDateTimeM.M(localDateTime2.U(localDateTime2.a.U(1L), localDateTime2.b));
    }

    public ZonedDateTime minusSeconds(long j) {
        LocalDateTime localDateTime = this.a;
        if (j != Long.MIN_VALUE) {
            return L(localDateTime.R(-j));
        }
        ZonedDateTime zonedDateTimeL = L(localDateTime.R(Long.MAX_VALUE));
        return zonedDateTimeL.L(zonedDateTimeL.a.R(1L));
    }

    public ZonedDateTime minusNanos(long j) {
        LocalDateTime localDateTime = this.a;
        if (j != Long.MIN_VALUE) {
            return L(localDateTime.Q(-j));
        }
        ZonedDateTime zonedDateTimeL = L(localDateTime.Q(Long.MAX_VALUE));
        return zonedDateTimeL.L(zonedDateTimeL.a.Q(1L));
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        if (fVar == j$.time.temporal.o.f) {
            return this.a.a;
        }
        return j$.com.android.tools.r8.a.v(this, fVar);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZonedDateTime) {
            ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
            if (this.a.equals(zonedDateTime.a) && this.b.equals(zonedDateTime.b) && this.c.equals(zonedDateTime.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.a.hashCode() ^ this.b.b) ^ Integer.rotateLeft(this.c.hashCode(), 3);
    }

    public final String toString() {
        String string = this.a.toString();
        ZoneOffset zoneOffset = this.b;
        String str = string + zoneOffset.c;
        ZoneId zoneId = this.c;
        if (zoneOffset == zoneId) {
            return str;
        }
        return str + "[" + zoneId.toString() + "]";
    }

    private Object writeReplace() {
        return new o((byte) 6, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
