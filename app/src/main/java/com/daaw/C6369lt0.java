package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.lt0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6369lt0 extends AbstractC4034dc1 {
    public String b;
    public AbstractC2117Rg c;
    public float d;
    public List e;
    public int f;
    public float g;
    public float h;
    public AbstractC2117Rg i;
    public int j;
    public int k;
    public float l;
    public float m;
    public float n;
    public float o;
    public boolean p;
    public boolean q;
    public boolean r;
    public FY0 s;
    public final InterfaceC6090kt0 t;
    public final InterfaceC6090kt0 u;
    public final O90 v;
    public final C10002yt0 w;

    /* JADX INFO: renamed from: com.daaw.lt0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8600tt0 invoke() {
            return AbstractC6149l6.a();
        }
    }

    public C6369lt0() {
        super(null);
        this.b = "";
        this.d = 1.0f;
        this.e = AbstractC3203ad1.e();
        this.f = AbstractC3203ad1.b();
        this.g = 1.0f;
        this.j = AbstractC3203ad1.c();
        this.k = AbstractC3203ad1.d();
        this.l = 4.0f;
        this.n = 1.0f;
        this.p = true;
        this.q = true;
        this.r = true;
        this.t = AbstractC6428m6.a();
        this.u = AbstractC6428m6.a();
        this.v = AbstractC3192ab0.b(EnumC7395pb0.D, a.B);
        this.w = new C10002yt0();
    }

    @Override // com.daaw.AbstractC4034dc1
    public void a(OD od) {
        FY0 fy0;
        G10.g(od, "<this>");
        if (this.p) {
            t();
        } else if (this.r) {
            u();
        }
        this.p = false;
        this.r = false;
        AbstractC2117Rg abstractC2117Rg = this.c;
        if (abstractC2117Rg != null) {
            ND.f(od, this.u, abstractC2117Rg, this.d, null, null, 0, 56, null);
        }
        AbstractC2117Rg abstractC2117Rg2 = this.i;
        if (abstractC2117Rg2 != null) {
            FY0 fy02 = this.s;
            if (this.q || fy02 == null) {
                FY0 fy03 = new FY0(this.h, this.l, this.j, this.k, null, 16, null);
                this.s = fy03;
                this.q = false;
                fy0 = fy03;
            } else {
                fy0 = fy02;
            }
            ND.f(od, this.u, abstractC2117Rg2, this.g, fy0, null, 0, 48, null);
        }
    }

    public final InterfaceC8600tt0 e() {
        return (InterfaceC8600tt0) this.v.getValue();
    }

    public final void f(AbstractC2117Rg abstractC2117Rg) {
        this.c = abstractC2117Rg;
        c();
    }

    public final void g(float f) {
        this.d = f;
        c();
    }

    public final void h(String str) {
        G10.g(str, "value");
        this.b = str;
        c();
    }

    public final void i(List list) {
        G10.g(list, "value");
        this.e = list;
        this.p = true;
        c();
    }

    public final void j(int i) {
        this.f = i;
        this.u.j(i);
        c();
    }

    public final void k(AbstractC2117Rg abstractC2117Rg) {
        this.i = abstractC2117Rg;
        c();
    }

    public final void l(float f) {
        this.g = f;
        c();
    }

    public final void m(int i) {
        this.j = i;
        this.q = true;
        c();
    }

    public final void n(int i) {
        this.k = i;
        this.q = true;
        c();
    }

    public final void o(float f) {
        this.l = f;
        this.q = true;
        c();
    }

    public final void p(float f) {
        this.h = f;
        c();
    }

    public final void q(float f) {
        if (this.n == f) {
            return;
        }
        this.n = f;
        this.r = true;
        c();
    }

    public final void r(float f) {
        if (this.o == f) {
            return;
        }
        this.o = f;
        this.r = true;
        c();
    }

    public final void s(float f) {
        if (this.m == f) {
            return;
        }
        this.m = f;
        this.r = true;
        c();
    }

    public final void t() {
        this.w.e();
        this.t.reset();
        this.w.b(this.e).D(this.t);
        u();
    }

    public String toString() {
        return this.t.toString();
    }

    public final void u() {
        this.u.reset();
        if (this.m == 0.0f && this.n == 1.0f) {
            AbstractC5802jt0.a(this.u, this.t, 0L, 2, null);
            return;
        }
        e().a(this.t, false);
        float fB = e().b();
        float f = this.m;
        float f2 = this.o;
        float f3 = ((f + f2) % 1.0f) * fB;
        float f4 = ((this.n + f2) % 1.0f) * fB;
        if (f3 <= f4) {
            e().c(f3, f4, this.u, true);
        } else {
            e().c(f3, fB, this.u, true);
            e().c(0.0f, f4, this.u, true);
        }
    }
}
