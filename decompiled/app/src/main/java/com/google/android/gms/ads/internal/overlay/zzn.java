package com.google.android.gms.ads.internal.overlay;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C6564mc1;
import com.daaw.IM0;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: loaded from: classes.dex */
public final class zzn implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        zzc zzcVar = null;
        IBinder iBinderS = null;
        IBinder iBinderS2 = null;
        IBinder iBinderS3 = null;
        IBinder iBinderS4 = null;
        String strF = null;
        String strF2 = null;
        IBinder iBinderS5 = null;
        String strF3 = null;
        zzcaz zzcazVar = null;
        String strF4 = null;
        com.google.android.gms.ads.internal.zzj zzjVar = null;
        IBinder iBinderS6 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        IBinder iBinderS7 = null;
        IBinder iBinderS8 = null;
        IBinder iBinderS9 = null;
        boolean zM = false;
        int iT = 0;
        int iT2 = 0;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 2:
                    zzcVar = (zzc) IM0.e(parcel, iR, zzc.CREATOR);
                    break;
                case 3:
                    iBinderS = IM0.s(parcel, iR);
                    break;
                case 4:
                    iBinderS2 = IM0.s(parcel, iR);
                    break;
                case 5:
                    iBinderS3 = IM0.s(parcel, iR);
                    break;
                case 6:
                    iBinderS4 = IM0.s(parcel, iR);
                    break;
                case 7:
                    strF = IM0.f(parcel, iR);
                    break;
                case 8:
                    zM = IM0.m(parcel, iR);
                    break;
                case 9:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 10:
                    iBinderS5 = IM0.s(parcel, iR);
                    break;
                case 11:
                    iT = IM0.t(parcel, iR);
                    break;
                case 12:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 13:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 14:
                    zzcazVar = (zzcaz) IM0.e(parcel, iR, zzcaz.CREATOR);
                    break;
                case 15:
                case 20:
                case 21:
                case 22:
                case 23:
                default:
                    IM0.x(parcel, iR);
                    break;
                case 16:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                    zzjVar = (com.google.android.gms.ads.internal.zzj) IM0.e(parcel, iR, com.google.android.gms.ads.internal.zzj.CREATOR);
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iBinderS6 = IM0.s(parcel, iR);
                    break;
                case 19:
                    strF5 = IM0.f(parcel, iR);
                    break;
                case 24:
                    strF6 = IM0.f(parcel, iR);
                    break;
                case 25:
                    strF7 = IM0.f(parcel, iR);
                    break;
                case 26:
                    iBinderS7 = IM0.s(parcel, iR);
                    break;
                case 27:
                    iBinderS8 = IM0.s(parcel, iR);
                    break;
                case 28:
                    iBinderS9 = IM0.s(parcel, iR);
                    break;
                case 29:
                    zM2 = IM0.m(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new AdOverlayInfoParcel(zzcVar, iBinderS, iBinderS2, iBinderS3, iBinderS4, strF, zM, strF2, iBinderS5, iT, iT2, strF3, zzcazVar, strF4, zzjVar, iBinderS6, strF5, strF6, strF7, iBinderS7, iBinderS8, iBinderS9, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new AdOverlayInfoParcel[i];
    }
}
