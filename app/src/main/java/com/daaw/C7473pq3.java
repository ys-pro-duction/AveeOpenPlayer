package com.daaw;

/* JADX INFO: renamed from: com.daaw.pq3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7473pq3 implements Tp3, Sp3 {
    public final Tp3 B;
    public final long C;
    public Sp3 D;

    public C7473pq3(Tp3 tp3, long j) {
        this.B = tp3;
        this.C = j;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final void a(long j) {
        this.B.a(j - this.C);
    }

    @Override // com.daaw.Sp3
    public final void b(Tp3 tp3) {
        Sp3 sp3 = this.D;
        sp3.getClass();
        sp3.b(this);
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean d(C9651xe3 c9651xe3) {
        long j = c9651xe3.a;
        long j2 = this.C;
        C8249se3 c8249se3A = c9651xe3.a();
        c8249se3A.e(j - j2);
        return this.B.d(c8249se3A.g());
    }

    @Override // com.daaw.Tp3
    public final long e(long j) {
        long j2 = this.C;
        return this.B.e(j - j2) + j2;
    }

    @Override // com.daaw.Tp3
    public final long f(InterfaceC9442ws3[] interfaceC9442ws3Arr, boolean[] zArr, InterfaceC4110dr3[] interfaceC4110dr3Arr, boolean[] zArr2, long j) {
        InterfaceC4110dr3[] interfaceC4110dr3Arr2 = new InterfaceC4110dr3[interfaceC4110dr3Arr.length];
        int i = 0;
        while (true) {
            InterfaceC4110dr3 interfaceC4110dr3C = null;
            if (i >= interfaceC4110dr3Arr.length) {
                break;
            }
            C7752qq3 c7752qq3 = (C7752qq3) interfaceC4110dr3Arr[i];
            if (c7752qq3 != null) {
                interfaceC4110dr3C = c7752qq3.c();
            }
            interfaceC4110dr3Arr2[i] = interfaceC4110dr3C;
            i++;
        }
        long jF = this.B.f(interfaceC9442ws3Arr, zArr, interfaceC4110dr3Arr2, zArr2, j - this.C);
        for (int i2 = 0; i2 < interfaceC4110dr3Arr.length; i2++) {
            InterfaceC4110dr3 interfaceC4110dr3 = interfaceC4110dr3Arr2[i2];
            if (interfaceC4110dr3 == null) {
                interfaceC4110dr3Arr[i2] = null;
            } else {
                InterfaceC4110dr3 interfaceC4110dr32 = interfaceC4110dr3Arr[i2];
                if (interfaceC4110dr32 == null || ((C7752qq3) interfaceC4110dr32).c() != interfaceC4110dr3) {
                    interfaceC4110dr3Arr[i2] = new C7752qq3(interfaceC4110dr3, this.C);
                }
            }
        }
        return jF + this.C;
    }

    @Override // com.daaw.Tp3
    public final void g(Sp3 sp3, long j) {
        this.D = sp3;
        this.B.g(this, j - this.C);
    }

    @Override // com.daaw.Tp3
    public final void h(long j, boolean z) {
        this.B.h(j - this.C, false);
    }

    @Override // com.daaw.InterfaceC4389er3
    public final /* bridge */ /* synthetic */ void i(InterfaceC4678fr3 interfaceC4678fr3) {
        Sp3 sp3 = this.D;
        sp3.getClass();
        sp3.i(this);
    }

    @Override // com.daaw.Tp3
    public final long k(long j, C3777cg3 c3777cg3) {
        long j2 = this.C;
        return this.B.k(j - j2, c3777cg3) + j2;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzb() {
        long jZzb = this.B.zzb();
        if (jZzb == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzb + this.C;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzc() {
        long jZzc = this.B.zzc();
        if (jZzc == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jZzc + this.C;
    }

    @Override // com.daaw.Tp3
    public final long zzd() {
        long jZzd = this.B.zzd();
        if (jZzd == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return jZzd + this.C;
    }

    @Override // com.daaw.Tp3
    public final C6362lr3 zzh() {
        return this.B.zzh();
    }

    @Override // com.daaw.Tp3
    public final void zzk() {
        this.B.zzk();
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean zzp() {
        return this.B.zzp();
    }
}
