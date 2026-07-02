package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: loaded from: classes.dex */
public final class Bn3 extends AbstractC7451pm1 implements IInterface {
    public Bn3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final InterfaceC7934rX I(InterfaceC7934rX interfaceC7934rX, String str, int i, InterfaceC7934rX interfaceC7934rX2) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        AbstractC7359pS1.d(parcelG, interfaceC7934rX2);
        Parcel parcelB = B(2, parcelG);
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC7934rXG;
    }

    public final InterfaceC7934rX Z2(InterfaceC7934rX interfaceC7934rX, String str, int i, InterfaceC7934rX interfaceC7934rX2) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        AbstractC7359pS1.d(parcelG, interfaceC7934rX2);
        Parcel parcelB = B(3, parcelG);
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC7934rXG;
    }
}
