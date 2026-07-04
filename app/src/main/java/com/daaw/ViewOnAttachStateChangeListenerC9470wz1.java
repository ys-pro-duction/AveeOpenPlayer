package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzcb;
import com.google.android.gms.ads.internal.util.zzt;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* JADX INFO: renamed from: com.daaw.wz1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC9470wz1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final long Q = ((Long) zzba.zzc().b(AbstractC9820yE1.k1)).longValue();
    public final Context B;
    public Application C;
    public final WindowManager D;
    public final PowerManager E;
    public final KeyguardManager F;
    public BroadcastReceiver G;
    public WeakReference H;
    public final WeakReference I;
    public C2091Qz1 J;
    public final zzcb K = new zzcb(Q);
    public boolean L = false;
    public int M = -1;
    public final HashSet N = new HashSet();
    public final DisplayMetrics O;
    public final Rect P;

    public ViewOnAttachStateChangeListenerC9470wz1(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.B = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.D = windowManager;
        this.E = (PowerManager) applicationContext.getSystemService("power");
        this.F = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.C = application;
            this.J = new C2091Qz1(application, this);
        }
        this.O = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.P = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference weakReference = this.I;
        View view2 = weakReference != null ? (View) weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.I = new WeakReference(view);
        if (view != null) {
            if (view.isAttachedToWindow()) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    public final Rect a(Rect rect) {
        return new Rect(h(rect.left), h(rect.top), h(rect.right), h(rect.bottom));
    }

    public final void c(InterfaceC9191vz1 interfaceC9191vz1) {
        this.N.add(interfaceC9191vz1);
        j(3);
    }

    public final /* synthetic */ void d() {
        j(3);
    }

    public final void e(InterfaceC9191vz1 interfaceC9191vz1) {
        this.N.remove(interfaceC9191vz1);
    }

    public final void f() {
        this.K.zza(Q);
    }

    public final void g(long j) {
        this.K.zza(j);
    }

    public final int h(int i) {
        return (int) (i / this.O.density);
    }

    public final void i(Activity activity, int i) {
        Window window;
        if (this.I == null || (window = activity.getWindow()) == null) {
            return;
        }
        WeakReference weakReference = this.I;
        View viewPeekDecorView = window.peekDecorView();
        View view = (View) weakReference.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.M = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0138  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r35) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ViewOnAttachStateChangeListenerC9470wz1.j(int):void");
    }

    public final void k() {
        zzt.zza.post(new Runnable() { // from class: com.daaw.sz1
            @Override // java.lang.Runnable
            public final void run() {
                this.B.d();
            }
        });
    }

    public final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.H = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.G == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.G = new C8626tz1(this);
            com.google.android.gms.ads.internal.zzt.zzv().zzc(this.B, this.G, intentFilter);
        }
        Application application = this.C;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.J);
            } catch (Exception e) {
                AbstractC4274eT1.zzh("Error registering activity lifecycle callbacks.", e);
            }
        }
    }

    public final void m(View view) {
        try {
            WeakReference weakReference = this.H;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = (ViewTreeObserver) weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.H = null;
            }
        } catch (Exception e) {
            AbstractC4274eT1.zzh("Error while unregistering listeners from the last ViewTreeObserver.", e);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e2) {
            AbstractC4274eT1.zzh("Error while unregistering listeners from the ViewTreeObserver.", e2);
        }
        if (this.G != null) {
            try {
                com.google.android.gms.ads.internal.zzt.zzv().zzd(this.B, this.G);
            } catch (IllegalStateException e3) {
                AbstractC4274eT1.zzh("Failed trying to unregister the receiver", e3);
            } catch (Exception e4) {
                com.google.android.gms.ads.internal.zzt.zzo().u(e4, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.G = null;
        }
        Application application = this.C;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.J);
            } catch (Exception e5) {
                AbstractC4274eT1.zzh("Error registering activity lifecycle callbacks.", e5);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        k();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        k();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.M = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.M = -1;
        j(3);
        k();
        m(view);
    }
}
