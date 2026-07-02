package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.IM0;

/* JADX INFO: loaded from: classes.dex */
public final class zzb implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Intent intent = null;
        IBinder iBinderS = null;
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
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 5:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case 6:
                    strF5 = IM0.f(parcel, iR);
                    break;
                case 7:
                    strF6 = IM0.f(parcel, iR);
                    break;
                case 8:
                    strF7 = IM0.f(parcel, iR);
                    break;
                case 9:
                    intent = (Intent) IM0.e(parcel, iR, Intent.CREATOR);
                    break;
                case 10:
                    iBinderS = IM0.s(parcel, iR);
                    break;
                case 11:
                    zM = IM0.m(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzc(strF, strF2, strF3, strF4, strF5, strF6, strF7, intent, iBinderS, zM);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
