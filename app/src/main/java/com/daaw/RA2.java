package com.daaw;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class RA2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;

    public RA2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
    }

    public static PA2 a(String str, KA1 ka1, OS1 os1, ScheduledExecutorService scheduledExecutorService, PS2 ps2) {
        return new PA2(str, ka1, os1, scheduledExecutorService, ps2);
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strA = ((C10088zB2) this.a).a();
        KA1 ka1 = new KA1();
        OS1 os1 = (OS1) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new PA2(strA, ka1, os1, scheduledExecutorService, ps2);
    }
}
