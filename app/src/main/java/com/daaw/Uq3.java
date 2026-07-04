package com.daaw;

import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class Uq3 extends AbstractC7468pp3 implements Bq3 {
    public final NW2 h;
    public final Pn3 i;
    public final int j;
    public boolean k = true;
    public long l = -9223372036854775807L;
    public boolean m;
    public boolean n;
    public InterfaceC3917d93 o;
    public YL1 p;
    public final Rq3 q;
    public final C3842ct3 r;

    public /* synthetic */ Uq3(YL1 yl1, NW2 nw2, Rq3 rq3, Pn3 pn3, C3842ct3 c3842ct3, int i, Tq3 tq3) {
        this.p = yl1;
        this.h = nw2;
        this.q = rq3;
        this.i = pn3;
        this.r = c3842ct3;
        this.j = i;
    }

    @Override // com.daaw.Xp3
    public final void a(Tp3 tp3) {
        ((Pq3) tp3).x();
    }

    @Override // com.daaw.Bq3
    public final void b(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.l;
        }
        if (!this.k && this.l == j && this.m == z && this.n == z2) {
            return;
        }
        this.l = j;
        this.m = z;
        this.n = z2;
        this.k = false;
        z();
    }

    @Override // com.daaw.Xp3
    public final synchronized YL1 g() {
        return this.p;
    }

    @Override // com.daaw.Xp3
    public final Tp3 h(Vp3 vp3, Ls3 ls3, long j) {
        InterfaceC7659qX2 interfaceC7659qX2Zza = this.h.zza();
        InterfaceC3917d93 interfaceC3917d93 = this.o;
        if (interfaceC3917d93 != null) {
            interfaceC7659qX2Zza.k(interfaceC3917d93);
        }
        MH1 mh1 = g().b;
        mh1.getClass();
        Rq3 rq3 = this.q;
        o();
        return new Pq3(mh1.a, interfaceC7659qX2Zza, new C7747qp3(rq3.a), this.i, p(vp3), this.r, r(vp3), this, ls3, null, this.j, AbstractC9004vJ2.C(-9223372036854775807L));
    }

    @Override // com.daaw.AbstractC7468pp3, com.daaw.Xp3
    public final synchronized void i(YL1 yl1) {
        this.p = yl1;
    }

    @Override // com.daaw.AbstractC7468pp3
    public final void v(InterfaceC3917d93 interfaceC3917d93) {
        this.o = interfaceC3917d93;
        Looper.myLooper().getClass();
        o();
        z();
    }

    public final void z() {
        long j = this.l;
        boolean z = this.m;
        boolean z2 = this.n;
        YL1 yl1G = g();
        AbstractC8657u52 c5236hr3 = new C5236hr3(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, yl1G, z2 ? yl1G.d : null);
        if (this.k) {
            c5236hr3 = new Qq3(this, c5236hr3);
        }
        w(c5236hr3);
    }

    @Override // com.daaw.AbstractC7468pp3
    public final void x() {
    }

    @Override // com.daaw.Xp3
    public final void zzz() {
    }
}
