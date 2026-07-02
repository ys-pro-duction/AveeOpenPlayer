package com.daaw;

import com.daaw.AbstractC0584Cu0;

/* JADX INFO: renamed from: com.daaw.Dp0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0677Dp0 extends AbstractC6399m00 implements C90 {
    public final NQ C;
    public final boolean D;

    /* JADX INFO: renamed from: com.daaw.Dp0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC1269Jh0 C;
        public final /* synthetic */ AbstractC0584Cu0 D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1269Jh0 interfaceC1269Jh0, AbstractC0584Cu0 abstractC0584Cu0) {
            super(1);
            this.C = interfaceC1269Jh0;
            this.D = abstractC0584Cu0;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            G10.g(aVar, "$this$layout");
            long j = ((D00) C0677Dp0.this.c().invoke(this.C)).j();
            if (C0677Dp0.this.d()) {
                AbstractC0584Cu0.a.p(aVar, this.D, D00.f(j), D00.g(j), 0.0f, null, 12, null);
            } else {
                AbstractC0584Cu0.a.r(aVar, this.D, D00.f(j), D00.g(j), 0.0f, null, 12, null);
            }
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677Dp0(NQ nq, boolean z, NQ nq2) {
        super(nq2);
        G10.g(nq, "offset");
        G10.g(nq2, "inspectorInfo");
        this.C = nq;
        this.D = z;
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
        return AbstractC1165Ih0.b(interfaceC1269Jh0, abstractC0584Cu0G.q0(), abstractC0584Cu0G.l0(), null, new a(interfaceC1269Jh0, abstractC0584Cu0G), 4, null);
    }

    public final NQ c() {
        return this.C;
    }

    public final boolean d() {
        return this.D;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        C0677Dp0 c0677Dp0 = obj instanceof C0677Dp0 ? (C0677Dp0) obj : null;
        return c0677Dp0 != null && G10.c(this.C, c0677Dp0.C) && this.D == c0677Dp0.D;
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
        return (this.C.hashCode() * 31) + AbstractC8813ug.a(this.D);
    }

    public String toString() {
        return "OffsetPxModifier(offset=" + this.C + ", rtlAware=" + this.D + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
