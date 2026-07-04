package com.daaw;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbuk;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.iP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5384iP1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        ApplicationInfo applicationInfo = null;
        String strF = null;
        PackageInfo packageInfo = null;
        String strF2 = null;
        String strF3 = null;
        ArrayList arrayListH = null;
        int iT = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    applicationInfo = (ApplicationInfo) IM0.e(parcel, iR, ApplicationInfo.CREATOR);
                    break;
                case 2:
                    strF = IM0.f(parcel, iR);
                    break;
                case 3:
                    packageInfo = (PackageInfo) IM0.e(parcel, iR, PackageInfo.CREATOR);
                    break;
                case 4:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 5:
                    iT = IM0.t(parcel, iR);
                    break;
                case 6:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 7:
                    arrayListH = IM0.h(parcel, iR);
                    break;
                case 8:
                    zM = IM0.m(parcel, iR);
                    break;
                case 9:
                    zM2 = IM0.m(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzbuk(applicationInfo, strF, packageInfo, strF2, iT, strF3, arrayListH, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbuk[i];
    }
}
