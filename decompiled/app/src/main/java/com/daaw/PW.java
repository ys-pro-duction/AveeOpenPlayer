package com.daaw;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface PW extends IInterface {
    public static final String i = "android$support$customtabs$ICustomTabsService".replace('$', '.');

    public static abstract class a extends Binder implements PW {

        /* JADX INFO: renamed from: com.daaw.PW$a$a, reason: collision with other inner class name */
        public static class C0107a implements PW {
            public IBinder B;

            public C0107a(IBinder iBinder) {
                this.B = iBinder;
            }

            @Override // com.daaw.PW
            public boolean S1(OW ow, Bundle bundle) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PW.i);
                    parcelObtain.writeStrongInterface(ow);
                    b.b(parcelObtain, bundle, 0);
                    this.B.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.daaw.PW
            public boolean Y0(long j) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PW.i);
                    parcelObtain.writeLong(j);
                    this.B.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.B;
            }

            @Override // com.daaw.PW
            public boolean k0(OW ow) {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(PW.i);
                    parcelObtain.writeStrongInterface(ow);
                    this.B.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public static PW B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(PW.i);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof PW)) ? new C0107a(iBinder) : (PW) iInterfaceQueryLocalInterface;
        }
    }

    public static class b {
        public static void b(Parcel parcel, Parcelable parcelable, int i) {
            if (parcelable == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcelable.writeToParcel(parcel, i);
            }
        }
    }

    boolean S1(OW ow, Bundle bundle);

    boolean Y0(long j);

    boolean k0(OW ow);
}
