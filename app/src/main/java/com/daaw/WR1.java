package com.daaw;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class WR1 extends AbstractBinderC6674mz1 implements XR1 {
    public WR1() {
        super("com.google.android.gms.ads.internal.signals.ISignalCallback");
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            parcel.readString();
            parcel.readString();
            AbstractC6953nz1.c(parcel);
        } else if (i == 2) {
            String string = parcel.readString();
            AbstractC6953nz1.c(parcel);
            zzb(string);
        } else {
            if (i != 3) {
                return false;
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC6953nz1.a(parcel, Bundle.CREATOR);
            AbstractC6953nz1.c(parcel);
            u0(string2, string3, bundle);
        }
        parcel2.writeNoException();
        return true;
    }
}
