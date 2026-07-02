package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;
import j$.util.Objects;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes2.dex */
public final class f extends h {
    public final boolean g;

    @Override // j$.time.format.h
    public final boolean a(p pVar) {
        return pVar.c && this.b == this.c && !this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [j$.time.temporal.TemporalField, java.lang.Enum] */
    @Override // j$.time.format.h, j$.time.format.e
    public final int n(p pVar, CharSequence charSequence, int i) {
        int i2 = (pVar.c || a(pVar)) ? this.b : 0;
        int i3 = (pVar.c || a(pVar)) ? this.c : 9;
        int length = charSequence.length();
        if (i != length) {
            DateTimeFormatter dateTimeFormatter = pVar.a;
            if (this.g) {
                char cCharAt = charSequence.charAt(i);
                dateTimeFormatter.c.getClass();
                if (cCharAt == '.') {
                    i++;
                } else if (i2 > 0) {
                    return ~i;
                }
            }
            int i4 = i;
            int i5 = i2 + i4;
            if (i5 > length) {
                return ~i4;
            }
            int iMin = Math.min(i3 + i4, length);
            int i6 = i4;
            int i7 = 0;
            while (true) {
                if (i6 >= iMin) {
                    break;
                }
                int i8 = i6 + 1;
                char cCharAt2 = charSequence.charAt(i6);
                dateTimeFormatter.c.getClass();
                int i9 = cCharAt2 - '0';
                if (i9 < 0 || i9 > 9) {
                    i9 = -1;
                }
                if (i9 >= 0) {
                    i7 = (i7 * 10) + i9;
                    i6 = i8;
                } else if (i8 < i5) {
                    return ~i4;
                }
            }
            BigDecimal bigDecimalMovePointLeft = new BigDecimal(i7).movePointLeft(i6 - i4);
            ?? r7 = this.a;
            ValueRange valueRangeRange = r7.range();
            BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
            return pVar.f(r7, bigDecimalMovePointLeft.multiply(BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE)).setScale(0, RoundingMode.FLOOR).add(bigDecimalValueOf).longValueExact(), i4, i6);
        }
        if (i2 > 0) {
            return ~i;
        }
        return i;
    }

    public f(ChronoField chronoField) {
        this(chronoField, 0, 9, true, 0);
        Objects.requireNonNull(chronoField, "field");
        ValueRange valueRange = chronoField.c;
        if (valueRange.a == valueRange.b && valueRange.c == valueRange.d) {
            return;
        }
        throw new IllegalArgumentException("Field must have a fixed set of values: " + chronoField);
    }

    public f(TemporalField temporalField, int i, int i2, boolean z, int i3) {
        super(temporalField, i, i2, y.NOT_NEGATIVE, i3);
        this.g = z;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [j$.time.temporal.TemporalField, java.lang.Enum] */
    @Override // j$.time.format.h
    public final h b() {
        if (this.e == -1) {
            return this;
        }
        return new f(this.a, this.b, this.c, this.g, -1);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.temporal.TemporalField, java.lang.Enum] */
    @Override // j$.time.format.h
    public final h c(int i) {
        return new f(this.a, this.b, this.c, this.g, this.e + i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.temporal.TemporalField, java.lang.Enum] */
    @Override // j$.time.format.h, j$.time.format.e
    public final boolean k(s sVar, StringBuilder sb) {
        ?? r0 = this.a;
        Long lA = sVar.a(r0);
        if (lA == null) {
            return false;
        }
        v vVar = sVar.b.c;
        long jLongValue = lA.longValue();
        ValueRange valueRangeRange = r0.range();
        valueRangeRange.b(jLongValue, r0);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(valueRangeRange.getMinimum());
        BigDecimal bigDecimalAdd = BigDecimal.valueOf(valueRangeRange.getMaximum()).subtract(bigDecimalValueOf).add(BigDecimal.ONE);
        BigDecimal bigDecimalSubtract = BigDecimal.valueOf(jLongValue).subtract(bigDecimalValueOf);
        RoundingMode roundingMode = RoundingMode.FLOOR;
        BigDecimal bigDecimalDivide = bigDecimalSubtract.divide(bigDecimalAdd, 9, roundingMode);
        BigDecimal bigDecimal = BigDecimal.ZERO;
        if (bigDecimalDivide.compareTo(bigDecimal) != 0) {
            bigDecimal = bigDecimalDivide.signum() == 0 ? new BigDecimal(BigInteger.ZERO, 0) : bigDecimalDivide.stripTrailingZeros();
        }
        int iScale = bigDecimal.scale();
        boolean z = this.g;
        int i = this.b;
        if (iScale != 0) {
            String strSubstring = bigDecimal.setScale(Math.min(Math.max(bigDecimal.scale(), i), this.c), roundingMode).toPlainString().substring(2);
            vVar.getClass();
            if (z) {
                sb.append('.');
            }
            sb.append(strSubstring);
            return true;
        }
        if (i <= 0) {
            return true;
        }
        if (z) {
            vVar.getClass();
            sb.append('.');
        }
        for (int i2 = 0; i2 < i; i2++) {
            vVar.getClass();
            sb.append('0');
        }
        return true;
    }

    @Override // j$.time.format.h
    public final String toString() {
        return "Fraction(" + this.a + "," + this.b + "," + this.c + (this.g ? ",DecimalPoint" : "") + ")";
    }
}
