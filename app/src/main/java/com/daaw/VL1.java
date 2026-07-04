package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class VL1 extends AbstractC6211lK1 implements InterfaceC4818gN1 {
    public VL1(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // com.daaw.InterfaceC4818gN1
    public final Bundle y(Bundle bundle) {
        Parcel parcelB = B();
        AbstractC7888rL1.d(parcelB, bundle);
        Parcel parcelG = G(1, parcelB);
        Bundle bundle2 = (Bundle) AbstractC7888rL1.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle2;
    }
}
