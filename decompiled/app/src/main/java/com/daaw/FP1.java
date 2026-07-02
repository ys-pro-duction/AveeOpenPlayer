package com.daaw;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbve;

/* JADX INFO: loaded from: classes3.dex */
public final class FP1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            if (IM0.l(iR) != 2) {
                IM0.x(parcel, iR);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) IM0.e(parcel, iR, ParcelFileDescriptor.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new zzbve(parcelFileDescriptor);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbve[i];
    }
}
