package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.JM0;
import com.daaw.OL2;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zzfoj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoj> CREATOR = new OL2();
    public final int B;
    public final byte[] C;
    public final int D;

    public zzfoj(int i, byte[] bArr, int i2) {
        this.B = i;
        this.C = bArr == null ? null : Arrays.copyOf(bArr, bArr.length);
        this.D = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.f(parcel, 2, this.C, false);
        JM0.k(parcel, 3, this.D);
        JM0.b(parcel, iA);
    }

    public zzfoj(byte[] bArr, int i) {
        this(1, null, 1);
    }
}
