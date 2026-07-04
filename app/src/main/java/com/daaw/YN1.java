package com.daaw;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class YN1 extends AbstractBinderC6757nH1 {
    public final NativeAd.OnNativeAdLoadedListener B;

    public YN1(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.B = onNativeAdLoadedListener;
    }

    @Override // com.daaw.InterfaceC7036oH1
    public final void v2(InterfaceC9553xH1 interfaceC9553xH1) {
        this.B.onNativeAdLoaded(new RN1(interfaceC9553xH1));
    }
}
