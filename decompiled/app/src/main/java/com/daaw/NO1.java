package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbtt;

/* JADX INFO: loaded from: classes3.dex */
public final class NO1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iBinderS = IM0.s(parcel, iR);
            } else if (iL != 2) {
                IM0.x(parcel, iR);
            } else {
                iBinderS2 = IM0.s(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzbtt(iBinderS, iBinderS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtt[i];
    }
}
