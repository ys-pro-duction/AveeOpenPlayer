package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class M0 implements LQ {
    public final C9510x71 B;
    public final InterfaceC9515x81 C;
    public final InterfaceC3159aT0 D;
    public final InterfaceC3159aT0 E;

    public M0(C9510x71 c9510x71, InterfaceC9515x81 interfaceC9515x81, InterfaceC3159aT0 interfaceC3159aT0, InterfaceC3159aT0 interfaceC3159aT02) {
        this.B = c9510x71;
        this.C = interfaceC9515x81;
        this.D = interfaceC3159aT0;
        this.E = interfaceC3159aT02;
    }

    @Override // com.daaw.LQ
    public Object invoke() {
        return Boolean.valueOf(N0.y(this.B, this.C, this.D, this.E));
    }
}
