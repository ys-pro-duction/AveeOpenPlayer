package com.daaw;

import java.util.Random;

/* JADX INFO: renamed from: com.daaw.Se, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2215Se extends AbstractC3031a {
    public float D;
    public final Random f = new Random();
    public String g = null;
    public float h = 1.5f;
    public float i = 0.1f;
    public C1458Lc1 j = new C1458Lc1(0.0f, 0.0f);
    public boolean k = true;
    public float[] l = {1.0f, 1.0f, 1.0f, 1.0f};
    public float[] m = {1.0f, 1.0f, 1.0f, 1.0f};
    public float n = 0.0f;
    public float o = 0.0f;
    public float p = 0.0f;
    public float q = 0.0f;
    public float r = 1.0f;
    public float s = 4.0f;
    public float t = 4.0f;
    public float u = 4.0f;
    public float v = 0.0f;
    public float w = 0.0f;
    public float[] x = new float[4];
    public float[] y = new float[4];
    public float z = 0.1f;
    public float A = 0.1f;
    public float B = 0.1f;
    public float C = 0.1f;

    public C2215Se() {
        x(0.1f);
    }

    public void A(float f) {
        this.n = f;
    }

    public void B(float f) {
        this.p = f;
    }

    public void C(float f) {
        this.s = f;
    }

    @Override // com.daaw.AbstractC3031a, com.daaw.QW
    public void a(C2591Vu c2591Vu) {
        super.a(c2591Vu);
        this.l = c2591Vu.n("ColorFrom", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.m = c2591Vu.n("ColorTo", new float[]{0.0f, 0.0f, 0.5f, 0.5f});
        this.h = c2591Vu.p("lifetime", 8.0f);
        x(c2591Vu.p("fadeInAndOutTime", 0.1f));
        this.j = c2591Vu.A("gravity", new C1458Lc1(0.0f, 0.0f));
        this.k = c2591Vu.o("velocityAngle", true);
        this.r = c2591Vu.p("sizeAspectRatio", 1.0f);
        this.s = c2591Vu.p("startSize", 0.0f);
        this.t = c2591Vu.p("fadeInSize", 4.0f);
        this.u = c2591Vu.p("endSize", 4.0f);
        this.v = c2591Vu.p("endSizeRandom", 10.0f);
        this.w = c2591Vu.p("endSizeZFactor", 0.0f);
        this.n = c2591Vu.p("sideSineWaveFreq", 0.0f);
        this.o = c2591Vu.p("sideSineWaveFreqRandom", 0.0f);
        this.p = c2591Vu.p("sideSineWaveMag", 0.0f);
        this.q = c2591Vu.p("sideSineWaveMagRandom", 0.0f);
    }

    @Override // com.daaw.InterfaceC8492tX
    public boolean g(TH0 th0, InterfaceC8213sX interfaceC8213sX, C1665Nc1 c1665Nc1, C1665Nc1 c1665Nc12) {
        C4117dt0 c4117dt0 = (C4117dt0) interfaceC8213sX;
        float fNextFloat = this.f.nextFloat();
        float f = 1.0f - fNextFloat;
        C1665Nc1 c1665Nc13 = new C1665Nc1(c1665Nc12.a * 0.2f, c1665Nc12.b * 0.2f, c1665Nc12.c * 0.02f);
        c1665Nc13.c();
        float f2 = this.v * fNextFloat;
        this.D = this.u + (this.w * c1665Nc13.c);
        this.e = this.a + (this.b * fNextFloat);
        c4117dt0.h(4);
        c4117dt0.i(0).g = this.n + (this.o * f);
        c4117dt0.i(0).h = this.p + (this.q * fNextFloat);
        c4117dt0.i(1).g = this.n + (this.o * f);
        c4117dt0.i(1).h = this.p + (this.q * fNextFloat);
        c4117dt0.i(2).g = this.n + (this.o * f);
        c4117dt0.i(2).h = this.p + (this.q * fNextFloat);
        c4117dt0.i(3).g = this.n + (this.o * f);
        c4117dt0.i(3).h = this.p + (this.q * fNextFloat);
        c4117dt0.i(0).a = 0.0f;
        c4117dt0.i(1).a = this.z;
        c4117dt0.i(2).a = this.A;
        c4117dt0.i(3).a = 1.0f;
        c4117dt0.i(0).e = this.k;
        c4117dt0.i(1).e = this.k;
        c4117dt0.i(2).e = this.k;
        c4117dt0.i(3).e = this.k;
        C4396et0 c4396et0I = c4117dt0.i(0);
        C4396et0 c4396et0I2 = c4117dt0.i(0);
        float f3 = this.s + f2;
        c4396et0I2.c = f3;
        c4396et0I.b = f3;
        C4396et0 c4396et0I3 = c4117dt0.i(1);
        C4396et0 c4396et0I4 = c4117dt0.i(1);
        float f4 = ((this.t + f2) * this.B) + (this.D * this.z);
        c4396et0I4.c = f4;
        c4396et0I3.b = f4;
        C4396et0 c4396et0I5 = c4117dt0.i(2);
        C4396et0 c4396et0I6 = c4117dt0.i(2);
        float f5 = ((this.t + f2) * this.C) + (this.D * this.A);
        c4396et0I6.c = f5;
        c4396et0I5.b = f5;
        C4396et0 c4396et0I7 = c4117dt0.i(3);
        C4396et0 c4396et0I8 = c4117dt0.i(3);
        float f6 = this.D + f2;
        c4396et0I8.c = f6;
        c4396et0I7.b = f6;
        c4117dt0.i(0).b = c4117dt0.i(0).c * this.r;
        c4117dt0.i(1).b = c4117dt0.i(1).c * this.r;
        c4117dt0.i(2).b = c4117dt0.i(2).c * this.r;
        c4117dt0.i(3).b = c4117dt0.i(3).c * this.r;
        AbstractC0405Bb1.r(this.l, this.m, this.x, fNextFloat);
        VT.j(this.x, this.y);
        c4117dt0.i(0).c(0);
        c4117dt0.i(1).d(this.y);
        c4117dt0.i(2).d(this.y);
        c4117dt0.i(3).c(0);
        C1665Nc1 c1665Nc14 = c4117dt0.o;
        c1665Nc14.a = c1665Nc1.a;
        c1665Nc14.b = c1665Nc1.b;
        c1665Nc14.c = c1665Nc1.c;
        C1665Nc1 c1665Nc15 = c4117dt0.l;
        float f7 = c1665Nc13.a;
        float f8 = this.e;
        c1665Nc15.a = f7 * f8;
        c1665Nc15.b = c1665Nc13.b * f8;
        c1665Nc15.c = c1665Nc13.c * f8;
        c4117dt0.n = this.j;
        c4117dt0.a = AbstractC0405Bb1.F();
        c4117dt0.b = 0.0f;
        c4117dt0.e = 0.0f;
        c4117dt0.f = 0.0f;
        c4117dt0.g = this.h;
        c4117dt0.i = false;
        c4117dt0.h = false;
        c4117dt0.j = null;
        c4117dt0.j(true);
        return true;
    }

    @Override // com.daaw.InterfaceC8492tX
    public InterfaceC8213sX h() {
        return new C4117dt0();
    }

    @Override // com.daaw.AbstractC3031a, com.daaw.QW
    public void q(C2591Vu c2591Vu) {
        super.q(c2591Vu);
        c2591Vu.K("ColorFrom", this.l, "appearance");
        c2591Vu.K("ColorTo", this.m, "appearance");
        c2591Vu.Q("lifetime", this.h, "behaviour", 0.1f, 10.0f);
        c2591Vu.Q("fadeInAndOutTime", this.i, "appearance", 0.0f, 0.5f);
        c2591Vu.n0("gravity", this.j, "behaviour", -300.0f, 300.0f);
        c2591Vu.N("velocityAngle", this.k, "appearance");
        c2591Vu.Q("sizeAspectRatio", this.r, "appearance", 0.1f, 10.0f);
        c2591Vu.Q("startSize", this.s, "appearance", 0.0f, 20.0f);
        c2591Vu.Q("fadeInSize", this.t, "appearance", 0.0f, 20.0f);
        c2591Vu.Q("endSize", this.u, "appearance", 0.0f, 20.0f);
        c2591Vu.Q("endSizeRandom", this.v, "appearance", 0.0f, 20.0f);
        c2591Vu.Q("endSizeZFactor", this.w, "appearance", 0.0f, 40.0f);
        c2591Vu.Q("sideSineWaveFreq", this.n, "waveBehaviour", 0.0f, 10.0f);
        c2591Vu.Q("sideSineWaveFreqRandom", this.o, "waveBehaviour", -10.0f, 10.0f);
        c2591Vu.Q("sideSineWaveMag", this.p, "waveBehaviour", 0.0f, 10.0f);
        c2591Vu.Q("sideSineWaveMagRandom", this.q, "waveBehaviour", -10.0f, 10.0f);
    }

    public void t(int i) {
        VT.p(this.l, i);
    }

    public void u(int i) {
        VT.p(this.m, i);
    }

    public void v(float f) {
        this.u = f;
    }

    public void w(float f) {
        this.v = f;
    }

    public void x(float f) {
        float fMin = Math.min(Math.max(0.0f, f), 0.5f);
        this.i = fMin;
        this.z = fMin;
        float f2 = 1.0f - fMin;
        this.A = f2;
        this.B = 1.0f - fMin;
        this.C = 1.0f - f2;
    }

    public void y(float f) {
        this.t = f;
    }

    public void z(float f) {
        this.h = f;
    }
}
