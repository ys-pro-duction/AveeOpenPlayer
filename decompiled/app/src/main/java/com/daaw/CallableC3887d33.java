package com.daaw;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.daaw.d33, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class CallableC3887d33 implements Callable {
    public final /* synthetic */ String a;
    public final /* synthetic */ K43 b;

    public CallableC3887d33(K43 k43, String str) {
        this.b = k43;
        this.a = str;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        this.b.B.b();
        return this.b.B.V().c0(this.a);
    }
}
