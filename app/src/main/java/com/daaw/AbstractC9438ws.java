package com.daaw;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.text.TextUtils;
import java.io.File;

/* JADX INFO: renamed from: com.daaw.ws, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9438ws {
    public static final Object a = new Object();

    /* JADX INFO: renamed from: com.daaw.ws$a */
    public static class a {
        public static File a(Context context) {
            return context.getCodeCacheDir();
        }

        public static Drawable b(Context context, int i) {
            return context.getDrawable(i);
        }

        public static File c(Context context) {
            return context.getNoBackupFilesDir();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ws$b */
    public static class b {
        public static int a(Context context, int i) {
            return context.getColor(i);
        }

        public static <T> T b(Context context, Class<T> cls) {
            return (T) context.getSystemService(cls);
        }

        public static String c(Context context, Class<?> cls) {
            return context.getSystemServiceName(cls);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ws$c */
    public static class c {
        public static Context a(Context context) {
            return context.createDeviceProtectedStorageContext();
        }

        public static File b(Context context) {
            return context.getDataDir();
        }

        public static boolean c(Context context) {
            return context.isDeviceProtectedStorage();
        }
    }

    /* JADX INFO: renamed from: com.daaw.ws$d */
    public static class d {
        public static Intent a(Context context, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter, String str, Handler handler, int i) {
            return ((i & 4) == 0 || str != null) ? context.registerReceiver(broadcastReceiver, intentFilter, str, handler, i & 1) : context.registerReceiver(broadcastReceiver, intentFilter, AbstractC9438ws.h(context), handler);
        }

        public static ComponentName b(Context context, Intent intent) {
            return context.startForegroundService(intent);
        }
    }

    public static int a(Context context, String str) {
        AbstractC8580tp0.d(str, "permission must be non-null");
        return (Build.VERSION.SDK_INT >= 33 || !TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) ? context.checkPermission(str, Process.myPid(), Process.myUid()) : C1712No0.b(context).a() ? 0 : -1;
    }

    public static Context b(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return c.a(context);
        }
        return null;
    }

    public static int c(Context context, int i) {
        return Build.VERSION.SDK_INT >= 23 ? b.a(context, i) : context.getResources().getColor(i);
    }

    public static ColorStateList d(Context context, int i) {
        return XI0.d(context.getResources(), i, context.getTheme());
    }

    public static Drawable e(Context context, int i) {
        return a.b(context, i);
    }

    public static File[] f(Context context) {
        return context.getExternalCacheDirs();
    }

    public static File[] g(Context context, String str) {
        return context.getExternalFilesDirs(str);
    }

    public static String h(Context context) {
        String str = context.getPackageName() + ".DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION";
        if (AbstractC1524Lt0.b(context, str) == 0) {
            return str;
        }
        throw new RuntimeException("Permission " + str + " is required by your application to receive broadcasts, please add it to your manifest");
    }

    public static boolean i(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
        return true;
    }

    public static void j(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }

    public static void k(Context context, Intent intent) {
        if (Build.VERSION.SDK_INT >= 26) {
            d.b(context, intent);
        } else {
            context.startService(intent);
        }
    }
}
