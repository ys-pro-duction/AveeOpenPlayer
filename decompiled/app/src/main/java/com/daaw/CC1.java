package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class CC1 {
    public static ClassLoader a;
    public static Thread b;

    /* JADX WARN: Removed duplicated region for block: B:52:0x0092 A[Catch: all -> 0x008e, PHI: r1
  0x0092: PHI (r1v4 java.lang.Thread) = (r1v3 java.lang.Thread), (r1v14 java.lang.Thread) binds: [B:7:0x000a, B:46:0x008b] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:6:0x0007, B:8:0x000c, B:45:0x0089, B:60:0x00a1, B:12:0x001f, B:51:0x0091, B:52:0x0092, B:63:0x00a5, B:64:0x00a6, B:53:0x0093, B:59:0x00a0, B:58:0x009d, B:13:0x0020, B:15:0x002d, B:25:0x0046, B:26:0x004d, B:28:0x0058, B:34:0x006d, B:35:0x0074, B:42:0x0084, B:43:0x0087, B:18:0x003c), top: B:78:0x0003, inners: #1, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.lang.ClassLoader a() {
        /*
            java.lang.Class<com.daaw.CC1> r0 = com.daaw.CC1.class
            monitor-enter(r0)
            java.lang.ClassLoader r1 = com.daaw.CC1.a     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto La6
            java.lang.Thread r1 = com.daaw.CC1.b     // Catch: java.lang.Throwable -> L8e
            r2 = 0
            if (r1 != 0) goto L92
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L8e
            java.lang.Thread r1 = r1.getThread()     // Catch: java.lang.Throwable -> L8e
            java.lang.ThreadGroup r1 = r1.getThreadGroup()     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L1d
            r1 = r2
            goto L89
        L1d:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L8e
            int r4 = r1.activeGroupCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.ThreadGroup[] r5 = new java.lang.ThreadGroup[r4]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r1.enumerate(r5)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r6 = 0
            r7 = 0
        L2b:
            if (r7 >= r4) goto L43
            r8 = r5[r7]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r9 = "dynamiteLoader"
            java.lang.String r10 = r8.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r9 == 0) goto L3c
            goto L44
        L3c:
            int r7 = r7 + 1
            goto L2b
        L3f:
            r1 = move-exception
            goto L90
        L41:
            r1 = move-exception
            goto L82
        L43:
            r8 = r2
        L44:
            if (r8 != 0) goto L4d
            java.lang.ThreadGroup r8 = new java.lang.ThreadGroup     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r4 = "dynamiteLoader"
            r8.<init>(r1, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L4d:
            int r1 = r8.activeCount()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.Thread[] r4 = new java.lang.Thread[r1]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            r8.enumerate(r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
        L56:
            if (r6 >= r1) goto L6a
            r5 = r4[r6]     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            java.lang.String r7 = "GmsDynamite"
            java.lang.String r9 = r5.getName()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            boolean r7 = r7.equals(r9)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L41
            if (r7 == 0) goto L67
            goto L6b
        L67:
            int r6 = r6 + 1
            goto L56
        L6a:
            r5 = r2
        L6b:
            if (r5 != 0) goto L87
            com.daaw.Gm1 r1 = new com.daaw.Gm1     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7f
            java.lang.String r4 = "GmsDynamite"
            r1.<init>(r8, r4)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7f
            r1.setContextClassLoader(r2)     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r1.start()     // Catch: java.lang.Throwable -> L3f java.lang.SecurityException -> L7c
            r5 = r1
            goto L87
        L7c:
            r4 = move-exception
            r5 = r1
            goto L84
        L7f:
            r1 = move-exception
            r4 = r1
            goto L84
        L82:
            r4 = r1
            r5 = r2
        L84:
            r4.getMessage()     // Catch: java.lang.Throwable -> L3f
        L87:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            r1 = r5
        L89:
            com.daaw.CC1.b = r1     // Catch: java.lang.Throwable -> L8e
            if (r1 != 0) goto L92
            goto La1
        L8e:
            r1 = move-exception
            goto Laa
        L90:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L3f
            throw r1     // Catch: java.lang.Throwable -> L8e
        L92:
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L8e
            java.lang.Thread r3 = com.daaw.CC1.b     // Catch: java.lang.Throwable -> L9a java.lang.SecurityException -> L9c
            java.lang.ClassLoader r2 = r3.getContextClassLoader()     // Catch: java.lang.Throwable -> L9a java.lang.SecurityException -> L9c
            goto La0
        L9a:
            r2 = move-exception
            goto La4
        L9c:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L9a
        La0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
        La1:
            com.daaw.CC1.a = r2     // Catch: java.lang.Throwable -> L8e
            goto La6
        La4:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L9a
            throw r2     // Catch: java.lang.Throwable -> L8e
        La6:
            java.lang.ClassLoader r1 = com.daaw.CC1.a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)
            return r1
        Laa:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.CC1.a():java.lang.ClassLoader");
    }
}
