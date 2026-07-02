package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.pJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7323pJ1 extends AbstractC6395lz1 implements InterfaceC7880rJ1 {
    public C7323pJ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsEventListener");
    }

    @Override // com.daaw.InterfaceC7880rJ1
    public final void zzb(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(1, parcelB);
    }
}
