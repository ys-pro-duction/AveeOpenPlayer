package j$.time;

import com.revenuecat.purchases.common.UtilsKt;
import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class Instant implements j$.time.temporal.k, TemporalAdjuster, Comparable<Instant>, Serializable {
    public static final Instant c = new Instant(0, 0);
    private static final long serialVersionUID = -665713676816604388L;
    public final long a;
    public final int b;

    @Override // java.lang.Comparable
    public final int compareTo(Instant instant) {
        Instant instant2 = instant;
        int iCompare = Long.compare(this.a, instant2.a);
        return iCompare != 0 ? iCompare : this.b - instant2.b;
    }

    static {
        L(-31557014167219200L, 0L);
        L(31556889864403199L, 999999999L);
    }

    public static Instant L(long j, long j2) {
        return K(j$.com.android.tools.r8.a.O(j, j$.com.android.tools.r8.a.T(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.S(j2, 1000000000L));
    }

    public static Instant K(long j, int i) {
        if ((((long) i) | j) == 0) {
            return c;
        }
        if (j < -31557014167219200L || j > 31556889864403199L) {
            throw new b("Instant exceeds minimum or maximum instant");
        }
        return new Instant(j, i);
    }

    public Instant(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.INSTANT_SECONDS || temporalField == ChronoField.NANO_OF_SECOND || temporalField == ChronoField.MICRO_OF_SECOND || temporalField == ChronoField.MILLI_OF_SECOND : temporalField != null && temporalField.q(this);
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return j$.time.temporal.o.d(this, temporalField).a(temporalField.k(this), temporalField);
        }
        int i = d.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.b;
        if (i == 1) {
            return i2;
        }
        if (i == 2) {
            return i2 / 1000;
        }
        if (i == 3) {
            return i2 / UtilsKt.MICROS_MULTIPLIER;
        }
        if (i == 4) {
            ChronoField chronoField = ChronoField.INSTANT_SECONDS;
            chronoField.c.a(this.a, chronoField);
        }
        throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        int i2 = d.a[((ChronoField) temporalField).ordinal()];
        int i3 = this.b;
        if (i2 == 1) {
            return i3;
        }
        if (i2 == 2) {
            i = i3 / 1000;
        } else {
            if (i2 != 3) {
                if (i2 == 4) {
                    return this.a;
                }
                throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
            }
            i = i3 / UtilsKt.MICROS_MULTIPLIER;
        }
        return i;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k d(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (Instant) temporalField.r(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.K(j);
        int i = d.a[chronoField.ordinal()];
        int i2 = this.b;
        long j2 = this.a;
        if (i != 1) {
            if (i == 2) {
                int i3 = ((int) j) * 1000;
                if (i3 != i2) {
                    return K(j2, i3);
                }
            } else if (i == 3) {
                int i4 = ((int) j) * UtilsKt.MICROS_MULTIPLIER;
                if (i4 != i2) {
                    return K(j2, i4);
                }
            } else {
                if (i != 4) {
                    throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
                }
                if (j != j2) {
                    return K(j, i2);
                }
            }
        } else if (j != i2) {
            return K(j2, (int) j);
        }
        return this;
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final Instant e(long j, TemporalUnit temporalUnit) {
        if (!(temporalUnit instanceof ChronoUnit)) {
            return (Instant) temporalUnit.k(this, j);
        }
        switch (d.b[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(0L, j);
            case 2:
                return M(j / 1000000, (j % 1000000) * 1000);
            case 3:
                return M(j / 1000, (j % 1000) * 1000000);
            case 4:
                return M(j, 0L);
            case 5:
                return M(j$.com.android.tools.r8.a.U(j, 60), 0L);
            case 6:
                return M(j$.com.android.tools.r8.a.U(j, 3600), 0L);
            case 7:
                return M(j$.com.android.tools.r8.a.U(j, 43200), 0L);
            case 8:
                return M(j$.com.android.tools.r8.a.U(j, 86400), 0L);
            default:
                throw new j$.time.temporal.p("Unsupported unit: " + temporalUnit);
        }
    }

    public final Instant M(long j, long j2) {
        if ((j | j2) == 0) {
            return this;
        }
        return L(j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.O(this.a, j), j2 / 1000000000), ((long) this.b) + (j2 % 1000000000));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        if (fVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        if (fVar == j$.time.temporal.o.b || fVar == j$.time.temporal.o.a || fVar == j$.time.temporal.o.e || fVar == j$.time.temporal.o.d || fVar == j$.time.temporal.o.f || fVar == j$.time.temporal.o.g) {
            return null;
        }
        return fVar.h(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(this.a, ChronoField.INSTANT_SECONDS).d(this.b, ChronoField.NANO_OF_SECOND);
    }

    public OffsetDateTime atOffset(ZoneOffset zoneOffset) {
        return OffsetDateTime.K(this, zoneOffset);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Instant) {
            Instant instant = (Instant) obj;
            if (this.a == instant.a && this.b == instant.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        return (this.b * 51) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return DateTimeFormatter.f.a(this);
    }

    private Object writeReplace() {
        return new o((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (Instant) j$.com.android.tools.r8.a.a(localDate, this);
    }
}
