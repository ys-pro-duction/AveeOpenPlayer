package j$.time;

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
public final class m implements j$.time.temporal.k, TemporalAdjuster, Comparable, Serializable {
    public static final /* synthetic */ int c = 0;
    private static final long serialVersionUID = 7264499704384272492L;
    public final LocalTime a;
    public final ZoneOffset b;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        m mVar = (m) obj;
        ZoneOffset zoneOffset = mVar.b;
        ZoneOffset zoneOffset2 = this.b;
        boolean zEquals = zoneOffset2.equals(zoneOffset);
        LocalTime localTime = mVar.a;
        LocalTime localTime2 = this.a;
        if (zEquals) {
            return localTime2.compareTo(localTime);
        }
        int iCompare = Long.compare(localTime2.W() - (((long) zoneOffset2.b) * 1000000000), localTime.W() - (((long) mVar.b.b) * 1000000000));
        return iCompare == 0 ? localTime2.compareTo(localTime) : iCompare;
    }

    static {
        LocalTime localTime = LocalTime.e;
        ZoneOffset zoneOffset = ZoneOffset.g;
        localTime.getClass();
        new m(localTime, zoneOffset);
        LocalTime localTime2 = LocalTime.MAX;
        ZoneOffset zoneOffset2 = ZoneOffset.f;
        localTime2.getClass();
        new m(localTime2, zoneOffset2);
    }

    public m(LocalTime localTime, ZoneOffset zoneOffset) {
        this.a = (LocalTime) Objects.requireNonNull(localTime, "time");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
    }

    public final m L(LocalTime localTime, ZoneOffset zoneOffset) {
        return (this.a == localTime && this.b.equals(zoneOffset)) ? this : new m(localTime, zoneOffset);
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).L() || temporalField == ChronoField.OFFSET_SECONDS : temporalField != null && temporalField.q(this);
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.OFFSET_SECONDS) {
                LocalTime localTime = this.a;
                localTime.getClass();
                return j$.time.temporal.o.d(localTime, temporalField);
            }
            return ((ChronoField) temporalField).c;
        }
        return temporalField.u(this);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        return j$.time.temporal.o.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.OFFSET_SECONDS) {
                return this.b.b;
            }
            return this.a.u(temporalField);
        }
        return temporalField.k(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k d(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = ChronoField.OFFSET_SECONDS;
            LocalTime localTime = this.a;
            if (temporalField == chronoField) {
                ChronoField chronoField2 = (ChronoField) temporalField;
                return L(localTime, ZoneOffset.R(chronoField2.c.a(j, chronoField2)));
            }
            return L(localTime.d(j, temporalField), this.b);
        }
        return (m) temporalField.r(this, j);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final m e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return L(this.a.e(j, temporalUnit), this.b);
        }
        return (m) temporalUnit.k(this, j);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        if (fVar == j$.time.temporal.o.d || fVar == j$.time.temporal.o.e) {
            return this.b;
        }
        if (((fVar == j$.time.temporal.o.a) || (fVar == j$.time.temporal.o.b)) || fVar == j$.time.temporal.o.f) {
            return null;
        }
        if (fVar == j$.time.temporal.o.g) {
            return this.a;
        }
        if (fVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        return fVar.h(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(this.a.W(), ChronoField.NANO_OF_DAY).d(this.b.b, ChronoField.OFFSET_SECONDS);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.a.equals(mVar.a) && this.b.equals(mVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.b;
    }

    public final String toString() {
        return this.a.toString() + this.b.c;
    }

    private Object writeReplace() {
        return new o((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (m) j$.com.android.tools.r8.a.a(localDate, this);
    }
}
