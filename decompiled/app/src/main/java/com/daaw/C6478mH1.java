package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.mH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6478mH1 extends AbstractC6395lz1 implements InterfaceC7036oH1 {
    public C6478mH1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    @Override // com.daaw.InterfaceC7036oH1
    public final void v2(InterfaceC9553xH1 interfaceC9553xH1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC9553xH1);
        I(1, parcelB);
    }
}
