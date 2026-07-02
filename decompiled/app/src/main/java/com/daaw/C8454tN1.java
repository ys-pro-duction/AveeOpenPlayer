package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbrj;

/* JADX INFO: renamed from: com.daaw.tN1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8454tN1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
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
                iT3 = IM0.t(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzbrj(iT, iT2, iT3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbrj[i];
    }
}
