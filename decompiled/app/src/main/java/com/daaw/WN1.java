package com.daaw;

import com.google.android.gms.ads.nativead.NativeCustomFormatAd;

/* JADX INFO: loaded from: classes3.dex */
public final class WN1 {
    public final NativeCustomFormatAd.OnCustomFormatAdLoadedListener a;
    public final NativeCustomFormatAd.OnCustomClickListener b;
    public NativeCustomFormatAd c;

    public WN1(NativeCustomFormatAd.OnCustomFormatAdLoadedListener onCustomFormatAdLoadedListener, NativeCustomFormatAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomFormatAdLoadedListener;
        this.b = onCustomClickListener;
    }

    public final InterfaceC3112aH1 a() {
        SN1 sn1 = null;
        if (this.b == null) {
            return null;
        }
        return new TN1(this, sn1);
    }

    public final InterfaceC3948dH1 b() {
        return new VN1(this, null);
    }

    public final synchronized NativeCustomFormatAd f(QG1 qg1) {
        NativeCustomFormatAd nativeCustomFormatAd = this.c;
        if (nativeCustomFormatAd != null) {
            return nativeCustomFormatAd;
        }
        XN1 xn1 = new XN1(qg1);
        this.c = xn1;
        return xn1;
    }
}
