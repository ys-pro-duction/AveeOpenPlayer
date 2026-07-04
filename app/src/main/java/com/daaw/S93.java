package com.daaw;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public final class S93 implements Runnable {
    public final /* synthetic */ AtomicReference B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ Oa3 F;

    public S93(Oa3 oa3, AtomicReference atomicReference, String str, String str2, String str3, boolean z) {
        this.F = oa3;
        this.B = atomicReference;
        this.C = str2;
        this.D = str3;
        this.E = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.F.a.L().W(this.B, null, this.C, this.D, this.E);
    }
}
