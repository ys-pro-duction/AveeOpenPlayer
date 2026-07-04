package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.ads.internal.client.zzdx;
import com.google.android.gms.ads.internal.client.zzfd;
import com.google.android.gms.ads.internal.client.zzfe;
import com.google.android.gms.ads.internal.client.zzp;
import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.ServerSideVerificationOptions;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;
import com.google.android.gms.internal.ads.zzbxd;

/* JADX INFO: loaded from: classes3.dex */
public final class QQ1 extends RewardedInterstitialAd {
    public final String a;
    public final InterfaceC8187sQ1 b;
    public final Context c;
    public final OQ1 d = new OQ1();
    public FullScreenContentCallback e;
    public OnAdMetadataChangedListener f;
    public OnPaidEventListener g;

    public QQ1(Context context, String str) {
        this.a = str;
        this.c = context.getApplicationContext();
        this.b = zzay.zza().zzq(context, str, new PL1());
    }

    public final void a(zzdx zzdxVar, RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback) {
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                interfaceC8187sQ1.zzg(zzp.zza.zza(this.c, zzdxVar), new PQ1(rewardedInterstitialAdLoadCallback, this));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final Bundle getAdMetadata() {
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                return interfaceC8187sQ1.zzb();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final String getAdUnitId() {
        return this.a;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.e;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnAdMetadataChangedListener getOnAdMetadataChangedListener() {
        return this.f;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.g;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final ResponseInfo getResponseInfo() {
        zzdn zzdnVarZzc = null;
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                zzdnVarZzc = interfaceC8187sQ1.zzc();
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        return ResponseInfo.zzb(zzdnVarZzc);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final RewardItem getRewardItem() {
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            InterfaceC7351pQ1 interfaceC7351pQ1Zzd = interfaceC8187sQ1 != null ? interfaceC8187sQ1.zzd() : null;
            if (interfaceC7351pQ1Zzd != null) {
                return new CQ1(interfaceC7351pQ1Zzd);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
        return RewardItem.DEFAULT_REWARD;
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setFullScreenContentCallback(FullScreenContentCallback fullScreenContentCallback) {
        this.e = fullScreenContentCallback;
        this.d.Z2(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setImmersiveMode(boolean z) {
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                interfaceC8187sQ1.zzh(z);
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnAdMetadataChangedListener(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f = onAdMetadataChangedListener;
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                interfaceC8187sQ1.zzi(new zzfd(onAdMetadataChangedListener));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        this.g = onPaidEventListener;
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                interfaceC8187sQ1.zzj(new zzfe(onPaidEventListener));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void setServerSideVerificationOptions(ServerSideVerificationOptions serverSideVerificationOptions) {
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                interfaceC8187sQ1.zzl(new zzbxd(serverSideVerificationOptions));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }

    @Override // com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAd
    public final void show(Activity activity, OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.d.a3(onUserEarnedRewardListener);
        try {
            InterfaceC8187sQ1 interfaceC8187sQ1 = this.b;
            if (interfaceC8187sQ1 != null) {
                interfaceC8187sQ1.zzk(this.d);
                this.b.zzm(BinderC7744qp0.Z2(activity));
            }
        } catch (RemoteException e) {
            AbstractC4274eT1.zzl("#007 Could not call remote method.", e);
        }
    }
}
