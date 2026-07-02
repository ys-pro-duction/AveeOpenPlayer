package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.C6460mD;

/* JADX INFO: renamed from: com.daaw.ga1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4870ga1 extends AbstractC6399m00 implements C90 {
    public final float C;
    public final float D;

    /* JADX INFO: renamed from: com.daaw.ga1$a */
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

    public /* synthetic */ C4870ga1(float f, float f2, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, nq);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        float f = this.C;
        C6460mD.a aVar = C6460mD.C;
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(AbstractC6916nr.a((C6460mD.n(f, aVar.b()) || C6079kr.p(j) != 0) ? C6079kr.p(j) : AbstractC8417tE0.d(AbstractC8417tE0.h(interfaceC1269Jh0.V(this.C), C6079kr.n(j)), 0), C6079kr.n(j), (C6460mD.n(this.D, aVar.b()) || C6079kr.o(j) != 0) ? C6079kr.o(j) : AbstractC8417tE0.d(AbstractC8417tE0.h(interfaceC1269Jh0.V(this.D), C6079kr.m(j)), 0), C6079kr.m(j)));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new a(abstractC0584Cu0G), 4, null);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C4870ga1)) {
            return false;
        }
        C4870ga1 c4870ga1 = (C4870ga1) obj;
        return C6460mD.n(this.C, c4870ga1.C) && C6460mD.n(this.D, c4870ga1.D);
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
        return (C6460mD.o(this.C) * 31) + C6460mD.o(this.D);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public C4870ga1(float f, float f2, NQ nq) {
        super(nq);
        this.C = f;
        this.D = f2;
    }
}
