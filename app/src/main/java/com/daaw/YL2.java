package com.daaw;

import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: loaded from: classes3.dex */
public abstract class YL2 extends AbstractBinderC6674mz1 implements ZL2 {
    public YL2() {
        super("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                parcel.readString();
                AbstractC6953nz1.c(parcel);
                break;
            case 3:
                break;
            case 4:
                parcel.createIntArray();
                AbstractC6953nz1.c(parcel);
                break;
            case 5:
                parcel.createByteArray();
                AbstractC6953nz1.c(parcel);
                break;
            case 6:
                parcel.readInt();
                AbstractC6953nz1.c(parcel);
                break;
            case 7:
                parcel.readInt();
                AbstractC6953nz1.c(parcel);
                break;
            case 8:
                InterfaceC7934rX.a.G(parcel.readStrongBinder());
                parcel.readString();
                parcel.readString();
                AbstractC6953nz1.c(parcel);
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
