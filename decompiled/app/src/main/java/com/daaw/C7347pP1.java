package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzbuk;
import com.google.android.gms.internal.ads.zzbuo;

/* JADX INFO: renamed from: com.daaw.pP1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7347pP1 extends AbstractC6395lz1 implements InterfaceC7904rP1 {
    public C7347pP1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.IAdsService");
    }

    @Override // com.daaw.InterfaceC7904rP1
    public final void c1(zzbuk zzbukVar, InterfaceC8741uP1 interfaceC8741uP1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbukVar);
        AbstractC6953nz1.f(parcelB, interfaceC8741uP1);
        I(1, parcelB);
    }

    @Override // com.daaw.InterfaceC7904rP1
    public final void e2(zzbuo zzbuoVar, InterfaceC8741uP1 interfaceC8741uP1) {
        Parcel parcelB = B();
        AbstractC6953nz1.d(parcelB, zzbuoVar);
        AbstractC6953nz1.f(parcelB, interfaceC8741uP1);
        I(3, parcelB);
    }
}
