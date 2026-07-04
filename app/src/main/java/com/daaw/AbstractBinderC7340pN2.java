package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.pN2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7340pN2 extends AbstractBinderC6674mz1 implements InterfaceC7619qN2 {
    public static InterfaceC7619qN2 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.lmd.protocol.ILmdOverlayService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7619qN2 ? (InterfaceC7619qN2) iInterfaceQueryLocalInterface : new C7061oN2(iBinder);
    }
}
