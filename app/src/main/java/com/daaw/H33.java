package com.daaw;

import com.google.android.gms.measurement.internal.zzq;

/* JADX INFO: loaded from: classes3.dex */
public final class H33 implements Runnable {
    public final /* synthetic */ zzq B;
    public final /* synthetic */ K43 C;

    public H33(K43 k43, zzq zzqVar) {
        this.C = k43;
        this.B = zzqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.C.B.b();
        this.C.B.m(this.B);
    }
}
