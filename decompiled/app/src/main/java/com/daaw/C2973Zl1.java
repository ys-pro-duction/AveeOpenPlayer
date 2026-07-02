package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.MethodInvocation;

/* JADX INFO: renamed from: com.daaw.Zl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2973Zl1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        long jU = 0;
        long jU2 = 0;
        int iT = 0;
        int iT2 = 0;
        int iT3 = 0;
        int iT4 = 0;
        int iT5 = -1;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    iT = IM0.t(parcel, iR);
                    break;
                case 2:
                    iT2 = IM0.t(parcel, iR);
                    break;
                case 3:
                    iT3 = IM0.t(parcel, iR);
                    break;
                case 4:
                    jU = IM0.u(parcel, iR);
                    break;
                case 5:
                    jU2 = IM0.u(parcel, iR);
                    break;
                case 6:
                    strF = IM0.f(parcel, iR);
                    break;
                case 7:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 8:
                    iT4 = IM0.t(parcel, iR);
                    break;
                case 9:
                    iT5 = IM0.t(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new MethodInvocation(iT, iT2, iT3, jU, jU2, strF, strF2, iT4, iT5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
