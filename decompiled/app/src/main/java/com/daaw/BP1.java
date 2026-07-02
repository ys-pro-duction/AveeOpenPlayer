package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: loaded from: classes3.dex */
public final class BP1 extends AbstractC6395lz1 implements DP1 {
    public BP1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.daaw.DP1
    public final void A(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, parcelFileDescriptor);
        I(1, parcelB);
    }

    @Override // com.daaw.DP1
    public final void v(zzbb zzbbVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbbVar);
        I(2, parcelB);
    }
}
