package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC0451Bn;
import com.daaw.AbstractC8022rp0;
import com.daaw.JM0;
import com.daaw.VC1;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class Status extends AbstractSafeParcelable implements ReflectedParcelable {
    public final int B;
    public final String C;
    public final PendingIntent D;
    public final ConnectionResult E;
    public static final Status F = new Status(-1);
    public static final Status G = new Status(0);
    public static final Status H = new Status(14);
    public static final Status I = new Status(8);
    public static final Status J = new Status(15);
    public static final Status K = new Status(16);
    public static final Status M = new Status(17);
    public static final Status L = new Status(18);
    public static final Parcelable.Creator<Status> CREATOR = new VC1();

    public Status(int i, String str, PendingIntent pendingIntent, ConnectionResult connectionResult) {
        this.B = i;
        this.C = str;
        this.D = pendingIntent;
        this.E = connectionResult;
    }

    public final String D() {
        String str = this.C;
        return str != null ? str : AbstractC0451Bn.a(this.B);
    }

    public ConnectionResult e() {
        return this.E;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.B == status.B && AbstractC8022rp0.a(this.C, status.C) && AbstractC8022rp0.a(this.D, status.D) && AbstractC8022rp0.a(this.E, status.E);
    }

    public int hashCode() {
        return AbstractC8022rp0.b(Integer.valueOf(this.B), this.C, this.D, this.E);
    }

    public int m() {
        return this.B;
    }

    public String p() {
        return this.C;
    }

    public boolean s() {
        return this.D != null;
    }

    public String toString() {
        AbstractC8022rp0.a aVarC = AbstractC8022rp0.c(this);
        aVarC.a("statusCode", D());
        aVarC.a("resolution", this.D);
        return aVarC.toString();
    }

    public boolean v() {
        return this.B <= 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, m());
        JM0.q(parcel, 2, p(), false);
        JM0.p(parcel, 3, this.D, i, false);
        JM0.p(parcel, 4, e(), i, false);
        JM0.b(parcel, iA);
    }

    public Status(int i) {
        this(i, (String) null);
    }

    public Status(ConnectionResult connectionResult, String str) {
        this(connectionResult, str, 17);
    }

    public Status(int i, String str) {
        this(i, str, (PendingIntent) null);
    }

    public Status(ConnectionResult connectionResult, String str, int i) {
        this(i, str, connectionResult.p(), connectionResult);
    }

    public Status(int i, String str, PendingIntent pendingIntent) {
        this(i, str, pendingIntent, null);
    }
}
