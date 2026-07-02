package com.daaw;

/* JADX INFO: loaded from: classes3.dex */
public final class Ce3 {
    public final Tp3 a;
    public final Object b;
    public final InterfaceC4110dr3[] c;
    public boolean d;
    public boolean e;
    public Fe3 f;
    public boolean g;
    public final boolean[] h;
    public final Yf3[] i;
    public final Cs3 j;
    public final Bf3 k;
    public Ce3 l;
    public C6362lr3 m;
    public Ds3 n;
    public long o;

    public Ce3(Yf3[] yf3Arr, long j, Cs3 cs3, Ls3 ls3, Bf3 bf3, Fe3 fe3, Ds3 ds3) {
        this.i = yf3Arr;
        this.o = j;
        this.j = cs3;
        this.k = bf3;
        Vp3 vp3 = fe3.a;
        this.b = vp3.a;
        this.f = fe3;
        this.m = C6362lr3.d;
        this.n = ds3;
        this.c = new InterfaceC4110dr3[2];
        this.h = new boolean[2];
        long j2 = fe3.b;
        long j3 = fe3.d;
        Tp3 tp3O = bf3.o(vp3, ls3, j2);
        this.a = j3 != -9223372036854775807L ? new Ap3(tp3O, true, 0L, j3) : tp3O;
    }

    public final long a(Ds3 ds3, long j, boolean z) {
        return b(ds3, j, false, new boolean[2]);
    }

    public final long b(Ds3 ds3, long j, boolean z, boolean[] zArr) {
        int i = 0;
        while (true) {
            boolean z2 = true;
            if (i >= ds3.a) {
                break;
            }
            boolean[] zArr2 = this.h;
            if (z || !ds3.a(this.n, i)) {
                z2 = false;
            }
            zArr2[i] = z2;
            i++;
        }
        int i2 = 0;
        while (true) {
            Yf3[] yf3Arr = this.i;
            if (i2 >= 2) {
                break;
            }
            yf3Arr[i2].zzb();
            i2++;
        }
        s();
        this.n = ds3;
        t();
        long jF = this.a.f(ds3.c, this.h, this.c, zArr, j);
        int i3 = 0;
        while (true) {
            Yf3[] yf3Arr2 = this.i;
            if (i3 >= 2) {
                break;
            }
            yf3Arr2[i3].zzb();
            i3++;
        }
        this.e = false;
        int i4 = 0;
        while (true) {
            InterfaceC4110dr3[] interfaceC4110dr3Arr = this.c;
            if (i4 >= 2) {
                return jF;
            }
            if (interfaceC4110dr3Arr[i4] != null) {
                AbstractC6048km2.f(ds3.b(i4));
                this.i[i4].zzb();
                this.e = true;
            } else {
                AbstractC6048km2.f(ds3.c[i4] == null);
            }
            i4++;
        }
    }

    public final long c() {
        if (!this.d) {
            return this.f.b;
        }
        long jZzb = this.e ? this.a.zzb() : Long.MIN_VALUE;
        return jZzb == Long.MIN_VALUE ? this.f.e : jZzb;
    }

    public final long d() {
        if (this.d) {
            return this.a.zzc();
        }
        return 0L;
    }

    public final long e() {
        return this.o;
    }

    public final long f() {
        return this.f.b + this.o;
    }

    public final Ce3 g() {
        return this.l;
    }

    public final C6362lr3 h() {
        return this.m;
    }

    public final Ds3 i() {
        return this.n;
    }

    public final Ds3 j(float f, AbstractC8657u52 abstractC8657u52) {
        Ds3 ds3E = this.j.e(this.i, this.m, this.f.a, abstractC8657u52);
        for (InterfaceC9442ws3 interfaceC9442ws3 : ds3E.c) {
        }
        return ds3E;
    }

    public final void k(long j, float f, long j2) {
        AbstractC6048km2.f(u());
        long j3 = j - this.o;
        C8249se3 c8249se3 = new C8249se3();
        c8249se3.e(j3);
        c8249se3.f(f);
        c8249se3.d(j2);
        this.a.d(new C9651xe3(c8249se3, null));
    }

    public final void l(float f, AbstractC8657u52 abstractC8657u52) {
        this.d = true;
        this.m = this.a.zzh();
        Ds3 ds3J = j(f, abstractC8657u52);
        Fe3 fe3 = this.f;
        long jMax = fe3.b;
        long j = fe3.e;
        if (j != -9223372036854775807L && jMax >= j) {
            jMax = Math.max(0L, j - 1);
        }
        long jA = a(ds3J, jMax, false);
        long j2 = this.o;
        Fe3 fe32 = this.f;
        this.o = j2 + (fe32.b - jA);
        this.f = fe32.b(jA);
    }

    public final void m(long j) {
        AbstractC6048km2.f(u());
        if (this.d) {
            this.a.a(j - this.o);
        }
    }

    public final void n() {
        s();
        Tp3 tp3 = this.a;
        try {
            boolean z = tp3 instanceof Ap3;
            Bf3 bf3 = this.k;
            if (z) {
                bf3.i(((Ap3) tp3).B);
            } else {
                bf3.i(tp3);
            }
        } catch (RuntimeException e) {
            AbstractC3305ay2.d("MediaPeriodHolder", "Period release failed.", e);
        }
    }

    public final void o(Ce3 ce3) {
        if (ce3 == this.l) {
            return;
        }
        s();
        this.l = ce3;
        t();
    }

    public final void p(long j) {
        this.o = 1000000000000L;
    }

    public final void q() {
        Tp3 tp3 = this.a;
        if (tp3 instanceof Ap3) {
            long j = this.f.d;
            if (j == -9223372036854775807L) {
                j = Long.MIN_VALUE;
            }
            ((Ap3) tp3).c(0L, j);
        }
    }

    public final boolean r() {
        if (this.d) {
            return !this.e || this.a.zzb() == Long.MIN_VALUE;
        }
        return false;
    }

    public final void s() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            Ds3 ds3 = this.n;
            if (i >= ds3.a) {
                return;
            }
            ds3.b(i);
            InterfaceC9442ws3 interfaceC9442ws3 = this.n.c[i];
            i++;
        }
    }

    public final void t() {
        if (!u()) {
            return;
        }
        int i = 0;
        while (true) {
            Ds3 ds3 = this.n;
            if (i >= ds3.a) {
                return;
            }
            ds3.b(i);
            InterfaceC9442ws3 interfaceC9442ws3 = this.n.c[i];
            i++;
        }
    }

    public final boolean u() {
        return this.l == null;
    }
}
