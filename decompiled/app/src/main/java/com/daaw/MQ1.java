package com.daaw;

import android.os.RemoteException;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.mediation.MediationRewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
public final class MQ1 implements MediationRewardedAdCallback {
    public final InterfaceC3689cM1 a;

    public MQ1(InterfaceC3689cM1 interfaceC3689cM1) {
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onUserEarnedReward(RewardItem rewardItem) {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onUserEarnedReward.");
        try {
            this.a.B0(new NQ1(rewardItem));
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoComplete() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onVideoComplete.");
        try {
            this.a.zzu();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
    public final void onVideoStart() {
        AbstractC7506py0.e("#008 Must be called on the main UI thread.");
        AbstractC4274eT1.zze("Adapter called onVideoStart.");
        try {
            this.a.i();
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

    @Override // com.google.android.gms.ads.mediation.MediationRewardedAdCallback
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
}
