package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.zt3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC10284zt3 extends GC1 implements InterfaceC1186Im1 {
    public AbstractBinderC10284zt3() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static InterfaceC1186Im1 G(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return iInterfaceQueryLocalInterface instanceof InterfaceC1186Im1 ? (InterfaceC1186Im1) iInterfaceQueryLocalInterface : new Ss3(iBinder);
    }

    @Override // com.daaw.GC1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC7934rX interfaceC7934rXZzd = zzd();
            parcel2.writeNoException();
            AbstractC7359pS1.d(parcel2, interfaceC7934rXZzd);
        } else {
            if (i != 2) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
