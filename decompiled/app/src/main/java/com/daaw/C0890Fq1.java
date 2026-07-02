package com.daaw;

/* JADX INFO: renamed from: com.daaw.Fq1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0890Fq1 implements InterfaceC0682Dq1 {
    public final long a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long[] f;

    public C0890Fq1(long j, int i, long j2, long j3, long[] jArr) {
        this.a = j;
        this.b = i;
        this.c = j2;
        this.f = jArr;
        this.d = j3;
        this.e = j3 != -1 ? j + j3 : -1L;
    }

    public static C0890Fq1 c(long j, long j2, C5219ho1 c5219ho1, C5900kE2 c5900kE2) {
        int iX;
        int i = c5219ho1.g;
        int i2 = c5219ho1.d;
        int iO = c5900kE2.o();
        if ((iO & 1) != 1 || (iX = c5900kE2.x()) == 0) {
            return null;
        }
        int i3 = iO & 6;
        long jD = AbstractC9004vJ2.D(iX, ((long) i) * 1000000, i2);
        if (i3 != 6) {
            return new C0890Fq1(j2, c5219ho1.c, jD, -1L, null);
        }
        long jC = c5900kE2.C();
        long[] jArr = new long[100];
        for (int i4 = 0; i4 < 100; i4++) {
            jArr[i4] = c5900kE2.u();
        }
        if (j != -1) {
            long j3 = j2 + jC;
            if (j != j3) {
                AbstractC3305ay2.f("XingSeeker", "XING data size mismatch: " + j + ", " + j3);
            }
        }
        return new C0890Fq1(j2, c5219ho1.c, jD, jC, jArr);
    }

    @Override // com.daaw.InterfaceC6903no1
    public final C6345lo1 a(long j) {
        if (!zzh()) {
            C7182oo1 c7182oo1 = new C7182oo1(0L, this.a + ((long) this.b));
            return new C6345lo1(c7182oo1, c7182oo1);
        }
        long jMax = Math.max(0L, Math.min(j, this.c));
        double d = (jMax * 100.0d) / this.c;
        double d2 = 0.0d;
        if (d > 0.0d) {
            if (d >= 100.0d) {
                d2 = 256.0d;
            } else {
                int i = (int) d;
                long[] jArr = this.f;
                AbstractC6048km2.b(jArr);
                double d3 = jArr[i];
                d2 = d3 + ((d - ((double) i)) * ((i == 99 ? 256.0d : jArr[i + 1]) - d3));
            }
        }
        long j2 = this.d;
        C7182oo1 c7182oo12 = new C7182oo1(jMax, this.a + Math.max(this.b, Math.min(Math.round((d2 / 256.0d) * j2), j2 - 1)));
        return new C6345lo1(c7182oo12, c7182oo12);
    }

    @Override // com.daaw.InterfaceC0682Dq1
    public final long b(long j) {
        if (!zzh()) {
            return 0L;
        }
        long j2 = j - this.a;
        if (j2 <= this.b) {
            return 0L;
        }
        long[] jArr = this.f;
        AbstractC6048km2.b(jArr);
        double d = (j2 * 256.0d) / this.d;
        int iO = AbstractC9004vJ2.o(jArr, (long) d, true, true);
        long jD = d(iO);
        long j3 = jArr[iO];
        int i = iO + 1;
        long jD2 = d(i);
        return jD + Math.round((j3 == (iO == 99 ? 256L : jArr[i]) ? 0.0d : (d - j3) / (r0 - j3)) * (jD2 - jD));
    }

    public final long d(int i) {
        return (this.c * ((long) i)) / 100;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final long zza() {
        return this.c;
    }

    @Override // com.daaw.InterfaceC0682Dq1
    public final long zzc() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC6903no1
    public final boolean zzh() {
        return this.f != null;
    }
}
