package com.daaw;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class IH1 extends AbstractBinderC6757nH1 {
    public final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener B;

    public IH1(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.B = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.daaw.InterfaceC7036oH1
    public final void v2(InterfaceC9553xH1 interfaceC9553xH1) {
        this.B.onUnifiedNativeAdLoaded(new C9832yH1(interfaceC9553xH1));
    }
}
