package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: loaded from: classes3.dex */
public final class XL2 extends AbstractC6395lz1 implements ZL2 {
    public XL2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IGassClearcut");
    }

    @Override // com.daaw.ZL2
    public final void C(int[] iArr) {
        Parcel parcelB = B();
        parcelB.writeIntArray(null);
        I(4, parcelB);
    }

    @Override // com.daaw.ZL2
    public final void a2(InterfaceC7934rX interfaceC7934rX, String str, String str2) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeString(str);
        parcelB.writeString(null);
        I(8, parcelB);
    }

    @Override // com.daaw.ZL2
    public final void b(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(7, parcelB);
    }

    @Override // com.daaw.ZL2
    public final void n(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(6, parcelB);
    }

    @Override // com.daaw.ZL2
    public final void x(byte[] bArr) {
        Parcel parcelB = B();
        parcelB.writeByteArray(bArr);
        I(5, parcelB);
    }

    @Override // com.daaw.ZL2
    public final void zzf() {
        I(3, B());
    }
}
