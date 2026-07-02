package com.daaw;

import com.daaw.AbstractC4512fJ0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TZ0 extends AbstractC9182vx0 implements InterfaceC9461wx0, InterfaceC9740xx0, InterfaceC4988gz {
    public final InterfaceC2733Xd1 D;
    public final /* synthetic */ InterfaceC4988gz E;
    public C4134dx0 F;
    public final C8565tm0 G;
    public final C8565tm0 H;
    public C4134dx0 I;
    public long J;
    public InterfaceC7484pt K;
    public boolean L;

    public final class a implements InterfaceC2211Sd, InterfaceC4988gz, InterfaceC1416Ks {
        public final InterfaceC1416Ks B;
        public final /* synthetic */ TZ0 C;
        public InterfaceC3788cj D;
        public EnumC4702fx0 E;
        public final InterfaceC4684ft F;
        public final /* synthetic */ TZ0 G;

        /* JADX INFO: renamed from: com.daaw.TZ0$a$a, reason: collision with other inner class name */
        public static final class C0119a extends AbstractC1623Ms {
            public Object E;
            public /* synthetic */ Object F;
            public int H;

            public C0119a(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.F = obj;
                this.H |= Integer.MIN_VALUE;
                return a.this.z(0L, null, this);
            }
        }

        public static final class b extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ long G;
            public final /* synthetic */ a H;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(long j, a aVar, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = j;
                this.H = aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new b(this.G, this.H, interfaceC1416Ks);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
            
                if (com.daaw.AbstractC0391Ay.a(1, r8) == r0) goto L15;
             */
            @Override // com.daaw.AbstractC7409pe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object q(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    java.lang.Object r0 = com.daaw.I10.c()
                    int r1 = r8.F
                    r2 = 1
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    com.daaw.AbstractC4801gJ0.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    com.daaw.AbstractC4801gJ0.b(r9)
                    goto L2f
                L20:
                    com.daaw.AbstractC4801gJ0.b(r9)
                    long r6 = r8.G
                    long r6 = r6 - r2
                    r8.F = r5
                    java.lang.Object r9 = com.daaw.AbstractC0391Ay.a(r6, r8)
                    if (r9 != r0) goto L2f
                    goto L37
                L2f:
                    r8.F = r4
                    java.lang.Object r9 = com.daaw.AbstractC0391Ay.a(r2, r8)
                    if (r9 != r0) goto L38
                L37:
                    return r0
                L38:
                    com.daaw.TZ0$a r9 = r8.H
                    com.daaw.cj r9 = com.daaw.TZ0.a.b(r9)
                    if (r9 == 0) goto L54
                    com.daaw.fJ0$a r0 = com.daaw.AbstractC4512fJ0.B
                    com.daaw.gx0 r0 = new com.daaw.gx0
                    long r1 = r8.G
                    r0.<init>(r1)
                    java.lang.Object r0 = com.daaw.AbstractC4801gJ0.a(r0)
                    java.lang.Object r0 = com.daaw.AbstractC4512fJ0.a(r0)
                    r9.x(r0)
                L54:
                    com.daaw.G91 r9 = com.daaw.G91.a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.TZ0.a.b.q(java.lang.Object):java.lang.Object");
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        public static final class c extends AbstractC1623Ms {
            public /* synthetic */ Object E;
            public int G;

            public c(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.E = obj;
                this.G |= Integer.MIN_VALUE;
                return a.this.X(0L, null, this);
            }
        }

        public a(TZ0 tz0, InterfaceC1416Ks interfaceC1416Ks) {
            G10.g(interfaceC1416Ks, "completion");
            this.G = tz0;
            this.B = interfaceC1416Ks;
            this.C = tz0;
            this.E = EnumC4702fx0.Main;
            this.F = C5905kG.B;
        }

        @Override // com.daaw.InterfaceC4988gz
        public float H(int i) {
            return this.C.H(i);
        }

        @Override // com.daaw.InterfaceC4988gz
        public float J() {
            return this.C.J();
        }

        @Override // com.daaw.InterfaceC4988gz
        public float O(float f) {
            return this.C.O(f);
        }

        @Override // com.daaw.InterfaceC2211Sd
        public long S() {
            return this.G.S();
        }

        @Override // com.daaw.InterfaceC4988gz
        public int V(float f) {
            return this.C.V(f);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.daaw.InterfaceC2211Sd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object X(long r5, com.daaw.InterfaceC3429bR r7, com.daaw.InterfaceC1416Ks r8) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r8 instanceof com.daaw.TZ0.a.c
                if (r0 == 0) goto L13
                r0 = r8
                com.daaw.TZ0$a$c r0 = (com.daaw.TZ0.a.c) r0
                int r1 = r0.G
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.G = r1
                goto L18
            L13:
                com.daaw.TZ0$a$c r0 = new com.daaw.TZ0$a$c
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.E
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.G
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                com.daaw.AbstractC4801gJ0.b(r8)     // Catch: com.daaw.C4981gx0 -> L3e
                return r8
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                com.daaw.AbstractC4801gJ0.b(r8)
                r0.G = r3     // Catch: com.daaw.C4981gx0 -> L3e
                java.lang.Object r5 = r4.z(r5, r7, r0)     // Catch: com.daaw.C4981gx0 -> L3e
                if (r5 != r1) goto L3d
                return r1
            L3d:
                return r5
            L3e:
                r5 = 0
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.TZ0.a.X(long, com.daaw.bR, com.daaw.Ks):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC2211Sd
        public Object c0(EnumC4702fx0 enumC4702fx0, InterfaceC1416Ks interfaceC1416Ks) {
            C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
            c4067dj.y();
            this.E = enumC4702fx0;
            this.D = c4067dj;
            Object objU = c4067dj.u();
            if (objU == I10.c()) {
                AbstractC7497pw.c(interfaceC1416Ks);
            }
            return objU;
        }

        @Override // com.daaw.InterfaceC2211Sd
        public long d() {
            return this.G.J;
        }

        @Override // com.daaw.InterfaceC4988gz
        public long d0(long j) {
            return this.C.d0(j);
        }

        @Override // com.daaw.InterfaceC4988gz
        public float e0(long j) {
            return this.C.e0(j);
        }

        public final void g(Throwable th) {
            InterfaceC3788cj interfaceC3788cj = this.D;
            if (interfaceC3788cj != null) {
                interfaceC3788cj.L(th);
            }
            this.D = null;
        }

        @Override // com.daaw.InterfaceC1416Ks
        public InterfaceC4684ft getContext() {
            return this.F;
        }

        @Override // com.daaw.InterfaceC4988gz
        public float getDensity() {
            return this.C.getDensity();
        }

        @Override // com.daaw.InterfaceC2211Sd
        public InterfaceC2733Xd1 getViewConfiguration() {
            return this.G.getViewConfiguration();
        }

        @Override // com.daaw.InterfaceC2211Sd
        public C4134dx0 v() {
            return this.G.F;
        }

        @Override // com.daaw.InterfaceC1416Ks
        public void x(Object obj) {
            C8565tm0 c8565tm0 = this.G.G;
            TZ0 tz0 = this.G;
            synchronized (c8565tm0) {
                tz0.G.w(this);
                G91 g91 = G91.a;
            }
            this.B.x(obj);
        }

        public final void y(C4134dx0 c4134dx0, EnumC4702fx0 enumC4702fx0) {
            InterfaceC3788cj interfaceC3788cj;
            G10.g(c4134dx0, "event");
            G10.g(enumC4702fx0, "pass");
            if (enumC4702fx0 != this.E || (interfaceC3788cj = this.D) == null) {
                return;
            }
            this.D = null;
            interfaceC3788cj.x(AbstractC4512fJ0.a(c4134dx0));
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Type inference failed for: r12v0, types: [long] */
        /* JADX WARN: Type inference failed for: r12v1, types: [com.daaw.U30] */
        /* JADX WARN: Type inference failed for: r12v3, types: [com.daaw.U30] */
        /* JADX WARN: Type inference failed for: r12v7 */
        /* JADX WARN: Type inference failed for: r12v8 */
        /* JADX WARN: Type inference failed for: r14v0, types: [com.daaw.bR] */
        @Override // com.daaw.InterfaceC2211Sd
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object z(long r12, com.daaw.InterfaceC3429bR r14, com.daaw.InterfaceC1416Ks r15) throws java.lang.Throwable {
            /*
                r11 = this;
                boolean r0 = r15 instanceof com.daaw.TZ0.a.C0119a
                if (r0 == 0) goto L13
                r0 = r15
                com.daaw.TZ0$a$a r0 = (com.daaw.TZ0.a.C0119a) r0
                int r1 = r0.H
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.H = r1
                goto L18
            L13:
                com.daaw.TZ0$a$a r0 = new com.daaw.TZ0$a$a
                r0.<init>(r15)
            L18:
                java.lang.Object r15 = r0.F
                java.lang.Object r1 = com.daaw.I10.c()
                int r2 = r0.H
                r3 = 1
                r4 = 0
                if (r2 == 0) goto L39
                if (r2 != r3) goto L31
                java.lang.Object r12 = r0.E
                com.daaw.U30 r12 = (com.daaw.U30) r12
                com.daaw.AbstractC4801gJ0.b(r15)     // Catch: java.lang.Throwable -> L2e
                goto L76
            L2e:
                r0 = move-exception
                r13 = r0
                goto L7a
            L31:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L39:
                com.daaw.AbstractC4801gJ0.b(r15)
                r5 = 0
                int r15 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
                if (r15 > 0) goto L58
                com.daaw.cj r15 = r11.D
                if (r15 == 0) goto L58
                com.daaw.fJ0$a r2 = com.daaw.AbstractC4512fJ0.B
                com.daaw.gx0 r2 = new com.daaw.gx0
                r2.<init>(r12)
                java.lang.Object r2 = com.daaw.AbstractC4801gJ0.a(r2)
                java.lang.Object r2 = com.daaw.AbstractC4512fJ0.a(r2)
                r15.x(r2)
            L58:
                com.daaw.TZ0 r15 = r11.G
                com.daaw.pt r5 = r15.s0()
                com.daaw.TZ0$a$b r8 = new com.daaw.TZ0$a$b
                r8.<init>(r12, r11, r4)
                r9 = 3
                r10 = 0
                r6 = 0
                r7 = 0
                com.daaw.U30 r12 = com.daaw.AbstractC8539th.d(r5, r6, r7, r8, r9, r10)
                r0.E = r12     // Catch: java.lang.Throwable -> L2e
                r0.H = r3     // Catch: java.lang.Throwable -> L2e
                java.lang.Object r15 = r14.invoke(r11, r0)     // Catch: java.lang.Throwable -> L2e
                if (r15 != r1) goto L76
                return r1
            L76:
                com.daaw.U30.a.a(r12, r4, r3, r4)
                return r15
            L7a:
                com.daaw.U30.a.a(r12, r4, r3, r4)
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.TZ0.a.z(long, com.daaw.bR, com.daaw.Ks):java.lang.Object");
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4702fx0.values().length];
            iArr[EnumC4702fx0.Initial.ordinal()] = 1;
            iArr[EnumC4702fx0.Final.ordinal()] = 2;
            iArr[EnumC4702fx0.Main.ordinal()] = 3;
            a = iArr;
        }
    }

    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ a B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(a aVar) {
            super(1);
            this.B = aVar;
        }

        public final void a(Throwable th) {
            this.B.g(th);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return G91.a;
        }
    }

    public TZ0(InterfaceC2733Xd1 interfaceC2733Xd1, InterfaceC4988gz interfaceC4988gz) {
        G10.g(interfaceC2733Xd1, "viewConfiguration");
        G10.g(interfaceC4988gz, "density");
        this.D = interfaceC2733Xd1;
        this.E = interfaceC4988gz;
        this.F = UZ0.a;
        this.G = new C8565tm0(new a[16], 0);
        this.H = new C8565tm0(new a[16], 0);
        this.J = I00.b.a();
        this.K = C6524mT.B;
    }

    @Override // com.daaw.InterfaceC4988gz
    public float H(int i) {
        return this.E.H(i);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ boolean I(NQ nq) {
        return AbstractC1177Ik0.a(this, nq);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float J() {
        return this.E.J();
    }

    @Override // com.daaw.InterfaceC4988gz
    public float O(float f) {
        return this.E.O(f);
    }

    @Override // com.daaw.InterfaceC9740xx0
    public Object Q(InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
        C4067dj c4067dj = new C4067dj(H10.b(interfaceC1416Ks), 1);
        c4067dj.y();
        a aVar = new a(this, c4067dj);
        synchronized (this.G) {
            this.G.d(aVar);
            InterfaceC1416Ks interfaceC1416KsA = AbstractC1831Os.a(interfaceC3429bR, aVar, aVar);
            AbstractC4512fJ0.a aVar2 = AbstractC4512fJ0.B;
            interfaceC1416KsA.x(AbstractC4512fJ0.a(G91.a));
        }
        c4067dj.r(new c(aVar));
        Object objU = c4067dj.u();
        if (objU == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objU;
    }

    public long S() {
        long jD0 = d0(getViewConfiguration().d());
        long jD = d();
        return BT0.a(Math.max(0.0f, C9879yT0.i(jD0) - I00.g(jD)) / 2.0f, Math.max(0.0f, C9879yT0.g(jD0) - I00.f(jD)) / 2.0f);
    }

    @Override // com.daaw.InterfaceC4988gz
    public int V(float f) {
        return this.E.V(f);
    }

    @Override // com.daaw.InterfaceC4988gz
    public long d0(long j) {
        return this.E.d0(j);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float e0(long j) {
        return this.E.e0(j);
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.AbstractC9182vx0
    public boolean f0() {
        return this.L;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
        return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
    }

    @Override // com.daaw.InterfaceC4988gz
    public float getDensity() {
        return this.E.getDensity();
    }

    @Override // com.daaw.InterfaceC9740xx0
    public InterfaceC2733Xd1 getViewConfiguration() {
        return this.D;
    }

    @Override // com.daaw.AbstractC9182vx0
    public void k0() {
        C4134dx0 c4134dx0 = this.I;
        if (c4134dx0 == null) {
            return;
        }
        List listC = c4134dx0.c();
        int size = listC.size();
        for (int i = 0; i < size; i++) {
            if (((C7223ox0) listC.get(i)).g()) {
                List listC2 = c4134dx0.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    C7223ox0 c7223ox0 = (C7223ox0) listC2.get(i2);
                    long jE = c7223ox0.e();
                    long jF = c7223ox0.f();
                    arrayList.add(new C7223ox0(jE, c7223ox0.k(), jF, false, c7223ox0.k(), c7223ox0.f(), c7223ox0.g(), c7223ox0.g(), 0, 0L, 768, (AbstractC2911Yw) null));
                }
                C4134dx0 c4134dx02 = new C4134dx0(arrayList);
                this.F = c4134dx02;
                r0(c4134dx02, EnumC4702fx0.Initial);
                r0(c4134dx02, EnumC4702fx0.Main);
                r0(c4134dx02, EnumC4702fx0.Final);
                this.I = null;
                return;
            }
        }
    }

    @Override // com.daaw.AbstractC9182vx0
    public void l0(C4134dx0 c4134dx0, EnumC4702fx0 enumC4702fx0, long j) {
        G10.g(c4134dx0, "pointerEvent");
        G10.g(enumC4702fx0, "pass");
        this.J = j;
        if (enumC4702fx0 == EnumC4702fx0.Initial) {
            this.F = c4134dx0;
        }
        r0(c4134dx0, enumC4702fx0);
        List listC = c4134dx0.c();
        int size = listC.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!AbstractC4413ex0.d((C7223ox0) listC.get(i))) {
                break;
            } else {
                i++;
            }
        }
        if (z) {
            c4134dx0 = null;
        }
        this.I = c4134dx0;
    }

    public final void r0(C4134dx0 c4134dx0, EnumC4702fx0 enumC4702fx0) {
        C8565tm0 c8565tm0;
        int iR;
        synchronized (this.G) {
            C8565tm0 c8565tm02 = this.H;
            c8565tm02.e(c8565tm02.r(), this.G);
        }
        try {
            int i = b.a[enumC4702fx0.ordinal()];
            if (i == 1 || i == 2) {
                C8565tm0 c8565tm03 = this.H;
                int iR2 = c8565tm03.r();
                if (iR2 > 0) {
                    Object[] objArrQ = c8565tm03.q();
                    int i2 = 0;
                    do {
                        ((a) objArrQ[i2]).y(c4134dx0, enumC4702fx0);
                        i2++;
                    } while (i2 < iR2);
                }
            } else if (i == 3 && (iR = (c8565tm0 = this.H).r()) > 0) {
                int i3 = iR - 1;
                Object[] objArrQ2 = c8565tm0.q();
                do {
                    ((a) objArrQ2[i3]).y(c4134dx0, enumC4702fx0);
                    i3--;
                } while (i3 >= 0);
            }
        } finally {
            this.H.k();
        }
    }

    public final InterfaceC7484pt s0() {
        return this.K;
    }

    public final void t0(InterfaceC7484pt interfaceC7484pt) {
        G10.g(interfaceC7484pt, "<set-?>");
        this.K = interfaceC7484pt;
    }

    @Override // com.daaw.InterfaceC1073Hk0
    public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
        return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
    }

    @Override // com.daaw.InterfaceC9461wx0
    public AbstractC9182vx0 C() {
        return this;
    }
}
