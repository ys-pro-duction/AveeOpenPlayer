package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import com.daaw.BinderC7744qp0;
import com.daaw.InterfaceC7934rX;
import com.daaw.JM0;
import com.daaw.NO1;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbtt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbtt> CREATOR = new NO1();
    public final View B;
    public final Map C;

    public zzbtt(IBinder iBinder, IBinder iBinder2) {
        this.B = (View) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder));
        this.C = (Map) BinderC7744qp0.I(InterfaceC7934rX.a.G(iBinder2));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        View view = this.B;
        int iA = JM0.a(parcel);
        JM0.j(parcel, 1, BinderC7744qp0.Z2(view).asBinder(), false);
        JM0.j(parcel, 2, BinderC7744qp0.Z2(this.C).asBinder(), false);
        JM0.b(parcel, iA);
    }
}
