package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C5664jP1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbum extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbum> CREATOR = new C5664jP1();
    public final boolean B;
    public final List C;

    public zzbum(boolean z, List list) {
        this.B = z;
        this.C = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.B;
        int iA = JM0.a(parcel);
        JM0.c(parcel, 2, z);
        JM0.s(parcel, 3, this.C, false);
        JM0.b(parcel, iA);
    }
}
