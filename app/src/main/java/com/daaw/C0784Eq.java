package com.daaw;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.NoSuchElementException;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.Eq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0784Eq {
    public static final Object b = new Object();
    public static volatile C0784Eq c;
    public final ConcurrentHashMap a = new ConcurrentHashMap();

    public static C0784Eq b() {
        if (c == null) {
            synchronized (b) {
                try {
                    if (c == null) {
                        c = new C0784Eq();
                    }
                } finally {
                }
            }
        }
        C0784Eq c0784Eq = c;
        AbstractC7506py0.l(c0784Eq);
        return c0784Eq;
    }

    public static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    public static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof InterfaceC8025rp3);
    }

    public static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!AbstractC7494pv0.j() || executor == null) ? context.bindService(intent, serviceConnection, i) : context.bindService(intent, i, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i, true, null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.a.get(serviceConnection));
        } finally {
            this.a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }

    public final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i, boolean z, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((C6878nj1.a(context).c(packageName, 0).flags & 2097152) != 0) {
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.a.putIfAbsent(serviceConnection, serviceConnection);
        if (serviceConnection2 != null && serviceConnection != serviceConnection2) {
            String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", serviceConnection, str, intent.getAction());
        }
        try {
            boolean zH = h(context, intent, serviceConnection, i, executor);
            if (zH) {
                return zH;
            }
            return false;
        } finally {
            this.a.remove(serviceConnection, serviceConnection);
        }
    }
}
