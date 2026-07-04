package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class WS0 extends AbstractC1256Je {
    public final int C;
    public final int D;

    public WS0() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    @Override // com.daaw.InterfaceC3596c11
    public final void e(ET0 et0) {
        if (AbstractC6559mb1.l(this.C, this.D)) {
            et0.f(this.C, this.D);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.C + " and height: " + this.D + ", either provide dimensions in the constructor or call override()");
    }

    public WS0(int i, int i2) {
        this.C = i;
        this.D = i2;
    }
}
