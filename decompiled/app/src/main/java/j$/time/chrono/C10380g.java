package j$.time.chrono;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: renamed from: j$.time.chrono.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10380g implements j$.time.temporal.n, Serializable {
    public static final /* synthetic */ int e = 0;
    private static final long serialVersionUID = 57387258289L;
    public final k a;
    public final int b;
    public final int c;
    public final int d;

    static {
        j$.com.android.tools.r8.a.Q(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public C10380g(k kVar, int i, int i2, int i3) {
        Objects.requireNonNull(kVar, "chrono");
        this.a = kVar;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final String toString() {
        k kVar = this.a;
        int i = this.d;
        int i2 = this.c;
        int i3 = this.b;
        if (i3 == 0 && i2 == 0 && i == 0) {
            return kVar.toString() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(kVar.toString());
        sb.append(" P");
        if (i3 != 0) {
            sb.append(i3);
            sb.append('Y');
        }
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        if (i != 0) {
            sb.append(i);
            sb.append('D');
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        Objects.requireNonNull(kVar, "temporal");
        k kVar2 = (k) kVar.k(j$.time.temporal.o.b);
        k kVar3 = this.a;
        if (kVar2 == null || kVar3.equals(kVar2)) {
            int i = this.b;
            int i2 = this.c;
            if (i2 != 0) {
                ValueRange valueRangeE = kVar3.E(ChronoField.MONTH_OF_YEAR);
                long maximum = (valueRangeE.a == valueRangeE.b && valueRangeE.c == valueRangeE.d && valueRangeE.d()) ? (valueRangeE.getMaximum() - valueRangeE.getMinimum()) + 1 : -1L;
                if (maximum > 0) {
                    kVar = kVar.e((((long) i) * maximum) + ((long) i2), ChronoUnit.MONTHS);
                } else {
                    if (i != 0) {
                        kVar = kVar.e(i, ChronoUnit.YEARS);
                    }
                    kVar = kVar.e(i2, ChronoUnit.MONTHS);
                }
            } else if (i != 0) {
                kVar = kVar.e(i, ChronoUnit.YEARS);
            }
            int i3 = this.d;
            return i3 != 0 ? kVar.e(i3, ChronoUnit.DAYS) : kVar;
        }
        throw new j$.time.b("Chronology mismatch, expected: " + kVar3.m() + ", actual: " + kVar2.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10380g) {
            C10380g c10380g = (C10380g) obj;
            if (this.b == c10380g.b && this.c == c10380g.c && this.d == c10380g.d && this.a.equals(c10380g.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() ^ (Integer.rotateLeft(this.d, 16) + (Integer.rotateLeft(this.c, 8) + this.b));
    }

    public Object writeReplace() {
        return new D((byte) 9, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
