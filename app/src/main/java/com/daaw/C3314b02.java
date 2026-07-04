package com.daaw;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.measurement.zzcl;

/* JADX INFO: renamed from: com.daaw.b02, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3314b02 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        Bundle bundleA = null;
        String strF4 = null;
        long jU = 0;
        long jU2 = 0;
        boolean zM = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    jU = IM0.u(parcel, iR);
                    break;
                case 2:
                    jU2 = IM0.u(parcel, iR);
                    break;
                case 3:
                    zM = IM0.m(parcel, iR);
                    break;
                case 4:
                    strF = IM0.f(parcel, iR);
                    break;
                case 5:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 6:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 7:
                    bundleA = IM0.a(parcel, iR);
                    break;
                case 8:
                    strF4 = IM0.f(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzcl(jU, jU2, zM, strF, strF2, strF3, bundleA, strF4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcl[i];
    }
}
