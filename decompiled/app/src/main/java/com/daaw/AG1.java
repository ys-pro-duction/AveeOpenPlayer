package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class AG1 extends AbstractC6395lz1 implements CG1 {
    public AG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewHolderDelegate");
    }

    @Override // com.daaw.CG1
    public final void zzb(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(3, parcelB);
    }

    @Override // com.daaw.CG1
    public final void zzc(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(1, parcelB);
    }

    @Override // com.daaw.CG1
    public final void zzd() {
        I(2, B());
    }
}
