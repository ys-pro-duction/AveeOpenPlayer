package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class VR1 extends AbstractC6395lz1 implements XR1 {
    public VR1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.daaw.XR1
    public final void u0(String str, String str2, Bundle bundle) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        AbstractC6953nz1.d(parcelB, bundle);
        I(3, parcelB);
    }

    @Override // com.daaw.XR1
    public final void zzb(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(2, parcelB);
    }
}
