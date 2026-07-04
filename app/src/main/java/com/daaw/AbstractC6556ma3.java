package com.daaw;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.daaw.ma3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6556ma3 {
    public static volatile X93 g;
    public final U93 a;
    public final String b;
    public final Object c;
    public volatile int d = -1;
    public volatile Object e;
    public static final Object f = new Object();
    public static final AtomicReference h = new AtomicReference();
    public static final C8229sa3 i = new C8229sa3(F93.a);
    public static final AtomicInteger j = new AtomicInteger();

    public /* synthetic */ AbstractC6556ma3(U93 u93, String str, Object obj, boolean z, AbstractC5710ja3 abstractC5710ja3) {
        if (u93.a == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        }
        this.a = u93;
        this.b = str;
        this.c = obj;
    }

    public static void c() {
        j.incrementAndGet();
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0045, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x004a, code lost:
    
        throw r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void d(final android.content.Context r3) {
        /*
            com.daaw.X93 r0 = com.daaw.AbstractC6556ma3.g
            if (r0 != 0) goto L4b
            if (r3 != 0) goto L7
            goto L4b
        L7:
            java.lang.Object r0 = com.daaw.AbstractC6556ma3.f
            monitor-enter(r0)
            com.daaw.X93 r1 = com.daaw.AbstractC6556ma3.g     // Catch: java.lang.Throwable -> L45
            if (r1 != 0) goto L47
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L45
            com.daaw.X93 r1 = com.daaw.AbstractC6556ma3.g     // Catch: java.lang.Throwable -> L21
            android.content.Context r2 = r3.getApplicationContext()     // Catch: java.lang.Throwable -> L21
            if (r2 == 0) goto L18
            r3 = r2
        L18:
            if (r1 == 0) goto L23
            android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L21
            if (r1 == r3) goto L41
            goto L23
        L21:
            r3 = move-exception
            goto L43
        L23:
            com.daaw.H83.d()     // Catch: java.lang.Throwable -> L21
            com.daaw.AbstractC7393pa3.b()     // Catch: java.lang.Throwable -> L21
            com.daaw.C6447m93.d()     // Catch: java.lang.Throwable -> L21
            com.daaw.C93 r1 = new com.daaw.C93     // Catch: java.lang.Throwable -> L21
            r1.<init>()     // Catch: java.lang.Throwable -> L21
            com.daaw.Ta3 r1 = com.daaw.AbstractC5435ib3.a(r1)     // Catch: java.lang.Throwable -> L21
            com.daaw.y83 r2 = new com.daaw.y83     // Catch: java.lang.Throwable -> L21
            r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L21
            com.daaw.AbstractC6556ma3.g = r2     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.atomic.AtomicInteger r3 = com.daaw.AbstractC6556ma3.j     // Catch: java.lang.Throwable -> L21
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L21
        L41:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            goto L47
        L43:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L21
            throw r3     // Catch: java.lang.Throwable -> L45
        L45:
            r3 = move-exception
            goto L49
        L47:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            return
        L49:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L45
            throw r3
        L4b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6556ma3.d(android.content.Context):void");
    }

    public abstract Object a(Object obj);

    /* JADX WARN: Removed duplicated region for block: B:14:0x003e A[PHI: r2
  0x003e: PHI (r2v1 com.daaw.Ha3) = (r2v0 com.daaw.Ha3), (r2v5 com.daaw.Ha3) binds: [B:8:0x0016, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0084 A[Catch: all -> 0x003b, TryCatch #0 {all -> 0x003b, blocks: (B:5:0x000b, B:7:0x000f, B:9:0x0018, B:11:0x0028, B:17:0x0043, B:19:0x0049, B:21:0x0053, B:25:0x0074, B:27:0x007c, B:30:0x0084, B:32:0x008a, B:36:0x009c, B:38:0x00a2, B:35:0x009a, B:40:0x00a8, B:42:0x00ac, B:45:0x00b4, B:46:0x00b7, B:47:0x00bb, B:23:0x0068, B:48:0x00c0, B:49:0x00c5, B:50:0x00c6), top: B:56:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b() {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6556ma3.b():java.lang.Object");
    }
}
