package com.daaw;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Bundle;
import com.daaw.InterfaceC1096Hq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
public final class E5 implements InterfaceC1096Hq {
    public final Context a;
    public final ConnectivityManager b;
    public Runnable c;
    public final List d = new ArrayList();

    public class c extends ConnectivityManager.NetworkCallback {
        public c() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            E5.this.i(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            E5.this.i(false);
        }

        public /* synthetic */ c(E5 e5, a aVar) {
            this();
        }
    }

    public E5(Context context) {
        AbstractC6557mb.d(context != null, "Context must be non-null", new Object[0]);
        this.a = context;
        this.b = (ConnectivityManager) context.getSystemService("connectivity");
        f();
        g();
    }

    @Override // com.daaw.InterfaceC1096Hq
    public void a(InterfaceC8310sr interfaceC8310sr) {
        synchronized (this.d) {
            this.d.add(interfaceC8310sr);
        }
    }

    public final void f() {
        Application application = (Application) this.a.getApplicationContext();
        AtomicBoolean atomicBoolean = new AtomicBoolean();
        application.registerActivityLifecycleCallbacks(new a(atomicBoolean));
        application.registerComponentCallbacks(new b(atomicBoolean));
    }

    public final void g() {
        a aVar = null;
        if (Build.VERSION.SDK_INT >= 24 && this.b != null) {
            final c cVar = new c(this, aVar);
            this.b.registerDefaultNetworkCallback(cVar);
            this.c = new Runnable() { // from class: com.daaw.C5
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.b.unregisterNetworkCallback(cVar);
                }
            };
        } else {
            final d dVar = new d(this, aVar);
            this.a.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            this.c = new Runnable() { // from class: com.daaw.D5
                @Override // java.lang.Runnable
                public final void run() {
                    this.B.a.unregisterReceiver(dVar);
                }
            };
        }
    }

    public final boolean h() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void i(boolean z) {
        synchronized (this.d) {
            try {
                Iterator it = this.d.iterator();
                while (it.hasNext()) {
                    ((InterfaceC8310sr) it.next()).accept(z ? InterfaceC1096Hq.a.REACHABLE : InterfaceC1096Hq.a.UNREACHABLE);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void j() {
        AbstractC2212Sd0.a("AndroidConnectivityMonitor", "App has entered the foreground.", new Object[0]);
        if (h()) {
            i(true);
        }
    }

    public class d extends BroadcastReceiver {
        public boolean a;

        public d() {
            this.a = false;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean zH = E5.this.h();
            if (E5.this.h() && !this.a) {
                E5.this.i(true);
            } else if (!zH && this.a) {
                E5.this.i(false);
            }
            this.a = zH;
        }

        public /* synthetic */ d(E5 e5, a aVar) {
            this();
        }
    }

    public class b implements ComponentCallbacks2 {
        public final /* synthetic */ AtomicBoolean B;

        public b(AtomicBoolean atomicBoolean) {
            this.B = atomicBoolean;
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i) {
            if (i == 20) {
                this.B.set(true);
            }
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }
    }

    public class a implements Application.ActivityLifecycleCallbacks {
        public final /* synthetic */ AtomicBoolean B;

        public a(AtomicBoolean atomicBoolean) {
            this.B = atomicBoolean;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (this.B.compareAndSet(true, false)) {
                E5.this.j();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            if (this.B.compareAndSet(true, false)) {
                E5.this.j();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
            if (this.B.compareAndSet(true, false)) {
                E5.this.j();
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }
    }
}
