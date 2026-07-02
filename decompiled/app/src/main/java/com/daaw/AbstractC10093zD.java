package com.daaw;

import com.daaw.AbstractC7854rD;
import com.daaw.InterfaceC5781jp;

/* JADX INFO: renamed from: com.daaw.zD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10093zD {

    /* JADX INFO: renamed from: com.daaw.zD$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public Object I;
        public /* synthetic */ Object J;
        public int K;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.J = obj;
            this.K |= Integer.MIN_VALUE;
            return AbstractC10093zD.f(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C7963rd1 B;
        public final /* synthetic */ C5902kF0 C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7963rd1 c7963rd1, C5902kF0 c5902kF0) {
            super(2);
            this.B = c7963rd1;
            this.C = c5902kF0;
        }

        public final void a(C7223ox0 c7223ox0, float f) {
            G10.g(c7223ox0, "event");
            AbstractC8800ud1.b(this.B, c7223ox0);
            c7223ox0.a();
            this.C.B = f;
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C7223ox0) obj, ((Number) obj2).floatValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C7963rd1 B;
        public final /* synthetic */ EnumC5792jr0 C;
        public final /* synthetic */ HP0 D;
        public final /* synthetic */ boolean E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C7963rd1 c7963rd1, EnumC5792jr0 enumC5792jr0, HP0 hp0, boolean z) {
            super(1);
            this.B = c7963rd1;
            this.C = enumC5792jr0;
            this.D = hp0;
            this.E = z;
        }

        public final void a(C7223ox0 c7223ox0) {
            G10.g(c7223ox0, "event");
            AbstractC8800ud1.b(this.B, c7223ox0);
            float fK = AbstractC10093zD.k(AbstractC4413ex0.g(c7223ox0), this.C);
            c7223ox0.a();
            HP0 hp0 = this.D;
            if (this.E) {
                fK *= -1;
            }
            hp0.k(new AbstractC7854rD.b(fK, c7223ox0.f(), null));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((C7223ox0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ EnumC5792jr0 C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ InterfaceC4650fm0 F;
        public final /* synthetic */ LQ G;
        public final /* synthetic */ InterfaceC3986dR H;
        public final /* synthetic */ InterfaceC3986dR I;
        public final /* synthetic */ InterfaceC3429bR J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(NQ nq, EnumC5792jr0 enumC5792jr0, boolean z, boolean z2, InterfaceC4650fm0 interfaceC4650fm0, LQ lq, InterfaceC3986dR interfaceC3986dR, InterfaceC3986dR interfaceC3986dR2, InterfaceC3429bR interfaceC3429bR) {
            super(1);
            this.B = nq;
            this.C = enumC5792jr0;
            this.D = z;
            this.E = z2;
            this.F = interfaceC4650fm0;
            this.G = lq;
            this.H = interfaceC3986dR;
            this.I = interfaceC3986dR2;
            this.J = interfaceC3429bR;
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

    /* JADX INFO: renamed from: com.daaw.zD$e */
    public static final class e extends SZ0 implements InterfaceC3986dR {
        public int F;

        public e(InterfaceC1416Ks interfaceC1416Ks) {
            super(3, interfaceC1416Ks);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return u((InterfaceC7484pt) obj, ((C9982yp0) obj2).t(), (InterfaceC1416Ks) obj3);
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

        public final Object u(InterfaceC7484pt interfaceC7484pt, long j, InterfaceC1416Ks interfaceC1416Ks) {
            return new e(interfaceC1416Ks).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$f */
    public static final class f extends SZ0 implements InterfaceC3986dR {
        public int F;

        public f(InterfaceC1416Ks interfaceC1416Ks) {
            super(3, interfaceC1416Ks);
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return u((InterfaceC7484pt) obj, ((Number) obj2).floatValue(), (InterfaceC1416Ks) obj3);
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

        public final Object u(InterfaceC7484pt interfaceC7484pt, float f, InterfaceC1416Ks interfaceC1416Ks) {
            return new f(interfaceC1416Ks).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$g */
    public static final class g extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ BD B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BD bd) {
            super(2);
            this.B = bd;
        }

        public final InterfaceC3578bx0 a(InterfaceC5781jp interfaceC5781jp, int i) {
            interfaceC5781jp.e(830271906);
            BD bd = this.B;
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(bd);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new ZX(bd);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            ZX zx = (ZX) objF;
            interfaceC5781jp.L();
            return zx;
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$h */
    public static final class h extends AbstractC4192e90 implements NQ {
        public static final h B = new h();

        public h() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(C7223ox0 c7223ox0) {
            G10.g(c7223ox0, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$i */
    public static final class i extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ boolean B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(boolean z) {
            super(0);
            this.B = z;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(this.B);
        }
    }

    /* JADX INFO: renamed from: com.daaw.zD$j */
    public static final class j extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC3429bR B;
        public final /* synthetic */ InterfaceC4650fm0 C;
        public final /* synthetic */ LQ D;
        public final /* synthetic */ NQ E;
        public final /* synthetic */ InterfaceC3986dR F;
        public final /* synthetic */ InterfaceC3986dR G;
        public final /* synthetic */ EnumC5792jr0 H;
        public final /* synthetic */ boolean I;
        public final /* synthetic */ boolean J;

        /* JADX INFO: renamed from: com.daaw.zD$j$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC8007rm0 B;
            public final /* synthetic */ InterfaceC4650fm0 C;

            /* JADX INFO: renamed from: com.daaw.zD$j$a$a, reason: collision with other inner class name */
            public static final class C0257a implements InterfaceC8973vC {
                public final /* synthetic */ InterfaceC8007rm0 a;
                public final /* synthetic */ InterfaceC4650fm0 b;

                public C0257a(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
                    this.a = interfaceC8007rm0;
                    this.b = interfaceC4650fm0;
                }

                @Override // com.daaw.InterfaceC8973vC
                public void a() {
                    C8691uD c8691uD = (C8691uD) this.a.getValue();
                    if (c8691uD != null) {
                        InterfaceC4650fm0 interfaceC4650fm0 = this.b;
                        if (interfaceC4650fm0 != null) {
                            interfaceC4650fm0.c(new C8412tD(c8691uD));
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
                return new C0257a(this.B, this.C);
            }
        }

        /* JADX INFO: renamed from: com.daaw.zD$j$b */
        public static final class b extends SZ0 implements InterfaceC3429bR {
            public Object F;
            public Object G;
            public int H;
            public /* synthetic */ Object I;
            public final /* synthetic */ InterfaceC3236ak J;
            public final /* synthetic */ InterfaceC3578bx0 K;
            public final /* synthetic */ InterfaceC6258lW0 L;

            /* JADX INFO: renamed from: com.daaw.zD$j$b$a */
            public static final class a extends SZ0 implements InterfaceC3429bR {
                public Object F;
                public int G;
                public /* synthetic */ Object H;
                public final /* synthetic */ C6748nF0 I;
                public final /* synthetic */ InterfaceC3236ak J;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(C6748nF0 c6748nF0, InterfaceC3236ak interfaceC3236ak, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.I = c6748nF0;
                    this.J = interfaceC3236ak;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    a aVar = new a(this.I, this.J, interfaceC1416Ks);
                    aVar.H = obj;
                    return aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0056 -> B:22:0x0059). Please report as a decompilation issue!!! */
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
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r1 = r6.F
                        com.daaw.nF0 r1 = (com.daaw.C6748nF0) r1
                        java.lang.Object r3 = r6.H
                        com.daaw.ax0 r3 = (com.daaw.InterfaceC3299ax0) r3
                        com.daaw.AbstractC4801gJ0.b(r7)
                        goto L59
                    L17:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r0)
                        throw r7
                    L1f:
                        com.daaw.AbstractC4801gJ0.b(r7)
                        java.lang.Object r7 = r6.H
                        com.daaw.ax0 r7 = (com.daaw.InterfaceC3299ax0) r7
                        r3 = r7
                    L27:
                        com.daaw.nF0 r7 = r6.I
                        java.lang.Object r7 = r7.B
                        boolean r1 = r7 instanceof com.daaw.AbstractC7854rD.d
                        if (r1 != 0) goto L5c
                        boolean r1 = r7 instanceof com.daaw.AbstractC7854rD.a
                        if (r1 != 0) goto L5c
                        boolean r1 = r7 instanceof com.daaw.AbstractC7854rD.b
                        if (r1 == 0) goto L3a
                        com.daaw.rD$b r7 = (com.daaw.AbstractC7854rD.b) r7
                        goto L3b
                    L3a:
                        r7 = 0
                    L3b:
                        if (r7 == 0) goto L48
                        float r1 = r7.a()
                        long r4 = r7.b()
                        r3.b(r1, r4)
                    L48:
                        com.daaw.nF0 r1 = r6.I
                        com.daaw.ak r7 = r6.J
                        r6.H = r3
                        r6.F = r1
                        r6.G = r2
                        java.lang.Object r7 = r7.b(r6)
                        if (r7 != r0) goto L59
                        return r0
                    L59:
                        r1.B = r7
                        goto L27
                    L5c:
                        com.daaw.G91 r7 = com.daaw.G91.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10093zD.j.b.a.q(java.lang.Object):java.lang.Object");
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC3299ax0 interfaceC3299ax0, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((a) a(interfaceC3299ax0, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC3236ak interfaceC3236ak, InterfaceC3578bx0 interfaceC3578bx0, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.J = interfaceC3236ak;
                this.K = interfaceC3578bx0;
                this.L = interfaceC6258lW0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                b bVar = new b(this.J, this.K, this.L, interfaceC1416Ks);
                bVar.I = obj;
                return bVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:44:0x00ec, code lost:
            
                if (r8.a(r3, r7) == r0) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0103, code lost:
            
                if (r8.a(r1, r7) == r0) goto L49;
             */
            /* JADX WARN: Code restructure failed: missing block: B:57:0x00db, code lost:
            
                r1 = r3;
             */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0089  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00bd  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00be A[Catch: CancellationException -> 0x0039, PHI: r1 r3
  0x00be: PHI (r1v14 com.daaw.nF0) = (r1v6 com.daaw.nF0), (r1v21 com.daaw.nF0) binds: [B:13:0x0034, B:32:0x00bb] A[DONT_GENERATE, DONT_INLINE]
  0x00be: PHI (r3v8 com.daaw.pt) = (r3v5 com.daaw.pt), (r3v9 com.daaw.pt) binds: [B:13:0x0034, B:32:0x00bb] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {CancellationException -> 0x0039, blocks: (B:31:0x00a5, B:34:0x00be, B:36:0x00ca, B:41:0x00dd, B:43:0x00e1, B:13:0x0034), top: B:53:0x0034 }] */
            /* JADX WARN: Removed duplicated region for block: B:36:0x00ca A[Catch: CancellationException -> 0x0039, TryCatch #0 {CancellationException -> 0x0039, blocks: (B:31:0x00a5, B:34:0x00be, B:36:0x00ca, B:41:0x00dd, B:43:0x00e1, B:13:0x0034), top: B:53:0x0034 }] */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00dd A[Catch: CancellationException -> 0x0039, TryCatch #0 {CancellationException -> 0x0039, blocks: (B:31:0x00a5, B:34:0x00be, B:36:0x00ca, B:41:0x00dd, B:43:0x00e1, B:13:0x0034), top: B:53:0x0034 }] */
            /* JADX WARN: Removed duplicated region for block: B:50:0x0106  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0109  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ef -> B:19:0x0060). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0103 -> B:40:0x00db). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:50:0x0106 -> B:19:0x0060). Please report as a decompilation issue!!! */
            @Override // com.daaw.AbstractC7409pe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object q(java.lang.Object r8) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 286
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10093zD.j.b.q(java.lang.Object):java.lang.Object");
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.zD$j$c */
        public static final class c extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ boolean H;
            public final /* synthetic */ InterfaceC6258lW0 I;
            public final /* synthetic */ InterfaceC6258lW0 J;
            public final /* synthetic */ EnumC5792jr0 K;
            public final /* synthetic */ InterfaceC3236ak L;
            public final /* synthetic */ boolean M;

            /* JADX INFO: renamed from: com.daaw.zD$j$c$a */
            public static final class a extends SZ0 implements InterfaceC3429bR {
                public int F;
                public /* synthetic */ Object G;
                public final /* synthetic */ InterfaceC9740xx0 H;
                public final /* synthetic */ InterfaceC6258lW0 I;
                public final /* synthetic */ InterfaceC6258lW0 J;
                public final /* synthetic */ EnumC5792jr0 K;
                public final /* synthetic */ InterfaceC3236ak L;
                public final /* synthetic */ boolean M;

                /* JADX INFO: renamed from: com.daaw.zD$j$c$a$a, reason: collision with other inner class name */
                public static final class C0258a extends AbstractC4233eJ0 implements InterfaceC3429bR {
                    public Object D;
                    public Object E;
                    public Object F;
                    public Object G;
                    public boolean H;
                    public int I;
                    public int J;
                    public /* synthetic */ Object K;
                    public final /* synthetic */ InterfaceC7484pt L;
                    public final /* synthetic */ InterfaceC6258lW0 M;
                    public final /* synthetic */ InterfaceC6258lW0 N;
                    public final /* synthetic */ EnumC5792jr0 O;
                    public final /* synthetic */ InterfaceC3236ak P;
                    public final /* synthetic */ boolean Q;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0258a(InterfaceC7484pt interfaceC7484pt, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, EnumC5792jr0 enumC5792jr0, InterfaceC3236ak interfaceC3236ak, boolean z, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.L = interfaceC7484pt;
                        this.M = interfaceC6258lW0;
                        this.N = interfaceC6258lW02;
                        this.O = enumC5792jr0;
                        this.P = interfaceC3236ak;
                        this.Q = z;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        C0258a c0258a = new C0258a(this.L, this.M, this.N, this.O, this.P, this.Q, interfaceC1416Ks);
                        c0258a.K = obj;
                        return c0258a;
                    }

                    /* JADX WARN: Can't wrap try/catch for region: R(7:25|(1:71)|26|27|73|28|(7:31|32|(0)(0)|40|41|17|(2:65|66)(0))) */
                    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d7, code lost:
                    
                        r0 = th;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d8, code lost:
                    
                        r2 = r6;
                        r6 = r4;
                        r4 = r2;
                        r7 = r3;
                        r2 = r5;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:44:0x00de, code lost:
                    
                        r0 = e;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
                    
                        r2 = r6;
                        r6 = r4;
                        r4 = r2;
                        r7 = r3;
                        r2 = r5;
                        r3 = r13;
                        r13 = r1;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:19:0x0060  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
                    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
                    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
                    /* JADX WARN: Removed duplicated region for block: B:52:0x00f6  */
                    /* JADX WARN: Removed duplicated region for block: B:53:0x00fc A[Catch: all -> 0x00fd, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00fd, blocks: (B:50:0x00f0, B:53:0x00fc), top: B:67:0x00f0 }] */
                    /* JADX WARN: Removed duplicated region for block: B:56:0x0100  */
                    /* JADX WARN: Removed duplicated region for block: B:61:0x0115  */
                    /* JADX WARN: Removed duplicated region for block: B:64:0x011b  */
                    /* JADX WARN: Removed duplicated region for block: B:65:0x011f  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00aa -> B:32:0x00b2). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x00f6 -> B:41:0x00d5). Please report as a decompilation issue!!! */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x011b -> B:17:0x0058). Please report as a decompilation issue!!! */
                    @Override // com.daaw.AbstractC7409pe
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object q(java.lang.Object r15) throws java.lang.Throwable {
                        /*
                            Method dump skipped, instruction units count: 290
                            To view this dump change 'Code comments level' option to 'DEBUG'
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10093zD.j.c.a.C0258a.q(java.lang.Object):java.lang.Object");
                    }

                    @Override // com.daaw.InterfaceC3429bR
                    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                        return ((C0258a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, EnumC5792jr0 enumC5792jr0, InterfaceC3236ak interfaceC3236ak, boolean z, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.H = interfaceC9740xx0;
                    this.I = interfaceC6258lW0;
                    this.J = interfaceC6258lW02;
                    this.K = enumC5792jr0;
                    this.L = interfaceC3236ak;
                    this.M = z;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    a aVar = new a(this.H, this.I, this.J, this.K, this.L, this.M, interfaceC1416Ks);
                    aVar.G = obj;
                    return aVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
                @Override // com.daaw.AbstractC7409pe
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object q(java.lang.Object r12) throws java.lang.Throwable {
                    /*
                        r11 = this;
                        java.lang.Object r0 = com.daaw.I10.c()
                        int r1 = r11.F
                        r2 = 1
                        if (r1 == 0) goto L1f
                        if (r1 != r2) goto L17
                        java.lang.Object r0 = r11.G
                        r1 = r0
                        com.daaw.pt r1 = (com.daaw.InterfaceC7484pt) r1
                        com.daaw.AbstractC4801gJ0.b(r12)     // Catch: java.util.concurrent.CancellationException -> L14
                        goto L4d
                    L14:
                        r0 = move-exception
                        r12 = r0
                        goto L47
                    L17:
                        java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r12.<init>(r0)
                        throw r12
                    L1f:
                        com.daaw.AbstractC4801gJ0.b(r12)
                        java.lang.Object r12 = r11.G
                        r4 = r12
                        com.daaw.pt r4 = (com.daaw.InterfaceC7484pt) r4
                        com.daaw.xx0 r12 = r11.H     // Catch: java.util.concurrent.CancellationException -> L44
                        com.daaw.zD$j$c$a$a r3 = new com.daaw.zD$j$c$a$a     // Catch: java.util.concurrent.CancellationException -> L44
                        com.daaw.lW0 r5 = r11.I     // Catch: java.util.concurrent.CancellationException -> L44
                        com.daaw.lW0 r6 = r11.J     // Catch: java.util.concurrent.CancellationException -> L44
                        com.daaw.jr0 r7 = r11.K     // Catch: java.util.concurrent.CancellationException -> L44
                        com.daaw.ak r8 = r11.L     // Catch: java.util.concurrent.CancellationException -> L44
                        boolean r9 = r11.M     // Catch: java.util.concurrent.CancellationException -> L44
                        r10 = 0
                        r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.util.concurrent.CancellationException -> L44
                        r11.G = r4     // Catch: java.util.concurrent.CancellationException -> L44
                        r11.F = r2     // Catch: java.util.concurrent.CancellationException -> L44
                        java.lang.Object r12 = r12.Q(r3, r11)     // Catch: java.util.concurrent.CancellationException -> L44
                        if (r12 != r0) goto L4d
                        return r0
                    L44:
                        r0 = move-exception
                        r12 = r0
                        r1 = r4
                    L47:
                        boolean r0 = com.daaw.AbstractC7763qt.f(r1)
                        if (r0 == 0) goto L50
                    L4d:
                        com.daaw.G91 r12 = com.daaw.G91.a
                        return r12
                    L50:
                        throw r12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10093zD.j.c.a.q(java.lang.Object):java.lang.Object");
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, EnumC5792jr0 enumC5792jr0, InterfaceC3236ak interfaceC3236ak, boolean z2, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = z;
                this.I = interfaceC6258lW0;
                this.J = interfaceC6258lW02;
                this.K = enumC5792jr0;
                this.L = interfaceC3236ak;
                this.M = z2;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                c cVar = new c(this.H, this.I, this.J, this.K, this.L, this.M, interfaceC1416Ks);
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
                    if (!this.H) {
                        return G91.a;
                    }
                    a aVar = new a(interfaceC9740xx0, this.I, this.J, this.K, this.L, this.M, null);
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
                return ((c) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC3429bR interfaceC3429bR, InterfaceC4650fm0 interfaceC4650fm0, LQ lq, NQ nq, InterfaceC3986dR interfaceC3986dR, InterfaceC3986dR interfaceC3986dR2, EnumC5792jr0 enumC5792jr0, boolean z, boolean z2) {
            super(3);
            this.B = interfaceC3429bR;
            this.C = interfaceC4650fm0;
            this.D = lq;
            this.E = nq;
            this.F = interfaceC3986dR;
            this.G = interfaceC3986dR2;
            this.H = enumC5792jr0;
            this.I = z;
            this.J = z2;
        }

        public static final C9256wD d(InterfaceC6258lW0 interfaceC6258lW0) {
            return (C9256wD) interfaceC6258lW0.getValue();
        }

        public final InterfaceC1073Hk0 c(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-1487259950);
            InterfaceC3578bx0 interfaceC3578bx0 = (InterfaceC3578bx0) this.B.invoke(interfaceC5781jp, 0);
            interfaceC5781jp.e(-492369756);
            Object objF = interfaceC5781jp.f();
            InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
            if (objF == aVar.a()) {
                objF = AbstractC9046vU0.d(null, null, 2, null);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
            InterfaceC4650fm0 interfaceC4650fm0 = this.C;
            AbstractC8420tF.a(interfaceC4650fm0, new a(interfaceC8007rm0, interfaceC4650fm0), interfaceC5781jp, 0);
            interfaceC5781jp.e(-492369756);
            Object objF2 = interfaceC5781jp.f();
            if (objF2 == aVar.a()) {
                objF2 = AbstractC6035kk.b(Integer.MAX_VALUE, null, null, 6, null);
                interfaceC5781jp.H(objF2);
            }
            interfaceC5781jp.L();
            InterfaceC3236ak interfaceC3236ak = (InterfaceC3236ak) objF2;
            InterfaceC6258lW0 interfaceC6258lW0I = AbstractC7923rU0.i(this.D, interfaceC5781jp, 0);
            InterfaceC6258lW0 interfaceC6258lW0I2 = AbstractC7923rU0.i(this.E, interfaceC5781jp, 0);
            AbstractC8420tF.c(interfaceC3578bx0, new b(interfaceC3236ak, interfaceC3578bx0, AbstractC7923rU0.i(new C9256wD(this.F, this.G, interfaceC8007rm0, this.C), interfaceC5781jp, 0), null), interfaceC5781jp, 0);
            InterfaceC1073Hk0 interfaceC1073Hk0D = UZ0.d(InterfaceC1073Hk0.m, new Object[]{this.H, Boolean.valueOf(this.I), Boolean.valueOf(this.J)}, new c(this.I, interfaceC6258lW0I2, interfaceC6258lW0I, this.H, interfaceC3236ak, this.J, null));
            interfaceC5781jp.L();
            return interfaceC1073Hk0D;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final BD a(NQ nq) {
        G10.g(nq, "onDelta");
        return new C4133dx(nq);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0136 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(com.daaw.InterfaceC2211Sd r9, com.daaw.InterfaceC6258lW0 r10, com.daaw.InterfaceC6258lW0 r11, com.daaw.C7963rd1 r12, com.daaw.EnumC5792jr0 r13, com.daaw.InterfaceC1416Ks r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC10093zD.f(com.daaw.Sd, com.daaw.lW0, com.daaw.lW0, com.daaw.rd1, com.daaw.jr0, com.daaw.Ks):java.lang.Object");
    }

    public static final Object g(InterfaceC2211Sd interfaceC2211Sd, C0576Cs0 c0576Cs0, C7963rd1 c7963rd1, HP0 hp0, boolean z, EnumC5792jr0 enumC5792jr0, InterfaceC1416Ks interfaceC1416Ks) {
        float fFloatValue = ((Number) c0576Cs0.d()).floatValue();
        C7223ox0 c7223ox0 = (C7223ox0) c0576Cs0.c();
        long jP = C9982yp0.p(c7223ox0.f(), C9982yp0.r(m(fFloatValue, enumC5792jr0), Math.signum(k(c7223ox0.f(), enumC5792jr0))));
        hp0.k(new AbstractC7854rD.c(jP, null));
        if (z) {
            fFloatValue *= -1;
        }
        hp0.k(new AbstractC7854rD.b(fFloatValue, jP, null));
        c cVar = new c(c7963rd1, enumC5792jr0, hp0, z);
        return enumC5792jr0 == EnumC5792jr0.Vertical ? AbstractC8133sD.l(interfaceC2211Sd, c7223ox0.e(), cVar, interfaceC1416Ks) : AbstractC8133sD.i(interfaceC2211Sd, c7223ox0.e(), cVar, interfaceC1416Ks);
    }

    public static final InterfaceC1073Hk0 h(InterfaceC1073Hk0 interfaceC1073Hk0, BD bd, EnumC5792jr0 enumC5792jr0, boolean z, InterfaceC4650fm0 interfaceC4650fm0, boolean z2, InterfaceC3986dR interfaceC3986dR, InterfaceC3986dR interfaceC3986dR2, boolean z3) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(bd, "state");
        G10.g(enumC5792jr0, "orientation");
        G10.g(interfaceC3986dR, "onDragStarted");
        G10.g(interfaceC3986dR2, "onDragStopped");
        return i(interfaceC1073Hk0, new g(bd), h.B, enumC5792jr0, z, interfaceC4650fm0, new i(z2), interfaceC3986dR, interfaceC3986dR2, z3);
    }

    public static final InterfaceC1073Hk0 i(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC3429bR interfaceC3429bR, NQ nq, EnumC5792jr0 enumC5792jr0, boolean z, InterfaceC4650fm0 interfaceC4650fm0, LQ lq, InterfaceC3986dR interfaceC3986dR, InterfaceC3986dR interfaceC3986dR2, boolean z2) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(interfaceC3429bR, "stateFactory");
        G10.g(nq, "canDrag");
        G10.g(enumC5792jr0, "orientation");
        G10.g(lq, "startDragImmediately");
        G10.g(interfaceC3986dR, "onDragStarted");
        G10.g(interfaceC3986dR2, "onDragStopped");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new d(nq, enumC5792jr0, z, z2, interfaceC4650fm0, lq, interfaceC3986dR, interfaceC3986dR2, interfaceC3429bR) : AbstractC5550j00.a(), new j(interfaceC3429bR, interfaceC4650fm0, lq, nq, interfaceC3986dR, interfaceC3986dR2, enumC5792jr0, z, z2));
    }

    public static final float k(long j2, EnumC5792jr0 enumC5792jr0) {
        return enumC5792jr0 == EnumC5792jr0.Vertical ? C9982yp0.m(j2) : C9982yp0.l(j2);
    }

    public static final float l(long j2, EnumC5792jr0 enumC5792jr0) {
        return enumC5792jr0 == EnumC5792jr0.Vertical ? AbstractC7127od1.c(j2) : AbstractC7127od1.b(j2);
    }

    public static final long m(float f2, EnumC5792jr0 enumC5792jr0) {
        return enumC5792jr0 == EnumC5792jr0.Vertical ? AbstractC0460Bp0.a(0.0f, f2) : AbstractC0460Bp0.a(f2, 0.0f);
    }
}
