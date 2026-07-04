package com.daaw;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.as2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3279as2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;

    public C3279as2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2998Zr2 zzb() {
        AbstractC9212w32 abstractC9212w32 = (AbstractC9212w32) this.a.zzb();
        C0470Br2 c0470Br2Zzb = ((C0574Cr2) this.b).zzb();
        T62 t62 = (T62) this.c.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.d.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C2998Zr2(abstractC9212w32, c0470Br2Zzb, t62, scheduledExecutorService, ps2);
    }
}
