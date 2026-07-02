package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C3681cK1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbls extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbls> CREATOR = new C3681cK1();
    public final int B;
    public final int C;
    public final String D;
    public final int E;

    public zzbls(int i, int i2, String str, int i3) {
        this.B = i;
        this.C = i2;
        this.D = str;
        this.E = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.C;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.q(parcel, 2, this.D, false);
        JM0.k(parcel, 3, this.E);
        JM0.k(parcel, 1000, this.B);
        JM0.b(parcel, iA);
    }
}
