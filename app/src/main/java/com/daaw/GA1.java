package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class GA1 extends AbstractC6395lz1 implements IA1 {
    public GA1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenFullScreenContentCallback");
    }

    @Override // com.daaw.IA1
    public final void zzb() {
        I(5, B());
    }

    @Override // com.daaw.IA1
    public final void zzc() {
        I(2, B());
    }

    @Override // com.daaw.IA1
    public final void zzd(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(3, parcelB);
    }

    @Override // com.daaw.IA1
    public final void zze() {
        I(4, B());
    }

    @Override // com.daaw.IA1
    public final void zzf() {
        I(1, B());
    }
}
