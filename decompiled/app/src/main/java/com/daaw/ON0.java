package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public class ON0 extends AbstractC9472x implements InterfaceC8320st {
    public final InterfaceC1416Ks E;

    public ON0(InterfaceC4684ft interfaceC4684ft, InterfaceC1416Ks interfaceC1416Ks) {
        super(interfaceC4684ft, true, true);
        this.E = interfaceC1416Ks;
    }

    @Override // com.daaw.AbstractC9472x
    public void R0(Object obj) {
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        interfaceC1416Ks.x(AbstractC2459Un.a(obj, interfaceC1416Ks));
    }

    @Override // com.daaw.C3889d40
    public final boolean f0() {
        return true;
    }

    @Override // com.daaw.InterfaceC8320st
    public final InterfaceC8320st h() {
        InterfaceC1416Ks interfaceC1416Ks = this.E;
        if (interfaceC1416Ks instanceof InterfaceC8320st) {
            return (InterfaceC8320st) interfaceC1416Ks;
        }
        return null;
    }

    @Override // com.daaw.C3889d40
    public void q(Object obj) {
        AbstractC6456mC.c(H10.b(this.E), AbstractC2459Un.a(obj, this.E), null, 2, null);
    }
}
