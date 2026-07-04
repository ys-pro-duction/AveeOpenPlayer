package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class ZV0 extends AbstractC6719n81 {
    public final I80 a;

    public ZV0(AbstractC8670u80 abstractC8670u80) {
        G10.g(abstractC8670u80, "kotlinBuiltIns");
        YS0 ys0I = abstractC8670u80.I();
        G10.f(ys0I, "getNullableAnyType(...)");
        this.a = ys0I;
    }

    @Override // com.daaw.InterfaceC6440m81
    public InterfaceC6440m81 a(Q80 q80) {
        G10.g(q80, "kotlinTypeRefiner");
        return this;
    }

    @Override // com.daaw.InterfaceC6440m81
    public EnumC1042Hc1 b() {
        return EnumC1042Hc1.H;
    }

    @Override // com.daaw.InterfaceC6440m81
    public boolean c() {
        return true;
    }

    @Override // com.daaw.InterfaceC6440m81
    public I80 getType() {
        return this.a;
    }
}
