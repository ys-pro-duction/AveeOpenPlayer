package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzfoh;

/* JADX INFO: loaded from: classes3.dex */
public final class NL2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = IM0.t(parcel, iR);
            } else if (iL == 3) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 4) {
                strF2 = IM0.f(parcel, iR);
            } else if (iL != 5) {
                IM0.x(parcel, iR);
            } else {
                iT3 = IM0.t(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzfoh(iT, iT2, iT3, strF, strF2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfoh[i];
    }
}
