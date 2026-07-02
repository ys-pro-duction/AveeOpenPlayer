package j$.time;

import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class o implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public o() {
    }

    public o(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) throws IOException {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((LocalTime) obj).a0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.a0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.a0(objectOutput);
                zonedDateTime.b.U(objectOutput);
                zonedDateTime.c.O(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((t) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).U(objectOutput);
                return;
            case 9:
                m mVar = (m) obj;
                mVar.a.a0(objectOutput);
                mVar.b.U(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.a0(objectOutput);
                offsetDateTime.b.U(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((q) obj).a);
                return;
            case 12:
                s sVar = (s) obj;
                objectOutput.writeInt(sVar.a);
                objectOutput.writeByte(sVar.b);
                return;
            case 13:
                k kVar = (k) obj;
                objectOutput.writeByte(kVar.a);
                objectOutput.writeByte(kVar.b);
                return;
            case 14:
                n nVar = (n) obj;
                objectOutput.writeInt(nVar.a);
                objectOutput.writeInt(nVar.b);
                objectOutput.writeInt(nVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        byte b = objectInput.readByte();
        this.a = b;
        this.b = a(b, objectInput);
    }

    public static Serializable a(byte b, ObjectInput objectInput) throws IOException {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                long j = objectInput.readLong();
                long j2 = objectInput.readInt();
                return Duration.n(j$.com.android.tools.r8.a.O(j, j$.com.android.tools.r8.a.T(j2, 1000000000L)), (int) j$.com.android.tools.r8.a.S(j2, 1000000000L));
            case 2:
                Instant instant = Instant.c;
                return Instant.L(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.d;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.V(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.d;
                return LocalDateTime.N(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.MIN;
                LocalDate localDate3 = LocalDate.d;
                LocalDateTime localDateTimeN = LocalDateTime.N(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput));
                ZoneOffset zoneOffsetT = ZoneOffset.T(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(localDateTimeN, "localDateTime");
                Objects.requireNonNull(zoneOffsetT, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || zoneOffsetT.equals(zoneId)) {
                    return new ZonedDateTime(localDateTimeN, zoneId, zoneOffsetT);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = t.d;
                return ZoneId.L(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.T(objectInput);
            case 9:
                int i2 = m.c;
                return new m(LocalTime.V(objectInput), ZoneOffset.T(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                LocalDate localDate4 = LocalDate.d;
                return new OffsetDateTime(LocalDateTime.N(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput)), ZoneOffset.T(objectInput));
            case 11:
                int i4 = q.b;
                return q.K(objectInput.readInt());
            case 12:
                int i5 = s.c;
                int i6 = objectInput.readInt();
                byte b2 = objectInput.readByte();
                ChronoField.YEAR.K(i6);
                ChronoField.MONTH_OF_YEAR.K(b2);
                return new s(i6, b2);
            case 13:
                int i7 = k.c;
                byte b3 = objectInput.readByte();
                byte b4 = objectInput.readByte();
                Month monthN = Month.N(b3);
                Objects.requireNonNull(monthN, "month");
                ChronoField.DAY_OF_MONTH.K(b4);
                if (b4 <= monthN.M()) {
                    return new k(monthN.getValue(), b4);
                }
                throw new b("Illegal value for DayOfMonth field, value " + ((int) b4) + " is not valid for month " + monthN.name());
            case 14:
                n nVar = n.d;
                return n.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }
}
