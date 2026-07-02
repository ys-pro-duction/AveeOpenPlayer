package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.AbstractC6395lz1;
import com.daaw.AbstractC6953nz1;

/* JADX INFO: loaded from: classes.dex */
public final class zzde extends AbstractC6395lz1 implements zzdg {
    public zzde(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final void zze(zzs zzsVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzsVar);
        I(1, parcelB);
    }

    @Override // com.google.android.gms.ads.internal.client.zzdg
    public final boolean zzf() {
        Parcel parcelG = G(2, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
