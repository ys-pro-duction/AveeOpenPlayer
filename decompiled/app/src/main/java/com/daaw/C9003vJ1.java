package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.vJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9003vJ1 extends AbstractC6395lz1 implements InterfaceC9561xJ1 {
    public C9003vJ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.daaw.InterfaceC9561xJ1
    public final InterfaceC8717uJ1 d1(InterfaceC7934rX interfaceC7934rX, SL1 sl1, int i, InterfaceC7880rJ1 interfaceC7880rJ1) {
        InterfaceC8717uJ1 c8159sJ1;
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        AbstractC6953nz1.f(parcelB, interfaceC7880rJ1);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        if (strongBinder == null) {
            c8159sJ1 = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            c8159sJ1 = iInterfaceQueryLocalInterface instanceof InterfaceC8717uJ1 ? (InterfaceC8717uJ1) iInterfaceQueryLocalInterface : new C8159sJ1(strongBinder);
        }
        parcelG.recycle();
        return c8159sJ1;
    }
}
