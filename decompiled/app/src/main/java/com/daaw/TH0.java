package com.daaw;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.SystemClock;
import com.daaw.InterfaceC9336wX;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class TH0 implements InterfaceC9336wX {
    public final float[] d;
    public final c u;
    public final float a = -10.0f;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public float e = 0.0f;
    public float f = 0.0f;
    public int g = 0;
    public long h = 0;
    public long i = 0;
    public long j = 0;
    public float k = 0.0f;
    public int l = 2;
    public int m = 2;
    public int n = 2;
    public int o = 2;
    public int p = 0;
    public int q = 0;
    public int r = -1;
    public C7906rQ s = new C7906rQ();
    public AbstractC7070oQ t = null;
    public List v = new ArrayList();
    public boolean w = false;
    public boolean x = true;
    public int y = 0;
    public int z = 0;
    public final C3755cc1 A = new C3755cc1();
    public final C3755cc1 B = new C3755cc1();
    public final C3755cc1 C = new C3755cc1();
    public final C3755cc1 D = new C3755cc1();
    public final C3755cc1 E = new C3755cc1();

    public class a implements InterfaceC5841k2 {
        public a() {
        }

        @Override // com.daaw.InterfaceC5841k2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1) {
            c4880gc1.E("u_projView", false, TH0.this.K());
            c4880gc1.x("u_texture", 0);
        }
    }

    public class b implements InterfaceC5841k2 {
        public b() {
        }

        @Override // com.daaw.InterfaceC5841k2
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(TH0 th0, C4880gc1 c4880gc1) {
            c4880gc1.x("u_texture", 0);
        }
    }

    public static class c implements InterfaceC9336wX.a {
        public C1036Hb A;
        public C1036Hb B;
        public C1036Hb C;
        public C1036Hb D;
        public C1036Hb E;
        public C1249Jc0 F;
        public Bitmap G;
        public Bitmap H;
        public Bitmap I;
        public Bitmap J;
        public Bitmap K;
        public Bitmap L;
        public Bitmap M;
        public C1036Hb[] N = new C1036Hb[5];
        public final InterfaceC8635u10 a;
        public final C6036kk0 b;
        public C4880gc1 c;
        public C4880gc1 d;
        public C4880gc1 e;
        public C4880gc1 f;
        public C4880gc1 g;
        public C4880gc1 h;
        public C4880gc1 i;
        public C4880gc1 j;
        public C4880gc1 k;
        public AbstractC5460ih l;
        public DV0 m;
        public BQ n;
        public C4312ec1 o;
        public C4312ec1 p;
        public C4312ec1 q;
        public C4312ec1 r;
        public C4312ec1 s;
        public C4312ec1 t;
        public C4312ec1 u;
        public C4312ec1 v;
        public C4312ec1 w;
        public C1036Hb x;
        public C1036Hb y;
        public C1036Hb z;

        public c(TH0 th0, InterfaceC8635u10 interfaceC8635u10) {
            this.a = interfaceC8635u10;
            this.b = new C6036kk0(th0);
        }

        public C4880gc1 A(Resources resources, int i, int i2) {
            try {
                C4880gc1 c4880gc1 = new C4880gc1(AbstractC0934Gb1.q(resources, i), AbstractC0934Gb1.q(resources, i2));
                if (c4880gc1.k().length() == 0) {
                    return c4880gc1;
                }
                AbstractC0441Bk1.c(c4880gc1.k());
                return c4880gc1;
            } catch (Exception e) {
                AbstractC0441Bk1.c("(" + i + "; " + i2 + ") Resources loading error: " + e.getMessage());
                return null;
            }
        }

        public C4880gc1 B(String str, String str2) {
            try {
                C4880gc1 c4880gc1 = new C4880gc1(str, str2);
                if (c4880gc1.k().length() != 0) {
                    AbstractC0441Bk1.c(c4880gc1.k());
                }
                return c4880gc1;
            } catch (Exception unused) {
                AbstractC0441Bk1.c("error parsing the shader");
                return null;
            }
        }

        public void C(Resources resources) {
            this.G = BitmapFactory.decodeResource(resources, AbstractC3374bD0.p0);
            this.H = BitmapFactory.decodeResource(resources, AbstractC3374bD0.f);
            this.I = BitmapFactory.decodeResource(resources, AbstractC3374bD0.z0);
            this.J = BitmapFactory.decodeResource(resources, AbstractC3374bD0.A0);
            this.K = BitmapFactory.decodeResource(resources, AbstractC3374bD0.u0);
            this.L = BitmapFactory.decodeResource(resources, AbstractC3374bD0.F);
            this.M = BitmapFactory.decodeResource(resources, AbstractC3374bD0.h0);
        }

        public void D() {
            Context contextK = com.daaw.avee.a.k();
            if (contextK == null) {
                return;
            }
            Resources resources = contextK.getResources();
            BQ bq = this.n;
            if (bq != null) {
                bq.b();
            }
            this.n = new BQ();
            C5718jc1 c5718jc1 = new C5718jc1(-1, 2, 2, 9729, 9729, 10497, false);
            C5718jc1 c5718jc12 = new C5718jc1(-16777216, 2, 2, 9729, 9729, 10497, false);
            C1036Hb c1036Hb = this.x;
            if (c1036Hb != null) {
                c1036Hb.a();
            }
            this.x = new C1036Hb(c5718jc1, true);
            C1036Hb c1036Hb2 = this.y;
            if (c1036Hb2 != null) {
                c1036Hb2.a();
            }
            this.y = new C1036Hb(c5718jc12, true);
            C1036Hb c1036Hb3 = this.z;
            if (c1036Hb3 != null) {
                c1036Hb3.a();
            }
            this.z = new C1036Hb(new C5718jc1(this.G, 9729, 9729, 10497, true), true);
            C1036Hb c1036Hb4 = this.C;
            if (c1036Hb4 != null) {
                c1036Hb4.a();
            }
            this.C = new C1036Hb(new C5718jc1(this.H, 9729, 9729, 10497, true), true);
            C1036Hb c1036Hb5 = this.A;
            if (c1036Hb5 != null) {
                c1036Hb5.a();
            }
            this.A = new C1036Hb(new C5718jc1(this.I, 9729, 9729, 10497, true), true);
            C1036Hb c1036Hb6 = this.B;
            if (c1036Hb6 != null) {
                c1036Hb6.a();
            }
            this.B = new C1036Hb(new C5718jc1(this.J, 9729, 9729, 10497, true), true);
            C1036Hb c1036Hb7 = this.D;
            if (c1036Hb7 != null) {
                c1036Hb7.a();
            }
            this.D = new C1036Hb(new C5718jc1(this.K, 9729, 9729, 10497, false), true);
            C1036Hb c1036Hb8 = this.E;
            if (c1036Hb8 != null) {
                c1036Hb8.a();
            }
            this.E = new C1036Hb(new C5718jc1(this.M, 9729, 9729, 10497, false), true);
            this.F = new C1249Jc0(this.E.d(), false);
            this.c = j(this.c);
            C4880gc1 c4880gc1A = A(resources, GD0.c, GD0.d);
            this.c = c4880gc1A;
            AbstractC6278lb.f(c4880gc1A);
            this.d = j(this.d);
            C4880gc1 c4880gc1A2 = A(resources, GD0.c, GD0.e);
            this.d = c4880gc1A2;
            AbstractC6278lb.f(c4880gc1A2);
            this.e = j(this.e);
            C4880gc1 c4880gc1A3 = A(resources, GD0.m, GD0.a);
            this.e = c4880gc1A3;
            AbstractC6278lb.f(c4880gc1A3);
            this.f = j(this.f);
            C4880gc1 c4880gc1A4 = A(resources, GD0.c, GD0.b);
            this.f = c4880gc1A4;
            AbstractC6278lb.f(c4880gc1A4);
            this.g = j(this.g);
            C4880gc1 c4880gc1A5 = A(resources, GD0.C, GD0.B);
            this.g = c4880gc1A5;
            AbstractC6278lb.f(c4880gc1A5);
            this.h = j(this.h);
            C4880gc1 c4880gc1A6 = A(resources, GD0.m, GD0.f);
            this.h = c4880gc1A6;
            AbstractC6278lb.f(c4880gc1A6);
            this.i = j(this.i);
            C4880gc1 c4880gc1A7 = A(resources, GD0.g, GD0.h);
            this.i = c4880gc1A7;
            AbstractC6278lb.f(c4880gc1A7);
            this.j = j(this.j);
            C4880gc1 c4880gc1A8 = A(resources, GD0.l, GD0.k);
            this.j = c4880gc1A8;
            AbstractC6278lb.f(c4880gc1A8);
            this.k = j(this.k);
            C4880gc1 c4880gc1A9 = A(resources, GD0.j, GD0.i);
            this.k = c4880gc1A9;
            AbstractC6278lb.f(c4880gc1A9);
            this.o = null;
            this.p = null;
            this.q = null;
            this.r = null;
            this.s = null;
            this.t = null;
            this.u = null;
            this.v = null;
            this.w = null;
            try {
                this.l = (AbstractC5460ih) AbstractC0405Bb1.i(this.l);
                C5741jh c5741jh = new C5741jh(RCHTTPStatusCodes.BAD_REQUEST);
                this.l = c5741jh;
                this.o = c5741jh.g(this.h);
                this.p = this.l.g(this.h);
                this.q = this.l.g(this.i);
                this.r = this.l.g(this.j);
                this.s = this.l.g(this.k);
                this.t = this.l.g(m());
                this.u = this.l.g(n());
                this.v = this.l.g(l());
                this.w = this.l.g(o());
            } catch (Exception e) {
                AbstractC0441Bk1.c("Resources loading error: " + e.getMessage());
                AbstractC5075hI.a.a("Resources loading error: " + e.getMessage());
            }
            try {
                this.m = new DV0(this.l);
            } catch (Exception e2) {
                AbstractC0441Bk1.c("Resources loading error: " + e2.getMessage());
                AbstractC5075hI.a.a("Resources loading error: " + e2.getMessage());
            }
        }

        public C4880gc1 E(C4880gc1 c4880gc1) {
            return j(c4880gc1);
        }

        @Override // com.daaw.InterfaceC9336wX.a
        public C6036kk0 a() {
            return this.b;
        }

        @Override // com.daaw.InterfaceC9336wX.a
        public InterfaceC8635u10 b() {
            return this.a;
        }

        @Override // com.daaw.InterfaceC9336wX.a
        public C1036Hb c() {
            return this.x;
        }

        @Override // com.daaw.InterfaceC9336wX.a
        public C1036Hb d() {
            return this.C;
        }

        @Override // com.daaw.InterfaceC9336wX.a
        public C1036Hb e() {
            return this.A;
        }

        @Override // com.daaw.InterfaceC9336wX.a
        public C1036Hb f() {
            return this.B;
        }

        public C4312ec1 i(C4880gc1 c4880gc1) {
            if (c4880gc1 == null) {
                return null;
            }
            return this.l.g(c4880gc1);
        }

        public final C4880gc1 j(C4880gc1 c4880gc1) {
            if (c4880gc1 == null) {
                return null;
            }
            c4880gc1.e();
            return null;
        }

        public C4880gc1 k() {
            return this.i;
        }

        public C4880gc1 l() {
            return this.e;
        }

        public C4880gc1 m() {
            return this.c;
        }

        public C4880gc1 n() {
            return this.d;
        }

        public C4880gc1 o() {
            return this.f;
        }

        public AbstractC5460ih p() {
            return this.l;
        }

        public C4312ec1 q() {
            return this.s;
        }

        public C4312ec1 r() {
            return this.r;
        }

        public C4312ec1 s() {
            return this.o;
        }

        public C4312ec1 t() {
            return this.q;
        }

        public C4312ec1 u() {
            return this.p;
        }

        public C4312ec1 v() {
            return this.w;
        }

        public DV0 w() {
            return this.m;
        }

        public BQ x() {
            return this.n;
        }

        public C4880gc1 y() {
            return this.g;
        }

        public boolean z() {
            return (this.l == null || this.m == null || this.h == null) ? false : true;
        }
    }

    public TH0(InterfaceC8635u10 interfaceC8635u10) {
        float[] fArr = new float[16];
        this.d = fArr;
        this.u = new c(this, interfaceC8635u10);
        Matrix.setIdentityM(fArr, 0);
        Matrix.translateM(fArr, 0, 0.0f, 0.0f, -10.0f);
    }

    @Override // com.daaw.InterfaceC9336wX
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public AbstractC5460ih j() {
        return this.u.p();
    }

    public C3477bc1 B(int i) {
        if (i < this.v.size()) {
            return (C3477bc1) this.v.get(i);
        }
        return null;
    }

    public C7906rQ C() {
        return this.s;
    }

    public int D() {
        return this.g;
    }

    public float E() {
        return this.f;
    }

    public int F() {
        int i = this.q;
        return i < 2 ? this.m : i;
    }

    public int G() {
        int i = this.p;
        return i < 2 ? this.l : i;
    }

    public boolean H() {
        return true;
    }

    public C1561Mc1 I() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(34024, iArr, 0);
        int i = iArr[0];
        AbstractC0441Bk1.a("OGL Max render buffer size: " + i);
        AbstractC0441Bk1.a("fullscreen size: " + G() + "; " + F());
        return new C1561Mc1(Math.min(G(), i), Math.min(F(), i));
    }

    public int J() {
        return this.z;
    }

    public float[] K() {
        return this.b;
    }

    public boolean L(C1458Lc1 c1458Lc1, float f) {
        return true;
    }

    public void M() {
        this.u.l.r(this);
        this.z = 0;
    }

    public void N(int i, int i2, int i3) {
        C7906rQ c7906rQ = this.s;
        c7906rQ.d = c7906rQ.e;
        c7906rQ.e = 0;
        c7906rQ.f = c7906rQ.g;
        c7906rQ.g = 0;
        c7906rQ.h = c7906rQ.i;
        c7906rQ.i = 0;
        c7906rQ.k = c7906rQ.j;
        c7906rQ.j = 0;
        this.p = i2;
        this.q = i3;
        if (i > 0) {
            this.g = i;
            this.i = 0L;
            float f = i * 0.001f;
            this.e = f;
            this.f = f;
            c7906rQ.b = (int) (1.0f / f);
        } else {
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i4 = (int) (jUptimeMillis - this.i);
            this.g = i4;
            C7906rQ c7906rQ2 = this.s;
            int i5 = c7906rQ2.c + 1;
            c7906rQ2.c = i5;
            if (jUptimeMillis - this.h >= 1000) {
                c7906rQ2.b = i5;
                c7906rQ2.c = 0;
                this.h = jUptimeMillis;
            }
            this.i = jUptimeMillis;
            if (i4 < 0) {
                this.g = 0;
            }
            if (this.g > 200) {
                this.g = RCHTTPStatusCodes.SUCCESS;
            }
            float f2 = this.g * 0.001f;
            this.e = f2;
            this.f = (this.f * 0.5f) + (f2 * 0.5f);
        }
        long j = this.j + ((long) this.g);
        this.j = j;
        this.k = j * 0.001f;
        this.s.a = 0;
        this.w = this.u.a.l() > 0;
        this.x = (this.u.a.g() & 1) != 0;
        q();
        o(null, true);
        this.u.s().c(true, new a());
        this.u.u().c(true, new b());
        p(this.u.k());
        this.u.k().E("u_projView", false, K());
        this.u.k().x("u_texture", 0);
        this.u.k().x("u_texture2", 1);
        this.u.k().s("maskadd", 0.0f);
        this.u.k().s("maskmul", 1.0f);
        this.u.k().s("mask_l_add", 1.0f);
        this.u.k().s("mask_l_mul", 0.0f);
        this.u.k().s("tex2_y_add", 0.0f);
        this.u.k().s("tex2_y_mul", 1.0f);
        this.u.k().v("Color2", 0.0f, 0.0f, 0.0f, 1.0f);
        this.u.k().s("saturation", 1.0f);
        if (this.u.F != null) {
            this.u.F.j(this.e);
        }
        this.u.l.s(this);
        this.u.a().o();
    }

    public void O(AbstractC3328b31 abstractC3328b31) {
        this.u.a.h(abstractC3328b31, this.s.b() > 0, "" + this.s.a + " / " + this.s.f + " / " + this.s.h);
    }

    public void P(Resources resources) {
        this.u.C(resources);
    }

    public boolean Q(Context context, int i, int i2) {
        if (this.n == i && this.o == i2) {
            return false;
        }
        this.n = i;
        this.o = i2;
        this.l = i;
        this.m = i2;
        return true;
    }

    public void R() {
        W();
        GLES20.glEnable(3042);
        this.u.D();
    }

    public void S(int i, C3477bc1 c3477bc1) {
        while (i >= this.v.size()) {
            this.v.add(null);
        }
        this.v.set(i, c3477bc1);
    }

    public void T(int i) {
        if (i == 2) {
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
        } else if (i == 1) {
            GLES20.glTexParameteri(3553, 10242, 33648);
            GLES20.glTexParameteri(3553, 10243, 33648);
        }
    }

    public void U(int i) {
        this.z = i;
    }

    public void W() {
        this.r = -1;
    }

    @Override // com.daaw.InterfaceC9336wX
    public int a() {
        int i = this.q;
        return i < 2 ? this.m : i;
    }

    @Override // com.daaw.InterfaceC9336wX
    public InterfaceC9336wX.a b() {
        return this.u;
    }

    @Override // com.daaw.InterfaceC9336wX
    public boolean c() {
        return this.x;
    }

    @Override // com.daaw.InterfaceC9336wX
    public float d() {
        return this.e;
    }

    @Override // com.daaw.InterfaceC9336wX
    public void e(int i) {
        if (this.r == i) {
            return;
        }
        this.u.l.r(this);
        switch (i) {
            case 0:
                GLES20.glBlendFunc(770, 771);
                break;
            case 1:
                GLES20.glBlendFunc(1, 769);
                break;
            case 2:
                GLES20.glBlendFunc(1, 1);
                break;
            case 3:
                GLES20.glBlendFunc(1, 0);
                break;
            case 4:
                GLES20.glBlendFunc(1, 771);
                break;
            case 5:
                GLES20.glBlendFunc(770, 1);
                break;
            case 6:
                GLES20.glBlendFunc(775, 769);
                break;
        }
        this.r = i;
    }

    @Override // com.daaw.InterfaceC9336wX
    public int f() {
        int i = this.p;
        return i < 2 ? this.l : i;
    }

    @Override // com.daaw.InterfaceC9336wX
    public float g() {
        return this.k;
    }

    @Override // com.daaw.InterfaceC9336wX
    public boolean h() {
        return this.w;
    }

    @Override // com.daaw.InterfaceC9336wX
    public void i(AbstractC7070oQ abstractC7070oQ) {
        o(abstractC7070oQ, false);
    }

    public void k() {
        this.s.e++;
    }

    public void l() {
        this.s.i++;
    }

    public void m() {
        this.s.j++;
    }

    public void n() {
        this.s.g++;
    }

    public void o(AbstractC7070oQ abstractC7070oQ, boolean z) {
        if (z || this.t != abstractC7070oQ) {
            this.t = abstractC7070oQ;
            m();
            this.u.l.r(this);
            if (abstractC7070oQ != null) {
                abstractC7070oQ.c();
                Matrix.orthoM(this.c, 0, 0.0f, abstractC7070oQ.getWidth(), abstractC7070oQ.getHeight(), 0.0f, 0.01f, 100.0f);
                Matrix.multiplyMM(this.b, 0, this.c, 0, this.d, 0);
            } else {
                GLES20.glViewport(0, 0, f(), a());
                GLES20.glBindFramebuffer(36160, 0);
                Matrix.orthoM(this.c, 0, 0.0f, f(), a(), 0.0f, 0.01f, 100.0f);
                Matrix.multiplyMM(this.b, 0, this.c, 0, this.d, 0);
            }
        }
    }

    public void p(AbstractC3987dR0 abstractC3987dR0) {
        this.u.l.r(this);
        if (abstractC3987dR0 != null) {
            abstractC3987dR0.z();
        }
    }

    public void q() {
        for (int i = 0; i < this.v.size(); i++) {
            this.v.set(i, null);
        }
    }

    public void r(C3755cc1 c3755cc1, C3755cc1 c3755cc12) {
        Matrix.multiplyMM(c3755cc1.a(), 0, this.c, 0, c3755cc12.a(), 0);
    }

    public void s(C3755cc1 c3755cc1, C1458Lc1 c1458Lc1, AbstractC7070oQ abstractC7070oQ, float f, float f2, float f3, float f4, float f5, float f6) {
        float height;
        float f7;
        if (abstractC7070oQ == null) {
            f7 = f();
            height = a();
        } else {
            float width = abstractC7070oQ.getWidth();
            height = abstractC7070oQ.getHeight();
            f7 = width;
        }
        c1458Lc1.a = f7;
        c1458Lc1.b = height;
        this.D.d();
        this.D.e(f7 * f4, height * f5, f6);
        Matrix.perspectiveM(this.E.a(), 0, f, f7 / height, f2, f3);
        Matrix.multiplyMM(c3755cc1.a(), 0, this.E.a(), 0, this.D.a(), 0);
    }

    public void t(C1458Lc1 c1458Lc1, float f, AbstractC7070oQ abstractC7070oQ, float f2, float f3) {
        float fAbs = (float) Math.abs(((double) f) * Math.tan(Math.toRadians(f3 * 0.5f)));
        c1458Lc1.b = fAbs;
        c1458Lc1.a = fAbs * f2;
    }

    public void u(float f, float f2, int i, RH0 rh0) {
        this.u.l.o(this, f, f2, 0.0f, f(), a(), i, C1458Lc1.s(), C1458Lc1.q(), rh0, true);
    }

    public void v(float f, float f2, int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        this.u.l.o(this, f, f2, 0.0f, f(), a(), i, c1458Lc1, c1458Lc12, rh0, false);
    }

    public void w(int i, IW iw, int i2) {
        this.u.l.o(this, 0.0f, 0.0f, 0.0f, f(), a(), i, C1458Lc1.s(), C1458Lc1.q(), new RH0(i2, iw, (C4312ec1) null, (InterfaceC6129l2) null), false);
    }

    public void x(int i, RH0 rh0) {
        u(0.0f, 0.0f, i, rh0);
    }

    public void y(int i, C1458Lc1 c1458Lc1, C1458Lc1 c1458Lc12, RH0 rh0) {
        this.u.l.o(this, -1.0f, -1.0f, 0.0f, 2.0f, 2.0f, i, c1458Lc1, c1458Lc12, rh0, false);
    }

    public void z() {
        this.s.a++;
    }

    public void V() {
    }
}
