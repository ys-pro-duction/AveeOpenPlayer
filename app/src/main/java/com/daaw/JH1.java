package com.daaw;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class JH1 extends AbstractBinderC8430tH1 {
    public final UnifiedNativeAd.UnconfirmedClickListener B;

    public JH1(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.B = unconfirmedClickListener;
    }

    @Override // com.daaw.InterfaceC8709uH1
    public final void e(String str) {
        this.B.onUnconfirmedClickReceived(str);
    }

    @Override // com.daaw.InterfaceC8709uH1
    public final void zze() {
        this.B.onUnconfirmedClickCancelled();
    }
}
