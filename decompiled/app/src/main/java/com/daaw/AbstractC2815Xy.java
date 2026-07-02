package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2815Xy extends AbstractC2711Wy {
    public final YS0 C;

    public AbstractC2815Xy(YS0 ys0) {
        G10.g(ys0, "delegate");
        this.C = ys0;
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: U0 */
    public YS0 R0(boolean z) {
        return z == O0() ? this : W0().R0(z).T0(M0());
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: V0 */
    public YS0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return c8387t71 != M0() ? new C3438bT0(this, c8387t71) : this;
    }

    @Override // com.daaw.AbstractC2711Wy
    public YS0 W0() {
        return this.C;
    }
}
