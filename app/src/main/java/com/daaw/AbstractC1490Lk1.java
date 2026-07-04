package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.Lk1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1490Lk1 implements IInterface {
    public final IBinder B;
    public final String C;

    public AbstractC1490Lk1(IBinder iBinder, String str) {
        this.B = iBinder;
        this.C = str;
    }

    public final Parcel B() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.C);
        return parcelObtain;
    }

    public final void G(int i, Parcel parcel) {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.B.transact(i, parcel, parcelObtain, 0);
            parcelObtain.readException();
        } finally {
            parcel.recycle();
            parcelObtain.recycle();
        }
    }

    public final void I(int i, Parcel parcel) {
        try {
            this.B.transact(1, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.B;
    }
}
