package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C5388iQ1;
import com.daaw.JM0;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbwd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbwd> CREATOR = new C5388iQ1();
    public final zzl B;
    public final String C;

    public zzbwd(zzl zzlVar, String str) {
        this.B = zzlVar;
        this.C = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zzl zzlVar = this.B;
        int iA = JM0.a(parcel);
        JM0.p(parcel, 2, zzlVar, i, false);
        JM0.q(parcel, 3, this.C, false);
        JM0.b(parcel, iA);
    }
}
