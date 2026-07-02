package com.daaw;

/* JADX INFO: renamed from: com.daaw.sw2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8336sw2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C8336sw2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = (InterfaceFutureC8236sc0) this.a.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C6942nw2(interfaceFutureC8236sc0, ps2);
    }
}
