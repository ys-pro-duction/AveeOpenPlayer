package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.common.internal.GetServiceRequest;

/* JADX INFO: renamed from: com.daaw.Go1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0986Go1 implements InterfaceC6261lX {
    public final IBinder B;

    public C0986Go1(IBinder iBinder) {
        this.B = iBinder;
    }

    @Override // com.daaw.InterfaceC6261lX
    public final void I2(InterfaceC5973kX interfaceC5973kX, GetServiceRequest getServiceRequest) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(interfaceC5973kX != null ? interfaceC5973kX.asBinder() : null);
            if (getServiceRequest != null) {
                parcelObtain.writeInt(1);
                C9108vh3.a(getServiceRequest, parcelObtain, 0);
            } else {
                parcelObtain.writeInt(0);
            }
            this.B.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
            parcelObtain2.recycle();
            parcelObtain.recycle();
        } catch (Throwable th) {
            parcelObtain2.recycle();
            parcelObtain.recycle();
            throw th;
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.B;
    }
}
