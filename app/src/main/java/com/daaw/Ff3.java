package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzlk;

/* JADX INFO: loaded from: classes3.dex */
public final class Ff3 implements Parcelable.Creator {
    public static void a(zzlk zzlkVar, Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, zzlkVar.B);
        JM0.q(parcel, 2, zzlkVar.C, false);
        JM0.n(parcel, 3, zzlkVar.D);
        JM0.o(parcel, 4, zzlkVar.E, false);
        JM0.i(parcel, 5, null, false);
        JM0.q(parcel, 6, zzlkVar.F, false);
        JM0.q(parcel, 7, zzlkVar.G, false);
        JM0.g(parcel, 8, zzlkVar.H, false);
        JM0.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        Long lV = null;
        Float fQ = null;
        String strF2 = null;
        String strF3 = null;
        Double dO = null;
        long jU = 0;
        int iT = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            switch (IM0.l(iR)) {
                case 1:
                    iT = IM0.t(parcel, iR);
                    break;
                case 2:
                    strF = IM0.f(parcel, iR);
                    break;
                case 3:
                    jU = IM0.u(parcel, iR);
                    break;
                case 4:
                    lV = IM0.v(parcel, iR);
                    break;
                case 5:
                    fQ = IM0.q(parcel, iR);
                    break;
                case 6:
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 7:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 8:
                    dO = IM0.o(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new zzlk(iT, strF, jU, lV, fQ, strF2, strF3, dO);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzlk[i];
    }
}
