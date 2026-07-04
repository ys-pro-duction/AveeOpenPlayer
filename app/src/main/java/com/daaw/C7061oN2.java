package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.oN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7061oN2 extends AbstractC6395lz1 implements InterfaceC7619qN2 {
    public C7061oN2(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.lmd.protocol.ILmdOverlayService");
    }

    @Override // com.daaw.InterfaceC7619qN2
    public final void M(Bundle bundle, InterfaceC8176sN2 interfaceC8176sN2) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, bundle);
        AbstractC6953nz1.f(parcelB, interfaceC8176sN2);
        Z2(3, parcelB);
    }

    @Override // com.daaw.InterfaceC7619qN2
    public final void c2(Bundle bundle, InterfaceC8176sN2 interfaceC8176sN2) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, bundle);
        AbstractC6953nz1.f(parcelB, interfaceC8176sN2);
        Z2(2, parcelB);
    }

    @Override // com.daaw.InterfaceC7619qN2
    public final void t1(String str, Bundle bundle, InterfaceC8176sN2 interfaceC8176sN2) {
        Parcel parcelB = B();
        parcelB.writeString(str);
        AbstractC6953nz1.d(parcelB, bundle);
        AbstractC6953nz1.f(parcelB, interfaceC8176sN2);
        Z2(1, parcelB);
    }
}
