package com.daaw;

import com.daaw.InterfaceC5781jp;

/* JADX INFO: renamed from: com.daaw.iO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5378iO {
    public static final C5273i00 a;

    /* JADX INFO: renamed from: com.daaw.iO$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ InterfaceC4650fm0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, InterfaceC4650fm0 interfaceC4650fm0) {
            super(1);
            this.B = z;
            this.C = interfaceC4650fm0;
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

    /* JADX INFO: renamed from: com.daaw.iO$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ InterfaceC4650fm0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, InterfaceC4650fm0 interfaceC4650fm0) {
            super(1);
            this.B = z;
            this.C = interfaceC4650fm0;
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

    /* JADX INFO: renamed from: com.daaw.iO$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ InterfaceC4650fm0 C;

        /* JADX INFO: renamed from: com.daaw.iO$d$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ XZ B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(XZ xz) {
                super(1);
                this.B = xz;
            }

            public final void a(VN vn) {
                G10.g(vn, "$this$focusProperties");
                vn.o(!WZ.f(this.B.a(), WZ.b.b()));
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((VN) obj);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, InterfaceC4650fm0 interfaceC4650fm0) {
            super(3);
            this.B = z;
            this.C = interfaceC4650fm0;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-618949501);
            InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC5378iO.b(XN.b(InterfaceC1073Hk0.m, new a((XZ) interfaceC5781jp.O(AbstractC2259Sp.f()))), this.B, this.C);
            interfaceC5781jp.L();
            return interfaceC1073Hk0B;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.iO$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(NQ nq) {
            super(1);
            this.B = nq;
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

    /* JADX INFO: renamed from: com.daaw.iO$f */
    public static final class f extends AbstractC4192e90 implements NQ {
        public f() {
            super(1);
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

    static {
        a = new C5273i00(AbstractC5550j00.c() ? new f() : AbstractC5550j00.a());
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, InterfaceC4650fm0 interfaceC4650fm0) {
        G10.g(interfaceC1073Hk0, "<this>");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a(z, interfaceC4650fm0) : AbstractC5550j00.a(), new b(interfaceC4650fm0, z));
    }

    public static final InterfaceC1073Hk0 c(InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, InterfaceC4650fm0 interfaceC4650fm0) {
        G10.g(interfaceC1073Hk0, "<this>");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new c(z, interfaceC4650fm0) : AbstractC5550j00.a(), new d(z, interfaceC4650fm0));
    }

    public static final InterfaceC1073Hk0 d(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq) {
        return AbstractC5550j00.b(interfaceC1073Hk0, AbstractC5550j00.c() ? new e(nq) : AbstractC5550j00.a(), InterfaceC1073Hk0.m.g(new C0376Au0(nq)));
    }

    /* JADX INFO: renamed from: com.daaw.iO$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC4650fm0 B;
        public final /* synthetic */ boolean C;

        /* JADX INFO: renamed from: com.daaw.iO$b$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC8007rm0 B;
            public final /* synthetic */ InterfaceC4650fm0 C;

            /* JADX INFO: renamed from: com.daaw.iO$b$a$a, reason: collision with other inner class name */
            public static final class C0188a implements InterfaceC8973vC {
                public final /* synthetic */ InterfaceC8007rm0 a;
                public final /* synthetic */ InterfaceC4650fm0 b;

                public C0188a(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
                    this.a = interfaceC8007rm0;
                    this.b = interfaceC4650fm0;
                }

                @Override // com.daaw.InterfaceC8973vC
                public void a() {
                    LN ln = (LN) this.a.getValue();
                    if (ln != null) {
                        MN mn = new MN(ln);
                        InterfaceC4650fm0 interfaceC4650fm0 = this.b;
                        if (interfaceC4650fm0 != null) {
                            interfaceC4650fm0.c(mn);
                        }
                        this.a.setValue(null);
                    }
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
                return new C0188a(this.B, this.C);
            }
        }

        /* JADX INFO: renamed from: com.daaw.iO$b$c */
        public static final class c extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC8007rm0 B;
            public final /* synthetic */ ZN C;

            /* JADX INFO: renamed from: com.daaw.iO$b$c$a */
            public static final class a extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ ZN B;
                public final /* synthetic */ InterfaceC8007rm0 C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(ZN zn, InterfaceC8007rm0 interfaceC8007rm0) {
                    super(0);
                    this.B = zn;
                    this.C = interfaceC8007rm0;
                }

                @Override // com.daaw.LQ
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    this.B.c();
                    return Boolean.valueOf(b.l(this.C));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(InterfaceC8007rm0 interfaceC8007rm0, ZN zn) {
                super(1);
                this.B = interfaceC8007rm0;
                this.C = zn;
            }

            public final void a(CP0 cp0) {
                G10.g(cp0, "$this$semantics");
                AP0.m(cp0, b.l(this.B));
                AP0.k(cp0, null, new a(this.C, this.B), 1, null);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((CP0) obj);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.iO$b$d */
        public static final class d extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC8007rm0 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(InterfaceC8007rm0 interfaceC8007rm0) {
                super(1);
                this.B = interfaceC8007rm0;
            }

            public final void a(InterfaceC10286zu0 interfaceC10286zu0) {
                b.k(this.B, interfaceC10286zu0);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                AbstractC6314li0.a(obj);
                a(null);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.iO$b$e */
        public static final class e extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC7484pt B;
            public final /* synthetic */ InterfaceC8007rm0 C;
            public final /* synthetic */ InterfaceC1368Kg D;
            public final /* synthetic */ InterfaceC8007rm0 E;
            public final /* synthetic */ InterfaceC8007rm0 F;
            public final /* synthetic */ InterfaceC4650fm0 G;

            /* JADX INFO: renamed from: com.daaw.iO$b$e$a */
            public static final class a extends SZ0 implements InterfaceC3429bR {
                public Object F;
                public int G;
                public final /* synthetic */ InterfaceC1368Kg H;
                public final /* synthetic */ InterfaceC8007rm0 I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(InterfaceC1368Kg interfaceC1368Kg, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.H = interfaceC1368Kg;
                    this.I = interfaceC8007rm0;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new a(this.H, this.I, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.G;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        b.a(this.I);
                        InterfaceC1368Kg interfaceC1368Kg = this.H;
                        this.F = null;
                        this.G = 1;
                        if (AbstractC1264Jg.a(interfaceC1368Kg, null, this, 1, null) == objC) {
                            return objC;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC6314li0.a(this.F);
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

            /* JADX INFO: renamed from: com.daaw.iO$b$e$b, reason: collision with other inner class name */
            public static final class C0191b extends SZ0 implements InterfaceC3429bR {
                public Object F;
                public int G;
                public final /* synthetic */ InterfaceC8007rm0 H;
                public final /* synthetic */ InterfaceC4650fm0 I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0191b(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.H = interfaceC8007rm0;
                    this.I = interfaceC4650fm0;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new C0191b(this.H, this.I, interfaceC1416Ks);
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
                @Override // com.daaw.AbstractC7409pe
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object q(java.lang.Object r7) throws java.lang.Throwable {
                    /*
                        r6 = this;
                        java.lang.Object r0 = com.daaw.I10.c()
                        int r1 = r6.G
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L26
                        if (r1 == r3) goto L1e
                        if (r1 != r2) goto L16
                        java.lang.Object r0 = r6.F
                        com.daaw.LN r0 = (com.daaw.LN) r0
                        com.daaw.AbstractC4801gJ0.b(r7)
                        goto L64
                    L16:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1e:
                        java.lang.Object r1 = r6.F
                        com.daaw.rm0 r1 = (com.daaw.InterfaceC8007rm0) r1
                        com.daaw.AbstractC4801gJ0.b(r7)
                        goto L4a
                    L26:
                        com.daaw.AbstractC4801gJ0.b(r7)
                        com.daaw.rm0 r7 = r6.H
                        java.lang.Object r7 = r7.getValue()
                        com.daaw.LN r7 = (com.daaw.LN) r7
                        if (r7 == 0) goto L4f
                        com.daaw.fm0 r1 = r6.I
                        com.daaw.rm0 r4 = r6.H
                        com.daaw.MN r5 = new com.daaw.MN
                        r5.<init>(r7)
                        if (r1 == 0) goto L4b
                        r6.F = r4
                        r6.G = r3
                        java.lang.Object r7 = r1.a(r5, r6)
                        if (r7 != r0) goto L49
                        goto L62
                    L49:
                        r1 = r4
                    L4a:
                        r4 = r1
                    L4b:
                        r7 = 0
                        r4.setValue(r7)
                    L4f:
                        com.daaw.LN r7 = new com.daaw.LN
                        r7.<init>()
                        com.daaw.fm0 r1 = r6.I
                        if (r1 == 0) goto L65
                        r6.F = r7
                        r6.G = r2
                        java.lang.Object r1 = r1.a(r7, r6)
                        if (r1 != r0) goto L63
                    L62:
                        return r0
                    L63:
                        r0 = r7
                    L64:
                        r7 = r0
                    L65:
                        com.daaw.rm0 r0 = r6.H
                        r0.setValue(r7)
                        com.daaw.G91 r7 = com.daaw.G91.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC5378iO.b.e.C0191b.q(java.lang.Object):java.lang.Object");
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((C0191b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX INFO: renamed from: com.daaw.iO$b$e$c */
            public static final class c extends SZ0 implements InterfaceC3429bR {
                public Object F;
                public int G;
                public final /* synthetic */ InterfaceC8007rm0 H;
                public final /* synthetic */ InterfaceC4650fm0 I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.H = interfaceC8007rm0;
                    this.I = interfaceC4650fm0;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new c(this.H, this.I, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    InterfaceC8007rm0 interfaceC8007rm0;
                    InterfaceC8007rm0 interfaceC8007rm02;
                    Object objC = I10.c();
                    int i = this.G;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        LN ln = (LN) this.H.getValue();
                        if (ln != null) {
                            InterfaceC4650fm0 interfaceC4650fm0 = this.I;
                            interfaceC8007rm0 = this.H;
                            MN mn = new MN(ln);
                            if (interfaceC4650fm0 != null) {
                                this.F = interfaceC8007rm0;
                                this.G = 1;
                                if (interfaceC4650fm0.a(mn, this) == objC) {
                                    return objC;
                                }
                                interfaceC8007rm02 = interfaceC8007rm0;
                            }
                            interfaceC8007rm0.setValue(null);
                        }
                        return G91.a;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC8007rm02 = (InterfaceC8007rm0) this.F;
                    AbstractC4801gJ0.b(obj);
                    interfaceC8007rm0 = interfaceC8007rm02;
                    interfaceC8007rm0.setValue(null);
                    return G91.a;
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((c) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(InterfaceC7484pt interfaceC7484pt, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1368Kg interfaceC1368Kg, InterfaceC8007rm0 interfaceC8007rm02, InterfaceC8007rm0 interfaceC8007rm03, InterfaceC4650fm0 interfaceC4650fm0) {
                super(1);
                this.B = interfaceC7484pt;
                this.C = interfaceC8007rm0;
                this.D = interfaceC1368Kg;
                this.E = interfaceC8007rm02;
                this.F = interfaceC8007rm03;
                this.G = interfaceC4650fm0;
            }

            public final void a(InterfaceC3974dO interfaceC3974dO) {
                G10.g(interfaceC3974dO, "it");
                b.n(this.C, interfaceC3974dO.a());
                if (!b.l(this.C)) {
                    AbstractC9104vh.d(this.B, null, null, new c(this.F, this.G, null), 3, null);
                } else {
                    AbstractC9104vh.d(this.B, null, EnumC8599tt.UNDISPATCHED, new a(this.D, this.E, null), 1, null);
                    AbstractC9104vh.d(this.B, null, null, new C0191b(this.F, this.G, null), 3, null);
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC3974dO) obj);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4650fm0 interfaceC4650fm0, boolean z) {
            super(3);
            this.B = interfaceC4650fm0;
            this.C = z;
        }

        public static final /* synthetic */ InterfaceC10286zu0 a(InterfaceC8007rm0 interfaceC8007rm0) {
            j(interfaceC8007rm0);
            return null;
        }

        public static final InterfaceC10286zu0 j(InterfaceC8007rm0 interfaceC8007rm0) {
            AbstractC6314li0.a(interfaceC8007rm0.getValue());
            return null;
        }

        public static final void k(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC10286zu0 interfaceC10286zu0) {
            interfaceC8007rm0.setValue(interfaceC10286zu0);
        }

        public static final boolean l(InterfaceC8007rm0 interfaceC8007rm0) {
            return ((Boolean) interfaceC8007rm0.getValue()).booleanValue();
        }

        public static final void n(InterfaceC8007rm0 interfaceC8007rm0, boolean z) {
            interfaceC8007rm0.setValue(Boolean.valueOf(z));
        }

        public final InterfaceC1073Hk0 i(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            InterfaceC1073Hk0 interfaceC1073Hk0A;
            InterfaceC1073Hk0 interfaceC1073Hk02;
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(1871352361);
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
            interfaceC5781jp.e(-492369756);
            Object objF3 = interfaceC5781jp.f();
            if (objF3 == aVar.a()) {
                objF3 = AbstractC9046vU0.d(null, null, 2, null);
                interfaceC5781jp.H(objF3);
            }
            interfaceC5781jp.L();
            InterfaceC8007rm0 interfaceC8007rm02 = (InterfaceC8007rm0) objF3;
            interfaceC5781jp.e(-492369756);
            Object objF4 = interfaceC5781jp.f();
            if (objF4 == aVar.a()) {
                objF4 = AbstractC9046vU0.d(Boolean.FALSE, null, 2, null);
                interfaceC5781jp.H(objF4);
            }
            interfaceC5781jp.L();
            InterfaceC8007rm0 interfaceC8007rm03 = (InterfaceC8007rm0) objF4;
            interfaceC5781jp.e(-492369756);
            Object objF5 = interfaceC5781jp.f();
            if (objF5 == aVar.a()) {
                objF5 = new ZN();
                interfaceC5781jp.H(objF5);
            }
            interfaceC5781jp.L();
            ZN zn = (ZN) objF5;
            interfaceC5781jp.e(-492369756);
            Object objF6 = interfaceC5781jp.f();
            if (objF6 == aVar.a()) {
                objF6 = AbstractC1575Mg.a();
                interfaceC5781jp.H(objF6);
            }
            interfaceC5781jp.L();
            InterfaceC1368Kg interfaceC1368Kg = (InterfaceC1368Kg) objF6;
            InterfaceC4650fm0 interfaceC4650fm0 = this.B;
            AbstractC8420tF.a(interfaceC4650fm0, new a(interfaceC8007rm0, interfaceC4650fm0), interfaceC5781jp, 0);
            AbstractC8420tF.a(Boolean.valueOf(this.C), new C0189b(this.C, interfaceC7484ptA, interfaceC8007rm0, this.B), interfaceC5781jp, 0);
            if (this.C) {
                if (l(interfaceC8007rm03)) {
                    interfaceC5781jp.e(-492369756);
                    Object objF7 = interfaceC5781jp.f();
                    if (objF7 == aVar.a()) {
                        objF7 = new C5937kO();
                        interfaceC5781jp.H(objF7);
                    }
                    interfaceC5781jp.L();
                    interfaceC1073Hk02 = (InterfaceC1073Hk0) objF7;
                } else {
                    interfaceC1073Hk02 = InterfaceC1073Hk0.m;
                }
                interfaceC1073Hk0A = TN.a(GN.a(AbstractC3417bO.a(AbstractC1575Mg.b(AbstractC5378iO.d(AbstractC8182sP0.b(InterfaceC1073Hk0.m, false, new c(interfaceC8007rm03, zn), 1, null), new d(interfaceC8007rm02)), interfaceC1368Kg), zn).g(interfaceC1073Hk02), new e(interfaceC7484ptA, interfaceC8007rm03, interfaceC1368Kg, interfaceC8007rm02, interfaceC8007rm0, this.B)));
            } else {
                interfaceC1073Hk0A = InterfaceC1073Hk0.m;
            }
            interfaceC5781jp.L();
            return interfaceC1073Hk0A;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return i((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }

        /* JADX INFO: renamed from: com.daaw.iO$b$b, reason: collision with other inner class name */
        public static final class C0189b extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ boolean B;
            public final /* synthetic */ InterfaceC7484pt C;
            public final /* synthetic */ InterfaceC8007rm0 D;
            public final /* synthetic */ InterfaceC4650fm0 E;

            /* JADX INFO: renamed from: com.daaw.iO$b$b$a */
            public static final class a extends SZ0 implements InterfaceC3429bR {
                public Object F;
                public int G;
                public final /* synthetic */ InterfaceC8007rm0 H;
                public final /* synthetic */ InterfaceC4650fm0 I;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.H = interfaceC8007rm0;
                    this.I = interfaceC4650fm0;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new a(this.H, this.I, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    InterfaceC8007rm0 interfaceC8007rm0;
                    InterfaceC8007rm0 interfaceC8007rm02;
                    Object objC = I10.c();
                    int i = this.G;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        LN ln = (LN) this.H.getValue();
                        if (ln != null) {
                            InterfaceC4650fm0 interfaceC4650fm0 = this.I;
                            interfaceC8007rm0 = this.H;
                            MN mn = new MN(ln);
                            if (interfaceC4650fm0 != null) {
                                this.F = interfaceC8007rm0;
                                this.G = 1;
                                if (interfaceC4650fm0.a(mn, this) == objC) {
                                    return objC;
                                }
                                interfaceC8007rm02 = interfaceC8007rm0;
                            }
                            interfaceC8007rm0.setValue(null);
                        }
                        return G91.a;
                    }
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC8007rm02 = (InterfaceC8007rm0) this.F;
                    AbstractC4801gJ0.b(obj);
                    interfaceC8007rm0 = interfaceC8007rm02;
                    interfaceC8007rm0.setValue(null);
                    return G91.a;
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0189b(boolean z, InterfaceC7484pt interfaceC7484pt, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
                super(1);
                this.B = z;
                this.C = interfaceC7484pt;
                this.D = interfaceC8007rm0;
                this.E = interfaceC4650fm0;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC8973vC invoke(C9252wC c9252wC) {
                G10.g(c9252wC, "$this$DisposableEffect");
                if (!this.B) {
                    AbstractC9104vh.d(this.C, null, null, new a(this.D, this.E, null), 3, null);
                }
                return new C0190b();
            }

            /* JADX INFO: renamed from: com.daaw.iO$b$b$b, reason: collision with other inner class name */
            public static final class C0190b implements InterfaceC8973vC {
                @Override // com.daaw.InterfaceC8973vC
                public void a() {
                }
            }
        }
    }
}
