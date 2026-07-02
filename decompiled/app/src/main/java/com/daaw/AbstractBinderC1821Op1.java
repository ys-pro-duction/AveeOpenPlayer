package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.Op1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractBinderC1821Op1 extends GC1 implements InterfaceC4382eq1 {
    public static InterfaceC4382eq1 G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4382eq1 ? (InterfaceC4382eq1) iInterfaceQueryLocalInterface : new C5502ip1(iBinder);
    }
}
