package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class TJ1 extends AbstractC6395lz1 implements VJ1 {
    public TJ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.initialization.IAdapterInitializationCallback");
    }

    @Override // com.daaw.VJ1
    public final void a(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        I(3, parcelB);
    }

    @Override // com.daaw.VJ1
    public final void zzf() {
        I(2, B());
    }
}
