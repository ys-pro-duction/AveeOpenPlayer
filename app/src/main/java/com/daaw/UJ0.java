package com.daaw;

import android.opengl.GLES20;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class UJ0 extends AbstractC8985vF {
    public int H;
    public int I;
    public String J;
    public boolean K;
    public C3477bc1[] L;
    public C3477bc1 M;
    public boolean N;
    public boolean O;
    public int[] P;
    public int Q;
    public int R;
    public int S;

    public UJ0(String str, int i) {
        this.K = false;
        this.L = new C3477bc1[1];
        this.M = null;
        this.N = false;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
        this.J = str;
        this.H = i;
        this.I = i;
    }

    private void u0(TH0 th0) {
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        th0.T(1);
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        C(th0);
        C3477bc1[] c3477bc1Arr = this.L;
        int i = this.S;
        if (c3477bc1Arr[i % c3477bc1Arr.length] == null) {
            super.B(th0, abstractC7070oQ);
            d0(th0, abstractC7070oQ);
        } else {
            r0(th0, c3477bc1Arr[i % c3477bc1Arr.length], abstractC7070oQ);
            this.S++;
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void F(TH0 th0) {
        super.F(th0);
    }

    @Override // com.daaw.AbstractC8985vF
    public void d0(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        q0(th0, abstractC7070oQ, 0);
    }

    public boolean equals(Object obj) {
        return (obj instanceof UJ0) && this.H == ((UJ0) obj).H;
    }

    @Override // com.daaw.AbstractC8985vF
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public C1092Hp Y(int i, String str, String str2) {
        AbstractC6278lb.d("Composition", str);
        AbstractC6278lb.i(AbstractC8699uF.C.equals(str2) || str2.length() == 0);
        return new C1092Hp(i == 0);
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "Root";
    }

    @Override // com.daaw.AbstractC8985vF
    /* JADX INFO: renamed from: h0, reason: merged with bridge method [inline-methods] */
    public void Z(C1092Hp c1092Hp) {
        if (this.G.size() == 0) {
            AbstractC6278lb.i(c1092Hp.n0());
        }
        super.Z(c1092Hp);
    }

    public int hashCode() {
        return (this.H * 45) + 47;
    }

    public C3477bc1 i0(TH0 th0, C3477bc1 c3477bc1) {
        try {
            C1561Mc1 c1561Mc1I = th0.I();
            c3477bc1 = C3477bc1.g(c1561Mc1I.a, c1561Mc1I.b, 9729, 10497, false);
            return c3477bc1 != null ? c3477bc1.f() : c3477bc1;
        } catch (Exception e) {
            AbstractC0441Bk1.c(e.getMessage());
            return c3477bc1;
        }
    }

    public C3477bc1 j0(C3477bc1 c3477bc1) {
        if (c3477bc1 == null) {
            return null;
        }
        c3477bc1.a();
        return null;
    }

    public int k0() {
        return this.I;
    }

    public int[] l0() {
        return this.P;
    }

    public int m0() {
        return this.R;
    }

    public int n0() {
        return this.Q;
    }

    public String o0() {
        return this.J;
    }

    public void p0(C2695Wu c2695Wu, InterfaceC4577fX interfaceC4577fX) {
        if (b0(c2695Wu, interfaceC4577fX)) {
            c2695Wu.t(o0());
            c2695Wu.q(k0());
            c2695Wu.s("Root");
        }
    }

    public final void q0(TH0 th0, AbstractC7070oQ abstractC7070oQ, int i) {
        if (i >= this.G.size()) {
            return;
        }
        C1092Hp c1092Hp = (C1092Hp) this.G.get(i);
        Boolean bool = Boolean.FALSE;
        if (c1092Hp.W()) {
            c1092Hp.p0();
            List listG0 = c1092Hp.g0();
            for (int i2 = 0; i2 < listG0.size(); i2++) {
                q0(th0, abstractC7070oQ, ((Integer) listG0.get(i2)).intValue());
            }
            c1092Hp.F(th0);
            c1092Hp.B(th0, abstractC7070oQ);
            bool = Boolean.TRUE;
        }
        if (bool.booleanValue() || c1092Hp.m0()) {
            th0.S(i, c1092Hp.h0());
        }
    }

    public void r0(TH0 th0, C3477bc1 c3477bc1, AbstractC7070oQ abstractC7070oQ) {
        super.B(th0, c3477bc1);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        u0(th0);
        d0(th0, c3477bc1);
        if (this.O) {
            int[][] iArr = {this.P};
            th0.i(c3477bc1);
            this.P = VT.i(0, 0, c3477bc1.getWidth(), c3477bc1.getHeight(), iArr);
            this.Q = c3477bc1.getWidth();
            this.R = c3477bc1.getHeight();
        }
        C3477bc1 c3477bc12 = this.M;
        if (c3477bc12 == null) {
            super.B(th0, abstractC7070oQ);
            if (this.N) {
                th0.w(-1, new C1036Hb(c3477bc1.b(), false), f());
            }
            GLES20.glFinish();
            th0.O(c3477bc1.b());
            return;
        }
        th0.i(c3477bc12);
        th0.e(0);
        th0.p(th0.u.y());
        th0.u.y().s("resolutionW", c3477bc1.b().getWidth() * 1.0f);
        th0.u.y().s("resolutionH", c3477bc1.b().getHeight() * 1.0f);
        c3477bc1.b().c();
        th0.u.x().e(th0.u.y(), "Position");
        super.B(th0, this.M);
        if (this.N) {
            th0.w(-1, new C1036Hb(c3477bc1.b(), false), f());
        }
        GLES20.glFinish();
        th0.O(this.M.b());
    }

    public void s0(boolean z, boolean z2, int[] iArr) {
        this.O = z2;
        if (z2) {
            this.P = iArr;
        } else {
            this.P = null;
        }
        if (this.K == z) {
            return;
        }
        this.K = z;
        l();
    }

    public void t0(C2695Wu c2695Wu) {
        if (c2695Wu == null) {
            return;
        }
        this.I = c2695Wu.h();
        f0(c2695Wu);
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        int i = 0;
        if (this.K) {
            while (true) {
                C3477bc1[] c3477bc1Arr = this.L;
                if (i >= c3477bc1Arr.length) {
                    break;
                }
                c3477bc1Arr[i] = j0(c3477bc1Arr[i]);
                C3477bc1[] c3477bc1Arr2 = this.L;
                c3477bc1Arr2[i] = i0(th0, c3477bc1Arr2[i]);
                i++;
            }
            this.M = j0(this.M);
        } else {
            while (true) {
                C3477bc1[] c3477bc1Arr3 = this.L;
                if (i >= c3477bc1Arr3.length) {
                    break;
                }
                c3477bc1Arr3[i] = j0(c3477bc1Arr3[i]);
                i++;
            }
            this.M = j0(this.M);
        }
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        int i = 0;
        while (true) {
            C3477bc1[] c3477bc1Arr = this.L;
            if (i >= c3477bc1Arr.length) {
                this.M = j0(this.M);
                return;
            } else {
                c3477bc1Arr[i] = j0(c3477bc1Arr[i]);
                i++;
            }
        }
    }

    public UJ0() {
        this.J = "10";
        this.K = false;
        this.L = new C3477bc1[1];
        this.M = null;
        this.N = false;
        this.Q = 0;
        this.R = 0;
        this.S = 0;
    }
}
