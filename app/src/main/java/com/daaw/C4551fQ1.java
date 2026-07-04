package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.fQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4551fQ1 extends AbstractC6395lz1 implements InterfaceC5109hQ1 {
    public C4551fQ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void b(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(7, parcelB);
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void r1(VP1 vp1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, vp1);
        I(5, parcelB);
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void zzf() {
        I(4, B());
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void zzh() {
        I(6, B());
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void zzi() {
        I(1, B());
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void zzj() {
        I(2, B());
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void zzk() {
        I(8, B());
    }

    @Override // com.daaw.InterfaceC5109hQ1
    public final void zzl() {
        I(3, B());
    }
}
