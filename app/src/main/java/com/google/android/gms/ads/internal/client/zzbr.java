package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC7934rX;
import com.daaw.SL1;

/* JADX INFO: loaded from: classes.dex */
public final class zzbr extends AbstractC6395lz1 implements IInterface {
    public zzbr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
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
