package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: loaded from: classes3.dex */
public final class LM1 extends AbstractC6395lz1 implements NM1 {
    public LM1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
    }

    @Override // com.daaw.NM1
    public final void H(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(1, parcelB);
    }

    @Override // com.daaw.NM1
    public final void O2(InterfaceC4525fM1 interfaceC4525fM1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC4525fM1);
        I(4, parcelB);
    }

    @Override // com.daaw.NM1
    public final void a(String str) {
        Parcel parcelB = B();
        parcelB.writeString("Adapter returned null.");
        I(2, parcelB);
    }

    @Override // com.daaw.NM1
    public final void zzf(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(3, parcelB);
    }
}
