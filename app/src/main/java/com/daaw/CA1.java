package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class CA1 extends AbstractC6395lz1 implements EA1 {
    public CA1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.daaw.EA1
    public final void U1(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(3, parcelB);
    }

    @Override // com.daaw.EA1
    public final void b2(BA1 ba1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, ba1);
        I(1, parcelB);
    }

    @Override // com.daaw.EA1
    public final void zzb(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(2, parcelB);
    }
}
