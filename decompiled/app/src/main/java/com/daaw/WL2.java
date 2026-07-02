package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes3.dex */
public final class WL2 {
    public final ZL2 a;
    public final boolean b;

    public WL2(ZL2 zl2) {
        this.a = zl2;
        this.b = zl2 != null;
    }

    public static WL2 b(Context context, String str, String str2) {
        ZL2 xl2;
        try {
            try {
                try {
                    IBinder iBinderD = DynamiteModule.e(context, DynamiteModule.b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.gass.internal.clearcut.GassDynamiteClearcutLogger");
                    if (iBinderD == null) {
                        xl2 = null;
                    } else {
                        IInterface iInterfaceQueryLocalInterface = iBinderD.queryLocalInterface("com.google.android.gms.gass.internal.clearcut.IGassClearcut");
                        xl2 = iInterfaceQueryLocalInterface instanceof ZL2 ? (ZL2) iInterfaceQueryLocalInterface : new XL2(iBinderD);
                    }
                    xl2.a2(BinderC7744qp0.Z2(context), str, null);
                    return new WL2(xl2);
                } catch (Exception e) {
                    throw new AL2(e);
                }
            } catch (RemoteException | AL2 | NullPointerException | SecurityException unused) {
                return new WL2(new BinderC3133aM2());
            }
        } catch (Exception e2) {
            throw new AL2(e2);
        }
    }

    public static WL2 c() {
        return new WL2(new BinderC3133aM2());
    }

    public final VL2 a(byte[] bArr) {
        return new VL2(this, bArr, null);
    }
}
