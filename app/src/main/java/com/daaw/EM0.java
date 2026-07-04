package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class EM0 extends C {
    public final InterfaceC3429bR B;

    public EM0(InterfaceC3429bR interfaceC3429bR) {
        this.B = interfaceC3429bR;
    }

    @Override // com.daaw.C
    public Object e(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        Object objInvoke = this.B.invoke(interfaceC7337pN, interfaceC1416Ks);
        return objInvoke == I10.c() ? objInvoke : G91.a;
    }
}
