package j$.time.chrono;

import com.google.android.gms.ads.RequestConfiguration;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
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

/* JADX INFO: renamed from: j$.time.chrono.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10379f implements ChronoLocalDateTime, j$.time.temporal.k, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 4556003607393004514L;
    public final transient InterfaceC10375b a;
    public final transient LocalTime b;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoLocalDateTime
    public final /* synthetic */ int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        return j$.com.android.tools.r8.a.g(this, chronoLocalDateTime);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object k(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.u(this, fVar);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoLocalDateTime<?> chronoLocalDateTime) {
        return compareTo((ChronoLocalDateTime) chronoLocalDateTime);
    }

    public static C10379f K(k kVar, j$.time.temporal.k kVar2) {
        C10379f c10379f = (C10379f) kVar2;
        if (kVar.equals(c10379f.a.a())) {
            return c10379f;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.m() + ", actual: " + c10379f.a.a().m());
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final k a() {
        return this.a.a();
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return K(this.a.a(), j$.time.temporal.o.b(this, j, chronoUnit));
    }

    public C10379f(InterfaceC10375b interfaceC10375b, LocalTime localTime) {
        Objects.requireNonNull(interfaceC10375b, "date");
        Objects.requireNonNull(localTime, "time");
        this.a = interfaceC10375b;
        this.b = localTime;
    }

    public final C10379f O(j$.time.temporal.k kVar, LocalTime localTime) {
        InterfaceC10375b interfaceC10375b = this.a;
        return (interfaceC10375b == kVar && this.b == localTime) ? this : new C10379f(AbstractC10377d.K(interfaceC10375b.a(), kVar), localTime);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final InterfaceC10375b c() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final LocalTime b() {
        return this.b;
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
            if (!((ChronoField) temporalField).L()) {
                return this.a.r(temporalField);
            }
            LocalTime localTime = this.b;
            localTime.getClass();
            return j$.time.temporal.o.d(localTime, temporalField);
        }
        return temporalField.u(this);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).L() ? this.b.get(temporalField) : this.a.get(temporalField);
        }
        return r(temporalField).a(u(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).L() ? this.b.u(temporalField) : this.a.u(temporalField);
        }
        return temporalField.k(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return O(localDate, this.b);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final C10379f d(long j, TemporalField temporalField) {
        boolean z = temporalField instanceof ChronoField;
        InterfaceC10375b interfaceC10375b = this.a;
        if (z) {
            boolean zL = ((ChronoField) temporalField).L();
            LocalTime localTime = this.b;
            if (zL) {
                return O(interfaceC10375b, localTime.d(j, temporalField));
            }
            return O(interfaceC10375b.d(j, temporalField), localTime);
        }
        return K(interfaceC10375b.a(), temporalField.r(this, j));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final C10379f e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        InterfaceC10375b interfaceC10375b = this.a;
        if (z) {
            int i = AbstractC10378e.a[((ChronoUnit) temporalUnit).ordinal()];
            LocalTime localTime = this.b;
            switch (i) {
                case 1:
                    return M(this.a, 0L, 0L, 0L, j);
                case 2:
                    C10379f c10379fO = O(interfaceC10375b.e(j / 86400000000L, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c10379fO.M(c10379fO.a, 0L, 0L, 0L, (j % 86400000000L) * 1000);
                case 3:
                    C10379f c10379fO2 = O(interfaceC10375b.e(j / 86400000, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c10379fO2.M(c10379fO2.a, 0L, 0L, 0L, (j % 86400000) * 1000000);
                case 4:
                    return M(this.a, 0L, 0L, j, 0L);
                case 5:
                    return M(this.a, 0L, j, 0L, 0L);
                case 6:
                    return M(this.a, j, 0L, 0L, 0L);
                case 7:
                    C10379f c10379fO3 = O(interfaceC10375b.e(j / 256, (TemporalUnit) ChronoUnit.DAYS), localTime);
                    return c10379fO3.M(c10379fO3.a, (j % 256) * 12, 0L, 0L, 0L);
                default:
                    return O(interfaceC10375b.e(j, temporalUnit), localTime);
            }
        }
        return K(interfaceC10375b.a(), temporalUnit.k(this, j));
    }

    public final C10379f M(InterfaceC10375b interfaceC10375b, long j, long j2, long j3, long j4) {
        long j5 = j | j2 | j3 | j4;
        LocalTime localTimeP = this.b;
        if (j5 == 0) {
            return O(interfaceC10375b, localTimeP);
        }
        long j6 = j2 / 1440;
        long j7 = j / 24;
        long j8 = (j2 % 1440) * 60000000000L;
        long j9 = ((j % 24) * 3600000000000L) + j8 + ((j3 % 86400) * 1000000000) + (j4 % 86400000000000L);
        long jW = localTimeP.W();
        long j10 = j9 + jW;
        long jT = j$.com.android.tools.r8.a.T(j10, 86400000000000L) + j7 + j6 + (j3 / 86400) + (j4 / 86400000000000L);
        long jS = j$.com.android.tools.r8.a.S(j10, 86400000000000L);
        if (jS != jW) {
            localTimeP = LocalTime.P(jS);
        }
        return O(interfaceC10375b.e(jT, (TemporalUnit) ChronoUnit.DAYS), localTimeP);
    }

    @Override // j$.time.chrono.ChronoLocalDateTime
    public final ChronoZonedDateTime o(ZoneId zoneId) {
        return j.K(zoneId, null, this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(c().v(), ChronoField.EPOCH_DAY).d(b().W(), ChronoField.NANO_OF_DAY);
    }

    private Object writeReplace() {
        return new D((byte) 2, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoLocalDateTime) && j$.com.android.tools.r8.a.g(this, (ChronoLocalDateTime) obj) == 0;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    public final String toString() {
        return this.a.toString() + RequestConfiguration.MAX_AD_CONTENT_RATING_T + this.b.toString();
    }
}
