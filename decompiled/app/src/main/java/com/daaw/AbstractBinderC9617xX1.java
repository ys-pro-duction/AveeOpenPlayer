package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.xX1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC9617xX1 extends AbstractBinderC6674mz1 implements InterfaceC9896yX1 {
    public static InterfaceC9896yX1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.measurement.IMeasurementManager");
        return iInterfaceQueryLocalInterface instanceof InterfaceC9896yX1 ? (InterfaceC9896yX1) iInterfaceQueryLocalInterface : new C9338wX1(iBinder);
    }
}
