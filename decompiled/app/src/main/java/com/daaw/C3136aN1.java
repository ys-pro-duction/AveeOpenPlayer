package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.aN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3136aN1 extends AbstractC6395lz1 implements InterfaceC3693cN1 {
    public C3136aN1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
    }

    @Override // com.daaw.InterfaceC3693cN1
    public final void T(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(3, parcelB);
    }

    @Override // com.daaw.InterfaceC3693cN1
    public final void a(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC3693cN1
    public final void e(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(2, parcelB);
    }
}
