package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.internal.ads.zzbzo;

/* JADX INFO: renamed from: com.daaw.eS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4270eS1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        zzq zzqVar = null;
        zzl zzlVar = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 2) {
                strF2 = IM0.f(parcel, iR);
            } else if (iL == 3) {
                zzqVar = (zzq) IM0.e(parcel, iR, zzq.CREATOR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                zzlVar = (zzl) IM0.e(parcel, iR, zzl.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new zzbzo(strF, strF2, zzqVar, zzlVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbzo[i];
    }
}
