package com.daaw;

import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.wA1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC9246wA1 extends DA1 {
    public final AppOpenAd.AppOpenAdLoadCallback B;
    public final String C;

    public BinderC9246wA1(AppOpenAd.AppOpenAdLoadCallback appOpenAdLoadCallback, String str) {
        this.B = appOpenAdLoadCallback;
        this.C = str;
    }

    @Override // com.daaw.EA1
    public final void U1(zze zzeVar) {
        if (this.B != null) {
            this.B.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.EA1
    public final void b2(BA1 ba1) {
        if (this.B != null) {
            this.B.onAdLoaded(new C9525xA1(ba1, this.C));
        }
    }

    @Override // com.daaw.EA1
    public final void zzb(int i) {
    }
}
