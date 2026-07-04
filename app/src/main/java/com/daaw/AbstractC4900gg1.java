package com.daaw;

import android.content.Context;
import android.os.PowerManager;
import java.util.HashMap;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: com.daaw.gg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4900gg1 {
    public static final String a = AbstractC1772Od0.f("WakeLocks");
    public static final WeakHashMap b = new WeakHashMap();

    public static void a() {
        HashMap map = new HashMap();
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            map.putAll(weakHashMap);
        }
        for (PowerManager.WakeLock wakeLock : map.keySet()) {
            if (wakeLock != null && wakeLock.isHeld()) {
                AbstractC1772Od0.c().h(a, String.format("WakeLock held for %s", map.get(wakeLock)), new Throwable[0]);
            }
        }
    }

    public static PowerManager.WakeLock b(Context context, String str) {
        String str2 = "WorkManager: " + str;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getApplicationContext().getSystemService("power")).newWakeLock(1, str2);
        WeakHashMap weakHashMap = b;
        synchronized (weakHashMap) {
            weakHashMap.put(wakeLockNewWakeLock, str2);
        }
        return wakeLockNewWakeLock;
    }
}
