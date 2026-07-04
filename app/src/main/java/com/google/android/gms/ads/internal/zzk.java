package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzk implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        float fP = 0.0f;
        int iT = 0;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 2:
                    zM = IM0.m(parcel, iR);
                    break;
                case 3:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 4:
                    strF = IM0.f(parcel, iR);
                    break;
                case 5:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case 6:
                    fP = IM0.p(parcel, iR);
                    break;
                case 7:
                    iT = IM0.t(parcel, iR);
                    break;
                case 8:
                    zM4 = IM0.m(parcel, iR);
                    break;
                case 9:
                    zM5 = IM0.m(parcel, iR);
                    break;
                case 10:
                    zM6 = IM0.m(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzj(zM, zM2, strF, zM3, fP, iT, zM4, zM5, zM6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzj[i];
    }
}
