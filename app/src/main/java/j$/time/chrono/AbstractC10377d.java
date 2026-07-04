package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC10377d implements InterfaceC10375b, j$.time.temporal.k, TemporalAdjuster, Serializable {
    private static final long serialVersionUID = 6282433883239719096L;

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: H */
    public final /* synthetic */ int compareTo(InterfaceC10375b interfaceC10375b) {
        return j$.com.android.tools.r8.a.f(this, interfaceC10375b);
    }

    public abstract InterfaceC10375b M(long j);

    public abstract InterfaceC10375b N(long j);

    public abstract InterfaceC10375b O(long j);

    @Override // j$.time.chrono.InterfaceC10375b, j$.time.temporal.l
    public /* synthetic */ boolean f(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.r(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ int get(TemporalField temporalField) {
        return j$.time.temporal.o.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final /* synthetic */ Object k(j$.time.f fVar) {
        return j$.com.android.tools.r8.a.t(this, fVar);
    }

    @Override // j$.time.temporal.l
    public /* synthetic */ ValueRange r(TemporalField temporalField) {
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final /* synthetic */ j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return j$.com.android.tools.r8.a.a(this, kVar);
    }

    public static InterfaceC10375b K(k kVar, j$.time.temporal.k kVar2) {
        InterfaceC10375b interfaceC10375b = (InterfaceC10375b) kVar2;
        if (kVar.equals(interfaceC10375b.a())) {
            return interfaceC10375b;
        }
        throw new ClassCastException("Chronology mismatch, expected: " + kVar.m() + ", actual: " + interfaceC10375b.a().m());
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public ChronoLocalDateTime x(LocalTime localTime) {
        return new C10379f(this, localTime);
    }

    @Override // j$.time.temporal.k
    public InterfaceC10375b e(long j, TemporalUnit temporalUnit) {
        boolean z = temporalUnit instanceof ChronoUnit;
        if (!z) {
            if (!z) {
                return K(a(), temporalUnit.k(this, j));
            }
            throw new j$.time.temporal.p("Unsupported unit: " + temporalUnit);
        }
        switch (AbstractC10376c.a[((ChronoUnit) temporalUnit).ordinal()]) {
            case 1:
                return M(j);
            case 2:
                return M(j$.com.android.tools.r8.a.U(j, 7));
            case 3:
                return N(j);
            case 4:
                return O(j);
            case 5:
                return O(j$.com.android.tools.r8.a.U(j, 10));
            case 6:
                return O(j$.com.android.tools.r8.a.U(j, 100));
            case 7:
                return O(j$.com.android.tools.r8.a.U(j, 1000));
            case 8:
                ChronoField chronoField = ChronoField.ERA;
                return d(j$.com.android.tools.r8.a.O(u(chronoField), j), (TemporalField) chronoField);
            default:
                throw new j$.time.temporal.p("Unsupported unit: " + temporalUnit);
        }
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public l z() {
        return a().I(j$.time.temporal.o.a(this, ChronoField.ERA));
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InterfaceC10375b) && j$.com.android.tools.r8.a.f(this, (InterfaceC10375b) obj) == 0;
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public int hashCode() {
        long jV = v();
        return a().hashCode() ^ ((int) (jV ^ (jV >>> 32)));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: j */
    public InterfaceC10375b q(TemporalAdjuster temporalAdjuster) {
        return K(a(), temporalAdjuster.y(this));
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final String toString() {
        long jU = u(ChronoField.YEAR_OF_ERA);
        long jU2 = u(ChronoField.MONTH_OF_YEAR);
        long jU3 = u(ChronoField.DAY_OF_MONTH);
        StringBuilder sb = new StringBuilder(30);
        sb.append(a().toString());
        sb.append(" ");
        sb.append(z());
        sb.append(" ");
        sb.append(jU);
        sb.append(jU2 < 10 ? "-0" : "-");
        sb.append(jU2);
        sb.append(jU3 < 10 ? "-0" : "-");
        sb.append(jU3);
        return sb.toString();
    }

    @Override // j$.time.temporal.k
    public InterfaceC10375b d(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", temporalField));
        }
        return K(a(), temporalField.r(this, j));
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public InterfaceC10375b C(j$.time.temporal.n nVar) {
        return K(a(), nVar.k(this));
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public InterfaceC10375b n(long j, TemporalUnit temporalUnit) {
        return K(a(), j$.time.temporal.o.b(this, j, temporalUnit));
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public long v() {
        return u(ChronoField.EPOCH_DAY);
    }
}
