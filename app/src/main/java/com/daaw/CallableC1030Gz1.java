package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.Gz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC1030Gz1 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ InterfaceC9807yB0 b;
    public final /* synthetic */ com.android.billingclient.api.b c;

    public CallableC1030Gz1(com.android.billingclient.api.b bVar, String str, InterfaceC9807yB0 interfaceC9807yB0) {
        this.a = str;
        this.b = interfaceC9807yB0;
        this.c = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        C8458tO1 c8458tO1G0 = com.android.billingclient.api.b.g0(this.c, this.a);
        this.b.c(c8458tO1G0.a(), c8458tO1G0.b());
        return null;
    }
}
