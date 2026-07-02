package com.daaw;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: renamed from: com.daaw.Kl2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1391Kl2 extends AdListener {
    public final /* synthetic */ String B;
    public final /* synthetic */ BinderC1702Nl2 C;

    public C1391Kl2(BinderC1702Nl2 binderC1702Nl2, String str) {
        this.C = binderC1702Nl2;
        this.B = str;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.C.j3(BinderC1702Nl2.i3(loadAdError), this.B);
    }
}
