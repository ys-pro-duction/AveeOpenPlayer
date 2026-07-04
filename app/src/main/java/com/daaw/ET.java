package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import com.google.android.gms.common.ConnectionResult;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public abstract class ET {
    public static final int a = 12451000;
    public static boolean c = false;
    public static boolean d = false;
    public static final AtomicBoolean b = new AtomicBoolean();
    public static final AtomicBoolean e = new AtomicBoolean();

    public static void a(Context context, int i) throws BT, CT {
        int iH = C9599xT.f().h(context, i);
        if (iH != 0) {
            Intent intentB = C9599xT.f().b(context, iH, "e");
            if (intentB != null) {
                throw new CT(iH, "Google Play Services not available", intentB);
            }
            throw new BT(iH);
        }
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    public static String c(int i) {
        return ConnectionResult.D(i);
    }

    public static Context d(Context context) {
        try {
            return context.createPackageContext("com.google.android.gms", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static Resources e(Context context) {
        try {
            return context.getPackageManager().getResourcesForApplication("com.google.android.gms");
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }

    public static boolean f(Context context) {
        if (!d) {
            try {
                PackageInfo packageInfoF = C6878nj1.a(context).f("com.google.android.gms", 64);
                FT.a(context);
                if (packageInfoF == null || FT.e(packageInfoF, false) || !FT.e(packageInfoF, true)) {
                    c = false;
                } else {
                    c = true;
                }
                d = true;
            } catch (PackageManager.NameNotFoundException unused) {
                d = true;
            } catch (Throwable th) {
                d = true;
                throw th;
            }
        }
        return c || !HB.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int g(android.content.Context r9, int r10) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ET.g(android.content.Context, int):int");
    }

    public static boolean h(Context context, int i) {
        if (i == 18) {
            return true;
        }
        if (i == 1) {
            return l(context, "com.google.android.gms");
        }
        return false;
    }

    public static boolean i(Context context) {
        if (!AbstractC7494pv0.c()) {
            return false;
        }
        Object systemService = context.getSystemService("user");
        AbstractC7506py0.l(systemService);
        Bundle applicationRestrictions = ((UserManager) systemService).getApplicationRestrictions(context.getPackageName());
        return applicationRestrictions != null && "true".equals(applicationRestrictions.getString("restricted_profile"));
    }

    public static boolean j(int i) {
        return i == 1 || i == 2 || i == 3 || i == 9;
    }

    public static boolean k(Context context, int i, String str) {
        return AbstractC8676u91.b(context, i, str);
    }

    public static boolean l(Context context, String str) {
        ApplicationInfo applicationInfo;
        boolean zEquals = str.equals("com.google.android.gms");
        if (AbstractC7494pv0.f()) {
            try {
                Iterator<PackageInstaller.SessionInfo> it = context.getPackageManager().getPackageInstaller().getAllSessions().iterator();
                while (it.hasNext()) {
                    if (str.equals(it.next().getAppPackageName())) {
                        return true;
                    }
                }
            } catch (Exception unused) {
                return false;
            }
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(str, 8192);
        } catch (PackageManager.NameNotFoundException unused2) {
        }
        return zEquals ? applicationInfo.enabled : applicationInfo.enabled && !i(context);
    }
}
