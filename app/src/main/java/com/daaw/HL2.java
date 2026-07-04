package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzfoa;

/* JADX INFO: loaded from: classes3.dex */
public final class HL2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        byte[] bArrB = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL != 2) {
                IM0.x(parcel, iR);
            } else {
                bArrB = IM0.b(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzfoa(iT, bArrB);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfoa[i];
    }
}
