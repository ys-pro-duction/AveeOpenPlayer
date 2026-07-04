package com.google.ads.mediation;

import com.daaw.F82;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;

/* JADX INFO: loaded from: classes.dex */
public final class a extends InterstitialAdLoadCallback {
    public final AbstractAdViewAdapter a;
    public final MediationInterstitialListener b;

    public a(AbstractAdViewAdapter abstractAdViewAdapter, MediationInterstitialListener mediationInterstitialListener) {
        this.a = abstractAdViewAdapter;
        this.b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.b.onAdFailedToLoad(this.a, loadAdError);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        AbstractAdViewAdapter abstractAdViewAdapter = this.a;
        InterstitialAd interstitialAd2 = interstitialAd;
        abstractAdViewAdapter.mInterstitialAd = interstitialAd2;
        interstitialAd2.setFullScreenContentCallback(new F82(abstractAdViewAdapter, this.b));
        this.b.onAdLoaded(this.a);
    }
}
