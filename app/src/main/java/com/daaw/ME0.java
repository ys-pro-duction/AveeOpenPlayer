package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class ME0 implements InterfaceC6537mW0, InterfaceC7058oN, IR {
    public final U30 B;
    public final /* synthetic */ InterfaceC6537mW0 C;

    public ME0(InterfaceC6537mW0 interfaceC6537mW0, U30 u30) {
        this.B = u30;
        this.C = interfaceC6537mW0;
    }

    @Override // com.daaw.HR0, com.daaw.InterfaceC7058oN
    public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        return this.C.a(interfaceC7337pN, interfaceC1416Ks);
    }

    @Override // com.daaw.IR
    public InterfaceC7058oN b(InterfaceC4684ft interfaceC4684ft, int i, EnumC5182hh enumC5182hh) {
        return AbstractC7095oW0.d(this, interfaceC4684ft, i, enumC5182hh);
    }

    @Override // com.daaw.InterfaceC6537mW0
    public Object getValue() {
        return this.C.getValue();
    }
}
