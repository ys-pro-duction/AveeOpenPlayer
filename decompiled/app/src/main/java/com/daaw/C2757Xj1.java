package com.daaw;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.Xj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2757Xj1 extends AbstractC1382Kj1 implements InterfaceC3517bk1 {
    public C2757Xj1(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
    }

    @Override // com.daaw.InterfaceC3517bk1
    public final void h2(Bundle bundle, InterfaceC4641fk1 interfaceC4641fk1) {
        Parcel parcelB = B();
        AbstractC2131Rj1.c(parcelB, bundle);
        AbstractC2131Rj1.d(parcelB, interfaceC4641fk1);
        G(2, parcelB);
    }
}
