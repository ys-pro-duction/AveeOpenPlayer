package com.daaw;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* JADX INFO: loaded from: classes3.dex */
public final class KQ1 extends AbstractBinderC9868yQ1 {
    public final RewardedAdLoadCallback B;
    public final RewardedAd C;

    public KQ1(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.B = rewardedAdLoadCallback;
        this.C = rewardedAd;
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zzf(zze zzeVar) {
        if (this.B != null) {
            this.B.onAdFailedToLoad(zzeVar.zzb());
        }
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zzg() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.B;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.C);
        }
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zze(int i) {
    }
}
