package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.C1909Pl1;
import com.daaw.JM0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class zag extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zag> CREATOR = new C1909Pl1();
    public final List B;
    public final String C;

    public zag(List list, String str) {
        this.B = list;
        this.C = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.B;
        int iA = JM0.a(parcel);
        JM0.s(parcel, 1, list, false);
        JM0.q(parcel, 2, this.C, false);
        JM0.b(parcel, iA);
    }
}
