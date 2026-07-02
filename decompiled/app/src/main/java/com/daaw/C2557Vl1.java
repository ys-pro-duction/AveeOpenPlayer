package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.zak;

/* JADX INFO: renamed from: com.daaw.Vl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2557Vl1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        ConnectionResult connectionResult = null;
        zav zavVar = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                connectionResult = (ConnectionResult) IM0.e(parcel, iR, ConnectionResult.CREATOR);
            } else if (iL != 3) {
                IM0.x(parcel, iR);
            } else {
                zavVar = (zav) IM0.e(parcel, iR, zav.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new zak(iT, connectionResult, zavVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zak[i];
    }
}
