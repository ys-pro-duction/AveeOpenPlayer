package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.pz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7511pz1 extends AbstractBinderC6674mz1 implements InterfaceC7790qz1 {
    public static InterfaceC7790qz1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.clearcut.IClearcut");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7790qz1 ? (InterfaceC7790qz1) iInterfaceQueryLocalInterface : new C7232oz1(iBinder);
    }
}
