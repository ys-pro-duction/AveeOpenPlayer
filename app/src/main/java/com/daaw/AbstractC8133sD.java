package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.sD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8133sD {
    public static final float a;
    public static final float b;
    public static final float c;

    /* JADX INFO: renamed from: com.daaw.sD$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public /* synthetic */ Object G;
        public int H;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.G = obj;
            this.H |= Integer.MIN_VALUE;
            return AbstractC8133sD.c(null, 0L, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$b */
    public static final class b extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public float I;
        public float J;
        public /* synthetic */ Object K;
        public int L;

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.K = obj;
            this.L |= Integer.MIN_VALUE;
            return AbstractC8133sD.d(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$c */
    public static final class c extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public /* synthetic */ Object G;
        public int H;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.G = obj;
            this.H |= Integer.MIN_VALUE;
            return AbstractC8133sD.e(null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$d */
    public static final class d extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ InterfaceC9740xx0 G;
        public final /* synthetic */ C6748nF0 H;
        public final /* synthetic */ C6748nF0 I;

        /* JADX INFO: renamed from: com.daaw.sD$d$a */
        public static final class a extends AbstractC4233eJ0 implements InterfaceC3429bR {
            public Object D;
            public int E;
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ C6748nF0 H;
            public final /* synthetic */ C6748nF0 I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6748nF0 c6748nF0, C6748nF0 c6748nF02, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = c6748nF0;
                this.I = c6748nF02;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, interfaceC1416Ks);
                aVar.G = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:30:0x009a, code lost:
            
                r2 = 1;
             */
            /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x007b  */
            /* JADX WARN: Removed duplicated region for block: B:34:0x00ac  */
            /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
            /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
            /* JADX WARN: Removed duplicated region for block: B:51:0x0112  */
            /* JADX WARN: Removed duplicated region for block: B:64:0x0143  */
            /* JADX WARN: Removed duplicated region for block: B:66:0x00cd A[EDGE_INSN: B:66:0x00cd->B:41:0x00cd BREAK  A[LOOP:0: B:36:0x00ba->B:40:0x00ca], SYNTHETIC] */
            /* JADX WARN: Removed duplicated region for block: B:70:0x006f A[SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00ac -> B:35:0x00af). Please report as a decompilation issue!!! */
            @Override // com.daaw.AbstractC7409pe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object q(java.lang.Object r17) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 326
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.d.a.q(java.lang.Object):java.lang.Object");
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC9740xx0 interfaceC9740xx0, C6748nF0 c6748nF0, C6748nF0 c6748nF02, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = interfaceC9740xx0;
            this.H = c6748nF0;
            this.I = c6748nF02;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new d(this.G, this.H, this.I, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC9740xx0 interfaceC9740xx0 = this.G;
                a aVar = new a(this.H, this.I, null);
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
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((d) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$e */
    public static final class e extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public float I;
        public float J;
        public /* synthetic */ Object K;
        public int L;

        public e(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.K = obj;
            this.L |= Integer.MIN_VALUE;
            return AbstractC8133sD.f(null, 0L, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$f */
    public static final class f extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ NQ H;
        public final /* synthetic */ LQ I;
        public final /* synthetic */ LQ J;
        public final /* synthetic */ InterfaceC3429bR K;

        /* JADX INFO: renamed from: com.daaw.sD$f$a */
        public static final class a extends AbstractC4233eJ0 implements InterfaceC3429bR {
            public int D;
            public /* synthetic */ Object E;
            public final /* synthetic */ C7223ox0 F;
            public final /* synthetic */ LQ G;
            public final /* synthetic */ LQ H;
            public final /* synthetic */ InterfaceC3429bR I;

            /* JADX INFO: renamed from: com.daaw.sD$f$a$a, reason: collision with other inner class name */
            public static final class C0233a extends AbstractC4192e90 implements NQ {
                public final /* synthetic */ InterfaceC3429bR B;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0233a(InterfaceC3429bR interfaceC3429bR) {
                    super(1);
                    this.B = interfaceC3429bR;
                }

                public final void a(C7223ox0 c7223ox0) {
                    G10.g(c7223ox0, "it");
                    this.B.invoke(c7223ox0, C9982yp0.d(AbstractC4413ex0.g(c7223ox0)));
                    c7223ox0.a();
                }

                @Override // com.daaw.NQ
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C7223ox0) obj);
                    return G91.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C7223ox0 c7223ox0, LQ lq, LQ lq2, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.F = c7223ox0;
                this.G = lq;
                this.H = lq2;
                this.I = interfaceC3429bR;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.F, this.G, this.H, this.I, interfaceC1416Ks);
                aVar.E = obj;
                return aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                InterfaceC2211Sd interfaceC2211Sd;
                Object objC = I10.c();
                int i = this.D;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    InterfaceC2211Sd interfaceC2211Sd2 = (InterfaceC2211Sd) this.E;
                    long jE = this.F.e();
                    C0233a c0233a = new C0233a(this.I);
                    this.E = interfaceC2211Sd2;
                    this.D = 1;
                    Object objH = AbstractC8133sD.h(interfaceC2211Sd2, jE, c0233a, this);
                    if (objH == objC) {
                        return objC;
                    }
                    interfaceC2211Sd = interfaceC2211Sd2;
                    obj = objH;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2211Sd = (InterfaceC2211Sd) this.E;
                    AbstractC4801gJ0.b(obj);
                }
                if (((Boolean) obj).booleanValue()) {
                    List listC = interfaceC2211Sd.v().c();
                    int size = listC.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C7223ox0 c7223ox0 = (C7223ox0) listC.get(i2);
                        if (AbstractC4413ex0.c(c7223ox0)) {
                            c7223ox0.a();
                        }
                    }
                    this.G.invoke();
                } else {
                    this.H.invoke();
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.sD$f$b */
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
                Object objD = Y01.d(interfaceC2211Sd, false, this);
                return objD == objC ? objC : objD;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                return ((b) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(NQ nq, LQ lq, LQ lq2, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = nq;
            this.I = lq;
            this.J = lq2;
            this.K = interfaceC3429bR;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            f fVar = new f(this.H, this.I, this.J, this.K, interfaceC1416Ks);
            fVar.G = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
        
            if (r1.Q(r4, r11) == r0) goto L29;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: CancellationException -> 0x0017, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x0017, blocks: (B:7:0x0012, B:14:0x0027, B:25:0x005a, B:27:0x005f, B:22:0x004f), top: B:34:0x000a }] */
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
                r2 = 0
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L33
                if (r1 == r5) goto L2b
                if (r1 == r4) goto L23
                if (r1 != r3) goto L1b
                com.daaw.AbstractC4801gJ0.b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L83
            L17:
                r0 = move-exception
                r12 = r0
                goto L86
            L1b:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L23:
                java.lang.Object r1 = r11.G
                com.daaw.xx0 r1 = (com.daaw.InterfaceC9740xx0) r1
                com.daaw.AbstractC4801gJ0.b(r12)     // Catch: java.util.concurrent.CancellationException -> L17
                goto L5a
            L2b:
                java.lang.Object r1 = r11.G
                com.daaw.xx0 r1 = (com.daaw.InterfaceC9740xx0) r1
                com.daaw.AbstractC4801gJ0.b(r12)
                goto L4d
            L33:
                com.daaw.AbstractC4801gJ0.b(r12)
                java.lang.Object r12 = r11.G
                com.daaw.xx0 r12 = (com.daaw.InterfaceC9740xx0) r12
                com.daaw.sD$f$b r1 = new com.daaw.sD$f$b
                r1.<init>(r2)
                r11.G = r12
                r11.F = r5
                java.lang.Object r1 = r12.Q(r1, r11)
                if (r1 != r0) goto L4a
                goto L82
            L4a:
                r10 = r1
                r1 = r12
                r12 = r10
            L4d:
                com.daaw.ox0 r12 = (com.daaw.C7223ox0) r12
                r11.G = r1     // Catch: java.util.concurrent.CancellationException -> L17
                r11.F = r4     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = com.daaw.AbstractC8133sD.a(r1, r12, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L5a
                goto L82
            L5a:
                r5 = r12
                com.daaw.ox0 r5 = (com.daaw.C7223ox0) r5     // Catch: java.util.concurrent.CancellationException -> L17
                if (r5 == 0) goto L83
                com.daaw.NQ r12 = r11.H     // Catch: java.util.concurrent.CancellationException -> L17
                long r6 = r5.f()     // Catch: java.util.concurrent.CancellationException -> L17
                com.daaw.yp0 r4 = com.daaw.C9982yp0.d(r6)     // Catch: java.util.concurrent.CancellationException -> L17
                r12.invoke(r4)     // Catch: java.util.concurrent.CancellationException -> L17
                com.daaw.sD$f$a r4 = new com.daaw.sD$f$a     // Catch: java.util.concurrent.CancellationException -> L17
                com.daaw.LQ r6 = r11.J     // Catch: java.util.concurrent.CancellationException -> L17
                com.daaw.LQ r7 = r11.I     // Catch: java.util.concurrent.CancellationException -> L17
                com.daaw.bR r8 = r11.K     // Catch: java.util.concurrent.CancellationException -> L17
                r9 = 0
                r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.util.concurrent.CancellationException -> L17
                r11.G = r2     // Catch: java.util.concurrent.CancellationException -> L17
                r11.F = r3     // Catch: java.util.concurrent.CancellationException -> L17
                java.lang.Object r12 = r1.Q(r4, r11)     // Catch: java.util.concurrent.CancellationException -> L17
                if (r12 != r0) goto L83
            L82:
                return r0
            L83:
                com.daaw.G91 r12 = com.daaw.G91.a
                return r12
            L86:
                com.daaw.LQ r0 = r11.I
                r0.invoke()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.f.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((f) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$g */
    public static final class g extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public /* synthetic */ Object G;
        public int H;

        public g(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.G = obj;
            this.H |= Integer.MIN_VALUE;
            return AbstractC8133sD.h(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$h */
    public static final class h extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public /* synthetic */ Object I;
        public int J;

        public h(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.J |= Integer.MIN_VALUE;
            return AbstractC8133sD.i(null, 0L, null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.sD$i */
    public static final class i extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public /* synthetic */ Object I;
        public int J;

        public i(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.J |= Integer.MIN_VALUE;
            return AbstractC8133sD.l(null, 0L, null, this);
        }
    }

    static {
        float fL = C6460mD.l((float) 0.125d);
        a = fL;
        float fL2 = C6460mD.l(18);
        b = fL2;
        c = fL / fL2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ca, code lost:
    
        if (com.daaw.AbstractC4413ex0.j(r11) != false) goto L47;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0067 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(com.daaw.InterfaceC2211Sd r17, long r18, com.daaw.InterfaceC1416Ks r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.c(com.daaw.Sd, long, com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0123 -> B:50:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0163 -> B:58:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0181 -> B:51:0x012f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(com.daaw.InterfaceC2211Sd r20, long r21, int r23, com.daaw.InterfaceC3429bR r24, com.daaw.InterfaceC1416Ks r25) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.d(com.daaw.Sd, long, int, com.daaw.bR, com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(com.daaw.InterfaceC9740xx0 r8, com.daaw.C7223ox0 r9, com.daaw.InterfaceC1416Ks r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof com.daaw.AbstractC8133sD.c
            if (r0 == 0) goto L13
            r0 = r10
            com.daaw.sD$c r0 = (com.daaw.AbstractC8133sD.c) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            com.daaw.sD$c r0 = new com.daaw.sD$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.G
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.H
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r8 = r0.F
            com.daaw.nF0 r8 = (com.daaw.C6748nF0) r8
            java.lang.Object r9 = r0.E
            com.daaw.ox0 r9 = (com.daaw.C7223ox0) r9
            com.daaw.AbstractC4801gJ0.b(r10)     // Catch: com.daaw.N31 -> L32
            goto L65
        L32:
            goto L68
        L34:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L3c:
            com.daaw.AbstractC4801gJ0.b(r10)
            com.daaw.nF0 r10 = new com.daaw.nF0
            r10.<init>()
            com.daaw.nF0 r2 = new com.daaw.nF0
            r2.<init>()
            r2.B = r9
            com.daaw.Xd1 r5 = r8.getViewConfiguration()
            long r5 = r5.c()
            com.daaw.sD$d r7 = new com.daaw.sD$d     // Catch: com.daaw.N31 -> L66
            r7.<init>(r8, r2, r10, r3)     // Catch: com.daaw.N31 -> L66
            r0.E = r9     // Catch: com.daaw.N31 -> L66
            r0.F = r10     // Catch: com.daaw.N31 -> L66
            r0.H = r4     // Catch: com.daaw.N31 -> L66
            java.lang.Object r8 = com.daaw.P31.c(r5, r7, r0)     // Catch: com.daaw.N31 -> L66
            if (r8 != r1) goto L65
            return r1
        L65:
            return r3
        L66:
            r8 = r10
        L68:
            java.lang.Object r8 = r8.B
            com.daaw.ox0 r8 = (com.daaw.C7223ox0) r8
            if (r8 != 0) goto L6f
            goto L70
        L6f:
            r9 = r8
        L70:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.e(com.daaw.xx0, com.daaw.ox0, com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00e8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x0123 -> B:50:0x012b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x0163 -> B:58:0x0165). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x0181 -> B:51:0x012f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object f(com.daaw.InterfaceC2211Sd r20, long r21, int r23, com.daaw.InterfaceC3429bR r24, com.daaw.InterfaceC1416Ks r25) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.f(com.daaw.Sd, long, int, com.daaw.bR, com.daaw.Ks):java.lang.Object");
    }

    public static final Object g(InterfaceC9740xx0 interfaceC9740xx0, NQ nq, LQ lq, LQ lq2, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        Object objD = WO.d(interfaceC9740xx0, new f(nq, lq2, lq, interfaceC3429bR, null), interfaceC1416Ks);
        return objD == I10.c() ? objD : G91.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0048 -> B:18:0x004b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object h(com.daaw.InterfaceC2211Sd r4, long r5, com.daaw.NQ r7, com.daaw.InterfaceC1416Ks r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof com.daaw.AbstractC8133sD.g
            if (r0 == 0) goto L13
            r0 = r8
            com.daaw.sD$g r0 = (com.daaw.AbstractC8133sD.g) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            com.daaw.sD$g r0 = new com.daaw.sD$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.G
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.H
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.F
            com.daaw.NQ r4 = (com.daaw.NQ) r4
            java.lang.Object r5 = r0.E
            com.daaw.Sd r5 = (com.daaw.InterfaceC2211Sd) r5
            com.daaw.AbstractC4801gJ0.b(r8)
            r7 = r4
            r4 = r5
            goto L4b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            com.daaw.AbstractC4801gJ0.b(r8)
        L3e:
            r0.E = r4
            r0.F = r7
            r0.H = r3
            java.lang.Object r8 = c(r4, r5, r0)
            if (r8 != r1) goto L4b
            return r1
        L4b:
            com.daaw.ox0 r8 = (com.daaw.C7223ox0) r8
            if (r8 != 0) goto L55
            r4 = 0
            java.lang.Boolean r4 = com.daaw.AbstractC0527Cg.a(r4)
            return r4
        L55:
            boolean r5 = com.daaw.AbstractC4413ex0.d(r8)
            if (r5 == 0) goto L60
            java.lang.Boolean r4 = com.daaw.AbstractC0527Cg.a(r3)
            return r4
        L60:
            r7.invoke(r8)
            long r5 = r8.e()
            goto L3e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.h(com.daaw.Sd, long, com.daaw.NQ, com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        if ((com.daaw.C9982yp0.l(com.daaw.AbstractC4413ex0.h(r13)) == 0.0f) == false) goto L52;
     */
    /* JADX WARN: Path cross not found for [B:47:0x00e2, B:36:0x00b9], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:24:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object i(com.daaw.InterfaceC2211Sd r18, long r19, com.daaw.NQ r21, com.daaw.InterfaceC1416Ks r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.i(com.daaw.Sd, long, com.daaw.NQ, com.daaw.Ks):java.lang.Object");
    }

    public static final boolean j(C4134dx0 c4134dx0, long j) {
        Object obj;
        List listC = c4134dx0.c();
        int size = listC.size();
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                obj = null;
                break;
            }
            obj = listC.get(i2);
            if (C6944nx0.d(((C7223ox0) obj).e(), j)) {
                break;
            }
            i2++;
        }
        C7223ox0 c7223ox0 = (C7223ox0) obj;
        if (c7223ox0 != null && c7223ox0.g()) {
            z = true;
        }
        return true ^ z;
    }

    public static final float k(InterfaceC2733Xd1 interfaceC2733Xd1, int i2) {
        G10.g(interfaceC2733Xd1, "$this$pointerSlop");
        return AbstractC10298zx0.g(i2, AbstractC10298zx0.a.b()) ? interfaceC2733Xd1.e() * c : interfaceC2733Xd1.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        if ((com.daaw.C9982yp0.m(com.daaw.AbstractC4413ex0.h(r13)) == 0.0f) == false) goto L52;
     */
    /* JADX WARN: Path cross not found for [B:47:0x00e2, B:36:0x00b9], limit reached: 66 */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00aa A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007d -> B:24:0x0082). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object l(com.daaw.InterfaceC2211Sd r18, long r19, com.daaw.NQ r21, com.daaw.InterfaceC1416Ks r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC8133sD.l(com.daaw.Sd, long, com.daaw.NQ, com.daaw.Ks):java.lang.Object");
    }
}
