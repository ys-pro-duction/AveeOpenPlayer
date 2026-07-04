package com.daaw;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.gF1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4786gF1 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;
    public final InterfaceC8394t83 d;

    public C4786gF1(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833, InterfaceC8394t83 interfaceC8394t834) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
        this.d = interfaceC8394t834;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* synthetic */ Object zzb() {
        return new C4497fF1(((LX1) this.a).a(), (ScheduledExecutorService) this.b.zzb(), new C5065hF1(), (TI2) this.d.zzb());
    }
}
