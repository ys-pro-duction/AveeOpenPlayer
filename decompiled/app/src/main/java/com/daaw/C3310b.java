package com.daaw;

/* JADX INFO: renamed from: com.daaw.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3310b extends AbstractC2711Wy {
    public final YS0 C;
    public final YS0 D;

    public C3310b(YS0 ys0, YS0 ys02) {
        G10.g(ys0, "delegate");
        G10.g(ys02, "abbreviation");
        this.C = ys0;
        this.D = ys02;
    }

    public final YS0 S() {
        return W0();
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return new C3310b(W0().T0(c8387t71), this.D);
    }

    @Override // com.daaw.AbstractC2711Wy
    public YS0 W0() {
        return this.C;
    }

    public final YS0 Z0() {
        return this.D;
    }

    @Override // com.daaw.YS0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C3310b R0(boolean z) {
        return new C3310b(W0().R0(z), this.D.R0(z));
    }

    @Override // com.daaw.AbstractC2711Wy
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C3310b X0(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        I80 i80A = q80.a(W0());
        G10.e(i80A, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        I80 i80A2 = q80.a(this.D);
        G10.e(i80A2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new C3310b((YS0) i80A, (YS0) i80A2);
    }

    @Override // com.daaw.AbstractC2711Wy
    /* JADX INFO: renamed from: c1, reason: merged with bridge method [inline-methods] */
    public C3310b Y0(YS0 ys0) {
        G10.g(ys0, "delegate");
        return new C3310b(ys0, this.D);
    }
}
