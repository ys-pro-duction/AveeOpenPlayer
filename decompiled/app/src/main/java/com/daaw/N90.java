package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class N90 extends AbstractC6399m00 implements InterfaceC2272Ss0 {
    public final float C;
    public final boolean D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N90(float f, boolean z, NQ nq) {
        super(nq);
        G10.g(nq, "inspectorInfo");
        this.C = f;
        this.D = z;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.InterfaceC2272Ss0
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public C6489mK0 L(InterfaceC4988gz interfaceC4988gz, Object obj) {
        G10.g(interfaceC4988gz, "<this>");
        C6489mK0 c6489mK0 = obj instanceof C6489mK0 ? (C6489mK0) obj : null;
        if (c6489mK0 == null) {
            c6489mK0 = new C6489mK0(0.0f, false, null, 7, null);
        }
        c6489mK0.f(this.C);
        c6489mK0.e(this.D);
        return c6489mK0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        N90 n90 = obj instanceof N90 ? (N90) obj : null;
        return n90 != null && this.C == n90.C && this.D == n90.D;
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
        return (Float.floatToIntBits(this.C) * 31) + AbstractC8813ug.a(this.D);
    }

    public String toString() {
        return "LayoutWeightImpl(weight=" + this.C + ", fill=" + this.D + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }
}
