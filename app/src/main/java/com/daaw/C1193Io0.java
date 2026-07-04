package com.daaw;

/* JADX INFO: renamed from: com.daaw.Io0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1193Io0 extends AbstractC2711Wy implements InterfaceC1089Ho0 {
    public final YS0 C;

    public C1193Io0(YS0 ys0) {
        G10.g(ys0, "delegate");
        this.C = ys0;
    }

    @Override // com.daaw.AbstractC2711Wy, com.daaw.I80
    public boolean O0() {
        return false;
    }

    @Override // com.daaw.InterfaceC6377lv
    public I80 U(I80 i80) {
        G10.g(i80, "replacement");
        AbstractC5708ja1 abstractC5708ja1Q0 = i80.Q0();
        if (!H81.y(abstractC5708ja1Q0) && !D81.l(abstractC5708ja1Q0)) {
            return abstractC5708ja1Q0;
        }
        if (abstractC5708ja1Q0 instanceof YS0) {
            return Z0((YS0) abstractC5708ja1Q0);
        }
        if (abstractC5708ja1Q0 instanceof UM) {
            UM um = (UM) abstractC5708ja1Q0;
            return L81.d(M80.e(Z0(um.V0()), Z0(um.W0())), L81.a(abstractC5708ja1Q0));
        }
        throw new IllegalStateException(("Incorrect type: " + abstractC5708ja1Q0).toString());
    }

    @Override // com.daaw.AbstractC5708ja1
    /* JADX INFO: renamed from: U0 */
    public YS0 R0(boolean z) {
        return z ? W0().R0(true) : this;
    }

    @Override // com.daaw.AbstractC2711Wy
    public YS0 W0() {
        return this.C;
    }

    public final YS0 Z0(YS0 ys0) {
        YS0 ys0R0 = ys0.R0(false);
        return !H81.y(ys0) ? ys0R0 : new C1193Io0(ys0R0);
    }

    @Override // com.daaw.YS0
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public C1193Io0 T0(C8387t71 c8387t71) {
        G10.g(c8387t71, "newAttributes");
        return new C1193Io0(W0().T0(c8387t71));
    }

    @Override // com.daaw.AbstractC2711Wy
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public C1193Io0 Y0(YS0 ys0) {
        G10.g(ys0, "delegate");
        return new C1193Io0(ys0);
    }

    @Override // com.daaw.InterfaceC6377lv
    public boolean y0() {
        return true;
    }
}
