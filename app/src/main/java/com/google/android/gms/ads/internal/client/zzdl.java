package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zzdl extends AbstractC6395lz1 implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IResponseInfo");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final Bundle zze() {
        Parcel parcelG = G(5, B());
        Bundle bundle = (Bundle) AbstractC6953nz1.a(parcelG, Bundle.CREATOR);
        parcelG.recycle();
        return bundle;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final zzu zzf() {
        Parcel parcelG = G(4, B());
        zzu zzuVar = (zzu) AbstractC6953nz1.a(parcelG, zzu.CREATOR);
        parcelG.recycle();
        return zzuVar;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzg() {
        Parcel parcelG = G(1, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzh() {
        Parcel parcelG = G(6, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final String zzi() {
        Parcel parcelG = G(2, B());
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.ads.internal.client.zzdn
    public final List zzj() {
        Parcel parcelG = G(3, B());
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(zzu.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }
}
