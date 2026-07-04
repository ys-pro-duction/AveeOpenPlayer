package com.daaw;

import android.content.Context;

/* JADX INFO: renamed from: com.daaw.w00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9195w00 {
    public static Context a;
    public static Boolean b;

    public static synchronized boolean a(Context context) {
        Boolean bool;
        Context applicationContext = context.getApplicationContext();
        Context context2 = a;
        if (context2 != null && (bool = b) != null && context2 == applicationContext) {
            return bool.booleanValue();
        }
        b = null;
        if (AbstractC7494pv0.i()) {
            b = Boolean.valueOf(applicationContext.getPackageManager().isInstantApp());
        } else {
            try {
                context.getClassLoader().loadClass("com.google.android.instantapps.supervisor.InstantAppsRuntime");
                b = Boolean.TRUE;
            } catch (ClassNotFoundException unused) {
                b = Boolean.FALSE;
            }
        }
        a = applicationContext;
        return b.booleanValue();
    }
}
