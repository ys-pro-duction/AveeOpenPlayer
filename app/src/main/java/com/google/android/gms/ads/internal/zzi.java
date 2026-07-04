package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.daaw.AbstractC4274eT1;
import com.daaw.AbstractC9322wT1;
import com.daaw.AbstractC9820yE1;
import com.daaw.AbstractC9849yL2;
import com.daaw.C5820jx1;
import com.daaw.C7503px1;
import com.daaw.C8668u73;
import com.daaw.InterfaceC6666mx1;
import com.daaw.QL2;
import com.daaw.SK2;
import com.daaw.XS1;
import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.internal.ads.zzcaz;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class zzi implements Runnable, InterfaceC6666mx1 {
    public boolean E;
    public final boolean F;
    public final boolean G;
    public final Executor H;
    public final SK2 I;
    public Context J;
    public final Context K;
    public zzcaz L;
    public final zzcaz M;
    public final boolean N;
    public int P;
    public final List B = new Vector();
    public final AtomicReference C = new AtomicReference();
    public final AtomicReference D = new AtomicReference();
    public final CountDownLatch O = new CountDownLatch(1);

    public zzi(Context context, zzcaz zzcazVar) {
        this.J = context;
        this.K = context;
        this.L = zzcazVar;
        this.M = zzcazVar;
        ExecutorService executorServiceNewCachedThreadPool = Executors.newCachedThreadPool();
        this.H = executorServiceNewCachedThreadPool;
        boolean zBooleanValue = ((Boolean) zzba.zzc().b(AbstractC9820yE1.g2)).booleanValue();
        this.N = zBooleanValue;
        this.I = SK2.a(context, executorServiceNewCachedThreadPool, zBooleanValue);
        this.F = ((Boolean) zzba.zzc().b(AbstractC9820yE1.c2)).booleanValue();
        this.G = ((Boolean) zzba.zzc().b(AbstractC9820yE1.h2)).booleanValue();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.f2)).booleanValue()) {
            this.P = 2;
        } else {
            this.P = 1;
        }
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.j3)).booleanValue()) {
            this.E = c();
        }
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.c3)).booleanValue()) {
            AbstractC9322wT1.a.execute(this);
            return;
        }
        zzay.zzb();
        if (XS1.y()) {
            AbstractC9322wT1.a.execute(this);
        } else {
            run();
        }
    }

    private final void f() {
        List list = this.B;
        InterfaceC6666mx1 interfaceC6666mx1E = e();
        if (list.isEmpty() || interfaceC6666mx1E == null) {
            return;
        }
        for (Object[] objArr : this.B) {
            int length = objArr.length;
            if (length == 1) {
                interfaceC6666mx1E.zzk((MotionEvent) objArr[0]);
            } else if (length == 3) {
                interfaceC6666mx1E.zzl(((Integer) objArr[0]).intValue(), ((Integer) objArr[1]).intValue(), ((Integer) objArr[2]).intValue());
            }
        }
        this.B.clear();
    }

    public static final Context h(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    public final /* synthetic */ void b(boolean z) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            C5820jx1.a(this.M.B, h(this.K), z, this.N).h();
        } catch (NullPointerException e) {
            this.I.c(2027, System.currentTimeMillis() - jCurrentTimeMillis, e);
        }
    }

    public final boolean c() {
        Context context = this.J;
        C8668u73 c8668u73 = new C8668u73(this);
        SK2 sk2 = this.I;
        return new QL2(this.J, AbstractC9849yL2.b(context, sk2), c8668u73, ((Boolean) zzba.zzc().b(AbstractC9820yE1.d2)).booleanValue()).d(1);
    }

    public final int d() {
        if (!this.F || this.E) {
            return this.P;
        }
        return 1;
    }

    public final InterfaceC6666mx1 e() {
        return d() == 2 ? (InterfaceC6666mx1) this.D.get() : (InterfaceC6666mx1) this.C.get();
    }

    public final void g(boolean z) {
        this.C.set(C7503px1.q(this.L.B, h(this.J), z, this.P));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.j3)).booleanValue()) {
                this.E = c();
            }
            boolean z = this.L.E;
            final boolean z2 = false;
            if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.V0)).booleanValue() && z) {
                z2 = true;
            }
            if (d() == 1) {
                g(z2);
                if (this.P == 2) {
                    this.H.execute(new Runnable() { // from class: com.google.android.gms.ads.internal.zzg
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zza.b(z2);
                        }
                    });
                }
            } else {
                long jCurrentTimeMillis = System.currentTimeMillis();
                try {
                    C5820jx1 c5820jx1A = C5820jx1.a(this.L.B, h(this.J), z2, this.N);
                    this.D.set(c5820jx1A);
                    if (this.G && !c5820jx1A.j()) {
                        this.P = 1;
                        g(z2);
                    }
                } catch (NullPointerException e) {
                    this.P = 1;
                    g(z2);
                    this.I.c(2031, System.currentTimeMillis() - jCurrentTimeMillis, e);
                }
            }
            this.O.countDown();
            this.J = null;
            this.L = null;
        } catch (Throwable th) {
            this.O.countDown();
            this.J = null;
            this.L = null;
            throw th;
        }
    }

    public final boolean zzd() {
        try {
            this.O.await();
            return true;
        } catch (InterruptedException e) {
            AbstractC4274eT1.zzk("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zze(Context context, String str, View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzf(Context context, String str, View view, Activity activity) {
        if (!zzd()) {
            return "";
        }
        InterfaceC6666mx1 interfaceC6666mx1E = e();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.P9)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzI(view, 4, null);
        }
        if (interfaceC6666mx1E == null) {
            return "";
        }
        f();
        return interfaceC6666mx1E.zzf(h(context), str, view, activity);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzg(Context context) {
        InterfaceC6666mx1 interfaceC6666mx1E;
        if (!zzd() || (interfaceC6666mx1E = e()) == null) {
            return "";
        }
        f();
        return interfaceC6666mx1E.zzg(h(context));
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final String zzh(Context context, View view, Activity activity) {
        if (!((Boolean) zzba.zzc().b(AbstractC9820yE1.O9)).booleanValue()) {
            InterfaceC6666mx1 interfaceC6666mx1E = e();
            if (((Boolean) zzba.zzc().b(AbstractC9820yE1.P9)).booleanValue()) {
                zzt.zzp();
                com.google.android.gms.ads.internal.util.zzt.zzI(view, 2, null);
            }
            return interfaceC6666mx1E != null ? interfaceC6666mx1E.zzh(context, view, activity) : "";
        }
        if (!zzd()) {
            return "";
        }
        InterfaceC6666mx1 interfaceC6666mx1E2 = e();
        if (((Boolean) zzba.zzc().b(AbstractC9820yE1.P9)).booleanValue()) {
            zzt.zzp();
            com.google.android.gms.ads.internal.util.zzt.zzI(view, 2, null);
        }
        return interfaceC6666mx1E2 != null ? interfaceC6666mx1E2.zzh(context, view, activity) : "";
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzk(MotionEvent motionEvent) {
        InterfaceC6666mx1 interfaceC6666mx1E = e();
        if (interfaceC6666mx1E == null) {
            this.B.add(new Object[]{motionEvent});
        } else {
            f();
            interfaceC6666mx1E.zzk(motionEvent);
        }
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzl(int i, int i2, int i3) {
        InterfaceC6666mx1 interfaceC6666mx1E = e();
        if (interfaceC6666mx1E == null) {
            this.B.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
        } else {
            f();
            interfaceC6666mx1E.zzl(i, i2, i3);
        }
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzn(StackTraceElement[] stackTraceElementArr) {
        InterfaceC6666mx1 interfaceC6666mx1E;
        if (!zzd() || (interfaceC6666mx1E = e()) == null) {
            return;
        }
        interfaceC6666mx1E.zzn(stackTraceElementArr);
    }

    @Override // com.daaw.InterfaceC6666mx1
    public final void zzo(View view) {
        InterfaceC6666mx1 interfaceC6666mx1E = e();
        if (interfaceC6666mx1E != null) {
            interfaceC6666mx1E.zzo(view);
        }
    }
}
