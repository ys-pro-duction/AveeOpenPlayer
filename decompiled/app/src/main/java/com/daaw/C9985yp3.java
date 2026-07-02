package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.zzs;

/* JADX INFO: renamed from: com.daaw.yp3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9985yp3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        boolean zM = false;
        String strF = null;
        IBinder iBinderS = null;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 2) {
                iBinderS = IM0.s(parcel, iR);
            } else if (iL == 3) {
                zM = IM0.m(parcel, iR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                zM2 = IM0.m(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzs(strF, iBinderS, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzs[i];
    }
}
