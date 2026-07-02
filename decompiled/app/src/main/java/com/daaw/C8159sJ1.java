package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.sJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8159sJ1 extends AbstractC6395lz1 implements InterfaceC8717uJ1 {
    public C8159sJ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
    }

    @Override // com.daaw.InterfaceC8717uJ1
    public final void e(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC8717uJ1
    public final void zze() {
        I(2, B());
    }
}
