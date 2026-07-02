package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                zM = IM0.m(parcel, iR);
            } else if (iL == 2) {
                iBinderS = IM0.s(parcel, iR);
            } else if (iL != 3) {
                IM0.x(parcel, iR);
            } else {
                iBinderS2 = IM0.s(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new PublisherAdViewOptions(zM, iBinderS, iBinderS2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new PublisherAdViewOptions[i];
    }
}
