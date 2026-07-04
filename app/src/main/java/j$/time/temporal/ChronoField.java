package j$.time.temporal;

import j$.time.format.w;
import j$.time.format.x;
import java.util.HashMap;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'NANO_OF_SECOND' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes2.dex */
public final class ChronoField implements TemporalField {
    public static final ChronoField ALIGNED_DAY_OF_WEEK_IN_MONTH;
    public static final ChronoField ALIGNED_DAY_OF_WEEK_IN_YEAR;
    public static final ChronoField ALIGNED_WEEK_OF_MONTH;
    public static final ChronoField ALIGNED_WEEK_OF_YEAR;
    public static final ChronoField AMPM_OF_DAY;
    public static final ChronoField CLOCK_HOUR_OF_AMPM;
    public static final ChronoField CLOCK_HOUR_OF_DAY;
    public static final ChronoField DAY_OF_MONTH;
    public static final ChronoField DAY_OF_WEEK;
    public static final ChronoField DAY_OF_YEAR;
    public static final ChronoField EPOCH_DAY;
    public static final ChronoField ERA;
    public static final ChronoField HOUR_OF_AMPM;
    public static final ChronoField HOUR_OF_DAY;
    public static final ChronoField INSTANT_SECONDS;
    public static final ChronoField MICRO_OF_DAY;
    public static final ChronoField MICRO_OF_SECOND;
    public static final ChronoField MILLI_OF_DAY;
    public static final ChronoField MILLI_OF_SECOND;
    public static final ChronoField MINUTE_OF_DAY;
    public static final ChronoField MINUTE_OF_HOUR;
    public static final ChronoField MONTH_OF_YEAR;
    public static final ChronoField NANO_OF_DAY;
    public static final ChronoField NANO_OF_SECOND;
    public static final ChronoField OFFSET_SECONDS;
    public static final ChronoField PROLEPTIC_MONTH;
    public static final ChronoField SECOND_OF_DAY;
    public static final ChronoField SECOND_OF_MINUTE;
    public static final ChronoField YEAR;
    public static final ChronoField YEAR_OF_ERA;
    public static final /* synthetic */ ChronoField[] d;
    public final String a;
    public final ChronoUnit b;
    public final ValueRange c;

    @Override // j$.time.temporal.TemporalField
    public final /* synthetic */ l n(HashMap map, w wVar, x xVar) {
        return null;
    }

    public static ChronoField valueOf(String str) {
        return (ChronoField) Enum.valueOf(ChronoField.class, str);
    }

    public static ChronoField[] values() {
        return (ChronoField[]) d.clone();
    }

