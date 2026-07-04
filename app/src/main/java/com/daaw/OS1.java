package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.util.zzj;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class OS1 {
    public final Object a = new Object();
    public final zzj b;
    public final RS1 c;
    public boolean d;
    public Context e;
    public zzcaz f;
    public String g;
    public GE1 h;
    public Boolean i;
    public final AtomicInteger j;
    public final NS1 k;
    public final Object l;
    public InterfaceFutureC8236sc0 m;
    public final AtomicBoolean n;

    public OS1() {
        zzj zzjVar = new zzj();
        this.b = zzjVar;
        this.c = new RS1(zzay.zzd(), zzjVar);
        this.d = false;
        this.h = null;
        this.i = null;
        this.j = new AtomicInteger(0);
        this.k = new NS1(null);
        this.l = new Object();
        this.n = new AtomicBoolean();
    }

    public final int a() {
        return this.j.get();
    }

    public final Context c() {
        return this.e;
    }

    public final Resources d() {
        if (this.f.E) {
            return this.e.getResources();
        }
        try {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.W9)).booleanValue()) {
                return AbstractC5400iT1.a(this.e).getResources();
            }
            AbstractC5400iT1.a(this.e).getResources();
            return null;
        } catch (C5121hT1 e) {
            AbstractC4274eT1.zzk("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    public final GE1 f() {
        GE1 ge1;
        synchronized (this.a) {
            ge1 = this.h;
        }
        return ge1;
    }

    public final RS1 g() {
        return this.c;
    }

    public final zzg h() {
        zzj zzjVar;
        synchronized (this.a) {
            zzjVar = this.b;
        }
        return zzjVar;
    }

    public final InterfaceFutureC8236sc0 j() {
        if (this.e != null) {
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.y2)).booleanValue()) {
                synchronized (this.l) {
                    try {
                        InterfaceFutureC8236sc0 interfaceFutureC8236sc0 = this.m;
                        if (interfaceFutureC8236sc0 != null) {
                            return interfaceFutureC8236sc0;
                        }
                        InterfaceFutureC8236sc0 interfaceFutureC8236sc0S0 = AbstractC9322wT1.a.S0(new Callable() { // from class: com.daaw.mS1
                            @Override // java.util.concurrent.Callable
                            public final Object call() {
                                return this.a.n();
                            }
                        });
                        this.m = interfaceFutureC8236sc0S0;
                        return interfaceFutureC8236sc0S0;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
        return AbstractC7360pS2.h(new ArrayList());
    }

    public final Boolean k() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.i;
        }
        return bool;
    }

    public final String m() {
        return this.g;
    }

    public final /* synthetic */ ArrayList n() {
        Context contextA = TP1.a(this.e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo packageInfoF = C6878nj1.a(contextA).f(contextA.getApplicationInfo().packageName, 4096);
            if (packageInfoF.requestedPermissions != null && packageInfoF.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = packageInfoF.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((packageInfoF.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    public final void p() {
        this.k.a();
    }

    public final void q() {
        this.j.decrementAndGet();
    }

    public final void r() {
        this.j.incrementAndGet();
    }

    public final void s(Context context, zzcaz zzcazVar) {
        GE1 ge1;
        synchronized (this.a) {
            try {
                if (!this.d) {
                    this.e = context.getApplicationContext();
                    this.f = zzcazVar;
                    zzt.zzb().c(this.c);
                    this.b.zzr(this.e);
                    RO1.d(this.e, this.f);
                    zzt.zze();
                    if (((Boolean) AbstractC7586qF1.c.e()).booleanValue()) {
                        ge1 = new GE1();
                    } else {
                        zze.zza("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                        ge1 = null;
                    }
                    this.h = ge1;
                    if (ge1 != null) {
                        AbstractC10159zT1.a(new C6801nS1(this).zzb(), "AppState.registerCsiReporter");
                    }
                    if (AbstractC7494pv0.i()) {
                        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.h8)).booleanValue()) {
                            ((ConnectivityManager) context.getSystemService("connectivity")).registerDefaultNetworkCallback(new C7080oS1(this));
                        }
                    }
                    this.d = true;
                    j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        zzt.zzp().zzc(context, zzcazVar.B);
    }

    public final void t(Throwable th, String str) {
        RO1.d(this.e, this.f).b(th, str, ((Double) KF1.g.e()).floatValue());
    }

    public final void u(Throwable th, String str) {
        RO1.d(this.e, this.f).a(th, str);
    }

    public final void v(Boolean bool) {
        synchronized (this.a) {
            this.i = bool;
        }
    }

    public final void w(String str) {
        this.g = str;
    }

    public final boolean x(Context context) {
        if (AbstractC7494pv0.i()) {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.h8)).booleanValue()) {
                return this.n.get();
            }
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
