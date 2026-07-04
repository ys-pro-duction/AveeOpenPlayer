package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C7642qT1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcaz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcaz> CREATOR = new C7642qT1();
    public String B;
    public int C;
    public int D;
    public boolean E;
    public boolean F;

    public zzcaz(int i, int i2, boolean z, boolean z2) {
        this(233702000, i2, true, false, z2);
    }

    public static zzcaz e() {
        return new zzcaz(12451000, 12451000, true, false, false);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.q(parcel, 2, this.B, false);
        JM0.k(parcel, 3, this.C);
        JM0.k(parcel, 4, this.D);
        JM0.c(parcel, 5, this.E);
        JM0.c(parcel, 6, this.F);
        JM0.b(parcel, iA);
    }

    public zzcaz(int i, int i2, boolean z, boolean z2, boolean z3) {
        this("afma-sdk-a-v" + i + "." + i2 + "." + (z ? "0" : "1"), i, i2, z, z3);
    }

    public zzcaz(String str, int i, int i2, boolean z, boolean z2) {
        this.B = str;
        this.C = i;
        this.D = i2;
        this.E = z;
        this.F = z2;
    }
}
