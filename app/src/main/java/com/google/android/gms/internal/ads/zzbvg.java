package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.GP1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbvg extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbvg> CREATOR = new GP1();
    public final Bundle B;
    public final zzcaz C;
    public final ApplicationInfo D;
    public final String E;
    public final List F;
    public final PackageInfo G;
    public final String H;
    public final String I;
    public zzffh J;
    public String K;
    public final boolean L;
    public final boolean M;

    public zzbvg(Bundle bundle, zzcaz zzcazVar, ApplicationInfo applicationInfo, String str, List list, PackageInfo packageInfo, String str2, String str3, zzffh zzffhVar, String str4, boolean z, boolean z2) {
        this.B = bundle;
        this.C = zzcazVar;
        this.E = str;
        this.D = applicationInfo;
        this.F = list;
        this.G = packageInfo;
        this.H = str2;
        this.I = str3;
        this.J = zzffhVar;
        this.K = str4;
        this.L = z;
        this.M = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = this.B;
        int iA = JM0.a(parcel);
        JM0.e(parcel, 1, bundle, false);
        JM0.p(parcel, 2, this.C, i, false);
        JM0.p(parcel, 3, this.D, i, false);
        JM0.q(parcel, 4, this.E, false);
        JM0.s(parcel, 5, this.F, false);
        JM0.p(parcel, 6, this.G, i, false);
        JM0.q(parcel, 7, this.H, false);
        JM0.q(parcel, 9, this.I, false);
        JM0.p(parcel, 10, this.J, i, false);
        JM0.q(parcel, 11, this.K, false);
        JM0.c(parcel, 12, this.L);
        JM0.c(parcel, 13, this.M);
        JM0.b(parcel, iA);
    }
}
