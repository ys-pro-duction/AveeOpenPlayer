package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2973Zl1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public class MethodInvocation extends AbstractSafeParcelable {
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C2973Zl1();
    public final int B;
    public final int C;
    public final int D;
    public final long E;
    public final long F;
    public final String G;
    public final String H;
    public final int I;
    public final int J;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.B = i;
        this.C = i2;
        this.D = i3;
        this.E = j;
        this.F = j2;
        this.G = str;
        this.H = str2;
        this.I = i4;
        this.J = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.k(parcel, 2, this.C);
        JM0.k(parcel, 3, this.D);
        JM0.n(parcel, 4, this.E);
        JM0.n(parcel, 5, this.F);
        JM0.q(parcel, 6, this.G, false);
        JM0.q(parcel, 7, this.H, false);
        JM0.k(parcel, 8, this.I);
        JM0.k(parcel, 9, this.J);
        JM0.b(parcel, iA);
    }
}
