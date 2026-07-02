package com.daaw;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.Yk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2865Yk1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        String strF4 = null;
        Uri uri = null;
        String strF5 = null;
        String strF6 = null;
        ArrayList arrayListJ = null;
        String strF7 = null;
        String strF8 = null;
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
                    strF2 = IM0.f(parcel, iR);
                    break;
                case 4:
                    strF3 = IM0.f(parcel, iR);
                    break;
                case 5:
                    strF4 = IM0.f(parcel, iR);
                    break;
                case 6:
                    uri = (Uri) IM0.e(parcel, iR, Uri.CREATOR);
                    break;
                case 7:
                    strF5 = IM0.f(parcel, iR);
                    break;
                case 8:
                    jU = IM0.u(parcel, iR);
                    break;
                case 9:
                    strF6 = IM0.f(parcel, iR);
                    break;
                case 10:
                    arrayListJ = IM0.j(parcel, iR, Scope.CREATOR);
                    break;
                case 11:
                    strF7 = IM0.f(parcel, iR);
                    break;
                case 12:
                    strF8 = IM0.f(parcel, iR);
                    break;
                default:
                    IM0.x(parcel, iR);
                    break;
            }
        }
        IM0.k(parcel, iY);
        return new GoogleSignInAccount(iT, strF, strF2, strF3, strF4, uri, strF5, jU, strF6, arrayListJ, strF7, strF8);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new GoogleSignInAccount[i];
    }
}
