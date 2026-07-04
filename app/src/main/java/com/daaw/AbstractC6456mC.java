package com.daaw;

/* JADX INFO: renamed from: com.daaw.mC, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6456mC {
    public static final YZ0 a = new YZ0("UNDEFINED");
    public static final YZ0 b = new YZ0("REUSABLE_CLAIMED");

    /* JADX WARN: Removed duplicated region for block: B:27:0x008f A[Catch: all -> 0x0068, DONT_GENERATE, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x003f, B:13:0x004d, B:15:0x0053, B:28:0x0092, B:18:0x006a, B:20:0x007a, B:25:0x0089, B:27:0x008f, B:33:0x009f, B:36:0x00a8, B:35:0x00a5, B:23:0x0080), top: B:45:0x003f, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.daaw.InterfaceC1416Ks r6, java.lang.Object r7, com.daaw.NQ r8) {
        /*
            boolean r0 = r6 instanceof com.daaw.C6177lC
            if (r0 == 0) goto Lb3
            com.daaw.lC r6 = (com.daaw.C6177lC) r6
            java.lang.Object r8 = com.daaw.AbstractC2459Un.c(r7, r8)
            com.daaw.jt r0 = r6.E
            com.daaw.ft r1 = r6.getContext()
            boolean r0 = r0.i1(r1)
            r1 = 1
            if (r0 == 0) goto L26
            r6.G = r8
            r6.D = r1
            com.daaw.jt r7 = r6.E
            com.daaw.ft r8 = r6.getContext()
            r7.g1(r8, r6)
            goto Lad
        L26:
            com.daaw.k31 r0 = com.daaw.C5848k31.a
            com.daaw.NH r0 = r0.b()
            boolean r2 = r0.r1()
            if (r2 == 0) goto L3b
            r6.G = r8
            r6.D = r1
            r0.n1(r6)
            goto Lad
        L3b:
            r0.p1(r1)
            r2 = 0
            com.daaw.ft r3 = r6.getContext()     // Catch: java.lang.Throwable -> L68
            com.daaw.U30$b r4 = com.daaw.U30.k     // Catch: java.lang.Throwable -> L68
            com.daaw.ft$b r3 = r3.a(r4)     // Catch: java.lang.Throwable -> L68
            com.daaw.U30 r3 = (com.daaw.U30) r3     // Catch: java.lang.Throwable -> L68
            if (r3 == 0) goto L6a
            boolean r4 = r3.d()     // Catch: java.lang.Throwable -> L68
            if (r4 != 0) goto L6a
            java.util.concurrent.CancellationException r7 = r3.R()     // Catch: java.lang.Throwable -> L68
            r6.a(r8, r7)     // Catch: java.lang.Throwable -> L68
            com.daaw.fJ0$a r8 = com.daaw.AbstractC4512fJ0.B     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = com.daaw.AbstractC4801gJ0.a(r7)     // Catch: java.lang.Throwable -> L68
            java.lang.Object r7 = com.daaw.AbstractC4512fJ0.a(r7)     // Catch: java.lang.Throwable -> L68
            r6.x(r7)     // Catch: java.lang.Throwable -> L68
            goto L92
        L68:
            r7 = move-exception
            goto La9
        L6a:
            com.daaw.Ks r8 = r6.F     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = r6.H     // Catch: java.lang.Throwable -> L68
            com.daaw.ft r4 = r8.getContext()     // Catch: java.lang.Throwable -> L68
            java.lang.Object r3 = com.daaw.AbstractC5010h31.c(r4, r3)     // Catch: java.lang.Throwable -> L68
            com.daaw.YZ0 r5 = com.daaw.AbstractC5010h31.a     // Catch: java.lang.Throwable -> L68
            if (r3 == r5) goto L7f
            com.daaw.z91 r8 = com.daaw.AbstractC4963gt.g(r8, r4, r3)     // Catch: java.lang.Throwable -> L68
            goto L80
        L7f:
            r8 = r2
        L80:
            com.daaw.Ks r5 = r6.F     // Catch: java.lang.Throwable -> L9c
            r5.x(r7)     // Catch: java.lang.Throwable -> L9c
            com.daaw.G91 r7 = com.daaw.G91.a     // Catch: java.lang.Throwable -> L9c
            if (r8 == 0) goto L8f
            boolean r7 = r8.V0()     // Catch: java.lang.Throwable -> L68
            if (r7 == 0) goto L92
        L8f:
            com.daaw.AbstractC5010h31.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        L92:
            boolean r7 = r0.u1()     // Catch: java.lang.Throwable -> L68
            if (r7 != 0) goto L92
        L98:
            r0.k1(r1)
            goto Lad
        L9c:
            r7 = move-exception
            if (r8 == 0) goto La5
            boolean r8 = r8.V0()     // Catch: java.lang.Throwable -> L68
            if (r8 == 0) goto La8
        La5:
            com.daaw.AbstractC5010h31.a(r4, r3)     // Catch: java.lang.Throwable -> L68
        La8:
            throw r7     // Catch: java.lang.Throwable -> L68
        La9:
            r6.f(r7, r2)     // Catch: java.lang.Throwable -> Lae
            goto L98
        Lad:
            return
        Lae:
            r6 = move-exception
            r0.k1(r1)
            throw r6
        Lb3:
            r6.x(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6456mC.b(com.daaw.Ks, java.lang.Object, com.daaw.NQ):void");
    }

    public static /* synthetic */ void c(InterfaceC1416Ks interfaceC1416Ks, Object obj, NQ nq, int i, Object obj2) {
        if ((i & 2) != 0) {
            nq = null;
        }
        b(interfaceC1416Ks, obj, nq);
    }

    public static final boolean d(C6177lC c6177lC) {
        G91 g91 = G91.a;
        NH nhB = C5848k31.a.b();
        if (nhB.s1()) {
            return false;
        }
        if (nhB.r1()) {
            c6177lC.G = g91;
            c6177lC.D = 1;
            nhB.n1(c6177lC);
            return true;
        }
        nhB.p1(true);
        try {
            c6177lC.run();
            do {
            } while (nhB.u1());
        } finally {
            try {
            } finally {
            }
        }
        return false;
    }
}
