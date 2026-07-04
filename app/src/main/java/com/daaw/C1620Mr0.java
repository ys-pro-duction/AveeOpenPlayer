package com.daaw;

/* JADX INFO: renamed from: com.daaw.Mr0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1620Mr0 {
    public final AU0 a;
    public final NQ b;
    public final NQ c;
    public final NQ d;

    /* JADX INFO: renamed from: com.daaw.Mr0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public static final a B = new a();

        public a() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj) {
            G10.g(obj, "it");
            return Boolean.valueOf(!((InterfaceC1516Lr0) obj).isValid());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mr0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public static final b B = new b();

        public b() {
            super(1);
        }

        public final void a(E90 e90) {
            G10.g(e90, "layoutNode");
            if (e90.isValid()) {
                E90.Z0(e90, false, 1, null);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E90) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mr0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public static final c B = new c();

        public c() {
            super(1);
        }

        public final void a(E90 e90) {
            G10.g(e90, "layoutNode");
            if (e90.isValid()) {
                E90.Z0(e90, false, 1, null);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E90) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Mr0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public static final d B = new d();

        public d() {
            super(1);
        }

        public final void a(E90 e90) {
            G10.g(e90, "layoutNode");
            if (e90.isValid()) {
                E90.b1(e90, false, 1, null);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((E90) obj);
            return G91.a;
        }
    }

    public C1620Mr0(NQ nq) {
        G10.g(nq, "onChangedExecutor");
        this.a = new AU0(nq);
        this.b = d.B;
        this.c = b.B;
        this.d = c.B;
    }

    public final void a() {
        this.a.h(a.B);
    }

    public final void b(E90 e90, LQ lq) {
        G10.g(e90, "node");
        G10.g(lq, "block");
        e(e90, this.d, lq);
    }

    public final void c(E90 e90, LQ lq) {
        G10.g(e90, "node");
        G10.g(lq, "block");
        e(e90, this.c, lq);
    }

    public final void d(E90 e90, LQ lq) {
        G10.g(e90, "node");
        G10.g(lq, "block");
        e(e90, this.b, lq);
    }

    public final void e(InterfaceC1516Lr0 interfaceC1516Lr0, NQ nq, LQ lq) {
        G10.g(interfaceC1516Lr0, "target");
        G10.g(nq, "onChanged");
        G10.g(lq, "block");
        this.a.j(interfaceC1516Lr0, nq, lq);
    }

    public final void f() {
        this.a.k();
    }

    public final void g() {
        this.a.l();
        this.a.g();
    }
}
