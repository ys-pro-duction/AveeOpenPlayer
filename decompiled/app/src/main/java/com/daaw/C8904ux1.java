package com.daaw;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;

/* JADX INFO: renamed from: com.daaw.ux1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C8904ux1 {
    public NetworkCapabilities a;

    public C8904ux1(ConnectivityManager connectivityManager) {
        if (connectivityManager == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            connectivityManager.registerDefaultNetworkCallback(new C8618tx1(this));
        } catch (RuntimeException unused) {
            synchronized (C8904ux1.class) {
                this.a = null;
            }
        }
    }

    public static C8904ux1 c(Context context) {
        if (context != null) {
            return new C8904ux1((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (C8904ux1.class) {
            try {
                NetworkCapabilities networkCapabilities = this.a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final NetworkCapabilities b() {
        return this.a;
    }
}
