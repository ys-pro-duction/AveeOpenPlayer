package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzcg extends AbstractC6395lz1 implements zzci {
    public zzcg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzb() {
        I(5, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzc() {
        I(3, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzd(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(1, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zze() {
        I(4, B());
    }

    @Override // com.google.android.gms.ads.internal.client.zzci
    public final void zzf() {
        I(2, B());
    }
}
