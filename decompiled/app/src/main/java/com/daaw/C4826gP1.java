package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.ads.AdSize;
import com.google.android.gms.ads.internal.client.zzdu;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbfc;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbuh;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.gP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4826gP1 implements Parcelable.Creator {
    public static final zzbuh a(Parcel parcel) {
        int iY = IM0.y(parcel);
        Bundle bundleA = null;
        zzl zzlVar = null;
        zzq zzqVar = null;
        String strF = null;
        ApplicationInfo applicationInfo = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        zzcaz zzcazVar = null;
        Bundle bundleA2 = null;
        ArrayList arrayListH = null;
        Bundle bundleA3 = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListH2 = null;
        String strF7 = null;
        zzbfc zzbfcVar = null;
        ArrayList arrayListH3 = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = null;
        Bundle bundleA4 = null;
        String strF11 = null;
        zzdu zzduVar = null;
        Bundle bundleA5 = null;
        String strF12 = null;
        String strF13 = null;
        String strF14 = null;
        ArrayList arrayListD = null;
        String strF15 = null;
        ArrayList arrayListH4 = null;
        ArrayList arrayListH5 = null;
        String strF16 = null;
        zzbls zzblsVar = null;
        String strF17 = null;
        Bundle bundleA6 = null;
        long jU = 0;
        long jU2 = 0;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        int iT3 = 0;
        int iT4 = 0;
        float fP = 0.0f;
        float fP2 = 0.0f;
        boolean zM2 = false;
        int iT5 = 0;
        int iT6 = 0;
        boolean zM3 = false;
        boolean zM4 = false;
        int iT7 = 0;
        boolean zM5 = false;
        boolean zM6 = false;
        int iT8 = 0;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    iT = IM0.t(parcel, iR);
                    break;
                case 2:
                    bundleA = IM0.a(parcel, iR);
                    break;
                case 3:
                    zzlVar = (zzl) IM0.e(parcel, iR, zzl.CREATOR);
                    break;
                case 4:
                    zzqVar = (zzq) IM0.e(parcel, iR, zzq.CREATOR);
                    break;
                case 5:
                    strF = IM0.f(parcel, iR);
                    break;
                case 6:
                    applicationInfo = (ApplicationInfo) IM0.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 7:
                    packageInfo = (PackageInfo) IM0.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 8:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 9:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 10:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case 11:
                    zzcazVar = (zzcaz) IM0.e(parcel, iR, zzcaz.CREATOR);
                    break;
                case 12:
                    bundleA2 = IM0.a(parcel, iR);
                    break;
                case 13:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 14:
                    arrayListH = IM0.h(parcel, iR);
                    break;
                case 15:
                    bundleA3 = IM0.a(parcel, iR);
                    break;
                case 16:
                    zM = IM0.m(parcel, iR);
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 22:
                case 23:
                case 24:
                case 32:
                case 38:
                case 62:
                default:
                    IM0.x(parcel, iR);
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    iT3 = IM0.t(parcel, iR);
                    break;
                case 19:
                    iT4 = IM0.t(parcel, iR);
                    break;
                case 20:
                    fP = IM0.p(parcel, iR);
                    break;
                case 21:
                    strF5 = IM0.f(parcel, iR);
                    break;
                case 25:
                    jU = IM0.u(parcel, iR);
                    break;
                case 26:
                    strF6 = IM0.f(parcel, iR);
                    break;
                case 27:
                    arrayListH2 = IM0.h(parcel, iR);
                    break;
                case 28:
                    strF7 = IM0.f(parcel, iR);
                    break;
                case 29:
                    zzbfcVar = (zzbfc) IM0.e(parcel, iR, zzbfc.CREATOR);
                    break;
                case 30:
                    arrayListH3 = IM0.h(parcel, iR);
                    break;
                case 31:
                    jU2 = IM0.u(parcel, iR);
                    break;
                case 33:
                    strF8 = IM0.f(parcel, iR);
                    break;
                case 34:
                    fP2 = IM0.p(parcel, iR);
                    break;
                case 35:
                    iT5 = IM0.t(parcel, iR);
                    break;
                case 36:
                    iT6 = IM0.t(parcel, iR);
                    break;
                case 37:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case 39:
                    strF9 = IM0.f(parcel, iR);
                    break;
                case 40:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 41:
                    strF10 = IM0.f(parcel, iR);
                    break;
                case 42:
                    zM4 = IM0.m(parcel, iR);
                    break;
                case 43:
                    iT7 = IM0.t(parcel, iR);
                    break;
                case 44:
                    bundleA4 = IM0.a(parcel, iR);
                    break;
                case 45:
                    strF11 = IM0.f(parcel, iR);
                    break;
                case 46:
                    zzduVar = (zzdu) IM0.e(parcel, iR, zzdu.CREATOR);
                    break;
                case 47:
                    zM5 = IM0.m(parcel, iR);
                    break;
                case 48:
                    bundleA5 = IM0.a(parcel, iR);
                    break;
                case 49:
                    strF12 = IM0.f(parcel, iR);
                    break;
                case AdSize.PORTRAIT_AD_HEIGHT /* 50 */:
                    strF13 = IM0.f(parcel, iR);
                    break;
                case 51:
                    strF14 = IM0.f(parcel, iR);
                    break;
                case 52:
                    zM6 = IM0.m(parcel, iR);
                    break;
                case 53:
                    arrayListD = IM0.d(parcel, iR);
                    break;
                case 54:
                    strF15 = IM0.f(parcel, iR);
                    break;
                case 55:
                    arrayListH4 = IM0.h(parcel, iR);
                    break;
                case 56:
                    iT8 = IM0.t(parcel, iR);
                    break;
                case 57:
                    zM7 = IM0.m(parcel, iR);
                    break;
                case 58:
                    zM8 = IM0.m(parcel, iR);
                    break;
                case 59:
                    zM9 = IM0.m(parcel, iR);
                    break;
                case 60:
                    arrayListH5 = IM0.h(parcel, iR);
                    break;
                case 61:
                    strF16 = IM0.f(parcel, iR);
                    break;
                case 63:
                    zzblsVar = (zzbls) IM0.e(parcel, iR, zzbls.CREATOR);
                    break;
                case 64:
                    strF17 = IM0.f(parcel, iR);
                    break;
                case 65:
                    bundleA6 = IM0.a(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzbuh(iT, bundleA, zzlVar, zzqVar, strF, applicationInfo, packageInfo, strF2, strF3, strF4, zzcazVar, bundleA2, iT2, arrayListH, bundleA3, zM, iT3, iT4, fP, strF5, jU, strF6, arrayListH2, strF7, zzbfcVar, arrayListH3, jU2, strF8, fP2, zM2, iT5, iT6, zM3, strF9, strF10, zM4, iT7, bundleA4, strF11, zzduVar, zM5, bundleA5, strF12, strF13, strF14, zM6, arrayListD, strF15, arrayListH4, iT8, zM7, zM8, zM9, arrayListH5, strF16, zzblsVar, strF17, bundleA6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return a(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbuh[i];
    }
}
