package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzfi implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            if (IM0.l(iR) != 15) {
                IM0.x(parcel, iR);
            } else {
                strF = IM0.f(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzfh(strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfh[i];
    }
}
