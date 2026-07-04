package com.daaw;

/* JADX INFO: renamed from: com.daaw.jn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5773jn1 {
    public final long a;
    public final long b;
    public final long c;
    public long d = 0;
    public long e;
    public long f;
    public long g;
    public long h;

    public C5773jn1(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.a = j;
        this.b = j2;
        this.e = j4;
        this.f = j5;
        this.g = j6;
        this.c = j7;
        this.h = f(j2, 0L, j4, j5, j6, j7);
    }

    public static long f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) ((j - j2) * ((j5 - j4) / (j3 - j2)));
        return Math.max(j4, Math.min(((j4 + j7) - j6) - (j7 / 20), (-1) + j5));
    }

    public static /* bridge */ /* synthetic */ void g(C5773jn1 c5773jn1, long j, long j2) {
        c5773jn1.e = j;
        c5773jn1.g = j2;
        c5773jn1.i();
    }

    public static /* bridge */ /* synthetic */ void h(C5773jn1 c5773jn1, long j, long j2) {
        c5773jn1.d = j;
        c5773jn1.f = j2;
        c5773jn1.i();
    }

    public final void i() {
        this.h = f(this.b, this.d, this.e, this.f, this.g, this.c);
    }
}
