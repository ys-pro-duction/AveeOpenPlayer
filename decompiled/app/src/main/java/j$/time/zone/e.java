package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final Month a;
    public final byte b;
    public final DayOfWeek c;
    public final LocalTime d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = month;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void writeExternal(ObjectOutput objectOutput) {
        LocalTime localTime = this.d;
        boolean z = this.e;
        int iX = z ? 86400 : localTime.X();
        ZoneOffset zoneOffset = this.g;
        int i = this.h.b;
        int i2 = zoneOffset.b;
        int i3 = i - i2;
        int i4 = this.i.b;
        int i5 = i4 - i2;
        byte b = iX % 3600 == 0 ? z ? (byte) 24 : localTime.a : (byte) 31;
        int i6 = i2 % 900 == 0 ? (i2 / 900) + 128 : 255;
        int i7 = (i3 == 0 || i3 == 1800 || i3 == 3600) ? i3 / 1800 : 3;
        int i8 = (i5 == 0 || i5 == 1800 || i5 == 3600) ? i5 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        objectOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i6 << 4) + (i7 << 2) + i8);
        if (b == 31) {
            objectOutput.writeInt(iX);
        }
        if (i6 == 255) {
            objectOutput.writeInt(i2);
        }
        if (i7 == 3) {
            objectOutput.writeInt(i);
        }
        if (i8 == 3) {
            objectOutput.writeInt(i4);
        }
    }

    public static e a(ObjectInput objectInput) {
        int i;
        d dVar;
        LocalTime localTimeL;
        int i2 = objectInput.readInt();
        Month monthN = Month.N(i2 >>> 28);
        int i3 = ((264241152 & i2) >>> 22) - 32;
        int i4 = (3670016 & i2) >>> 19;
        DayOfWeek dayOfWeekOf = i4 == 0 ? null : DayOfWeek.of(i4);
        int i5 = (507904 & i2) >>> 14;
        d dVar2 = d.values()[(i2 & 12288) >>> 12];
        int i6 = (i2 & 4080) >>> 4;
        int i7 = (i2 & 12) >>> 2;
        int i8 = i2 & 3;
        if (i5 == 31) {
            long j = objectInput.readInt();
            LocalTime localTime = LocalTime.e;
            ChronoField.SECOND_OF_DAY.K(j);
            int i9 = (int) (j / 3600);
            i = i8;
            long j2 = j - ((long) (i9 * 3600));
            int i10 = (int) (j2 / 60);
            dVar = dVar2;
            localTimeL = LocalTime.L(i9, i10, (int) (j2 - ((long) (i10 * 60))), 0);
        } else {
            i = i8;
            dVar = dVar2;
            int i11 = i5 % 24;
            LocalTime localTime2 = LocalTime.e;
            ChronoField.HOUR_OF_DAY.K(i11);
            localTimeL = LocalTime.g[i11];
        }
        ZoneOffset zoneOffsetR = i6 == 255 ? ZoneOffset.R(objectInput.readInt()) : ZoneOffset.R((i6 - 128) * 900);
        int i12 = zoneOffsetR.b;
        ZoneOffset zoneOffsetR2 = ZoneOffset.R(i7 == 3 ? objectInput.readInt() : (i7 * 1800) + i12);
        int i13 = i;
        ZoneOffset zoneOffsetR3 = i13 == 3 ? ZoneOffset.R(objectInput.readInt()) : ZoneOffset.R((i13 * 1800) + i12);
        boolean z = i5 == 24;
        Objects.requireNonNull(monthN, "month");
        Objects.requireNonNull(localTimeL, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(zoneOffsetR, "standardOffset");
        Objects.requireNonNull(zoneOffsetR2, "offsetBefore");
        Objects.requireNonNull(zoneOffsetR3, "offsetAfter");
        if (i3 < -28 || i3 > 31 || i3 == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTimeL.equals(LocalTime.f)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTimeL.d != 0) {
            throw new IllegalArgumentException("Time's nano-of-second must be zero");
        }
        return new e(monthN, i3, dayOfWeekOf, localTimeL, z, dVar3, zoneOffsetR, zoneOffsetR2, zoneOffsetR3);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iX = ((this.d.X() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.b ^ (this.f.ordinal() + (iX + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.b) ^ this.i.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        sb.append(zoneOffset2.b - zoneOffset.b > 0 ? "Gap " : "Overlap ");
        sb.append(zoneOffset);
        sb.append(" to ");
        sb.append(zoneOffset2);
        sb.append(", ");
        Month month = this.a;
        byte b = this.b;
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek == null) {
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b);
        } else if (b == -1) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day of ");
            sb.append(month.name());
        } else if (b < 0) {
            sb.append(dayOfWeek.name());
            sb.append(" on or before last day minus ");
            sb.append((-b) - 1);
            sb.append(" of ");
            sb.append(month.name());
        } else {
            sb.append(dayOfWeek.name());
            sb.append(" on or after ");
            sb.append(month.name());
            sb.append(' ');
            sb.append((int) b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
