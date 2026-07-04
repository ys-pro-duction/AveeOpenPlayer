package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzffh;

/* JADX INFO: loaded from: classes3.dex */
public final class HG2 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    iT = IM0.t(parcel, iR);
                    break;
                case 2:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 3:
                    iT3 = IM0.t(parcel, iR);
                    break;
                case 4:
                    iT4 = IM0.t(parcel, iR);
                    break;
                case 5:
                    strF = IM0.f(parcel, iR);
                    break;
                case 6:
                    iT5 = IM0.t(parcel, iR);
                    break;
                case 7:
                    iT6 = IM0.t(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzffh(iT, iT2, iT3, iT4, strF, iT5, iT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzffh[i];
    }
}
