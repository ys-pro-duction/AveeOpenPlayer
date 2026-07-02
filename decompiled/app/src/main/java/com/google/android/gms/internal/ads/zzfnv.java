package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.BL2;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfnv extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnv> CREATOR = new BL2();
    public final int B;
    public final byte[] C;

    public zzfnv(int i, byte[] bArr) {
        this.B = i;
        this.C = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.f(parcel, 2, this.C, false);
        JM0.b(parcel, iA);
    }

    public zzfnv(byte[] bArr) {
        this(1, bArr);
    }
}
