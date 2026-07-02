package com.daaw;

import java.util.List;

/* JADX INFO: renamed from: com.daaw.ub, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8788ub implements InterfaceC6258lW0 {
    public final List B;
    public final C3636c91 C;
    public final C0611Db D;
    public final NQ E;
    public final InterfaceC2592Vu0 F;
    public final InterfaceC8007rm0 G;
    public boolean H;

    /* JADX INFO: renamed from: com.daaw.ub$a */
    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public int H;
        public int I;
        public /* synthetic */ Object J;
        public int L;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.J = obj;
            this.L |= Integer.MIN_VALUE;
            return C8788ub.this.o(this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ub$b */
    public static final class b extends SZ0 implements NQ {
        public int F;
        public final /* synthetic */ InterfaceC6225lO H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC6225lO interfaceC6225lO, InterfaceC1416Ks interfaceC1416Ks) {
            super(1, interfaceC1416Ks);
            this.H = interfaceC6225lO;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
                return obj;
            }
            AbstractC4801gJ0.b(obj);
            C8788ub c8788ub = C8788ub.this;
            InterfaceC6225lO interfaceC6225lO = this.H;
            this.F = 1;
            Object objP = c8788ub.p(interfaceC6225lO, this);
            return objP == objC ? objC : objP;
        }

        public final InterfaceC1416Ks u(InterfaceC1416Ks interfaceC1416Ks) {
            return C8788ub.this.new b(this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) u(interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ub$c */
    public static final class c extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int H;

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.H |= Integer.MIN_VALUE;
            return C8788ub.this.p(null, this);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ub$d */
    public static final class d extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ InterfaceC6225lO H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC6225lO interfaceC6225lO, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = interfaceC6225lO;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return C8788ub.this.new d(this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
                return obj;
            }
            AbstractC4801gJ0.b(obj);
            InterfaceC2592Vu0 interfaceC2592Vu0 = C8788ub.this.F;
            InterfaceC6225lO interfaceC6225lO = this.H;
            this.F = 1;
            Object objA = interfaceC2592Vu0.a(interfaceC6225lO, this);
            return objA == objC ? objC : objA;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((d) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public C8788ub(List list, Object obj, C3636c91 c3636c91, C0611Db c0611Db, NQ nq, InterfaceC2592Vu0 interfaceC2592Vu0) {
        G10.g(list, "fontList");
        G10.g(obj, "initialType");
        G10.g(c3636c91, "typefaceRequest");
        G10.g(c0611Db, "asyncTypefaceCache");
        G10.g(nq, "onCompletion");
        G10.g(interfaceC2592Vu0, "platformFontLoader");
        this.B = list;
        this.C = c3636c91;
        this.D = c0611Db;
        this.E = nq;
        this.F = interfaceC2592Vu0;
        this.G = AbstractC9046vU0.d(obj, null, 2, null);
        this.H = true;
    }

    private void setValue(Object obj) {
        this.G.setValue(obj);
    }

    @Override // com.daaw.InterfaceC6258lW0
    public Object getValue() {
        return this.G.getValue();
    }

    public final boolean m() {
        return this.H;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e5 A[Catch: all -> 0x0063, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0063, blocks: (B:35:0x00b1, B:38:0x00e5, B:20:0x005a), top: B:54:0x005a }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0075 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:45:0x0102). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f8 -> B:42:0x00f9). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object o(com.daaw.InterfaceC1416Ks r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8788ub.o(com.daaw.Ks):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object p(com.daaw.InterfaceC6225lO r7, com.daaw.InterfaceC1416Ks r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.daaw.C8788ub.c
            if (r0 == 0) goto L13
            r0 = r8
            com.daaw.ub$c r0 = (com.daaw.C8788ub.c) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            com.daaw.ub$c r0 = new com.daaw.ub$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.H
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.E
            com.daaw.lO r7 = (com.daaw.InterfaceC6225lO) r7
            com.daaw.AbstractC4801gJ0.b(r8)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            return r8
        L2e:
            r8 = move-exception
            goto L50
        L30:
            r7 = move-exception
            goto L7c
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            com.daaw.AbstractC4801gJ0.b(r8)
            com.daaw.ub$d r8 = new com.daaw.ub$d     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r8.<init>(r7, r4)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.E = r7     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r0.H = r3     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            r2 = 15000(0x3a98, double:7.411E-320)
            java.lang.Object r7 = com.daaw.P31.d(r2, r8, r0)     // Catch: java.lang.Exception -> L2e java.util.concurrent.CancellationException -> L30
            if (r7 != r1) goto L4f
            return r1
        L4f:
            return r7
        L50:
            com.daaw.ft r1 = r0.getContext()
            com.daaw.kt$a r2 = com.daaw.InterfaceC6089kt.f
            com.daaw.ft$b r1 = r1.a(r2)
            com.daaw.kt r1 = (com.daaw.InterfaceC6089kt) r1
            if (r1 == 0) goto L86
            com.daaw.ft r0 = r0.getContext()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Unable to load font "
            r3.append(r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            r2.<init>(r7, r8)
            r1.f1(r0, r2)
            goto L86
        L7c:
            com.daaw.ft r8 = r0.getContext()
            boolean r8 = com.daaw.AbstractC3053a40.l(r8)
            if (r8 == 0) goto L87
        L86:
            return r4
        L87:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8788ub.p(com.daaw.lO, com.daaw.Ks):java.lang.Object");
    }
}
