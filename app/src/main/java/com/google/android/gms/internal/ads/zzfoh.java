package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.NL2;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfoh extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoh> CREATOR = new NL2();
    public final int B;
    public final int C;
    public final String D;
    public final String E;
    public final int F;

    public zzfoh(int i, int i2, int i3, String str, String str2) {
        this.B = i;
        this.C = i2;
        this.D = str;
        this.E = str2;
        this.F = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.k(parcel, 2, this.C);
        JM0.q(parcel, 3, this.D, false);
        JM0.q(parcel, 4, this.E, false);
        JM0.k(parcel, 5, this.F);
        JM0.b(parcel, iA);
    }

    public zzfoh(int i, int i2, String str, String str2) {
        this(1, 1, i2 - 1, str, str2);
    }
}
