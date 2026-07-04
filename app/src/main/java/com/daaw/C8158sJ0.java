package com.daaw;

/* JADX INFO: renamed from: com.daaw.sJ0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8158sJ0 implements TT {
    public float E;
    public float F;
    public float G;
    public float J;
    public float K;
    public float L;
    public boolean P;
    public float B = 1.0f;
    public float C = 1.0f;
    public float D = 1.0f;
    public long H = UT.a();
    public long I = UT.a();
    public float M = 8.0f;
    public long N = AbstractC6425m51.a.a();
    public InterfaceC5391iR0 O = AbstractC4785gF0.a();
    public InterfaceC4988gz Q = AbstractC5544iz.b(1.0f, 0.0f, 2, null);

    public float C() {
        return this.B;
    }

    public float G() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float H(int i) {
        return AbstractC4709fz.b(this, i);
    }

    public float I() {
        return this.G;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.Q.J();
    }

    public InterfaceC5391iR0 K() {
        return this.O;
    }

    public long L() {
        return this.I;
    }

    public long M() {
        return this.N;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float O(float f) {
        return AbstractC4709fz.d(this, f);
    }

    @Override // com.daaw.TT
    public void P(long j) {
        this.H = j;
    }

    @Override // com.daaw.TT
    public void U(boolean z) {
        this.P = z;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ int V(float f) {
        return AbstractC4709fz.a(this, f);
    }

    @Override // com.daaw.TT
    public void W(long j) {
        this.N = j;
    }

    @Override // com.daaw.TT
    public void Y(long j) {
        this.I = j;
    }

    public float b() {
        return this.D;
    }

    @Override // com.daaw.TT
    public void c(float f) {
        this.D = f;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ long d0(long j) {
        return AbstractC4709fz.e(this, j);
    }

    public long e() {
        return this.H;
    }

    @Override // com.daaw.InterfaceC4988gz
    public /* synthetic */ float e0(long j) {
        return AbstractC4709fz.c(this, j);
    }

    public float f() {
        return this.M;
    }

    public float f0() {
        return this.E;
    }

    public boolean g() {
        return this.P;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.Q.getDensity();
    }

    @Override // com.daaw.TT
    public void h(float f) {
        this.K = f;
    }

    public float h0() {
        return this.F;
    }

    @Override // com.daaw.TT
    public void i(float f) {
        this.L = f;
    }

    public final void i0() {
        m(1.0f);
        k(1.0f);
        c(1.0f);
        n(0.0f);
        j(0.0f);
        t(0.0f);
        P(UT.a());
        Y(UT.a());
        q(0.0f);
        h(0.0f);
        i(0.0f);
        p(8.0f);
        W(AbstractC6425m51.a.a());
        w(AbstractC4785gF0.a());
        U(false);
        l(null);
    }

    @Override // com.daaw.TT
    public void j(float f) {
        this.F = f;
    }

    public final void j0(InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC4988gz, "<set-?>");
        this.Q = interfaceC4988gz;
    }

    @Override // com.daaw.TT
    public void k(float f) {
        this.C = f;
    }

    @Override // com.daaw.TT
    public void m(float f) {
        this.B = f;
    }

    @Override // com.daaw.TT
    public void n(float f) {
        this.E = f;
    }

    public UG0 o() {
        return null;
    }

    @Override // com.daaw.TT
    public void p(float f) {
        this.M = f;
    }

    @Override // com.daaw.TT
    public void q(float f) {
        this.J = f;
    }

    public float r() {
        return this.J;
    }

    @Override // com.daaw.TT
    public void t(float f) {
        this.G = f;
    }

    @Override // com.daaw.TT
    public void w(InterfaceC5391iR0 interfaceC5391iR0) {
        G10.g(interfaceC5391iR0, "<set-?>");
        this.O = interfaceC5391iR0;
    }

    public float x() {
        return this.K;
    }

    public float y() {
        return this.L;
    }

    @Override // com.daaw.TT
    public void l(UG0 ug0) {
    }
}
