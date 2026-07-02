package j$.time;

import com.revenuecat.purchases.common.Constants;
import com.revenuecat.purchases.common.UtilsKt;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalUnit;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes2.dex */
public final class LocalTime implements j$.time.temporal.k, TemporalAdjuster, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime e;
    public static final LocalTime f;
    public static final LocalTime[] g = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = g;
            if (i < localTimeArr.length) {
                localTimeArr[i] = new LocalTime(i, 0, 0, 0);
                i++;
            } else {
                LocalTime localTime = localTimeArr[0];
                f = localTime;
                LocalTime localTime2 = localTimeArr[12];
                e = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
        }
    }

    public static LocalTime of(int i, int i2, int i3) {
        ChronoField.HOUR_OF_DAY.K(i);
        if ((i2 | i3) == 0) {
            return g[i];
        }
        ChronoField.MINUTE_OF_HOUR.K(i2);
        ChronoField.SECOND_OF_MINUTE.K(i3);
        return new LocalTime(i, i2, i3, 0);
    }

    public static LocalTime O(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.K(i);
        ChronoField.MINUTE_OF_HOUR.K(i2);
        ChronoField.SECOND_OF_MINUTE.K(i3);
        ChronoField.NANO_OF_SECOND.K(i4);
        return L(i, i2, i3, i4);
    }

    public static LocalTime P(long j) {
        ChronoField.NANO_OF_DAY.K(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (((long) i) * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (((long) i2) * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return L(i, i2, i3, (int) (j3 - (((long) i3) * 1000000000)));
    }

    public static LocalTime M(j$.time.temporal.l lVar) {
        Objects.requireNonNull(lVar, "temporal");
        LocalTime localTime = (LocalTime) lVar.k(j$.time.temporal.o.g);
        if (localTime != null) {
            return localTime;
        }
        throw new b("Unable to obtain LocalTime from TemporalAccessor: " + lVar + " of type " + lVar.getClass().getName());
    }

    public static LocalTime L(int i, int i2, int i3, int i4) {
        if ((i2 | i3 | i4) == 0) {
            return g[i];
        }
        return new LocalTime(i, i2, i3, i4);
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).L();
        }
        return temporalField != null && temporalField.q(this);
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return N(temporalField);
        }
        return j$.time.temporal.o.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField == ChronoField.NANO_OF_DAY) {
                return W();
            }
            if (temporalField == ChronoField.MICRO_OF_DAY) {
                return W() / 1000;
            }
            return N(temporalField);
        }
        return temporalField.k(this);
    }

    public final int N(TemporalField temporalField) {
        int i = h.a[((ChronoField) temporalField).ordinal()];
        byte b = this.b;
        int i2 = this.d;
        byte b2 = this.a;
        switch (i) {
            case 1:
                return i2;
            case 2:
                throw new j$.time.temporal.p("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return i2 / 1000;
            case 4:
                throw new j$.time.temporal.p("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return i2 / UtilsKt.MICROS_MULTIPLIER;
            case 6:
                return (int) (W() / 1000000);
            case 7:
                return this.c;
            case 8:
                return X();
            case 9:
                return b;
            case 10:
                return (b2 * 60) + b;
            case 11:
                return b2 % 12;
            case 12:
                int i3 = b2 % 12;
                if (i3 % 12 == 0) {
                    return 12;
                }
                return i3;
            case 14:
                if (b2 == 0) {
                    return 24;
                }
            case 13:
                return b2;
            case 15:
                return b2 / 12;
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.r(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.K(j);
        int i = h.a[chronoField.ordinal()];
        byte b = this.b;
        byte b2 = this.c;
        int i2 = this.d;
        byte b3 = this.a;
        switch (i) {
            case 1:
                return Z((int) j);
            case 2:
                return P(j);
            case 3:
                return Z(((int) j) * 1000);
            case 4:
                return P(j * 1000);
            case 5:
                return Z(((int) j) * UtilsKt.MICROS_MULTIPLIER);
            case 6:
                return P(j * 1000000);
            case 7:
                int i3 = (int) j;
                if (b2 != i3) {
                    ChronoField.SECOND_OF_MINUTE.K(i3);
                    return L(b3, b, i3, i2);
                }
                return this;
            case 8:
                return U(j - ((long) X()));
            case 9:
                int i4 = (int) j;
                if (b != i4) {
                    ChronoField.MINUTE_OF_HOUR.K(i4);
                    return L(b3, i4, b2, i2);
                }
                return this;
            case 10:
                return S(j - ((long) ((b3 * 60) + b)));
            case 11:
                return R(j - ((long) (b3 % 12)));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return R(j - ((long) (b3 % 12)));
            case 13:
                int i5 = (int) j;
                if (b3 != i5) {
                    ChronoField.HOUR_OF_DAY.K(i5);
                    return L(i5, b, b2, i2);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i6 = (int) j;
                if (b3 != i6) {
                    ChronoField.HOUR_OF_DAY.K(i6);
                    return L(i6, b, b2, i2);
                }
                return this;
            case 15:
                return R((j - ((long) (b3 / 12))) * 12);
            default:
                throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime Z(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.K(i);
        return L(this.a, this.b, this.c, i);
    }

    public LocalTime truncatedTo(TemporalUnit temporalUnit) {
        if (temporalUnit == ChronoUnit.NANOS) {
            return this;
        }
        Duration durationN = temporalUnit.n();
        long j = durationN.a;
        if (j > 86400) {
            throw new j$.time.temporal.p("Unit is too large to be used for truncation");
        }
        long j2 = durationN.b;
        if (j < 0) {
            j++;
            j2 -= 1000000000;
        }
        long jO = j$.com.android.tools.r8.a.O(j$.com.android.tools.r8.a.U(j, 1000000000L), j2);
        if (86400000000000L % jO != 0) {
            throw new j$.time.temporal.p("Unit must divide into a standard day without remainder");
        }
        return P((W() / jO) * jO);
    }

    @Override // j$.time.temporal.k
    /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalTime e(long j, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            switch (h.b[((ChronoUnit) temporalUnit).ordinal()]) {
                case 1:
                    return T(j);
                case 2:
                    return T((j % 86400000000L) * 1000);
                case 3:
                    return T((j % 86400000) * 1000000);
                case 4:
                    return U(j);
                case 5:
                    return S(j);
                case 6:
                    return R(j);
                case 7:
                    return R((j % 2) * 12);
                default:
                    throw new j$.time.temporal.p("Unsupported unit: " + temporalUnit);
            }
        }
        return (LocalTime) temporalUnit.k(this, j);
    }

    public final LocalTime R(long j) {
        if (j == 0) {
            return this;
        }
        return L(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime S(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return L(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime U(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return L(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final LocalTime T(long j) {
        if (j != 0) {
            long jW = W();
            long j2 = (((j % 86400000000000L) + jW) + 86400000000000L) % 86400000000000L;
            if (jW != j2) {
                return L((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k n(long j, ChronoUnit chronoUnit) {
        return j == Long.MIN_VALUE ? e(Long.MAX_VALUE, chronoUnit).e(1L, chronoUnit) : e(-j, chronoUnit);
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        if (fVar == j$.time.temporal.o.b || fVar == j$.time.temporal.o.a || fVar == j$.time.temporal.o.e || fVar == j$.time.temporal.o.d) {
            return null;
        }
        if (fVar == j$.time.temporal.o.g) {
            return this;
        }
        if (fVar == j$.time.temporal.o.f) {
            return null;
        }
        if (fVar == j$.time.temporal.o.c) {
            return ChronoUnit.NANOS;
        }
        return fVar.h(this);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        return kVar.d(W(), ChronoField.NANO_OF_DAY);
    }

    public final int X() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    public final long W() {
        return (((long) this.c) * 1000000000) + (((long) this.b) * 60000000000L) + (((long) this.a) * 3600000000000L) + ((long) this.d);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public final int compareTo(LocalTime localTime) {
        int iCompare = Integer.compare(this.a, localTime.a);
        return (iCompare == 0 && (iCompare = Integer.compare(this.b, localTime.b)) == 0 && (iCompare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : iCompare;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.time.temporal.k
    public final j$.time.temporal.k q(LocalDate localDate) {
        return (LocalTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    public final int hashCode() {
        long jW = W();
        return (int) (jW ^ (jW >>> 32));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        sb.append(b < 10 ? "0" : "");
        sb.append((int) b);
        String str = Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR;
        byte b2 = this.b;
        sb.append(b2 < 10 ? ":0" : Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR);
        sb.append((int) b2);
        byte b3 = this.c;
        int i = this.d;
        if (b3 > 0 || i > 0) {
            if (b3 < 10) {
                str = ":0";
            }
            sb.append(str);
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % UtilsKt.MICROS_MULTIPLIER == 0) {
                    sb.append(Integer.toString((i / UtilsKt.MICROS_MULTIPLIER) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + UtilsKt.MICROS_MULTIPLIER).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    private Object writeReplace() {
        return new o((byte) 4, this);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    public final void a0(DataOutput dataOutput) {
        byte b = this.c;
        byte b2 = this.a;
        byte b3 = this.b;
        int i = this.d;
        if (i != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(b);
            dataOutput.writeInt(i);
            return;
        }
        if (b != 0) {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(b3);
            dataOutput.writeByte(~b);
        } else if (b3 == 0) {
            dataOutput.writeByte(~b2);
        } else {
            dataOutput.writeByte(b2);
            dataOutput.writeByte(~b3);
        }
    }

    public static LocalTime V(ObjectInput objectInput) throws IOException {
        int i;
        int i2;
        int i3 = objectInput.readByte();
        int i4 = 0;
        if (i3 >= 0) {
            byte b = objectInput.readByte();
            if (b < 0) {
                int i5 = ~b;
                i = 0;
                i4 = i5;
                i2 = 0;
            } else {
                byte b2 = objectInput.readByte();
                if (b2 < 0) {
                    i2 = ~b2;
                    i4 = b;
                } else {
                    i = objectInput.readInt();
                    i4 = b;
                    i2 = b2;
                }
            }
            return O(i3, i4, i2, i);
        }
        i3 = ~i3;
        i2 = 0;
        i = 0;
        return O(i3, i4, i2, i);
    }
}
