package com.daaw;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.Hn0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1085Hn0 extends AbstractC5232hr {
    public static final String j = AbstractC1772Od0.f("NetworkStateTracker");
    public final ConnectivityManager g;
    public b h;
    public a i;

    /* JADX INFO: renamed from: com.daaw.Hn0$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            AbstractC1772Od0.c().a(C1085Hn0.j, "Network broadcast received", new Throwable[0]);
            C1085Hn0 c1085Hn0 = C1085Hn0.this;
            c1085Hn0.d(c1085Hn0.g());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Hn0$b */
    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            AbstractC1772Od0.c().a(C1085Hn0.j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            C1085Hn0 c1085Hn0 = C1085Hn0.this;
            c1085Hn0.d(c1085Hn0.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            AbstractC1772Od0.c().a(C1085Hn0.j, "Network connection lost", new Throwable[0]);
            C1085Hn0 c1085Hn0 = C1085Hn0.this;
            c1085Hn0.d(c1085Hn0.g());
        }
    }

    public C1085Hn0(Context context, InterfaceC8357t11 interfaceC8357t11) {
        super(context, interfaceC8357t11);
        this.g = (ConnectivityManager) this.b.getSystemService("connectivity");
        if (j()) {
            this.h = new b();
        } else {
            this.i = new a();
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // com.daaw.AbstractC5232hr
    public void e() {
        if (!j()) {
            AbstractC1772Od0.c().a(j, "Registering broadcast receiver", new Throwable[0]);
            this.b.registerReceiver(this.i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            AbstractC1772Od0.c().a(j, "Registering network callback", new Throwable[0]);
            this.g.registerDefaultNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            AbstractC1772Od0.c().b(j, "Received exception while registering network callback", e);
        }
    }

    @Override // com.daaw.AbstractC5232hr
    public void f() {
        if (!j()) {
            AbstractC1772Od0.c().a(j, "Unregistering broadcast receiver", new Throwable[0]);
            this.b.unregisterReceiver(this.i);
            return;
        }
        try {
            AbstractC1772Od0.c().a(j, "Unregistering network callback", new Throwable[0]);
            this.g.unregisterNetworkCallback(this.h);
        } catch (IllegalArgumentException | SecurityException e) {
            AbstractC1772Od0.c().b(j, "Received exception while unregistering network callback", e);
        }
    }

    public C0773En0 g() {
        NetworkInfo activeNetworkInfo = this.g.getActiveNetworkInfo();
        boolean z = false;
        boolean z2 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zI = i();
        boolean zA = AbstractC0888Fq.a(this.g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z = true;
        }
        return new C0773En0(z2, zI, zA, z);
    }

    @Override // com.daaw.AbstractC5232hr
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C0773En0 b() {
        return g();
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.g.getNetworkCapabilities(this.g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e) {
            AbstractC1772Od0.c().b(j, "Unable to validate active network", e);
            return false;
        }
    }
}
