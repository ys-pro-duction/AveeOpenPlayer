package com.daaw;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: com.daaw.xB2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9530xB2 implements InterfaceC4758g83 {
    public final InterfaceC8394t83 a;
    public final InterfaceC8394t83 b;
    public final InterfaceC8394t83 c;

    public C9530xB2(InterfaceC8394t83 interfaceC8394t83, InterfaceC8394t83 interfaceC8394t832, InterfaceC8394t83 interfaceC8394t833) {
        this.a = interfaceC8394t83;
        this.b = interfaceC8394t832;
        this.c = interfaceC8394t833;
    }

    @Override // com.daaw.InterfaceC8394t83
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new C8972vB2(new C6785nO1(), (ScheduledExecutorService) this.b.zzb(), ((LX1) this.c).a());
    }
}
