package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.d5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3893d5 extends AbstractC5662jP {
    public static final AbstractC6583mg0 c = j();
    public final AbstractC5456ig0 a;
    public Context b;

    /* JADX INFO: renamed from: com.daaw.d5$b */
    public static final class b extends AbstractC5178hg0 {
        public final AbstractC5178hg0 a;
        public final Context b;
        public final ConnectivityManager c;
        public final Object d = new Object();
        public Runnable e;

        /* JADX INFO: renamed from: com.daaw.d5$b$a */
        public class a implements Runnable {
            public final /* synthetic */ c B;

            public a(c cVar) {
                this.B = cVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.c.unregisterNetworkCallback(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.d5$b$b, reason: collision with other inner class name */
        public class RunnableC0163b implements Runnable {
            public final /* synthetic */ d B;

            public RunnableC0163b(d dVar) {
                this.B = dVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.b.unregisterReceiver(this.B);
            }
        }

        /* JADX INFO: renamed from: com.daaw.d5$b$c */
        public class c extends ConnectivityManager.NetworkCallback {
            public c() {
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(Network network) {
                b.this.a.i();
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onBlockedStatusChanged(Network network, boolean z) {
                if (z) {
                    return;
                }
                b.this.a.i();
            }
        }

        /* JADX INFO: renamed from: com.daaw.d5$b$d */
        public class d extends BroadcastReceiver {
            public boolean a;

            public d() {
                this.a = false;
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
                boolean z = this.a;
                boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
                this.a = z2;
                if (!z2 || z) {
                    return;
                }
                b.this.a.i();
            }
        }

        public b(AbstractC5178hg0 abstractC5178hg0, Context context) {
            this.a = abstractC5178hg0;
            this.b = context;
            if (context == null) {
                this.c = null;
                return;
            }
            this.c = (ConnectivityManager) context.getSystemService("connectivity");
            try {
                p();
            } catch (SecurityException unused) {
            }
        }

        @Override // com.daaw.AbstractC3515bk
        public String a() {
            return this.a.a();
        }

        @Override // com.daaw.AbstractC3515bk
        public AbstractC1699Nl e(C6882nk0 c6882nk0, C1168Ii c1168Ii) {
            return this.a.e(c6882nk0, c1168Ii);
        }

        @Override // com.daaw.AbstractC5178hg0
        public void i() {
            this.a.i();
        }

        @Override // com.daaw.AbstractC5178hg0
        public EnumC1304Jq j(boolean z) {
            return this.a.j(z);
        }

        @Override // com.daaw.AbstractC5178hg0
        public void k(EnumC1304Jq enumC1304Jq, Runnable runnable) {
            this.a.k(enumC1304Jq, runnable);
        }

        @Override // com.daaw.AbstractC5178hg0
        public AbstractC5178hg0 l() {
            q();
            return this.a.l();
        }

        public final void p() {
            if (Build.VERSION.SDK_INT >= 24 && this.c != null) {
                c cVar = new c();
                this.c.registerDefaultNetworkCallback(cVar);
                this.e = new a(cVar);
            } else {
                d dVar = new d();
                this.b.registerReceiver(dVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                this.e = new RunnableC0163b(dVar);
            }
        }

        public final void q() {
            synchronized (this.d) {
                try {
                    Runnable runnable = this.e;
                    if (runnable != null) {
                        runnable.run();
                        this.e = null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public C3893d5(AbstractC5456ig0 abstractC5456ig0) {
        this.a = (AbstractC5456ig0) AbstractC7785qy0.o(abstractC5456ig0, "delegateBuilder");
    }

    public static AbstractC6583mg0 j() {
        AbstractC6583mg0 abstractC6583mg0 = (AbstractC6583mg0) C1405Kp0.class.asSubclass(AbstractC6583mg0.class).getConstructor(null).newInstance(null);
        if (AbstractC6683n10.a(abstractC6583mg0)) {
            return abstractC6583mg0;
        }
        return null;
    }

    public static C3893d5 k(AbstractC5456ig0 abstractC5456ig0) {
        return new C3893d5(abstractC5456ig0);
    }

    @Override // com.daaw.AbstractC5456ig0
    public AbstractC5178hg0 a() {
        return new b(this.a.a(), this.b);
    }

    @Override // com.daaw.AbstractC5662jP
    public AbstractC5456ig0 e() {
        return this.a;
    }

    public C3893d5 i(Context context) {
        this.b = context;
        return this;
    }
}
