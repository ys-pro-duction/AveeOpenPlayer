package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzblg;

/* JADX INFO: loaded from: classes3.dex */
public final class SJ1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        boolean zM = false;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 2) {
                zM = IM0.m(parcel, iR);
            } else if (iL == 3) {
                iT = IM0.t(parcel, iR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                strF2 = IM0.f(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzblg(strF, zM, iT, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzblg[i];
    }
}
