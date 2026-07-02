package com.daaw;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.os.Build;
import android.os.UserHandle;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: com.daaw.qO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7622qO1 {
    public static final Method a;
    public static final Method b;

    static {
        Method declaredMethod;
        Method declaredMethod2 = null;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod = JobScheduler.class.getDeclaredMethod("scheduleAsPackage", JobInfo.class, String.class, Integer.TYPE, String.class);
            } catch (NoSuchMethodException unused) {
                declaredMethod = null;
            }
        } else {
            declaredMethod = null;
        }
        a = declaredMethod;
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                declaredMethod2 = UserHandle.class.getDeclaredMethod("myUserId", null);
            } catch (NoSuchMethodException unused2) {
            }
        }
        b = declaredMethod2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int a(android.content.Context r4, android.app.job.JobInfo r5, java.lang.String r6, java.lang.String r7) {
        /*
            r6 = 0
            java.lang.String r7 = "jobscheduler"
            java.lang.Object r7 = r4.getSystemService(r7)
            android.app.job.JobScheduler r7 = (android.app.job.JobScheduler) r7
            r7.getClass()
            java.lang.reflect.Method r0 = com.daaw.AbstractC7622qO1.a
            if (r0 == 0) goto L5b
            java.lang.String r0 = "android.permission.UPDATE_DEVICE_STATS"
            int r4 = com.daaw.Y21.a(r4, r0)
            if (r4 == 0) goto L19
            goto L5b
        L19:
            java.lang.reflect.Method r4 = com.daaw.AbstractC7622qO1.b
            if (r4 == 0) goto L2e
            java.lang.Class<android.os.UserHandle> r0 = android.os.UserHandle.class
            r1 = 0
            java.lang.Object r4 = r4.invoke(r0, r1)     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2e
            int r4 = r4.intValue()     // Catch: java.lang.Throwable -> L2d
            goto L2f
        L2d:
        L2e:
            r4 = 0
        L2f:
            java.lang.reflect.Method r0 = com.daaw.AbstractC7622qO1.a
            if (r0 == 0) goto L56
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L56
            r1 = 4
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L56
            r1[r6] = r5     // Catch: java.lang.Throwable -> L56
            java.lang.String r2 = "com.google.android.gms"
            r3 = 1
            r1[r3] = r2     // Catch: java.lang.Throwable -> L56
            r2 = 2
            r1[r2] = r4     // Catch: java.lang.Throwable -> L56
            java.lang.String r4 = "UploadAlarm"
            r2 = 3
            r1[r2] = r4     // Catch: java.lang.Throwable -> L56
            java.lang.Object r4 = r0.invoke(r7, r1)     // Catch: java.lang.Throwable -> L56
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Throwable -> L56
            if (r4 == 0) goto L5a
            int r6 = r4.intValue()     // Catch: java.lang.Throwable -> L56
            goto L5a
        L56:
            int r6 = r7.schedule(r5)
        L5a:
            return r6
        L5b:
            int r4 = r7.schedule(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7622qO1.a(android.content.Context, android.app.job.JobInfo, java.lang.String, java.lang.String):int");
    }
}
