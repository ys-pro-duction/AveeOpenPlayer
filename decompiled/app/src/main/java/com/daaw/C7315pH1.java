package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.pH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7315pH1 extends AbstractC6395lz1 implements InterfaceC7872rH1 {
    public C7315pH1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    @Override // com.daaw.InterfaceC7872rH1
    public final boolean zzb(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        Parcel parcelG = G(2, parcelB);
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }
}
