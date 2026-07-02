package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzaxe;

/* JADX INFO: loaded from: classes3.dex */
public final class XA1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        long jU = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) IM0.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            } else if (iL == 3) {
                zM = IM0.m(parcel, iR);
            } else if (iL == 4) {
                zM2 = IM0.m(parcel, iR);
            } else if (iL == 5) {
                jU = IM0.u(parcel, iR);
            } else if (iL != 6) {
                IM0.x(parcel, iR);
            } else {
                zM3 = IM0.m(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzaxe(parcelFileDescriptor, zM, zM2, jU, zM3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzaxe[i];
    }
}
