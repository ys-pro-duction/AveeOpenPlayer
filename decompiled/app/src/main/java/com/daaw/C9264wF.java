package com.daaw;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.net.Uri;

/* JADX INFO: renamed from: com.daaw.wF, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9264wF implements InterfaceC7381pY {
    public static final String[] s = {"internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:vignette80", "internalres:rainbow128", "internalres:particle_blur01_more", "internalres:lens_flare", "internalres:lens_flare_2", "composition:0"};
    public static final String[] t = {"internalres:transparent", "internalres:white", "internalres:black", "internalres:particle_circle_blur4", "internalres:particle_blur01", "internalres:particle_blur_inv", "internalres:vignette80", "composition:0"};
    public static C7027oF0 u = new C7027oF0(null);
    public FQ a;
    public b b;
    public GQ c;
    public GQ d;
    public Object k;
    public IW e = null;
    public IW f = null;
    public G3 g = new G3(Uri.EMPTY, "", "");
    public String h = null;
    public int i = 0;
    public C8217sY j = null;
    public int l = 0;
    public boolean m = false;
    public int n = -1;
    public int o = 0;
    public C7027oF0 p = new C7027oF0(null);
    public boolean q = false;
    public C6265lY r = new C6265lY(-16711936, true, 1.0f, 1.0f);

    /* JADX INFO: renamed from: com.daaw.wF$a */
    public static class a {
        public int a = 0;
        public AbstractC1140Ib b = null;
        public RunnableC2621Wb1 c = null;
    }

    /* JADX INFO: renamed from: com.daaw.wF$b */
    public interface b {
        void a();
    }

    public C9264wF(b bVar, FQ fq, GQ gq, GQ gq2) {
        this.b = bVar;
        this.a = fq;
        this.c = gq;
        this.d = gq2;
    }

    public static boolean c(C7027oF0 c7027oF0, C7027oF0 c7027oF02, TH0 th0, C8217sY c8217sY, C7027oF0 c7027oF03, int i, GQ gq, GQ gq2) {
        if (c8217sY == null) {
            c7027oF0.a = null;
            if (c7027oF02 != null) {
                c7027oF02.a = null;
            }
            return true;
        }
        Bitmap bitmapG = C8217sY.g(c8217sY);
        if (bitmapG == null) {
            c7027oF0.a = null;
            if (c7027oF02 != null) {
                c7027oF02.a = null;
            }
            return true;
        }
        if (c7027oF02 != null) {
            Bitmap bitmap = gq != null ? (Bitmap) gq2.a(th0, bitmapG) : null;
            if (bitmap != null) {
                c7027oF02.a = new C0828Fb(new C5718jc1(bitmap, 9729, 9729, 10497, false), true);
            } else {
                c7027oF02.a = null;
            }
            if (bitmap != null && bitmapG != bitmap) {
                bitmap.recycle();
            }
        }
        int iD = c8217sY.d();
        if (iD > 1) {
            if (i == 0) {
                c8217sY.h();
                c7027oF03.a = new B61(new GX[iD], new a());
            }
            Object obj = c7027oF03.a;
            a aVar = obj != null ? (a) ((B61) obj).b : null;
            if (aVar == null) {
                return true;
            }
            if (aVar.a < iD) {
                if (aVar.c == null) {
                    c8217sY.a();
                    aVar.c = c8217sY.e();
                }
                if (aVar.c.c()) {
                    Bitmap bitmapCreateBitmap = (Bitmap) aVar.c.b();
                    if (bitmapCreateBitmap == null) {
                        bitmapCreateBitmap = Bitmap.createBitmap(32, 32, Bitmap.Config.ARGB_8888);
                    }
                    C5718jc1 c5718jc1 = new C5718jc1(v(bitmapCreateBitmap, 0, u), 9729, 9729, 10497, false);
                    int i2 = aVar.a;
                    if (i2 == 0) {
                        GX[] gxArr = (GX[]) ((B61) c7027oF03.a).a;
                        gxArr[i2] = c5718jc1;
                        aVar.b = new C0932Gb(gxArr, true);
                    }
                    GX[] gxArr2 = (GX[]) ((B61) c7027oF03.a).a;
                    int i3 = aVar.a;
                    gxArr2[i3] = c5718jc1;
                    AbstractC1140Ib abstractC1140Ib = aVar.b;
                    if (abstractC1140Ib != null) {
                        abstractC1140Ib.k(i3, c5718jc1);
                    }
                    aVar.a++;
                    aVar.c = null;
                }
                c7027oF0.a = aVar.b;
                return false;
            }
            c7027oF0.a = aVar.b;
            c7027oF03.a = null;
        } else {
            Bitmap bitmap2 = gq != null ? (Bitmap) gq.a(th0, bitmapG) : bitmapG;
            if (bitmap2 != null) {
                c7027oF0.a = new C0828Fb(new C5718jc1(v(bitmap2, 0, u), 9729, 9729, 10497, false), true);
            } else {
                c7027oF0.a = null;
            }
            if (bitmap2 != null && bitmapG != bitmap2) {
                bitmap2.recycle();
            }
        }
        return true;
    }

    public void A(float f) {
        C6265lY c6265lY = this.r;
        if (c6265lY.d == f) {
            return;
        }
        c6265lY.d = f;
        o();
    }

    public void B(float f) {
        C6265lY c6265lY = this.r;
        if (c6265lY.c == f) {
            return;
        }
        c6265lY.c = f;
        o();
    }

    public void C(String str) {
        this.h = str;
        int iI0 = C1092Hp.i0(str);
        this.i = iI0;
        if (iI0 > 0) {
            F(null);
            return;
        }
        String str2 = this.h;
        if (str2 != null && str2.length() > 0) {
            F(new G3(Uri.EMPTY, this.h, ""));
        } else {
            FQ fq = this.a;
            F(fq != null ? (G3) fq.a(null) : null);
        }
    }

    public void D(int i) {
        if (this.n == i) {
            return;
        }
        this.n = i;
        o();
    }

    public void E(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        o();
    }

    public void F(G3 g3) {
        G3 g32;
        if (g3 == null && this.g == null) {
            return;
        }
        if (g3 != null && (g32 = this.g) != null && AbstractC0405Bb1.h(g32.a.getPath(), g3.a.getPath()) && AbstractC0405Bb1.h(this.g.b, g3.b) && AbstractC0405Bb1.h(this.g.c, g3.c)) {
            return;
        }
        this.g = g3;
        o();
    }

    @Override // com.daaw.InterfaceC7381pY
    public void a(Object obj) {
        this.k = obj;
    }

    @Override // com.daaw.InterfaceC7381pY
    public void b(C8217sY c8217sY, String str, String str2) {
        G3 g3 = this.g;
        if (g3 != null && AbstractC0405Bb1.h(str2, g3.b) && AbstractC0405Bb1.h(str2, this.g.b)) {
            o();
            C8217sY.c(this.j);
            this.j = c8217sY;
            this.o = 2;
        }
    }

    public void d() {
        IW iw = this.e;
        if (iw != null) {
            iw.a();
        }
        this.e = null;
    }

    public void e() {
        IW iw = this.f;
        if (iw != null) {
            iw.a();
        }
        this.f = null;
    }

    public boolean f(TH0 th0, C8217sY c8217sY, int i) {
        if (c8217sY == null) {
            d();
            return true;
        }
        C7027oF0 c7027oF0 = new C7027oF0(null);
        C7027oF0 c7027oF02 = new C7027oF0(null);
        boolean zC = c(c7027oF0, c7027oF02, th0, c8217sY, this.p, i, this.c, this.d);
        if (this.e != c7027oF0.a) {
            d();
        }
        this.e = (IW) c7027oF0.a;
        e();
        this.f = (IW) c7027oF02.a;
        return zC;
    }

    public int g() {
        return this.l;
    }

    public boolean h() {
        return this.q;
    }

    public C6265lY i() {
        return this.r;
    }

    public String j() {
        return this.h;
    }

    public int k() {
        return this.n;
    }

    public boolean l() {
        return this.m;
    }

    public IW m(TH0 th0) {
        int i = this.i;
        if (i <= 0) {
            return this.e;
        }
        C3477bc1 c3477bc1B = th0.B(i);
        return c3477bc1B == null ? th0.u.c() : new C1036Hb(c3477bc1B.b(), false);
    }

    public IW n(TH0 th0) {
        if (this.i > 0) {
            return null;
        }
        return this.f;
    }

    public final void o() {
        p();
        this.b.a();
    }

    public void p() {
        this.o = 0;
    }

    public boolean q(TH0 th0, RectF rectF, int i) {
        if (this.o == 0) {
            C8217sY.c(this.j);
            this.j = null;
            this.o = 1;
            G3 g3 = this.g;
            if (g3 == null) {
                o();
                C8217sY.c(this.j);
                this.j = null;
                this.o = 2;
            } else {
                th0.u.a.c(this, new F3(g3.a, g3.b, g3.c, !this.m, (int) rectF.width(), (int) rectF.height(), (int) rectF.width(), (int) rectF.height(), this.l, this.n, this.q ? this.r : null));
            }
        }
        return true;
    }

    public boolean r(TH0 th0, int i) {
        if (this.o != 2 || !f(th0, this.j, i)) {
            return true;
        }
        this.o = 3;
        C8217sY.c(this.j);
        this.j = null;
        return true;
    }

    public void s(TH0 th0) {
        d();
        e();
    }

    public void t(InterfaceC9336wX interfaceC9336wX, AbstractC7070oQ abstractC7070oQ, MW mw) {
        int i = this.i;
        if (i > 0) {
            mw.a(i);
        }
        String str = this.h;
        if ((str == null || str.length() <= 0) && this.i <= 0) {
            FQ fq = this.a;
            F(fq != null ? (G3) fq.a(interfaceC9336wX) : null);
        }
    }

    public void u(TH0 th0, AbstractC7070oQ abstractC7070oQ) {
        if (this.o == 3 || this.i > 0) {
            return;
        }
        th0.z();
    }

    public void w(int i) {
        if (this.l == i) {
            return;
        }
        this.l = i;
        o();
    }

    public void x(boolean z) {
        C6265lY c6265lY = this.r;
        if (c6265lY.b == z) {
            return;
        }
        c6265lY.b = z;
        o();
    }

    public void y(int i) {
        C6265lY c6265lY = this.r;
        if (c6265lY.a == i) {
            return;
        }
        c6265lY.a = i;
        o();
    }

    public void z(boolean z) {
        if (this.q == z) {
            return;
        }
        this.q = z;
        o();
    }

    public static Bitmap v(Bitmap bitmap, int i, C7027oF0 c7027oF0) {
        return bitmap;
    }
}
