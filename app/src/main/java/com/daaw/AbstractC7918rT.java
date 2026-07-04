package com.daaw;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import java.util.concurrent.Executor;

/* JADX INFO: renamed from: com.daaw.rT, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7918rT {
    public static final Object a = new Object();
    public static Go3 b = null;
    public static HandlerThread c = null;
    public static Executor d = null;
    public static boolean e = false;

    public static AbstractC7918rT a(Context context) {
        synchronized (a) {
            try {
                if (b == null) {
                    b = new Go3(context.getApplicationContext(), e ? b().getLooper() : context.getMainLooper(), d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public static HandlerThread b() {
        synchronized (a) {
            try {
                HandlerThread handlerThread = c;
                if (handlerThread != null) {
                    return handlerThread;
                }
                HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                c = handlerThread2;
                handlerThread2.start();
                return c;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public abstract void c(C9671xi3 c9671xi3, ServiceConnection serviceConnection, String str);

    public final void d(String str, String str2, int i, ServiceConnection serviceConnection, String str3, boolean z) {
        c(new C9671xi3(str, str2, 4225, z), serviceConnection, str3);
    }

    public abstract boolean e(C9671xi3 c9671xi3, ServiceConnection serviceConnection, String str, Executor executor);
}
