package j$.time;

import j$.time.temporal.ChronoUnit;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public final class n implements j$.time.temporal.n, Serializable {
    public static final n d = new n(0, 0, 0);
    private static final long serialVersionUID = -3587258372562876L;
    public final int a;
    public final int b;
    public final int c;

    static {
        Pattern.compile("([-+]?)P(?:([-+]?[0-9]+)Y)?(?:([-+]?[0-9]+)M)?(?:([-+]?[0-9]+)W)?(?:([-+]?[0-9]+)D)?", 2);
        j$.com.android.tools.r8.a.Q(new Object[]{ChronoUnit.YEARS, ChronoUnit.MONTHS, ChronoUnit.DAYS});
    }

    public static n a(int i, int i2, int i3) {
        if ((i | i2 | i3) == 0) {
            return d;
        }
        return new n(i, i2, i3);
    }

    public n(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // j$.time.temporal.n
    public final j$.time.temporal.k k(j$.time.temporal.k kVar) {
        Objects.requireNonNull(kVar, "temporal");
        j$.time.chrono.k kVar2 = (j$.time.chrono.k) kVar.k(j$.time.temporal.o.b);
        if (kVar2 == null || j$.time.chrono.r.c.equals(kVar2)) {
            int i = this.a;
            int i2 = this.b;
            if (i2 != 0) {
                long j = (((long) i) * 12) + ((long) i2);
                if (j != 0) {
                    kVar = kVar.e(j, ChronoUnit.MONTHS);
                }
            } else if (i != 0) {
                kVar = kVar.e(i, ChronoUnit.YEARS);
            }
            int i3 = this.c;
            return i3 != 0 ? kVar.e(i3, ChronoUnit.DAYS) : kVar;
        }
        throw new b("Chronology mismatch, expected: ISO, actual: " + kVar2.m());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof n) {
            n nVar = (n) obj;
            if (this.a == nVar.a && this.b == nVar.b && this.c == nVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Integer.rotateLeft(this.c, 16) + Integer.rotateLeft(this.b, 8) + this.a;
    }

    public final String toString() {
        if (this == d) {
            return "P0D";
        }
        StringBuilder sb = new StringBuilder("P");
        int i = this.a;
        if (i != 0) {
            sb.append(i);
            sb.append('Y');
        }
        int i2 = this.b;
        if (i2 != 0) {
            sb.append(i2);
            sb.append('M');
        }
        int i3 = this.c;
        if (i3 != 0) {
            sb.append(i3);
            sb.append('D');
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new o((byte) 14, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }
}
