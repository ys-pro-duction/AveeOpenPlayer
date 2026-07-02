package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC8022rp0;
import com.daaw.C6335lm1;
import com.daaw.JM0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zav extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zav> CREATOR = new C6335lm1();
    public final int B;
    public final IBinder C;
    public final ConnectionResult D;
    public final boolean E;
    public final boolean F;

    public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
        this.B = i;
        this.C = iBinder;
        this.D = connectionResult;
        this.E = z;
        this.F = z2;
    }

    public final ConnectionResult e() {
        return this.D;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zav)) {
            return false;
        }
        zav zavVar = (zav) obj;
        return this.D.equals(zavVar.D) && AbstractC8022rp0.a(m(), zavVar.m());
    }

    public final b m() {
        IBinder iBinder = this.C;
        if (iBinder == null) {
            return null;
        }
        return b.a.G(iBinder);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, this.B);
        JM0.j(parcel, 2, this.C, false);
        JM0.p(parcel, 3, this.D, i, false);
        JM0.c(parcel, 4, this.E);
        JM0.c(parcel, 5, this.F);
        JM0.b(parcel, iA);
    }
}
