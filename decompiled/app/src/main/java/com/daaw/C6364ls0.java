package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.ls0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6364ls0 extends AbstractC6399m00 implements C90 {
    public final float C;
    public final float D;
    public final float E;
    public final float F;
    public final boolean G;

    /* JADX INFO: renamed from: com.daaw.ls0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ AbstractC0584Cu0 C;
        public final /* synthetic */ InterfaceC1269Jh0 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0584Cu0 abstractC0584Cu0, InterfaceC1269Jh0 interfaceC1269Jh0) {
            super(1);
            this.C = abstractC0584Cu0;
            this.D = interfaceC1269Jh0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            if (C6364ls0.this.c()) {
                AbstractC0584Cu0.a.n(aVar, this.C, this.D.V(C6364ls0.this.d()), this.D.V(C6364ls0.this.h()), 0.0f, 4, null);
            } else {
                AbstractC0584Cu0.a.j(aVar, this.C, this.D.V(C6364ls0.this.d()), this.D.V(C6364ls0.this.h()), 0.0f, 4, null);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    public /* synthetic */ C6364ls0(float f, float f2, float f3, float f4, boolean z, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, f3, f4, z, nq);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        int iV = interfaceC1269Jh0.V(this.C) + interfaceC1269Jh0.V(this.E);
        int iV2 = interfaceC1269Jh0.V(this.D) + interfaceC1269Jh0.V(this.F);
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(AbstractC6916nr.h(j, -iV, -iV2));
        return AbstractC1165Ih0.b(interfaceC1269Jh0, AbstractC6916nr.g(j, abstractC0584Cu0G.q0() + iV), AbstractC6916nr.f(j, abstractC0584Cu0G.l0() + iV2), null, new a(abstractC0584Cu0G, interfaceC1269Jh0), 4, null);
    }

    public final boolean c() {
        return this.G;
    }

    public final float d() {
        return this.C;
    }

    public boolean equals(Object obj) {
        C6364ls0 c6364ls0 = obj instanceof C6364ls0 ? (C6364ls0) obj : null;
        return c6364ls0 != null && C6460mD.n(this.C, c6364ls0.C) && C6460mD.n(this.D, c6364ls0.D) && C6460mD.n(this.E, c6364ls0.E) && C6460mD.n(this.F, c6364ls0.F) && this.G == c6364ls0.G;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    public final float h() {
        return this.D;
    }

    public int hashCode() {
        return (((((((C6460mD.o(this.C) * 31) + C6460mD.o(this.D)) * 31) + C6460mD.o(this.E)) * 31) + C6460mD.o(this.F)) * 31) + AbstractC8813ug.a(this.G);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public C6364ls0(float f, float f2, float f3, float f4, boolean z, NQ nq) {
        super(nq);
        this.C = f;
        this.D = f2;
        this.E = f3;
        this.F = f4;
        this.G = z;
        if ((f < 0.0f && !C6460mD.n(f, C6460mD.C.b())) || ((f2 < 0.0f && !C6460mD.n(f2, C6460mD.C.b())) || ((f3 < 0.0f && !C6460mD.n(f3, C6460mD.C.b())) || (f4 < 0.0f && !C6460mD.n(f4, C6460mD.C.b()))))) {
            throw new IllegalArgumentException("Padding must be non-negative");
        }
    }
}
