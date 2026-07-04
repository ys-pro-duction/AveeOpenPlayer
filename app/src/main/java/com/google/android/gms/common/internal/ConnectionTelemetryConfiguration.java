package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C6586mg3;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C6586mg3();
    public final RootTelemetryConfiguration B;
    public final boolean C;
    public final boolean D;
    public final int[] E;
    public final int F;
    public final int[] G;

    public ConnectionTelemetryConfiguration(RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.B = rootTelemetryConfiguration;
        this.C = z;
        this.D = z2;
        this.E = iArr;
        this.F = i;
        this.G = iArr2;
    }

    public final RootTelemetryConfiguration D() {
        return this.B;
    }

    public int e() {
        return this.F;
    }

    public int[] m() {
        return this.E;
    }

    public int[] p() {
        return this.G;
    }

    public boolean s() {
        return this.C;
    }

    public boolean v() {
        return this.D;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.p(parcel, 1, this.B, i, false);
        JM0.c(parcel, 2, s());
        JM0.c(parcel, 3, v());
        JM0.l(parcel, 4, m(), false);
        JM0.k(parcel, 5, e());
        JM0.l(parcel, 6, p(), false);
        JM0.b(parcel, iA);
    }
}
