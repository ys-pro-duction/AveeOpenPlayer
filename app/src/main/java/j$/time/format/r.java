package j$.time.format;

import j$.time.ZoneId;
import j$.time.chrono.InterfaceC10375b;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;

/* JADX INFO: loaded from: classes2.dex */
public final class r implements j$.time.temporal.l {
    public final /* synthetic */ InterfaceC10375b a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ j$.time.chrono.k c;
    public final /* synthetic */ ZoneId d;

    @Override // j$.time.temporal.l
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.o.a(this, temporalField);
    }

    public r(InterfaceC10375b interfaceC10375b, j$.time.temporal.l lVar, j$.time.chrono.k kVar, ZoneId zoneId) {
        this.a = interfaceC10375b;
        this.b = lVar;
        this.c = kVar;
        this.d = zoneId;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        InterfaceC10375b interfaceC10375b = this.a;
        if (interfaceC10375b != null && temporalField.y()) {
            return interfaceC10375b.f(temporalField);
        }
        return this.b.f(temporalField);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        InterfaceC10375b interfaceC10375b = this.a;
        if (interfaceC10375b != null && temporalField.y()) {
            return interfaceC10375b.r(temporalField);
        }
        return this.b.r(temporalField);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        InterfaceC10375b interfaceC10375b = this.a;
        if (interfaceC10375b != null && temporalField.y()) {
            return interfaceC10375b.u(temporalField);
        }
        return this.b.u(temporalField);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [j$.time.temporal.l, java.lang.Object] */
    @Override // j$.time.temporal.l
    public final Object k(j$.time.f fVar) {
        if (fVar == j$.time.temporal.o.b) {
            return this.c;
        }
        if (fVar == j$.time.temporal.o.a) {
            return this.d;
        }
        if (fVar == j$.time.temporal.o.c) {
            return this.b.k(fVar);
        }
        return fVar.h(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.k kVar = this.c;
        if (kVar != null) {
            str = " with chronology " + kVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
