package com.daaw;

/* JADX INFO: renamed from: com.daaw.tN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC8452tN {

    /* JADX INFO: renamed from: com.daaw.tN$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public boolean H;
        public /* synthetic */ Object I;
        public int J;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.J |= Integer.MIN_VALUE;
            return AbstractC8452tN.c(null, null, false, this);
        }
    }

    public static final Object b(InterfaceC7337pN interfaceC7337pN, QE0 qe0, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        Object objC = c(interfaceC7337pN, qe0, true, interfaceC1416Ks);
        return objC == I10.c() ? objC : G91.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
    
        if (r2.c(r9, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #0 {all -> 0x003c, blocks: (B:13:0x0036, B:24:0x0062, B:28:0x0077, B:30:0x007f, B:20:0x0054, B:23:0x005e), top: B:42:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0091 -> B:14:0x0039). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.daaw.InterfaceC7337pN r6, com.daaw.QE0 r7, boolean r8, com.daaw.InterfaceC1416Ks r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof com.daaw.AbstractC8452tN.a
            if (r0 == 0) goto L13
            r0 = r9
            com.daaw.tN$a r0 = (com.daaw.AbstractC8452tN.a) r0
            int r1 = r0.J
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.J = r1
            goto L18
        L13:
            com.daaw.tN$a r0 = new com.daaw.tN$a
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.I
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.J
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L58
            if (r2 == r4) goto L46
            if (r2 != r3) goto L3e
            boolean r8 = r0.H
            java.lang.Object r6 = r0.G
            com.daaw.jk r6 = (com.daaw.InterfaceC5756jk) r6
            java.lang.Object r7 = r0.F
            com.daaw.QE0 r7 = (com.daaw.QE0) r7
            java.lang.Object r2 = r0.E
            com.daaw.pN r2 = (com.daaw.InterfaceC7337pN) r2
            com.daaw.AbstractC4801gJ0.b(r9)     // Catch: java.lang.Throwable -> L3c
        L39:
            r9 = r6
            r6 = r2
            goto L62
        L3c:
            r6 = move-exception
            goto L9d
        L3e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L46:
            boolean r8 = r0.H
            java.lang.Object r6 = r0.G
            com.daaw.jk r6 = (com.daaw.InterfaceC5756jk) r6
            java.lang.Object r7 = r0.F
            com.daaw.QE0 r7 = (com.daaw.QE0) r7
            java.lang.Object r2 = r0.E
            com.daaw.pN r2 = (com.daaw.InterfaceC7337pN) r2
            com.daaw.AbstractC4801gJ0.b(r9)     // Catch: java.lang.Throwable -> L3c
            goto L77
        L58:
            com.daaw.AbstractC4801gJ0.b(r9)
            com.daaw.AbstractC7894rN.h(r6)
            com.daaw.jk r9 = r7.iterator()     // Catch: java.lang.Throwable -> L3c
        L62:
            r0.E = r6     // Catch: java.lang.Throwable -> L3c
            r0.F = r7     // Catch: java.lang.Throwable -> L3c
            r0.G = r9     // Catch: java.lang.Throwable -> L3c
            r0.H = r8     // Catch: java.lang.Throwable -> L3c
            r0.J = r4     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r2 = r9.a(r0)     // Catch: java.lang.Throwable -> L3c
            if (r2 != r1) goto L73
            goto L93
        L73:
            r5 = r2
            r2 = r6
            r6 = r9
            r9 = r5
        L77:
            java.lang.Boolean r9 = (java.lang.Boolean) r9     // Catch: java.lang.Throwable -> L3c
            boolean r9 = r9.booleanValue()     // Catch: java.lang.Throwable -> L3c
            if (r9 == 0) goto L94
            java.lang.Object r9 = r6.next()     // Catch: java.lang.Throwable -> L3c
            r0.E = r2     // Catch: java.lang.Throwable -> L3c
            r0.F = r7     // Catch: java.lang.Throwable -> L3c
            r0.G = r6     // Catch: java.lang.Throwable -> L3c
            r0.H = r8     // Catch: java.lang.Throwable -> L3c
            r0.J = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r9 = r2.c(r9, r0)     // Catch: java.lang.Throwable -> L3c
            if (r9 != r1) goto L39
        L93:
            return r1
        L94:
            if (r8 == 0) goto L9a
            r6 = 0
            com.daaw.AbstractC8275sk.a(r7, r6)
        L9a:
            com.daaw.G91 r6 = com.daaw.G91.a
            return r6
        L9d:
            throw r6     // Catch: java.lang.Throwable -> L9e
        L9e:
            r9 = move-exception
            if (r8 == 0) goto La4
            com.daaw.AbstractC8275sk.a(r7, r6)
        La4:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8452tN.c(com.daaw.pN, com.daaw.QE0, boolean, com.daaw.Ks):java.lang.Object");
    }
}
