package com.daaw;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.iz2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5547iz2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;
    public final InterfaceC8394t83 h;
    public final InterfaceC8394t83 i;

    public C5547iz2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837, InterfaceC8394t83 interfaceC8394t838, InterfaceC8394t83 interfaceC8394t839) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
        this.g = interfaceC8394t837;
        this.h = interfaceC8394t838;
        this.i = interfaceC8394t839;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C4991gz2(ps2, (ScheduledExecutorService) this.b.zzb(), (String) this.c.zzb(), (C1530Lu2) this.d.zzb(), (Context) this.e.zzb(), ((I62) this.f).a(), (C1115Hu2) this.g.zzb(), (C8826ui2) this.h.zzb(), (C2450Uk2) this.i.zzb());
    }
}
