package com.daaw;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class UM extends AbstractC5708ja1 implements XM {
    public final YS0 C;
    public final YS0 D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UM(YS0 ys0, YS0 ys02) {
        super(null);
        G10.g(ys0, "lowerBound");
        G10.g(ys02, "upperBound");
        this.C = ys0;
        this.D = ys02;
    }

    @Override // com.daaw.I80
    public List L0() {
        return U0().L0();
    }

    @Override // com.daaw.I80
    public C8387t71 M0() {
        return U0().M0();
    }

    @Override // com.daaw.I80
    public C71 N0() {
        return U0().N0();
    }

    @Override // com.daaw.I80
    public boolean O0() {
        return U0().O0();
    }

    public abstract YS0 U0();

    public final YS0 V0() {
        return this.C;
    }

    public final YS0 W0() {
        return this.D;
    }

    public abstract String X0(AbstractC2923Yz abstractC2923Yz, InterfaceC5043hA interfaceC5043hA);

    @Override // com.daaw.I80
    public InterfaceC4346ej0 q() {
        return U0().q();
    }

    public String toString() {
        return AbstractC2923Yz.k.U(this);
    }
}
