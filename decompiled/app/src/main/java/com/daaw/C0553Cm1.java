package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Scope;

/* JADX INFO: renamed from: com.daaw.Cm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0553Cm1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL != 2) {
                IM0.x(parcel, iR);
            } else {
                strF = IM0.f(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new Scope(iT, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Scope[i];
    }
}
