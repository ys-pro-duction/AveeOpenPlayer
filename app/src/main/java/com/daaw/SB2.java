package com.daaw;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class SB2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;

    public SB2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
        this.g = interfaceC8394t837;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        OS1 os1 = (OS1) this.a.zzb();
        boolean zBooleanValue = ((GB2) this.b).zzb().booleanValue();
        boolean zBooleanValue2 = ((HB2) this.c).zzb().booleanValue();
        C4838gS1 c4838gS1 = new C4838gS1();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new QB2(os1, zBooleanValue, zBooleanValue2, c4838gS1, ps2, ((C10088zB2) this.f).a(), (ScheduledExecutorService) this.g.zzb());
    }
}
