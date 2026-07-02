package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzfm implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 2) {
                zM = IM0.m(parcel, iR);
            } else if (iL == 3) {
                zM2 = IM0.m(parcel, iR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                zM3 = IM0.m(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzfl(zM, zM2, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfl[i];
    }
}
