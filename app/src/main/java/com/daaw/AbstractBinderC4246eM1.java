package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.eM1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC4246eM1 extends AbstractBinderC6674mz1 implements InterfaceC4525fM1 {
    public AbstractBinderC4246eM1() {
        super("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
    }

    public static InterfaceC4525fM1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IMediationInterscrollerAd");
        return iInterfaceQueryLocalInterface instanceof InterfaceC4525fM1 ? (InterfaceC4525fM1) iInterfaceQueryLocalInterface : new C3968dM1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC7934rX interfaceC7934rXZze = zze();
            parcel2.writeNoException();
            AbstractC6953nz1.f(parcel2, interfaceC7934rXZze);
        } else {
            if (i != 2) {
                return false;
            }
            boolean zZzf = zzf();
            parcel2.writeNoException();
            ClassLoader classLoader = AbstractC6953nz1.a;
            parcel2.writeInt(zZzf ? 1 : 0);
        }
        return true;
    }
}
