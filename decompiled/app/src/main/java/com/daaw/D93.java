package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class D93 implements Runnable {
    public final /* synthetic */ long B;
    public final /* synthetic */ Oa3 C;

    public D93(Oa3 oa3, long j) {
        this.C = oa3;
        this.B = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.z(this.B, true);
        this.C.a.L().S(new AtomicReference());
    }
}
