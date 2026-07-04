package com.google.android.gms.ads.internal.client;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C6564mc1;
import com.daaw.IM0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        Bundle bundleA = null;
        ArrayList arrayListH = null;
        String strF = null;
        zzfh zzfhVar = null;
        Location location = null;
        String strF2 = null;
        Bundle bundleA2 = null;
        Bundle bundleA3 = null;
        ArrayList arrayListH2 = null;
        String strF3 = null;
        String strF4 = null;
        zzc zzcVar = null;
        String strF5 = null;
        ArrayList arrayListH3 = null;
        String strF6 = null;
        long jU = 0;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        boolean zM2 = false;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        int iT6 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    iT = IM0.t(parcel, iR);
                    break;
                case 2:
                    jU = IM0.u(parcel, iR);
                    break;
                case 3:
                    bundleA = IM0.a(parcel, iR);
                    break;
                case 4:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 5:
                    arrayListH = IM0.h(parcel, iR);
                    break;
                case 6:
                    zM = IM0.m(parcel, iR);
                    break;
                case 7:
                    iT3 = IM0.t(parcel, iR);
                    break;
                case 8:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 9:
                    strF = IM0.f(parcel, iR);
                    break;
                case 10:
                    zzfhVar = (zzfh) IM0.e(parcel, iR, zzfh.CREATOR);
                    break;
                case 11:
                    location = (Location) IM0.e(parcel, iR, Location.CREATOR);
                    break;
                case 12:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 13:
                    bundleA2 = IM0.a(parcel, iR);
                    break;
                case 14:
                    bundleA3 = IM0.a(parcel, iR);
                    break;
                case 15:
                    arrayListH2 = IM0.h(parcel, iR);
                    break;
                case 16:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case 19:
                    zzcVar = (zzc) IM0.e(parcel, iR, zzc.CREATOR);
                    break;
                case 20:
                    iT4 = IM0.t(parcel, iR);
                    break;
                case 21:
                    strF5 = IM0.f(parcel, iR);
                    break;
                case 22:
                    arrayListH3 = IM0.h(parcel, iR);
                    break;
                case 23:
                    iT5 = IM0.t(parcel, iR);
                    break;
                case 24:
                    strF6 = IM0.f(parcel, iR);
                    break;
                case 25:
                    iT6 = IM0.t(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzl(iT, jU, bundleA, iT2, arrayListH, zM, iT3, zM2, strF, zzfhVar, location, strF2, bundleA2, bundleA3, arrayListH2, strF3, strF4, zM3, zzcVar, iT4, strF5, arrayListH3, iT5, strF6, iT6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzl[i];
    }
}
