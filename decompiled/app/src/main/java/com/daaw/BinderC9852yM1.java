package com.daaw;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* JADX INFO: renamed from: com.daaw.yM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class BinderC9852yM1 extends AbstractBinderC4246eM1 {
    public final MediationInterscrollerAd B;

    public BinderC9852yM1(MediationInterscrollerAd mediationInterscrollerAd) {
        this.B = mediationInterscrollerAd;
    }

    @Override // com.daaw.InterfaceC4525fM1
    public final InterfaceC7934rX zze() {
        return BinderC7744qp0.Z2(this.B.getView());
    }

    @Override // com.daaw.InterfaceC4525fM1
    public final boolean zzf() {
        return this.B.shouldDelegateInterscrollerEffect();
    }
}
