package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class G90 implements OD, InterfaceC2995Zr {
    public final C6876nj B;
    public JD C;

    public G90(C6876nj c6876nj) {
        G10.g(c6876nj, "canvasDrawScope");
        this.B = c6876nj;
    }

    @Override // com.daaw.OD
    public void B(long j, long j2, long j3, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(pd, "style");
        this.B.B(j, j2, j3, f, pd, c2871Ym, i);
    }

    @Override // com.daaw.OD
    public void D(AbstractC2117Rg abstractC2117Rg, long j, long j2, long j3, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(abstractC2117Rg, "brush");
        G10.g(pd, "style");
        this.B.D(abstractC2117Rg, j, j2, j3, f, pd, c2871Ym, i);
    }

    @Override // com.daaw.OD
    public void E(InterfaceC6090kt0 interfaceC6090kt0, long j, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(interfaceC6090kt0, "path");
        G10.g(pd, "style");
        this.B.E(interfaceC6090kt0, j, f, pd, c2871Ym, i);
    }

    @Override // com.daaw.OD
    public void F(InterfaceC5418iY interfaceC5418iY, long j, long j2, long j3, long j4, float f, PD pd, C2871Ym c2871Ym, int i, int i2) {
        G10.g(interfaceC5418iY, "image");
        G10.g(pd, "style");
        this.B.F(interfaceC5418iY, j, j2, j3, j4, f, pd, c2871Ym, i, i2);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float H(int i) {
        return this.B.H(i);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.B.J();
    }

    @Override // com.daaw.OD
    public void N(InterfaceC6090kt0 interfaceC6090kt0, AbstractC2117Rg abstractC2117Rg, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(interfaceC6090kt0, "path");
        G10.g(abstractC2117Rg, "brush");
        G10.g(pd, "style");
        this.B.N(interfaceC6090kt0, abstractC2117Rg, f, pd, c2871Ym, i);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float O(float f) {
        return this.B.O(f);
    }

    @Override // com.daaw.OD
    public ID R() {
        return this.B.R();
    }

    @Override // com.daaw.OD
    public void T(long j, float f, long j2, float f2, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(pd, "style");
        this.B.T(j, f, j2, f2, pd, c2871Ym, i);
    }

    @Override // com.daaw.InterfaceC4988gz
    public int V(float f) {
        return this.B.V(f);
    }

    @Override // com.daaw.OD
    public long a() {
        return this.B.a();
    }

    @Override // com.daaw.OD
    public void a0(AbstractC2117Rg abstractC2117Rg, long j, long j2, float f, PD pd, C2871Ym c2871Ym, int i) {
        G10.g(abstractC2117Rg, "brush");
        G10.g(pd, "style");
        this.B.a0(abstractC2117Rg, j, j2, f, pd, c2871Ym, i);
    }

    @Override // com.daaw.OD
    public long b0() {
        return this.B.b0();
    }

    @Override // com.daaw.InterfaceC4988gz
    public long d0(long j) {
        return this.B.d0(j);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float e0(long j) {
        return this.B.e0(j);
    }

    @Override // com.daaw.InterfaceC2995Zr
    public void g0() {
        InterfaceC6318lj interfaceC6318ljD = R().d();
        JD jd = this.C;
        G10.d(jd);
        JD jd2 = (JD) jd.d();
        if (jd2 != null) {
            jd2.m(interfaceC6318ljD);
        } else {
            jd.b().y1(interfaceC6318ljD);
        }
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.B.getDensity();
    }

    @Override // com.daaw.OD
    public EnumC7560q90 getLayoutDirection() {
        return this.B.getLayoutDirection();
    }

    @Override // com.daaw.OD
    public void u(long j, long j2, long j3, long j4, PD pd, float f, C2871Ym c2871Ym, int i) {
        G10.g(pd, "style");
        this.B.u(j, j2, j3, j4, pd, f, c2871Ym, i);
    }

    public /* synthetic */ G90(C6876nj c6876nj, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? new C6876nj() : c6876nj);
    }
}
