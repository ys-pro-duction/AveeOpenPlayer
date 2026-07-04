package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class WP1 extends AbstractC6395lz1 implements IInterface {
    public WP1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedAdSkuListener");
    }

    public final void a3(VP1 vp1, String str, String str2) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, vp1);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        I(2, parcelB);
    }
}
