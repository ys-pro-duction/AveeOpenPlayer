package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.signin.internal.zag;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Pl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1909Pl1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        ArrayList arrayListH = null;
        String strF = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                arrayListH = IM0.h(parcel, iR);
            } else if (iL != 2) {
                IM0.x(parcel, iR);
            } else {
                strF = IM0.f(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zag(arrayListH, strF);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zag[i];
    }
}
