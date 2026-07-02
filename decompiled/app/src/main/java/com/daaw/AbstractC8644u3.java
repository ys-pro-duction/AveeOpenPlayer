package com.daaw;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: renamed from: com.daaw.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8644u3 {
    public static final String a = AbstractC1772Od0.f("Alarms");

    public static void a(Context context, C0537Ci1 c0537Ci1, String str) {
        InterfaceC7516q01 interfaceC7516q01Y = c0537Ci1.o().y();
        C7237p01 c7237p01C = interfaceC7516q01Y.c(str);
        if (c7237p01C != null) {
            b(context, str, c7237p01C.b);
            AbstractC1772Od0.c().a(a, String.format("Removing SystemIdInfo for workSpecId (%s)", str), new Throwable[0]);
            interfaceC7516q01Y.d(str);
        }
    }

    public static void b(Context context, String str, int i) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 603979776 : 536870912);
        if (service == null || alarmManager == null) {
            return;
        }
        AbstractC1772Od0.c().a(a, String.format("Cancelling existing alarm with (workSpecId, systemId) (%s, %s)", str, Integer.valueOf(i)), new Throwable[0]);
        alarmManager.cancel(service);
    }

    public static void c(Context context, C0537Ci1 c0537Ci1, String str, long j) {
        WorkDatabase workDatabaseO = c0537Ci1.o();
        InterfaceC7516q01 interfaceC7516q01Y = workDatabaseO.y();
        C7237p01 c7237p01C = interfaceC7516q01Y.c(str);
        if (c7237p01C != null) {
            b(context, str, c7237p01C.b);
            d(context, str, c7237p01C.b, j);
        } else {
            int iB = new RX(workDatabaseO).b();
            interfaceC7516q01Y.b(new C7237p01(str, iB));
            d(context, str, iB, j);
        }
    }

    public static void d(Context context, String str, int i, long j) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent service = PendingIntent.getService(context, i, androidx.work.impl.background.systemalarm.a.b(context, str), Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
        if (alarmManager != null) {
            alarmManager.setExact(0, j, service);
        }
    }
}
