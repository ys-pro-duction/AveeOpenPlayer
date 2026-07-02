package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.f00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4426f00 extends AbstractC6399m00 implements C90, InterfaceC1385Kk0, InterfaceC1696Nk0 {
    public final InterfaceC4905gh1 C;
    public final InterfaceC8007rm0 D;
    public final InterfaceC8007rm0 E;

    /* JADX INFO: renamed from: com.daaw.f00$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0584Cu0 abstractC0584Cu0, int i, int i2) {
            super(1);
            this.B = abstractC0584Cu0;
            this.C = i;
            this.D = i2;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.j(aVar, this.B, this.C, this.D, 0.0f, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.f00$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC4905gh1 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4905gh1 interfaceC4905gh1) {
            super(1);
            this.B = interfaceC4905gh1;
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
            throw null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4426f00(InterfaceC4905gh1 interfaceC4905gh1, NQ nq) {
        super(nq);
        G10.g(interfaceC4905gh1, "insets");
        G10.g(nq, "inspectorInfo");
        this.C = interfaceC4905gh1;
        this.D = AbstractC9046vU0.d(interfaceC4905gh1, null, 2, null);
        this.E = AbstractC9046vU0.d(interfaceC4905gh1, null, 2, null);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        int iC = d().c(interfaceC1269Jh0, interfaceC1269Jh0.getLayoutDirection());
        int iD = d().d(interfaceC1269Jh0);
        int iA = d().a(interfaceC1269Jh0, interfaceC1269Jh0.getLayoutDirection()) + iC;
        int iB = d().b(interfaceC1269Jh0) + iD;
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(AbstractC6916nr.h(j, -iA, -iB));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, AbstractC6916nr.g(j, abstractC0584Cu0G.q0() + iA), AbstractC6916nr.f(j, abstractC0584Cu0G.l0() + iB), null, new a(abstractC0584Cu0G, iC, iD), 4, null);
    }

    public final InterfaceC4905gh1 c() {
        return (InterfaceC4905gh1) this.E.getValue();
    }

    public final InterfaceC4905gh1 d() {
        return (InterfaceC4905gh1) this.D.getValue();
    }

    @Override // com.daaw.InterfaceC1385Kk0
    public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
        G10.g(interfaceC1904Pk0, "scope");
        InterfaceC4905gh1 interfaceC4905gh1 = (InterfaceC4905gh1) interfaceC1904Pk0.a(AbstractC3507bi1.a());
        j(AbstractC3228ai1.b(this.C, interfaceC4905gh1));
        i(AbstractC3228ai1.c(interfaceC4905gh1, this.C));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C4426f00) {
            return G10.c(((C4426f00) obj).C, this.C);
        }
        return false;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC1696Nk0
    public C6732nB0 getKey() {
        return AbstractC3507bi1.a();
    }

    @Override // com.daaw.InterfaceC1696Nk0
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public InterfaceC4905gh1 getValue() {
        return c();
    }

    public int hashCode() {
        return this.C.hashCode();
    }

    public final void i(InterfaceC4905gh1 interfaceC4905gh1) {
        this.E.setValue(interfaceC4905gh1);
    }

    public final void j(InterfaceC4905gh1 interfaceC4905gh1) {
        this.D.setValue(interfaceC4905gh1);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public /* synthetic */ C4426f00(InterfaceC4905gh1 interfaceC4905gh1, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this(interfaceC4905gh1, (i & 2) != 0 ? AbstractC5550j00.c() ? new b(interfaceC4905gh1) : AbstractC5550j00.a() : nq);
    }
}
