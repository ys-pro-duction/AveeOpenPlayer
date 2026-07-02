package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.Qz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2091Qz1 implements Application.ActivityLifecycleCallbacks {
    public final Application B;
    public final WeakReference C;
    public boolean D = false;

    public C2091Qz1(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.C = new WeakReference(activityLifecycleCallbacks);
        this.B = application;
    }

    public final void a(InterfaceC1965Pz1 interfaceC1965Pz1) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = (Application.ActivityLifecycleCallbacks) this.C.get();
            if (activityLifecycleCallbacks != null) {
                interfaceC1965Pz1.a(activityLifecycleCallbacks);
            } else {
                if (this.D) {
                    return;
                }
                this.B.unregisterActivityLifecycleCallbacks(this);
                this.D = true;
            }
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Error while dispatching lifecycle callback.", e);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new C1238Iz1(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new C1861Oz1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new C1549Lz1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new C1446Kz1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new C1757Nz1(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new C1342Jz1(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new C1653Mz1(this, activity));
    }
}
