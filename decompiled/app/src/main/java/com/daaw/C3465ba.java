package com.daaw;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.daaw.ba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3465ba {
    public static final C3465ba a = new C3465ba();
    public static int b = 1;
    public static int c = 2;
    public static int d = 3;
    public static int e = 4;
    public static final int f = 8;

    public static final boolean a(Context context, Activity activity) {
        int i;
        G10.g(context, "context");
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        String str = i2 >= 33 ? "android.permission.READ_MEDIA_AUDIO" : "android.permission.WRITE_EXTERNAL_STORAGE";
        if (context.checkSelfPermission(str) != 0) {
            arrayList.add(str);
            if (i2 >= 33) {
                arrayList.add("android.permission.READ_MEDIA_IMAGES");
            }
            i = b;
        } else {
            i = 0;
        }
        if (context.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            arrayList.add("android.permission.RECORD_AUDIO");
            i = i == b ? e : c;
        }
        if (i2 >= 33) {
            if (context.checkSelfPermission("android.permission.POST_NOTIFICATIONS") != 0) {
                arrayList.add("android.permission.POST_NOTIFICATIONS");
            }
            if (context.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") != 0) {
                arrayList.add("android.permission.READ_MEDIA_VIDEO");
            }
        }
        if (arrayList.isEmpty()) {
            return true;
        }
        if (activity != null) {
            AbstractC9204w2.o(activity, (String[]) arrayList.toArray(new String[0]), i);
        }
        return false;
    }

    public static final boolean b(Context context, Activity activity) {
        G10.g(context, "context");
        if (Build.VERSION.SDK_INT < 23 || context.checkSelfPermission("android.permission.WRITE_SETTINGS") == 0) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        AbstractC9204w2.o(activity, new String[]{"android.permission.WRITE_SETTINGS"}, d);
        return false;
    }
}
