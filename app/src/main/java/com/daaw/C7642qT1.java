package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzcaz;

/* JADX INFO: renamed from: com.daaw.qT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7642qT1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        int iT = 0;
        int iT2 = 0;
        boolean zM = false;
        boolean zM2 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 2) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 3) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 4) {
                iT2 = IM0.t(parcel, iR);
            } else if (iL == 5) {
                zM = IM0.m(parcel, iR);
            } else if (iL != 6) {
                IM0.x(parcel, iR);
            } else {
                zM2 = IM0.m(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzcaz(strF, iT, iT2, zM, zM2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcaz[i];
    }
}
