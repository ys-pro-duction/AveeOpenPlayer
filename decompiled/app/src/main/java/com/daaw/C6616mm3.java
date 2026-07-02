package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.mm3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6616mm3 extends AbstractC7451pm1 implements IInterface {
    public C6616mm3(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int I(InterfaceC7934rX interfaceC7934rX, String str, boolean z) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(z ? 1 : 0);
        Parcel parcelB = B(3, parcelG);
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }

    public final int Z2(InterfaceC7934rX interfaceC7934rX, String str, boolean z) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(z ? 1 : 0);
        Parcel parcelB = B(5, parcelG);
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }

    public final InterfaceC7934rX a3(InterfaceC7934rX interfaceC7934rX, String str, int i) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        Parcel parcelB = B(2, parcelG);
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC7934rXG;
    }

    public final InterfaceC7934rX b3(InterfaceC7934rX interfaceC7934rX, String str, int i, InterfaceC7934rX interfaceC7934rX2) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        AbstractC7359pS1.d(parcelG, interfaceC7934rX2);
        Parcel parcelB = B(8, parcelG);
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC7934rXG;
    }

    public final InterfaceC7934rX c3(InterfaceC7934rX interfaceC7934rX, String str, int i) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(i);
        Parcel parcelB = B(4, parcelG);
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC7934rXG;
    }

    public final InterfaceC7934rX d3(InterfaceC7934rX interfaceC7934rX, String str, boolean z, long j) {
        Parcel parcelG = G();
        AbstractC7359pS1.d(parcelG, interfaceC7934rX);
        parcelG.writeString(str);
        parcelG.writeInt(z ? 1 : 0);
        parcelG.writeLong(j);
        Parcel parcelB = B(7, parcelG);
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelB.readStrongBinder());
        parcelB.recycle();
        return interfaceC7934rXG;
    }

    public final int zze() {
        Parcel parcelB = B(6, G());
        int i = parcelB.readInt();
        parcelB.recycle();
        return i;
    }
}
