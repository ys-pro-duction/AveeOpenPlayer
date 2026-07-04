package j$.time.zone;

import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class b implements Comparable, Serializable {
    private static final long serialVersionUID = -6946044323557704546L;
    public final long a;
    public final LocalDateTime b;
    public final ZoneOffset c;
    public final ZoneOffset d;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Long.compare(this.a, ((b) obj).a);
    }

    public b(LocalDateTime localDateTime, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        localDateTime.getClass();
        this.a = j$.com.android.tools.r8.a.x(localDateTime, zoneOffset);
        this.b = localDateTime;
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    public b(long j, ZoneOffset zoneOffset, ZoneOffset zoneOffset2) {
        this.a = j;
        this.b = LocalDateTime.O(j, 0, zoneOffset);
        this.c = zoneOffset;
        this.d = zoneOffset2;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 2, this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.a == bVar.a && this.c.equals(bVar.c) && this.d.equals(bVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.b.hashCode() ^ this.c.b) ^ Integer.rotateLeft(this.d.b, 16);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Transition[");
        ZoneOffset zoneOffset = this.d;
        int i = zoneOffset.b;
        ZoneOffset zoneOffset2 = this.c;
        sb.append(i > zoneOffset2.b ? "Gap" : "Overlap");
        sb.append(" at ");
        sb.append(this.b);
        sb.append(zoneOffset2);
        sb.append(" to ");
        sb.append(zoneOffset);
        sb.append(']');
        return sb.toString();
    }
}
