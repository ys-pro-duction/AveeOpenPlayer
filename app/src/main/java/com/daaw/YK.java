package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: loaded from: classes.dex */
public final class YK extends AbstractC6399m00 implements C90 {
    public final ZB C;
    public final float D;

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0584Cu0 abstractC0584Cu0) {
            super(1);
            this.B = abstractC0584Cu0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.n(aVar, this.B, 0, 0, 0.0f, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YK(ZB zb, float f, NQ nq) {
        super(nq);
        G10.g(zb, "direction");
        G10.g(nq, "inspectorInfo");
        this.C = zb;
        this.D = f;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        int iP;
        int iN;
        int iM;
        int iL;
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        if (!C6079kr.j(j) || this.C == ZB.Vertical) {
            iP = C6079kr.p(j);
            iN = C6079kr.n(j);
        } else {
            iP = AbstractC8417tE0.l(AbstractC8261sh0.b(C6079kr.n(j) * this.D), C6079kr.p(j), C6079kr.n(j));
            iN = iP;
        }
        if (!C6079kr.i(j) || this.C == ZB.Horizontal) {
            int iO = C6079kr.o(j);
            iM = C6079kr.m(j);
            iL = iO;
        } else {
            iL = AbstractC8417tE0.l(AbstractC8261sh0.b(C6079kr.m(j) * this.D), C6079kr.o(j), C6079kr.m(j));
            iM = iL;
        }
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(AbstractC6916nr.a(iP, iN, iL, iM));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new a(abstractC0584Cu0G), 4, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof YK)) {
            return false;
        }
        YK yk = (YK) obj;
        return this.C == yk.C && this.D == yk.D;
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
        return (this.C.hashCode() * 31) + Float.floatToIntBits(this.D);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
