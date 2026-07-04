package com.daaw;

/* JADX INFO: renamed from: com.daaw.yN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class AbstractC9854yN {

    /* JADX INFO: renamed from: com.daaw.yN$a */
    public static final class a implements InterfaceC7058oN {
        public final /* synthetic */ InterfaceC7058oN B;
        public final /* synthetic */ InterfaceC3429bR C;

        public a(InterfaceC7058oN interfaceC7058oN, InterfaceC3429bR interfaceC3429bR) {
            this.B = interfaceC7058oN;
            this.C = interfaceC3429bR;
        }

        @Override // com.daaw.InterfaceC7058oN
        public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            Object objA = this.B.a(new b(new C5620jF0(), interfaceC7337pN, this.C), interfaceC1416Ks);
            return objA == I10.c() ? objA : G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.yN$b */
    public static final class b implements InterfaceC7337pN {
        public final /* synthetic */ C5620jF0 B;
        public final /* synthetic */ InterfaceC7337pN C;
        public final /* synthetic */ InterfaceC3429bR D;

        /* JADX INFO: renamed from: com.daaw.yN$b$a */
        public static final class a extends AbstractC1623Ms {
            public Object E;
            public Object F;
            public /* synthetic */ Object G;
            public int I;

            public a(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.G = obj;
                this.I |= Integer.MIN_VALUE;
                return b.this.c(null, this);
            }
        }

        public b(C5620jF0 c5620jF0, InterfaceC7337pN interfaceC7337pN, InterfaceC3429bR interfaceC3429bR) {
            this.B = c5620jF0;
            this.C = interfaceC7337pN;
            this.D = interfaceC3429bR;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.c(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.c(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.daaw.InterfaceC7337pN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.lang.Object r7, com.daaw.InterfaceC1416Ks r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.daaw.AbstractC9854yN.b.a
                if (r0 == 0) goto L13
                r0 = r8
                com.daaw.yN$b$a r0 = (com.daaw.AbstractC9854yN.b.a) r0
                int r1 = r0.I
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.I = r1
                goto L18
            L13:
                com.daaw.yN$b$a r0 = new com.daaw.yN$b$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.G
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.I
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                com.daaw.AbstractC4801gJ0.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.F
                java.lang.Object r2 = r0.E
                com.daaw.yN$b r2 = (com.daaw.AbstractC9854yN.b) r2
                com.daaw.AbstractC4801gJ0.b(r8)
                goto L6c
            L41:
                com.daaw.AbstractC4801gJ0.b(r8)
                goto L59
            L45:
                com.daaw.AbstractC4801gJ0.b(r8)
                com.daaw.jF0 r8 = r6.B
                boolean r8 = r8.B
                if (r8 == 0) goto L5c
                com.daaw.pN r8 = r6.C
                r0.I = r5
                java.lang.Object r7 = r8.c(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                com.daaw.G91 r7 = com.daaw.G91.a
                return r7
            L5c:
                com.daaw.bR r8 = r6.D
                r0.E = r6
                r0.F = r7
                r0.I = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                com.daaw.jF0 r8 = r2.B
                r8.B = r5
                com.daaw.pN r8 = r2.C
                r2 = 0
                r0.E = r2
                r0.F = r2
                r0.I = r3
                java.lang.Object r7 = r8.c(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                com.daaw.G91 r7 = com.daaw.G91.a
                return r7
            L8b:
                com.daaw.G91 r7 = com.daaw.G91.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9854yN.b.c(java.lang.Object, com.daaw.Ks):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.daaw.yN$c */
    public static final class c extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int G;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.G |= Integer.MIN_VALUE;
            return AbstractC9854yN.c(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.yN$d */
    public static final class d implements InterfaceC7058oN {
        public final /* synthetic */ InterfaceC7058oN B;
        public final /* synthetic */ int C;

        /* JADX INFO: renamed from: com.daaw.yN$d$a */
        public static final class a extends AbstractC1623Ms {
            public /* synthetic */ Object E;
            public int F;
            public Object H;

            public a(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.E = obj;
                this.F |= Integer.MIN_VALUE;
                return d.this.a(null, this);
            }
        }

        public d(InterfaceC7058oN interfaceC7058oN, int i) {
            this.B = interfaceC7058oN;
            this.C = i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.daaw.InterfaceC7058oN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object a(com.daaw.InterfaceC7337pN r7, com.daaw.InterfaceC1416Ks r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof com.daaw.AbstractC9854yN.d.a
                if (r0 == 0) goto L13
                r0 = r8
                com.daaw.yN$d$a r0 = (com.daaw.AbstractC9854yN.d.a) r0
                int r1 = r0.F
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.F = r1
                goto L18
            L13:
                com.daaw.yN$d$a r0 = new com.daaw.yN$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.E
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.F
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r7 = r0.H
                com.daaw.pN r7 = (com.daaw.InterfaceC7337pN) r7
                com.daaw.AbstractC4801gJ0.b(r8)     // Catch: com.daaw.C3588c -> L2d
                goto L56
            L2d:
                r8 = move-exception
                goto L53
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                com.daaw.AbstractC4801gJ0.b(r8)
                com.daaw.lF0 r8 = new com.daaw.lF0
                r8.<init>()
                com.daaw.oN r2 = r6.B     // Catch: com.daaw.C3588c -> L2d
                com.daaw.yN$e r4 = new com.daaw.yN$e     // Catch: com.daaw.C3588c -> L2d
                int r5 = r6.C     // Catch: com.daaw.C3588c -> L2d
                r4.<init>(r8, r5, r7)     // Catch: com.daaw.C3588c -> L2d
                r0.H = r7     // Catch: com.daaw.C3588c -> L2d
                r0.F = r3     // Catch: com.daaw.C3588c -> L2d
                java.lang.Object r7 = r2.a(r4, r0)     // Catch: com.daaw.C3588c -> L2d
                if (r7 != r1) goto L56
                return r1
            L53:
                com.daaw.AbstractC7616qN.a(r8, r7)
            L56:
                com.daaw.G91 r7 = com.daaw.G91.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9854yN.d.a(com.daaw.pN, com.daaw.Ks):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.daaw.yN$e */
    public static final class e implements InterfaceC7337pN {
        public final /* synthetic */ C6190lF0 B;
        public final /* synthetic */ int C;
        public final /* synthetic */ InterfaceC7337pN D;

        /* JADX INFO: renamed from: com.daaw.yN$e$a */
        public static final class a extends AbstractC1623Ms {
            public /* synthetic */ Object E;
            public int G;

            public a(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.E = obj;
                this.G |= Integer.MIN_VALUE;
                return e.this.c(null, this);
            }
        }

        public e(C6190lF0 c6190lF0, int i, InterfaceC7337pN interfaceC7337pN) {
            this.B = c6190lF0;
            this.C = i;
            this.D = interfaceC7337pN;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.c(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
        
            if (com.daaw.AbstractC9854yN.c(r7, r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.daaw.InterfaceC7337pN
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.lang.Object r6, com.daaw.InterfaceC1416Ks r7) throws java.lang.Throwable {
            /*
                r5 = this;
                boolean r0 = r7 instanceof com.daaw.AbstractC9854yN.e.a
                if (r0 == 0) goto L13
                r0 = r7
                com.daaw.yN$e$a r0 = (com.daaw.AbstractC9854yN.e.a) r0
                int r1 = r0.G
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.G = r1
                goto L18
            L13:
                com.daaw.yN$e$a r0 = new com.daaw.yN$e$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.E
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.G
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                com.daaw.AbstractC4801gJ0.b(r7)
                goto L5f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                com.daaw.AbstractC4801gJ0.b(r7)
                goto L51
            L38:
                com.daaw.AbstractC4801gJ0.b(r7)
                com.daaw.lF0 r7 = r5.B
                int r2 = r7.B
                int r2 = r2 + r4
                r7.B = r2
                int r7 = r5.C
                if (r2 >= r7) goto L54
                com.daaw.pN r7 = r5.D
                r0.G = r4
                java.lang.Object r6 = r7.c(r6, r0)
                if (r6 != r1) goto L51
                goto L5e
            L51:
                com.daaw.G91 r6 = com.daaw.G91.a
                return r6
            L54:
                com.daaw.pN r7 = r5.D
                r0.G = r3
                java.lang.Object r6 = com.daaw.AbstractC9854yN.a(r7, r6, r0)
                if (r6 != r1) goto L5f
            L5e:
                return r1
            L5f:
                com.daaw.G91 r6 = com.daaw.G91.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9854yN.e.c(java.lang.Object, com.daaw.Ks):java.lang.Object");
        }
    }

    public static final InterfaceC7058oN b(InterfaceC7058oN interfaceC7058oN, InterfaceC3429bR interfaceC3429bR) {
        return new a(interfaceC7058oN, interfaceC3429bR);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.daaw.InterfaceC7337pN r4, java.lang.Object r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof com.daaw.AbstractC9854yN.c
            if (r0 == 0) goto L13
            r0 = r6
            com.daaw.yN$c r0 = (com.daaw.AbstractC9854yN.c) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            com.daaw.yN$c r0 = new com.daaw.yN$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r4 = r0.E
            com.daaw.pN r4 = (com.daaw.InterfaceC7337pN) r4
            com.daaw.AbstractC4801gJ0.b(r6)
            goto L43
        L35:
            com.daaw.AbstractC4801gJ0.b(r6)
            r0.E = r4
            r0.G = r3
            java.lang.Object r5 = r4.c(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            com.daaw.c r5 = new com.daaw.c
            r5.<init>(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC9854yN.c(com.daaw.pN, java.lang.Object, com.daaw.Ks):java.lang.Object");
    }

    public static final InterfaceC7058oN d(InterfaceC7058oN interfaceC7058oN, int i) {
        if (i > 0) {
            return new d(interfaceC7058oN, i);
        }
        throw new IllegalArgumentException(("Requested element count " + i + " should be positive").toString());
    }
}
