package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;

/* JADX INFO: renamed from: com.daaw.yS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9876yS1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        long jU = -1;
        int iT = 0;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 2) {
                iT = IM0.t(parcel, iR);
            } else if (iL != 3) {
                IM0.x(parcel, iR);
            } else {
                jU = IM0.u(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new Feature(strF, iT, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Feature[i];
    }
}
