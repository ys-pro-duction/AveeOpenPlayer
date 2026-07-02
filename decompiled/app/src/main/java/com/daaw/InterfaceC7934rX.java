package com.daaw;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: renamed from: com.daaw.rX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC7934rX extends IInterface {

    /* JADX INFO: renamed from: com.daaw.rX$a */
    public static abstract class a extends GC1 implements InterfaceC7934rX {
        public a() {
            super("com.google.android.gms.dynamic.IObjectWrapper");
        }

        public static InterfaceC7934rX G(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
            return iInterfaceQueryLocalInterface instanceof InterfaceC7934rX ? (InterfaceC7934rX) iInterfaceQueryLocalInterface : new BC1(iBinder);
        }
    }
}
