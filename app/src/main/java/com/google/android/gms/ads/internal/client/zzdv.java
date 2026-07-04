package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzdv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            if (IM0.l(iR) != 2) {
                IM0.x(parcel, iR);
            } else {
                iT = IM0.t(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzdu(iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzdu[i];
    }
}
