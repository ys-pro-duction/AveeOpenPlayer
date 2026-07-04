package androidx.room;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {

    /* JADX INFO: renamed from: androidx.room.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0030a extends Binder implements a {

        /* JADX INFO: renamed from: androidx.room.a$a$a, reason: collision with other inner class name */
        public static class C0031a implements a {
            public IBinder B;

            public C0031a(IBinder iBinder) {
                this.B = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.B;
            }

            @Override // androidx.room.a
            public void m0(String[] strArr) {
                Parcel parcelObtain = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("androidx.room.IMultiInstanceInvalidationCallback");
                    parcelObtain.writeStringArray(strArr);
                    this.B.transact(1, parcelObtain, null, 1);
                } finally {
                    parcelObtain.recycle();
                }
            }
        }

        public AbstractBinderC0030a() {
            attachInterface(this, "androidx.room.IMultiInstanceInvalidationCallback");
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationCallback");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0031a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i == 1) {
                parcel.enforceInterface("androidx.room.IMultiInstanceInvalidationCallback");
                m0(parcel.createStringArray());
                return true;
            }
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString("androidx.room.IMultiInstanceInvalidationCallback");
            return true;
        }
    }

    void m0(String[] strArr);
}
