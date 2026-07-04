package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: loaded from: classes.dex */
public final class Ss3 extends AbstractC7451pm1 implements InterfaceC1186Im1 {
    public Ss3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // com.daaw.InterfaceC1186Im1
    public final int zzc() {
        Parcel parcelB = B(2, G());
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }

    @Override // com.daaw.InterfaceC1186Im1
    public final InterfaceC7934rX zzd() {
        Parcel parcelB = B(1, G());
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC7934rXG;
    }
}
