package com.daaw;

import com.google.android.gms.ads.nativead.NativeAd;

/* JADX INFO: loaded from: classes3.dex */
public final class ZN1 extends AbstractBinderC8430tH1 {
    public final NativeAd.UnconfirmedClickListener B;

    public ZN1(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
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
