package com.daaw;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.Typeface;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.a21, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C3044a21 extends AbstractC8699uF {
    public static final String[] O = {"internal_0:" + AbstractC3374bD0.i, "internal_1:" + AbstractC3374bD0.j, "internal_2:" + AbstractC3374bD0.k, "internal_3:" + AbstractC3374bD0.l, "internal_4:" + AbstractC3374bD0.m, "internal_5:" + AbstractC3374bD0.n, "internal_6:" + AbstractC3374bD0.o, "internal_7:" + AbstractC3374bD0.p, "internal_8:" + AbstractC3374bD0.q};
    public static Map P = new a();
    public CV0 G;
    public String H;
    public int I;
    public int J;
    public String K;
    public int L;
    public final C3755cc1 M;
    public InterfaceC6129l2 N;

    /* JADX INFO: renamed from: com.daaw.a21$a */
    public class a extends HashMap {
        public a() {
            put("internal_0", "fonts/greatvibes-regular.otf");
            put("internal_1", "fonts/notomono-regular.ttf");
            put("internal_2", "fonts/orbitron-medium.otf");
            put("internal_3", "fonts/orkney-light.otf");
            put("internal_4", "fonts/Akshar-Medium.ttf");
            put("internal_5", "fonts/Hibana-SubMedium.otf");
            put("internal_6", "fonts/Russo_One.ttf");
            put("internal_7", "fonts/Space-Fray.ttf");
            put("internal_8", "fonts/Valden.otf");
        }
    }

    /* JADX INFO: renamed from: com.daaw.a21$b */
    public class b implements InterfaceC6129l2 {
        public b() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C3044a21.this.M.a());
        }
    }

    public C3044a21() {
        super(0, 0.5f, 0.5f);
        this.H = "{ArtistOrTitle}";
        this.I = 30;
        this.J = -1;
        this.K = "";
        this.L = 500;
        this.M = new C3755cc1();
        this.N = new b();
    }

    @Override // com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        super.B(th0, abstractC7070oQ);
        CV0 cv0 = this.G;
        if (cv0 == null || !cv0.f()) {
            return;
        }
        String strM = th0.u.b.m(this.H);
        new C1561Mc1(0, 0);
        RectF rectFO = o(th0.u.b, th0.u.w().b(this.G, strM));
        float fS = s(th0.b().a());
        float f = rectFO.left + (r2.a * 0.5f);
        float f2 = rectFO.top - (r2.b * 0.5f);
        C1458Lc1 c1458Lc1Z = Z(rectFO);
        b(th0, this.M, f, f2, fS);
        th0.u.w().a(th0, this.G, new C1665Nc1(rectFO.left + c1458Lc1Z.a, rectFO.top + c1458Lc1Z.b, 0.0f), strM, this.J, 0, false, 0, 0, 0, 0, new RH0(f(), this.G.c(), th0.u.u(), this.N));
        e0(th0, rectFO);
    }

    public String Y() {
        return this.K;
    }

    public C1458Lc1 Z(RectF rectF) {
        return new C1458Lc1(0.0f, 0.0f);
    }

    public void a0(float f, float f2) {
        float[] fArr = {1.0f, 1.0f, 1.0f, 1.0f};
        VT.q(fArr, this.J);
        fArr[2] = Math.max(f2, fArr[2]);
        fArr[3] = Math.max(f, fArr[3]);
        f0(VT.m(fArr));
    }

    public void b0(int i) {
        this.I = Math.max(i, this.I);
    }

    public void c0(C2591Vu c2591Vu) {
        g0(c2591Vu.x("typeFace", Y()));
    }

    public void d0(C2591Vu c2591Vu) {
        c2591Vu.g0("typeFace", Y(), "appearance", O);
    }

    public void f0(int i) {
        this.J = i;
    }

    public void g0(String str) {
        if (AbstractC0405Bb1.h(this.K, str)) {
            return;
        }
        this.K = str;
        l();
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "Text";
    }

    public void h0(int i) {
        if (this.I == i) {
            return;
        }
        this.I = Math.min(500, i);
        l();
    }

    public void i0(String str) {
        this.H = str;
    }

    @Override // com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        super.u(c2591Vu);
        i0(c2591Vu.x("text", "{ArtistOrTitle}"));
        f0(c2591Vu.s("color", -1));
        h0(c2591Vu.s("fontSize", 30));
        g0(c2591Vu.x("typeFace", ""));
    }

    @Override // com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        Context contextI;
        int iMin = Math.min((int) th0.b().a().h(this.I * 0.14f * 0.01f), this.L);
        Typeface typefaceCreateFromAsset = Typeface.DEFAULT;
        if (!"".equals(this.K) && P.containsKey(this.K) && (contextI = com.daaw.avee.a.i()) != null) {
            try {
                typefaceCreateFromAsset = Typeface.createFromAsset(contextI.getAssets(), (String) P.get(this.K));
            } catch (Exception unused) {
                typefaceCreateFromAsset = Typeface.DEFAULT;
            }
        }
        CV0 cv0 = this.G;
        if (cv0 != null) {
            cv0.a();
        }
        this.G = new CV0(typefaceCreateFromAsset, iMin, C9398wk.c(), C9398wk.l(), C9398wk.f(), C9398wk.g(), C9398wk.e(), C9398wk.k(), C9398wk.h(), C9398wk.b(), C9398wk.i(), C9398wk.j());
        return super.v(th0);
    }

    @Override // com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        CV0 cv0 = this.G;
        if (cv0 != null) {
            cv0.a();
        }
        this.G = null;
    }

    @Override // com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        super.A(c2591Vu);
        c2591Vu.s0(j(JD0.H6));
        c2591Vu.k0("text", this.H, "appearance");
        c2591Vu.V("color", this.J, "appearance");
        c2591Vu.Y("fontSize", this.I, "appearance", 8, 100);
        d0(c2591Vu);
    }

    public void e0(TH0 th0, RectF rectF) {
    }
}
