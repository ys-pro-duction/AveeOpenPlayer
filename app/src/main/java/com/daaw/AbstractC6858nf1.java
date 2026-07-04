package com.daaw;

import com.daaw.C2109Re;
import com.daaw.C5510ir;

/* JADX INFO: renamed from: com.daaw.nf1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6858nf1 extends OV {
    public int y0 = 0;
    public int z0 = 0;
    public int A0 = 0;
    public int B0 = 0;
    public int C0 = 0;
    public int D0 = 0;
    public int E0 = 0;
    public int F0 = 0;
    public boolean G0 = false;
    public int H0 = 0;
    public int I0 = 0;
    public C2109Re.a J0 = new C2109Re.a();
    public C2109Re.b K0 = null;

    public void K0(boolean z) {
        int i = this.C0;
        if (i > 0 || this.D0 > 0) {
            if (z) {
                this.E0 = this.D0;
                this.F0 = i;
            } else {
                this.E0 = i;
                this.F0 = this.D0;
            }
        }
    }

    public void L0() {
        for (int i = 0; i < this.x0; i++) {
            C5510ir c5510ir = this.w0[i];
            if (c5510ir != null) {
                c5510ir.q0(true);
            }
        }
    }

    public int M0() {
        return this.I0;
    }

    public int N0() {
        return this.H0;
    }

    public int O0() {
        return this.z0;
    }

    public int P0() {
        return this.E0;
    }

    public int Q0() {
        return this.F0;
    }

    public int R0() {
        return this.y0;
    }

    public abstract void S0(int i, int i2, int i3, int i4);

    public void T0(C5510ir c5510ir, C5510ir.b bVar, int i, C5510ir.b bVar2, int i2) {
        while (this.K0 == null && G() != null) {
            this.K0 = ((C5791jr) G()).U0();
        }
        C2109Re.a aVar = this.J0;
        aVar.a = bVar;
        aVar.b = bVar2;
        aVar.c = i;
        aVar.d = i2;
        this.K0.b(c5510ir, aVar);
        c5510ir.E0(this.J0.e);
        c5510ir.h0(this.J0.f);
        c5510ir.g0(this.J0.h);
        c5510ir.b0(this.J0.g);
    }

    public boolean U0() {
        C5510ir c5510ir = this.N;
        C2109Re.b bVarU0 = c5510ir != null ? ((C5791jr) c5510ir).U0() : null;
        if (bVarU0 == null) {
            return false;
        }
        for (int i = 0; i < this.x0; i++) {
            C5510ir c5510ir2 = this.w0[i];
            if (c5510ir2 != null && !(c5510ir2 instanceof C7644qU)) {
                C5510ir.b bVarS = c5510ir2.s(0);
                C5510ir.b bVarS2 = c5510ir2.s(1);
                C5510ir.b bVar = C5510ir.b.MATCH_CONSTRAINT;
                if (bVarS != bVar || c5510ir2.l == 1 || bVarS2 != bVar || c5510ir2.m == 1) {
                    if (bVarS == bVar) {
                        bVarS = C5510ir.b.WRAP_CONTENT;
                    }
                    if (bVarS2 == bVar) {
                        bVarS2 = C5510ir.b.WRAP_CONTENT;
                    }
                    C2109Re.a aVar = this.J0;
                    aVar.a = bVarS;
                    aVar.b = bVarS2;
                    aVar.c = c5510ir2.P();
                    this.J0.d = c5510ir2.v();
                    bVarU0.b(c5510ir2, this.J0);
                    c5510ir2.E0(this.J0.e);
                    c5510ir2.h0(this.J0.f);
                    c5510ir2.b0(this.J0.g);
                }
            }
        }
        return true;
    }

    public boolean V0() {
        return this.G0;
    }

    public void W0(boolean z) {
        this.G0 = z;
    }

    public void X0(int i, int i2) {
        this.H0 = i;
        this.I0 = i2;
    }

    public void Y0(int i) {
        this.A0 = i;
        this.y0 = i;
        this.B0 = i;
        this.z0 = i;
        this.C0 = i;
        this.D0 = i;
    }

    public void Z0(int i) {
        this.z0 = i;
    }

    public void a1(int i) {
        this.D0 = i;
    }

    @Override // com.daaw.OV, com.daaw.MV
    public void b(C5791jr c5791jr) {
        L0();
    }

    public void b1(int i) {
        this.A0 = i;
        this.E0 = i;
    }

    public void c1(int i) {
        this.B0 = i;
        this.F0 = i;
    }

    public void d1(int i) {
        this.C0 = i;
        this.E0 = i;
        this.F0 = i;
    }

    public void e1(int i) {
        this.y0 = i;
    }
}
