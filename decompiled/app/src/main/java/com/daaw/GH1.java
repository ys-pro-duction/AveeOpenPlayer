package com.daaw;

import com.google.android.gms.ads.admanager.AdManagerAdView;
import com.google.android.gms.ads.internal.client.zzbu;

/* JADX INFO: loaded from: classes3.dex */
public final class GH1 implements Runnable {
    public final /* synthetic */ AdManagerAdView B;
    public final /* synthetic */ zzbu C;
    public final /* synthetic */ HH1 D;

    public GH1(HH1 hh1, AdManagerAdView adManagerAdView, zzbu zzbuVar) {
        this.D = hh1;
        this.B = adManagerAdView;
        this.C = zzbuVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.B.zzb(this.C)) {
            AbstractC4274eT1.zzj("Could not bind.");
            return;
        }
        HH1 hh1 = this.D;
        hh1.B.onAdManagerAdViewLoaded(this.B);
    }
}
