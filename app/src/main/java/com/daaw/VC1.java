package com.daaw;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes.dex */
public final class VC1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        PendingIntent pendingIntent = null;
        ConnectionResult connectionResult = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) IM0.e(parcel, iR, PendingIntent.CREATOR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                connectionResult = (ConnectionResult) IM0.e(parcel, iR, ConnectionResult.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new Status(iT, strF, pendingIntent, connectionResult);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Status[i];
    }
}
