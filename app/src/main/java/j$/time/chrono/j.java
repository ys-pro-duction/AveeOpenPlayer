package j$.time.chrono;

import j$.time.Duration;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class j implements ChronoZonedDateTime, Serializable {
    private static final long serialVersionUID = -5261813987200935591L;
    public final transient C10379f a;
    public final transient ZoneOffset b;
    public final transient ZoneId c;

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ long J() {
        return j$.com.android.tools.r8.a.y(this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // j$.time.chrono.ChronoZonedDateTime
    public final /* synthetic */ int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        return j$.com.android.tools.r8.a.h(this, chronoZonedDateTime);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.m(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object k(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.v(this, fVar);
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(ChronoZonedDateTime<?> chronoZonedDateTime) {
        return compareTo((ChronoZonedDateTime) chronoZonedDateTime);
    }

    public static j K(ZoneId zoneId, ZoneOffset zoneOffset, C10379f c10379f) {
        Objects.requireNonNull(c10379f, "localDateTime");
        Objects.requireNonNull(zoneId, "zone");
        if (zoneId instanceof ZoneOffset) {
            return new j(zoneId, (ZoneOffset) zoneId, c10379f);
        }
        j$.time.zone.f fVarK = zoneId.K();
        LocalDateTime localDateTimeL = LocalDateTime.L(c10379f);
        List listF = fVarK.f(localDateTimeL);
        if (listF.size() == 1) {
            zoneOffset = (ZoneOffset) listF.get(0);
        } else if (listF.size() != 0) {
            if (zoneOffset == null || !listF.contains(zoneOffset)) {
                zoneOffset = (ZoneOffset) listF.get(0);
            }
            c10379f = c10379f;
        } else {
            Object objE = fVarK.e(localDateTimeL);
            j$.time.zone.b bVar = objE instanceof j$.time.zone.b ? (j$.time.zone.b) objE : null;
            c10379f = c10379f.M(c10379f.a, 0L, 0L, Duration.n(bVar.d.b - bVar.c.b, 0).a, 0L);
            zoneOffset = bVar.d;
        }
        Objects.requireNonNull(zoneOffset, "offset");
        return new j(zoneId, zoneOffset, c10379f);
    }

    public static j L(k kVar, Instant instant, ZoneId zoneId) {
        ZoneOffset zoneOffsetD = zoneId.K().d(instant);
        Objects.requireNonNull(zoneOffsetD, "offset");
        return new j(zoneId, zoneOffsetD, (C10379f) kVar.s(LocalDateTime.O(instant.a, instant.b, zoneOffsetD)));
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return ((C10379f) A()).r(temporalField);
            }
            return ((ChronoField) temporalField).c;
        }
        return temporalField.u(this);
    }

    public static j y(k kVar, j$.time.temporal.k kVar2) {
        j jVar = (j) kVar2;
        if (kVar.equals(jVar.a())) {
            return jVar;
        }
        throw new ClassCastException("Chronology mismatch, required: " + kVar.m() + ", actual: " + jVar.a().m());
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = AbstractC10381h.a[((ChronoField) temporalField).ordinal()];
            if (i == 1) {
                return J();
            }
            if (i != 2) {
                return ((C10379f) A()).u(temporalField);
            }
            return h().b;
        }
        return temporalField.k(this);
    }

    public j(ZoneId zoneId, ZoneOffset zoneOffset, C10379f c10379f) {
        this.a = (C10379f) Objects.requireNonNull(c10379f, "dateTime");
        this.b = (ZoneOffset) Objects.requireNonNull(zoneOffset, "offset");
        this.c = (ZoneId) Objects.requireNonNull(zoneId, "zone");
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneOffset h() {
        return this.b;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final InterfaceC10375b c() {
        return ((C10379f) A()).c();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final LocalTime b() {
        return ((C10379f) A()).b();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoLocalDateTime A() {
        return this.a;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ZoneId getZone() {
        return this.c;
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final k a() {
        return c().a();
    }

    @Override // j$.time.chrono.ChronoZonedDateTime
    public final ChronoZonedDateTime i(ZoneId zoneId) {
        return K(zoneId, this.b, this.a);
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return true;
        }
        return temporalField != null && temporalField.q(this);
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k d(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return y(a(), temporalField.r(this, j));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = AbstractC10382i.a[chronoField.ordinal()];
        if (i == 1) {
            return e(j - j$.com.android.tools.r8.a.y(this), ChronoUnit.SECONDS);
        }
        ZoneId zoneId = this.c;
        C10379f c10379f = this.a;
        if (i != 2) {
            return K(zoneId, this.b, c10379f.d(j, temporalField));
        }
        ZoneOffset zoneOffsetR = ZoneOffset.R(chronoField.c.a(j, chronoField));
        c10379f.getClass();
        return L(a(), Instant.L(j$.com.android.tools.r8.a.x(c10379f, zoneOffsetR), c10379f.b.d), zoneId);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public final j e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            return y(a(), this.a.e(j, temporalUnit).y(this));
        }
        return y(a(), temporalUnit.k(this, j));
    }

    private Object writeReplace() {
        return new D((byte) 3, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ChronoZonedDateTime) && j$.com.android.tools.r8.a.h(this, (ChronoZonedDateTime) obj) == 0;
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

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return y(a(), localDate.y(this));
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return y(a(), j$.time.temporal.o.b(this, j, chronoUnit));
    }
}
