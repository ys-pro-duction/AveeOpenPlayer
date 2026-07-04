package com.daaw;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.uX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8772uX0 {
    public final B31 a = B31.b();
    public boolean b;
    public long c;
    public long d;

    /* JADX INFO: renamed from: com.daaw.uX0$a */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            a = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static String a(TimeUnit timeUnit) {
        switch (a.a[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return "s";
            case 5:
                return "min";
            case 6:
                return "h";
            case 7:
                return "d";
            default:
                throw new AssertionError();
        }
    }

    public static TimeUnit b(long j) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    public static C8772uX0 c() {
        return new C8772uX0();
    }

    public long d(TimeUnit timeUnit) {
        return timeUnit.convert(e(), TimeUnit.NANOSECONDS);
    }

    public final long e() {
        return this.b ? (this.a.a() - this.d) + this.c : this.c;
    }

    public C8772uX0 f() {
        this.c = 0L;
        this.b = false;
        return this;
    }

    public C8772uX0 g() {
        AbstractC7785qy0.u(!this.b, "This stopwatch is already running.");
        this.b = true;
        this.d = this.a.a();
        return this;
    }

    public String toString() {
        long jE = e();
        TimeUnit timeUnitB = b(jE);
        String strA = AbstractC2070Qu0.a(jE / TimeUnit.NANOSECONDS.convert(1L, timeUnitB));
        String strA2 = a(timeUnitB);
        StringBuilder sb = new StringBuilder(String.valueOf(strA).length() + 1 + String.valueOf(strA2).length());
        sb.append(strA);
        sb.append(" ");
        sb.append(strA2);
        return sb.toString();
    }
}
