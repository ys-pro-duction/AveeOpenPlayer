package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class R31 {
    public long a;
    public long b;
    public volatile long c = -9223372036854775807L;

    public R31(long j) {
        h(j);
    }

    public static long f(long j) {
        return (j * 1000000) / 90000;
    }

    public static long i(long j) {
        return (j * 90000) / 1000000;
    }

    public long a(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            this.c = j;
        } else {
            long j2 = this.a;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - j;
            }
            synchronized (this) {
                this.c = j;
                notifyAll();
            }
        }
        return j + this.b;
    }

    public long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            long jI = i(this.c);
            long j2 = (4294967296L + jI) / 8589934592L;
            long j3 = ((j2 - 1) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - jI) < Math.abs(j - jI)) {
                j = j3;
            }
        }
        return a(f(j));
    }

    public long c() {
        return this.a;
    }

    public long d() {
        if (this.c != -9223372036854775807L) {
            return this.c;
        }
        long j = this.a;
        if (j != Long.MAX_VALUE) {
            return j;
        }
        return -9223372036854775807L;
    }

    public long e() {
        if (this.a == Long.MAX_VALUE) {
            return 0L;
        }
        if (this.c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b;
    }

    public void g() {
        this.c = -9223372036854775807L;
    }

    public synchronized void h(long j) {
        AbstractC7115ob.f(this.c == -9223372036854775807L);
        this.a = j;
    }

    public synchronized void j() {
        while (this.c == -9223372036854775807L) {
            wait();
        }
    }
}
