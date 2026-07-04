package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends AbstractC10377d {
    private static final long serialVersionUID = -5207853542612002020L;
    public final transient n a;
    public final transient int b;
    public final transient int c;
    public final transient int d;

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final ChronoLocalDateTime x(LocalTime localTime) {
        return new C10379f(this, localTime);
    }

    public p(n nVar, int i, int i2, int i3) {
        nVar.N(i, i2, i3);
        this.a = nVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public p(n nVar, long j) {
        int i = (int) j;
        nVar.L();
        if (i < nVar.e || i >= nVar.f) {
            throw new j$.time.b("Hijrah date out of range");
        }
        int iBinarySearch = Arrays.binarySearch(nVar.d, i);
        iBinarySearch = iBinarySearch < 0 ? (-iBinarySearch) - 2 : iBinarySearch;
        int i2 = nVar.g;
        int[] iArr = {(iBinarySearch + i2) / 12, ((i2 + iBinarySearch) % 12) + 1, (i - nVar.d[iBinarySearch]) + 1};
        this.a = nVar;
        this.b = iArr[0];
        this.c = iArr[1];
        this.d = iArr[2];
    }

    @Override // j$.time.chrono.InterfaceC10375b
    public final k a() {
        return this.a;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final l z() {
        return q.AH;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final int hashCode() {
        this.a.getClass();
        int i = this.b;
        return (((i << 11) + (this.c << 6)) + this.d) ^ ((i & (-2048)) ^ 2100100019);
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
        int i = o.a[chronoField.ordinal()];
        int i2 = this.b;
        return i != 1 ? i != 2 ? i != 3 ? this.a.E(chronoField) : ValueRange.f(1L, 5L) : ValueRange.f(1L, r3.Q(i2, 12)) : ValueRange.f(1L, r3.O(i2, this.c));
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.k(this);
        }
        int i = o.a[((ChronoField) temporalField).ordinal()];
        int i2 = this.c;
        int i3 = this.d;
        int i4 = this.b;
        switch (i) {
            case 1:
                return i3;
            case 2:
                return P();
            case 3:
                return ((i3 - 1) / 7) + 1;
            case 4:
                return ((int) j$.com.android.tools.r8.a.S(v() + 3, 7)) + 1;
            case 5:
                return ((i3 - 1) % 7) + 1;
            case 6:
                return ((P() - 1) % 7) + 1;
            case 7:
                return v();
            case 8:
                return ((P() - 1) / 7) + 1;
            case 9:
                return i2;
            case 10:
                return ((((long) i4) * 12) + ((long) i2)) - 1;
            case 11:
                return i4;
            case 12:
                return i4;
            case 13:
                return i4 <= 1 ? 0 : 1;
            default:
                throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public final p d(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (p) super.d(j, temporalField);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        n nVar = this.a;
        nVar.E(chronoField).b(j, chronoField);
        int i = (int) j;
        int i2 = o.a[chronoField.ordinal()];
        int i3 = this.d;
        int i4 = this.c;
        int i5 = this.b;
        switch (i2) {
            case 1:
                return S(i5, i4, i);
            case 2:
                return M(Math.min(i, nVar.Q(i5, 12)) - P());
            case 3:
                return M((j - u(ChronoField.ALIGNED_WEEK_OF_MONTH)) * 7);
            case 4:
                return M(j - ((long) (((int) j$.com.android.tools.r8.a.S(v() + 3, 7)) + 1)));
            case 5:
                return M(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH));
            case 6:
                return M(j - u(ChronoField.ALIGNED_DAY_OF_WEEK_IN_YEAR));
            case 7:
                return new p(nVar, j);
            case 8:
                return M((j - u(ChronoField.ALIGNED_WEEK_OF_YEAR)) * 7);
            case 9:
                return S(i5, i, i3);
            case 10:
                return N(j - (((((long) i5) * 12) + ((long) i4)) - 1));
            case 11:
                if (i5 < 1) {
                    i = 1 - i;
                }
                return S(i, i4, i3);
            case 12:
                return S(i, i4, i3);
            case 13:
                return S(1 - i5, i4, i3);
            default:
                throw new j$.time.temporal.p(j$.time.c.a("Unsupported field: ", temporalField));
        }
    }

    public final p S(int i, int i2, int i3) {
        n nVar = this.a;
        int iO = nVar.O(i, i2);
        if (i3 > iO) {
            i3 = iO;
        }
        return new p(nVar, i, i2, i3);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    /* JADX INFO: renamed from: j */
    public final InterfaceC10375b q(TemporalAdjuster temporalAdjuster) {
        return (p) super.q(temporalAdjuster);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (p) super.q(localDate);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final InterfaceC10375b C(j$.time.temporal.n nVar) {
        return (p) super.C(nVar);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final long v() {
        return this.a.N(this.b, this.c, this.d);
    }

    @Override // j$.time.chrono.AbstractC10377d
    public final InterfaceC10375b O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = ((long) this.b) + ((long) ((int) j));
        int i = (int) j2;
        if (j2 == i) {
            return S(i, this.c, this.d);
        }
        throw new ArithmeticException();
    }

    @Override // j$.time.chrono.AbstractC10377d
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public final p N(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (((long) this.b) * 12) + ((long) (this.c - 1)) + j;
        long jT = j$.com.android.tools.r8.a.T(j2, 12L);
        int i = this.a.g;
        if (jT >= i / 12 && jT <= (((r4.d.length - 1) + i) / 12) - 1) {
            return S((int) jT, ((int) j$.com.android.tools.r8.a.S(j2, 12L)) + 1, this.d);
        }
        throw new j$.time.b("Invalid Hijrah year: " + jT);
    }

    @Override // j$.time.chrono.AbstractC10377d
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final p M(long j) {
        return new p(this.a, v() + j);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b, j$.time.temporal.k
    public final InterfaceC10375b e(long j, TemporalUnit temporalUnit) {
        return (p) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k e(long j, TemporalUnit temporalUnit) {
        return (p) super.e(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d
    /* JADX INFO: renamed from: L */
    public final InterfaceC10375b n(long j, TemporalUnit temporalUnit) {
        return (p) super.n(j, temporalUnit);
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return (p) super.n(j, chronoUnit);
    }

    public final int P() {
        return this.a.Q(this.b, this.c - 1) + this.d;
    }

    @Override // j$.time.chrono.AbstractC10377d, j$.time.chrono.InterfaceC10375b
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p) {
            p pVar = (p) obj;
            if (this.b == pVar.b && this.c == pVar.c && this.d == pVar.d && this.a.equals(pVar.a)) {
                return true;
            }
        }
        return false;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new D((byte) 6, this);
    }
}
