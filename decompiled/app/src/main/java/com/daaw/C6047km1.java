package com.daaw;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.zat;

/* JADX INFO: renamed from: com.daaw.km1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6047km1 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iY = IM0.y(parcel);
        Account account = null;
        GoogleSignInAccount googleSignInAccount = null;
        int iT = 0;
        int iT2 = 0;
        while (parcel.dataPosition() < iY) {
            int iR = IM0.r(parcel);
            int iL = IM0.l(iR);
            if (iL == 1) {
                iT = IM0.t(parcel, iR);
            } else if (iL == 2) {
                account = (Account) IM0.e(parcel, iR, Account.CREATOR);
            } else if (iL == 3) {
                iT2 = IM0.t(parcel, iR);
            } else if (iL != 4) {
                IM0.x(parcel, iR);
            } else {
                googleSignInAccount = (GoogleSignInAccount) IM0.e(parcel, iR, GoogleSignInAccount.CREATOR);
            }
        }
        IM0.k(parcel, iY);
        return new zat(iT, account, iT2, googleSignInAccount);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new zat[i];
    }
}
