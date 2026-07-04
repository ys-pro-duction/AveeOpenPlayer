package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public final class DC implements InterfaceC7058oN {
    public final InterfaceC7058oN B;
    public final NQ C;
    public final InterfaceC3429bR D;

    public static final class a implements InterfaceC7337pN {
        public final /* synthetic */ C6748nF0 C;
        public final /* synthetic */ InterfaceC7337pN D;

        /* JADX INFO: renamed from: com.daaw.DC$a$a, reason: collision with other inner class name */
        public static final class C0057a extends AbstractC1623Ms {
            public /* synthetic */ Object E;
            public int G;

            public C0057a(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.E = obj;
                this.G |= Integer.MIN_VALUE;
                return a.this.c(null, this);
            }
        }

        public a(C6748nF0 c6748nF0, InterfaceC7337pN interfaceC7337pN) {
            this.C = c6748nF0;
            this.D = interfaceC7337pN;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.daaw.InterfaceC7337pN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.lang.Object r6, com.daaw.InterfaceC1416Ks r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.daaw.DC.a.C0057a
                if (r0 == 0) goto L13
                r0 = r7
                com.daaw.DC$a$a r0 = (com.daaw.DC.a.C0057a) r0
                int r1 = r0.G
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.G = r1
                goto L18
            L13:
                com.daaw.DC$a$a r0 = new com.daaw.DC$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.E
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.G
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                com.daaw.AbstractC4801gJ0.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                com.daaw.AbstractC4801gJ0.b(r7)
                com.daaw.DC r7 = com.daaw.DC.this
                com.daaw.NQ r7 = r7.C
                java.lang.Object r7 = r7.invoke(r6)
                com.daaw.nF0 r2 = r5.C
                java.lang.Object r2 = r2.B
                com.daaw.YZ0 r4 = com.daaw.AbstractC2360To0.a
                if (r2 == r4) goto L58
                com.daaw.DC r4 = com.daaw.DC.this
                com.daaw.bR r4 = r4.D
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                com.daaw.G91 r6 = com.daaw.G91.a
                return r6
            L58:
                com.daaw.nF0 r2 = r5.C
                r2.B = r7
                com.daaw.pN r7 = r5.D
                r0.G = r3
                java.lang.Object r6 = r7.c(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                com.daaw.G91 r6 = com.daaw.G91.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.DC.a.c(java.lang.Object, com.daaw.Ks):java.lang.Object");
        }
    }

    public DC(InterfaceC7058oN interfaceC7058oN, NQ nq, InterfaceC3429bR interfaceC3429bR) {
        this.B = interfaceC7058oN;
        this.C = nq;
        this.D = interfaceC3429bR;
    }

    @Override // com.daaw.InterfaceC7058oN
    public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
        C6748nF0 c6748nF0 = new C6748nF0();
        c6748nF0.B = AbstractC2360To0.a;
        Object objA = this.B.a(new a(c6748nF0, interfaceC7337pN), interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }
}
