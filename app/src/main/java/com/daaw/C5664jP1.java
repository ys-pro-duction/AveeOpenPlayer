package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbum;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.jP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5664jP1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        ArrayList arrayListH = null;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 2) {
                zM = IM0.m(parcel, iR);
            } else if (iL != 3) {
                IM0.x(parcel, iR);
            } else {
                arrayListH = IM0.h(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzbum(zM, arrayListH);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbum[i];
    }
}
