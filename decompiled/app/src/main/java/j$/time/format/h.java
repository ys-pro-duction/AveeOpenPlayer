package j$.time.format;

import j$.time.temporal.TemporalField;
import java.math.BigInteger;

/* JADX INFO: loaded from: classes2.dex */
public class h implements e {
    public static final long[] f = {0, 10, 100, 1000, 10000, 100000, 1000000, 10000000, 100000000, 1000000000, 10000000000L};
    public final Enum a;
    public final int b;
    public final int c;
    public final y d;
    public final int e;

    /* JADX WARN: Multi-variable type inference failed */
    public h(TemporalField temporalField, int i, int i2, y yVar) {
        this.a = (Enum) temporalField;
        this.b = i;
        this.c = i2;
        this.d = yVar;
        this.e = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h(TemporalField temporalField, int i, int i2, y yVar, int i3) {
        this.a = (Enum) temporalField;
        this.b = i;
        this.c = i2;
        this.d = yVar;
        this.e = i3;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.TemporalField, java.lang.Enum] */
    public h b() {
        return this.e == -1 ? this : new h(this.a, this.b, this.c, this.d, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.TemporalField, java.lang.Enum] */
    public h c(int i) {
        int i2 = this.e + i;
        return new h(this.a, this.b, this.c, this.d, i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.TemporalField, java.lang.Enum, java.lang.Object] */
    @Override // j$.time.format.e
    public boolean k(s sVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long lA = sVar.a(r0);
        if (lA == null) {
            return false;
        }
        long jLongValue = lA.longValue();
        v vVar = sVar.b.c;
        String string = jLongValue == Long.MIN_VALUE ? "9223372036854775808" : Long.toString(Math.abs(jLongValue));
        int length = string.length();
        int i = this.c;
        if (length > i) {
            throw new j$.time.b("Field " + ((Object) r0) + " cannot be printed as the value " + jLongValue + " exceeds the maximum print width of " + i);
        }
        vVar.getClass();
        int i2 = this.b;
        y yVar = this.d;
        if (jLongValue >= 0) {
            int i3 = b.a[yVar.ordinal()];
            if (i3 != 1) {
                if (i3 == 2) {
                    sb.append('+');
                }
            } else if (i2 < 19 && jLongValue >= f[i2]) {
                sb.append('+');
            }
        } else {
            int i4 = b.a[yVar.ordinal()];
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                sb.append('-');
            } else if (i4 == 4) {
                throw new j$.time.b("Field " + ((Object) r0) + " cannot be printed as the value " + jLongValue + " cannot be negative according to the SignStyle");
            }
        }
        for (int i5 = 0; i5 < i2 - string.length(); i5++) {
            sb.append('0');
        }
        sb.append(string);
        return true;
    }

    public boolean a(p pVar) {
        int i = this.e;
        if (i != -1) {
            return i > 0 && this.b == this.c && this.d == y.NOT_NEGATIVE;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v5, types: [j$.time.temporal.TemporalField, java.lang.Enum] */
    @Override // j$.time.format.e
    public int n(p pVar, CharSequence charSequence, int i) {
        boolean z;
        boolean z2;
        BigInteger bigIntegerAdd;
        boolean z3;
        boolean z4;
        int i2;
        long j;
        int i3;
        long j2;
        int i4;
        DateTimeFormatter dateTimeFormatter;
        boolean z5;
        int i5 = i;
        int length = charSequence.length();
        if (i5 == length) {
            return ~i5;
        }
        char cCharAt = charSequence.charAt(i);
        pVar.a.c.getClass();
        DateTimeFormatter dateTimeFormatter2 = pVar.a;
        int i6 = this.c;
        y yVar = this.d;
        int i7 = this.b;
        int i8 = 0;
        if (cCharAt == '+') {
            boolean z6 = pVar.c;
            boolean z7 = i7 == i6;
            int iOrdinal = yVar.ordinal();
            if (iOrdinal == 0 ? z6 : !(iOrdinal == 1 || iOrdinal == 4 || (!z6 && !z7))) {
                return ~i5;
            }
            i5++;
            z = false;
            z2 = true;
        } else {
            dateTimeFormatter2.c.getClass();
            if (cCharAt == '-') {
                boolean z8 = pVar.c;
                boolean z9 = i7 == i6;
                int iOrdinal2 = yVar.ordinal();
                if (iOrdinal2 != 0 && iOrdinal2 != 1 && iOrdinal2 != 4 && (z8 || z9)) {
                    return ~i5;
                }
                i5++;
                z = true;
            } else {
                if (yVar == y.ALWAYS && pVar.c) {
                    return ~i5;
                }
                z = false;
            }
            z2 = false;
        }
        int i9 = (pVar.c || a(pVar)) ? i7 : 1;
        int i10 = i5 + i9;
        if (i10 > length) {
            return ~i5;
        }
        if (!pVar.c && !a(pVar)) {
            i6 = 9;
        }
        int i11 = this.e;
        int iMax = Math.max(i11, 0) + i6;
        while (true) {
            bigIntegerAdd = null;
            if (i8 >= 2) {
                z3 = z;
                z4 = z2;
                i2 = i5;
                j = 0;
                break;
            }
            int iMin = Math.min(i5 + iMax, length);
            i3 = i5;
            j2 = 0;
            while (true) {
                if (i3 >= iMin) {
                    i4 = length;
                    z3 = z;
                    break;
                }
                int i12 = i3 + 1;
                char cCharAt2 = charSequence.charAt(i3);
                i4 = length;
                dateTimeFormatter2.c.getClass();
                int i13 = cCharAt2 - '0';
                z3 = z;
                if (i13 < 0 || i13 > 9) {
                    i13 = -1;
                }
                if (i13 >= 0) {
                    if (i12 - i5 > 18) {
                        if (bigIntegerAdd == null) {
                            bigIntegerAdd = BigInteger.valueOf(j2);
                        }
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        bigIntegerAdd = bigIntegerAdd.multiply(BigInteger.TEN).add(BigInteger.valueOf(i13));
                    } else {
                        dateTimeFormatter = dateTimeFormatter2;
                        z5 = z2;
                        j2 = (j2 * 10) + ((long) i13);
                    }
                    i3 = i12;
                    z = z3;
                    length = i4;
                    dateTimeFormatter2 = dateTimeFormatter;
                    z2 = z5;
                } else if (i3 < i10) {
                    return ~i5;
                }
            }
            DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter2;
            z4 = z2;
            if (i11 <= 0 || i8 != 0) {
                break;
            }
            i8++;
            iMax = Math.max(i9, (i3 - i5) - i11);
            z = z3;
            length = i4;
            dateTimeFormatter2 = dateTimeFormatter3;
            z2 = z4;
        }
        i2 = i3;
        j = j2;
        BigInteger bigIntegerDivide = bigIntegerAdd;
        if (z3) {
            if (bigIntegerDivide != null) {
                if (bigIntegerDivide.equals(BigInteger.ZERO) && pVar.c) {
                    return ~(i5 - 1);
                }
                bigIntegerDivide = bigIntegerDivide.negate();
            } else {
                if (j == 0 && pVar.c) {
                    return ~(i5 - 1);
                }
                j = -j;
            }
        } else if (yVar == y.EXCEEDS_PAD && pVar.c) {
            int i14 = i2 - i5;
            if (z4) {
                if (i14 <= i7) {
                    return ~(i5 - 1);
                }
            } else if (i14 > i7) {
                return ~i5;
            }
        }
        int i15 = i5;
        ?? r2 = this.a;
        if (bigIntegerDivide == null) {
            return pVar.f(r2, j, i15, i2);
        }
        if (bigIntegerDivide.bitLength() > 63) {
            bigIntegerDivide = bigIntegerDivide.divide(BigInteger.TEN);
            i2--;
        }
        return pVar.f(r2, bigIntegerDivide.longValue(), i15, i2);
    }

    public String toString() {
        Enum r0 = this.a;
        int i = this.c;
        y yVar = this.d;
        int i2 = this.b;
        if (i2 == 1 && i == 19 && yVar == y.NORMAL) {
            return "Value(" + r0 + ")";
        }
        if (i2 == i && yVar == y.NOT_NEGATIVE) {
            return "Value(" + r0 + "," + i2 + ")";
        }
        return "Value(" + r0 + "," + i2 + "," + i + "," + yVar + ")";
    }
}
