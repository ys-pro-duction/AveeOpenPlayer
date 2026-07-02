package com.daaw;

import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: renamed from: com.daaw.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5008h3 implements OnUserEarnedRewardListener {
    public final /* synthetic */ C5564j3 a;

    public /* synthetic */ C5008h3(C5564j3 c5564j3) {
        this.a = c5564j3;
    }

    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
    public final void onUserEarnedReward(RewardItem rewardItem) {
        this.a.t(rewardItem);
    }
}
