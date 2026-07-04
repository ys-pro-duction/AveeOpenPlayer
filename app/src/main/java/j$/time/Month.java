package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.TemporalAdjuster;
import j$.time.temporal.TemporalField;
import j$.time.temporal.ValueRange;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class Month implements j$.time.temporal.l, TemporalAdjuster {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;
    public static final Month[] a;
    public static final /* synthetic */ Month[] b;

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) b.clone();
    }

    static {
        Month month = new Month("JANUARY", 0);
        JANUARY = month;
        Month month2 = new Month("FEBRUARY", 1);
        FEBRUARY = month2;
        Month month3 = new Month("MARCH", 2);
        MARCH = month3;
        Month month4 = new Month("APRIL", 3);
        APRIL = month4;
        Month month5 = new Month("MAY", 4);
        MAY = month5;
        Month month6 = new Month("JUNE", 5);
        JUNE = month6;
        Month month7 = new Month("JULY", 6);
        JULY = month7;
        Month month8 = new Month("AUGUST", 7);
        AUGUST = month8;
        Month month9 = new Month("SEPTEMBER", 8);
        SEPTEMBER = month9;
        Month month10 = new Month("OCTOBER", 9);
        OCTOBER = month10;
        Month month11 = new Month("NOVEMBER", 10);
        NOVEMBER = month11;
        Month month12 = new Month("DECEMBER", 11);
        DECEMBER = month12;
        b = new Month[]{month, month2, month3, month4, month5, month6, month7, month8, month9, month10, month11, month12};
        a = values();
    }

    public static Month N(int i) {
        if (i < 1 || i > 12) {
            throw new b("Invalid value for MonthOfYear: " + i);
        }
        return a[i - 1];
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.l
    public final boolean f(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.q(this);
    }

    @Override // j$.time.temporal.l
    public final ValueRange r(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return temporalField.range();
        }
        return j$.time.temporal.o.d(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final int get(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        return j$.time.temporal.o.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    public final long u(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.p(c.a("Unsupported field: ", temporalField));
        }
        return temporalField.k(this);
    }

    public final int L(boolean z) {
        int i = i.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int M() {
        int i = i.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    public final int K(boolean z) {
        switch (i.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    @Override // j$.time.temporal.l
    public final Object k(f fVar) {
        if (fVar == j$.time.temporal.o.b) {
            return j$.time.chrono.r.c;
        }
        if (fVar == j$.time.temporal.o.c) {
            return ChronoUnit.MONTHS;
        }
        return j$.time.temporal.o.c(this, fVar);
    }

    @Override // j$.time.temporal.TemporalAdjuster
    public final j$.time.temporal.k y(j$.time.temporal.k kVar) {
        if (!j$.com.android.tools.r8.a.M(kVar).equals(j$.time.chrono.r.c)) {
            throw new b("Adjustment only supported on ISO date-time");
        }
        return kVar.d(getValue(), ChronoField.MONTH_OF_YEAR);
    }
}
