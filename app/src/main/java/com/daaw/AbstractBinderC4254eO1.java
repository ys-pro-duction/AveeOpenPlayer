package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.eO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4254eO1 extends AbstractBinderC6674mz1 implements InterfaceC4543fO1 {
    public static InterfaceC4543fO1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4543fO1 ? (InterfaceC4543fO1) iInterfaceQueryLocalInterface : new C3976dO1(iBinder);
    }
}
