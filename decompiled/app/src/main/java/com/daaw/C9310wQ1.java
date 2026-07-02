package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.wQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9310wQ1 extends AbstractC6395lz1 implements IInterface {
    public C9310wQ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCreator");
    }

    public final IBinder zze(InterfaceC7934rX interfaceC7934rX, String str, SL1 sl1, int i) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        Parcel parcelG = G(1, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        parcelG.recycle();
        return strongBinder;
    }
}
