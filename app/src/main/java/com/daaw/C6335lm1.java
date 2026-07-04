package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: renamed from: com.daaw.lm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6335lm1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        IBinder iBinderS = null;
        ConnectionResult connectionResult = null;
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                iBinderS = IM0.s(parcel, iR);
            } else if (iL == 3) {
                connectionResult = (ConnectionResult) IM0.e(parcel, iR, ConnectionResult.CREATOR);
            } else if (iL == 4) {
                zM = IM0.m(parcel, iR);
            } else if (iL != 5) {
                IM0.x(parcel, iR);
            } else {
                zM2 = IM0.m(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zav(iT, iBinderS, connectionResult, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zav[i];
    }
}
