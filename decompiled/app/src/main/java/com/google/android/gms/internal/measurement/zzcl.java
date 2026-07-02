package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C3314b02;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcl> CREATOR = new C3314b02();
    public final long B;
    public final long C;
    public final boolean D;
    public final String E;
    public final String F;
    public final String G;
    public final Bundle H;
    public final String I;

    public zzcl(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.B = j;
        this.C = j2;
        this.D = z;
        this.E = str;
        this.F = str2;
        this.G = str3;
        this.H = bundle;
        this.I = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.n(parcel, 1, this.B);
        JM0.n(parcel, 2, this.C);
        JM0.c(parcel, 3, this.D);
        JM0.q(parcel, 4, this.E, false);
        JM0.q(parcel, 5, this.F, false);
        JM0.q(parcel, 6, this.G, false);
        JM0.e(parcel, 7, this.H, false);
        JM0.q(parcel, 8, this.I, false);
        JM0.b(parcel, iA);
    }
}
