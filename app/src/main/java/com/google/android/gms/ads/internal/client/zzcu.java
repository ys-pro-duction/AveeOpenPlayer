package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzcu extends AbstractC6395lz1 implements zzcw {
    public zzcu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zze() {
        Parcel parcelG = G(1, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcw
    public final String zzf() {
        Parcel parcelG = G(2, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }
}
