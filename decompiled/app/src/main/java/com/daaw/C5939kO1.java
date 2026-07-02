package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.kO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5939kO1 extends AbstractC6395lz1 implements InterfaceC6506mO1 {
    public C5939kO1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlayCreator");
    }

    @Override // com.daaw.InterfaceC6506mO1
    public final IBinder zze(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        parcelG.recycle();
        return strongBinder;
    }
}
