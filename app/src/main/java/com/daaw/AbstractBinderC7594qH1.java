package com.daaw;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.daaw.InterfaceC7934rX;

/* JADX INFO: renamed from: com.daaw.qH1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7594qH1 extends AbstractBinderC6674mz1 implements InterfaceC7872rH1 {
    public AbstractBinderC7594qH1() {
        super("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    public static InterfaceC7872rH1 zzc(IBinder iBinder) {
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
        return iInterfaceQueryLocalInterface instanceof InterfaceC7872rH1 ? (InterfaceC7872rH1) iInterfaceQueryLocalInterface : new C7315pH1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            return false;
        }
        InterfaceC7934rX interfaceC7934rXG = InterfaceC7934rX.a.G(parcel.readStrongBinder());
        AbstractC6953nz1.c(parcel);
        boolean zZzb = zzb(interfaceC7934rXG);
        parcel2.writeNoException();
        parcel2.writeInt(zZzb ? 1 : 0);
        return true;
    }
}
