package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.jG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC5625jG1 extends AbstractBinderC6674mz1 implements InterfaceC5907kG1 {
    public AbstractBinderC5625jG1() {
        super("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
    }

    public static InterfaceC5907kG1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC5907kG1 ? (InterfaceC5907kG1) iInterfaceQueryLocalInterface : new C5348iG1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 2) {
            String strZzg = zzg();
            parcel2.writeNoException();
            parcel2.writeString(strZzg);
            return true;
        }
        if (i != 3) {
            return false;
        }
        List listZzh = zzh();
        parcel2.writeNoException();
        parcel2.writeList(listZzh);
        return true;
    }
}
