package com.daaw;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.zzbu;

/* JADX INFO: renamed from: com.daaw.fH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4505fH1 extends AbstractC6395lz1 implements InterfaceC5073hH1 {
    public C4505fH1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnPublisherAdViewLoadedListener");
    }

    @Override // com.daaw.InterfaceC5073hH1
    public final void L0(zzbu zzbuVar, InterfaceC7934rX interfaceC7934rX) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, zzbuVar);
        AbstractC6953nz1.f(parcelB, interfaceC7934rX);
        I(1, parcelB);
    }
}
