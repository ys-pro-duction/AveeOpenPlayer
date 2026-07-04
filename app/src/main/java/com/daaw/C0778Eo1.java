package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzau;
import com.google.android.gms.measurement.internal.zzlk;

/* JADX INFO: renamed from: com.daaw.Eo1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0778Eo1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        zzlk zzlkVar = null;
        String strF3 = null;
        zzau zzauVar = null;
        zzau zzauVar2 = null;
        zzau zzauVar3 = null;
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 2:
                    strF = IM0.f(parcel, iR);
                    break;
                case 3:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 4:
                    zzlkVar = (zzlk) IM0.e(parcel, iR, zzlk.CREATOR);
                    break;
                case 5:
                    jU = IM0.u(parcel, iR);
                    break;
                case 6:
                    zM = IM0.m(parcel, iR);
                    break;
                case 7:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 8:
                    zzauVar = (zzau) IM0.e(parcel, iR, zzau.CREATOR);
                    break;
                case 9:
                    jU2 = IM0.u(parcel, iR);
                    break;
                case 10:
                    zzauVar2 = (zzau) IM0.e(parcel, iR, zzau.CREATOR);
                    break;
                case 11:
                    jU3 = IM0.u(parcel, iR);
                    break;
                case 12:
                    zzauVar3 = (zzau) IM0.e(parcel, iR, zzau.CREATOR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzac(strF, strF2, zzlkVar, jU, zM, strF3, zzauVar, jU2, zzauVar2, jU3, zzauVar3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzac[i];
    }
}
