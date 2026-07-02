package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AN {

    public static final class a implements InterfaceC7337pN {
        public final /* synthetic */ InterfaceC3429bR B;
        public final /* synthetic */ C6748nF0 C;

        /* JADX INFO: renamed from: com.daaw.AN$a$a, reason: collision with other inner class name */
        public static final class C0046a extends AbstractC1623Ms {
            public Object E;
            public /* synthetic */ Object F;
            public int G;
            public Object I;

            public C0046a(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.F = obj;
                this.G |= Integer.MIN_VALUE;
                return a.this.c(null, this);
            }
        }

        public a(InterfaceC3429bR interfaceC3429bR, C6748nF0 c6748nF0) {
            this.B = interfaceC3429bR;
            this.C = c6748nF0;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.daaw.InterfaceC7337pN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object c(java.lang.Object r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof com.daaw.AN.a.C0046a
                if (r0 == 0) goto L13
                r0 = r6
                com.daaw.AN$a$a r0 = (com.daaw.AN.a.C0046a) r0
                int r1 = r0.G
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.G = r1
                goto L18
            L13:
                com.daaw.AN$a$a r0 = new com.daaw.AN$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.F
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.G
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.I
                java.lang.Object r0 = r0.E
                com.daaw.AN$a r0 = (com.daaw.AN.a) r0
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                com.daaw.AbstractC4801gJ0.b(r6)
                com.daaw.bR r6 = r4.B
                r0.E = r4
                r0.I = r5
                r0.G = r3
                r2 = 6
                com.daaw.LZ.a(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                com.daaw.LZ.a(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                com.daaw.G91 r5 = com.daaw.G91.a
                return r5
            L5d:
                com.daaw.nF0 r6 = r0.C
                r6.B = r5
                com.daaw.c r5 = new com.daaw.c
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AN.a.c(java.lang.Object, com.daaw.Ks):java.lang.Object");
        }
    }

    public static final class b extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public /* synthetic */ Object H;
        public int I;

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.I |= Integer.MIN_VALUE;
            return AbstractC7894rN.i(null, null, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.daaw.InterfaceC7058oN r4, com.daaw.InterfaceC3429bR r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.daaw.AN.b
            if (r0 == 0) goto L13
            r0 = r6
            com.daaw.AN$b r0 = (com.daaw.AN.b) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            com.daaw.AN$b r0 = new com.daaw.AN$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.H
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.I
            r3 = 1
            if (r2 == 0) goto L3f
            if (r2 != r3) goto L37
            java.lang.Object r4 = r0.G
            com.daaw.AN$a r4 = (com.daaw.AN.a) r4
            java.lang.Object r5 = r0.F
            com.daaw.nF0 r5 = (com.daaw.C6748nF0) r5
            java.lang.Object r0 = r0.E
            com.daaw.bR r0 = (com.daaw.InterfaceC3429bR) r0
            com.daaw.AbstractC4801gJ0.b(r6)     // Catch: com.daaw.C3588c -> L35
            goto L6a
        L35:
            r6 = move-exception
            goto L67
        L37:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3f:
            com.daaw.AbstractC4801gJ0.b(r6)
            com.daaw.nF0 r6 = new com.daaw.nF0
            r6.<init>()
            com.daaw.YZ0 r2 = com.daaw.AbstractC2360To0.a
            r6.B = r2
            com.daaw.AN$a r2 = new com.daaw.AN$a
            r2.<init>(r5, r6)
            r0.E = r5     // Catch: com.daaw.C3588c -> L62
            r0.F = r6     // Catch: com.daaw.C3588c -> L62
            r0.G = r2     // Catch: com.daaw.C3588c -> L62
            r0.I = r3     // Catch: com.daaw.C3588c -> L62
            java.lang.Object r4 = r4.a(r2, r0)     // Catch: com.daaw.C3588c -> L62
            if (r4 != r1) goto L5f
            return r1
        L5f:
            r0 = r5
            r5 = r6
            goto L6a
        L62:
            r4 = move-exception
            r0 = r5
            r5 = r6
            r6 = r4
            r4 = r2
        L67:
            com.daaw.AbstractC7616qN.a(r6, r4)
        L6a:
            java.lang.Object r4 = r5.B
            com.daaw.YZ0 r5 = com.daaw.AbstractC2360To0.a
            if (r4 == r5) goto L71
            return r4
        L71:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Expected at least one element matching the predicate "
            r5.append(r6)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AN.a(com.daaw.oN, com.daaw.bR, com.daaw.Ks):java.lang.Object");
    }
}
