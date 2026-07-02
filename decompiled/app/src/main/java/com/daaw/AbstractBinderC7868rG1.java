package com.daaw;

import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: renamed from: com.daaw.rG1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractBinderC7868rG1 extends AbstractBinderC6674mz1 implements InterfaceC8147sG1 {
    public AbstractBinderC7868rG1() {
        super("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
    }

    public static InterfaceC8147sG1 Z2(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdImage");
        return iInterfaceQueryLocalInterface instanceof InterfaceC8147sG1 ? (InterfaceC8147sG1) iInterfaceQueryLocalInterface : new C7590qG1(iBinder);
    }

    @Override // com.daaw.AbstractBinderC6674mz1
    public final boolean I(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            InterfaceC7934rX interfaceC7934rXZzf = zzf();
            parcel2.writeNoException();
            AbstractC6953nz1.f(parcel2, interfaceC7934rXZzf);
        } else if (i == 2) {
            Uri uriZze = zze();
            parcel2.writeNoException();
            AbstractC6953nz1.e(parcel2, uriZze);
        } else if (i == 3) {
            double dZzb = zzb();
            parcel2.writeNoException();
            parcel2.writeDouble(dZzb);
        } else if (i == 4) {
            int iZzd = zzd();
            parcel2.writeNoException();
            parcel2.writeInt(iZzd);
        } else {
            if (i != 5) {
                return false;
            }
            int iZzc = zzc();
            parcel2.writeNoException();
            parcel2.writeInt(iZzc);
        }
        return true;
    }
}
