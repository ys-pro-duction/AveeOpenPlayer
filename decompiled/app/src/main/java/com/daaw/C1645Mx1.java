package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.Mx1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1645Mx1 implements Application.ActivityLifecycleCallbacks {
    public final Application B;
    public final WeakReference C;
    public boolean D = false;

    public C1645Mx1(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.C = new WeakReference(activityLifecycleCallbacks);
        this.B = application;
    }

    public final void a(InterfaceC1541Lx1 interfaceC1541Lx1) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.C.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC1541Lx1.a(activityLifecycleCallbacks);
            } else {
                if (this.D) {
                    return;
                }
                this.B.unregisterActivityLifecycleCallbacks(this);
                this.D = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C10020yx1(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C1438Kx1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C0493Bx1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C0389Ax1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C1334Jx1(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C10299zx1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C1230Ix1(this, activity));
    }
}
