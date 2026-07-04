package com.daaw;

import android.content.Context;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.lA2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6172lA2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;
    public final InterfaceC8394t83 e;
    public final InterfaceC8394t83 f;
    public final InterfaceC8394t83 g;

    public C6172lA2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834, InterfaceC8394t83 interfaceC8394t835, InterfaceC8394t83 interfaceC8394t836, InterfaceC8394t83 interfaceC8394t837) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
        this.e = interfaceC8394t835;
        this.f = interfaceC8394t836;
        this.g = interfaceC8394t837;
    }

    public static C5602jA2 a(C5396iS1 c5396iS1, Context context, ScheduledExecutorService scheduledExecutorService, Executor executor, int i, boolean z, boolean z2) {
        return new C5602jA2(c5396iS1, context, scheduledExecutorService, executor, i, z, z2);
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        C5396iS1 c5396iS1 = new C5396iS1();
        Context contextA = ((LX1) this.b).a();
        ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) this.c.zzb();
        PS2 ps2 = AbstractC9322wT1.a;
        AbstractC7000o83.b(ps2);
        return new C5602jA2(c5396iS1, contextA, scheduledExecutorService, ps2, ((AB2) this.e).zzb().intValue(), ((BB2) this.f).zzb().booleanValue(), ((HB2) this.g).zzb().booleanValue());
    }
}
