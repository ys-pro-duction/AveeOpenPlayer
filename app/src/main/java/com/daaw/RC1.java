package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener;

/* JADX INFO: loaded from: classes.dex */
public final class RC1 implements CustomEventInterstitialListener {
    public final CustomEventAdapter a;
    public final MediationInterstitialListener b;
    public final /* synthetic */ CustomEventAdapter c;

    public RC1(CustomEventAdapter customEventAdapter, CustomEventAdapter customEventAdapter2, MediationInterstitialListener mediationInterstitialListener) {
        this.c = customEventAdapter;
        this.a = customEventAdapter2;
        this.b = mediationInterstitialListener;
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClicked() {
        AbstractC4274eT1.zze("Custom event adapter called onAdClicked.");
        this.b.onAdClicked(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdClosed() {
        AbstractC4274eT1.zze("Custom event adapter called onAdClosed.");
        this.b.onAdClosed(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(int i) {
        AbstractC4274eT1.zze("Custom event adapter called onFailedToReceiveAd.");
        this.b.onAdFailedToLoad(this.a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        AbstractC4274eT1.zze("Custom event adapter called onAdLeftApplication.");
        this.b.onAdLeftApplication(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventInterstitialListener
    public final void onAdLoaded() {
        AbstractC4274eT1.zze("Custom event adapter called onReceivedAd.");
        this.b.onAdLoaded(this.c);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        AbstractC4274eT1.zze("Custom event adapter called onAdOpened.");
        this.b.onAdOpened(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        AbstractC4274eT1.zze("Custom event adapter called onFailedToReceiveAd.");
        this.b.onAdFailedToLoad(this.a, adError);
    }
}
