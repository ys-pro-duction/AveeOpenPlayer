package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.iK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5364iK1 extends AbstractC6395lz1 implements InterfaceC6769nK1 {
    public C5364iK1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.instream.client.IInstreamAdLoadCallback");
    }

    @Override // com.daaw.InterfaceC6769nK1
    public final void n2(InterfaceC4238eK1 interfaceC4238eK1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC4238eK1);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC6769nK1
    public final void zze(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC6769nK1
    public final void zzf(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(3, parcelB);
    }
}
