package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.xG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9549xG1 extends AbstractC6395lz1 implements InterfaceC10107zG1 {
    public C9549xG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
    }

    @Override // com.daaw.InterfaceC10107zG1
    public final IBinder a1(InterfaceC7934rX interfaceC7934rX, InterfaceC7934rX interfaceC7934rX2, InterfaceC7934rX interfaceC7934rX3, int i) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX2);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX3);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        parcelG.recycle();
        return strongBinder;
    }
}
