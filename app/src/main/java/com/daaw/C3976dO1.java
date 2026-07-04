package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.dO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3976dO1 extends AbstractC6395lz1 implements InterfaceC4543fO1 {
    public C3976dO1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.daaw.InterfaceC4543fO1
    public final InterfaceC3697cO1 w(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i) {
        InterfaceC3697cO1 c3140aO1;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c3140aO1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c3140aO1 = iInterfaceQueryLocalInterface instanceof InterfaceC3697cO1 ? (InterfaceC3697cO1) iInterfaceQueryLocalInterface : new C3140aO1(strongBinder);
        }
        parcelG.recycle();
        return c3140aO1;
    }
}
