package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.ads.zzbxr;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class YQ1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        ArrayList arrayListH = null;
        ArrayList arrayListH2 = null;
        boolean zM = false;
        boolean zM2 = false;
        boolean zM3 = false;
        boolean zM4 = false;
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
                    zM = IM0.m(parcel, iR);
                    break;
                case 5:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 6:
                    arrayListH = IM0.h(parcel, iR);
                    break;
                case 7:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case 8:
                    zM4 = IM0.m(parcel, iR);
                    break;
                case 9:
                    arrayListH2 = IM0.h(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzbxr(strF, strF2, zM, zM2, arrayListH, zM3, zM4, arrayListH2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbxr[i];
    }
}
