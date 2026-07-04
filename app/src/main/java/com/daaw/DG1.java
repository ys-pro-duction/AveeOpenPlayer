package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class DG1 extends AbstractC6395lz1 implements JG1 {
    public DG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegateCreator");
    }

    @Override // com.daaw.JG1
    public final IBinder Y(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX2);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX3);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        parcelG.recycle();
        return strongBinder;
    }
}
