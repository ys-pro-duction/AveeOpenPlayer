package com.daaw;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationNativeListener;
import com.google.android.gms.ads.mediation.UnifiedNativeAdMapper;
import com.google.android.gms.ads.mediation.customevent.CustomEventAdapter;
import com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener;

/* JADX INFO: renamed from: com.daaw.xS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9597xS1 implements CustomEventNativeListener {
    public final CustomEventAdapter a;
    public final MediationNativeListener b;

    public C9597xS1(CustomEventAdapter customEventAdapter, MediationNativeListener mediationNativeListener) {
        this.a = customEventAdapter;
        this.b = mediationNativeListener;
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
        AbstractC4274eT1.zze("Custom event adapter called onAdFailedToLoad.");
        this.b.onAdFailedToLoad(this.a, i);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdImpression() {
        AbstractC4274eT1.zze("Custom event adapter called onAdImpression.");
        this.b.onAdImpression(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdLeftApplication() {
        AbstractC4274eT1.zze("Custom event adapter called onAdLeftApplication.");
        this.b.onAdLeftApplication(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventNativeListener
    public final void onAdLoaded(UnifiedNativeAdMapper unifiedNativeAdMapper) {
        AbstractC4274eT1.zze("Custom event adapter called onAdLoaded.");
        this.b.onAdLoaded(this.a, unifiedNativeAdMapper);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdOpened() {
        AbstractC4274eT1.zze("Custom event adapter called onAdOpened.");
        this.b.onAdOpened(this.a);
    }

    @Override // com.google.android.gms.ads.mediation.customevent.CustomEventListener
    public final void onAdFailedToLoad(AdError adError) {
        AbstractC4274eT1.zze("Custom event adapter called onAdFailedToLoad.");
        this.b.onAdFailedToLoad(this.a, adError);
    }
}
