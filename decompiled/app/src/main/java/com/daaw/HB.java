package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class HB {
    public static Boolean a;
    public static Boolean b;
    public static Boolean c;
    public static Boolean d;
    public static Boolean e;
    public static Boolean f;

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (e == null) {
            boolean z = false;
            if (AbstractC7494pv0.i() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            e = Boolean.valueOf(z);
        }
        return e.booleanValue();
    }

    public static boolean b(Context context) {
        if (f == null) {
            boolean z = false;
            if (AbstractC7494pv0.k() && context.getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")) {
                z = true;
            }
            f = Boolean.valueOf(z);
        }
        return f.booleanValue();
    }

    public static boolean c(Context context) {
        if (c == null) {
            PackageManager packageManager = context.getPackageManager();
            boolean z = false;
            if (packageManager.hasSystemFeature("com.google.android.feature.services_updater") && packageManager.hasSystemFeature("cn.google.services")) {
                z = true;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    public static boolean d(Context context) {
        return h(context);
    }

    public static boolean e() {
        int i = ET.a;
        return "user".equals(Build.TYPE);
    }

    public static boolean f(Context context) {
        return j(context.getPackageManager());
    }

    public static boolean g(Context context) {
        if (f(context) && !AbstractC7494pv0.h()) {
            return true;
        }
        if (h(context)) {
            return !AbstractC7494pv0.i() || AbstractC7494pv0.k();
        }
        return false;
    }

    public static boolean h(Context context) {
        if (b == null) {
            boolean z = false;
            if (AbstractC7494pv0.f() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean i(Context context) {
        if (d == null) {
            boolean z = true;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.type.iot") && !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
                z = false;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean j(PackageManager packageManager) {
        if (a == null) {
            boolean z = false;
            if (AbstractC7494pv0.e() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            a = Boolean.valueOf(z);
        }
        return a.booleanValue();
    }
}
