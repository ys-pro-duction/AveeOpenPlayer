package com.daaw;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.wm2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9411wm2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;

    public C9411wm2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C9132vm2 zzb() {
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.a.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        PS2 ps22 = AbstractC9322wT1.b;
        AbstractC7000o83.b(ps22);
        return new C9132vm2(scheduledExecutorService, ps2, ps22, ((C2144Rm2) this.d).zzb(), C4469f83.a(this.e));
    }
}