    static {
        ChronoUnit chronoUnit = ChronoUnit.NANOS;
        ChronoUnit chronoUnit2 = ChronoUnit.SECONDS;
        ChronoField chronoField = new ChronoField("NANO_OF_SECOND", 0, "NanoOfSecond", chronoUnit, chronoUnit2, ValueRange.f(0L, 999999999L));
        NANO_OF_SECOND = chronoField;
        ChronoUnit chronoUnit3 = ChronoUnit.DAYS;
        ChronoField chronoField2 = new ChronoField("NANO_OF_DAY", 1, "NanoOfDay", chronoUnit, chronoUnit3, ValueRange.f(0L, 86399999999999L));
        NANO_OF_DAY = chronoField2;
        ChronoUnit chronoUnit4 = ChronoUnit.MICROS;
        ChronoField chronoField3 = new ChronoField("MICRO_OF_SECOND", 2, "MicroOfSecond", chronoUnit4, chronoUnit2, ValueRange.f(0L, 999999L));
        MICRO_OF_SECOND = chronoField3;
        ChronoField chronoField4 = new ChronoField("MICRO_OF_DAY", 3, "MicroOfDay", chronoUnit4, chronoUnit3, ValueRange.f(0L, 86399999999L));
        MICRO_OF_DAY = chronoField4;
        ChronoUnit chronoUnit5 = ChronoUnit.MILLIS;
        ChronoField chronoField5 = new ChronoField("MILLI_OF_SECOND", 4, "MilliOfSecond", chronoUnit5, chronoUnit2, ValueRange.f(0L, 999L));
        MILLI_OF_SECOND = chronoField5;
        ChronoField chronoField6 = new ChronoField("MILLI_OF_DAY", 5, "MilliOfDay", chronoUnit5, chronoUnit3, ValueRange.f(0L, 86399999L));
        MILLI_OF_DAY = chronoField6;
        ChronoUnit chronoUnit6 = ChronoUnit.MINUTES;
        ChronoField chronoField7 = new ChronoField("SECOND_OF_MINUTE", 6, "SecondOfMinute", chronoUnit2, chronoUnit6, ValueRange.f(0L, 59L), 0);
        SECOND_OF_MINUTE = chronoField7;
        ChronoField chronoField8 = new ChronoField("SECOND_OF_DAY", 7, "SecondOfDay", chronoUnit2, chronoUnit3, ValueRange.f(0L, 86399L));
        SECOND_OF_DAY = chronoField8;
        ChronoUnit chronoUnit7 = ChronoUnit.HOURS;
        ChronoField chronoField9 = new ChronoField("MINUTE_OF_HOUR", 8, "MinuteOfHour", chronoUnit6, chronoUnit7, ValueRange.f(0L, 59L), 0);
        MINUTE_OF_HOUR = chronoField9;
        ChronoField chronoField10 = new ChronoField("MINUTE_OF_DAY", 9, "MinuteOfDay", chronoUnit6, chronoUnit3, ValueRange.f(0L, 1439L));
        MINUTE_OF_DAY = chronoField10;
        ChronoUnit chronoUnit8 = ChronoUnit.HALF_DAYS;
        ChronoField chronoField11 = new ChronoField("HOUR_OF_AMPM", 10, "HourOfAmPm", chronoUnit7, chronoUnit8, ValueRange.f(0L, 11L));
        HOUR_OF_AMPM = chronoField11;
        ChronoField chronoField12 = new ChronoField("CLOCK_HOUR_OF_AMPM", 11, "ClockHourOfAmPm", chronoUnit7, chronoUnit8, ValueRange.f(1L, 12L));
        CLOCK_HOUR_OF_AMPM = chronoField12;
        ChronoField chronoField13 = new ChronoField("HOUR_OF_DAY", 12, "HourOfDay", chronoUnit7, chronoUnit3, ValueRange.f(0L, 23L), 0);
        HOUR_OF_DAY = chronoField13;
        ChronoField chronoField14 = new ChronoField("CLOCK_HOUR_OF_DAY", 13, "ClockHourOfDay", chronoUnit7, chronoUnit3, ValueRange.f(1L, 24L));
        CLOCK_HOUR_OF_DAY = chronoField14;
        ChronoField chronoField15 = new ChronoField("AMPM_OF_DAY", 14, "AmPmOfDay", chronoUnit8, chronoUnit3, ValueRange.f(0L, 1L), 0);
        AMPM_OF_DAY = chronoField15;
        ChronoUnit chronoUnit9 = ChronoUnit.WEEKS;
        ChronoField chronoField16 = new ChronoField("DAY_OF_WEEK", 15, "DayOfWeek", chronoUnit3, chronoUnit9, ValueRange.f(1L, 7L), 0);
        DAY_OF_WEEK = chronoField16;
        ChronoField chronoField17 = new ChronoField("ALIGNED_DAY_OF_WEEK_IN_MONTH", 16, "AlignedDayOfWeekInMonth", chronoUnit3, chronoUnit9, ValueRange.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_MONTH = chronoField17;
        ChronoField chronoField18 = new ChronoField("ALIGNED_DAY_OF_WEEK_IN_YEAR", 17, "AlignedDayOfWeekInYear", chronoUnit3, chronoUnit9, ValueRange.f(1L, 7L));
        ALIGNED_DAY_OF_WEEK_IN_YEAR = chronoField18;
        ChronoUnit chronoUnit10 = ChronoUnit.MONTHS;
        ChronoField chronoField19 = new ChronoField("DAY_OF_MONTH", 18, "DayOfMonth", chronoUnit3, chronoUnit10, ValueRange.g(28L, 31L), 0);
        DAY_OF_MONTH = chronoField19;
        ChronoUnit chronoUnit11 = ChronoUnit.YEARS;
        ChronoField chronoField20 = new ChronoField("DAY_OF_YEAR", 19, "DayOfYear", chronoUnit3, chronoUnit11, ValueRange.g(365L, 366L));
        DAY_OF_YEAR = chronoField20;
        ChronoUnit chronoUnit12 = ChronoUnit.FOREVER;
        ChronoField chronoField21 = new ChronoField("EPOCH_DAY", 20, "EpochDay", chronoUnit3, chronoUnit12, ValueRange.f(-365243219162L, 365241780471L));
        EPOCH_DAY = chronoField21;
        ChronoField chronoField22 = new ChronoField("ALIGNED_WEEK_OF_MONTH", 21, "AlignedWeekOfMonth", chronoUnit9, chronoUnit10, ValueRange.g(4L, 5L));
        ALIGNED_WEEK_OF_MONTH = chronoField22;
        ChronoField chronoField23 = new ChronoField("ALIGNED_WEEK_OF_YEAR", 22, "AlignedWeekOfYear", chronoUnit9, chronoUnit11, ValueRange.f(1L, 53L));
        ALIGNED_WEEK_OF_YEAR = chronoField23;
        ChronoField chronoField24 = new ChronoField("MONTH_OF_YEAR", 23, "MonthOfYear", chronoUnit10, chronoUnit11, ValueRange.f(1L, 12L), 0);
        MONTH_OF_YEAR = chronoField24;
        ChronoField chronoField25 = new ChronoField("PROLEPTIC_MONTH", 24, "ProlepticMonth", chronoUnit10, chronoUnit12, ValueRange.f(-11999999988L, 11999999999L));
        PROLEPTIC_MONTH = chronoField25;
        ChronoField chronoField26 = new ChronoField("YEAR_OF_ERA", 25, "YearOfEra", chronoUnit11, chronoUnit12, ValueRange.g(999999999L, 1000000000L));
        YEAR_OF_ERA = chronoField26;
        ChronoField chronoField27 = new ChronoField("YEAR", 26, "Year", chronoUnit11, chronoUnit12, ValueRange.f(-999999999L, 999999999L), 0);
        YEAR = chronoField27;
        ChronoField chronoField28 = new ChronoField("ERA", 27, "Era", ChronoUnit.ERAS, chronoUnit12, ValueRange.f(0L, 1L), 0);
        ERA = chronoField28;
        ChronoField chronoField29 = new ChronoField("INSTANT_SECONDS", 28, "InstantSeconds", chronoUnit2, chronoUnit12, ValueRange.f(Long.MIN_VALUE, Long.MAX_VALUE));
        INSTANT_SECONDS = chronoField29;
        ChronoField chronoField30 = new ChronoField("OFFSET_SECONDS", 29, "OffsetSeconds", chronoUnit2, chronoUnit12, ValueRange.f(-64800L, 64800L));
        OFFSET_SECONDS = chronoField30;
        d = new ChronoField[]{chronoField, chronoField2, chronoField3, chronoField4, chronoField5, chronoField6, chronoField7, chronoField8, chronoField9, chronoField10, chronoField11, chronoField12, chronoField13, chronoField14, chronoField15, chronoField16, chronoField17, chronoField18, chronoField19, chronoField20, chronoField21, chronoField22, chronoField23, chronoField24, chronoField25, chronoField26, chronoField27, chronoField28, chronoField29, chronoField30};
    }

    public ChronoField(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, ValueRange valueRange) {
        this.a = str2;
        this.b = chronoUnit;
        this.c = valueRange;
    }

    public ChronoField(String str, int i, String str2, ChronoUnit chronoUnit, ChronoUnit chronoUnit2, ValueRange valueRange, int i2) {
        this.a = str2;
        this.b = chronoUnit;
        this.c = valueRange;
    }

    @Override // j$.time.temporal.TemporalField
    public final TemporalUnit getBaseUnit() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalField
    public final ValueRange range() {
        return this.c;
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean y() {
        return ordinal() >= DAY_OF_WEEK.ordinal() && ordinal() <= ERA.ordinal();
    }

    public final boolean L() {
        return ordinal() < DAY_OF_WEEK.ordinal();
    }

    public final void K(long j) {
        this.c.b(j, this);
    }

    @Override // j$.time.temporal.TemporalField
    public final boolean q(l lVar) {
        return lVar.f(this);
    }

    @Override // j$.time.temporal.TemporalField
    public final ValueRange u(l lVar) {
        return lVar.r(this);
    }

    @Override // j$.time.temporal.TemporalField
    public final long k(l lVar) {
        return lVar.u(this);
    }

    @Override // j$.time.temporal.TemporalField
    public final k r(k kVar, long j) {
        return kVar.d(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
