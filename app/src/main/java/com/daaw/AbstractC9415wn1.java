package com.daaw;

/* JADX INFO: renamed from: com.daaw.wn1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC9415wn1 implements InterfaceC6903no1 {
    public final long a;
    public final long b;
    public final int c;
    public final long d;
    public final int e;
    public final long f;

    public AbstractC9415wn1(long j, long j2, int i, int i2, boolean z) {
        long jD;
        this.a = j;
        this.b = j2;
        this.c = i2 == -1 ? 1 : i2;
        this.e = i;
        if (j == -1) {
            this.d = -1L;
            jD = -9223372036854775807L;
        } else {
            this.d = j - j2;
            jD = d(j, j2, i);
        }
        this.f = jD;
    }

    public static long d(long j, long j2, int i) {
        return (Math.max(0L, j - j2) * 8000000) / ((long) i);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        long j2 = this.d;
        if (j2 == -1) {
            C7182oo1 c7182oo1 = new C7182oo1(0L, this.b);
            return new C6345lo1(c7182oo1, c7182oo1);
        }
        long j3 = ((long) this.e) * j;
        long j4 = this.c;
        long jMin = ((j3 / 8000000) / j4) * j4;
        if (j2 != -1) {
            jMin = Math.min(jMin, j2 - j4);
        }
        long jMax = this.b + Math.max(jMin, 0L);
        long jC = c(jMax);
        C7182oo1 c7182oo12 = new C7182oo1(jC, jMax);
        if (this.d != -1 && jC < j) {
            long j5 = jMax + ((long) this.c);
            if (j5 < this.a) {
                return new C6345lo1(c7182oo12, new C7182oo1(c(j5), j5));
            }
        }
        return new C6345lo1(c7182oo12, c7182oo12);
    }

    public final long c(long j) {
        return d(j, this.b, this.e);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.f;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return this.d != -1;
    }
}
