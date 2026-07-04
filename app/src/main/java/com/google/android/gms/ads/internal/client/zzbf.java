package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzbf extends AbstractC6395lz1 implements zzbh {
    public zzbf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzc() {
        I(6, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzd() {
        I(1, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zze(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(2, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzf(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(8, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzg() {
        I(7, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzh() {
        I(3, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzi() {
        I(4, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzj() {
        I(5, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzbh
    public final void zzk() {
        I(9, B());
    }
}
