package com.daaw;

import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC5781jp;

/* JADX INFO: renamed from: com.daaw.rW, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7930rW {

    /* JADX INFO: renamed from: com.daaw.rW$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC4650fm0 B;
        public final /* synthetic */ boolean C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC4650fm0 interfaceC4650fm0, boolean z) {
            super(1);
            this.B = interfaceC4650fm0;
            this.C = z;
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
            throw null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.rW$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC4650fm0 B;
        public final /* synthetic */ boolean C;

        /* JADX INFO: renamed from: com.daaw.rW$b$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC8007rm0 B;
            public final /* synthetic */ InterfaceC4650fm0 C;

            /* JADX INFO: renamed from: com.daaw.rW$b$a$a, reason: collision with other inner class name */
            public static final class C0228a implements InterfaceC8973vC {
                public final /* synthetic */ InterfaceC8007rm0 a;
                public final /* synthetic */ InterfaceC4650fm0 b;

                public C0228a(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
                    this.a = interfaceC8007rm0;
                    this.b = interfaceC4650fm0;
                }

                @Override // com.daaw.InterfaceC8973vC
                public void a() {
                    b.n(this.a, this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
                super(1);
                this.B = interfaceC8007rm0;
                this.C = interfaceC4650fm0;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC8973vC invoke(C9252wC c9252wC) {
                G10.g(c9252wC, "$this$DisposableEffect");
                return new C0228a(this.B, this.C);
            }
        }

        /* JADX INFO: renamed from: com.daaw.rW$b$b, reason: collision with other inner class name */
        public static final class C0229b extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ boolean G;
            public final /* synthetic */ InterfaceC8007rm0 H;
            public final /* synthetic */ InterfaceC4650fm0 I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0229b(boolean z, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = z;
                this.H = interfaceC8007rm0;
                this.I = interfaceC4650fm0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new C0229b(this.G, this.H, this.I, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    if (!this.G) {
                        InterfaceC8007rm0 interfaceC8007rm0 = this.H;
                        InterfaceC4650fm0 interfaceC4650fm0 = this.I;
                        this.F = 1;
                        if (b.j(interfaceC8007rm0, interfaceC4650fm0, this) == objC) {
                            return objC;
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
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((C0229b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.rW$b$c */
        public static final class c extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ InterfaceC7484pt H;
            public final /* synthetic */ InterfaceC4650fm0 I;
            public final /* synthetic */ InterfaceC8007rm0 J;

            /* JADX INFO: renamed from: com.daaw.rW$b$c$a */
            public static final class a extends AbstractC4233eJ0 implements InterfaceC3429bR {
                public int D;
                public /* synthetic */ Object E;
                public final /* synthetic */ InterfaceC4684ft F;
                public final /* synthetic */ InterfaceC7484pt G;
                public final /* synthetic */ InterfaceC4650fm0 H;
                public final /* synthetic */ InterfaceC8007rm0 I;

                /* JADX INFO: renamed from: com.daaw.rW$b$c$a$a, reason: collision with other inner class name */
                public static final class C0230a extends SZ0 implements InterfaceC3429bR {
                    public int F;
                    public final /* synthetic */ InterfaceC4650fm0 G;
                    public final /* synthetic */ InterfaceC8007rm0 H;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0230a(InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.G = interfaceC4650fm0;
                        this.H = interfaceC8007rm0;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        return new C0230a(this.G, this.H, interfaceC1416Ks);
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.F;
                        if (i == 0) {
                            AbstractC4801gJ0.b(obj);
                            InterfaceC4650fm0 interfaceC4650fm0 = this.G;
                            InterfaceC8007rm0 interfaceC8007rm0 = this.H;
                            this.F = 1;
                            if (b.i(interfaceC4650fm0, interfaceC8007rm0, this) == objC) {
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
                        return ((C0230a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX INFO: renamed from: com.daaw.rW$b$c$a$b, reason: collision with other inner class name */
                public static final class C0231b extends SZ0 implements InterfaceC3429bR {
                    public int F;
                    public final /* synthetic */ InterfaceC8007rm0 G;
                    public final /* synthetic */ InterfaceC4650fm0 H;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0231b(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.G = interfaceC8007rm0;
                        this.H = interfaceC4650fm0;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        return new C0231b(this.G, this.H, interfaceC1416Ks);
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.F;
                        if (i == 0) {
                            AbstractC4801gJ0.b(obj);
                            InterfaceC8007rm0 interfaceC8007rm0 = this.G;
                            InterfaceC4650fm0 interfaceC4650fm0 = this.H;
                            this.F = 1;
                            if (b.j(interfaceC8007rm0, interfaceC4650fm0, this) == objC) {
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
                        return ((C0231b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(InterfaceC4684ft interfaceC4684ft, InterfaceC7484pt interfaceC7484pt, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.F = interfaceC4684ft;
                    this.G = interfaceC7484pt;
                    this.H = interfaceC4650fm0;
                    this.I = interfaceC8007rm0;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    a aVar = new a(this.F, this.G, this.H, this.I, interfaceC1416Ks);
                    aVar.E = obj;
                    return aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002c  */
                /* JADX WARN: Removed duplicated region for block: B:16:0x0049  */
                /* JADX WARN: Removed duplicated region for block: B:17:0x005c  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0079  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0034 -> B:14:0x0037). Please report as a decompilation issue!!! */
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
                        r2 = 1
                        r3 = 0
                        if (r1 == 0) goto L1c
                        if (r1 != r2) goto L14
                        java.lang.Object r1 = r12.E
                        com.daaw.Sd r1 = (com.daaw.InterfaceC2211Sd) r1
                        com.daaw.AbstractC4801gJ0.b(r13)
                        goto L37
                    L14:
                        java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r13.<init>(r0)
                        throw r13
                    L1c:
                        com.daaw.AbstractC4801gJ0.b(r13)
                        java.lang.Object r13 = r12.E
                        com.daaw.Sd r13 = (com.daaw.InterfaceC2211Sd) r13
                        r1 = r13
                    L24:
                        com.daaw.ft r13 = r12.F
                        boolean r13 = com.daaw.AbstractC3053a40.l(r13)
                        if (r13 == 0) goto L79
                        r12.E = r1
                        r12.D = r2
                        java.lang.Object r13 = com.daaw.AbstractC2105Rd.a(r1, r3, r12, r2, r3)
                        if (r13 != r0) goto L37
                        return r0
                    L37:
                        com.daaw.dx0 r13 = (com.daaw.C4134dx0) r13
                        int r13 = r13.e()
                        com.daaw.hx0$a r4 = com.daaw.AbstractC5260hx0.a
                        int r5 = r4.a()
                        boolean r5 = com.daaw.AbstractC5260hx0.i(r13, r5)
                        if (r5 == 0) goto L5c
                        com.daaw.pt r6 = r12.G
                        com.daaw.rW$b$c$a$a r9 = new com.daaw.rW$b$c$a$a
                        com.daaw.fm0 r13 = r12.H
                        com.daaw.rm0 r4 = r12.I
                        r9.<init>(r13, r4, r3)
                        r10 = 3
                        r11 = 0
                        r7 = 0
                        r8 = 0
                        com.daaw.AbstractC8539th.d(r6, r7, r8, r9, r10, r11)
                        goto L24
                    L5c:
                        int r4 = r4.b()
                        boolean r13 = com.daaw.AbstractC5260hx0.i(r13, r4)
                        if (r13 == 0) goto L24
                        com.daaw.pt r4 = r12.G
                        com.daaw.rW$b$c$a$b r7 = new com.daaw.rW$b$c$a$b
                        com.daaw.rm0 r13 = r12.I
                        com.daaw.fm0 r5 = r12.H
                        r7.<init>(r13, r5, r3)
                        r8 = 3
                        r9 = 0
                        r5 = 0
                        r6 = 0
                        com.daaw.AbstractC8539th.d(r4, r5, r6, r7, r8, r9)
                        goto L24
                    L79:
                        com.daaw.G91 r13 = com.daaw.G91.a
                        return r13
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7930rW.b.c.a.q(java.lang.Object):java.lang.Object");
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC7484pt interfaceC7484pt, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = interfaceC7484pt;
                this.I = interfaceC4650fm0;
                this.J = interfaceC8007rm0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                c cVar = new c(this.H, this.I, this.J, interfaceC1416Ks);
                cVar.G = obj;
                return cVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    InterfaceC9740xx0 interfaceC9740xx0 = (InterfaceC9740xx0) this.G;
                    a aVar = new a(getContext(), this.H, this.I, this.J, null);
                    this.F = 1;
                    if (interfaceC9740xx0.Q(aVar, this) == objC) {
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
                return ((c) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.rW$b$d */
        public static final class d extends AbstractC1623Ms {
            public Object E;
            public Object F;
            public /* synthetic */ Object G;
            public int H;

            public d(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.G = obj;
                this.H |= Integer.MIN_VALUE;
                return b.i(null, null, this);
            }
        }

        /* JADX INFO: renamed from: com.daaw.rW$b$e */
        public static final class e extends AbstractC1623Ms {
            public Object E;
            public /* synthetic */ Object F;
            public int G;

            public e(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.F = obj;
                this.G |= Integer.MIN_VALUE;
                return b.j(null, null, this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4650fm0 interfaceC4650fm0, boolean z) {
            super(3);
            this.B = interfaceC4650fm0;
            this.C = z;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object i(com.daaw.InterfaceC4650fm0 r4, com.daaw.InterfaceC8007rm0 r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
            /*
                boolean r0 = r6 instanceof com.daaw.AbstractC7930rW.b.d
                if (r0 == 0) goto L13
                r0 = r6
                com.daaw.rW$b$d r0 = (com.daaw.AbstractC7930rW.b.d) r0
                int r1 = r0.H
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.H = r1
                goto L18
            L13:
                com.daaw.rW$b$d r0 = new com.daaw.rW$b$d
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.G
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.H
                r3 = 1
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r4 = r0.F
                com.daaw.oW r4 = (com.daaw.C7094oW) r4
                java.lang.Object r5 = r0.E
                com.daaw.rm0 r5 = (com.daaw.InterfaceC8007rm0) r5
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L55
            L31:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L39:
                com.daaw.AbstractC4801gJ0.b(r6)
                com.daaw.oW r6 = k(r5)
                if (r6 != 0) goto L58
                com.daaw.oW r6 = new com.daaw.oW
                r6.<init>()
                r0.E = r5
                r0.F = r6
                r0.H = r3
                java.lang.Object r4 = r4.a(r6, r0)
                if (r4 != r1) goto L54
                return r1
            L54:
                r4 = r6
            L55:
                l(r5, r4)
            L58:
                com.daaw.G91 r4 = com.daaw.G91.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7930rW.b.i(com.daaw.fm0, com.daaw.rm0, com.daaw.Ks):java.lang.Object");
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static final java.lang.Object j(com.daaw.InterfaceC8007rm0 r4, com.daaw.InterfaceC4650fm0 r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
            /*
                boolean r0 = r6 instanceof com.daaw.AbstractC7930rW.b.e
                if (r0 == 0) goto L13
                r0 = r6
                com.daaw.rW$b$e r0 = (com.daaw.AbstractC7930rW.b.e) r0
                int r1 = r0.G
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.G = r1
                goto L18
            L13:
                com.daaw.rW$b$e r0 = new com.daaw.rW$b$e
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.F
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.G
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r4 = r0.E
                com.daaw.rm0 r4 = (com.daaw.InterfaceC8007rm0) r4
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L4e
            L2d:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L35:
                com.daaw.AbstractC4801gJ0.b(r6)
                com.daaw.oW r6 = k(r4)
                if (r6 == 0) goto L52
                com.daaw.pW r2 = new com.daaw.pW
                r2.<init>(r6)
                r0.E = r4
                r0.G = r3
                java.lang.Object r5 = r5.a(r2, r0)
                if (r5 != r1) goto L4e
                return r1
            L4e:
                r5 = 0
                l(r4, r5)
            L52:
                com.daaw.G91 r4 = com.daaw.G91.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC7930rW.b.j(com.daaw.rm0, com.daaw.fm0, com.daaw.Ks):java.lang.Object");
        }

        public static final C7094oW k(InterfaceC8007rm0 interfaceC8007rm0) {
            return (C7094oW) interfaceC8007rm0.getValue();
        }

        public static final void l(InterfaceC8007rm0 interfaceC8007rm0, C7094oW c7094oW) {
            interfaceC8007rm0.setValue(c7094oW);
        }

        public static final void n(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
            C7094oW c7094oWK = k(interfaceC8007rm0);
            if (c7094oWK != null) {
                interfaceC4650fm0.c(new C7373pW(c7094oWK));
                l(interfaceC8007rm0, null);
            }
        }

        public final InterfaceC1073Hk0 h(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            InterfaceC1073Hk0 interfaceC1073Hk0B;
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(1294013553);
            interfaceC5781jp.e(773894976);
            interfaceC5781jp.e(-492369756);
            Object objF = interfaceC5781jp.f();
            InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
            if (objF == aVar.a()) {
                C2363Tp c2363Tp = new C2363Tp(AbstractC8420tF.i(C5905kG.B, interfaceC5781jp));
                interfaceC5781jp.H(c2363Tp);
                objF = c2363Tp;
            }
            interfaceC5781jp.L();
            InterfaceC7484pt interfaceC7484ptA = ((C2363Tp) objF).a();
            interfaceC5781jp.L();
            interfaceC5781jp.e(-492369756);
            Object objF2 = interfaceC5781jp.f();
            if (objF2 == aVar.a()) {
                objF2 = AbstractC9046vU0.d(null, null, 2, null);
                interfaceC5781jp.H(objF2);
            }
            interfaceC5781jp.L();
            InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF2;
            InterfaceC4650fm0 interfaceC4650fm0 = this.B;
            AbstractC8420tF.a(interfaceC4650fm0, new a(interfaceC8007rm0, interfaceC4650fm0), interfaceC5781jp, 0);
            AbstractC8420tF.c(Boolean.valueOf(this.C), new C0229b(this.C, interfaceC8007rm0, this.B, null), interfaceC5781jp, 0);
            if (this.C) {
                InterfaceC1073Hk0.a aVar2 = InterfaceC1073Hk0.m;
                InterfaceC4650fm0 interfaceC4650fm02 = this.B;
                interfaceC1073Hk0B = UZ0.b(aVar2, interfaceC4650fm02, new c(interfaceC7484ptA, interfaceC4650fm02, interfaceC8007rm0, null));
            } else {
                interfaceC1073Hk0B = InterfaceC1073Hk0.m;
            }
            interfaceC5781jp.L();
            return interfaceC1073Hk0B;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return h((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC4650fm0 interfaceC4650fm0, boolean z) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(interfaceC4650fm0, "interactionSource");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a(interfaceC4650fm0, z) : AbstractC5550j00.a(), new b(interfaceC4650fm0, z));
    }
}
