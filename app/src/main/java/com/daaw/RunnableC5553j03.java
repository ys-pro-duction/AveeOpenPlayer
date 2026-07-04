package com.daaw;

import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: renamed from: com.daaw.j03, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC5553j03 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ K43 C;

    public RunnableC5553j03(K43 k43, zzq zzqVar) {
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
        C3633c83 c3633c83C = C3633c83.c(zzqVar.W, 100);
        C3633c83 c3633c83C0 = c8812uf3.c0(zzqVar.B);
        c8812uf3.w().s().c("Setting consent, package, consent", zzqVar.B, c3633c83C);
        c8812uf3.A(zzqVar.B, c3633c83C);
        if (c3633c83C.m(c3633c83C0)) {
            c8812uf3.s(zzqVar);
        }
    }
}
