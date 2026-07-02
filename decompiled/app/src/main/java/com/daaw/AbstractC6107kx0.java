package com.daaw;

/* JADX INFO: renamed from: com.daaw.kx0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6107kx0 {

    /* JADX INFO: renamed from: com.daaw.kx0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC5819jx0 B;
        public final /* synthetic */ boolean C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5819jx0 interfaceC5819jx0, boolean z) {
            super(1);
            this.B = interfaceC5819jx0;
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

    /* JADX INFO: renamed from: com.daaw.kx0$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC5819jx0 B;
        public final /* synthetic */ boolean C;

        /* JADX INFO: renamed from: com.daaw.kx0$b$a */
        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ boolean H;
            public final /* synthetic */ InterfaceC6386lx0 I;
            public final /* synthetic */ InterfaceC5819jx0 J;

            /* JADX INFO: renamed from: com.daaw.kx0$b$a$a, reason: collision with other inner class name */
            public static final class C0202a extends AbstractC4233eJ0 implements InterfaceC3429bR {
                public int D;
                public /* synthetic */ Object E;
                public final /* synthetic */ boolean F;
                public final /* synthetic */ InterfaceC6386lx0 G;
                public final /* synthetic */ InterfaceC5819jx0 H;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0202a(boolean z, InterfaceC6386lx0 interfaceC6386lx0, InterfaceC5819jx0 interfaceC5819jx0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.F = z;
                    this.G = interfaceC6386lx0;
                    this.H = interfaceC5819jx0;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    C0202a c0202a = new C0202a(this.F, this.G, this.H, interfaceC1416Ks);
                    c0202a.E = obj;
                    return c0202a;
                }

                /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
                /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
                /* JADX WARN: Removed duplicated region for block: B:15:0x0036 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:18:0x004a  */
                /* JADX WARN: Removed duplicated region for block: B:23:0x0073 A[ADDED_TO_REGION] */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0034 -> B:16:0x0037). Please report as a decompilation issue!!! */
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
                public final java.lang.Object q(java.lang.Object r11) {
                    /*
                        r10 = this;
                        java.lang.Object r0 = com.daaw.I10.c()
                        int r1 = r10.D
                        r2 = 1
                        if (r1 == 0) goto L1b
                        if (r1 != r2) goto L13
                        java.lang.Object r1 = r10.E
                        com.daaw.Sd r1 = (com.daaw.InterfaceC2211Sd) r1
                        com.daaw.AbstractC4801gJ0.b(r11)
                        goto L37
                    L13:
                        java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r11.<init>(r0)
                        throw r11
                    L1b:
                        com.daaw.AbstractC4801gJ0.b(r11)
                        java.lang.Object r11 = r10.E
                        com.daaw.Sd r11 = (com.daaw.InterfaceC2211Sd) r11
                        r1 = r11
                    L23:
                        boolean r11 = r10.F
                        if (r11 == 0) goto L2a
                        com.daaw.fx0 r11 = com.daaw.EnumC4702fx0.Main
                        goto L2c
                    L2a:
                        com.daaw.fx0 r11 = com.daaw.EnumC4702fx0.Initial
                    L2c:
                        r10.E = r1
                        r10.D = r2
                        java.lang.Object r11 = r1.c0(r11, r10)
                        if (r11 != r0) goto L37
                        return r0
                    L37:
                        com.daaw.dx0 r11 = (com.daaw.C4134dx0) r11
                        int r3 = r11.e()
                        com.daaw.hx0$a r4 = com.daaw.AbstractC5260hx0.a
                        int r5 = r4.e()
                        boolean r3 = com.daaw.AbstractC5260hx0.i(r3, r5)
                        r5 = 0
                        if (r3 == 0) goto L65
                        java.util.List r3 = r11.c()
                        java.lang.Object r3 = r3.get(r5)
                        com.daaw.ox0 r3 = (com.daaw.C7223ox0) r3
                        long r6 = r1.d()
                        com.daaw.yT0$a r8 = com.daaw.C9879yT0.b
                        long r8 = r8.b()
                        boolean r3 = com.daaw.AbstractC4413ex0.f(r3, r6, r8)
                        if (r3 == 0) goto L65
                        r5 = 1
                    L65:
                        int r11 = r11.e()
                        int r3 = r4.b()
                        boolean r11 = com.daaw.AbstractC5260hx0.i(r11, r3)
                        if (r11 != 0) goto L23
                        if (r5 != 0) goto L23
                        com.daaw.lx0 r11 = r10.G
                        com.daaw.jx0 r3 = r10.H
                        r11.a(r3)
                        goto L23
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6107kx0.b.a.C0202a.q(java.lang.Object):java.lang.Object");
                }

                @Override // com.daaw.InterfaceC3429bR
                /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
                public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                    return ((C0202a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(boolean z, InterfaceC6386lx0 interfaceC6386lx0, InterfaceC5819jx0 interfaceC5819jx0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = z;
                this.I = interfaceC6386lx0;
                this.J = interfaceC5819jx0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, this.J, interfaceC1416Ks);
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
                    C0202a c0202a = new C0202a(this.H, this.I, this.J, null);
                    this.F = 1;
                    if (interfaceC9740xx0.Q(c0202a, this) == objC) {
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
        public b(InterfaceC5819jx0 interfaceC5819jx0, boolean z) {
            super(3);
            this.B = interfaceC5819jx0;
            this.C = z;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(811087536);
            InterfaceC6386lx0 interfaceC6386lx0 = (InterfaceC6386lx0) interfaceC5781jp.O(AbstractC2259Sp.h());
            InterfaceC1073Hk0 interfaceC1073Hk0C = interfaceC6386lx0 == null ? InterfaceC1073Hk0.m : UZ0.c(interfaceC1073Hk0, this.B, Boolean.valueOf(this.C), new a(this.C, interfaceC6386lx0, this.B, null));
            interfaceC5781jp.L();
            return interfaceC1073Hk0C;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5819jx0 interfaceC5819jx0, boolean z) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(interfaceC5819jx0, "icon");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a(interfaceC5819jx0, z) : AbstractC5550j00.a(), new b(interfaceC5819jx0, z));
    }

    public static /* synthetic */ InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5819jx0 interfaceC5819jx0, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return a(interfaceC1073Hk0, interfaceC5819jx0, z);
    }
}
