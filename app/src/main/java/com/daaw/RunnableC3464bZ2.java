package com.daaw;

import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: renamed from: com.daaw.bZ2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3464bZ2 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ K43 C;

    public RunnableC3464bZ2(K43 k43, zzq zzqVar) {
        this.C = k43;
        this.B = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.B.b();
        this.C.B.s(this.B);
    }
}
