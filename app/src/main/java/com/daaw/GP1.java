package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbvg;
import com.google.android.gms.internal.ads.zzcaz;
import com.google.android.gms.internal.ads.zzffh;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class GP1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        Bundle bundleA = null;
        zzcaz zzcazVar = null;
        ApplicationInfo applicationInfo = null;
        String strF = null;
        ArrayList arrayListH = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        zzffh zzffhVar = null;
        String strF4 = null;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    bundleA = IM0.a(parcel, iR);
                    break;
                case 2:
                    zzcazVar = (zzcaz) IM0.e(parcel, iR, zzcaz.CREATOR);
                    break;
                case 3:
                    applicationInfo = (ApplicationInfo) IM0.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 4:
                    strF = IM0.f(parcel, iR);
                    break;
                case 5:
                    arrayListH = IM0.h(parcel, iR);
                    break;
                case 6:
                    packageInfo = (PackageInfo) IM0.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 7:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 8:
                default:
                    IM0.x(parcel, iR);
                    break;
                case 9:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 10:
                    zzffhVar = (zzffh) IM0.e(parcel, iR, zzffh.CREATOR);
                    break;
                case 11:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case 12:
                    zM = IM0.m(parcel, iR);
                    break;
                case 13:
                    zM2 = IM0.m(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzbvg(bundleA, zzcazVar, applicationInfo, strF, arrayListH, packageInfo, strF2, strF3, zzffhVar, strF4, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbvg[i];
    }
}
