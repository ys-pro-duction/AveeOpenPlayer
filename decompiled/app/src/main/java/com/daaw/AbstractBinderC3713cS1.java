package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.cS1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC3713cS1 extends AbstractBinderC6674mz1 implements InterfaceC3992dS1 {
    public static InterfaceC3992dS1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3992dS1 ? (InterfaceC3992dS1) iInterfaceQueryLocalInterface : new C3435bS1(iBinder);
    }
}
