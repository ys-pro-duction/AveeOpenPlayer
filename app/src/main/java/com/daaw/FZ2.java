package com.daaw;

import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class FZ2 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ K43 C;

    public FZ2(K43 k43, zzq zzqVar) {
        this.C = k43;
        this.B = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.B.b();
        C8812uf3 c8812uf3 = this.C.B;
        zzq zzqVar = this.B;
        c8812uf3.x().d();
        c8812uf3.c();
        AbstractC7506py0.f(zzqVar.B);
        c8812uf3.S(zzqVar);
    }
}
