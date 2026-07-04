package com.daaw;

/* JADX INFO: renamed from: com.daaw.ra3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7950ra3 implements Uf3, Yf3 {
    public final int b;
    public C3220ag3 d;
    public int e;
    public C3519bk3 f;
    public InterfaceC1810Om2 g;
    public int h;
    public InterfaceC4110dr3 i;
    public C2485Ut1[] j;
    public long k;
    public long l;
    public boolean n;
    public boolean o;
    public Wf3 p;
    public final Object a = new Object();
    public final C5730je3 c = new C5730je3();
    public long m = Long.MIN_VALUE;

    public AbstractC7950ra3(int i) {
        this.b = i;
    }

    public final int A(long j) {
        InterfaceC4110dr3 interfaceC4110dr3 = this.i;
        interfaceC4110dr3.getClass();
        return interfaceC4110dr3.a(j - this.k);
    }

    public final long B() {
        return this.l;
    }

    public final InterfaceC1810Om2 C() {
        InterfaceC1810Om2 interfaceC1810Om2 = this.g;
        interfaceC1810Om2.getClass();
        return interfaceC1810Om2;
    }

    public final Sa3 D(Throwable th, C2485Ut1 c2485Ut1, boolean z, int i) {
        int i2;
        if (c2485Ut1 == null || this.o) {
            i2 = 4;
        } else {
            this.o = true;
            try {
                int iP = p(c2485Ut1) & 7;
                this.o = false;
                i2 = iP;
            } catch (Sa3 unused) {
                this.o = false;
                i2 = 4;
            } catch (Throwable th2) {
                this.o = false;
                throw th2;
            }
        }
        return Sa3.b(th, zzR(), this.e, c2485Ut1, i2, z, i);
    }

    public final C5730je3 E() {
        C5730je3 c5730je3 = this.c;
        c5730je3.b = null;
        c5730je3.a = null;
        return c5730je3;
    }

    public final C3220ag3 F() {
        C3220ag3 c3220ag3 = this.d;
        c3220ag3.getClass();
        return c3220ag3;
    }

    public final C3519bk3 G() {
        C3519bk3 c3519bk3 = this.f;
        c3519bk3.getClass();
        return c3519bk3;
    }

    public abstract void H();

    public abstract void I(boolean z, boolean z2);

    public abstract void J(long j, boolean z);

    public abstract void K();

    @Override // com.daaw.Yf3
    public final void a(Wf3 wf3) {
        synchronized (this.a) {
            this.p = wf3;
        }
    }

    @Override // com.daaw.Uf3
    public final void c() {
        AbstractC6048km2.f(this.h == 1);
        this.h = 2;
        s();
    }

    @Override // com.daaw.Uf3
    public final void f() {
        this.n = true;
    }

    @Override // com.daaw.Uf3
    public final int g() {
        return this.h;
    }

    @Override // com.daaw.Uf3
    public final void h(C2485Ut1[] c2485Ut1Arr, InterfaceC4110dr3 interfaceC4110dr3, long j, long j2) {
        AbstractC6048km2.f(!this.n);
        this.i = interfaceC4110dr3;
        if (this.m == Long.MIN_VALUE) {
            this.m = j;
        }
        this.j = c2485Ut1Arr;
        this.k = j2;
        v(c2485Ut1Arr, j, j2);
    }

    @Override // com.daaw.Uf3
    public final void j() {
        AbstractC6048km2.f(this.h == 0);
        C5730je3 c5730je3 = this.c;
        c5730je3.b = null;
        c5730je3.a = null;
        r();
    }

    @Override // com.daaw.Uf3
    public final void k() {
        AbstractC6048km2.f(this.h == 2);
        this.h = 1;
        t();
    }

    @Override // com.daaw.Uf3
    public final void l(long j) {
        y(j, false);
    }

    @Override // com.daaw.Uf3
    public final void m(C3220ag3 c3220ag3, C2485Ut1[] c2485Ut1Arr, InterfaceC4110dr3 interfaceC4110dr3, long j, boolean z, boolean z2, long j2, long j3) {
        AbstractC6048km2.f(this.h == 0);
        this.d = c3220ag3;
        this.h = 1;
        I(z, z2);
        h(c2485Ut1Arr, interfaceC4110dr3, j2, j3);
        y(j2, z);
    }

    @Override // com.daaw.Uf3
    public final long o() {
        return this.m;
    }

    @Override // com.daaw.Uf3
    public final void q(int i, C3519bk3 c3519bk3, InterfaceC1810Om2 interfaceC1810Om2) {
        this.e = i;
        this.f = c3519bk3;
        this.g = interfaceC1810Om2;
    }

    public abstract void r();

    public abstract void s();

    public abstract void t();

    public abstract void v(C2485Ut1[] c2485Ut1Arr, long j, long j2);

    public final boolean w() {
        if (zzN()) {
            return this.n;
        }
        InterfaceC4110dr3 interfaceC4110dr3 = this.i;
        interfaceC4110dr3.getClass();
        return interfaceC4110dr3.zze();
    }

    public final C2485Ut1[] x() {
        C2485Ut1[] c2485Ut1Arr = this.j;
        c2485Ut1Arr.getClass();
        return c2485Ut1Arr;
    }

    public final void y(long j, boolean z) {
        this.n = false;
        this.l = j;
        this.m = j;
        J(j, z);
    }

    public final int z(C5730je3 c5730je3, H93 h93, int i) {
        InterfaceC4110dr3 interfaceC4110dr3 = this.i;
        interfaceC4110dr3.getClass();
        int iB = interfaceC4110dr3.b(c5730je3, h93, i);
        if (iB == -4) {
            if (h93.f()) {
                this.m = Long.MIN_VALUE;
                return this.n ? -4 : -3;
            }
            long j = h93.f + this.k;
            h93.f = j;
            this.m = Math.max(this.m, j);
            return iB;
        }
        if (iB == -5) {
            C2485Ut1 c2485Ut1 = c5730je3.a;
            c2485Ut1.getClass();
            long j2 = c2485Ut1.p;
            if (j2 != Long.MAX_VALUE) {
                C1106Hs1 c1106Hs1B = c2485Ut1.b();
                c1106Hs1B.y(j2 + this.k);
                c5730je3.a = c1106Hs1B.D();
                return -5;
            }
        }
        return iB;
    }

    @Override // com.daaw.Uf3
    public final void zzE() {
        AbstractC6048km2.f(this.h == 0);
        K();
    }

    @Override // com.daaw.Uf3
    public final boolean zzN() {
        return this.m == Long.MIN_VALUE;
    }

    @Override // com.daaw.Uf3
    public final boolean zzO() {
        return this.n;
    }

    @Override // com.daaw.Uf3, com.daaw.Yf3
    public final int zzb() {
        return this.b;
    }

    @Override // com.daaw.Uf3
    public Ae3 zzk() {
        return null;
    }

    @Override // com.daaw.Uf3
    public final InterfaceC4110dr3 zzo() {
        return this.i;
    }

    @Override // com.daaw.Yf3
    public final void zzp() {
        synchronized (this.a) {
            this.p = null;
        }
    }

    @Override // com.daaw.Uf3
    public final void zzq() {
        AbstractC6048km2.f(this.h == 1);
        C5730je3 c5730je3 = this.c;
        c5730je3.b = null;
        c5730je3.a = null;
        this.h = 0;
        this.i = null;
        this.j = null;
        this.n = false;
        H();
    }

    @Override // com.daaw.Uf3
    public final void zzv() {
        InterfaceC4110dr3 interfaceC4110dr3 = this.i;
        interfaceC4110dr3.getClass();
        interfaceC4110dr3.zzd();
    }

    @Override // com.daaw.Uf3
    public final Yf3 zzl() {
        return this;
    }

    @Override // com.daaw.Uf3
    public /* synthetic */ void zzs() {
    }
}
