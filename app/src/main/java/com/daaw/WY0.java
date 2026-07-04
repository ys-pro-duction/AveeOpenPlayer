package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class WY0 {
    public final YY0 a;
    public J90 b;
    public final InterfaceC3429bR c;
    public final InterfaceC3429bR d;
    public final InterfaceC3429bR e;

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public a() {
            super(2);
        }

        public final void a(E90 e90, AbstractC1300Jp abstractC1300Jp) {
            G10.g(e90, "$this$null");
            G10.g(abstractC1300Jp, "it");
            WY0.this.i().m(abstractC1300Jp);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((E90) obj, (AbstractC1300Jp) obj2);
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public b() {
            super(2);
        }

        public final void a(E90 e90, InterfaceC3429bR interfaceC3429bR) {
            G10.g(e90, "$this$null");
            G10.g(interfaceC3429bR, "it");
            e90.e(WY0.this.i().d(interfaceC3429bR));
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((E90) obj, (InterfaceC3429bR) obj2);
            return G91.a;
        }
    }

    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public c() {
            super(2);
        }

        public final void a(E90 e90, WY0 wy0) {
            G10.g(e90, "$this$null");
            G10.g(wy0, "it");
            WY0 wy02 = WY0.this;
            J90 j90N0 = e90.n0();
            if (j90N0 == null) {
                j90N0 = new J90(e90, WY0.this.a);
                e90.k1(j90N0);
            }
            wy02.b = j90N0;
            WY0.this.i().j();
            WY0.this.i().n(WY0.this.a);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((E90) obj, (WY0) obj2);
            return G91.a;
        }
    }

    public WY0(YY0 yy0) {
        G10.g(yy0, "slotReusePolicy");
        this.a = yy0;
        this.c = new c();
        this.d = new a();
        this.e = new b();
    }

    public final void d() {
        i().f();
    }

    public final void e() {
        i().h();
    }

    public final InterfaceC3429bR f() {
        return this.d;
    }

    public final InterfaceC3429bR g() {
        return this.e;
    }

    public final InterfaceC3429bR h() {
        return this.c;
    }

    public final J90 i() {
        J90 j90 = this.b;
        if (j90 != null) {
            return j90;
        }
        throw new IllegalArgumentException("SubcomposeLayoutState is not attached to SubcomposeLayout");
    }

    public WY0() {
        this(C6056ko0.a);
    }
}
