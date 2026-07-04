package com.daaw;

/* JADX INFO: renamed from: com.daaw.Db, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0611Db {
    public final Object a = a.b(null);
    public final C9095vf0 b = new C9095vf0(16);
    public final AS0 c = new AS0(0, 1, null);
    public final C4716g01 d = AbstractC3870d01.a();

    /* JADX INFO: renamed from: com.daaw.Db$b */
    public static final class b {
        public final InterfaceC6225lO a;
        public final Object b;

        public b(InterfaceC6225lO interfaceC6225lO, Object obj) {
            G10.g(interfaceC6225lO, "font");
            this.a = interfaceC6225lO;
            this.b = obj;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return G10.c(this.a, bVar.a) && G10.c(this.b, bVar.b);
        }

        public int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Object obj = this.b;
            return iHashCode + (obj == null ? 0 : obj.hashCode());
        }

        public String toString() {
            return "Key(font=" + this.a + ", loaderKey=" + this.b + ')';
        }
    }

    /* JADX INFO: renamed from: com.daaw.Db$c */
    public static final class c extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public boolean G;
        public /* synthetic */ Object H;
        public int J;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.J |= Integer.MIN_VALUE;
            return C0611Db.this.g(null, null, false, null, this);
        }
    }

    public static /* synthetic */ void f(C0611Db c0611Db, InterfaceC6225lO interfaceC6225lO, InterfaceC2592Vu0 interfaceC2592Vu0, Object obj, boolean z, int i, Object obj2) {
        if ((i & 8) != 0) {
            z = false;
        }
        c0611Db.e(interfaceC6225lO, interfaceC2592Vu0, obj, z);
    }

    public final a d(InterfaceC6225lO interfaceC6225lO, InterfaceC2592Vu0 interfaceC2592Vu0) {
        a aVar;
        G10.g(interfaceC6225lO, "font");
        G10.g(interfaceC2592Vu0, "platformFontLoader");
        b bVar = new b(interfaceC6225lO, interfaceC2592Vu0.c());
        synchronized (this.d) {
            aVar = (a) this.b.d(bVar);
            if (aVar == null) {
                aVar = (a) this.c.b(bVar);
            }
        }
        return aVar;
    }

    public final void e(InterfaceC6225lO interfaceC6225lO, InterfaceC2592Vu0 interfaceC2592Vu0, Object obj, boolean z) {
        G10.g(interfaceC6225lO, "font");
        G10.g(interfaceC2592Vu0, "platformFontLoader");
        b bVar = new b(interfaceC6225lO, interfaceC2592Vu0.c());
        synchronized (this.d) {
            try {
                if (obj == null) {
                } else if (z) {
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.daaw.InterfaceC6225lO r5, com.daaw.InterfaceC2592Vu0 r6, boolean r7, com.daaw.NQ r8, com.daaw.InterfaceC1416Ks r9) throws java.lang.Throwable {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.daaw.C0611Db.c
            if (r0 == 0) goto L13
            r0 = r9
            com.daaw.Db$c r0 = (com.daaw.C0611Db.c) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            com.daaw.Db$c r0 = new com.daaw.Db$c
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.H
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.J
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            boolean r7 = r0.G
            java.lang.Object r5 = r0.F
            com.daaw.Db$b r5 = (com.daaw.C0611Db.b) r5
            java.lang.Object r6 = r0.E
            com.daaw.Db r6 = (com.daaw.C0611Db) r6
            com.daaw.AbstractC4801gJ0.b(r9)
            goto L7d
        L33:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L3b:
            com.daaw.AbstractC4801gJ0.b(r9)
            com.daaw.Db$b r9 = new com.daaw.Db$b
            java.lang.Object r6 = r6.c()
            r9.<init>(r5, r6)
            com.daaw.g01 r5 = r4.d
            monitor-enter(r5)
            com.daaw.vf0 r6 = r4.b     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.d(r9)     // Catch: java.lang.Throwable -> L5d
            com.daaw.Db$a r6 = (com.daaw.C0611Db.a) r6     // Catch: java.lang.Throwable -> L5d
            if (r6 != 0) goto L5f
            com.daaw.AS0 r6 = r4.c     // Catch: java.lang.Throwable -> L5d
            java.lang.Object r6 = r6.b(r9)     // Catch: java.lang.Throwable -> L5d
            com.daaw.Db$a r6 = (com.daaw.C0611Db.a) r6     // Catch: java.lang.Throwable -> L5d
            goto L5f
        L5d:
            r6 = move-exception
            goto Lb3
        L5f:
            if (r6 == 0) goto L67
            java.lang.Object r6 = r6.g()     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            return r6
        L67:
            com.daaw.G91 r6 = com.daaw.G91.a     // Catch: java.lang.Throwable -> L5d
            monitor-exit(r5)
            r0.E = r4
            r0.F = r9
            r0.G = r7
            r0.J = r3
            java.lang.Object r5 = r8.invoke(r0)
            if (r5 != r1) goto L79
            return r1
        L79:
            r6 = r9
            r9 = r5
            r5 = r6
            r6 = r4
        L7d:
            com.daaw.g01 r8 = r6.d
            monitor-enter(r8)
            if (r9 != 0) goto L90
            com.daaw.AS0 r7 = r6.c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r6 = r6.a     // Catch: java.lang.Throwable -> L8e
            com.daaw.Db$a r6 = com.daaw.C0611Db.a.a(r6)     // Catch: java.lang.Throwable -> L8e
            r7.h(r5, r6)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        L8e:
            r5 = move-exception
            goto Lb1
        L90:
            if (r7 == 0) goto La0
            com.daaw.AS0 r6 = r6.c     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = com.daaw.C0611Db.a.b(r9)     // Catch: java.lang.Throwable -> L8e
            com.daaw.Db$a r7 = com.daaw.C0611Db.a.a(r7)     // Catch: java.lang.Throwable -> L8e
            r6.h(r5, r7)     // Catch: java.lang.Throwable -> L8e
            goto Lad
        La0:
            com.daaw.vf0 r6 = r6.b     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r7 = com.daaw.C0611Db.a.b(r9)     // Catch: java.lang.Throwable -> L8e
            com.daaw.Db$a r7 = com.daaw.C0611Db.a.a(r7)     // Catch: java.lang.Throwable -> L8e
            r6.e(r5, r7)     // Catch: java.lang.Throwable -> L8e
        Lad:
            com.daaw.G91 r5 = com.daaw.G91.a     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r8)
            return r9
        Lb1:
            monitor-exit(r8)
            throw r5
        Lb3:
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C0611Db.g(com.daaw.lO, com.daaw.Vu0, boolean, com.daaw.NQ, com.daaw.Ks):java.lang.Object");
    }

    /* JADX INFO: renamed from: com.daaw.Db$a */
    public static final class a {
        public final Object a;

        public /* synthetic */ a(Object obj) {
            this.a = obj;
        }

        public static final /* synthetic */ a a(Object obj) {
            return new a(obj);
        }

        public static boolean c(Object obj, Object obj2) {
            return (obj2 instanceof a) && G10.c(obj, ((a) obj2).g());
        }

        public static int d(Object obj) {
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public static final boolean e(Object obj) {
            return obj == null;
        }

        public static String f(Object obj) {
            return "AsyncTypefaceResult(result=" + obj + ')';
        }

        public boolean equals(Object obj) {
            return c(this.a, obj);
        }

        public final /* synthetic */ Object g() {
            return this.a;
        }

        public int hashCode() {
            return d(this.a);
        }

        public String toString() {
            return f(this.a);
        }

        public static Object b(Object obj) {
            return obj;
        }
    }
}
