package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

/* JADX INFO: renamed from: com.daaw.Hl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1079Hl2 extends InterstitialAdLoadCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BinderC1702Nl2 c;

    public C1079Hl2(BinderC1702Nl2 binderC1702Nl2, String str, String str2) {
        this.c = binderC1702Nl2;
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.c.j3(BinderC1702Nl2.i3(loadAdError), this.b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(InterstitialAd interstitialAd) {
        String str = this.b;
        this.c.d3(this.a, interstitialAd, str);
    }
}
