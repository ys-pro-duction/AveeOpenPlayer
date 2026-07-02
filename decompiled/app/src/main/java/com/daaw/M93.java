package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class M93 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Oa3 E;

    public M93(Oa3 oa3, AtomicReference atomicReference, String str, String str2, String str3) {
        this.E = oa3;
        this.B = atomicReference;
        this.C = str2;
        this.D = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.E.a.L().U(this.B, null, this.C, this.D);
    }
}
