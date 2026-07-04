package com.daaw;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zaa;

/* JADX INFO: renamed from: com.daaw.Xk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2761Xk1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        Intent intent = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                iT2 = IM0.t(parcel, iR);
            } else if (iL != 3) {
                IM0.x(parcel, iR);
            } else {
                intent = (Intent) IM0.e(parcel, iR, Intent.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new zaa(iT, iT2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
