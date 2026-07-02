package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class AQ1 extends AbstractC6395lz1 implements IInterface {
    public AQ1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdSkuListener");
    }

    public final void a3(InterfaceC7351pQ1 interfaceC7351pQ1, String str, String str2) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7351pQ1);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        I(2, parcelB);
    }
}
