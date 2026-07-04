package j$.time;

import com.google.android.gms.ads.RequestConfiguration;
import com.revenuecat.purchases.common.UtilsKt;
import j$.time.chrono.ChronoLocalDateTime;
import j$.time.chrono.ChronoZonedDateTime;
import j$.time.chrono.InterfaceC10375b;
import j$.time.format.DateTimeFormatter;
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
public final class LocalDateTime implements j$.time.temporal.k, TemporalAdjuster, ChronoLocalDateTime<LocalDate>, Serializable {
    public static final LocalDateTime MIN = N(LocalDate.d, LocalTime.e);
    public static final LocalDateTime c = N(LocalDate.e, LocalTime.MAX);
    private static final long serialVersionUID = 6207766400415563566L;
    public final LocalDate a;
    public final LocalTime b;

    public static LocalDateTime now() {
        a aVarZ = j$.com.android.tools.r8.a.Z();
        Objects.requireNonNull(aVarZ, "clock");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Instant instant = Instant.c;
        long j = 1000;
        Instant instantK = Instant.K(j$.com.android.tools.r8.a.T(jCurrentTimeMillis, j), ((int) j$.com.android.tools.r8.a.S(jCurrentTimeMillis, j)) * UtilsKt.MICROS_MULTIPLIER);
        return O(instantK.a, instantK.b, aVarZ.a.K().d(instantK));
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final j$.time.chrono.k a() {
        return ((LocalDate) c()).a();
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime o(ZoneId zoneId) {
        return ZonedDateTime.K(this, zoneId, null);
    }

    public static LocalDateTime N(LocalDate localDate, LocalTime localTime) {
        Objects.requireNonNull(localDate, "date");
        Objects.requireNonNull(localTime, "time");
        return new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(((LocalDate) c()).v(), ChronoField.EPOCH_DAY).d(b().W(), ChronoField.NANO_OF_DAY);
    }

    public static LocalDateTime O(long j, int i, ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        long j2 = i;
        ChronoField.NANO_OF_SECOND.K(j2);
        long j3 = j + ((long) zoneOffset.b);
        long j4 = 86400;
        return new LocalDateTime(LocalDate.R(j$.com.android.tools.r8.a.T(j3, j4)), LocalTime.P((((long) ((int) j$.com.android.tools.r8.a.S(j3, j4))) * 1000000000) + j2));
    }

    public static LocalDateTime L(j$.time.temporal.l lVar) {
        if (lVar instanceof LocalDateTime) {
            return (LocalDateTime) lVar;
        }
        if (lVar instanceof ZonedDateTime) {
            return ((ZonedDateTime) lVar).A();
        }
        if (lVar instanceof OffsetDateTime) {
            return ((OffsetDateTime) lVar).toLocalDateTime();
        }
        try {
            return new LocalDateTime(LocalDate.M(lVar), LocalTime.M(lVar));
        } catch (b e) {
            throw new b("Unable to obtain LocalDateTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName(), e);
        }
    }

    public static LocalDateTime parse(CharSequence charSequence, DateTimeFormatter dateTimeFormatter) {
        String string;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        f fVar = new f(0);
        dateTimeFormatter.getClass();
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(fVar, "query");
        try {
            return (LocalDateTime) dateTimeFormatter.b(charSequence).k(fVar);
        } catch (j$.time.format.q e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                string = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                string = charSequence.toString();
            }
            j$.time.format.q qVar = new j$.time.format.q("Text '" + string + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw qVar;
        }
    }

    public LocalDateTime(LocalDate localDate, LocalTime localTime) {
        this.a = localDate;
        this.b = localTime;
    }

    public final LocalDateTime U(LocalDate localDate, LocalTime localTime) {
        return (this.a == localDate && this.b == localTime) ? this : new LocalDateTime(localDate, localTime);
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField != null && temporalField.q(this);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        return chronoField.y() || chronoField.L();
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (((ChronoField) temporalField).L()) {
                LocalTime localTime = this.b;
                localTime.getClass();
                return j$.time.temporal.o.d(localTime, temporalField);
            }
            return this.a.r(temporalField);
        }
        return temporalField.u(this);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).L() ? this.b.get(temporalField) : this.a.get(temporalField);
        }
        return j$.time.temporal.o.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).L() ? this.b.u(temporalField) : this.a.u(temporalField);
        }
        return temporalField.k(this);
    }

    public final int K(LocalDateTime localDateTime) {
        int iK = this.a.K(localDateTime.a);
        return iK == 0 ? this.b.compareTo(localDateTime.b) : iK;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC10375b c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime b() {
        return this.b;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return U(localDate, this.b);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime d(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            boolean zL = ((ChronoField) temporalField).L();
            LocalTime localTime = this.b;
            LocalDate localDate = this.a;
            if (zL) {
                return U(localDate, localTime.d(j, temporalField));
            }
            return U(localDate.d(j, temporalField), localTime);
        }
        return (LocalDateTime) temporalField.r(this, j);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public final LocalDateTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            int i = g.a[((ChronoUnit) temporalUnit).ordinal()];
            LocalTime localTime = this.b;
            LocalDate localDate = this.a;
            switch (i) {
                case 1:
                    return Q(j);
                case 2:
                    return U(localDate.T(j / 86400000000L), localTime).Q((j % 86400000000L) * 1000);
                case 3:
                    return U(localDate.T(j / 86400000), localTime).Q((j % 86400000) * 1000000);
                case 4:
                    return R(j);
                case 5:
                    return S(this.a, 0L, j, 0L, 0L);
                case 6:
                    return S(this.a, j, 0L, 0L, 0L);
                case 7:
                    LocalDateTime localDateTimeU = U(localDate.T(j / 256), localTime);
                    return localDateTimeU.S(localDateTimeU.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return U(localDate.e(j, temporalUnit), localTime);
            }
        }
        return (LocalDateTime) temporalUnit.k(this, j);
    }

    public final LocalDateTime R(long j) {
        return S(this.a, 0L, 0L, j, 0L);
    }

    public final LocalDateTime Q(long j) {
        return S(this.a, 0L, 0L, 0L, j);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    public final LocalDateTime S(LocalDate localDate, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeP = this.b;
        if (j5 == 0) {
            return U(localDate, localTimeP);
        }
        long j6 = j / 24;
        long j7 = j6 + (j2 / 1440) + (j3 / 86400) + (j4 / 86400000000000L);
        long j8 = 1;
        long j9 = ((j % 24) * 3600000000000L) + ((j2 % 1440) * 60000000000L) + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jW = localTimeP.W();
        long j10 = (j9 * j8) + jW;
        long jT = j$.com.android.tools.r8.a.T(j10, 86400000000000L) + (j7 * j8);
        long jS = j$.com.android.tools.r8.a.S(j10, 86400000000000L);
        if (jS != jW) {
            localTimeP = LocalTime.P(jS);
        }
        return U(localDate.T(jT), localTimeP);
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        if (fVar == j$.time.temporal.o.f) {
            return this.a;
        }
        return j$.com.android.tools.r8.a.u(this, fVar);
    }

    public String format(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return dateTimeFormatter.a(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    public int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return K((LocalDateTime) chronoLocalDateTime);
        }
        return j$.com.android.tools.r8.a.g(this, chronoLocalDateTime);
    }

    public final boolean M(ChronoLocalDateTime chronoLocalDateTime) {
        if (chronoLocalDateTime instanceof LocalDateTime) {
            return K((LocalDateTime) chronoLocalDateTime) < 0;
        }
        long jV = this.a.v();
        long jV2 = chronoLocalDateTime.c().v();
        if (jV >= jV2) {
            return jV == jV2 && this.b.W() < chronoLocalDateTime.b().W();
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalDateTime) {
            LocalDateTime localDateTime = (LocalDateTime) obj;
            if (this.a.equals(localDateTime.a) && this.b.equals(localDateTime.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.b.toString();
    }

    private Object writeReplace() {
        return new o((byte) 5, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
