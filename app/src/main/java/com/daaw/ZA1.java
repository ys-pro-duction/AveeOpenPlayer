package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzaxh;

/* JADX INFO: loaded from: classes3.dex */
public final class ZA1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Bundle bundleA = null;
        String strF5 = null;
        long jU = 0;
        long jU2 = 0;
        boolean zM = false;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 2:
                    strF = IM0.f(parcel, iR);
                    break;
                case 3:
                    jU = IM0.u(parcel, iR);
                    break;
                case 4:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 5:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 6:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case 7:
                    bundleA = IM0.a(parcel, iR);
                    break;
                case 8:
                    zM = IM0.m(parcel, iR);
                    break;
                case 9:
                    jU2 = IM0.u(parcel, iR);
                    break;
                case 10:
                    strF5 = IM0.f(parcel, iR);
                    break;
                case 11:
                    iT = IM0.t(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzaxh(strF, jU, strF2, strF3, strF4, bundleA, zM, jU2, strF5, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxh[i];
    }
}
