package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.Zf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2947Zf extends AbstractC6399m00 implements C90 {
    public final NQ C;

    /* JADX INFO: renamed from: com.daaw.Zf$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 B;
        public final /* synthetic */ C2947Zf C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0584Cu0 abstractC0584Cu0, C2947Zf c2947Zf) {
            super(1);
            this.B = abstractC0584Cu0;
            this.C = c2947Zf;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.r(aVar, this.B, 0, 0, 0.0f, this.C.C, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2947Zf(NQ nq, NQ nq2) {
        super(nq2);
        G10.g(nq, "layerBlock");
        G10.g(nq2, "inspectorInfo");
        this.C = nq;
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
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new a(abstractC0584Cu0G, this), 4, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C2947Zf) {
            return G10.c(this.C, ((C2947Zf) obj).C);
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

    public int hashCode() {
        return this.C.hashCode();
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.C + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
