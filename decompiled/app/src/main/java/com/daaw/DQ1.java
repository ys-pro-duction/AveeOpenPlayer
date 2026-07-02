package com.daaw;

import android.os.Handler;

/* JADX INFO: loaded from: classes3.dex */
public final class DQ1 implements InterfaceC2850Yg2 {
    public final InterfaceC1483Li2 a;
    public final InterfaceC1483Li2 b;
    public final InterfaceC1483Li2 c;

    public DQ1(InterfaceC1483Li2 interfaceC1483Li2, InterfaceC1483Li2 interfaceC1483Li22, InterfaceC1483Li2 interfaceC1483Li23) {
        this.a = interfaceC1483Li2;
        this.b = interfaceC1483Li22;
        this.c = interfaceC1483Li23;
    }

    @Override // com.daaw.InterfaceC1483Li2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3148aQ1 zzb() {
        C4834gR1 c4834gR1 = (C4834gR1) this.a.zzb();
        Handler handler = AbstractC5295i42.a;
        AbstractC4911gi2.a(handler);
        return new C3148aQ1(c4834gR1, handler, ((C9884yU1) this.c).zzb());
    }
}
