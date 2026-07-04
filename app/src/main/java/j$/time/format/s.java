package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC10375b;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class s {
    public final j$.time.temporal.l a;
    public final DateTimeFormatter b;
    public int c;

    public s(j$.time.temporal.l lVar, DateTimeFormatter dateTimeFormatter) {
        j$.time.chrono.r rVar = dateTimeFormatter.e;
        if (rVar != null) {
            j$.time.chrono.k kVar = (j$.time.chrono.k) lVar.k(j$.time.temporal.o.b);
            ZoneId zoneId = (ZoneId) lVar.k(j$.time.temporal.o.a);
            InterfaceC10375b interfaceC10375bP = null;
            rVar = Objects.equals(rVar, kVar) ? null : rVar;
            Objects.equals(null, zoneId);
            if (rVar != null) {
                j$.time.chrono.k kVar2 = rVar != null ? rVar : kVar;
                if (rVar != null) {
                    if (lVar.f(ChronoField.EPOCH_DAY)) {
                        interfaceC10375bP = kVar2.p(lVar);
                    } else if (rVar != j$.time.chrono.r.c || kVar != null) {
                        for (ChronoField chronoField : ChronoField.values()) {
                            if (chronoField.y() && lVar.f(chronoField)) {
                                throw new j$.time.b("Unable to apply override chronology '" + rVar + "' because the temporal object being formatted contains date fields but does not represent a whole date: " + lVar);
                            }
                        }
                    }
                }
                lVar = new r(interfaceC10375bP, lVar, kVar2, zoneId);
            }
        }
        this.a = lVar;
        this.b = dateTimeFormatter;
    }

    public final Long a(TemporalField temporalField) {
        int i = this.c;
        j$.time.temporal.l lVar = this.a;
        if (i <= 0 || lVar.f(temporalField)) {
            return Long.valueOf(lVar.u(temporalField));
        }
        return null;
    }

    public final String toString() {
        return this.a.toString();
    }
}
