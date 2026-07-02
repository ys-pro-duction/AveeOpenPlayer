package com.daaw;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.daaw.u91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8676u91 {
    public static boolean a(Context context, int i) {
        if (!b(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return FT.a(context).b(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static boolean b(Context context, int i, String str) {
        return C6878nj1.a(context).h(i, str);
    }
}
