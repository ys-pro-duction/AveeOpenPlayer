package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.daaw.BinderC7744qp0;
import com.daaw.InterfaceC7934rX;
import com.daaw.JM0;
import com.daaw.Lk3;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new Lk3();
    public final String B;
    public final boolean C;
    public final boolean D;
    public final Context E;
    public final boolean F;
    public final boolean G;

    public zzo(String str, boolean z, boolean z2, IBinder iBinder, boolean z3, boolean z4) {
        this.B = str;
        this.C = z;
        this.D = z2;
        this.E = (Context) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder));
        this.F = z3;
        this.G = z4;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [android.os.IBinder, com.daaw.rX] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        JM0.c(parcel, 2, this.C);
        JM0.c(parcel, 3, this.D);
        JM0.j(parcel, 4, BinderC7744qp0.Z2(this.E), false);
        JM0.c(parcel, 5, this.F);
        JM0.c(parcel, 6, this.G);
        JM0.b(parcel, iA);
    }
}
