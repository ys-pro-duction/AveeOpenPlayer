package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class SG1 extends AbstractC6395lz1 implements UG1 {
    public SG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    @Override // com.daaw.UG1
    public final void C0(LG1 lg1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, lg1);
        I(1, parcelB);
    }
}
