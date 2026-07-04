package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class VG1 extends AbstractC6395lz1 implements XG1 {
    public VG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    @Override // com.daaw.XG1
    public final void x0(NG1 ng1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, ng1);
        I(1, parcelB);
    }
}
