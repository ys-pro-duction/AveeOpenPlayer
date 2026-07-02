package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class WM extends UM implements InterfaceC6377lv {
    public static final a F = new a(null);
    public static boolean G;
    public boolean E;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WM(YS0 ys0, YS0 ys02) {
        super(ys0, ys02);
        G10.g(ys0, "lowerBound");
        G10.g(ys02, "upperBound");
    }

    @Override // com.daaw.AbstractC5708ja1
    public AbstractC5708ja1 R0(boolean z) {
        return M80.e(V0().R0(z), W0().R0(z));
    }

    @Override // com.daaw.AbstractC5708ja1
    public AbstractC5708ja1 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return M80.e(V0().T0(c8387t71), W0().T0(c8387t71));
    }

    @Override // com.daaw.InterfaceC6377lv
    public I80 U(I80 i80) {
        AbstractC5708ja1 abstractC5708ja1E;
        G10.g(i80, "replacement");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (abstractC5708ja1Q0 instanceof UM) {
            abstractC5708ja1E = abstractC5708ja1Q0;
        } else {
            if (!(abstractC5708ja1Q0 instanceof YS0)) {
                throw new C6902no0();
            }
            YS0 ys0 = (YS0) abstractC5708ja1Q0;
            abstractC5708ja1E = M80.e(ys0, ys0.R0(true));
        }
        return L81.b(abstractC5708ja1E, abstractC5708ja1Q0);
    }

    @Override // com.daaw.UM
    public YS0 U0() {
        Z0();
        return V0();
    }

    @Override // com.daaw.UM
    public String X0(AbstractC2923Yz abstractC2923Yz, InterfaceC5043hA interfaceC5043hA) {
        G10.g(abstractC2923Yz, "renderer");
        G10.g(interfaceC5043hA, "options");
        if (!interfaceC5043hA.o()) {
            return abstractC2923Yz.R(abstractC2923Yz.U(V0()), abstractC2923Yz.U(W0()), H81.n(this));
        }
        return '(' + abstractC2923Yz.U(V0()) + ".." + abstractC2923Yz.U(W0()) + ')';
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public UM X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        I80 i80A = q80.a(V0());
        G10.e(i80A, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        I80 i80A2 = q80.a(W0());
        G10.e(i80A2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new WM((YS0) i80A, (YS0) i80A2);
    }

    public final void Z0() {
        if (!G || this.E) {
            return;
        }
        this.E = true;
        ZM.b(V0());
        ZM.b(W0());
        G10.c(V0(), W0());
        J80.a.b(V0(), W0());
    }

    @Override // com.daaw.UM
    public String toString() {
        return '(' + V0() + ".." + W0() + ')';
    }

    @Override // com.daaw.InterfaceC6377lv
    public boolean y0() {
        return (V0().N0().c() instanceof Z71) && G10.c(V0().N0(), W0().N0());
    }
}
