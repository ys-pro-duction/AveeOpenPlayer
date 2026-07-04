package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2557Vl1;
import com.daaw.JM0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zav;

/* JADX INFO: loaded from: classes3.dex */
public final class zak extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zak> CREATOR = new C2557Vl1();
    public final int B;
    public final ConnectionResult C;
    public final zav D;

    public zak(int i, ConnectionResult connectionResult, zav zavVar) {
        this.B = i;
        this.C = connectionResult;
        this.D = zavVar;
    }

    public final ConnectionResult e() {
        return this.C;
    }

    public final zav m() {
        return this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, this.B);
        JM0.p(parcel, 2, this.C, i, false);
        JM0.p(parcel, 3, this.D, i, false);
        JM0.b(parcel, iA);
    }
}
