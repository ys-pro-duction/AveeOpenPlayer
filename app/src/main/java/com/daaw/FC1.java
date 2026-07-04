package com.daaw;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FC1 extends Binder implements IInterface {
    public FC1(String str) {
        attachInterface(this, "com.google.android.gms.appset.internal.IAppSetIdCallback");
    }

    public abstract boolean B(int i, Parcel parcel, Parcel parcel2, int i2);

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            parcel.enforceInterface(getInterfaceDescriptor());
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        return B(i, parcel, parcel2, i2);
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }
}
