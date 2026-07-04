package android.support.v4.os;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public interface a extends IInterface {
    public static final String a = "android$support$v4$os$IResultReceiver".replace('$', '.');

    /* JADX INFO: renamed from: android.support.v4.os.a$a, reason: collision with other inner class name */
    public static abstract class AbstractBinderC0001a extends Binder implements a {

        /* JADX INFO: renamed from: android.support.v4.os.a$a$a, reason: collision with other inner class name */
        public static class C0002a implements a {
            public IBinder B;

            public C0002a(IBinder iBinder) {
                this.B = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.B;
            }
        }

        public AbstractBinderC0001a() {
            attachInterface(this, a.a);
        }

        public static a B(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(a.a);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof a)) ? new C0002a(iBinder) : (a) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            String str = a.a;
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface(str);
            }
            if (i == 1598968902) {
                parcel2.writeString(str);
                return true;
            }
            if (i != 1) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            X2(parcel.readInt(), (Bundle) b.b(parcel, Bundle.CREATOR));
            return true;
        }
    }

    public static class b {
        public static Object b(Parcel parcel, Parcelable.Creator creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }
    }

    void X2(int i, Bundle bundle);
}
