package com.daaw;

import com.daaw.C9264wF;

/* JADX INFO: renamed from: com.daaw.hY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5139hY extends AbstractC8699uF {
    public C9264wF G;
    public G3 H;
    public C1477Lh0 I;
    public boolean J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: com.daaw.hY$a */
    public class a implements C9264wF.b {
        public a() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            AbstractC5139hY.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.hY$b */
    public class b implements FQ {
        public b() {
        }

        @Override // com.daaw.FQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public G3 a(InterfaceC9336wX interfaceC9336wX) {
            if (interfaceC9336wX != null) {
                AbstractC5139hY.this.H = interfaceC9336wX.b().b().k();
            }
            return AbstractC5139hY.this.H;
        }
    }

    public AbstractC5139hY() {
        super(0, 1.0f, 1.0f);
        this.H = null;
        this.I = new C1477Lh0("TotalTimeAndBeat", 0.5f, 0.5f);
        this.J = false;
        this.K = false;
        this.L = false;
        R(1.0f, 1.0f);
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        super.B(th0, abstractC7070oQ);
        this.G.u(th0, abstractC7070oQ);
        a0(th0);
    }

    public boolean Y() {
        return this.G.l();
    }

    public void Z(GQ gq, GQ gq2) {
        this.G = new C9264wF(new a(), new b(), gq, gq2);
    }

    public abstract void a0(TH0 th0);

    public void b0(int i) {
        this.G.w(i);
        this.J = (i & 1) != 0;
        this.K = (i & 2) != 0;
        this.L = (i & 4) != 0;
    }

    public void c0(String str) {
        this.G.C(str);
    }

    public void d0(int i) {
        this.G.D(i);
    }

    public void e0(boolean z) {
        this.G.E(z);
    }

    @Override // com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.G;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        c0(c2591Vu.x("customImage", null));
        int iS = c2591Vu.s("generatedAlbumArtHint", 0);
        this.J = c2591Vu.o("generatedAlbumArtHintShiftHue", (iS & 1) != 0);
        this.K = c2591Vu.o("generatedAlbumArtHintNoText", (iS & 2) != 0);
        boolean zO = c2591Vu.o("generatedAlbumArtHintForceGen", (iS & 4) != 0);
        this.L = zO;
        b0((this.J ? 1 : 0) | (this.K ? 2 : 0) | (zO ? 4 : 0));
        d0(c2591Vu.s("generatedAlbumArtColor", -1));
        e0(c2591Vu.o("keepAspectRatioAndCropToFit", false));
        this.G.z(c2591Vu.o("colorKeyEnabled", false));
        this.G.x(c2591Vu.o("autoDetectColorKey", true));
        this.G.y(c2591Vu.s("colorKey", -16711936));
        this.G.B(c2591Vu.p("transparencyStrength", 1.0f));
        this.G.A(c2591Vu.p("opacityStrength", 1.0f));
        this.I.n(c2591Vu.h("measureAnimationSpeed"), "TotalTimeAndBeat", 0.5f, 0.5f);
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        super.v(th0);
        this.G.q(th0, n(th0.u.b), 0);
        return false;
    }

    @Override // com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        this.G.r(th0, i);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.G;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.G.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        interfaceC4577fX.a(this.G.j());
        c2591Vu.h0("customImage", this.G.j(), "1_image", C9264wF.s);
        this.I.o(c2591Vu.G("measureAnimationSpeed", "", "1_image", new String[0]));
        c2591Vu.Z("generatedAlbumArtHint", this.G.g(), "generatedAlbumArt", 0, 7);
        c2591Vu.N("generatedAlbumArtHintShiftHue", (this.G.g() & 1) != 0, "generatedAlbumArt");
        c2591Vu.N("generatedAlbumArtHintNoText", (this.G.g() & 2) != 0, "generatedAlbumArt");
        c2591Vu.N("generatedAlbumArtHintForceGen", (this.G.g() & 4) != 0, "generatedAlbumArt");
        c2591Vu.V("generatedAlbumArtColor", this.G.k(), "generatedAlbumArt");
        c2591Vu.N("keepAspectRatioAndCropToFit", this.G.l(), "1_image");
        c2591Vu.N("colorKeyEnabled", this.G.h(), "2_ColorKey");
        c2591Vu.N("autoDetectColorKey", this.G.i().b, "2_ColorKey");
        c2591Vu.W("colorKey", this.G.i().a, "2_ColorKey");
        c2591Vu.Q("transparencyStrength", this.G.i().c, "2_ColorKey", 0.0f, 4.0f);
        c2591Vu.Q("opacityStrength", this.G.i().d, "2_ColorKey", 0.0f, 4.0f);
    }
}
