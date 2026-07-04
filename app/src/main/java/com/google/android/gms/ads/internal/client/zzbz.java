package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzbz extends AbstractC6395lz1 implements zzcb {
    public zzbz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzcb
    public final void zzc(String str, String str2) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        parcelB.writeString(str2);
        I(1, parcelB);
    }
}
