package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzbl extends AbstractC6395lz1 implements zzbn {
    public zzbl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoader");
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zze() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final String zzf() {
        throw null;
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzg(zzl zzlVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzlVar);
        I(1, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final void zzh(zzl zzlVar, int i) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzlVar);
        parcelB.writeInt(i);
        I(5, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzbn
    public final boolean zzi() {
        Parcel parcelG = G(3, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
