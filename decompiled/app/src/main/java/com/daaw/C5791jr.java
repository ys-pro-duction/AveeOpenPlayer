package com.daaw;

import com.daaw.C2109Re;
import com.daaw.C5510ir;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.jr, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5791jr extends AbstractC2641Wg1 {
    public int C0;
    public int D0;
    public int E0;
    public int F0;
    public C2109Re x0 = new C2109Re(this);
    public C7788qz y0 = new C7788qz(this);
    public C2109Re.b z0 = null;
    public boolean A0 = false;
    public C4311ec0 B0 = new C4311ec0();
    public int G0 = 0;
    public int H0 = 0;
    public C2651Wj[] I0 = new C2651Wj[4];
    public C2651Wj[] J0 = new C2651Wj[4];
    public boolean K0 = false;
    public boolean L0 = false;
    public boolean M0 = false;
    public int N0 = 0;
    public int O0 = 0;
    public int P0 = 263;
    public boolean Q0 = false;
    public boolean R0 = false;
    public boolean S0 = false;
    public int T0 = 0;

    @Override // com.daaw.C5510ir
    public void I0(boolean z, boolean z2) {
        super.I0(z, z2);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            ((C5510ir) this.w0.get(i)).I0(z, z2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x01c7 A[PHI: r0 r12
  0x01c7: PHI (r0v26 boolean) = (r0v25 boolean), (r0v28 boolean), (r0v28 boolean), (r0v28 boolean) binds: [B:69:0x018c, B:77:0x01af, B:78:0x01b1, B:80:0x01b7] A[DONT_GENERATE, DONT_INLINE]
  0x01c7: PHI (r12v5 boolean) = (r12v4 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean) binds: [B:69:0x018c, B:77:0x01af, B:78:0x01b1, B:80:0x01b7] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.daaw.AbstractC2641Wg1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void K0() {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C5791jr.K0():void");
    }

    public void N0(C5510ir c5510ir, int i) {
        if (i == 0) {
            P0(c5510ir);
        } else if (i == 1) {
            Q0(c5510ir);
        }
    }

    public boolean O0(C4311ec0 c4311ec0) {
        f(c4311ec0);
        int size = this.w0.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            C5510ir c5510ir = (C5510ir) this.w0.get(i);
            c5510ir.o0(0, false);
            c5510ir.o0(1, false);
            if (c5510ir instanceof C5726je) {
                z = true;
            }
        }
        if (z) {
            for (int i2 = 0; i2 < size; i2++) {
                C5510ir c5510ir2 = (C5510ir) this.w0.get(i2);
                if (c5510ir2 instanceof C5726je) {
                    ((C5726je) c5510ir2).N0();
                }
            }
        }
        for (int i3 = 0; i3 < size; i3++) {
            C5510ir c5510ir3 = (C5510ir) this.w0.get(i3);
            if (c5510ir3.e()) {
                c5510ir3.f(c4311ec0);
            }
        }
        for (int i4 = 0; i4 < size; i4++) {
            C5510ir c5510ir4 = (C5510ir) this.w0.get(i4);
            if (c5510ir4 instanceof C5791jr) {
                C5510ir.b[] bVarArr = c5510ir4.M;
                C5510ir.b bVar = bVarArr[0];
                C5510ir.b bVar2 = bVarArr[1];
                C5510ir.b bVar3 = C5510ir.b.WRAP_CONTENT;
                if (bVar == bVar3) {
                    c5510ir4.l0(C5510ir.b.FIXED);
                }
                if (bVar2 == bVar3) {
                    c5510ir4.A0(C5510ir.b.FIXED);
                }
                c5510ir4.f(c4311ec0);
                if (bVar == bVar3) {
                    c5510ir4.l0(bVar);
                }
                if (bVar2 == bVar3) {
                    c5510ir4.A0(bVar2);
                }
            } else {
                AbstractC2784Xq0.a(this, c4311ec0, c5510ir4);
                if (!c5510ir4.e()) {
                    c5510ir4.f(c4311ec0);
                }
            }
        }
        if (this.G0 > 0) {
            AbstractC2547Vj.a(this, c4311ec0, 0);
        }
        if (this.H0 > 0) {
            AbstractC2547Vj.a(this, c4311ec0, 1);
        }
        return true;
    }

    public final void P0(C5510ir c5510ir) {
        int i = this.G0 + 1;
        C2651Wj[] c2651WjArr = this.J0;
        if (i >= c2651WjArr.length) {
            this.J0 = (C2651Wj[]) Arrays.copyOf(c2651WjArr, c2651WjArr.length * 2);
        }
        this.J0[this.G0] = new C2651Wj(c5510ir, 0, a1());
        this.G0++;
    }

    public final void Q0(C5510ir c5510ir) {
        int i = this.H0 + 1;
        C2651Wj[] c2651WjArr = this.I0;
        if (i >= c2651WjArr.length) {
            this.I0 = (C2651Wj[]) Arrays.copyOf(c2651WjArr, c2651WjArr.length * 2);
        }
        this.I0[this.H0] = new C2651Wj(c5510ir, 1, a1());
        this.H0++;
    }

    public boolean R0(boolean z) {
        return this.y0.f(z);
    }

    public boolean S0(boolean z) {
        return this.y0.g(z);
    }

    public boolean T0(boolean z, int i) {
        return this.y0.h(z, i);
    }

    public C2109Re.b U0() {
        return this.z0;
    }

    public int V0() {
        return this.P0;
    }

    public boolean W0() {
        return false;
    }

    public void X0() {
        this.y0.j();
    }

    @Override // com.daaw.AbstractC2641Wg1, com.daaw.C5510ir
    public void Y() {
        this.B0.D();
        this.C0 = 0;
        this.E0 = 0;
        this.D0 = 0;
        this.F0 = 0;
        this.Q0 = false;
        super.Y();
    }

    public void Y0() {
        this.y0.k();
    }

    public boolean Z0() {
        return this.S0;
    }

    public boolean a1() {
        return this.A0;
    }

    public boolean b1() {
        return this.R0;
    }

    public long c1(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.C0 = i8;
        this.D0 = i9;
        return this.x0.d(this, i, i8, i9, i2, i3, i4, i5, i6, i7);
    }

    public boolean d1(int i) {
        return (this.P0 & i) == i;
    }

    public final void e1() {
        this.G0 = 0;
        this.H0 = 0;
    }

    public void f1(C2109Re.b bVar) {
        this.z0 = bVar;
        this.y0.n(bVar);
    }

    public void g1(int i) {
        this.P0 = i;
        C4311ec0.r = AbstractC2784Xq0.b(i, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    public void h1(boolean z) {
        this.A0 = z;
    }

    public void i1(C4311ec0 c4311ec0, boolean[] zArr) {
        zArr[2] = false;
        J0(c4311ec0);
        int size = this.w0.size();
        for (int i = 0; i < size; i++) {
            ((C5510ir) this.w0.get(i)).J0(c4311ec0);
        }
    }

    public void j1() {
        this.x0.e(this);
    }
}
