package com.daaw;

import com.daaw.CO0;

/* JADX INFO: loaded from: classes.dex */
public final class DN implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ p = new a();
    public static final int q = AbstractC6280lb1.v("FLV");
    public InterfaceC9838yJ f;
    public int i;
    public int j;
    public int k;
    public long l;
    public boolean m;
    public C3475bc n;
    public C1462Ld1 o;
    public final C2584Vs0 a = new C2584Vs0(4);
    public final C2584Vs0 b = new C2584Vs0(9);
    public final C2584Vs0 c = new C2584Vs0(11);
    public final C2584Vs0 d = new C2584Vs0();
    public final XN0 e = new XN0();
    public int g = 1;
    public long h = -9223372036854775807L;

    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new DN()};
        }
    }

    public final void b() {
        if (!this.m) {
            this.f.b(new CO0.b(-9223372036854775807L));
            this.m = true;
        }
        if (this.h == -9223372036854775807L) {
            this.h = this.e.d() == -9223372036854775807L ? -this.l : 0L;
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        interfaceC9001vJ.k(this.a.a, 0, 3);
        this.a.J(0);
        if (this.a.A() != q) {
            return false;
        }
        interfaceC9001vJ.k(this.a.a, 0, 2);
        this.a.J(0);
        if ((this.a.D() & 250) != 0) {
            return false;
        }
        interfaceC9001vJ.k(this.a.a, 0, 4);
        this.a.J(0);
        int i = this.a.i();
        interfaceC9001vJ.i();
        interfaceC9001vJ.h(i);
        interfaceC9001vJ.k(this.a.a, 0, 4);
        this.a.J(0);
        return this.a.i() == 0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) {
        while (true) {
            int i = this.g;
            if (i != 1) {
                if (i == 2) {
                    k(interfaceC9001vJ);
                } else if (i != 3) {
                    if (i != 4) {
                        throw new IllegalStateException();
                    }
                    if (h(interfaceC9001vJ)) {
                        return 0;
                    }
                } else if (!j(interfaceC9001vJ)) {
                    return -1;
                }
            } else if (!g(interfaceC9001vJ)) {
                return -1;
            }
        }
    }

    public final C2584Vs0 e(InterfaceC9001vJ interfaceC9001vJ) {
        if (this.k > this.d.b()) {
            C2584Vs0 c2584Vs0 = this.d;
            c2584Vs0.H(new byte[Math.max(c2584Vs0.b() * 2, this.k)], 0);
        } else {
            this.d.J(0);
        }
        this.d.I(this.k);
        interfaceC9001vJ.g(this.d.a, 0, this.k);
        return this.d;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        this.g = 1;
        this.h = -9223372036854775807L;
        this.i = 0;
    }

    public final boolean g(InterfaceC9001vJ interfaceC9001vJ) {
        if (!interfaceC9001vJ.d(this.b.a, 0, 9, true)) {
            return false;
        }
        this.b.J(0);
        this.b.K(4);
        int iX = this.b.x();
        boolean z = (iX & 4) != 0;
        boolean z2 = (iX & 1) != 0;
        if (z && this.n == null) {
            this.n = new C3475bc(this.f.a(8, 1));
        }
        if (z2 && this.o == null) {
            this.o = new C1462Ld1(this.f.a(9, 2));
        }
        this.f.n();
        this.i = this.b.i() - 5;
        this.g = 2;
        return true;
    }

    public final boolean h(InterfaceC9001vJ interfaceC9001vJ) {
        int i = this.j;
        boolean z = true;
        if (i == 8 && this.n != null) {
            b();
            this.n.a(e(interfaceC9001vJ), this.h + this.l);
        } else if (i == 9 && this.o != null) {
            b();
            this.o.a(e(interfaceC9001vJ), this.h + this.l);
        } else if (i != 18 || this.m) {
            interfaceC9001vJ.j(this.k);
            z = false;
        } else {
            this.e.a(e(interfaceC9001vJ), this.l);
            long jD = this.e.d();
            if (jD != -9223372036854775807L) {
                this.f.b(new CO0.b(jD));
                this.m = true;
            }
        }
        this.i = 4;
        this.g = 2;
        return z;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.f = interfaceC9838yJ;
    }

    public final boolean j(InterfaceC9001vJ interfaceC9001vJ) {
        if (!interfaceC9001vJ.d(this.c.a, 0, 11, true)) {
            return false;
        }
        this.c.J(0);
        this.j = this.c.x();
        this.k = this.c.A();
        this.l = this.c.A();
        this.l = (((long) (this.c.x() << 24)) | this.l) * 1000;
        this.c.K(3);
        this.g = 4;
        return true;
    }

    public final void k(InterfaceC9001vJ interfaceC9001vJ) {
        interfaceC9001vJ.j(this.i);
        this.i = 0;
        this.g = 3;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
