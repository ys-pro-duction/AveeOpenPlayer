package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationAppOpenAdCallback;
import com.google.android.gms.ads.mediation.MediationBannerAdCallback;
import com.google.android.gms.ads.mediation.MediationInterstitialAdCallback;
import com.google.android.gms.ads.mediation.MediationNativeAdCallback;

/* JADX INFO: renamed from: com.daaw.nM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6777nM1 implements MediationBannerAdCallback, MediationInterstitialAdCallback, MediationNativeAdCallback, MediationAppOpenAdCallback {
    public final InterfaceC3689cM1 a;

    public C6777nM1(InterfaceC3689cM1 interfaceC3689cM1) {
        this.a = interfaceC3689cM1;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdClosed() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdClosed.");
        try {
            this.a.zzf();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationAppOpenAdCallback
    public final void onAdFailedToShow(AdError adError) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToShow.");
        AbstractC4274eT1.zzj("Mediation ad failed to show: Error Code = " + adError.getCode() + ". Error Message = " + adError.getMessage() + " Error Domain = " + adError.getDomain());
        try {
            this.a.n1(adError.zza());
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdCallback, com.google.android.gms.ads.mediation.MediationInterstitialAdCallback, com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onAdLeftApplication() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdLeftApplication.");
        try {
            this.a.zzn();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void onAdOpened() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdOpened.");
        try {
            this.a.zzp();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoComplete() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onVideoComplete.");
        try {
            this.a.zzu();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPause() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onVideoPause.");
        try {
            this.a.d();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoPlay() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onVideoPlay.");
        try {
            this.a.zzx();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdClicked() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called reportAdClicked.");
        try {
            this.a.zze();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdCallback
    public final void reportAdImpression() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called reportAdImpression.");
        try {
            this.a.zzm();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdCallback
    public final void onAdFailedToShow(String str) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onAdFailedToShow.");
        AbstractC4274eT1.zzj("Mediation ad failed to show: ".concat(String.valueOf(str)));
        try {
            this.a.p(str);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoMute() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdCallback
    public final void onVideoUnmute() {
    }
}
