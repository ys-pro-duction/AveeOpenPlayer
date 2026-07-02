package com.daaw;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ZW1 extends MK1 implements FX1 {
    public ZW1() {
        super("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // com.daaw.MK1
    public final boolean B(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            Bundle bundle = (Bundle) AbstractC7888rL1.a(parcel, Bundle.CREATOR);
            long j = parcel.readLong();
            AbstractC7888rL1.c(parcel);
            P(string, string2, bundle, j);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return false;
            }
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        }
        return true;
    }
}
