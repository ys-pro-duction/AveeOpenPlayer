package com.daaw;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.aO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3140aO1 extends AbstractC6395lz1 implements InterfaceC3697cO1 {
    public C3140aO1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void H(InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(4, parcelB);
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void J(Intent intent) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, intent);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void T1(String[] strArr, int[] iArr, InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        parcelB.writeStringArray(strArr);
        parcelB.writeIntArray(iArr);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(5, parcelB);
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void v0(InterfaceC7934rX interfaceC7934rX, String str, String str2) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        parcelB.writeString(str);
        parcelB.writeString(str2);
        I(2, parcelB);
    }

    @Override // com.daaw.InterfaceC3697cO1
    public final void zzh() {
        I(3, B());
    }
}
