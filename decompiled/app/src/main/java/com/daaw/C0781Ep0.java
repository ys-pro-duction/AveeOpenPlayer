package com.daaw;

/* JADX INFO: renamed from: com.daaw.Ep0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0781Ep0 implements InterfaceC8715uJ {
    public static final InterfaceC10117zJ d = new a();
    public InterfaceC9838yJ a;
    public VX0 b;
    public boolean c;

    /* JADX INFO: renamed from: com.daaw.Ep0$a */
    public static class a implements InterfaceC10117zJ {
        @Override // com.daaw.InterfaceC10117zJ
        public InterfaceC8715uJ[] a() {
            return new InterfaceC8715uJ[]{new C0781Ep0()};
        }
    }

    public static C2584Vs0 b(C2584Vs0 c2584Vs0) {
        c2584Vs0.J(0);
        return c2584Vs0;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public boolean c(InterfaceC9001vJ interfaceC9001vJ) {
        try {
            return e(interfaceC9001vJ);
        } catch (C3000Zs0 unused) {
            return false;
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public int d(InterfaceC9001vJ interfaceC9001vJ, C2082Qx0 c2082Qx0) throws C3000Zs0 {
        if (this.b == null) {
            if (!e(interfaceC9001vJ)) {
                throw new C3000Zs0("Failed to determine bitstream type");
            }
            interfaceC9001vJ.i();
        }
        if (!this.c) {
            Z41 z41A = this.a.a(0, 1);
            this.a.n();
            this.b.c(this.a, z41A);
            this.c = true;
        }
        return this.b.f(interfaceC9001vJ, c2082Qx0);
    }

    public final boolean e(InterfaceC9001vJ interfaceC9001vJ) {
        C0989Gp0 c0989Gp0 = new C0989Gp0();
        if (c0989Gp0.a(interfaceC9001vJ, true) && (c0989Gp0.b & 2) == 2) {
            int iMin = Math.min(c0989Gp0.i, 8);
            C2584Vs0 c2584Vs0 = new C2584Vs0(iMin);
            interfaceC9001vJ.k(c2584Vs0.a, 0, iMin);
            if (QM.o(b(c2584Vs0))) {
                this.b = new QM();
            } else if (C3497bg1.p(b(c2584Vs0))) {
                this.b = new C3497bg1();
            } else if (C4675fr0.n(b(c2584Vs0))) {
                this.b = new C4675fr0();
            }
            return true;
        }
        return false;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void f(long j, long j2) {
        VX0 vx0 = this.b;
        if (vx0 != null) {
            vx0.k(j, j2);
        }
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void i(InterfaceC9838yJ interfaceC9838yJ) {
        this.a = interfaceC9838yJ;
    }

    @Override // com.daaw.InterfaceC8715uJ
    public void a() {
    }
}
