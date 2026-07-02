package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class zzen extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzen> CREATOR = new zzeo();
    public final int B;
    public final int C;
    public final String D;

    public zzen() {
        this(ModuleDescriptor.MODULE_VERSION, 233702000, "22.5.0");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, this.B);
        JM0.k(parcel, 2, this.C);
        JM0.q(parcel, 3, this.D, false);
        JM0.b(parcel, iA);
    }

    public final int zza() {
        return this.C;
    }

    public final String zzb() {
        return this.D;
    }

    public zzen(int i, int i2, String str) {
        this.B = i;
        this.C = i2;
        this.D = str;
    }
}
