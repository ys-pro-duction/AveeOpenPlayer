package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbkv;

/* JADX INFO: loaded from: classes3.dex */
public final class EJ1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        long jU = 0;
        String strF = null;
        byte[] bArrB = null;
        String[] strArrG = null;
        String[] strArrG2 = null;
        boolean zM = false;
        int iT = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    zM = IM0.m(parcel, iR);
                    break;
                case 2:
                    strF = IM0.f(parcel, iR);
                    break;
                case 3:
                    iT = IM0.t(parcel, iR);
                    break;
                case 4:
                    bArrB = IM0.b(parcel, iR);
                    break;
                case 5:
                    strArrG = IM0.g(parcel, iR);
                    break;
                case 6:
                    strArrG2 = IM0.g(parcel, iR);
                    break;
                case 7:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 8:
                    jU = IM0.u(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzbkv(zM, strF, iT, bArrB, strArrG, strArrG2, zM2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbkv[i];
    }
}
