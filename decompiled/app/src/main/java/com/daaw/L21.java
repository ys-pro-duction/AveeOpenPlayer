package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class L21 {

    public static final class a extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int G;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.G |= Integer.MIN_VALUE;
            return L21.b(null, this);
        }
    }

    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ InterfaceC0340Al0 H;

        public static final class a extends AbstractC4233eJ0 implements InterfaceC3429bR {
            public Object D;
            public int E;
            public /* synthetic */ Object F;
            public final /* synthetic */ InterfaceC0340Al0 G;

            /* JADX INFO: renamed from: com.daaw.L21$b$a$a, reason: collision with other inner class name */
            public static final class C0090a extends AbstractC4192e90 implements NQ {
                public final /* synthetic */ InterfaceC0340Al0 B;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0090a(InterfaceC0340Al0 interfaceC0340Al0) {
                    super(1);
                    this.B = interfaceC0340Al0;
                }

                public final void a(C7223ox0 c7223ox0) {
                    G10.g(c7223ox0, "it");
                    if (this.B.a(c7223ox0.f())) {
                        c7223ox0.a();
                    }
                }

                @Override // com.daaw.NQ
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C7223ox0) obj);
                    return G91.a;
                }
            }

            /* JADX INFO: renamed from: com.daaw.L21$b$a$b, reason: collision with other inner class name */
            public static final class C0091b extends AbstractC4192e90 implements NQ {
                public final /* synthetic */ InterfaceC0340Al0 B;
                public final /* synthetic */ InterfaceC5663jP0 C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0091b(InterfaceC0340Al0 interfaceC0340Al0, InterfaceC5663jP0 interfaceC5663jP0) {
                    super(1);
                    this.B = interfaceC0340Al0;
                    this.C = interfaceC5663jP0;
                }

                public final void a(C7223ox0 c7223ox0) {
                    G10.g(c7223ox0, "it");
                    if (this.B.c(c7223ox0.f(), this.C)) {
                        c7223ox0.a();
                    }
                }

                @Override // com.daaw.NQ
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a((C7223ox0) obj);
                    return G91.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC0340Al0 interfaceC0340Al0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = interfaceC0340Al0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.G, interfaceC1416Ks);
                aVar.F = obj;
                return aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
            
                if (com.daaw.AbstractC8133sD.h(r5, r6, r12, r11) == r0) goto L34;
             */
            /* JADX WARN: Code restructure failed: missing block: B:33:0x00d1, code lost:
            
                if (com.daaw.AbstractC8133sD.h(r5, r6, r8, r11) == r0) goto L34;
             */
            /* JADX WARN: Removed duplicated region for block: B:16:0x0051  */
            /* JADX WARN: Removed duplicated region for block: B:19:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0091  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0074 -> B:35:0x00d4). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008e -> B:35:0x00d4). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00b7 -> B:35:0x00d4). Please report as a decompilation issue!!! */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00d1 -> B:35:0x00d4). Please report as a decompilation issue!!! */
            @Override // com.daaw.AbstractC7409pe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object q(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 215
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.L21.b.a.q(java.lang.Object):java.lang.Object");
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2211Sd interfaceC2211Sd, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC2211Sd, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC0340Al0 interfaceC0340Al0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = interfaceC0340Al0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            b bVar = new b(this.H, interfaceC1416Ks);
            bVar.G = obj;
            return bVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC9740xx0 interfaceC9740xx0 = (InterfaceC9740xx0) this.G;
                a aVar = new a(this.H, null);
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
            return ((b) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
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
    public static final java.lang.Object b(com.daaw.InterfaceC2211Sd r9, com.daaw.InterfaceC1416Ks r10) throws java.lang.Throwable {
        /*
            boolean r0 = r10 instanceof com.daaw.L21.a
            if (r0 == 0) goto L13
            r0 = r10
            com.daaw.L21$a r0 = (com.daaw.L21.a) r0
            int r1 = r0.G
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.G = r1
            goto L18
        L13:
            com.daaw.L21$a r0 = new com.daaw.L21$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.G
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r9 = r0.E
            com.daaw.Sd r9 = (com.daaw.InterfaceC2211Sd) r9
            com.daaw.AbstractC4801gJ0.b(r10)
            goto L45
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L35:
            com.daaw.AbstractC4801gJ0.b(r10)
        L38:
            com.daaw.fx0 r10 = com.daaw.EnumC4702fx0.Main
            r0.E = r9
            r0.G = r3
            java.lang.Object r10 = r9.c0(r10, r0)
            if (r10 != r1) goto L45
            return r1
        L45:
            com.daaw.dx0 r10 = (com.daaw.C4134dx0) r10
            int r2 = r10.b()
            boolean r2 = com.daaw.AbstractC5537ix0.a(r2)
            if (r2 == 0) goto L38
            java.util.List r2 = r10.c()
            int r4 = r2.size()
            r5 = 0
        L5a:
            if (r5 >= r4) goto L7b
            java.lang.Object r6 = r2.get(r5)
            com.daaw.ox0 r6 = (com.daaw.C7223ox0) r6
            int r7 = r6.j()
            com.daaw.zx0$a r8 = com.daaw.AbstractC10298zx0.a
            int r8 = r8.b()
            boolean r7 = com.daaw.AbstractC10298zx0.g(r7, r8)
            if (r7 == 0) goto L38
            boolean r6 = com.daaw.AbstractC4413ex0.a(r6)
            if (r6 == 0) goto L38
            int r5 = r5 + 1
            goto L5a
        L7b:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.L21.b(com.daaw.Sd, com.daaw.Ks):java.lang.Object");
    }

    public static final Object c(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC0340Al0 interfaceC0340Al0, InterfaceC1416Ks interfaceC1416Ks) {
        Object objD = WO.d(interfaceC9740xx0, new b(interfaceC0340Al0, null), interfaceC1416Ks);
        return objD == I10.c() ? objD : G91.a;
    }
}
