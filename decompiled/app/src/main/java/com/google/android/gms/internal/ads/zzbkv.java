package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.EJ1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbkv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbkv> CREATOR = new EJ1();
    public final boolean B;
    public final String C;
    public final int D;
    public final byte[] E;
    public final String[] F;
    public final String[] G;
    public final boolean H;
    public final long I;

    public zzbkv(boolean z, String str, int i, byte[] bArr, String[] strArr, String[] strArr2, boolean z2, long j) {
        this.B = z;
        this.C = str;
        this.D = i;
        this.E = bArr;
        this.F = strArr;
        this.G = strArr2;
        this.H = z2;
        this.I = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.B;
        int iA = JM0.a(parcel);
        JM0.c(parcel, 1, z);
        JM0.q(parcel, 2, this.C, false);
        JM0.k(parcel, 3, this.D);
        JM0.f(parcel, 4, this.E, false);
        JM0.r(parcel, 5, this.F, false);
        JM0.r(parcel, 6, this.G, false);
        JM0.c(parcel, 7, this.H);
        JM0.n(parcel, 8, this.I);
        JM0.b(parcel, iA);
    }
}
