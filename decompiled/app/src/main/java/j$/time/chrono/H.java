package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class H extends AbstractC10377d {
    private static final long serialVersionUID = -8722293800195731463L;
    public final transient LocalDate a;

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final ChronoLocalDateTime x(LocalTime localTime) {
        return new C10379f(this, localTime);
    }

    public H(LocalDate localDate) {
        Objects.requireNonNull(localDate, "isoDate");
        this.a = localDate;
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final k a() {
        return F.c;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final int hashCode() {
        F.c.getClass();
        return this.a.hashCode() ^ 146118545;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final l z() {
        return P() >= 1 ? I.BE : I.BEFORE_BE;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.u(this);
        }
        if (!j$.com.android.tools.r8.a.r(this, temporalField)) {
            throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", temporalField));
        }
        ChronoField chronoField = (ChronoField) temporalField;
        int i = G.a[chronoField.ordinal()];
        if (i == 1 || i == 2 || i == 3) {
            return this.a.r(temporalField);
        }
        if (i != 4) {
            return F.c.E(chronoField);
        }
        ValueRange valueRange = ChronoField.YEAR.c;
        return ValueRange.f(1L, P() <= 0 ? (-(valueRange.getMinimum() + 543)) + 1 : 543 + valueRange.getMaximum());
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i = G.a[((ChronoField) temporalField).ordinal()];
            if (i == 4) {
                int iP = P();
                if (iP < 1) {
                    iP = 1 - iP;
                }
                return iP;
            }
            LocalDate localDate = this.a;
            if (i == 5) {
                return ((((long) P()) * 12) + ((long) localDate.b)) - 1;
            }
            if (i == 6) {
                return P();
            }
            if (i != 7) {
                return localDate.u(temporalField);
            }
            return P() < 1 ? 0 : 1;
        }
        return temporalField.k(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004a  */
    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.chrono.H d(long r9, j$.time.temporal.TemporalField r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L98
            r0 = r11
            j$.time.temporal.ChronoField r0 = (j$.time.temporal.ChronoField) r0
            long r1 = r8.u(r0)
            int r3 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r3 != 0) goto L10
            return r8
        L10:
            int[] r1 = j$.time.chrono.G.a
            int r2 = r0.ordinal()
            r2 = r1[r2]
            j$.time.LocalDate r3 = r8.a
            r4 = 7
            r5 = 6
            r6 = 4
            if (r2 == r6) goto L4a
            r7 = 5
            if (r2 == r7) goto L27
            if (r2 == r5) goto L4a
            if (r2 == r4) goto L4a
            goto L60
        L27:
            j$.time.chrono.F r11 = j$.time.chrono.F.c
            j$.time.temporal.ValueRange r11 = r11.E(r0)
            r11.b(r9, r0)
            int r11 = r8.P()
            long r0 = (long) r11
            r4 = 12
            long r0 = r0 * r4
            short r11 = r3.b
            long r4 = (long) r11
            long r0 = r0 + r4
            r4 = 1
            long r0 = r0 - r4
            long r9 = r9 - r0
            j$.time.LocalDate r9 = r3.U(r9)
            j$.time.chrono.H r9 = r8.R(r9)
            return r9
        L4a:
            j$.time.chrono.F r2 = j$.time.chrono.F.c
            j$.time.temporal.ValueRange r2 = r2.E(r0)
            int r2 = r2.a(r9, r0)
            int r0 = r0.ordinal()
            r0 = r1[r0]
            if (r0 == r6) goto L83
            if (r0 == r5) goto L78
            if (r0 == r4) goto L69
        L60:
            j$.time.LocalDate r9 = r3.d(r9, r11)
            j$.time.chrono.H r9 = r8.R(r9)
            return r9
        L69:
            int r9 = r8.P()
            int r9 = (-542) - r9
            j$.time.LocalDate r9 = r3.a0(r9)
            j$.time.chrono.H r9 = r8.R(r9)
            return r9
        L78:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r3.a0(r2)
            j$.time.chrono.H r9 = r8.R(r9)
            return r9
        L83:
            int r9 = r8.P()
            r10 = 1
            if (r9 < r10) goto L8b
            goto L8d
        L8b:
            int r2 = 1 - r2
        L8d:
            int r2 = r2 + (-543)
            j$.time.LocalDate r9 = r3.a0(r2)
            j$.time.chrono.H r9 = r8.R(r9)
            return r9
        L98:
            j$.time.chrono.b r9 = super.d(r9, r11)
            j$.time.chrono.H r9 = (j$.time.chrono.H) r9
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.H.d(long, j$.time.temporal.TemporalField):j$.time.chrono.H");
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    /* JADX INFO: renamed from: j */
    public final InterfaceC10375b q(TemporalAdjuster temporalAdjuster) {
        return (H) super.q(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (H) super.q(localDate);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final InterfaceC10375b C(j$.time.temporal.n nVar) {
        return (H) super.C(nVar);
    }

    @Override // j$.time.chrono.AbstractC10377d
    public final InterfaceC10375b O(long j) {
        return R(this.a.W(j));
    }

    @Override // j$.time.chrono.AbstractC10377d
    public final InterfaceC10375b N(long j) {
        return R(this.a.U(j));
    }

    @Override // j$.time.chrono.AbstractC10377d
    public final InterfaceC10375b M(long j) {
        return R(this.a.T(j));
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b, j$.time.temporal.k
    public final InterfaceC10375b e(long j, TemporalUnit temporalUnit) {
        return (H) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k e(long j, TemporalUnit temporalUnit) {
        return (H) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d
    /* JADX INFO: renamed from: L */
    public final InterfaceC10375b n(long j, TemporalUnit temporalUnit) {
        return (H) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return (H) super.n(j, chronoUnit);
    }

    public final H R(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new H(localDate);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final long v() {
        return this.a.v();
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof H) {
            return this.a.equals(((H) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 8, this);
    }

    public final int P() {
        return this.a.a + 543;
    }
}
