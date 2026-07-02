package com.daaw;

/* JADX INFO: renamed from: com.daaw.Lg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1472Lg implements InterfaceC1368Kg {
    public final C8565tm0 a = new C8565tm0(new C1679Ng[16], 0);

    /* JADX INFO: renamed from: com.daaw.Lg$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public int G;
        public int H;
        public /* synthetic */ Object I;
        public int K;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.K |= Integer.MIN_VALUE;
            return C1472Lg.this.a(null, this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r7 < r2) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:20:0x0066). Please report as a decompilation issue!!! */
    @Override // com.daaw.InterfaceC1368Kg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(com.daaw.C3103aF0 r7, com.daaw.InterfaceC1416Ks r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.daaw.C1472Lg.a
            if (r0 == 0) goto L13
            r0 = r8
            com.daaw.Lg$a r0 = (com.daaw.C1472Lg.a) r0
            int r1 = r0.K
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.K = r1
            goto L18
        L13:
            com.daaw.Lg$a r0 = new com.daaw.Lg$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.I
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.K
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            int r7 = r0.H
            int r2 = r0.G
            java.lang.Object r4 = r0.F
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            java.lang.Object r5 = r0.E
            com.daaw.aF0 r5 = (com.daaw.C3103aF0) r5
            com.daaw.AbstractC4801gJ0.b(r8)
            r8 = r5
            goto L66
        L36:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3e:
            com.daaw.AbstractC4801gJ0.b(r8)
            com.daaw.tm0 r8 = r6.a
            int r2 = r8.r()
            if (r2 <= 0) goto L69
            java.lang.Object[] r8 = r8.q()
            r4 = 0
            r4 = r8
            r8 = r7
            r7 = 0
        L51:
            r5 = r4[r7]
            com.daaw.Ng r5 = (com.daaw.C1679Ng) r5
            r0.E = r8
            r0.F = r4
            r0.G = r2
            r0.H = r7
            r0.K = r3
            java.lang.Object r5 = r5.d(r8, r0)
            if (r5 != r1) goto L66
            return r1
        L66:
            int r7 = r7 + r3
            if (r7 < r2) goto L51
        L69:
            com.daaw.G91 r7 = com.daaw.G91.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C1472Lg.a(com.daaw.aF0, com.daaw.Ks):java.lang.Object");
    }

    public final C8565tm0 b() {
        return this.a;
    }
}
