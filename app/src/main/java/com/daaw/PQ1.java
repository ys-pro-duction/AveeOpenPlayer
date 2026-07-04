package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class PQ1 extends AbstractBinderC9868yQ1 {
    public final RewardedInterstitialAdLoadCallback B;
    public final QQ1 C;

    public PQ1(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, QQ1 qq1) {
        this.B = rewardedInterstitialAdLoadCallback;
        this.C = qq1;
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zzf(zze zzeVar) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.B;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zzg() {
        QQ1 qq1;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.B;
        if (rewardedInterstitialAdLoadCallback == null || (qq1 = this.C) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(qq1);
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zze(int i) {
    }
}
