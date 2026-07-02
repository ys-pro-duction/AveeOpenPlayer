package com.daaw;

/* JADX INFO: renamed from: com.daaw.r6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7822r6 extends JJ0 implements AG0 {
    public final boolean b;
    public final float c;
    public final InterfaceC6258lW0 d;
    public final InterfaceC6258lW0 e;
    public final EJ0 f;
    public final InterfaceC8007rm0 g;
    public final InterfaceC8007rm0 h;
    public long i;
    public int j;
    public final LQ k;

    /* JADX INFO: renamed from: com.daaw.r6$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m63invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m63invoke() {
            C7822r6.this.o(!r0.l());
        }
    }

    public /* synthetic */ C7822r6(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, EJ0 ej0, AbstractC2911Yw abstractC2911Yw) {
        this(z, f, interfaceC6258lW0, interfaceC6258lW02, ej0);
    }

    @Override // com.daaw.InterfaceC9623xZ
    public void a(InterfaceC2995Zr interfaceC2995Zr) {
        G10.g(interfaceC2995Zr, "<this>");
        this.i = interfaceC2995Zr.a();
        this.j = Float.isNaN(this.c) ? AbstractC8261sh0.b(DJ0.a(interfaceC2995Zr, this.b, interfaceC2995Zr.a())) : interfaceC2995Zr.V(this.c);
        long jW = ((C2559Vm) this.d.getValue()).w();
        float fD = ((BJ0) this.e.getValue()).d();
        interfaceC2995Zr.g0();
        f(interfaceC2995Zr, this.c, jW);
        InterfaceC6318lj interfaceC6318ljD = interfaceC2995Zr.R().d();
        l();
        IJ0 ij0M = m();
        if (ij0M != null) {
            ij0M.f(interfaceC2995Zr.a(), this.j, jW, fD);
            ij0M.draw(AbstractC3614c5.c(interfaceC6318ljD));
        }
    }

    @Override // com.daaw.AG0
    public void b() {
        k();
    }

    @Override // com.daaw.AG0
    public void c() {
        k();
    }

    @Override // com.daaw.JJ0
    public void e(C6115kz0 c6115kz0, InterfaceC7484pt interfaceC7484pt) {
        G10.g(c6115kz0, "interaction");
        G10.g(interfaceC7484pt, "scope");
        IJ0 ij0B = this.f.b(this);
        ij0B.b(c6115kz0, this.b, this.i, this.j, ((C2559Vm) this.d.getValue()).w(), ((BJ0) this.e.getValue()).d(), this.k);
        p(ij0B);
    }

    @Override // com.daaw.JJ0
    public void g(C6115kz0 c6115kz0) {
        G10.g(c6115kz0, "interaction");
        IJ0 ij0M = m();
        if (ij0M != null) {
            ij0M.e();
        }
    }

    public final void k() {
        this.f.a(this);
    }

    public final boolean l() {
        return ((Boolean) this.h.getValue()).booleanValue();
    }

    public final IJ0 m() {
        return (IJ0) this.g.getValue();
    }

    public final void n() {
        p(null);
    }

    public final void o(boolean z) {
        this.h.setValue(Boolean.valueOf(z));
    }

    public final void p(IJ0 ij0) {
        this.g.setValue(ij0);
    }

    public C7822r6(boolean z, float f, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, EJ0 ej0) {
        super(z, interfaceC6258lW02);
        this.b = z;
        this.c = f;
        this.d = interfaceC6258lW0;
        this.e = interfaceC6258lW02;
        this.f = ej0;
        this.g = AbstractC9046vU0.d(null, null, 2, null);
        this.h = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
        this.i = C9879yT0.b.b();
        this.j = -1;
        this.k = new a();
    }

    @Override // com.daaw.AG0
    public void d() {
    }
}
