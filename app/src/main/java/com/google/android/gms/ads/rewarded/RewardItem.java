package com.google.android.gms.ads.rewarded;

import com.daaw.C0449Bm1;

/* JADX INFO: loaded from: classes.dex */
public interface RewardItem {
    public static final RewardItem DEFAULT_REWARD = new C0449Bm1();

    int getAmount();

    String getType();
}
