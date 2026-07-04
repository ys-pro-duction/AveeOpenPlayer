package com.daaw;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.rB0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7847rB0 {
    public static final C9599xT a = C9599xT.f();
    public static final Object b = new Object();
    public static Method c = null;
    public static Method d = null;

    public static void a(Context context) {
        Context contextB;
        AbstractC7506py0.m(context, "Context must not be null");
        a.k(context, 11925000);
        synchronized (b) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            try {
                contextB = DynamiteModule.e(context, DynamiteModule.f, "com.google.android.gms.providerinstaller.dynamite").b();
            } catch (DynamiteModule.a e) {
                "Failed to load providerinstaller module: ".concat(String.valueOf(e.getMessage()));
                contextB = null;
            }
            if (contextB != null) {
                c(contextB, context, "com.google.android.gms.providerinstaller.ProviderInstallerImpl");
                return;
            }
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            Context contextD = ET.d(context);
            if (contextD != null) {
                try {
                    if (d == null) {
                        Class cls = Long.TYPE;
                        d = b(contextD, "com.google.android.gms.common.security.ProviderInstallerImpl", "reportRequestStats", new Class[]{Context.class, cls, cls});
                    }
                    d.invoke(null, context, Long.valueOf(jElapsedRealtime), Long.valueOf(jElapsedRealtime2));
                } catch (Exception e2) {
                    "Failed to report request stats: ".concat(String.valueOf(e2.getMessage()));
                }
            }
            if (contextD == null) {
                throw new BT(8);
            }
            c(contextD, context, "com.google.android.gms.common.security.ProviderInstallerImpl");
        }
    }

    public static Method b(Context context, String str, String str2, Class[] clsArr) {
        return context.getClassLoader().loadClass(str).getMethod(str2, clsArr);
    }

    public static void c(Context context, Context context2, String str) throws BT {
        try {
            if (c == null) {
                c = b(context, str, "insertProvider", new Class[]{Context.class});
            }
            c.invoke(null, context);
        } catch (Exception e) {
            Throwable cause = e.getCause();
            if (Log.isLoggable("ProviderInstaller", 6)) {
                "Failed to install provider: ".concat(String.valueOf(cause == null ? e.getMessage() : cause.getMessage()));
            }
            throw new BT(8);
        }
    }
}
