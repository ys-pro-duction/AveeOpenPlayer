package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.C6460mD;

/* JADX INFO: loaded from: classes.dex */
public final class DT0 extends AbstractC6399m00 implements C90 {
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final boolean G;

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

    public /* synthetic */ DT0(float f, float f2, float f3, float f4, boolean z, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, f3, f4, z, nq);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        long jA;
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        long jC = c(interfaceC1269Jh0);
        if (this.G) {
            jA = AbstractC6916nr.e(j, jC);
        } else {
            float f = this.C;
            C6460mD.a aVar = C6460mD.C;
            jA = AbstractC6916nr.a(!C6460mD.n(f, aVar.b()) ? C6079kr.p(jC) : AbstractC8417tE0.h(C6079kr.p(j), C6079kr.n(jC)), !C6460mD.n(this.E, aVar.b()) ? C6079kr.n(jC) : AbstractC8417tE0.d(C6079kr.n(j), C6079kr.p(jC)), !C6460mD.n(this.D, aVar.b()) ? C6079kr.o(jC) : AbstractC8417tE0.h(C6079kr.o(j), C6079kr.m(jC)), !C6460mD.n(this.F, aVar.b()) ? C6079kr.m(jC) : AbstractC8417tE0.d(C6079kr.m(j), C6079kr.o(jC)));
        }
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(jA);
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new a(abstractC0584Cu0G), 4, null);
    }

    public final long c(InterfaceC4988gz interfaceC4988gz) {
        int iD;
        int iD2;
        float f = this.E;
        C6460mD.a aVar = C6460mD.C;
        int i = 0;
        int iV = !C6460mD.n(f, aVar.b()) ? interfaceC4988gz.V(((C6460mD) AbstractC8417tE0.f(C6460mD.g(this.E), C6460mD.g(C6460mD.l(0)))).q()) : Integer.MAX_VALUE;
        int iV2 = !C6460mD.n(this.F, aVar.b()) ? interfaceC4988gz.V(((C6460mD) AbstractC8417tE0.f(C6460mD.g(this.F), C6460mD.g(C6460mD.l(0)))).q()) : Integer.MAX_VALUE;
        if (C6460mD.n(this.C, aVar.b()) || (iD = AbstractC8417tE0.d(AbstractC8417tE0.h(interfaceC4988gz.V(this.C), iV), 0)) == Integer.MAX_VALUE) {
            iD = 0;
        }
        if (!C6460mD.n(this.D, aVar.b()) && (iD2 = AbstractC8417tE0.d(AbstractC8417tE0.h(interfaceC4988gz.V(this.D), iV2), 0)) != Integer.MAX_VALUE) {
            i = iD2;
        }
        return AbstractC6916nr.a(iD, iV, i, iV2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof DT0)) {
            return false;
        }
        DT0 dt0 = (DT0) obj;
        return C6460mD.n(this.C, dt0.C) && C6460mD.n(this.D, dt0.D) && C6460mD.n(this.E, dt0.E) && C6460mD.n(this.F, dt0.F) && this.G == dt0.G;
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
        return ((((((C6460mD.o(this.C) * 31) + C6460mD.o(this.D)) * 31) + C6460mD.o(this.E)) * 31) + C6460mD.o(this.F)) * 31;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public /* synthetic */ DT0(float f, float f2, float f3, float f4, boolean z, NQ nq, int i, AbstractC2911Yw abstractC2911Yw) {
        this((i & 1) != 0 ? C6460mD.C.b() : f, (i & 2) != 0 ? C6460mD.C.b() : f2, (i & 4) != 0 ? C6460mD.C.b() : f3, (i & 8) != 0 ? C6460mD.C.b() : f4, z, nq, null);
    }

    public DT0(float f, float f2, float f3, float f4, boolean z, NQ nq) {
        super(nq);
        this.C = f;
        this.D = f2;
        this.E = f3;
        this.F = f4;
        this.G = z;
    }
}
