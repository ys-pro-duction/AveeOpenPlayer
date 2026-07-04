package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.om1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7172om1 implements IInterface {
    public final IBinder B;
    public final String C = "com.google.android.gms.appset.internal.IAppSetService";

    public AbstractC7172om1(IBinder iBinder, String str) {
        this.B = iBinder;
    }

    public final Parcel B() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.C);
        return parcelObtain;
    }

    public final void G(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.B.transact(1, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.B;
    }
}
