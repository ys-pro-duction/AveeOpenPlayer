package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzbs extends AbstractBinderC6674mz1 implements zzbt {
    public zzbs() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            String string = parcel.readString();
            String string2 = parcel.readString();
            AbstractC6953nz1.c(parcel);
            boolean zZzf = zzf(interfaceC7934rXG, string, string2);
            parcel2.writeNoException();
            parcel2.writeInt(zZzf ? 1 : 0);
        } else {
            if (i != 2) {
                return false;
            }
            InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
            AbstractC6953nz1.c(parcel);
            zze(interfaceC7934rXG2);
            parcel2.writeNoException();
        }
        return true;
    }
}
