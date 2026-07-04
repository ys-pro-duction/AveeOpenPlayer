package com.daaw;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzck;
import com.google.android.gms.ads.internal.client.zzcl;
import com.google.android.gms.ads.internal.client.zzen;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.dG2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3945dG2 {
    public static C3945dG2 d;
    public final Context a;
    public final zzcl b;
    public final AtomicReference c = new AtomicReference();

    public C3945dG2(Context context, zzcl zzclVar) {
        this.a = context;
        this.b = zzclVar;
    }

    public static zzcl a(Context context) {
        try {
            try {
                return zzck.asInterface((IBinder) context.getClassLoader().loadClass("com.google.android.gms.ads.internal.client.LiteSdkInfo").getConstructor(Context.class).newInstance(context));
            } catch (ClassNotFoundException e) {
                e = e;
                AbstractC4274eT1.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (IllegalAccessException e2) {
                e = e2;
                AbstractC4274eT1.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (InstantiationException e3) {
                e = e3;
                AbstractC4274eT1.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (NoSuchMethodException e4) {
                e = e4;
                AbstractC4274eT1.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            } catch (InvocationTargetException e5) {
                e = e5;
                AbstractC4274eT1.zzh("Failed to retrieve lite SDK info.", e);
                return null;
            }
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e6) {
            e = e6;
        }
    }

    public static C3945dG2 d(Context context) {
        synchronized (C3945dG2.class) {
            try {
                C3945dG2 c3945dG2 = d;
                if (c3945dG2 != null) {
                    return c3945dG2;
                }
                Context applicationContext = context.getApplicationContext();
                long jLongValue = ((Long) DF1.b.e()).longValue();
                zzcl zzclVarA = null;
                if (jLongValue > 0 && jLongValue <= 233702200) {
                    zzclVarA = a(applicationContext);
                }
                C3945dG2 c3945dG22 = new C3945dG2(applicationContext, zzclVarA);
                d = c3945dG22;
                return c3945dG22;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final SL1 b() {
        return (SL1) this.c.get();
    }

    public final zzcaz c(int i, boolean z, int i2) {
        zzen zzenVarG;
        zzt.zzp();
        boolean zZzD = com.google.android.gms.ads.internal.util.zzt.zzD(this.a);
        return (((Boolean) DF1.c.e()).booleanValue() && (zzenVarG = g()) != null) ? new zzcaz(233702000, zzenVarG.zza(), true, zZzD) : new zzcaz(233702000, i2, true, zZzD);
    }

    public final String e() {
        zzen zzenVarG = g();
        if (zzenVarG != null) {
            return zzenVarG.zzb();
        }
        return null;
    }

    public final void f(SL1 sl1) {
        SL1 adapterCreator;
        if (!((Boolean) DF1.a.e()).booleanValue()) {
            AbstractC3666cG2.a(this.c, null, sl1);
            return;
        }
        zzcl zzclVar = this.b;
        if (zzclVar == null) {
            adapterCreator = null;
        } else {
            try {
                adapterCreator = zzclVar.getAdapterCreator();
            } catch (RemoteException unused) {
                adapterCreator = null;
            }
        }
        AtomicReference atomicReference = this.c;
        if (adapterCreator != null) {
            sl1 = adapterCreator;
        }
        AbstractC3666cG2.a(atomicReference, null, sl1);
    }

    public final zzen g() {
        zzcl zzclVar = this.b;
        if (zzclVar != null) {
            try {
                return zzclVar.getLiteSdkVersion();
            } catch (RemoteException unused) {
            }
        }
        return null;
    }
}
