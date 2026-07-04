package com.daaw;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class BN {

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ SR0 G;
        public final /* synthetic */ InterfaceC7058oN H;
        public final /* synthetic */ InterfaceC7450pm0 I;
        public final /* synthetic */ Object J;

        /* JADX INFO: renamed from: com.daaw.BN$a$a, reason: collision with other inner class name */
        public static final class C0049a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ int G;

            public C0049a(InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                C0049a c0049a = new C0049a(interfaceC1416Ks);
                c0049a.G = ((Number) obj).intValue();
                return c0049a;
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return u(((Number) obj).intValue(), (InterfaceC1416Ks) obj2);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                I10.c();
                if (this.F != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
                return AbstractC0527Cg.a(this.G > 0);
            }

            public final Object u(int i, InterfaceC1416Ks interfaceC1416Ks) {
                return ((C0049a) a(Integer.valueOf(i), interfaceC1416Ks)).q(G91.a);
            }
        }

        public static final class b extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ InterfaceC7058oN H;
            public final /* synthetic */ InterfaceC7450pm0 I;
            public final /* synthetic */ Object J;

            /* JADX INFO: renamed from: com.daaw.BN$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C0050a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[QR0.values().length];
                    try {
                        iArr[QR0.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[QR0.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[QR0.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC7058oN interfaceC7058oN, InterfaceC7450pm0 interfaceC7450pm0, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = interfaceC7058oN;
                this.I = interfaceC7450pm0;
                this.J = obj;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                b bVar = new b(this.H, this.I, this.J, interfaceC1416Ks);
                bVar.G = obj;
                return bVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    int i2 = C0050a.a[((QR0) this.G).ordinal()];
                    if (i2 == 1) {
                        InterfaceC7058oN interfaceC7058oN = this.H;
                        InterfaceC7450pm0 interfaceC7450pm0 = this.I;
                        this.F = 1;
                        if (interfaceC7058oN.a(interfaceC7450pm0, this) == objC) {
                            return objC;
                        }
                    } else if (i2 == 3) {
                        Object obj2 = this.J;
                        if (obj2 == JR0.a) {
                            this.I.i();
                        } else {
                            this.I.j(obj2);
                        }
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(QR0 qr0, InterfaceC1416Ks interfaceC1416Ks) {
                return ((b) a(qr0, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SR0 sr0, InterfaceC7058oN interfaceC7058oN, InterfaceC7450pm0 interfaceC7450pm0, Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = sr0;
            this.H = interfaceC7058oN;
            this.I = interfaceC7450pm0;
            this.J = obj;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, this.H, this.I, this.J, interfaceC1416Ks);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.a(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.a(r1, r7) != r0) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (com.daaw.AbstractC7894rN.d(r8, r1, r7) == r0) goto L28;
         */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r7.F
                r2 = 4
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L25
                if (r1 == r5) goto L21
                if (r1 == r4) goto L1d
                if (r1 == r3) goto L21
                if (r1 != r2) goto L15
                goto L21
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                com.daaw.AbstractC4801gJ0.b(r8)
                goto L5c
            L21:
                com.daaw.AbstractC4801gJ0.b(r8)
                goto L8d
            L25:
                com.daaw.AbstractC4801gJ0.b(r8)
                com.daaw.SR0 r8 = r7.G
                com.daaw.SR0$a r1 = com.daaw.SR0.a
                com.daaw.SR0 r6 = r1.c()
                if (r8 != r6) goto L3f
                com.daaw.oN r8 = r7.H
                com.daaw.pm0 r1 = r7.I
                r7.F = r5
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L3f:
                com.daaw.SR0 r8 = r7.G
                com.daaw.SR0 r1 = r1.d()
                r5 = 0
                if (r8 != r1) goto L69
                com.daaw.pm0 r8 = r7.I
                com.daaw.mW0 r8 = r8.k()
                com.daaw.BN$a$a r1 = new com.daaw.BN$a$a
                r1.<init>(r5)
                r7.F = r4
                java.lang.Object r8 = com.daaw.AbstractC7894rN.i(r8, r1, r7)
                if (r8 != r0) goto L5c
                goto L8c
            L5c:
                com.daaw.oN r8 = r7.H
                com.daaw.pm0 r1 = r7.I
                r7.F = r3
                java.lang.Object r8 = r8.a(r1, r7)
                if (r8 != r0) goto L8d
                goto L8c
            L69:
                com.daaw.SR0 r8 = r7.G
                com.daaw.pm0 r1 = r7.I
                com.daaw.mW0 r1 = r1.k()
                com.daaw.oN r8 = r8.a(r1)
                com.daaw.oN r8 = com.daaw.AbstractC7894rN.e(r8)
                com.daaw.BN$a$b r1 = new com.daaw.BN$a$b
                com.daaw.oN r3 = r7.H
                com.daaw.pm0 r4 = r7.I
                java.lang.Object r6 = r7.J
                r1.<init>(r3, r4, r6, r5)
                r7.F = r2
                java.lang.Object r8 = com.daaw.AbstractC7894rN.d(r8, r1, r7)
                if (r8 != r0) goto L8d
            L8c:
                return r0
            L8d:
                com.daaw.G91 r8 = com.daaw.G91.a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.BN.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final com.daaw.RR0 a(com.daaw.InterfaceC7058oN r7, int r8) {
        /*
            com.daaw.ak$a r0 = com.daaw.InterfaceC3236ak.c
            int r0 = r0.a()
            int r0 = com.daaw.AbstractC8417tE0.d(r8, r0)
            int r0 = r0 - r8
            boolean r1 = r7 instanceof com.daaw.AbstractC4350ek
            if (r1 == 0) goto L3c
            r1 = r7
            com.daaw.ek r1 = (com.daaw.AbstractC4350ek) r1
            com.daaw.oN r2 = r1.l()
            if (r2 == 0) goto L3c
            com.daaw.RR0 r7 = new com.daaw.RR0
            int r3 = r1.C
            r4 = -3
            if (r3 == r4) goto L26
            r4 = -2
            if (r3 == r4) goto L26
            if (r3 == 0) goto L26
            r0 = r3
            goto L34
        L26:
            com.daaw.hh r4 = r1.D
            com.daaw.hh r5 = com.daaw.EnumC5182hh.SUSPEND
            r6 = 0
            if (r4 != r5) goto L31
            if (r3 != 0) goto L34
        L2f:
            r0 = 0
            goto L34
        L31:
            if (r8 != 0) goto L2f
            r0 = 1
        L34:
            com.daaw.hh r8 = r1.D
            com.daaw.ft r1 = r1.B
            r7.<init>(r2, r0, r8, r1)
            return r7
        L3c:
            com.daaw.RR0 r8 = new com.daaw.RR0
            com.daaw.hh r1 = com.daaw.EnumC5182hh.SUSPEND
            com.daaw.kG r2 = com.daaw.C5905kG.B
            r8.<init>(r7, r0, r1, r2)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.BN.a(com.daaw.oN, int):com.daaw.RR0");
    }

    public static final U30 b(InterfaceC7484pt interfaceC7484pt, InterfaceC4684ft interfaceC4684ft, InterfaceC7058oN interfaceC7058oN, InterfaceC7450pm0 interfaceC7450pm0, SR0 sr0, Object obj) {
        return AbstractC8539th.c(interfaceC7484pt, interfaceC4684ft, G10.c(sr0, SR0.a.c()) ? EnumC8599tt.DEFAULT : EnumC8599tt.UNDISPATCHED, new a(sr0, interfaceC7058oN, interfaceC7450pm0, obj, null));
    }

    public static final InterfaceC6537mW0 c(InterfaceC7058oN interfaceC7058oN, InterfaceC7484pt interfaceC7484pt, SR0 sr0, Object obj) {
        RR0 rr0A = a(interfaceC7058oN, 1);
        InterfaceC8286sm0 interfaceC8286sm0A = AbstractC7095oW0.a(obj);
        return new ME0(interfaceC8286sm0A, b(interfaceC7484pt, rr0A.d, rr0A.a, interfaceC8286sm0A, sr0, obj));
    }
}
