package com.daaw;

/* JADX INFO: renamed from: com.daaw.u93, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC8678u93 {
    public static volatile Ha3 a = Ha3.c();
    public static final Object b = new Object();

    /* JADX WARN: Removed duplicated region for block: B:29:0x0073 A[Catch: all -> 0x0045, TRY_LEAVE, TryCatch #0 {all -> 0x0045, blocks: (B:12:0x002f, B:14:0x0037, B:15:0x0043, B:19:0x0047, B:21:0x0053, B:25:0x0063, B:27:0x0069, B:34:0x0084, B:35:0x008e, B:29:0x0073, B:30:0x0077, B:31:0x007d), top: B:41:0x002f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r5, android.net.Uri r6) {
        /*
            java.lang.String r0 = "com.google.android.gms.phenotype"
            java.lang.String r6 = r6.getAuthority()
            boolean r0 = r0.equals(r6)
            r1 = 0
            if (r0 != 0) goto L17
            java.lang.String r5 = java.lang.String.valueOf(r6)
            java.lang.String r6 = " is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."
            r5.concat(r6)
            return r1
        L17:
            com.daaw.Ha3 r6 = com.daaw.AbstractC8678u93.a
            boolean r6 = r6.b()
            if (r6 == 0) goto L2c
            com.daaw.Ha3 r5 = com.daaw.AbstractC8678u93.a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L2c:
            java.lang.Object r6 = com.daaw.AbstractC8678u93.b
            monitor-enter(r6)
            com.daaw.Ha3 r0 = com.daaw.AbstractC8678u93.a     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.b()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L47
            com.daaw.Ha3 r5 = com.daaw.AbstractC8678u93.a     // Catch: java.lang.Throwable -> L45
            java.lang.Object r5 = r5.a()     // Catch: java.lang.Throwable -> L45
            java.lang.Boolean r5 = (java.lang.Boolean) r5     // Catch: java.lang.Throwable -> L45
            boolean r5 = r5.booleanValue()     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            return r5
        L45:
            r5 = move-exception
            goto L9c
        L47:
            java.lang.String r0 = "com.google.android.gms"
            java.lang.String r2 = r5.getPackageName()     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.equals(r2)     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L73
            android.content.pm.PackageManager r0 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = "com.google.android.gms.phenotype"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L45
            r4 = 29
            if (r3 >= r4) goto L61
            r3 = 0
            goto L63
        L61:
            r3 = 268435456(0x10000000, float:2.524355E-29)
        L63:
            android.content.pm.ProviderInfo r0 = r0.resolveContentProvider(r2, r3)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L84
            java.lang.String r2 = "com.google.android.gms"
            java.lang.String r0 = r0.packageName     // Catch: java.lang.Throwable -> L45
            boolean r0 = r2.equals(r0)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L84
        L73:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = "com.google.android.gms"
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r0, r1)     // Catch: java.lang.Throwable -> L45 android.content.pm.PackageManager.NameNotFoundException -> L84
            int r5 = r5.flags     // Catch: java.lang.Throwable -> L45
            r5 = r5 & 129(0x81, float:1.81E-43)
            if (r5 == 0) goto L84
            r1 = 1
        L84:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)     // Catch: java.lang.Throwable -> L45
            com.daaw.Ha3 r5 = com.daaw.Ha3.d(r5)     // Catch: java.lang.Throwable -> L45
            com.daaw.AbstractC8678u93.a = r5     // Catch: java.lang.Throwable -> L45
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            com.daaw.Ha3 r5 = com.daaw.AbstractC8678u93.a
            java.lang.Object r5 = r5.a()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L9c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L45
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8678u93.a(android.content.Context, android.net.Uri):boolean");
    }
}
