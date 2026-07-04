package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbkt;

/* JADX INFO: loaded from: classes3.dex */
public final class HJ1 extends AbstractC6395lz1 implements IInterface {
    public HJ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void a3(zzbkt zzbktVar, GJ1 gj1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbktVar);
        AbstractC6953nz1.f(parcelB, gj1);
        Z2(2, parcelB);
    }
}
