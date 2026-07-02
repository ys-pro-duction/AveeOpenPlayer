package com.daaw;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.ko2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6058ko2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;

    public C6058ko2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
    }

    @Override // com.daaw.InterfaceC8394t83
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C2358Tn2 zzb() {
        return new C2358Tn2(((LX1) this.a).a(), (ScheduledExecutorService) this.b.zzb());
    }
}
