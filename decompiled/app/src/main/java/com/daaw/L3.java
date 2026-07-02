package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class L3 extends AbstractC6399m00 implements C90 {
    public final I3 C;
    public final float D;
    public final float E;

    public /* synthetic */ L3(I3 i3, float f, float f2, NQ nq, AbstractC2911Yw abstractC2911Yw) {
        this(i3, f, f2, nq);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.C90
    public InterfaceC1061Hh0 b(InterfaceC1269Jh0 interfaceC1269Jh0, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        G10.g(interfaceC1269Jh0, "$this$measure");
        G10.g(interfaceC0645Dh0, "measurable");
        return J3.c(interfaceC1269Jh0, this.C, this.D, this.E, interfaceC0645Dh0, j);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        L3 l3 = obj instanceof L3 ? (L3) obj : null;
        return l3 != null && G10.c(this.C, l3.C) && C6460mD.n(this.D, l3.D) && C6460mD.n(this.E, l3.E);
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
        return (((this.C.hashCode() * 31) + C6460mD.o(this.D)) * 31) + C6460mD.o(this.E);
    }

    public String toString() {
        return "AlignmentLineOffset(alignmentLine=" + this.C + ", before=" + ((Object) C6460mD.p(this.D)) + ", after=" + ((Object) C6460mD.p(this.E)) + ')';
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    public L3(I3 i3, float f, float f2, NQ nq) {
        super(nq);
        this.C = i3;
        this.D = f;
        this.E = f2;
        if ((f < 0.0f && !C6460mD.n(f, C6460mD.C.b())) || (f2 < 0.0f && !C6460mD.n(f2, C6460mD.C.b()))) {
            throw new IllegalArgumentException("Padding from alignment line must be a non-negative number");
        }
    }
}
