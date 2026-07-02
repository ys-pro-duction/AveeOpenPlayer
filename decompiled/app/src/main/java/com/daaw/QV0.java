package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class QV0 implements InterfaceC1416Ks, InterfaceC8320st {
    public final InterfaceC1416Ks B;
    public final InterfaceC4684ft C;

    public QV0(InterfaceC1416Ks interfaceC1416Ks, InterfaceC4684ft interfaceC4684ft) {
        this.B = interfaceC1416Ks;
        this.C = interfaceC4684ft;
    }

    @Override // com.daaw.InterfaceC1416Ks
    public InterfaceC4684ft getContext() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC8320st
    public InterfaceC8320st h() {
        InterfaceC1416Ks interfaceC1416Ks = this.B;
        if (interfaceC1416Ks instanceof InterfaceC8320st) {
            return (InterfaceC8320st) interfaceC1416Ks;
        }
        return null;
    }

    @Override // com.daaw.InterfaceC1416Ks
    public void x(Object obj) {
        this.B.x(obj);
    }
}
