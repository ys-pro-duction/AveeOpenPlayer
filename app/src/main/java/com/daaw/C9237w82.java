package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.appset.zzc;

/* JADX INFO: renamed from: com.daaw.w82, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9237w82 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                strF = IM0.f(parcel, iR);
            } else if (iL != 2) {
                IM0.x(parcel, iR);
            } else {
                iT = IM0.t(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzc(strF, iT);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzc[i];
    }
}
