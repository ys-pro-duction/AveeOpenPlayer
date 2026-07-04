package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.daaw.AbstractBinderC10284zt3;
import com.daaw.BinderC7687qd3;
import com.daaw.BinderC7744qp0;
import com.daaw.C9985yp3;
import com.daaw.InterfaceC7934rX;
import com.daaw.JM0;
import com.daaw.Qb3;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* JADX INFO: loaded from: classes.dex */
public final class zzs extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new C9985yp3();
    public final String B;
    public final Qb3 C;
    public final boolean D;
    public final boolean E;

    public zzs(String str, Qb3 qb3, boolean z, boolean z2) {
        this.B = str;
        this.C = qb3;
        this.D = z;
        this.E = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.B;
        int iA = JM0.a(parcel);
        JM0.q(parcel, 1, str, false);
        Qb3 qb3 = this.C;
        if (qb3 == null) {
            qb3 = null;
        }
        JM0.j(parcel, 2, qb3, false);
        JM0.c(parcel, 3, this.D);
        JM0.c(parcel, 4, this.E);
        JM0.b(parcel, iA);
    }

    public zzs(String str, IBinder iBinder, boolean z, boolean z2) {
        this.B = str;
        BinderC7687qd3 binderC7687qd3 = null;
        if (iBinder != null) {
            try {
                InterfaceC7934rX interfaceC7934rXZzd = AbstractBinderC10284zt3.G(iBinder).zzd();
                byte[] bArr = interfaceC7934rXZzd == null ? null : (byte[]) BinderC7744qp0.I(interfaceC7934rXZzd);
                if (bArr != null) {
                    binderC7687qd3 = new BinderC7687qd3(bArr);
                }
            } catch (RemoteException unused) {
            }
        }
        this.C = binderC7687qd3;
        this.D = z;
        this.E = z2;
    }
}
