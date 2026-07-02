package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzfl;
import com.google.android.gms.internal.ads.zzbfc;

/* JADX INFO: renamed from: com.daaw.hG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5069hG1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        zzfl zzflVar = null;
        int iT = 0;
        boolean zM = false;
        int iT2 = 0;
        boolean zM2 = false;
        int iT3 = 0;
        boolean zM3 = false;
        int iT4 = 0;
        int iT5 = 0;
        boolean zM4 = false;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    iT = IM0.t(parcel, iR);
                    break;
                case 2:
                    zM = IM0.m(parcel, iR);
                    break;
                case 3:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 4:
                    zM2 = IM0.m(parcel, iR);
                    break;
                case 5:
                    iT3 = IM0.t(parcel, iR);
                    break;
                case 6:
                    zzflVar = (zzfl) IM0.e(parcel, iR, zzfl.CREATOR);
                    break;
                case 7:
                    zM3 = IM0.m(parcel, iR);
                    break;
                case 8:
                    iT4 = IM0.t(parcel, iR);
                    break;
                case 9:
                    iT5 = IM0.t(parcel, iR);
                    break;
                case 10:
                    zM4 = IM0.m(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzbfc(iT, zM, iT2, zM2, iT3, zzflVar, zM3, iT4, iT5, zM4);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfc[i];
    }
}
