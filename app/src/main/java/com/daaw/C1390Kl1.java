package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.signin.internal.zai;

/* JADX INFO: renamed from: com.daaw.Kl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1390Kl1 extends AbstractC1490Lk1 implements IInterface {
    public C1390Kl1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void Z2(zai zaiVar, InterfaceC0974Gl1 interfaceC0974Gl1) {
        Parcel parcelB = B();
        AbstractC7167ol1.c(parcelB, zaiVar);
        AbstractC7167ol1.d(parcelB, interfaceC0974Gl1);
        G(12, parcelB);
    }
}
