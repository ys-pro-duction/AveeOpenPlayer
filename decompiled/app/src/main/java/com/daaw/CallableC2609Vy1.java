package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Vy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC2609Vy1 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ InterfaceC3370bC0 b;
    public final /* synthetic */ com.android.billingclient.api.b c;

    public CallableC2609Vy1(com.android.billingclient.api.b bVar, String str, InterfaceC3370bC0 interfaceC3370bC0) {
        this.a = str;
        this.b = interfaceC3370bC0;
        this.c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        O72 o72M = com.android.billingclient.api.b.M(this.c, this.a, 9);
        if (o72M.b() != null) {
            this.b.a(o72M.a(), o72M.b());
            return null;
        }
        this.b.a(o72M.a(), AbstractC9714xr1.H());
        return null;
    }
}
