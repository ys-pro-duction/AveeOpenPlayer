package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C6047km1;
import com.daaw.JM0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zat extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zat> CREATOR = new C6047km1();
    public final int B;
    public final Account C;
    public final int D;
    public final GoogleSignInAccount E;

    public zat(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.B = i;
        this.C = account;
        this.D = i2;
        this.E = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.p(parcel, 2, this.C, i, false);
        JM0.k(parcel, 3, this.D);
        JM0.p(parcel, 4, this.E, i, false);
        JM0.b(parcel, iA);
    }

    public zat(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }
}
