package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.bS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3435bS1 extends AbstractC6395lz1 implements InterfaceC3992dS1 {
    public C3435bS1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.daaw.InterfaceC3992dS1
    public final InterfaceC3156aS1 w(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        InterfaceC3156aS1 yr1;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(2, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            yr1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            yr1 = iInterfaceQueryLocalInterface instanceof InterfaceC3156aS1 ? (InterfaceC3156aS1) iInterfaceQueryLocalInterface : new YR1(strongBinder);
        }
        parcelG.recycle();
        return yr1;
    }
}
