package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.daaw.ey1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ViewOnAttachStateChangeListenerC4418ey1 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {
    public static final Handler N = new Handler(Looper.getMainLooper());
    public final Context B;
    public Application C;
    public final PowerManager D;
    public final KeyguardManager E;
    public BroadcastReceiver F;
    public final C2083Qx1 G;
    public WeakReference H;
    public WeakReference I;
    public C1645Mx1 J;
    public byte K = -1;
    public int L = -1;
    public long M = -3;

    public ViewOnAttachStateChangeListenerC4418ey1(Context context, C2083Qx1 c2083Qx1) {
        Context applicationContext = context.getApplicationContext();
        this.B = applicationContext;
        this.G = c2083Qx1;
        this.D = (PowerManager) applicationContext.getSystemService("power");
        this.E = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.C = application;
            this.J = new C1645Mx1(application, this);
        }
        d(null);
    }

    public final long a() {
        if (this.M <= -2 && b() == null) {
            this.M = -3L;
        }
        return this.M;
    }

    public final View b() {
        WeakReference weakReference = this.I;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    public final void d(View view) {
        long j;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.I = new WeakReference(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j = -2;
        } else {
            j = -3;
        }
        this.M = j;
    }

    public final void e(Activity activity, int i) {
        Window window;
        if (this.I == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.L = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x006a, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void f() {
        /*
            r10 = this;
            r0 = 1
            java.lang.ref.WeakReference r1 = r10.I
            if (r1 != 0) goto L7
            goto Lbe
        L7:
            android.view.View r1 = r10.b()
            r2 = -1
            r3 = -3
            if (r1 != 0) goto L15
            r10.M = r3
            r10.K = r2
            return
        L15:
            int r5 = r1.getVisibility()
            r6 = 0
            if (r5 == 0) goto L1e
            r5 = 1
            goto L1f
        L1e:
            r5 = 0
        L1f:
            boolean r7 = r1.isShown()
            if (r7 != 0) goto L27
            r5 = r5 | 2
        L27:
            android.os.PowerManager r7 = r10.D
            if (r7 == 0) goto L33
            boolean r7 = r7.isScreenOn()
            if (r7 != 0) goto L33
            r5 = r5 | 4
        L33:
            com.daaw.Qx1 r7 = r10.G
            boolean r7 = r7.a()
            if (r7 != 0) goto L84
            android.app.KeyguardManager r7 = r10.E
            if (r7 == 0) goto L82
            boolean r7 = r7.inKeyguardRestrictedInputMode()
            if (r7 == 0) goto L82
            char[] r7 = com.daaw.AbstractC3304ay1.a
            android.view.View r7 = r1.getRootView()
            if (r7 != 0) goto L4e
            r7 = r1
        L4e:
            android.content.Context r7 = r7.getContext()
        L52:
            boolean r8 = r7 instanceof android.content.ContextWrapper
            r9 = 0
            if (r8 == 0) goto L6a
            r8 = 10
            if (r6 >= r8) goto L6a
            boolean r8 = r7 instanceof android.app.Activity
            if (r8 == 0) goto L62
            android.app.Activity r7 = (android.app.Activity) r7
            goto L6b
        L62:
            android.content.ContextWrapper r7 = (android.content.ContextWrapper) r7
            android.content.Context r7 = r7.getBaseContext()
            int r6 = r6 + r0
            goto L52
        L6a:
            r7 = r9
        L6b:
            if (r7 != 0) goto L6e
            goto L82
        L6e:
            android.view.Window r0 = r7.getWindow()
            if (r0 != 0) goto L75
            goto L79
        L75:
            android.view.WindowManager$LayoutParams r9 = r0.getAttributes()
        L79:
            if (r9 == 0) goto L82
            int r0 = r9.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r6
            if (r0 != 0) goto L84
        L82:
            r5 = r5 | 8
        L84:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getGlobalVisibleRect(r0)
            if (r0 != 0) goto L91
            r5 = r5 | 16
        L91:
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            boolean r0 = r1.getLocalVisibleRect(r0)
            if (r0 != 0) goto L9e
            r5 = r5 | 32
        L9e:
            int r0 = r1.getWindowVisibility()
            int r1 = r10.L
            if (r1 == r2) goto La7
            r0 = r1
        La7:
            if (r0 == 0) goto Lab
            r5 = r5 | 64
        Lab:
            byte r0 = r10.K
            if (r0 == r5) goto Lbe
            byte r0 = (byte) r5
            r10.K = r0
            if (r5 != 0) goto Lb9
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto Lbc
        Lb9:
            long r0 = (long) r5
            long r0 = r3 - r0
        Lbc:
            r10.M = r0
        Lbe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ViewOnAttachStateChangeListenerC4418ey1.f():void");
    }

    public final void g() {
        N.post(new RunnableC3861cy1(this));
    }

    public final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.H = new WeakReference(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.F == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            C4139dy1 c4139dy1 = new C4139dy1(this);
            this.F = c4139dy1;
            this.B.registerReceiver(c4139dy1, intentFilter);
        }
        Application application = this.C;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.J);
            } catch (Exception unused) {
            }
        }
    }

    public final void i(View view) {
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
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.F;
        if (broadcastReceiver != null) {
            try {
                this.B.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.F = null;
        }
        Application application = this.C;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.J);
            } catch (Exception unused4) {
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        e(activity, 4);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        e(activity, 0);
        f();
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        e(activity, 0);
        f();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        f();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.L = -1;
        h(view);
        f();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.L = -1;
        f();
        g();
        i(view);
    }
}
