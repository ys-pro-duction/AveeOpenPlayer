package com.daaw;

import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.k72, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5869k72 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;

    public C5869k72(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C3906d72 c3906d72Zzb = ((C4463f72) this.a).zzb();
        Set setZzb = ((C7836r83) this.b).zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C4184e72(c3906d72Zzb, setZzb, ps2, (ScheduledExecutorService) this.d.zzb());
    }
}
