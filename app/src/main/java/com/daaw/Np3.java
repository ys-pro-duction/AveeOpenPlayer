package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Np3 implements Tp3, Sp3 {
    public final Vp3 B;
    public final long C;
    public Xp3 D;
    public Tp3 E;
    public Sp3 F;
    public long G = -9223372036854775807L;
    public final Ls3 H;

    public Np3(Vp3 vp3, Ls3 ls3, long j) {
        this.B = vp3;
        this.H = ls3;
        this.C = j;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final void a(long j) {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        tp3.a(j);
    }

    @Override // com.daaw.Sp3
    public final void b(Tp3 tp3) {
        Sp3 sp3 = this.F;
        int i = AbstractC9004vJ2.a;
        sp3.b(this);
    }

    public final long c() {
        return this.G;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean d(C9651xe3 c9651xe3) {
        Tp3 tp3 = this.E;
        return tp3 != null && tp3.d(c9651xe3);
    }

    @Override // com.daaw.Tp3
    public final long e(long j) {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        return tp3.e(j);
    }

    @Override // com.daaw.Tp3
    public final long f(InterfaceC9442ws3[] interfaceC9442ws3Arr, boolean[] zArr, InterfaceC4110dr3[] interfaceC4110dr3Arr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.G;
        if (j3 == -9223372036854775807L || j != this.C) {
            j2 = j;
        } else {
            this.G = -9223372036854775807L;
            j2 = j3;
        }
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        return tp3.f(interfaceC9442ws3Arr, zArr, interfaceC4110dr3Arr, zArr2, j2);
    }

    @Override // com.daaw.Tp3
    public final void g(Sp3 sp3, long j) {
        this.F = sp3;
        Tp3 tp3 = this.E;
        if (tp3 != null) {
            tp3.g(this, p(this.C));
        }
    }

    @Override // com.daaw.Tp3
    public final void h(long j, boolean z) {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        tp3.h(j, false);
    }

    @Override // com.daaw.InterfaceC4389er3
    public final /* bridge */ /* synthetic */ void i(InterfaceC4678fr3 interfaceC4678fr3) {
        Sp3 sp3 = this.F;
        int i = AbstractC9004vJ2.a;
        sp3.i(this);
    }

    public final long j() {
        return this.C;
    }

    @Override // com.daaw.Tp3
    public final long k(long j, C3777cg3 c3777cg3) {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        return tp3.k(j, c3777cg3);
    }

    public final void l(Vp3 vp3) {
        long jP = p(this.C);
        Xp3 xp3 = this.D;
        xp3.getClass();
        Tp3 tp3H = xp3.h(vp3, this.H, jP);
        this.E = tp3H;
        if (this.F != null) {
            tp3H.g(this, jP);
        }
    }

    public final void m(long j) {
        this.G = j;
    }

    public final void n() {
        Tp3 tp3 = this.E;
        if (tp3 != null) {
            Xp3 xp3 = this.D;
            xp3.getClass();
            xp3.a(tp3);
        }
    }

    public final void o(Xp3 xp3) {
        AbstractC6048km2.f(this.D == null);
        this.D = xp3;
    }

    public final long p(long j) {
        long j2 = this.G;
        return j2 != -9223372036854775807L ? j2 : j;
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzb() {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        return tp3.zzb();
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final long zzc() {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        return tp3.zzc();
    }

    @Override // com.daaw.Tp3
    public final long zzd() {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        return tp3.zzd();
    }

    @Override // com.daaw.Tp3
    public final C6362lr3 zzh() {
        Tp3 tp3 = this.E;
        int i = AbstractC9004vJ2.a;
        return tp3.zzh();
    }

    @Override // com.daaw.Tp3
    public final void zzk() {
        Tp3 tp3 = this.E;
        if (tp3 != null) {
            tp3.zzk();
            return;
        }
        Xp3 xp3 = this.D;
        if (xp3 != null) {
            xp3.zzz();
        }
    }

    @Override // com.daaw.Tp3, com.daaw.InterfaceC4678fr3
    public final boolean zzp() {
        Tp3 tp3 = this.E;
        return tp3 != null && tp3.zzp();
    }
}
