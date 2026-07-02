package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbuo;

/* JADX INFO: renamed from: com.daaw.kP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5943kP1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        Bundle bundleA = null;
        byte[] bArrB = null;
        String strF2 = null;
        String strF3 = null;
        int iT = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    strF = IM0.f(parcel, iR);
                    break;
                case 2:
                    iT = IM0.t(parcel, iR);
                    break;
                case 3:
                    bundleA = IM0.a(parcel, iR);
                    break;
                case 4:
                    bArrB = IM0.b(parcel, iR);
                    break;
                case 5:
                    zM = IM0.m(parcel, iR);
                    break;
                case 6:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 7:
                    strF3 = IM0.f(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzbuo(strF, iT, bundleA, bArrB, zM, strF2, strF3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbuo[i];
    }
}
