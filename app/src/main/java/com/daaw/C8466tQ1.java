package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zze;

/* JADX INFO: renamed from: com.daaw.tQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8466tQ1 extends AbstractC6395lz1 implements InterfaceC9031vQ1 {
    public C8466tQ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void e1(InterfaceC7351pQ1 interfaceC7351pQ1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7351pQ1);
        I(3, parcelB);
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void g(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(4, parcelB);
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void o2(zze zzeVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzeVar);
        I(5, parcelB);
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zze() {
        I(7, B());
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zzf() {
        I(6, B());
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zzg() {
        I(2, B());
    }

    @Override // com.daaw.InterfaceC9031vQ1
    public final void zzj() {
        I(1, B());
    }
}
