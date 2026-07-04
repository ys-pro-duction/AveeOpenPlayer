package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public abstract class DO1 extends AbstractBinderC6674mz1 implements EO1 {
    public DO1() {
        super("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
    }

    public static EO1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.query.IUpdateUrlsCallback");
        return iInterfaceQueryLocalInterface instanceof EO1 ? (EO1) iInterfaceQueryLocalInterface : new CO1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Uri.CREATOR);
            AbstractC6953nz1.c(parcel);
            s0(arrayListCreateTypedArrayList);
        } else {
            if (i != 2) {
                return false;
            }
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            a(string);
        }
        parcel2.writeNoException();
        return true;
    }
}
