package com.daaw;

import android.os.Build;
import android.os.UserManager;

/* JADX INFO: renamed from: com.daaw.a83, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3076a83 {
    public static UserManager a;
    public static volatile boolean b = !b();

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0041, code lost:
    
        r7 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x004c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, NullPointerException -> 0x0045, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:34:0x0050, B:35:0x0052, B:24:0x0031, B:26:0x0037, B:32:0x004c, B:30:0x0045), top: B:41:0x000f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r7) {
        /*
            boolean r0 = b()
            r1 = 0
            if (r0 == 0) goto L58
            boolean r0 = com.daaw.AbstractC3076a83.b
            if (r0 == 0) goto Lc
            goto L58
        Lc:
            java.lang.Class<com.daaw.a83> r0 = com.daaw.AbstractC3076a83.class
            monitor-enter(r0)
            boolean r2 = com.daaw.AbstractC3076a83.b     // Catch: java.lang.Throwable -> L15
            if (r2 == 0) goto L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            goto L58
        L15:
            r7 = move-exception
            goto L56
        L17:
            r2 = 1
            r3 = 1
        L19:
            r4 = 2
            r5 = 0
            if (r3 > r4) goto L43
            android.os.UserManager r4 = com.daaw.AbstractC3076a83.a     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L2b
            java.lang.Class<android.os.UserManager> r4 = android.os.UserManager.class
            java.lang.Object r4 = com.daaw.AbstractC7534q4.a(r7, r4)     // Catch: java.lang.Throwable -> L15
            android.os.UserManager r4 = (android.os.UserManager) r4     // Catch: java.lang.Throwable -> L15
            com.daaw.AbstractC3076a83.a = r4     // Catch: java.lang.Throwable -> L15
        L2b:
            android.os.UserManager r4 = com.daaw.AbstractC3076a83.a     // Catch: java.lang.Throwable -> L15
            if (r4 != 0) goto L31
            r7 = 1
            goto L4e
        L31:
            boolean r6 = com.daaw.Z73.a(r4)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r6 != 0) goto L41
            android.os.UserHandle r6 = android.os.Process.myUserHandle()     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            boolean r7 = r4.isUserRunning(r6)     // Catch: java.lang.Throwable -> L15 java.lang.NullPointerException -> L45
            if (r7 != 0) goto L43
        L41:
            r7 = 1
            goto L4a
        L43:
            r7 = 0
            goto L4a
        L45:
            com.daaw.AbstractC3076a83.a = r5     // Catch: java.lang.Throwable -> L15
            int r3 = r3 + 1
            goto L19
        L4a:
            if (r7 == 0) goto L4e
            com.daaw.AbstractC3076a83.a = r5     // Catch: java.lang.Throwable -> L15
        L4e:
            if (r7 == 0) goto L52
            com.daaw.AbstractC3076a83.b = r2     // Catch: java.lang.Throwable -> L15
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            if (r7 != 0) goto L58
            return r2
        L56:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
            throw r7
        L58:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC3076a83.a(android.content.Context):boolean");
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 24;
    }
}
