package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class OM1 extends AbstractC6395lz1 implements QM1 {
    public OM1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
    }

    @Override // com.daaw.QM1
    public final void a(String str) {
        Parcel parcelB = B();
        parcelB.writeString("Adapter returned null.");
        I(3, parcelB);
    }

    @Override // com.daaw.QM1
    public final void zzf(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(4, parcelB);
    }

    @Override // com.daaw.QM1
    public final void zzg() {
        I(2, B());
    }
}
