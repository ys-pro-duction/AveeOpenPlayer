package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C2761Xk1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes3.dex */
public final class zaa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zaa> CREATOR = new C2761Xk1();
    public final int B;
    public int C;
    public Intent D;

    public zaa(int i, int i2, Intent intent) {
        this.B = i;
        this.C = i2;
        this.D = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2 = this.B;
        int iA = JM0.a(parcel);
        JM0.k(parcel, 1, i2);
        JM0.k(parcel, 2, this.C);
        JM0.p(parcel, 3, this.D, i, false);
        JM0.b(parcel, iA);
    }
}
