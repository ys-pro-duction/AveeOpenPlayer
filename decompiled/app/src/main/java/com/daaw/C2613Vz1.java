package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.Vz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2613Vz1 implements Application.ActivityLifecycleCallbacks {
    public Activity B;
    public Context C;
    public Runnable I;
    public long K;
    public final Object D = new Object();
    public boolean E = true;
    public boolean F = false;
    public final List G = new ArrayList();
    public final List H = new ArrayList();
    public boolean J = false;

    public final Activity a() {
        return this.B;
    }

    public final Context b() {
        return this.C;
    }

    public final void f(InterfaceC2717Wz1 interfaceC2717Wz1) {
        synchronized (this.D) {
            this.G.add(interfaceC2717Wz1);
        }
    }

    public final void g(Application application, Context context) {
        if (this.J) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.C = application;
        this.K = ((Long) zzba.zzc().b(AbstractC9820yE1.R0)).longValue();
        this.J = true;
    }

    public final void h(InterfaceC2717Wz1 interfaceC2717Wz1) {
        synchronized (this.D) {
            this.G.remove(interfaceC2717Wz1);
        }
    }

    public final void k(Activity activity) {
        synchronized (this.D) {
            try {
                if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                    this.B = activity;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.D) {
            try {
                Activity activity2 = this.B;
                if (activity2 != null) {
                    if (activity2.equals(activity)) {
                        this.B = null;
                    }
                    Iterator it = this.H.iterator();
                    while (it.hasNext()) {
                        AbstractC6314li0.a(it.next());
                        try {
                            throw null;
                        } catch (Exception e) {
                            zzt.zzo().u(e, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                            AbstractC4274eT1.zzh("", e);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.D) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                try {
                    throw null;
                } catch (Exception e) {
                    zzt.zzo().u(e, "AppActivityTracker.ActivityListener.onActivityPaused");
                    AbstractC4274eT1.zzh("", e);
                }
            }
        }
        this.F = true;
        Runnable runnable = this.I;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(runnable);
        }
        HandlerC8451tM2 handlerC8451tM2 = com.google.android.gms.ads.internal.util.zzt.zza;
        RunnableC2509Uz1 runnableC2509Uz1 = new RunnableC2509Uz1(this);
        this.I = runnableC2509Uz1;
        handlerC8451tM2.postDelayed(runnableC2509Uz1, this.K);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.F = false;
        boolean z = this.E;
        this.E = true;
        Runnable runnable = this.I;
        if (runnable != null) {
            com.google.android.gms.ads.internal.util.zzt.zza.removeCallbacks(runnable);
        }
        synchronized (this.D) {
            Iterator it = this.H.iterator();
            while (it.hasNext()) {
                AbstractC6314li0.a(it.next());
                try {
                    throw null;
                } catch (Exception e) {
                    zzt.zzo().u(e, "AppActivityTracker.ActivityListener.onActivityResumed");
                    AbstractC4274eT1.zzh("", e);
                }
            }
            if (z) {
                AbstractC4274eT1.zze("App is still foreground.");
            } else {
                Iterator it2 = this.G.iterator();
                while (it2.hasNext()) {
                    try {
                        ((InterfaceC2717Wz1) it2.next()).zza(true);
                    } catch (Exception e2) {
                        AbstractC4274eT1.zzh("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
