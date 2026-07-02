package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import com.daaw.AbstractBinderC6674mz1;
import com.daaw.AbstractC6953nz1;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: loaded from: classes.dex */
public abstract class zzdi extends AbstractBinderC6674mz1 implements zzdj {
    public zzdi() {
        super("com.google.android.gms.ads.internal.client.IOutOfContextTester");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        String string = parcel.readString();
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
        InterfaceC7934rX interfaceC7934rXG2 = InterfaceC7934rX.a.G(parcel.readStrongBinder());
        AbstractC6953nz1.c(parcel);
        zze(string, interfaceC7934rXG, interfaceC7934rXG2);
        parcel2.writeNoException();
        return true;
    }
}
