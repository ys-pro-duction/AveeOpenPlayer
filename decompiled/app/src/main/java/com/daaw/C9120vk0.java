package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.vk0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9120vk0 implements C90 {
    public final long B;

    /* JADX INFO: renamed from: com.daaw.vk0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ int B;
        public final /* synthetic */ AbstractC0584Cu0 C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, AbstractC0584Cu0 abstractC0584Cu0, int i2) {
            super(1);
            this.B = i;
            this.C = abstractC0584Cu0;
            this.D = i2;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.j(aVar, this.C, AbstractC8261sh0.b((this.B - this.C.q0()) / 2.0f), AbstractC8261sh0.b((this.D - this.C.l0()) / 2.0f), 0.0f, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    public /* synthetic */ C9120vk0(long j, AbstractC2911Yw abstractC2911Yw) {
        this(j);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(j);
        int iMax = Math.max(abstractC0584Cu0G.q0(), interfaceC1269Jh0.V(AbstractC7576qD.f(this.B)));
        int iMax2 = Math.max(abstractC0584Cu0G.l0(), interfaceC1269Jh0.V(AbstractC7576qD.e(this.B)));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, iMax, iMax2, null, new a(iMax, abstractC0584Cu0G, iMax2), 4, null);
    }

    public boolean equals(Object obj) {
        C9120vk0 c9120vk0 = obj instanceof C9120vk0 ? (C9120vk0) obj : null;
        if (c9120vk0 == null) {
            return false;
        }
        return AbstractC7576qD.d(this.B, c9120vk0.B);
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
        return AbstractC7576qD.g(this.B);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public C9120vk0(long j) {
        this.B = j;
    }
}
