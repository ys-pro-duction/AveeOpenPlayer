package com.daaw;

/* JADX INFO: renamed from: com.daaw.cT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3716cT0 extends AbstractC2711Wy implements K81 {
    public final YS0 C;
    public final I80 D;

    public C3716cT0(YS0 ys0, I80 i80) {
        G10.g(ys0, "delegate");
        G10.g(i80, "enhancement");
        this.C = ys0;
        this.D = i80;
    }

    @Override // com.daaw.K81
    public I80 F() {
        return this.D;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: U0 */
    public YS0 R0(boolean z) {
        AbstractC5708ja1 abstractC5708ja1D = L81.d(F0().R0(z), F().Q0().R0(z));
        G10.e(abstractC5708ja1D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (YS0) abstractC5708ja1D;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        AbstractC5708ja1 abstractC5708ja1D = L81.d(F0().T0(c8387t71), F());
        G10.e(abstractC5708ja1D, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return (YS0) abstractC5708ja1D;
    }

    @Override // com.daaw.AbstractC2711Wy
    public YS0 W0() {
        return this.C;
    }

    @Override // com.daaw.K81
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public YS0 F0() {
        return W0();
    }

    @Override // com.daaw.AbstractC2711Wy
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C3716cT0 X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        I80 i80A = q80.a(W0());
        G10.e(i80A, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C3716cT0((YS0) i80A, q80.a(F()));
    }

    @Override // com.daaw.AbstractC2711Wy
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C3716cT0 Y0(YS0 ys0) {
        G10.g(ys0, "delegate");
        return new C3716cT0(ys0, F());
    }

    @Override // com.daaw.YS0
    public String toString() {
        return "[@EnhancedForWarnings(" + F() + ")] " + F0();
    }
}
