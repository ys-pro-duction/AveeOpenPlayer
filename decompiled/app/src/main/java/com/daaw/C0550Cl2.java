package com.daaw;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: renamed from: com.daaw.Cl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0550Cl2 extends AdListener {
    public final /* synthetic */ String B;
    public final /* synthetic */ AdView C;
    public final /* synthetic */ String D;
    public final /* synthetic */ BinderC1702Nl2 E;

    public C0550Cl2(BinderC1702Nl2 binderC1702Nl2, String str, AdView adView, String str2) {
        this.E = binderC1702Nl2;
        this.B = str;
        this.C = adView;
        this.D = str2;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.E.j3(BinderC1702Nl2.i3(loadAdError), this.D);
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.E.d3(this.B, this.C, this.D);
    }
}
