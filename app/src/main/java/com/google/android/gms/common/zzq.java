package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.AbstractC9516x82;
import com.daaw.C10254zn3;
import com.daaw.JM0;
import com.daaw.Rs3;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C10254zn3();
    public final boolean B;
    public final String C;
    public final int D;
    public final int E;

    public zzq(boolean z, String str, int i, int i2) {
        this.B = z;
        this.C = str;
        this.D = Rs3.a(i) - 1;
        this.E = AbstractC9516x82.a(i2) - 1;
    }

    public final String e() {
        return this.C;
    }

    public final boolean m() {
        return this.B;
    }

    public final int p() {
        return AbstractC9516x82.a(this.E);
    }

    public final int s() {
        return Rs3.a(this.D);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.c(parcel, 1, this.B);
        JM0.q(parcel, 2, this.C, false);
        JM0.k(parcel, 3, this.D);
        JM0.k(parcel, 4, this.E);
        JM0.b(parcel, iA);
    }
}
