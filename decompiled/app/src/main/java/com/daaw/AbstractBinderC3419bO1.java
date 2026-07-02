package com.daaw;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.bO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3419bO1 extends AbstractBinderC6674mz1 implements InterfaceC3697cO1 {
    public AbstractBinderC3419bO1() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static InterfaceC3697cO1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3697cO1 ? (InterfaceC3697cO1) iInterfaceQueryLocalInterface : new C3140aO1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            Intent intent = (Intent) AbstractC6953nz1.a(parcel, Intent.CREATOR);
            AbstractC6953nz1.c(parcel);
            J(intent);
        } else if (i == 2) {
            InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            AbstractC6953nz1.c(parcel);
            v0(interfaceC7934rXG, string, string2);
        } else if (i == 3) {
            zzh();
        } else if (i == 4) {
            InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            H(interfaceC7934rXG2);
        } else {
            if (i != 5) {
                return false;
            }
            String[] strArrCreateStringArray = parcel.createStringArray();
            int[] iArrCreateIntArray = parcel.createIntArray();
            InterfaceC7934rX interfaceC7934rXG3 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            T1(strArrCreateStringArray, iArrCreateIntArray, interfaceC7934rXG3);
        }
        parcel2.writeNoException();
        return true;
    }
}
