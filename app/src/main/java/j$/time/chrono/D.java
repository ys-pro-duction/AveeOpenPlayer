package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* JADX INFO: loaded from: classes2.dex */
public final class D implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public D() {
    }

    public D(byte b, Object obj) {
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
                objectOutput.writeUTF(((AbstractC10374a) obj).m());
                return;
            case 2:
                C10379f c10379f = (C10379f) obj;
                objectOutput.writeObject(c10379f.a);
                objectOutput.writeObject(c10379f.b);
                return;
            case 3:
                j jVar = (j) obj;
                objectOutput.writeObject(jVar.a);
                objectOutput.writeObject(jVar.b);
                objectOutput.writeObject(jVar.c);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(wVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(wVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(wVar, ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((x) obj).a);
                return;
            case 6:
                p pVar = (p) obj;
                objectOutput.writeObject(pVar.a);
                objectOutput.writeInt(j$.time.temporal.o.a(pVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(pVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(pVar, ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                B b2 = (B) obj;
                b2.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(b2, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(b2, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(b2, ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                H h = (H) obj;
                h.getClass();
                objectOutput.writeInt(j$.time.temporal.o.a(h, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(h, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.o.a(h, ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                C10380g c10380g = (C10380g) obj;
                objectOutput.writeUTF(c10380g.a.m());
                objectOutput.writeInt(c10380g.b);
                objectOutput.writeInt(c10380g.c);
                objectOutput.writeInt(c10380g.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) throws IOException {
        Object objX;
        byte b = objectInput.readByte();
        this.a = b;
        switch (b) {
            case 1:
                ConcurrentHashMap concurrentHashMap = AbstractC10374a.a;
                objX = j$.com.android.tools.r8.a.X(objectInput.readUTF());
                break;
            case 2:
                objX = ((InterfaceC10375b) objectInput.readObject()).x((LocalTime) objectInput.readObject());
                break;
            case 3:
                objX = ((ChronoLocalDateTime) objectInput.readObject()).o((ZoneOffset) objectInput.readObject()).i((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = w.d;
                int i = objectInput.readInt();
                byte b2 = objectInput.readByte();
                byte b3 = objectInput.readByte();
                u.c.getClass();
                objX = new w(LocalDate.of(i, b2, b3));
                break;
            case 5:
                x xVar = x.d;
                objX = x.m(objectInput.readByte());
                break;
            case 6:
                n nVar = (n) objectInput.readObject();
                int i2 = objectInput.readInt();
                byte b4 = objectInput.readByte();
                byte b5 = objectInput.readByte();
                nVar.getClass();
                objX = new p(nVar, i2, b4, b5);
                break;
            case 7:
                int i3 = objectInput.readInt();
                byte b6 = objectInput.readByte();
                byte b7 = objectInput.readByte();
                z.c.getClass();
                objX = new B(LocalDate.of(i3 + 1911, b6, b7));
                break;
            case 8:
                int i4 = objectInput.readInt();
                byte b8 = objectInput.readByte();
                byte b9 = objectInput.readByte();
                F.c.getClass();
                objX = new H(LocalDate.of(i4 - 543, b8, b9));
                break;
            case 9:
                int i5 = C10380g.e;
                objX = new C10380g(j$.com.android.tools.r8.a.X(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = objX;
    }

    private Object readResolve() {
        return this.b;
    }
}
