package com.daaw;

import android.app.Application;

/* JADX INFO: renamed from: com.daaw.pm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7453pm3 implements InterfaceC2850Yg2 {
    public final InterfaceC1483Li2 a;
    public final InterfaceC1483Li2 b;
    public final InterfaceC1483Li2 c;

    public C7453pm3(InterfaceC1483Li2 interfaceC1483Li2, InterfaceC1483Li2 interfaceC1483Li22, InterfaceC1483Li2 interfaceC1483Li23) {
        this.a = interfaceC1483Li2;
        this.b = interfaceC1483Li22;
        this.c = interfaceC1483Li23;
    }

    @Override // com.daaw.InterfaceC1483Li2
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C10224zh3 zzb() {
        return new C10224zh3((Application) this.a.zzb(), ((HC1) this.b).zzb(), (C0814Ex1) this.c.zzb());
    }
}
