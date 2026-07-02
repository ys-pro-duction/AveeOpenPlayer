package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.internal.ads.zzbwd;

/* JADX INFO: renamed from: com.daaw.iQ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5388iQ1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        zzl zzlVar = null;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 2) {
                zzlVar = (zzl) IM0.e(parcel, iR, zzl.CREATOR);
            } else if (iL != 3) {
                IM0.x(parcel, iR);
            } else {
                strF = IM0.f(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzbwd(zzlVar, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbwd[i];
    }
}
