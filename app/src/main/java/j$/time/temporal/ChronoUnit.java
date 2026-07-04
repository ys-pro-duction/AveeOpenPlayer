package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos", Duration.q(1)),
    MICROS("Micros", Duration.q(1000)),
    MILLIS("Millis", Duration.q(1000000)),
    SECONDS("Seconds", Duration.n(1, 0)),
    MINUTES("Minutes", Duration.n(60, 0)),
    HOURS("Hours", Duration.n(3600, 0)),
    HALF_DAYS("HalfDays", Duration.n(43200, 0)),
    DAYS("Days", Duration.n(86400, 0)),
    WEEKS("Weeks", Duration.n(604800, 0)),
    MONTHS("Months", Duration.n(2629746, 0)),
    YEARS("Years", Duration.n(31556952, 0)),
    DECADES("Decades", Duration.n(315569520, 0)),
    CENTURIES("Centuries", Duration.n(3155695200L, 0)),
    MILLENNIA("Millennia", Duration.n(31556952000L, 0)),
    ERAS("Eras", Duration.n(31556952000000000L, 0)),
    FOREVER("Forever", Duration.n(j$.com.android.tools.r8.a.O(Long.MAX_VALUE, j$.com.android.tools.r8.a.T(999999999, 1000000000)), (int) j$.com.android.tools.r8.a.S(999999999, 1000000000)));

    public final String a;
    public final Duration b;

    ChronoUnit(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration n() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final k k(k kVar, long j) {
        return kVar.e(j, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
