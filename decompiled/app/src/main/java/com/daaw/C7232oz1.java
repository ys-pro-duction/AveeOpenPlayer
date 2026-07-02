package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.oz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7232oz1 extends AbstractC6395lz1 implements InterfaceC7790qz1 {
    public C7232oz1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.daaw.InterfaceC7790qz1
    public final void C(int[] iArr) {
        Parcel parcelB = B();
        parcelB.writeIntArray(null);
        I(4, parcelB);
    }

    @Override // com.daaw.InterfaceC7790qz1
    public final void S(InterfaceC7934rX interfaceC7934rX, String str) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeString("GMA_SDK");
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC7790qz1
    public final void b(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        I(7, parcelB);
    }

    @Override // com.daaw.InterfaceC7790qz1
    public final void n(int i) {
        Parcel parcelB = B();
        parcelB.writeInt(0);
        I(6, parcelB);
    }

    @Override // com.daaw.InterfaceC7790qz1
    public final void x(byte[] bArr) {
        Parcel parcelB = B();
        parcelB.writeByteArray(bArr);
        I(5, parcelB);
    }

    @Override // com.daaw.InterfaceC7790qz1
    public final void zzf() {
        I(3, B());
    }
}
