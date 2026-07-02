package com.daaw;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.measurement.internal.zzas;
import com.google.android.gms.measurement.internal.zzau;

/* JADX INFO: renamed from: com.daaw.Fz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0926Fz1 implements Parcelable.Creator {
    public static void a(zzau zzauVar, Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, zzauVar.B, false);
        JM0.p(parcel, 3, zzauVar.C, i, false);
        JM0.q(parcel, 4, zzauVar.D, false);
        JM0.n(parcel, 5, zzauVar.E);
        JM0.b(parcel, iA);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        long jU = 0;
        String strF = null;
        zzas zzasVar = null;
        String strF2 = null;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 2) {
                strF = IM0.f(parcel, iR);
            } else if (iL == 3) {
                zzasVar = (zzas) IM0.e(parcel, iR, zzas.CREATOR);
            } else if (iL == 4) {
                strF2 = IM0.f(parcel, iR);
            } else if (iL != 5) {
                IM0.x(parcel, iR);
            } else {
                jU = IM0.u(parcel, iR);
            }
        }
        IM0.k(parcel, iY);
        return new zzau(strF, zzasVar, strF2, jU);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zzau[i];
    }
}
