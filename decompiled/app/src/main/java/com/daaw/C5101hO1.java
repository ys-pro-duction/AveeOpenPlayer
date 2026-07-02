package com.daaw;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.hO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5101hO1 extends AbstractC6395lz1 implements InterfaceC5660jO1 {
    public C5101hO1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final boolean zzH() {
        Parcel parcelG = G(11, B());
        boolean zG = AbstractC6953nz1.g(parcelG);
        parcelG.recycle();
        return zG;
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzh(int i, int i2, Intent intent) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeInt(i2);
        AbstractC6953nz1.d(parcelB, intent);
        I(12, parcelB);
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzi() {
        I(10, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzk(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(13, parcelB);
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzl(Bundle bundle) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, bundle);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzm() {
        I(8, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzo() {
        I(5, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzp(int i, String[] strArr, int[] iArr) {
        Parcel parcelB = B();
        parcelB.writeInt(i);
        parcelB.writeStringArray(strArr);
        parcelB.writeIntArray(iArr);
        I(15, parcelB);
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzq() {
        I(2, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzr() {
        I(4, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzs(Bundle bundle) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, bundle);
        Parcel parcelG = G(6, parcelB);
        if (parcelG.readInt() != 0) {
            bundle.readFromParcel(parcelG);
        }
        parcelG.recycle();
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzt() {
        I(3, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzu() {
        I(7, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzv() {
        I(14, B());
    }

    @Override // com.daaw.InterfaceC5660jO1
    public final void zzx() {
        I(9, B());
    }
}
