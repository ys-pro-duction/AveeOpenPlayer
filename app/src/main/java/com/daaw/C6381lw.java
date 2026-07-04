package com.daaw;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.daaw.lw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6381lw implements Comparable {
    public static final b E = new b();
    public static final long F;
    public static final long G;
    public static final long H;
    public final c B;
    public final long C;
    public volatile boolean D;

    /* JADX INFO: renamed from: com.daaw.lw$b */
    public static class b extends c {
        public b() {
        }

        @Override // com.daaw.C6381lw.c
        public long a() {
            return System.nanoTime();
        }
    }

    /* JADX INFO: renamed from: com.daaw.lw$c */
    public static abstract class c {
        public abstract long a();
    }

    static {
        long nanos = TimeUnit.DAYS.toNanos(36500L);
        F = nanos;
        G = -nanos;
        H = TimeUnit.SECONDS.toNanos(1L);
    }

    public C6381lw(c cVar, long j, boolean z) {
        this(cVar, cVar.a(), j, z);
    }

    public static C6381lw a(long j, TimeUnit timeUnit) {
        return c(j, timeUnit, E);
    }

    public static C6381lw c(long j, TimeUnit timeUnit, c cVar) {
        g(timeUnit, "units");
        return new C6381lw(cVar, timeUnit.toNanos(j), true);
    }

    public static Object g(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(String.valueOf(obj2));
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C6381lw)) {
            return false;
        }
        C6381lw c6381lw = (C6381lw) obj;
        c cVar = this.B;
        if (cVar != null ? cVar == c6381lw.B : c6381lw.B == null) {
            return this.C == c6381lw.C;
        }
        return false;
    }

    public final void h(C6381lw c6381lw) {
        if (this.B == c6381lw.B) {
            return;
        }
        throw new AssertionError("Tickers (" + this.B + " and " + c6381lw.B + ") don't match. Custom Ticker should only be used in tests!");
    }

    public int hashCode() {
        return Arrays.asList(this.B, Long.valueOf(this.C)).hashCode();
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public int compareTo(C6381lw c6381lw) {
        h(c6381lw);
        long j = this.C - c6381lw.C;
        if (j < 0) {
            return -1;
        }
        return j > 0 ? 1 : 0;
    }

    public boolean l(C6381lw c6381lw) {
        h(c6381lw);
        return this.C - c6381lw.C < 0;
    }

    public boolean m() {
        if (!this.D) {
            if (this.C - this.B.a() > 0) {
                return false;
            }
            this.D = true;
        }
        return true;
    }

    public C6381lw n(C6381lw c6381lw) {
        h(c6381lw);
        return l(c6381lw) ? this : c6381lw;
    }

    public long o(TimeUnit timeUnit) {
        long jA = this.B.a();
        if (!this.D && this.C - jA <= 0) {
            this.D = true;
        }
        return timeUnit.convert(this.C - jA, TimeUnit.NANOSECONDS);
    }

    public String toString() {
        long jO = o(TimeUnit.NANOSECONDS);
        long jAbs = Math.abs(jO);
        long j = H;
        long j2 = jAbs / j;
        long jAbs2 = Math.abs(jO) % j;
        StringBuilder sb = new StringBuilder();
        if (jO < 0) {
            sb.append('-');
        }
        sb.append(j2);
        if (jAbs2 > 0) {
            sb.append(String.format(Locale.US, ".%09d", Long.valueOf(jAbs2)));
        }
        sb.append("s from now");
        if (this.B != E) {
            sb.append(" (ticker=" + this.B + ")");
        }
        return sb.toString();
    }

    public C6381lw(c cVar, long j, long j2, boolean z) {
        this.B = cVar;
        long jMin = Math.min(F, Math.max(G, j2));
        this.C = j + jMin;
        this.D = z && jMin <= 0;
    }
}
