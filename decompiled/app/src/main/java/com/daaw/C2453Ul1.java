package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: renamed from: com.daaw.Ul1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2453Ul1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        zat zatVar = null;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL != 2) {
                IM0.x(parcel, iR);
            } else {
                zatVar = (zat) IM0.e(parcel, iR, zat.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new zai(iT, zatVar);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zai[i];
    }
}
