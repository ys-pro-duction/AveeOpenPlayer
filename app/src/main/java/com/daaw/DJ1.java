package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbkt;

/* JADX INFO: loaded from: classes3.dex */
public final class DJ1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 2) {
                strArrG = IM0.g(parcel, iR);
            } else if (iL != 3) {
                IM0.x(parcel, iR);
            } else {
                strArrG2 = IM0.g(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzbkt(strF, strArrG, strArrG2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbkt[i];
    }
}
