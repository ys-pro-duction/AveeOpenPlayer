package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.Yi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2857Yi1 extends AbstractC6399m00 implements C90 {
    public final ZB C;
    public final boolean D;
    public final InterfaceC3429bR E;
    public final Object F;

    /* JADX INFO: renamed from: com.daaw.Yi1$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ int C;
        public final /* synthetic */ AbstractC0584Cu0 D;
        public final /* synthetic */ int E;
        public final /* synthetic */ InterfaceC1269Jh0 F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, AbstractC0584Cu0 abstractC0584Cu0, int i2, InterfaceC1269Jh0 interfaceC1269Jh0) {
            super(1);
            this.C = i;
            this.D = abstractC0584Cu0;
            this.E = i2;
            this.F = interfaceC1269Jh0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            AbstractC0584Cu0.a.l(aVar, this.D, ((D00) C2857Yi1.this.E.invoke(I00.b(J00.a(this.C - this.D.q0(), this.E - this.D.l0())), this.F.getLayoutDirection())).j(), 0.0f, 2, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2857Yi1(ZB zb, boolean z, InterfaceC3429bR interfaceC3429bR, Object obj, NQ nq) {
        super(nq);
        G10.g(zb, "direction");
        G10.g(interfaceC3429bR, "alignmentCallback");
        G10.g(obj, "align");
        G10.g(nq, "inspectorInfo");
        this.C = zb;
        this.D = z;
        this.E = interfaceC3429bR;
        this.F = obj;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        ZB zb = this.C;
        ZB zb2 = ZB.Vertical;
        int iP = zb != zb2 ? 0 : C6079kr.p(j);
        ZB zb3 = this.C;
        ZB zb4 = ZB.Horizontal;
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(AbstractC6916nr.a(iP, (this.C == zb2 || !this.D) ? C6079kr.n(j) : Integer.MAX_VALUE, zb3 == zb4 ? C6079kr.o(j) : 0, (this.C == zb4 || !this.D) ? C6079kr.m(j) : Integer.MAX_VALUE));
        int iL = AbstractC8417tE0.l(abstractC0584Cu0G.q0(), C6079kr.p(j), C6079kr.n(j));
        int iL2 = AbstractC8417tE0.l(abstractC0584Cu0G.l0(), C6079kr.o(j), C6079kr.m(j));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, iL, iL2, null, new a(iL, abstractC0584Cu0G, iL2, interfaceC1269Jh0), 4, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2857Yi1)) {
            return false;
        }
        C2857Yi1 c2857Yi1 = (C2857Yi1) obj;
        return this.C == c2857Yi1.C && this.D == c2857Yi1.D && G10.c(this.F, c2857Yi1.F);
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
        return (((this.C.hashCode() * 31) + AbstractC8813ug.a(this.D)) * 31) + this.F.hashCode();
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
