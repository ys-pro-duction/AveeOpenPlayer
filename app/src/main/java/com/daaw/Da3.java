package com.daaw;

import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public final class Da3 {
    public final long a;
    public final long b;
    public long c = -9223372036854775807L;
    public long d = -9223372036854775807L;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public float j = 0.97f;
    public float i = 1.03f;
    public float k = 1.0f;
    public long l = -9223372036854775807L;
    public long e = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long m = -9223372036854775807L;
    public long n = -9223372036854775807L;

    public /* synthetic */ Da3(float f, float f2, long j, float f3, long j2, long j3, float f4, Aa3 aa3) {
        this.a = j2;
        this.b = j3;
    }

    public static long f(long j, long j2, float f) {
        return (long) ((j * 0.999f) + (j2 * 9.999871E-4f));
    }

    public final float a(long j, long j2) {
        long jMax;
        if (this.c == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.m;
        if (j4 == -9223372036854775807L) {
            this.m = j3;
            this.n = 0L;
        } else {
            long jMax2 = Math.max(j3, f(j4, j3, 0.999f));
            this.m = jMax2;
            this.n = f(this.n, Math.abs(j3 - jMax2), 0.999f);
        }
        if (this.l != -9223372036854775807L && SystemClock.elapsedRealtime() - this.l < 1000) {
            return this.k;
        }
        this.l = SystemClock.elapsedRealtime();
        long j5 = this.m + (this.n * 3);
        if (this.h > j5) {
            float fC = AbstractC9004vJ2.C(1000L);
            long[] jArr = {j5, this.e, this.h - (((long) ((this.k - 1.0f) * fC)) + ((long) ((this.i - 1.0f) * fC)))};
            jMax = jArr[0];
            for (int i = 1; i < 3; i++) {
                long j6 = jArr[i];
                if (j6 > jMax) {
                    jMax = j6;
                }
            }
            this.h = jMax;
        } else {
            jMax = Math.max(this.h, Math.min(j - ((long) (Math.max(0.0f, this.k - 1.0f) / 1.0E-7f)), j5));
            this.h = jMax;
            long j7 = this.g;
            if (j7 != -9223372036854775807L && jMax > j7) {
                this.h = j7;
                jMax = j7;
            }
        }
        long j8 = j - jMax;
        if (Math.abs(j8) < this.a) {
            this.k = 1.0f;
            return 1.0f;
        }
        float fMax = Math.max(this.j, Math.min((j8 * 1.0E-7f) + 1.0f, this.i));
        this.k = fMax;
        return fMax;
    }

    public final long b() {
        return this.h;
    }

    public final void c() {
        long j = this.h;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.b;
        this.h = j2;
        long j3 = this.g;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.h = j3;
        }
        this.l = -9223372036854775807L;
    }

    public final void d(C4222eG1 c4222eG1) {
        long j = c4222eG1.a;
        this.c = AbstractC9004vJ2.C(-9223372036854775807L);
        this.f = AbstractC9004vJ2.C(-9223372036854775807L);
        this.g = AbstractC9004vJ2.C(-9223372036854775807L);
        this.j = 0.97f;
        this.i = 1.03f;
        g();
    }

    public final void e(long j) {
        this.d = j;
        g();
    }

    public final void g() {
        long j = this.c;
        if (j != -9223372036854775807L) {
            long j2 = this.d;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.g;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.e == j) {
            return;
        }
        this.e = j;
        this.h = j;
        this.m = -9223372036854775807L;
        this.n = -9223372036854775807L;
        this.l = -9223372036854775807L;
    }
}
