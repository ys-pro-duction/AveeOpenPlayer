package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzq;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.wn3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C9417wn3 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        long jU = 0;
        long jU2 = 0;
        long jU3 = 0;
        long jU4 = 0;
        long jU5 = 0;
        long jU6 = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        String strF5 = null;
        String strF6 = null;
        String strF7 = null;
        Boolean boolN = null;
        ArrayList arrayListH = null;
        String strF8 = null;
        String strF9 = null;
        String strF10 = "";
        String strF11 = strF10;
        long jU7 = -2147483648L;
        boolean zM = true;
        boolean zM2 = false;
        int iT = 0;
        boolean zM3 = true;
        boolean zM4 = false;
        boolean zM5 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 2:
                    strF = IM0.f(parcel, iR);
                    break;
                case 3:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 4:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 5:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case 6:
                    jU = IM0.u(parcel, iR);
                    break;
                case 7:
                    jU2 = IM0.u(parcel, iR);
                    break;
                case 8:
                    strF5 = IM0.f(parcel, iR);
                    break;
                case 9:
                    zM = IM0.m(parcel, iR);
                    break;
                case 10:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 11:
                    jU7 = IM0.u(parcel, iR);
                    break;
                case 12:
                    strF6 = IM0.f(parcel, iR);
                    break;
                case 13:
                    jU3 = IM0.u(parcel, iR);
                    break;
                case 14:
                    jU4 = IM0.u(parcel, iR);
                    break;
                case 15:
                    iT = IM0.t(parcel, iR);
                    break;
                case 16:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case C6564mc1.STRING_VALUE_FIELD_NUMBER /* 17 */:
                case 20:
                default:
                    IM0.x(parcel, iR);
                    break;
                case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                    zM4 = IM0.m(parcel, iR);
                    break;
                case 19:
                    strF7 = IM0.f(parcel, iR);
                    break;
                case 21:
                    boolN = IM0.n(parcel, iR);
                    break;
                case 22:
                    jU5 = IM0.u(parcel, iR);
                    break;
                case 23:
                    arrayListH = IM0.h(parcel, iR);
                    break;
                case 24:
                    strF8 = IM0.f(parcel, iR);
                    break;
                case 25:
                    strF10 = IM0.f(parcel, iR);
                    break;
                case 26:
                    strF11 = IM0.f(parcel, iR);
                    break;
                case 27:
                    strF9 = IM0.f(parcel, iR);
                    break;
                case 28:
                    zM5 = IM0.m(parcel, iR);
                    break;
                case 29:
                    jU6 = IM0.u(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzq(strF, strF2, strF3, strF4, jU, jU2, strF5, zM, zM2, jU7, strF6, jU3, jU4, iT, zM3, zM4, strF7, boolN, jU5, arrayListH, strF8, strF10, strF11, strF9, zM5, jU6);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzq[i];
    }
}
