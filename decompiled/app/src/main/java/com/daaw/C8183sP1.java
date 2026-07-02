package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.ads.internal.util.zzbb;

/* JADX INFO: renamed from: com.daaw.sP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8183sP1 extends AbstractC6395lz1 implements InterfaceC8741uP1 {
    public C8183sP1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsServiceResponseListener");
    }

    @Override // com.daaw.InterfaceC8741uP1
    public final void A(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, parcelFileDescriptor);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC8741uP1
    public final void v(zzbb zzbbVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbbVar);
        I(2, parcelB);
    }
}
