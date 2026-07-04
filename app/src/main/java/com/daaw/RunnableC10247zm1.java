package com.daaw;

import com.google.android.gms.ads.internal.util.zzb;

/* JADX INFO: renamed from: com.daaw.zm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC10247zm1 implements Runnable {
    public final /* synthetic */ zzb B;

    public RunnableC10247zm1(zzb zzbVar) {
        this.B = zzbVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.B.b = Thread.currentThread();
        this.B.zza();
    }
}
