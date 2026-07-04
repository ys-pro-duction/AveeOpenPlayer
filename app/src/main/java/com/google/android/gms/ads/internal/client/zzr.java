package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzr implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        zzq[] zzqVarArr = null;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        boolean zM6 = false;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 2:
                    strF = IM0.f(parcel, iR);
                    break;
                case 3:
                    iT = IM0.t(parcel, iR);
                    break;
                case 4:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 5:
                    zM = IM0.m(parcel, iR);
                    break;
                case 6:
                    iT3 = IM0.t(parcel, iR);
                    break;
                case 7:
                    iT4 = IM0.t(parcel, iR);
                    break;
                case 8:
                    zzqVarArr = (zzq[]) IM0.i(parcel, iR, zzq.CREATOR);
                    break;
                case 9:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 10:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case 11:
                    zM4 = IM0.m(parcel, iR);
                    break;
                case 12:
                    zM5 = IM0.m(parcel, iR);
                    break;
                case 13:
                    zM6 = IM0.m(parcel, iR);
                    break;
                case 14:
                    zM7 = IM0.m(parcel, iR);
                    break;
                case 15:
                    zM8 = IM0.m(parcel, iR);
                    break;
                case 16:
                    zM9 = IM0.m(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzq(strF, iT, iT2, zM, iT3, iT4, zzqVarArr, zM2, zM3, zM4, zM5, zM6, zM7, zM8, zM9);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
