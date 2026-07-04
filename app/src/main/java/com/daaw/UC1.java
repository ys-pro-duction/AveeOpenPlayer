package com.daaw;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class UC1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        PendingIntent pendingIntent = null;
        String strF = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = IM0.t(parcel, iR);
            } else if (iL == 3) {
                pendingIntent = (PendingIntent) IM0.e(parcel, iR, PendingIntent.CREATOR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                strF = IM0.f(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new ConnectionResult(iT, iT2, pendingIntent, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new ConnectionResult[i];
    }
}
