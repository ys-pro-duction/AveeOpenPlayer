package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzblg;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class XJ1 extends AbstractBinderC6674mz1 implements YJ1 {
    public XJ1() {
        super("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
    }

    public static YJ1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.initialization.IInitializationCallback");
        return iInterfaceQueryLocalInterface instanceof YJ1 ? (YJ1) iInterfaceQueryLocalInterface : new WJ1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzblg.CREATOR);
        AbstractC6953nz1.c(parcel);
        W1(arrayListCreateTypedArrayList);
        parcel2.writeNoException();
        return true;
    }
}
