package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C5384iP1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbuk extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbuk> CREATOR = new C5384iP1();
    public final ApplicationInfo B;
    public final String C;
    public final PackageInfo D;
    public final String E;
    public final int F;
    public final String G;
    public final List H;
    public final boolean I;
    public final boolean J;

    public zzbuk(ApplicationInfo applicationInfo, String str, PackageInfo packageInfo, String str2, int i, String str3, List list, boolean z, boolean z2) {
        this.C = str;
        this.B = applicationInfo;
        this.D = packageInfo;
        this.E = str2;
        this.F = i;
        this.G = str3;
        this.H = list;
        this.I = z;
        this.J = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        ApplicationInfo applicationInfo = this.B;
        int iA = JM0.a(parcel);
        JM0.p(parcel, 1, applicationInfo, i, false);
        JM0.q(parcel, 2, this.C, false);
        JM0.p(parcel, 3, this.D, i, false);
        JM0.q(parcel, 4, this.E, false);
        JM0.k(parcel, 5, this.F);
        JM0.q(parcel, 6, this.G, false);
        JM0.s(parcel, 7, this.H, false);
        JM0.c(parcel, 8, this.I);
        JM0.c(parcel, 9, this.J);
        JM0.b(parcel, iA);
    }
}
