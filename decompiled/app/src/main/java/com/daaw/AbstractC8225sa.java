package com.daaw;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.UUID;

/* JADX INFO: renamed from: com.daaw.sa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8225sa {
    public static final ConcurrentHashMap a = new ConcurrentHashMap();

    public static H70 a(Context context) {
        String packageName = context.getPackageName();
        ConcurrentHashMap concurrentHashMap = a;
        H70 h70 = (H70) concurrentHashMap.get(packageName);
        if (h70 != null) {
            return h70;
        }
        H70 h70B = b(context);
        H70 h702 = (H70) concurrentHashMap.putIfAbsent(packageName, h70B);
        return h702 == null ? h70B : h702;
    }

    public static H70 b(Context context) {
        PackageInfo packageInfo;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            packageInfo = null;
        }
        return new C5699jY0(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
    }
}
