package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzblq;

/* JADX INFO: renamed from: com.daaw.bK1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3403bK1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                strF = IM0.f(parcel, iR);
            } else if (iL != 2) {
                IM0.x(parcel, iR);
            } else {
                bundleA = IM0.a(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzblq(strF, bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzblq[i];
    }
}
