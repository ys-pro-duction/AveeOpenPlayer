package com.daaw;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.DrmInitData;

/* JADX INFO: renamed from: com.daaw.He, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1048He implements VH0, WH0 {
    public final int B;
    public XH0 C;
    public int D;
    public int E;
    public QM0 F;
    public Format[] G;
    public long H;
    public boolean I = true;
    public boolean J;

    public AbstractC1048He(int i) {
        this.B = i;
    }

    public static boolean H(InterfaceC7580qE interfaceC7580qE, DrmInitData drmInitData) {
        if (drmInitData == null) {
            return true;
        }
        if (interfaceC7580qE == null) {
            return false;
        }
        return interfaceC7580qE.a(drmInitData);
    }

    public abstract void B(long j, boolean z);

    public final int F(C5103hP c5103hP, C1016Gw c1016Gw, boolean z) {
        int iJ = this.F.j(c5103hP, c1016Gw, z);
        if (iJ == -4) {
            if (c1016Gw.p()) {
                this.I = true;
                return this.J ? -4 : -3;
            }
            c1016Gw.E += this.H;
            return iJ;
        }
        if (iJ == -5) {
            Format format = c5103hP.a;
            long j = format.X;
            if (j != Long.MAX_VALUE) {
                c5103hP.a = format.g(j + this.H);
            }
        }
        return iJ;
    }

    public int G(long j) {
        return this.F.n(j - this.H);
    }

    @Override // com.daaw.VH0
    public final void e() {
        AbstractC7115ob.f(this.E == 1);
        this.E = 0;
        this.F = null;
        this.G = null;
        this.J = false;
        z();
    }

    @Override // com.daaw.VH0
    public final QM0 f() {
        return this.F;
    }

    @Override // com.daaw.VH0
    public final int getState() {
        return this.E;
    }

    @Override // com.daaw.VH0, com.daaw.WH0
    public final int h() {
        return this.B;
    }

    @Override // com.daaw.VH0
    public final boolean i() {
        return this.I;
    }

    @Override // com.daaw.VH0
    public final void j(XH0 xh0, Format[] formatArr, QM0 qm0, long j, boolean z, long j2) {
        AbstractC7115ob.f(this.E == 0);
        this.C = xh0;
        this.E = 1;
        A(z);
        l(formatArr, qm0, j2);
        B(j, z);
    }

    @Override // com.daaw.VH0
    public final void k() {
        this.J = true;
    }

    @Override // com.daaw.VH0
    public final void l(Format[] formatArr, QM0 qm0, long j) {
        AbstractC7115ob.f(!this.J);
        this.F = qm0;
        this.I = false;
        this.G = formatArr;
        this.H = j;
        E(formatArr, j);
    }

    @Override // com.daaw.WH0
    public int o() {
        return 0;
    }

    @Override // com.daaw.VH0
    public final void r() {
        this.F.b();
    }

    @Override // com.daaw.VH0
    public final void s(long j) {
        this.J = false;
        this.I = false;
        B(j, false);
    }

    @Override // com.daaw.VH0
    public final void setIndex(int i) {
        this.D = i;
    }

    @Override // com.daaw.VH0
    public final void start() {
        AbstractC7115ob.f(this.E == 1);
        this.E = 2;
        C();
    }

    @Override // com.daaw.VH0
    public final void stop() {
        AbstractC7115ob.f(this.E == 2);
        this.E = 1;
        D();
    }

    @Override // com.daaw.VH0
    public final boolean t() {
        return this.J;
    }

    @Override // com.daaw.VH0
    public InterfaceC3784ci0 u() {
        return null;
    }

    public final XH0 v() {
        return this.C;
    }

    public final int w() {
        return this.D;
    }

    public final Format[] x() {
        return this.G;
    }

    public final boolean y() {
        return this.I ? this.J : this.F.a();
    }

    public abstract void z();

    public void C() {
    }

    public void D() {
    }

    @Override // com.daaw.VH0
    public final WH0 m() {
        return this;
    }

    public void A(boolean z) {
    }

    public void E(Format[] formatArr, long j) {
    }

    @Override // com.daaw.C0488Bw0.b
    public void q(int i, Object obj) {
    }
}
