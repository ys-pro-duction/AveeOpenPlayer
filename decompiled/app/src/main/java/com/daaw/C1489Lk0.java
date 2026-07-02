package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1489Lk0 implements LQ, InterfaceC1516Lr0, InterfaceC1904Pk0 {
    public static final c F = new c(null);
    public static final NQ G = b.B;
    public static final InterfaceC1904Pk0 H = new a();
    public C1800Ok0 B;
    public final InterfaceC1385Kk0 C;
    public final C8565tm0 D;
    public boolean E;

    /* JADX INFO: renamed from: com.daaw.Lk0$a */
    public static final class a implements InterfaceC1904Pk0 {
        @Override // com.daaw.InterfaceC1904Pk0
        public Object a(AbstractC1281Jk0 abstractC1281Jk0) {
            G10.g(abstractC1281Jk0, "<this>");
            return abstractC1281Jk0.a().invoke();
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lk0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        public final void a(C1489Lk0 c1489Lk0) {
            G10.g(c1489Lk0, "node");
            c1489Lk0.m();
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C1489Lk0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lk0$c */
    public static final class c {
        public /* synthetic */ c(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.Lk0$d */
    public static final class d extends AbstractC4192e90 implements LQ {
        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m17invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m17invoke() {
            C1489Lk0.this.i().e(C1489Lk0.this);
        }
    }

    public C1489Lk0(C1800Ok0 c1800Ok0, InterfaceC1385Kk0 interfaceC1385Kk0) {
        G10.g(c1800Ok0, "provider");
        G10.g(interfaceC1385Kk0, "modifier");
        this.B = c1800Ok0;
        this.C = interfaceC1385Kk0;
        this.D = new C8565tm0(new AbstractC1281Jk0[16], 0);
    }

    @Override // com.daaw.InterfaceC1904Pk0
    public Object a(AbstractC1281Jk0 abstractC1281Jk0) {
        G10.g(abstractC1281Jk0, "<this>");
        this.D.d(abstractC1281Jk0);
        InterfaceC1696Nk0 interfaceC1696Nk0H = this.B.h(abstractC1281Jk0);
        return interfaceC1696Nk0H == null ? abstractC1281Jk0.a().invoke() : interfaceC1696Nk0H.getValue();
    }

    public final void c() {
        this.E = true;
        m();
    }

    public final void d() {
        this.E = true;
        j();
    }

    public final void h() {
        this.C.e(H);
        this.E = false;
    }

    public final InterfaceC1385Kk0 i() {
        return this.C;
    }

    @Override // com.daaw.LQ
    public /* bridge */ /* synthetic */ Object invoke() {
        l();
        return G91.a;
    }

    @Override // com.daaw.InterfaceC1516Lr0
    public boolean isValid() {
        return this.E;
    }

    public final void j() {
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = this.B.j().k0();
        if (interfaceC1413Kr0K0 != null) {
            interfaceC1413Kr0K0.f(this);
        }
    }

    public final void k(AbstractC1281Jk0 abstractC1281Jk0) {
        InterfaceC1413Kr0 interfaceC1413Kr0K0;
        G10.g(abstractC1281Jk0, "local");
        if (!this.D.m(abstractC1281Jk0) || (interfaceC1413Kr0K0 = this.B.j().k0()) == null) {
            return;
        }
        interfaceC1413Kr0K0.f(this);
    }

    public void l() {
        m();
    }

    public final void m() {
        if (this.E) {
            this.D.k();
            I90.a(this.B.j()).getSnapshotObserver().e(this, G, new d());
        }
    }

    public final void n(C1800Ok0 c1800Ok0) {
        G10.g(c1800Ok0, "<set-?>");
        this.B = c1800Ok0;
    }
}
