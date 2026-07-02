package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzv implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        zze zzeVar = null;
        Bundle bundleA = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        long jU = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    strF = IM0.f(parcel, iR);
                    break;
                case 2:
                    jU = IM0.u(parcel, iR);
                    break;
                case 3:
                    zzeVar = (zze) IM0.e(parcel, iR, zze.CREATOR);
                    break;
                case 4:
                    bundleA = IM0.a(parcel, iR);
                    break;
                case 5:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 6:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 7:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case 8:
                    strF5 = IM0.f(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzu(strF, jU, zzeVar, bundleA, strF2, strF3, strF4, strF5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzu[i];
    }
}
