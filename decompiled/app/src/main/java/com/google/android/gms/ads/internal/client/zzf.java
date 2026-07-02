package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzf implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        zze zzeVar = null;
        IBinder iBinderS = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 3) {
                strF2 = IM0.f(parcel, iR);
            } else if (iL == 4) {
                zzeVar = (zze) IM0.e(parcel, iR, zze.CREATOR);
            } else if (iL != 5) {
                IM0.x(parcel, iR);
            } else {
                iBinderS = IM0.s(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zze(iT, strF, strF2, zzeVar, iBinderS);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zze[i];
    }
}
