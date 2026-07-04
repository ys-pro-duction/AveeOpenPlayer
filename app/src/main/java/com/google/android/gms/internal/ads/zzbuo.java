package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C5943kP1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuo> CREATOR = new C5943kP1();
    public final String B;
    public final int C;
    public final Bundle D;
    public final byte[] E;
    public final boolean F;
    public final String G;
    public final String H;

    public zzbuo(String str, int i, Bundle bundle, byte[] bArr, boolean z, String str2, String str3) {
        this.B = str;
        this.C = i;
        this.D = bundle;
        this.E = bArr;
        this.F = z;
        this.G = str2;
        this.H = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.k(parcel, 2, this.C);
        JM0.e(parcel, 3, this.D, false);
        JM0.f(parcel, 4, this.E, false);
        JM0.c(parcel, 5, this.F);
        JM0.q(parcel, 6, this.G, false);
        JM0.q(parcel, 7, this.H, false);
        JM0.b(parcel, iA);
    }
}
