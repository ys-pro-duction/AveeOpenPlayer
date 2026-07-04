package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class C implements InterfaceC7058oN {

    public static final class a extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int H;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.H |= Integer.MIN_VALUE;
            return C.this.a(null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.daaw.InterfaceC7058oN
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(com.daaw.InterfaceC7337pN r6, com.daaw.InterfaceC1416Ks r7) throws java.lang.Throwable {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.daaw.C.a
            if (r0 == 0) goto L13
            r0 = r7
            com.daaw.C$a r0 = (com.daaw.C.a) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            com.daaw.C$a r0 = new com.daaw.C$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r6 = r0.E
            com.daaw.AM0 r6 = (com.daaw.AM0) r6
            com.daaw.AbstractC4801gJ0.b(r7)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r7 = move-exception
            goto L59
        L2f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L37:
            com.daaw.AbstractC4801gJ0.b(r7)
            com.daaw.AM0 r7 = new com.daaw.AM0
            com.daaw.ft r2 = r0.getContext()
            r7.<init>(r6, r2)
            r0.E = r7     // Catch: java.lang.Throwable -> L55
            r0.H = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r5.e(r7, r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r1) goto L4e
            return r1
        L4e:
            r6 = r7
        L4f:
            r6.s()
            com.daaw.G91 r6 = com.daaw.G91.a
            return r6
        L55:
            r6 = move-exception
            r4 = r7
            r7 = r6
            r6 = r4
        L59:
            r6.s()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C.a(com.daaw.pN, com.daaw.Ks):java.lang.Object");
    }

    public abstract Object e(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks);
}
