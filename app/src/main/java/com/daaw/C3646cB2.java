package com.daaw;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.cB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3646cB2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;

    public C3646cB2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837) {
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
        C5396iS1 c5396iS1 = new C5396iS1();
        int iIntValue = ((AB2) this.b).zzb().intValue();
        Context contextA = ((LX1) this.c).a();
        OS1 os1 = (OS1) this.d.zzb();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.e.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new VA2(c5396iS1, iIntValue, contextA, os1, scheduledExecutorService, ps2, ((C10088zB2) this.g).a());
    }
}
