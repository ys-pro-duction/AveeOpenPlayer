package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class ZE1 extends AbstractC6395lz1 implements InterfaceC3383bF1 {
    public ZE1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.customrenderedad.client.IOnCustomRenderedAdLoadedListener");
    }

    @Override // com.daaw.InterfaceC3383bF1
    public final void O0(YE1 ye1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, ye1);
        I(1, parcelB);
    }
}
