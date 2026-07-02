package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzas;

/* JADX INFO: renamed from: com.daaw.ny1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6949ny1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        Bundle bundleA = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            if (IM0.l(iR) != 2) {
                IM0.x(parcel, iR);
            } else {
                bundleA = IM0.a(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzas(bundleA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzas[i];
    }
}
