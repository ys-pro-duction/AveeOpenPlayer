package com.daaw;

import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzm;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzbrn;

/* JADX INFO: renamed from: com.daaw.vN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC9019vN1 implements Runnable {
    public final /* synthetic */ AdOverlayInfoParcel B;
    public final /* synthetic */ zzbrn C;

    public RunnableC9019vN1(zzbrn zzbrnVar, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.C = zzbrnVar;
        this.B = adOverlayInfoParcel;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzt.zzi();
        zzm.zza(this.C.a, this.B, true);
    }
}
