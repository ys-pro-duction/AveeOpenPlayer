package com.daaw;

import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.appopen.AppOpenAd;

/* JADX INFO: renamed from: com.daaw.Bl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0446Bl2 extends AppOpenAd.AppOpenAdLoadCallback {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ BinderC1702Nl2 c;

    public C0446Bl2(BinderC1702Nl2 binderC1702Nl2, String str, String str2) {
        this.c = binderC1702Nl2;
        this.a = str;
        this.b = str2;
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.c.j3(BinderC1702Nl2.i3(loadAdError), this.b);
    }

    @Override // com.google.android.gms.ads.AdLoadCallback
    public final /* bridge */ /* synthetic */ void onAdLoaded(AppOpenAd appOpenAd) {
        String str = this.b;
        this.c.d3(this.a, appOpenAd, str);
    }
}
