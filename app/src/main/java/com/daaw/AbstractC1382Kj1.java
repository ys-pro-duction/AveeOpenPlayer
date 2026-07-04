package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.Kj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1382Kj1 implements IInterface {
    public final IBinder B;
    public final String C = "com.google.android.play.core.integrity.protocol.IIntegrityService";

    public AbstractC1382Kj1(IBinder iBinder, String str) {
        this.B = iBinder;
    }

    public final Parcel B() {
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.writeInterfaceToken(this.C);
        return parcelObtain;
    }

    public final void G(int i, Parcel parcel) {
        try {
            this.B.transact(2, parcel, null, 1);
        } finally {
            parcel.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.B;
    }
}
