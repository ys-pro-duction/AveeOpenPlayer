package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C4270eS1;
import com.daaw.JM0;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbzo> CREATOR = new C4270eS1();
    public final String B;
    public final String C;
    public final zzq D;
    public final zzl E;

    public zzbzo(String str, String str2, zzq zzqVar, zzl zzlVar) {
        this.B = str;
        this.C = str2;
        this.D = zzqVar;
        this.E = zzlVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.q(parcel, 2, this.C, false);
        JM0.p(parcel, 3, this.D, i, false);
        JM0.p(parcel, 4, this.E, i, false);
        JM0.b(parcel, iA);
    }
}
