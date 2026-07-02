package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.uG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8705uG1 extends AbstractC6395lz1 implements InterfaceC9270wG1 {
    public C8705uG1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final InterfaceC7934rX zzb(String str) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        Parcel parcelG = G(2, parcelB);
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcelG.readStrongBinder());
        parcelG.recycle();
        return interfaceC7934rXG;
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzbA(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(6, parcelB);
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzbB(InterfaceC7311pG1 interfaceC7311pG1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7311pG1);
        I(8, parcelB);
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzbC(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(9, parcelB);
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzbD(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(3, parcelB);
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzbz(String str, InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzc() {
        I(4, B());
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zzd(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(7, parcelB);
    }

    @Override // com.daaw.InterfaceC9270wG1
    public final void zze(InterfaceC7934rX interfaceC7934rX, int i) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeInt(i);
        I(5, parcelB);
    }
}
