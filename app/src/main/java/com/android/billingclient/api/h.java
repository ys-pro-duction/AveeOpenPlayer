package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.daaw.AbstractC7363pT1;
import com.daaw.AbstractC8013rn1;
import com.daaw.C4474f93;
import com.daaw.Gn3;
import com.daaw.InterfaceC7135of;
import com.daaw.JC1;
import com.daaw.KD1;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class h implements ServiceConnection {
    public final Object a = new Object();
    public boolean b = false;
    public InterfaceC7135of c;
    public final /* synthetic */ b d;

    public /* synthetic */ h(b bVar, InterfaceC7135of interfaceC7135of, KD1 kd1) {
        this.d = bVar;
        this.c = interfaceC7135of;
    }

    public final /* synthetic */ Object a() {
        Bundle bundle;
        int i;
        String strSubstring;
        int iI0;
        synchronized (this.a) {
            try {
                if (!this.b) {
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                    }
                    int i2 = 3;
                    try {
                        String packageName = this.d.e.getPackageName();
                        int i3 = 22;
                        iI0 = 3;
                        while (true) {
                            if (i3 < 3) {
                                i3 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    iI0 = this.d.g.i0(i3, packageName, "subs");
                                } catch (Exception e) {
                                    e = e;
                                    i2 = iI0;
                                    JC1.k("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    i = e instanceof DeadObjectException ? 101 : e instanceof RemoteException ? 100 : e instanceof SecurityException ? 102 : 42;
                                    if (i == 42) {
                                        strSubstring = e.getClass().getSimpleName() + ": " + AbstractC8013rn1.b(e.getMessage());
                                        if (strSubstring.length() > 70) {
                                            strSubstring = strSubstring.substring(0, 70);
                                        }
                                    } else {
                                        strSubstring = null;
                                    }
                                    this.d.a = 0;
                                    this.d.g = null;
                                    iI0 = i2;
                                }
                            } else {
                                iI0 = this.d.g.z2(i3, packageName, "subs", bundle);
                            }
                            if (iI0 == 0) {
                                JC1.i("BillingClient", "highestLevelSupportedForSubs: " + i3);
                                break;
                            }
                            i3--;
                        }
                        boolean z = true;
                        this.d.j = i3 >= 5;
                        this.d.i = i3 >= 3;
                        if (i3 < 3) {
                            JC1.i("BillingClient", "In-app billing API does not support subscription on this device.");
                            i = 9;
                        } else {
                            i = 1;
                        }
                        int i4 = 22;
                        while (true) {
                            if (i4 < 3) {
                                break;
                            }
                            iI0 = bundle == null ? this.d.g.i0(i4, packageName, "inapp") : this.d.g.z2(i4, packageName, "inapp", bundle);
                            if (iI0 == 0) {
                                this.d.k = i4;
                                JC1.i("BillingClient", "mHighestLevelSupportedForInApp: " + this.d.k);
                                break;
                            }
                            i4--;
                        }
                        b bVar = this.d;
                        bVar.y = bVar.k >= 22;
                        b bVar2 = this.d;
                        bVar2.x = bVar2.k >= 21;
                        b bVar3 = this.d;
                        bVar3.w = bVar3.k >= 20;
                        b bVar4 = this.d;
                        bVar4.v = bVar4.k >= 19;
                        b bVar5 = this.d;
                        bVar5.u = bVar5.k >= 18;
                        b bVar6 = this.d;
                        bVar6.t = bVar6.k >= 17;
                        b bVar7 = this.d;
                        bVar7.s = bVar7.k >= 16;
                        b bVar8 = this.d;
                        bVar8.r = bVar8.k >= 15;
                        b bVar9 = this.d;
                        bVar9.q = bVar9.k >= 14;
                        b bVar10 = this.d;
                        bVar10.p = bVar10.k >= 12;
                        b bVar11 = this.d;
                        bVar11.o = bVar11.k >= 10;
                        b bVar12 = this.d;
                        bVar12.n = bVar12.k >= 9;
                        b bVar13 = this.d;
                        bVar13.m = bVar13.k >= 8;
                        b bVar14 = this.d;
                        if (bVar14.k < 6) {
                            z = false;
                        }
                        bVar14.l = z;
                        if (this.d.k < 3) {
                            JC1.j("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i = 36;
                        }
                        if (iI0 == 0) {
                            this.d.a = 2;
                            if (this.d.d != null) {
                                this.d.d.g(this.d.x);
                            }
                        } else {
                            this.d.a = 0;
                            this.d.g = null;
                        }
                        strSubstring = null;
                    } catch (Exception e2) {
                        e = e2;
                    }
                    if (iI0 == 0) {
                        this.d.W(AbstractC7363pT1.c(6));
                        d(i.l);
                    } else {
                        b bVar15 = this.d;
                        d dVar = i.a;
                        bVar15.V(AbstractC7363pT1.b(i, 6, dVar, strSubstring));
                        d(dVar);
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public final /* synthetic */ void b() {
        this.d.a = 0;
        this.d.g = null;
        d dVar = i.n;
        this.d.V(AbstractC7363pT1.a(24, 6, dVar));
        d(dVar);
    }

    public final void c() {
        synchronized (this.a) {
            this.c = null;
            this.b = true;
        }
    }

    public final void d(d dVar) {
        synchronized (this.a) {
            try {
                InterfaceC7135of interfaceC7135of = this.c;
                if (interfaceC7135of != null) {
                    interfaceC7135of.onBillingSetupFinished(dVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        JC1.i("BillingClient", "Billing service connected.");
        this.d.g = Gn3.G(iBinder);
        Callable callable = new Callable() { // from class: com.daaw.ZB1
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.a.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: com.daaw.eD1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.b();
            }
        };
        b bVar = this.d;
        if (bVar.U(callable, 30000L, runnable, bVar.P()) == null) {
            b bVar2 = this.d;
            d dVarR = bVar2.R();
            bVar2.V(AbstractC7363pT1.a(25, 6, dVarR));
            d(dVarR);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        JC1.j("BillingClient", "Billing service disconnected.");
        this.d.f.d(C4474f93.y());
        this.d.g = null;
        this.d.a = 0;
        synchronized (this.a) {
            try {
                InterfaceC7135of interfaceC7135of = this.c;
                if (interfaceC7135of != null) {
                    interfaceC7135of.onBillingServiceDisconnected();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
