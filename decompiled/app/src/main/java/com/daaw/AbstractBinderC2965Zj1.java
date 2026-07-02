package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.Zj1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC2965Zj1 extends AbstractBinderC1901Pj1 implements InterfaceC3517bk1 {
    public static InterfaceC3517bk1 G(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
        return iInterfaceQueryLocalInterface instanceof InterfaceC3517bk1 ? (InterfaceC3517bk1) iInterfaceQueryLocalInterface : new C2757Xj1(iBinder);
    }
}
