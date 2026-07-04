package com.daaw;

/* JADX INFO: renamed from: com.daaw.Rc1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2103Rc1 extends AbstractC4034dc1 {
    public final ZT b;
    public boolean c;
    public final ED d;
    public LQ e;
    public final InterfaceC8007rm0 f;
    public float g;
    public float h;
    public long i;
    public final NQ j;

    /* JADX INFO: renamed from: com.daaw.Rc1$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public a() {
            super(1);
        }

        public final void a(OD od) {
            G10.g(od, "$this$null");
            C2103Rc1.this.j().a(od);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OD) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Rc1$b */
    public static final class b extends AbstractC4192e90 implements LQ {
        public static final b B = new b();

        public b() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m29invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m29invoke() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Rc1$c */
    public static final class c extends AbstractC4192e90 implements LQ {
        public c() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m30invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m30invoke() {
            C2103Rc1.this.f();
        }
    }

    public C2103Rc1() {
        super(null);
        ZT zt = new ZT();
        zt.m(0.0f);
        zt.n(0.0f);
        zt.d(new c());
        this.b = zt;
        this.c = true;
        this.d = new ED();
        this.e = b.B;
        this.f = AbstractC9046vU0.d(null, null, 2, null);
        this.i = C9879yT0.b.a();
        this.j = new a();
    }

    @Override // com.daaw.AbstractC4034dc1
    public void a(OD od) {
        G10.g(od, "<this>");
        g(od, 1.0f, null);
    }

    public final void f() {
        this.c = true;
        this.e.invoke();
    }

    public final void g(OD od, float f, C2871Ym c2871Ym) {
        OD od2;
        G10.g(od, "<this>");
        if (c2871Ym == null) {
            c2871Ym = h();
        }
        if (this.c || !C9879yT0.f(this.i, od.a())) {
            this.b.p(C9879yT0.i(od.a()) / this.g);
            this.b.q(C9879yT0.g(od.a()) / this.h);
            od2 = od;
            this.d.b(J00.a((int) Math.ceil(C9879yT0.i(od.a())), (int) Math.ceil(C9879yT0.g(od.a()))), od2, od.getLayoutDirection(), this.j);
            this.c = false;
            this.i = od2.a();
        } else {
            od2 = od;
        }
        this.d.c(od2, f, c2871Ym);
    }

    public final C2871Ym h() {
        return (C2871Ym) this.f.getValue();
    }

    public final String i() {
        return this.b.e();
    }

    public final ZT j() {
        return this.b;
    }

    public final float k() {
        return this.h;
    }

    public final float l() {
        return this.g;
    }

    public final void m(C2871Ym c2871Ym) {
        this.f.setValue(c2871Ym);
    }

    public final void n(LQ lq) {
        G10.g(lq, "<set-?>");
        this.e = lq;
    }

    public final void o(String str) {
        G10.g(str, "value");
        this.b.l(str);
    }

    public final void p(float f) {
        if (this.h == f) {
            return;
        }
        this.h = f;
        f();
    }

    public final void q(float f) {
        if (this.g == f) {
            return;
        }
        this.g = f;
        f();
    }

    public String toString() {
        String str = "Params: \tname: " + i() + "\n\tviewportWidth: " + this.g + "\n\tviewportHeight: " + this.h + "\n";
        G10.f(str, "StringBuilder().apply(builderAction).toString()");
        return str;
    }
}
