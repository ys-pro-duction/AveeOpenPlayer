package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y01 {
    public static final InterfaceC3986dR a = new a(null);

    public static final class a extends SZ0 implements InterfaceC3986dR {
        public int F;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(3, interfaceC1416Ks);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return u((InterfaceC5268hz0) obj, ((C9982yp0) obj2).t(), (InterfaceC1416Ks) obj3);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            return G91.a;
        }

        public final Object u(InterfaceC5268hz0 interfaceC5268hz0, long j, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(interfaceC1416Ks).q(G91.a);
        }
    }

    public static final class b extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public boolean G;
        public /* synthetic */ Object H;
        public int I;

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.I |= Integer.MIN_VALUE;
            return Y01.f(null, null, false, this);
        }
    }

    public static final class c extends AbstractC4233eJ0 implements InterfaceC3429bR {
        public long D;
        public int E;
        public /* synthetic */ Object F;
        public final /* synthetic */ C7223ox0 G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7223ox0 c7223ox0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = c7223ox0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            c cVar = new c(this.G, interfaceC1416Ks);
            cVar.F = obj;
            return cVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0042 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0040 -> B:12:0x0043). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r8.E
                r2 = 1
                if (r1 == 0) goto L1d
                if (r1 != r2) goto L15
                long r3 = r8.D
                java.lang.Object r1 = r8.F
                com.daaw.Sd r1 = (com.daaw.InterfaceC2211Sd) r1
                com.daaw.AbstractC4801gJ0.b(r9)
                goto L43
            L15:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1d:
                com.daaw.AbstractC4801gJ0.b(r9)
                java.lang.Object r9 = r8.F
                com.daaw.Sd r9 = (com.daaw.InterfaceC2211Sd) r9
                com.daaw.ox0 r1 = r8.G
                long r3 = r1.k()
                com.daaw.Xd1 r1 = r9.getViewConfiguration()
                long r5 = r1.b()
                long r3 = r3 + r5
                r1 = r9
            L34:
                r8.F = r1
                r8.D = r3
                r8.E = r2
                r9 = 0
                r5 = 0
                java.lang.Object r9 = com.daaw.Y01.e(r1, r9, r8, r2, r5)
                if (r9 != r0) goto L43
                return r0
            L43:
                com.daaw.ox0 r9 = (com.daaw.C7223ox0) r9
                long r5 = r9.k()
                int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
                if (r7 < 0) goto L34
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.Y01.c.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
            return ((c) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class d extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int G;

        public d(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.G |= Integer.MIN_VALUE;
            return Y01.h(null, this);
        }
    }

    public static final class e extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ C5545iz0 H;
        public final /* synthetic */ InterfaceC3986dR I;
        public final /* synthetic */ NQ J;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ C5545iz0 H;
            public final /* synthetic */ InterfaceC9740xx0 I;
            public final /* synthetic */ InterfaceC3986dR J;
            public final /* synthetic */ NQ K;

            /* JADX INFO: renamed from: com.daaw.Y01$e$a$a, reason: collision with other inner class name */
            public static final class C0131a extends AbstractC4233eJ0 implements InterfaceC3429bR {
                public int D;
                public /* synthetic */ Object E;
                public final /* synthetic */ InterfaceC3986dR F;
                public final /* synthetic */ InterfaceC7484pt G;
                public final /* synthetic */ C5545iz0 H;
                public final /* synthetic */ NQ I;

                /* JADX INFO: renamed from: com.daaw.Y01$e$a$a$a, reason: collision with other inner class name */
                public static final class C0132a extends SZ0 implements InterfaceC3429bR {
                    public int F;
                    public final /* synthetic */ InterfaceC3986dR G;
                    public final /* synthetic */ C5545iz0 H;
                    public final /* synthetic */ C7223ox0 I;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0132a(InterfaceC3986dR interfaceC3986dR, C5545iz0 c5545iz0, C7223ox0 c7223ox0, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.G = interfaceC3986dR;
                        this.H = c5545iz0;
                        this.I = c7223ox0;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        return new C0132a(this.G, this.H, this.I, interfaceC1416Ks);
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.F;
                        if (i == 0) {
                            AbstractC4801gJ0.b(obj);
                            InterfaceC3986dR interfaceC3986dR = this.G;
                            C5545iz0 c5545iz0 = this.H;
                            C9982yp0 c9982yp0D = C9982yp0.d(this.I.f());
                            this.F = 1;
                            if (interfaceC3986dR.invoke(c5545iz0, c9982yp0D, this) == objC) {
                                return objC;
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
                    public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                        return ((C0132a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0131a(InterfaceC3986dR interfaceC3986dR, InterfaceC7484pt interfaceC7484pt, C5545iz0 c5545iz0, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.F = interfaceC3986dR;
                    this.G = interfaceC7484pt;
                    this.H = c5545iz0;
                    this.I = nq;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    C0131a c0131a = new C0131a(this.F, this.G, this.H, this.I, interfaceC1416Ks);
                    c0131a.E = obj;
                    return c0131a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
                
                    if (r13 == r0) goto L18;
                 */
                @Override // com.daaw.AbstractC7409pe
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object q(java.lang.Object r13) throws java.lang.Throwable {
                    /*
                        r12 = this;
                        java.lang.Object r0 = com.daaw.I10.c()
                        int r1 = r12.D
                        r2 = 2
                        r3 = 0
                        r4 = 1
                        if (r1 == 0) goto L23
                        if (r1 == r4) goto L1b
                        if (r1 != r2) goto L13
                        com.daaw.AbstractC4801gJ0.b(r13)
                        goto L61
                    L13:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1b:
                        java.lang.Object r1 = r12.E
                        com.daaw.Sd r1 = (com.daaw.InterfaceC2211Sd) r1
                        com.daaw.AbstractC4801gJ0.b(r13)
                        goto L37
                    L23:
                        com.daaw.AbstractC4801gJ0.b(r13)
                        java.lang.Object r13 = r12.E
                        r1 = r13
                        com.daaw.Sd r1 = (com.daaw.InterfaceC2211Sd) r1
                        r12.E = r1
                        r12.D = r4
                        r13 = 0
                        java.lang.Object r13 = com.daaw.Y01.e(r1, r13, r12, r4, r3)
                        if (r13 != r0) goto L37
                        goto L60
                    L37:
                        com.daaw.ox0 r13 = (com.daaw.C7223ox0) r13
                        r13.a()
                        com.daaw.dR r4 = r12.F
                        com.daaw.dR r5 = com.daaw.Y01.c()
                        if (r4 == r5) goto L56
                        com.daaw.pt r6 = r12.G
                        com.daaw.Y01$e$a$a$a r9 = new com.daaw.Y01$e$a$a$a
                        com.daaw.dR r4 = r12.F
                        com.daaw.iz0 r5 = r12.H
                        r9.<init>(r4, r5, r13, r3)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        com.daaw.AbstractC8539th.d(r6, r7, r8, r9, r10, r11)
                    L56:
                        r12.E = r3
                        r12.D = r2
                        java.lang.Object r13 = com.daaw.Y01.l(r1, r12)
                        if (r13 != r0) goto L61
                    L60:
                        return r0
                    L61:
                        com.daaw.ox0 r13 = (com.daaw.C7223ox0) r13
                        if (r13 != 0) goto L6b
                        com.daaw.iz0 r13 = r12.H
                        r13.b()
                        goto L82
                    L6b:
                        r13.a()
                        com.daaw.iz0 r0 = r12.H
                        r0.e()
                        com.daaw.NQ r0 = r12.I
                        if (r0 == 0) goto L82
                        long r1 = r13.f()
                        com.daaw.yp0 r13 = com.daaw.C9982yp0.d(r1)
                        r0.invoke(r13)
                    L82:
                        com.daaw.G91 r13 = com.daaw.G91.a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.Y01.e.a.C0131a.q(java.lang.Object):java.lang.Object");
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((C0131a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5545iz0 c5545iz0, InterfaceC9740xx0 interfaceC9740xx0, InterfaceC3986dR interfaceC3986dR, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = c5545iz0;
                this.I = interfaceC9740xx0;
                this.J = interfaceC3986dR;
                this.K = nq;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, this.J, this.K, interfaceC1416Ks);
                aVar.G = obj;
                return aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
                    this.H.f();
                    InterfaceC9740xx0 interfaceC9740xx0 = this.I;
                    C0131a c0131a = new C0131a(this.J, interfaceC7484pt, this.H, this.K, null);
                    this.F = 1;
                    if (interfaceC9740xx0.Q(c0131a, this) == objC) {
                        return objC;
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
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C5545iz0 c5545iz0, InterfaceC3986dR interfaceC3986dR, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = c5545iz0;
            this.I = interfaceC3986dR;
            this.J = nq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            e eVar = new e(this.H, this.I, this.J, interfaceC1416Ks);
            eVar.G = obj;
            return eVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                a aVar = new a(this.H, (InterfaceC9740xx0) this.G, this.I, this.J, null);
                this.F = 1;
                if (AbstractC7763qt.e(aVar, this) == objC) {
                    return objC;
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
        public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((e) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class f extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ InterfaceC9740xx0 H;
        public final /* synthetic */ InterfaceC3986dR I;
        public final /* synthetic */ NQ J;
        public final /* synthetic */ NQ K;
        public final /* synthetic */ NQ L;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ C5545iz0 H;
            public final /* synthetic */ InterfaceC3986dR I;
            public final /* synthetic */ InterfaceC7484pt J;
            public final /* synthetic */ NQ K;
            public final /* synthetic */ NQ L;
            public final /* synthetic */ NQ M;

            /* JADX INFO: renamed from: com.daaw.Y01$f$a$a, reason: collision with other inner class name */
            public static final class C0133a extends AbstractC4233eJ0 implements InterfaceC3429bR {
                public Object D;
                public Object E;
                public Object F;
                public long G;
                public int H;
                public /* synthetic */ Object I;
                public final /* synthetic */ C5545iz0 J;
                public final /* synthetic */ InterfaceC3986dR K;
                public final /* synthetic */ InterfaceC7484pt L;
                public final /* synthetic */ NQ M;
                public final /* synthetic */ NQ N;
                public final /* synthetic */ NQ O;

                /* JADX INFO: renamed from: com.daaw.Y01$f$a$a$a, reason: collision with other inner class name */
                public static final class C0134a extends SZ0 implements InterfaceC3429bR {
                    public int F;
                    public final /* synthetic */ InterfaceC3986dR G;
                    public final /* synthetic */ C5545iz0 H;
                    public final /* synthetic */ C7223ox0 I;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0134a(InterfaceC3986dR interfaceC3986dR, C5545iz0 c5545iz0, C7223ox0 c7223ox0, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.G = interfaceC3986dR;
                        this.H = c5545iz0;
                        this.I = c7223ox0;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        return new C0134a(this.G, this.H, this.I, interfaceC1416Ks);
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.F;
                        if (i == 0) {
                            AbstractC4801gJ0.b(obj);
                            InterfaceC3986dR interfaceC3986dR = this.G;
                            C5545iz0 c5545iz0 = this.H;
                            C9982yp0 c9982yp0D = C9982yp0.d(this.I.f());
                            this.F = 1;
                            if (interfaceC3986dR.invoke(c5545iz0, c9982yp0D, this) == objC) {
                                return objC;
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
                    public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                        return ((C0134a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX INFO: renamed from: com.daaw.Y01$f$a$a$b */
                public static final class b extends AbstractC4233eJ0 implements InterfaceC3429bR {
                    public int D;
                    public /* synthetic */ Object E;

                    public b(InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        b bVar = new b(interfaceC1416Ks);
                        bVar.E = obj;
                        return bVar;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.D;
                        if (i != 0) {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC4801gJ0.b(obj);
                            return obj;
                        }
                        AbstractC4801gJ0.b(obj);
                        InterfaceC2211Sd interfaceC2211Sd = (InterfaceC2211Sd) this.E;
                        this.D = 1;
                        Object objL = Y01.l(interfaceC2211Sd, this);
                        return objL == objC ? objC : objL;
                    }

                    @Override // com.daaw.InterfaceC3429bR
                    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                        return ((b) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX INFO: renamed from: com.daaw.Y01$f$a$a$c */
                public static final class c extends SZ0 implements InterfaceC3429bR {
                    public int F;
                    public final /* synthetic */ InterfaceC3986dR G;
                    public final /* synthetic */ C5545iz0 H;
                    public final /* synthetic */ C7223ox0 I;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public c(InterfaceC3986dR interfaceC3986dR, C5545iz0 c5545iz0, C7223ox0 c7223ox0, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.G = interfaceC3986dR;
                        this.H = c5545iz0;
                        this.I = c7223ox0;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        return new c(this.G, this.H, this.I, interfaceC1416Ks);
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.F;
                        if (i == 0) {
                            AbstractC4801gJ0.b(obj);
                            InterfaceC3986dR interfaceC3986dR = this.G;
                            C5545iz0 c5545iz0 = this.H;
                            C9982yp0 c9982yp0D = C9982yp0.d(this.I.f());
                            this.F = 1;
                            if (interfaceC3986dR.invoke(c5545iz0, c9982yp0D, this) == objC) {
                                return objC;
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
                    public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                        return ((c) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX INFO: renamed from: com.daaw.Y01$f$a$a$d */
                public static final class d extends AbstractC4233eJ0 implements InterfaceC3429bR {
                    public int D;
                    public /* synthetic */ Object E;
                    public final /* synthetic */ C5545iz0 F;
                    public final /* synthetic */ NQ G;
                    public final /* synthetic */ NQ H;
                    public final /* synthetic */ C6748nF0 I;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public d(C5545iz0 c5545iz0, NQ nq, NQ nq2, C6748nF0 c6748nF0, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.F = c5545iz0;
                        this.G = nq;
                        this.H = nq2;
                        this.I = c6748nF0;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        d dVar = new d(this.F, this.G, this.H, this.I, interfaceC1416Ks);
                        dVar.E = obj;
                        return dVar;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.D;
                        if (i == 0) {
                            AbstractC4801gJ0.b(obj);
                            InterfaceC2211Sd interfaceC2211Sd = (InterfaceC2211Sd) this.E;
                            this.D = 1;
                            obj = Y01.l(interfaceC2211Sd, this);
                            if (obj == objC) {
                                return objC;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            AbstractC4801gJ0.b(obj);
                        }
                        C7223ox0 c7223ox0 = (C7223ox0) obj;
                        if (c7223ox0 != null) {
                            c7223ox0.a();
                            this.F.e();
                            this.G.invoke(C9982yp0.d(c7223ox0.f()));
                            return G91.a;
                        }
                        this.F.b();
                        NQ nq = this.H;
                        if (nq == null) {
                            return null;
                        }
                        nq.invoke(C9982yp0.d(((C7223ox0) this.I.B).f()));
                        return G91.a;
                    }

                    @Override // com.daaw.InterfaceC3429bR
                    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                        return ((d) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0133a(C5545iz0 c5545iz0, InterfaceC3986dR interfaceC3986dR, InterfaceC7484pt interfaceC7484pt, NQ nq, NQ nq2, NQ nq3, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.J = c5545iz0;
                    this.K = interfaceC3986dR;
                    this.L = interfaceC7484pt;
                    this.M = nq;
                    this.N = nq2;
                    this.O = nq3;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    C0133a c0133a = new C0133a(this.J, this.K, this.L, this.M, this.N, this.O, interfaceC1416Ks);
                    c0133a.I = obj;
                    return c0133a;
                }

                /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
                
                    if (com.daaw.Y01.h(r6, r18) != r1) goto L48;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:69:0x01ba, code lost:
                
                    if (r2.z(r4, r7, r18) == r1) goto L80;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:79:0x01f0, code lost:
                
                    if (com.daaw.Y01.h(r5, r18) == r1) goto L80;
                 */
                /* JADX WARN: Removed duplicated region for block: B:25:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x00b9  */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00c2  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x00e6  */
                /* JADX WARN: Removed duplicated region for block: B:37:0x00ef A[Catch: gx0 -> 0x00f5, TryCatch #3 {gx0 -> 0x00f5, blocks: (B:35:0x00e9, B:37:0x00ef, B:39:0x00fa), top: B:90:0x00e9 }] */
                /* JADX WARN: Removed duplicated region for block: B:39:0x00fa A[Catch: gx0 -> 0x00f5, TRY_LEAVE, TryCatch #3 {gx0 -> 0x00f5, blocks: (B:35:0x00e9, B:37:0x00ef, B:39:0x00fa), top: B:90:0x00e9 }] */
                /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
                /* JADX WARN: Removed duplicated region for block: B:51:0x0137  */
                /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
                /* JADX WARN: Removed duplicated region for block: B:65:0x0180  */
                /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
                /* JADX WARN: Removed duplicated region for block: B:77:0x01d8  */
                @Override // com.daaw.AbstractC7409pe
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object q(java.lang.Object r19) throws java.lang.Throwable {
                    /*
                        Method dump skipped, instruction units count: 526
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.Y01.f.a.C0133a.q(java.lang.Object):java.lang.Object");
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((C0133a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C5545iz0 c5545iz0, InterfaceC3986dR interfaceC3986dR, InterfaceC7484pt interfaceC7484pt, NQ nq, NQ nq2, NQ nq3, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = c5545iz0;
                this.I = interfaceC3986dR;
                this.J = interfaceC7484pt;
                this.K = nq;
                this.L = nq2;
                this.M = nq3;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, this.J, this.K, this.L, this.M, interfaceC1416Ks);
                aVar.G = obj;
                return aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    InterfaceC9740xx0 interfaceC9740xx0 = (InterfaceC9740xx0) this.G;
                    C0133a c0133a = new C0133a(this.H, this.I, this.J, this.K, this.L, this.M, null);
                    this.F = 1;
                    if (interfaceC9740xx0.Q(c0133a, this) == objC) {
                        return objC;
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
            public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC3986dR interfaceC3986dR, NQ nq, NQ nq2, NQ nq3, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = interfaceC9740xx0;
            this.I = interfaceC3986dR;
            this.J = nq;
            this.K = nq2;
            this.L = nq3;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            f fVar = new f(this.H, this.I, this.J, this.K, this.L, interfaceC1416Ks);
            fVar.G = obj;
            return fVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
                C5545iz0 c5545iz0 = new C5545iz0(this.H);
                InterfaceC9740xx0 interfaceC9740xx0 = this.H;
                a aVar = new a(c5545iz0, this.I, interfaceC7484pt, this.J, this.K, this.L, null);
                this.F = 1;
                if (WO.d(interfaceC9740xx0, aVar, this) == objC) {
                    return objC;
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
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((f) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class g extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int G;

        public g(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.G |= Integer.MIN_VALUE;
            return Y01.l(null, this);
        }
    }

    public static final Object d(InterfaceC2211Sd interfaceC2211Sd, boolean z, InterfaceC1416Ks interfaceC1416Ks) {
        return f(interfaceC2211Sd, EnumC4702fx0.Main, z, interfaceC1416Ks);
    }

    public static /* synthetic */ Object e(InterfaceC2211Sd interfaceC2211Sd, boolean z, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return d(interfaceC2211Sd, z, interfaceC1416Ks);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004d -> B:18:0x0050). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(com.daaw.InterfaceC2211Sd r9, com.daaw.EnumC4702fx0 r10, boolean r11, com.daaw.InterfaceC1416Ks r12) {
        /*
            boolean r0 = r12 instanceof com.daaw.Y01.b
            if (r0 == 0) goto L13
            r0 = r12
            com.daaw.Y01$b r0 = (com.daaw.Y01.b) r0
            int r1 = r0.I
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.I = r1
            goto L18
        L13:
            com.daaw.Y01$b r0 = new com.daaw.Y01$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.H
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.I
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 != r3) goto L36
            boolean r9 = r0.G
            java.lang.Object r10 = r0.F
            com.daaw.fx0 r10 = (com.daaw.EnumC4702fx0) r10
            java.lang.Object r11 = r0.E
            com.daaw.Sd r11 = (com.daaw.InterfaceC2211Sd) r11
            com.daaw.AbstractC4801gJ0.b(r12)
            r8 = r11
            r11 = r9
            r9 = r8
            goto L50
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            com.daaw.AbstractC4801gJ0.b(r12)
        L41:
            r0.E = r9
            r0.F = r10
            r0.G = r11
            r0.I = r3
            java.lang.Object r12 = r9.c0(r10, r0)
            if (r12 != r1) goto L50
            return r1
        L50:
            com.daaw.dx0 r12 = (com.daaw.C4134dx0) r12
            java.util.List r2 = r12.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L5c:
            if (r6 >= r4) goto L76
            java.lang.Object r7 = r2.get(r6)
            com.daaw.ox0 r7 = (com.daaw.C7223ox0) r7
            if (r11 == 0) goto L6b
            boolean r7 = com.daaw.AbstractC4413ex0.a(r7)
            goto L6f
        L6b:
            boolean r7 = com.daaw.AbstractC4413ex0.b(r7)
        L6f:
            if (r7 != 0) goto L73
            r2 = 0
            goto L77
        L73:
            int r6 = r6 + 1
            goto L5c
        L76:
            r2 = 1
        L77:
            if (r2 == 0) goto L41
            java.util.List r9 = r12.c()
            java.lang.Object r9 = r9.get(r5)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Y01.f(com.daaw.Sd, com.daaw.fx0, boolean, com.daaw.Ks):java.lang.Object");
    }

    public static final Object g(InterfaceC2211Sd interfaceC2211Sd, C7223ox0 c7223ox0, InterfaceC1416Ks interfaceC1416Ks) {
        return interfaceC2211Sd.X(interfaceC2211Sd.getViewConfiguration().a(), new c(c7223ox0, null), interfaceC1416Ks);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052 A[LOOP:0: B:19:0x0050->B:20:0x0052, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.daaw.InterfaceC2211Sd r8, com.daaw.InterfaceC1416Ks r9) throws java.lang.Throwable {
        /*
            boolean r0 = r9 instanceof com.daaw.Y01.d
            if (r0 == 0) goto L13
            r0 = r9
            com.daaw.Y01$d r0 = (com.daaw.Y01.d) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            com.daaw.Y01$d r0 = new com.daaw.Y01$d
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r8 = r0.E
            com.daaw.Sd r8 = (com.daaw.InterfaceC2211Sd) r8
            com.daaw.AbstractC4801gJ0.b(r9)
            goto L44
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L35:
            com.daaw.AbstractC4801gJ0.b(r9)
        L38:
            r0.E = r8
            r0.G = r3
            r9 = 0
            java.lang.Object r9 = com.daaw.AbstractC2105Rd.a(r8, r9, r0, r3, r9)
            if (r9 != r1) goto L44
            return r1
        L44:
            com.daaw.dx0 r9 = (com.daaw.C4134dx0) r9
            java.util.List r2 = r9.c()
            int r4 = r2.size()
            r5 = 0
            r6 = 0
        L50:
            if (r6 >= r4) goto L5e
            java.lang.Object r7 = r2.get(r6)
            com.daaw.ox0 r7 = (com.daaw.C7223ox0) r7
            r7.a()
            int r6 = r6 + 1
            goto L50
        L5e:
            java.util.List r9 = r9.c()
            int r2 = r9.size()
        L66:
            if (r5 >= r2) goto L78
            java.lang.Object r4 = r9.get(r5)
            com.daaw.ox0 r4 = (com.daaw.C7223ox0) r4
            boolean r4 = r4.g()
            if (r4 == 0) goto L75
            goto L38
        L75:
            int r5 = r5 + 1
            goto L66
        L78:
            com.daaw.G91 r8 = com.daaw.G91.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Y01.h(com.daaw.Sd, com.daaw.Ks):java.lang.Object");
    }

    public static final Object i(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC3986dR interfaceC3986dR, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        Object objD = WO.d(interfaceC9740xx0, new e(new C5545iz0(interfaceC9740xx0), interfaceC3986dR, nq, null), interfaceC1416Ks);
        return objD == I10.c() ? objD : G91.a;
    }

    public static final Object j(InterfaceC9740xx0 interfaceC9740xx0, NQ nq, NQ nq2, InterfaceC3986dR interfaceC3986dR, NQ nq3, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = AbstractC7763qt.e(new f(interfaceC9740xx0, interfaceC3986dR, nq2, nq, nq3, null), interfaceC1416Ks);
        return objE == I10.c() ? objE : G91.a;
    }

    public static /* synthetic */ Object k(InterfaceC9740xx0 interfaceC9740xx0, NQ nq, NQ nq2, InterfaceC3986dR interfaceC3986dR, NQ nq3, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj) {
        if ((i & 1) != 0) {
            nq = null;
        }
        if ((i & 2) != 0) {
            nq2 = null;
        }
        if ((i & 4) != 0) {
            interfaceC3986dR = a;
        }
        if ((i & 8) != 0) {
            nq3 = null;
        }
        return j(interfaceC9740xx0, nq, nq2, interfaceC3986dR, nq3, interfaceC1416Ks);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a0, code lost:
    
        if (r14 == r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053 A[PHI: r13 r14
  0x0053: PHI (r13v1 com.daaw.Sd) = (r13v4 com.daaw.Sd), (r13v7 com.daaw.Sd) binds: [B:18:0x0050, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]
  0x0053: PHI (r14v2 java.lang.Object) = (r14v8 java.lang.Object), (r14v1 java.lang.Object) binds: [B:18:0x0050, B:15:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a0 -> B:36:0x00a3). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(com.daaw.InterfaceC2211Sd r13, com.daaw.InterfaceC1416Ks r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.Y01.l(com.daaw.Sd, com.daaw.Ks):java.lang.Object");
    }
}
