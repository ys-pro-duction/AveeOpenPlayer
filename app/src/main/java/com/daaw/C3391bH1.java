package com.daaw;

import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.bH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3391bH1 extends AbstractC6395lz1 implements InterfaceC3948dH1 {
    public C3391bH1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    @Override // com.daaw.InterfaceC3948dH1
    public final void y2(QG1 qg1) {
        Parcel parcelB = B();
        AbstractC6953nz1.f(parcelB, qg1);
        I(1, parcelB);
    }
}
