package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.Cp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0564Cp0 extends AbstractC6399m00 implements C90 {
    public final float C;
    public final float D;
    public final boolean E;

    /* JADX INFO: renamed from: com.daaw.Cp0$a */
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
            if (C0564Cp0.this.c()) {
                AbstractC0584Cu0.a.n(aVar, this.C, this.D.V(C0564Cp0.this.d()), this.D.V(C0564Cp0.this.h()), 0.0f, 4, null);
            } else {
                AbstractC0584Cu0.a.j(aVar, this.C, this.D.V(C0564Cp0.this.d()), this.D.V(C0564Cp0.this.h()), 0.0f, 4, null);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    public /* synthetic */ C0564Cp0(float f, float f2, boolean z, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, z, nq);
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
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new a(abstractC0584Cu0G, interfaceC1269Jh0), 4, null);
    }

    public final boolean c() {
        return this.E;
    }

    public final float d() {
        return this.C;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0564Cp0 c0564Cp0 = obj instanceof C0564Cp0 ? (C0564Cp0) obj : null;
        return c0564Cp0 != null && C6460mD.n(this.C, c0564Cp0.C) && C6460mD.n(this.D, c0564Cp0.D) && this.E == c0564Cp0.E;
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
        return (((C6460mD.o(this.C) * 31) + C6460mD.o(this.D)) * 31) + AbstractC8813ug.a(this.E);
    }

    public String toString() {
        return "OffsetModifier(x=" + ((Object) C6460mD.p(this.C)) + ", y=" + ((Object) C6460mD.p(this.D)) + ", rtlAware=" + this.E + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public C0564Cp0(float f, float f2, boolean z, NQ nq) {
        super(nq);
        this.C = f;
        this.D = f2;
        this.E = z;
    }
}
