package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.daaw.AbstractC7506py0;
import com.daaw.C9417wn3;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new C9417wn3();
    public final String B;
    public final String C;
    public final String D;
    public final String E;
    public final long F;
    public final long G;
    public final String H;
    public final boolean I;
    public final boolean J;
    public final long K;
    public final String L;
    public final long M;
    public final long N;
    public final int O;
    public final boolean P;
    public final boolean Q;
    public final String R;
    public final Boolean S;
    public final long T;
    public final List U;
    public final String V;
    public final String W;
    public final String X;
    public final String Y;
    public final boolean Z;
    public final long a0;

    public zzq(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11, boolean z5, long j7) {
        AbstractC7506py0.f(str);
        this.B = str;
        this.C = true == TextUtils.isEmpty(str2) ? null : str2;
        this.D = str3;
        this.K = j;
        this.E = str4;
        this.F = j2;
        this.G = j3;
        this.H = str5;
        this.I = z;
        this.J = z2;
        this.L = str6;
        this.M = 0L;
        this.N = j5;
        this.O = i;
        this.P = z3;
        this.Q = z4;
        this.R = str7;
        this.S = bool;
        this.T = j6;
        this.U = list;
        this.V = null;
        this.W = str9;
        this.X = str10;
        this.Y = str11;
        this.Z = z5;
        this.a0 = j7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, this.B, false);
        JM0.q(parcel, 3, this.C, false);
        JM0.q(parcel, 4, this.D, false);
        JM0.q(parcel, 5, this.E, false);
        JM0.n(parcel, 6, this.F);
        JM0.n(parcel, 7, this.G);
        JM0.q(parcel, 8, this.H, false);
        JM0.c(parcel, 9, this.I);
        JM0.c(parcel, 10, this.J);
        JM0.n(parcel, 11, this.K);
        JM0.q(parcel, 12, this.L, false);
        JM0.n(parcel, 13, this.M);
        JM0.n(parcel, 14, this.N);
        JM0.k(parcel, 15, this.O);
        JM0.c(parcel, 16, this.P);
        JM0.c(parcel, 18, this.Q);
        JM0.q(parcel, 19, this.R, false);
        JM0.d(parcel, 21, this.S, false);
        JM0.n(parcel, 22, this.T);
        JM0.s(parcel, 23, this.U, false);
        JM0.q(parcel, 24, this.V, false);
        JM0.q(parcel, 25, this.W, false);
        JM0.q(parcel, 26, this.X, false);
        JM0.q(parcel, 27, this.Y, false);
        JM0.c(parcel, 28, this.Z);
        JM0.n(parcel, 29, this.a0);
        JM0.b(parcel, iA);
    }

    public zzq(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, String str7, Boolean bool, long j6, List list, String str8, String str9, String str10, String str11, boolean z5, long j7) {
        this.B = str;
        this.C = str2;
        this.D = str3;
        this.K = j3;
        this.E = str4;
        this.F = j;
        this.G = j2;
        this.H = str5;
        this.I = z;
        this.J = z2;
        this.L = str6;
        this.M = j4;
        this.N = j5;
        this.O = i;
        this.P = z3;
        this.Q = z4;
        this.R = str7;
        this.S = bool;
        this.T = j6;
        this.U = list;
        this.V = str8;
        this.W = str9;
        this.X = str10;
        this.Y = str11;
        this.Z = z5;
        this.a0 = j7;
    }
}
