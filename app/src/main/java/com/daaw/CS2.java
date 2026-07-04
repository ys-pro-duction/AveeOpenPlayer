package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.appset.zza;

/* JADX INFO: loaded from: classes3.dex */
public final class CS2 extends AbstractC7172om1 implements IInterface {
    public CS2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.appset.internal.IAppSetService");
    }

    public final void I(zza zzaVar, InterfaceC9538xD2 interfaceC9538xD2) {
        Parcel parcelB = B();
        ES1.b(parcelB, zzaVar);
        ES1.c(parcelB, interfaceC9538xD2);
        G(1, parcelB);
    }
}
