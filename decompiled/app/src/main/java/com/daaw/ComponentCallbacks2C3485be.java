package com.daaw;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.daaw.be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ComponentCallbacks2C3485be implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final ComponentCallbacks2C3485be F = new ComponentCallbacks2C3485be();
    public final AtomicBoolean B = new AtomicBoolean();
    public final AtomicBoolean C = new AtomicBoolean();
    public final ArrayList D = new ArrayList();
    public boolean E = false;

    /* JADX INFO: renamed from: com.daaw.be$a */
    public interface a {
        void a(boolean z);
    }

    public static ComponentCallbacks2C3485be b() {
        return F;
    }

    public static void c(Application application) {
        ComponentCallbacks2C3485be componentCallbacks2C3485be = F;
        synchronized (componentCallbacks2C3485be) {
            try {
                if (!componentCallbacks2C3485be.E) {
                    application.registerActivityLifecycleCallbacks(componentCallbacks2C3485be);
                    application.registerComponentCallbacks(componentCallbacks2C3485be);
                    componentCallbacks2C3485be.E = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void a(a aVar) {
        synchronized (F) {
            this.D.add(aVar);
        }
    }

    public boolean d() {
        return this.B.get();
    }

    public boolean e(boolean z) {
        if (!this.C.get()) {
            if (!AbstractC7494pv0.b()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.C.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.B.set(true);
            }
        }
        return d();
    }

    public final void f(boolean z) {
        synchronized (F) {
            try {
                Iterator it = this.D.iterator();
                while (it.hasNext()) {
                    ((a) it.next()).a(z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        AtomicBoolean atomicBoolean = this.C;
        boolean zCompareAndSet = this.B.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        AtomicBoolean atomicBoolean = this.C;
        boolean zCompareAndSet = this.B.compareAndSet(true, false);
        atomicBoolean.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i == 20 && this.B.compareAndSet(false, true)) {
            this.C.set(true);
            f(true);
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }
}
