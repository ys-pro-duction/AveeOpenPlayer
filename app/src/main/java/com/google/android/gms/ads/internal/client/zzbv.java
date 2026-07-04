package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC7934rX;
import com.daaw.SL1;

/* JADX INFO: loaded from: classes.dex */
public final class zzbv extends AbstractC6395lz1 implements IInterface {
    public zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder zze(InterfaceC7934rX interfaceC7934rX, zzq zzqVar, String str, SL1 sl1, int i, int i2) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzqVar);
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, sl1);
        parcelB.writeInt(233702000);
        parcelB.writeInt(i2);
        Parcel parcelG = G(2, parcelB);
        IBinder strongBinder = parcelG.readStrongBinder();
        parcelG.recycle();
        return strongBinder;
    }
}
