package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* JADX INFO: loaded from: classes2.dex */
public final class w extends AbstractC10377d {
    public static final LocalDate d = LocalDate.of(1873, 1, 1);
    private static final long serialVersionUID = -305327627230580483L;
    public final transient LocalDate a;
    public final transient x b;
    public final transient int c;

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final ChronoLocalDateTime x(LocalTime localTime) {
        return new C10379f(this, localTime);
    }

    public w(LocalDate localDate) {
        if (localDate.O(d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        x xVarG = x.g(localDate);
        this.b = xVarG;
        this.c = (localDate.a - xVarG.b.a) + 1;
        this.a = localDate;
    }

    public w(x xVar, int i, LocalDate localDate) {
        if (localDate.O(d)) {
            throw new j$.time.b("JapaneseDate before Meiji 6 is not supported");
        }
        this.b = xVar;
        this.c = i;
        this.a = localDate;
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final k a() {
        return u.c;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final int hashCode() {
        u.c.getClass();
        return this.a.hashCode() ^ (-688086063);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final l z() {
        return this.b;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b, j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        if (temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH || temporalField == ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR || temporalField == ChronoField.ALIGNED_WEEK_OF_MONTH || temporalField == ChronoField.ALIGNED_WEEK_OF_YEAR) {
            return false;
        }
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).y();
        }
        return temporalField != null && temporalField.q(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x005e  */
    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final j$.time.temporal.ValueRange r(j$.time.temporal.TemporalField r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j$.time.temporal.ChronoField
            if (r0 == 0) goto L8a
            boolean r0 = r7.f(r8)
            if (r0 == 0) goto L7e
            j$.time.temporal.ChronoField r8 = (j$.time.temporal.ChronoField) r8
            int[] r0 = j$.time.chrono.v.a
            int r1 = r8.ordinal()
            r0 = r0[r1]
            j$.time.LocalDate r1 = r7.a
            r2 = 1
            r3 = 1
            if (r0 == r2) goto L74
            j$.time.chrono.x r5 = r7.b
            r6 = 2
            if (r0 == r6) goto L4a
            r1 = 3
            if (r0 == r1) goto L2a
            j$.time.chrono.u r0 = j$.time.chrono.u.c
            j$.time.temporal.ValueRange r8 = r0.E(r8)
            return r8
        L2a:
            j$.time.LocalDate r8 = r5.b
            int r8 = r8.a
            j$.time.chrono.x r0 = r5.l()
            if (r0 == 0) goto L40
            j$.time.LocalDate r0 = r0.b
            int r0 = r0.a
            int r0 = r0 - r8
            int r0 = r0 + r2
            long r0 = (long) r0
            j$.time.temporal.ValueRange r8 = j$.time.temporal.ValueRange.f(r3, r0)
            return r8
        L40:
            r0 = 999999999(0x3b9ac9ff, float:0.004723787)
            int r0 = r0 - r8
            long r0 = (long) r0
            j$.time.temporal.ValueRange r8 = j$.time.temporal.ValueRange.f(r3, r0)
            return r8
        L4a:
            j$.time.chrono.x r8 = r5.l()
            if (r8 == 0) goto L5e
            j$.time.LocalDate r8 = r8.b
            int r0 = r8.a
            int r6 = r1.a
            if (r0 != r6) goto L5e
            int r8 = r8.getDayOfYear()
            int r8 = r8 - r2
            goto L62
        L5e:
            int r8 = r1.lengthOfYear()
        L62:
            int r0 = r7.c
            if (r0 != r2) goto L6e
            j$.time.LocalDate r0 = r5.b
            int r0 = r0.getDayOfYear()
            int r0 = r0 - r2
            int r8 = r8 - r0
        L6e:
            long r0 = (long) r8
            j$.time.temporal.ValueRange r8 = j$.time.temporal.ValueRange.f(r3, r0)
            return r8
        L74:
            int r8 = r1.lengthOfMonth()
            long r0 = (long) r8
            j$.time.temporal.ValueRange r8 = j$.time.temporal.ValueRange.f(r3, r0)
            return r8
        L7e:
            j$.time.temporal.p r0 = new j$.time.temporal.p
            java.lang.String r1 = "Unsupported field: "
            java.lang.String r8 = j$.time.c.a(r1, r8)
            r0.<init>(r8)
            throw r0
        L8a:
            j$.time.temporal.ValueRange r8 = r8.u(r7)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.chrono.w.r(j$.time.temporal.TemporalField):j$.time.temporal.ValueRange");
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        int i = v.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.c;
        x xVar = this.b;
        LocalDate localDate = this.a;
        switch (i) {
            case 2:
                return i2 == 1 ? (localDate.getDayOfYear() - xVar.b.getDayOfYear()) + 1 : localDate.getDayOfYear();
            case 3:
                return i2;
            case 4:
            case 5:
            case 6:
            case 7:
                throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", temporalField));
            case 8:
                return xVar.a;
            default:
                return localDate.u(temporalField);
        }
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final w d(long j, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            ChronoField chronoField = (ChronoField) temporalField;
            if (u(chronoField) == j) {
                return this;
            }
            int[] iArr = v.a;
            int i = iArr[chronoField.ordinal()];
            LocalDate localDate = this.a;
            if (i == 3 || i == 8 || i == 9) {
                u uVar = u.c;
                int iA = uVar.E(chronoField).a(j, chronoField);
                int i2 = iArr[chronoField.ordinal()];
                if (i2 == 3) {
                    return R(localDate.a0(uVar.g(this.b, iA)));
                }
                if (i2 == 8) {
                    return R(localDate.a0(uVar.g(x.m(iA), this.c)));
                }
                if (i2 == 9) {
                    return R(localDate.a0(iA));
                }
            }
            return R(localDate.d(j, temporalField));
        }
        return (w) super.d(j, temporalField);
    }

    public final w S(TemporalAdjuster temporalAdjuster) {
        return (w) super.q(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    /* JADX INFO: renamed from: j */
    public final InterfaceC10375b q(TemporalAdjuster temporalAdjuster) {
        return (w) super.q(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (w) super.q(localDate);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final InterfaceC10375b C(j$.time.temporal.n nVar) {
        return (w) super.C(nVar);
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

    public final w P(long j, ChronoUnit chronoUnit) {
        return (w) super.e(j, (TemporalUnit) chronoUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b, j$.time.temporal.k
    public final InterfaceC10375b e(long j, TemporalUnit temporalUnit) {
        return (w) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k e(long j, TemporalUnit temporalUnit) {
        return (w) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d
    /* JADX INFO: renamed from: L */
    public final InterfaceC10375b n(long j, TemporalUnit temporalUnit) {
        return (w) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return (w) super.n(j, chronoUnit);
    }

    public final w R(LocalDate localDate) {
        return localDate.equals(this.a) ? this : new w(localDate);
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
        if (obj instanceof w) {
            return this.a.equals(((w) obj).a);
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 4, this);
    }
}
