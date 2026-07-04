package com.daaw;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzaw;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzcc;
import com.google.android.gms.ads.internal.client.zzce;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* JADX INFO: loaded from: classes.dex */
public abstract class SA1 {
    public static final zzce a;

    static {
        zzce zzccVar = null;
        try {
            Object objNewInstance = zzaw.class.getClassLoader().loadClass("com.google.android.gms.ads.internal.ClientApi").getDeclaredConstructor(null).newInstance(null);
            if (objNewInstance instanceof IBinder) {
                IBinder iBinder = (IBinder) objNewInstance;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IClientApi");
                    zzccVar = iInterfaceQueryLocalInterface instanceof zzce ? (zzce) iInterfaceQueryLocalInterface : new zzcc(iBinder);
                }
            } else {
                AbstractC4274eT1.zzj("ClientApi class is not an instance of IBinder.");
            }
        } catch (Exception unused) {
            AbstractC4274eT1.zzj("Failed to instantiate ClientApi class.");
        }
        a = zzccVar;
    }

    public abstract Object a();

    public abstract Object b(zzce zzceVar);

    public abstract Object c();

    public final Object d(Context context, boolean z) {
        boolean z2;
        Object objE;
        if (!z) {
            zzay.zzb();
            if (!XS1.w(context, 12451000)) {
                AbstractC4274eT1.zze("Google Play Services is not available.");
                z = true;
            }
        }
        boolean z3 = false;
        boolean z4 = !(DynamiteModule.a(context, ModuleDescriptor.MODULE_ID) <= DynamiteModule.c(context, ModuleDescriptor.MODULE_ID));
        AbstractC9820yE1.a(context);
        if (((Boolean) AbstractC7864rF1.a.e()).booleanValue()) {
            z2 = false;
        } else if (((Boolean) AbstractC7864rF1.b.e()).booleanValue()) {
            z2 = true;
            z3 = true;
        } else {
            z3 = z | z4;
            z2 = false;
        }
        if (z3) {
            objE = e();
            if (objE == null && !z2) {
                objE = f();
            }
        } else {
            Object objF = f();
            if (objF == null) {
                if (zzay.zze().nextInt(((Long) KF1.a.e()).intValue()) == 0) {
                    Bundle bundle = new Bundle();
                    bundle.putString("action", "dynamite_load");
                    bundle.putInt("is_missing", 1);
                    zzay.zzb().r(context, zzay.zzc().B, "gmob-apps", bundle, true);
                }
            }
            objE = objF == null ? e() : objF;
        }
        return objE == null ? a() : objE;
    }

    public final Object e() {
        zzce zzceVar = a;
        if (zzceVar == null) {
            AbstractC4274eT1.zzj("ClientApi class cannot be loaded.");
            return null;
        }
        try {
            return b(zzceVar);
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Cannot invoke local loader using ClientApi class.", e);
            return null;
        }
    }

    public final Object f() {
        try {
            return c();
        } catch (RemoteException e) {
            AbstractC4274eT1.zzk("Cannot invoke remote loader.", e);
            return null;
        }
    }
}
