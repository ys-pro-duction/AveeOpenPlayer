package j$.time.temporal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class ValueRange implements Serializable {
    private static final long serialVersionUID = -7317881728594519368L;
    public final long a;
    public final long b;
    public final long c;
    public final long d;

    public static ValueRange f(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new ValueRange(j, j, j2, j2);
    }

    public static ValueRange g(long j, long j2) {
        if (j > j2) {
            throw new IllegalArgumentException("Smallest maximum value must be less than largest maximum value");
        }
        if (1 > j2) {
            throw new IllegalArgumentException("Minimum value must be less than maximum value");
        }
        return new ValueRange(1L, 1L, j, j2);
    }

    public ValueRange(long j, long j2, long j3, long j4) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
    }

    public long getMinimum() {
        return this.a;
    }

    public long getMaximum() {
        return this.d;
    }

    public final boolean d() {
        return getMinimum() >= -2147483648L && getMaximum() <= 2147483647L;
    }

    public final boolean e(long j) {
        return j >= getMinimum() && j <= getMaximum();
    }

    public final int a(long j, TemporalField temporalField) {
        if (d() && e(j)) {
            return (int) j;
        }
        throw new j$.time.b(c(j, temporalField));
    }

    public final void b(long j, TemporalField temporalField) {
        if (!e(j)) {
            throw new j$.time.b(c(j, temporalField));
        }
    }

    public final String c(long j, TemporalField temporalField) {
        if (temporalField != null) {
            return "Invalid value for " + temporalField + " (valid values " + this + "): " + j;
        }
        return "Invalid value (valid values " + this + "): " + j;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        long j = this.a;
        long j2 = this.b;
        if (j > j2) {
            throw new InvalidObjectException("Smallest minimum value must be less than largest minimum value");
        }
        long j3 = this.c;
        long j4 = this.d;
        if (j3 > j4) {
            throw new InvalidObjectException("Smallest maximum value must be less than largest maximum value");
        }
        if (j2 > j4) {
            throw new InvalidObjectException("Minimum value must be less than maximum value");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ValueRange) {
            ValueRange valueRange = (ValueRange) obj;
            if (this.a == valueRange.a && this.b == valueRange.b && this.c == valueRange.c && this.d == valueRange.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.b;
        long j2 = this.a + (j << 16) + (j >> 48);
        long j3 = this.c;
        long j4 = j2 + (j3 << 32) + (j3 >> 32);
        long j5 = this.d;
        long j6 = j4 + (j5 << 48) + (j5 >> 16);
        return (int) ((j6 >>> 32) ^ j6);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        long j = this.a;
        sb.append(j);
        long j2 = this.b;
        if (j != j2) {
            sb.append('/');
            sb.append(j2);
        }
        sb.append(" - ");
        long j3 = this.c;
        sb.append(j3);
        long j4 = this.d;
        if (j3 != j4) {
            sb.append('/');
            sb.append(j4);
        }
        return sb.toString();
    }
}
