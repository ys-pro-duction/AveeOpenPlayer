package com.daaw;

import android.graphics.Bitmap;
import android.graphics.RectF;
import com.daaw.C9264wF;
import com.google.android.gms.ads.AdRequest;

/* JADX INFO: renamed from: com.daaw.mY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C6544mY extends AbstractC5139hY {
    public C9264wF Z;
    public float[] M = {1.0f, 1.0f, 1.0f, 1.0f};
    public float[] N = {1.0f, 1.0f, 1.0f, 1.0f};
    public C1477Lh0 O = C1477Lh0.a();
    public C1469Lf0 P = C1469Lf0.a(1.0f);
    public boolean Q = false;
    public int R = 5;
    public int S = 7;
    public boolean T = false;
    public boolean U = true;
    public AX V = null;
    public float[] W = new float[4];
    public float[] X = new float[4];
    public final C3755cc1 Y = new C3755cc1();
    public int a0 = 0;
    public InterfaceC6129l2 b0 = new d();
    public InterfaceC6129l2 c0 = new e();

    /* JADX INFO: renamed from: com.daaw.mY$a */
    public class a implements GQ {
        public a() {
        }

        @Override // com.daaw.GQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap a(TH0 th0, Bitmap bitmap) {
            bitmap.getConfig();
            if (C6544mY.this.Q) {
                int iMin = Math.min(1 << C6544mY.this.R, AdRequest.MAX_CONTENT_URL_LENGTH);
                int width = (int) (iMin * (bitmap.getWidth() / bitmap.getHeight()));
                try {
                    return PJ.a((width <= 0 || iMin <= 0) ? bitmap : Bitmap.createScaledBitmap(bitmap, width, iMin, true), C6544mY.this.S);
                } catch (Exception e) {
                    AbstractC0441Bk1.c("Art blurring failed: " + e.getMessage());
                } catch (OutOfMemoryError unused) {
                    AbstractC0441Bk1.c("Art blurring failed: OutOfMemoryError");
                }
            }
            return bitmap;
        }
    }

    /* JADX INFO: renamed from: com.daaw.mY$b */
    public class b implements GQ {
        public b() {
        }

        @Override // com.daaw.GQ
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Bitmap a(TH0 th0, Bitmap bitmap) {
            if (!C6544mY.this.T || !C6544mY.this.U) {
                return null;
            }
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, 32, 32, true);
            try {
                return PJ.a(bitmapCreateScaledBitmap, 7);
            } catch (Exception e) {
                AbstractC0441Bk1.c("Art blurring failed: " + e.getMessage());
                return bitmapCreateScaledBitmap;
            } catch (OutOfMemoryError unused) {
                AbstractC0441Bk1.c("Art blurring failed: OutOfMemoryError");
                return bitmapCreateScaledBitmap;
            }
        }
    }

    /* JADX INFO: renamed from: com.daaw.mY$c */
    public class c implements C9264wF.b {
        public c() {
        }

        @Override // com.daaw.C9264wF.b
        public void a() {
            C6544mY.this.m();
        }
    }

    /* JADX INFO: renamed from: com.daaw.mY$d */
    public class d implements InterfaceC6129l2 {
        public d() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C6544mY.this.Y.a());
        }
    }

    /* JADX INFO: renamed from: com.daaw.mY$e */
    public class e implements InterfaceC6129l2 {
        public e() {
        }

        @Override // com.daaw.InterfaceC6129l2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1, RH0 rh0) {
            c4880gc1.E("u_projView", false, C6544mY.this.Y.a());
            c4880gc1.v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
            c4880gc1.s("saturation", C6544mY.this.P.i(th0.b().a()));
            if (C6544mY.this.a0 == 1) {
                c4880gc1.s("maskadd", 0.0f);
                c4880gc1.s("maskmul", 1.0f);
                c4880gc1.s("mask_l_add", 0.0f);
                c4880gc1.s("mask_l_mul", 1.0f);
            } else if (C6544mY.this.a0 == 2) {
                c4880gc1.s("maskadd", 0.0f);
                c4880gc1.s("maskmul", 1.0f);
                c4880gc1.s("mask_l_add", 1.0f);
                c4880gc1.s("mask_l_mul", -1.0f);
            } else if (C6544mY.this.a0 == 3) {
                c4880gc1.s("maskadd", 1.0f);
                c4880gc1.s("maskmul", -1.0f);
                c4880gc1.s("mask_l_add", 1.0f);
                c4880gc1.s("mask_l_mul", 0.0f);
            } else {
                c4880gc1.s("maskadd", 0.0f);
                c4880gc1.s("maskmul", 1.0f);
                c4880gc1.s("mask_l_add", 1.0f);
                c4880gc1.s("mask_l_mul", 0.0f);
            }
            if (rh0.e(0) == rh0.e(1)) {
                c4880gc1.s("tex2_y_add", 0.0f);
                c4880gc1.s("tex2_y_mul", 1.0f);
            } else {
                c4880gc1.s("tex2_y_add", 1.0f);
                c4880gc1.s("tex2_y_mul", -1.0f);
            }
        }
    }

    public C6544mY() {
        Z(new a(), new b());
        this.Z = new C9264wF(new c(), null, null, null);
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public void B(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        float fHeight;
        float f;
        int i;
        float fCenterX;
        float fCenterY;
        super.B(th0, abstractC7070oQ);
        this.Z.u(th0, abstractC7070oQ);
        IW iwM = this.G.m(th0);
        IW iwN = this.G.n(th0);
        if (iwM == null) {
            return;
        }
        IW iwC = iwM.c(this.I.i(th0.u.b) * 2.0f);
        RectF rectFN = n(th0.b().a());
        float fS = s(th0.b().a());
        int iO0 = o0(th0.b().a());
        b(th0, this.Y, rectFN.centerX(), rectFN.centerY(), fS);
        C4312ec1 c4312ec1T = th0.u.t();
        RH0 rh0 = new RH0(f(), new IW[]{iwC, this.Z.m(th0)}, c4312ec1T, this.c0, 1);
        if (this.V != null) {
            q0(th0, rectFN, iO0, rh0);
            return;
        }
        float fWidth = rectFN.width();
        float fHeight2 = rectFN.height();
        RH0 rh02 = null;
        if (this.U || Y()) {
            float fWidth2 = rectFN.width() / rectFN.height();
            float width = iwC == null ? 1.0f : iwC.getWidth() / iwC.getHeight();
            boolean z = width > fWidth2;
            if (Y()) {
                if (z) {
                    fHeight = rectFN.height();
                    float f2 = width * fHeight;
                    fHeight2 = fHeight;
                    fWidth = f2;
                } else {
                    fWidth = rectFN.width();
                    fHeight2 = fWidth / width;
                }
            } else if (z) {
                fWidth = rectFN.width();
                fHeight2 = fWidth / width;
            } else {
                fHeight = rectFN.height();
                float f22 = width * fHeight;
                fHeight2 = fHeight;
                fWidth = f22;
            }
            if (iwN != null) {
                rh02 = new RH0(f(), new IW[]{iwN, this.Z.m(th0)}, c4312ec1T, this.c0);
            }
        }
        float f3 = fHeight2;
        if (Y()) {
            float fCenterX2 = rectFN.centerX() - (fWidth * 0.5f);
            float fCenterY2 = rectFN.centerY() - (f3 * 0.5f);
            float f4 = ((fWidth / fWidth) - 1.0f) * 0.5f;
            float f5 = ((f3 / f3) - 1.0f) * 0.5f;
            AbstractC5460ih abstractC5460ihP = th0.u.p();
            C1458Lc1 c1458Lc1 = new C1458Lc1(0.0f - f4, 0.0f - f5);
            C1458Lc1 c1458Lc12 = new C1458Lc1(f4 + 1.0f, f5 + 1.0f);
            i = iO0;
            f = fWidth;
            fCenterX = fCenterX2;
            fCenterY = fCenterY2;
            abstractC5460ihP.o(th0, fCenterX, fCenterY, 0.0f, f, f3, i, c1458Lc1, c1458Lc12, rh0, false);
        } else {
            f = fWidth;
            i = iO0;
            fCenterX = rectFN.centerX() - (f * 0.5f);
            fCenterY = rectFN.centerY() - (0.5f * f3);
            th0.u.p().o(th0, fCenterX, fCenterY, 0.0f, f, f3, i, C1458Lc1.s(), C1458Lc1.q(), rh0, false);
        }
        float f6 = fCenterX;
        float f7 = fCenterY;
        if (rh02 != null) {
            r0(th0, i, rectFN, new RectF(f6, f7, f6 + f, f3 + f7), rh02);
        }
    }

    @Override // com.daaw.AbstractC8699uF
    public String h() {
        return "Image";
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public void l() {
        super.l();
        C9264wF c9264wF = this.Z;
        if (c9264wF != null) {
            c9264wF.p();
        }
    }

    public final int o0(C6036kk0 c6036kk0) {
        AbstractC0405Bb1.r(this.M, this.N, this.W, Math.max(Math.min(this.O.j(c6036kk0, 0.0f), 1.0f), 0.0f));
        return VT.k(this.W);
    }

    public int p0() {
        return this.a0;
    }

    public final void q0(TH0 th0, RectF rectF, int i, RH0 rh0) {
        float fWidth;
        float fHeight;
        float f;
        float fWidth2 = rectF.width() / rectF.height();
        float width = rh0.f().getWidth() / rh0.f().getHeight();
        if (width > fWidth2) {
            fWidth = rectF.width();
            fHeight = fWidth / width;
        } else if (width < fWidth2) {
            fHeight = rectF.height();
            fWidth = width * fHeight;
        } else {
            fWidth = rectF.width();
            fHeight = rectF.height();
        }
        float f2 = 1.0f;
        if (fWidth > fHeight) {
            f2 = 1.0f / width;
            f = 1.0f;
        } else {
            f = width * 1.0f;
        }
        float f3 = f2 * 0.5f;
        float f4 = f * 0.5f;
        th0.u.p().u(th0, rectF, i, new C1458Lc1(0.5f - f3, f4 + 0.5f), new C1458Lc1(f3 + 0.5f, 0.5f - f4), rh0, this.V);
    }

    public void r0(TH0 th0, int i, RectF rectF, RectF rectF2, RH0 rh0) {
        float f;
        float f2;
        float f3;
        RectF rectF3;
        float f4;
        float f5;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        RectF rectF4 = new RectF();
        rectF4.set(rectF.left, rectF.top, rectF.right, rectF2.top);
        if (rectF4.height() > 0.0f) {
            f = fWidth;
            f2 = fHeight;
            f3 = 0.0f;
            rectF3 = rectF4;
            th0.u.p().o(th0, rectF4.left, rectF4.top, 0.0f, rectF4.width(), rectF4.height(), i, new C1458Lc1(0.0f, rectF2.bottom / fHeight), C1458Lc1.q(), rh0, false);
        } else {
            f = fWidth;
            f2 = fHeight;
            f3 = 0.0f;
            rectF3 = rectF4;
        }
        rectF3.set(rectF.left, rectF2.bottom, rectF.right, rectF.bottom);
        if (rectF3.height() > f3) {
            AbstractC5460ih abstractC5460ihP = th0.u.p();
            float f6 = rectF3.left;
            float f7 = rectF3.top;
            float fWidth2 = rectF3.width();
            float fHeight2 = rectF3.height();
            C1458Lc1 c1458Lc1S = C1458Lc1.s();
            C1458Lc1 c1458Lc1 = new C1458Lc1(1.0f, rectF2.top / f2);
            f4 = 1.0f;
            f5 = 0.0f;
            abstractC5460ihP.o(th0, f6, f7, 0.0f, fWidth2, fHeight2, i, c1458Lc1S, c1458Lc1, rh0, false);
        } else {
            f4 = 1.0f;
            f5 = 0.0f;
        }
        rectF3.set(rectF.left, rectF2.top, rectF2.left, rectF2.bottom);
        if (rectF3.width() > f5) {
            th0.u.p().o(th0, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, C1458Lc1.s(), new C1458Lc1(rectF2.left / f, f4), rh0, false);
        }
        rectF3.set(rectF2.right, rectF2.top, rectF.right, rectF2.bottom);
        if (rectF3.width() > f5) {
            th0.u.p().o(th0, rectF3.left, rectF3.top, 0.0f, rectF3.width(), rectF3.height(), i, new C1458Lc1(rectF2.right / f, 0.0f), C1458Lc1.q(), rh0, false);
        }
    }

    public void s0(boolean z, int i, int i2) {
        if (this.Q == z && this.R == i && this.S == i2) {
            return;
        }
        this.Q = z;
        this.R = i;
        this.S = i2;
        l();
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public void t(C2591Vu c2591Vu) {
        super.t(c2591Vu);
        u0(c2591Vu.o("keepAspectRatio", true));
        t0(c2591Vu.o("blurredBorder", false));
        this.M = c2591Vu.n("Color", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.N = c2591Vu.n("ColorTo", new float[]{1.0f, 1.0f, 1.0f, 1.0f});
        this.O.n(c2591Vu.h("MeasureColorBlend"), "Nothing", 0.5f, 0.5f);
        this.P = c2591Vu.t("saturation", C1469Lf0.a(1.0f));
        s0(c2591Vu.o("blurEnabled", false), c2591Vu.s("blurDivider", 5), c2591Vu.s("blurRadius", 7));
        C2591Vu c2591VuH = c2591Vu.h("Shape");
        AX axA = RO0.a(c2591VuH.D("None"), this.V);
        this.V = axA;
        if (axA != null) {
            axA.a(c2591VuH);
        }
        this.Z.C(c2591Vu.x("MaskImage", null));
        v0(c2591Vu.w("maskMode", AbstractC7660qY.a, 0));
    }

    public void t0(boolean z) {
        if (this.T == z) {
            return;
        }
        this.T = z;
        l();
    }

    public void u0(boolean z) {
        if (this.U == z) {
            return;
        }
        this.U = z;
        l();
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public boolean v(TH0 th0) {
        super.v(th0);
        this.Z.q(th0, q(th0.u.b), 0);
        return false;
    }

    public void v0(int i) {
        this.a0 = i;
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public void w(TH0 th0, int i) {
        super.w(th0, i);
        this.Z.r(th0, i);
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public void x(TH0 th0) {
        super.x(th0);
        C9264wF c9264wF = this.Z;
        if (c9264wF != null) {
            c9264wF.s(th0);
        }
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public void y(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        super.y(interfaceC9336wX, abstractC7070oQ, mw);
        this.Z.t(interfaceC9336wX, abstractC7070oQ, mw);
    }

    @Override // com.daaw.AbstractC5139hY, com.daaw.AbstractC8699uF
    public void z(C2591Vu c2591Vu, InterfaceC4577fX interfaceC4577fX) {
        super.z(c2591Vu, interfaceC4577fX);
        c2591Vu.N("keepAspectRatio", this.U, "1_image");
        c2591Vu.N("blurredBorder", this.T, "1_image");
        c2591Vu.s0(j(JD0.B6));
        c2591Vu.K("Color", this.M, "2_color");
        c2591Vu.K("ColorTo", this.N, "2_color");
        this.O.o(c2591Vu.G("MeasureColorBlend", "", "2_color", new String[0]));
        c2591Vu.b0("saturation", this.P, "2_color", 0.0f, 1.0f);
        c2591Vu.N("blurEnabled", this.Q, "blur");
        c2591Vu.Y("blurDivider", this.R, "blur", 0, 10);
        c2591Vu.Y("blurRadius", this.S, "blur", 1, 25);
        C2591Vu c2591VuG = c2591Vu.G("Shape", RO0.b(this.V), "1_image", RO0.c);
        AX ax = this.V;
        if (ax != null) {
            ax.q(c2591VuG);
        }
        interfaceC4577fX.a(this.Z.j());
        c2591Vu.h0("MaskImage", this.Z.j(), "1_image", C9264wF.t);
        String[] strArr = AbstractC7660qY.a;
        c2591Vu.p0("maskMode", AbstractC0405Bb1.a(strArr, p0(), strArr[0]), "1_image", strArr);
    }

    @Override // com.daaw.AbstractC5139hY
    public void a0(TH0 th0) {
    }
}
