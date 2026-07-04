package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.xQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9589xQ1 extends AbstractC6395lz1 implements InterfaceC10147zQ1 {
    public C9589xQ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback");
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zze(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zzf(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(3, parcelB);
    }

    @Override // com.daaw.InterfaceC10147zQ1
    public final void zzg() {
        I(1, B());
    }
}
