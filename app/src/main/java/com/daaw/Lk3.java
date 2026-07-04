package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzo;

/* JADX INFO: loaded from: classes.dex */
public final class Lk3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        IBinder iBinderS = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    strF = IM0.f(parcel, iR);
                    break;
                case 2:
                    zM = IM0.m(parcel, iR);
                    break;
                case 3:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 4:
                    iBinderS = IM0.s(parcel, iR);
                    break;
                case 5:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case 6:
                    zM4 = IM0.m(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzo(strF, zM, zM2, iBinderS, zM3, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzo[i];
    }
}
