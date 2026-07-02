package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class YM extends UM implements K81 {
    public final UM E;
    public final I80 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YM(UM um, I80 i80) {
        super(um.V0(), um.W0());
        G10.g(um, "origin");
        G10.g(i80, "enhancement");
        this.E = um;
        this.F = i80;
    }

    @Override // com.daaw.K81
    public I80 F() {
        return this.F;
    }

    @Override // com.daaw.AbstractC5708ja1
    public AbstractC5708ja1 R0(boolean z) {
        return L81.d(F0().R0(z), F().Q0().R0(z));
    }

    @Override // com.daaw.AbstractC5708ja1
    public AbstractC5708ja1 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return L81.d(F0().T0(c8387t71), F());
    }

    @Override // com.daaw.UM
    public YS0 U0() {
        return F0().U0();
    }

    @Override // com.daaw.UM
    public String X0(AbstractC2923Yz abstractC2923Yz, InterfaceC5043hA interfaceC5043hA) {
        G10.g(abstractC2923Yz, "renderer");
        G10.g(interfaceC5043hA, "options");
        return interfaceC5043hA.g() ? abstractC2923Yz.U(F()) : F0().X0(abstractC2923Yz, interfaceC5043hA);
    }

    @Override // com.daaw.K81
    /* JADX INFO: renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public UM F0() {
        return this.E;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public YM X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        I80 i80A = q80.a(F0());
        G10.e(i80A, "null cannot be cast to non-null type org.jetbrains.kotlin.types.FlexibleType");
        return new YM((UM) i80A, q80.a(F()));
    }

    @Override // com.daaw.UM
    public String toString() {
        return "[@EnhancedForWarnings(" + F() + ")] " + F0();
    }
}
