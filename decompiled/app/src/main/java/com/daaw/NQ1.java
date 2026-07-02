package com.daaw;

import com.google.android.gms.ads.rewarded.RewardItem;

/* JADX INFO: loaded from: classes3.dex */
public final class NQ1 extends AbstractBinderC7072oQ1 {
    public final String B;
    public final int C;

    public NQ1(RewardItem rewardItem) {
        this(rewardItem != null ? rewardItem.getType() : "", rewardItem != null ? rewardItem.getAmount() : 1);
    }

    @Override // com.daaw.InterfaceC7351pQ1
    public final int zze() {
        return this.C;
    }

    @Override // com.daaw.InterfaceC7351pQ1
    public final String zzf() {
        return this.B;
    }

    public NQ1(String str, int i) {
        this.B = str;
        this.C = i;
    }
}
