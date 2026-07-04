package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.os0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7201os0 extends AbstractC6399m00 implements C90 {
    public final InterfaceC6643ms0 C;

    /* JADX INFO: renamed from: com.daaw.os0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 B;
        public final /* synthetic */ InterfaceC1269Jh0 C;
        public final /* synthetic */ C7201os0 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0584Cu0 abstractC0584Cu0, InterfaceC1269Jh0 interfaceC1269Jh0, C7201os0 c7201os0) {
            super(1);
            this.B = abstractC0584Cu0;
            this.C = interfaceC1269Jh0;
            this.D = c7201os0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.j(aVar, this.B, this.C.V(this.D.c().a(this.C.getLayoutDirection())), this.C.V(this.D.c().d()), 0.0f, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7201os0(InterfaceC6643ms0 interfaceC6643ms0, NQ nq) {
        super(nq);
        G10.g(interfaceC6643ms0, "paddingValues");
        G10.g(nq, "inspectorInfo");
        this.C = interfaceC6643ms0;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        float f = 0;
        if (C6460mD.k(this.C.a(interfaceC1269Jh0.getLayoutDirection()), C6460mD.l(f)) < 0 || C6460mD.k(this.C.d(), C6460mD.l(f)) < 0 || C6460mD.k(this.C.b(interfaceC1269Jh0.getLayoutDirection()), C6460mD.l(f)) < 0 || C6460mD.k(this.C.c(), C6460mD.l(f)) < 0) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
        int iV = interfaceC1269Jh0.V(this.C.a(interfaceC1269Jh0.getLayoutDirection())) + interfaceC1269Jh0.V(this.C.b(interfaceC1269Jh0.getLayoutDirection()));
        int iV2 = interfaceC1269Jh0.V(this.C.d()) + interfaceC1269Jh0.V(this.C.c());
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(AbstractC6916nr.h(j, -iV, -iV2));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, AbstractC6916nr.g(j, abstractC0584Cu0G.q0() + iV), AbstractC6916nr.f(j, abstractC0584Cu0G.l0() + iV2), null, new a(abstractC0584Cu0G, interfaceC1269Jh0, this), 4, null);
    }

    public final InterfaceC6643ms0 c() {
        return this.C;
    }

    public boolean equals(Object obj) {
        C7201os0 c7201os0 = obj instanceof C7201os0 ? (C7201os0) obj : null;
        if (c7201os0 == null) {
            return false;
        }
        return G10.c(this.C, c7201os0.C);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    public int hashCode() {
        return this.C.hashCode();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
