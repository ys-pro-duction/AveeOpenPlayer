package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class RM1 extends AbstractC6395lz1 implements TM1 {
    public RM1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
    }

    @Override // com.daaw.TM1
    public final void F0(InterfaceC6219lM1 interfaceC6219lM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC6219lM1);
        I(1, parcelB);
    }

    @Override // com.daaw.TM1
    public final void a(String str) {
        Parcel parcelB = B();
        parcelB.writeString("Adapter returned null.");
        I(2, parcelB);
    }

    @Override // com.daaw.TM1
    public final void zzf(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(3, parcelB);
    }
}
