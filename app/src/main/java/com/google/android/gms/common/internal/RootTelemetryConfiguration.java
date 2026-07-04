package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C3278as1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C3278as1();
    public final int B;
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.B = i;
        this.C = z;
        this.D = z2;
        this.E = i2;
        this.F = i3;
    }

    public int e() {
        return this.E;
    }

    public int m() {
        return this.F;
    }

    public boolean p() {
        return this.C;
    }

    public boolean s() {
        return this.D;
    }

    public int v() {
        return this.B;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, v());
        JM0.c(parcel, 2, p());
        JM0.c(parcel, 3, s());
        JM0.k(parcel, 4, e());
        JM0.k(parcel, 5, m());
        JM0.b(parcel, iA);
    }
}
