package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.RL1;
import com.daaw.SL1;

/* JADX INFO: loaded from: classes.dex */
public final class zzcj extends AbstractC6395lz1 implements zzcl {
    public zzcj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.ILiteSdkInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final SL1 getAdapterCreator() {
        Parcel parcelG = G(2, B());
        SL1 sl1Z2 = RL1.Z2(parcelG.readStrongBinder());
        parcelG.recycle();
        return sl1Z2;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcl
    public final zzen getLiteSdkVersion() {
        Parcel parcelG = G(1, B());
        zzen zzenVar = (zzen) AbstractC6953nz1.a(parcelG, zzen.CREATOR);
        parcelG.recycle();
        return zzenVar;
    }
}
