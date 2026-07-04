package com.daaw;

/* JADX INFO: renamed from: com.daaw.bT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C3438bT0 extends AbstractC2815Xy {
    public final C8387t71 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3438bT0(YS0 ys0, C8387t71 c8387t71) {
        super(ys0);
        G10.g(ys0, "delegate");
        G10.g(c8387t71, "attributes");
        this.D = c8387t71;
    }

    @Override // com.daaw.AbstractC2711Wy, com.daaw.I80
    public C8387t71 M0() {
        return this.D;
    }

    @Override // com.daaw.AbstractC2711Wy
    /* JADX INFO: renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public C3438bT0 Y0(YS0 ys0) {
        G10.g(ys0, "delegate");
        return new C3438bT0(ys0, M0());
    }
}
