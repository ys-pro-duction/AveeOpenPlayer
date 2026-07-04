package com.daaw;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: com.daaw.vf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C9095vf0 {
    public final C4716g01 a = AbstractC3870d01.a();
    public final HashMap b;
    public final LinkedHashSet c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;

    public C9095vf0(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.e = i;
        this.b = new HashMap(0, 0.75f);
        this.c = new LinkedHashSet();
    }

    public Object b(Object obj) {
        return null;
    }

    public final Object d(Object obj) {
        synchronized (this.a) {
            Object obj2 = this.b.get(obj);
            if (obj2 != null) {
                this.c.remove(obj);
                this.c.add(obj);
                this.i++;
                return obj2;
            }
            this.j++;
            Object objB = b(obj);
            if (objB == null) {
                return null;
            }
            synchronized (this.a) {
                try {
                    this.g++;
                    Object objPut = this.b.put(obj, objB);
                    this.c.remove(obj);
                    this.c.add(obj);
                    if (objPut != null) {
                        this.b.put(obj, objPut);
                        obj2 = objPut;
                    } else {
                        this.d = h() + g(obj, objB);
                    }
                    G91 g91 = G91.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (obj2 != null) {
                c(false, obj, objB, obj2);
                return obj2;
            }
            j(this.e);
            return objB;
        }
    }

    public final Object e(Object obj, Object obj2) {
        Object objPut;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.a) {
            try {
                this.f++;
                this.d = h() + g(obj, obj2);
                objPut = this.b.put(obj, obj2);
                if (objPut != null) {
                    this.d = h() - g(obj, objPut);
                }
                if (this.c.contains(obj)) {
                    this.c.remove(obj);
                }
                this.c.add(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objPut != null) {
            c(false, obj, objPut, obj2);
        }
        j(this.e);
        return objPut;
    }

    public final Object f(Object obj) {
        Object objRemove;
        obj.getClass();
        synchronized (this.a) {
            try {
                objRemove = this.b.remove(obj);
                this.c.remove(obj);
                if (objRemove != null) {
                    this.d = h() - g(obj, objRemove);
                }
                G91 g91 = G91.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (objRemove != null) {
            c(false, obj, objRemove, null);
        }
        return objRemove;
    }

    public final int g(Object obj, Object obj2) {
        int i = i(obj, obj2);
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(("Negative size: " + obj + '=' + obj2).toString());
    }

    public final int h() {
        int i;
        synchronized (this.a) {
            i = this.d;
        }
        return i;
    }

    public int i(Object obj, Object obj2) {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0094, code lost:
    
        throw new java.lang.IllegalStateException("map/keySet size inconsistency");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void j(int r8) {
        /*
            r7 = this;
        L0:
            com.daaw.g01 r0 = r7.a
            monitor-enter(r0)
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 < 0) goto L8d
            java.util.HashMap r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 == 0) goto L1b
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L8d
            goto L1b
        L18:
            r8 = move-exception
            goto L95
        L1b:
            java.util.HashMap r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r2 = r7.c     // Catch: java.lang.Throwable -> L18
            boolean r2 = r2.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != r2) goto L8d
            int r1 = r7.h()     // Catch: java.lang.Throwable -> L18
            r2 = 1
            r3 = 0
            if (r1 <= r8) goto L78
            java.util.HashMap r1 = r7.b     // Catch: java.lang.Throwable -> L18
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L18
            if (r1 != 0) goto L78
            java.util.LinkedHashSet r1 = r7.c     // Catch: java.lang.Throwable -> L18
            java.lang.Object r1 = com.daaw.AbstractC2455Um.d0(r1)     // Catch: java.lang.Throwable -> L18
            java.util.HashMap r4 = r7.b     // Catch: java.lang.Throwable -> L18
            java.lang.Object r4 = r4.get(r1)     // Catch: java.lang.Throwable -> L18
            if (r4 == 0) goto L70
            java.util.HashMap r5 = r7.b     // Catch: java.lang.Throwable -> L18
            java.util.Map r5 = com.daaw.V71.c(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedHashSet r5 = r7.c     // Catch: java.lang.Throwable -> L18
            java.util.Collection r5 = com.daaw.V71.a(r5)     // Catch: java.lang.Throwable -> L18
            r5.remove(r1)     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h()     // Catch: java.lang.Throwable -> L18
            com.daaw.G10.d(r1)     // Catch: java.lang.Throwable -> L18
            com.daaw.G10.d(r4)     // Catch: java.lang.Throwable -> L18
            int r6 = r7.g(r1, r4)     // Catch: java.lang.Throwable -> L18
            int r5 = r5 - r6
            r7.d = r5     // Catch: java.lang.Throwable -> L18
            int r5 = r7.h     // Catch: java.lang.Throwable -> L18
            int r5 = r5 + r2
            r7.h = r5     // Catch: java.lang.Throwable -> L18
            goto L7a
        L70:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "inconsistent state"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L78:
            r1 = r3
            r4 = r1
        L7a:
            com.daaw.G91 r5 = com.daaw.G91.a     // Catch: java.lang.Throwable -> L18
            monitor-exit(r0)
            if (r1 != 0) goto L82
            if (r4 != 0) goto L82
            return
        L82:
            com.daaw.G10.d(r1)
            com.daaw.G10.d(r4)
            r7.c(r2, r1, r4, r3)
            goto L0
        L8d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "map/keySet size inconsistency"
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r8     // Catch: java.lang.Throwable -> L18
        L95:
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9095vf0.j(int):void");
    }

    public String toString() {
        String str;
        synchronized (this.a) {
            try {
                int i = this.i;
                int i2 = this.j + i;
                str = "LruCache[maxSize=" + this.e + ",hits=" + this.i + ",misses=" + this.j + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public void c(boolean z, Object obj, Object obj2, Object obj3) {
    }
}
