package com.daaw;

import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: renamed from: com.daaw.r13, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC7801r13 implements Runnable {
    public final /* synthetic */ zzau B;
    public final /* synthetic */ String C;
    public final /* synthetic */ K43 D;

    public RunnableC7801r13(K43 k43, zzau zzauVar, String str) {
        this.D = k43;
        this.B = zzauVar;
        this.C = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.D.B.b();
        this.D.B.g(this.B, this.C);
    }
}
