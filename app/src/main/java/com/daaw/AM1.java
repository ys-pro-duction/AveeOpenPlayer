package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AM1 extends MK1 implements InterfaceC4818gN1 {
    public static InterfaceC4818gN1 G(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4818gN1 ? (InterfaceC4818gN1) iInterfaceQueryLocalInterface : new VL1(iBinder);
    }
}
