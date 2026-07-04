package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbtt;
import com.google.android.gms.internal.ads.zzbzo;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class YR1 extends AbstractC6395lz1 implements InterfaceC3156aS1 {
    public YR1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zze(InterfaceC7934rX interfaceC7934rX, zzbzo zzbzoVar, XR1 xr1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.d(parcelB, zzbzoVar);
        AbstractC6953nz1.f(parcelB, xr1);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzf(zzbtt zzbttVar) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbttVar);
        I(7, parcelB);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzg(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        Parcel parcelB = B();
        parcelB.writeTypedList(list);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, eo1);
        I(10, parcelB);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzh(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        Parcel parcelB = B();
        parcelB.writeTypedList(list);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, eo1);
        I(9, parcelB);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzi(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(8, parcelB);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzj(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzk(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        Parcel parcelB = B();
        parcelB.writeTypedList(list);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, eo1);
        I(6, parcelB);
    }

    @Override // com.daaw.InterfaceC3156aS1
    public final void zzl(List list, InterfaceC7934rX interfaceC7934rX, EO1 eo1) {
        Parcel parcelB = B();
        parcelB.writeTypedList(list);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        AbstractC6953nz1.f(parcelB, eo1);
        I(5, parcelB);
    }
}
