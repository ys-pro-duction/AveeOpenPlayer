package com.daaw;

import com.google.android.gms.ads.formats.NativeCustomTemplateAd;

/* JADX INFO: loaded from: classes3.dex */
public final class FH1 {
    public final NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener a;
    public final NativeCustomTemplateAd.OnCustomClickListener b;
    public NativeCustomTemplateAd c;

    public FH1(NativeCustomTemplateAd.OnCustomTemplateAdLoadedListener onCustomTemplateAdLoadedListener, NativeCustomTemplateAd.OnCustomClickListener onCustomClickListener) {
        this.a = onCustomTemplateAdLoadedListener;
        this.b = onCustomClickListener;
    }

    public final InterfaceC3112aH1 d() {
        BH1 bh1 = null;
        if (this.b == null) {
            return null;
        }
        return new CH1(this, bh1);
    }

    public final InterfaceC3948dH1 e() {
        return new EH1(this, null);
    }

    public final synchronized NativeCustomTemplateAd f(QG1 qg1) {
        NativeCustomTemplateAd nativeCustomTemplateAd = this.c;
        if (nativeCustomTemplateAd != null) {
            return nativeCustomTemplateAd;
        }
        RG1 rg1 = new RG1(qg1);
        this.c = rg1;
        return rg1;
    }
}
