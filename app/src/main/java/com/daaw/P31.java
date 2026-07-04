package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract class P31 {

    public static final class a extends AbstractC1623Ms {
        public long E;
        public Object F;
        public Object G;
        public /* synthetic */ Object H;
        public int I;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.I |= Integer.MIN_VALUE;
            return P31.d(0L, null, this);
        }
    }

    public static final N31 a(long j, InterfaceC10301zy interfaceC10301zy, U30 u30) {
        return new N31("Timed out waiting for " + j + " ms", u30);
    }

    public static final Object b(O31 o31, InterfaceC3429bR interfaceC3429bR) {
        AbstractC3053a40.h(o31, AbstractC0391Ay.b(o31.E.getContext()).Y0(o31.F, o31, o31.getContext()));
        return A91.c(o31, o31, interfaceC3429bR);
    }

    public static final Object c(long j, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        if (j <= 0) {
            throw new N31("Timed out immediately");
        }
        Object objB = b(new O31(j, interfaceC1416Ks), interfaceC3429bR);
        if (objB == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objB;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(long r7, com.daaw.InterfaceC3429bR r9, com.daaw.InterfaceC1416Ks r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof com.daaw.P31.a
            if (r0 == 0) goto L13
            r0 = r10
            com.daaw.P31$a r0 = (com.daaw.P31.a) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            com.daaw.P31$a r0 = new com.daaw.P31$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.H
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.I
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.G
            com.daaw.nF0 r7 = (com.daaw.C6748nF0) r7
            java.lang.Object r8 = r0.F
            com.daaw.bR r8 = (com.daaw.InterfaceC3429bR) r8
            com.daaw.AbstractC4801gJ0.b(r10)     // Catch: com.daaw.N31 -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            com.daaw.AbstractC4801gJ0.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            com.daaw.nF0 r10 = new com.daaw.nF0
            r10.<init>()
            r0.F = r9     // Catch: com.daaw.N31 -> L68
            r0.G = r10     // Catch: com.daaw.N31 -> L68
            r0.E = r7     // Catch: com.daaw.N31 -> L68
            r0.I = r4     // Catch: com.daaw.N31 -> L68
            com.daaw.O31 r2 = new com.daaw.O31     // Catch: com.daaw.N31 -> L68
            r2.<init>(r7, r0)     // Catch: com.daaw.N31 -> L68
            r10.B = r2     // Catch: com.daaw.N31 -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: com.daaw.N31 -> L68
            java.lang.Object r8 = com.daaw.I10.c()     // Catch: com.daaw.N31 -> L68
            if (r7 != r8) goto L6b
            com.daaw.AbstractC7497pw.c(r0)     // Catch: com.daaw.N31 -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            com.daaw.U30 r9 = r8.B
            java.lang.Object r7 = r7.B
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.P31.d(long, com.daaw.bR, com.daaw.Ks):java.lang.Object");
    }
}
