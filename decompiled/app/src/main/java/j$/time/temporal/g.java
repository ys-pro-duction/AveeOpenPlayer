package j$.time.temporal;

import j$.time.Duration;

/* JADX INFO: loaded from: classes2.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears", Duration.n(31556952, 0)),
    QUARTER_YEARS("QuarterYears", Duration.n(7889238, 0));

    public final String a;
    public final Duration b;

    g(String str, Duration duration) {
        this.a = str;
        this.b = duration;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Duration n() {
        return this.b;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final k k(k kVar, long j) {
        int i = a.a[ordinal()];
        if (i == 1) {
            return kVar.d(j$.com.android.tools.r8.a.O(kVar.get(r0), j), h.c);
        }
        if (i == 2) {
            return kVar.e(j / 4, ChronoUnit.YEARS).e((j % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.a;
    }
}
