package com.daaw;

import com.google.ads.mediation.AbstractAdViewAdapter;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.mediation.MediationBannerListener;

/* JADX INFO: loaded from: classes.dex */
public final class KC1 extends AdListener implements AppEventListener, zza {
    public final AbstractAdViewAdapter B;
    public final MediationBannerListener C;

    public KC1(AbstractAdViewAdapter abstractAdViewAdapter, MediationBannerListener mediationBannerListener) {
        this.B = abstractAdViewAdapter;
        this.C = mediationBannerListener;
    }

    @Override // com.google.android.gms.ads.AdListener, com.google.android.gms.ads.internal.client.zza
    public final void onAdClicked() {
        this.C.onAdClicked(this.B);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClosed() {
        this.C.onAdClosed(this.B);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.C.onAdFailedToLoad(this.B, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.C.onAdLoaded(this.B);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdOpened() {
        this.C.onAdOpened(this.B);
    }

    @Override // com.google.android.gms.ads.admanager.AppEventListener
    public final void onAppEvent(String str, String str2) {
        this.C.zzd(this.B, str, str2);
    }
}
