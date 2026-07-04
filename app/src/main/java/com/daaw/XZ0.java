package com.daaw;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class XZ0 {
    public static final a q = new a(null);
    public final InterfaceC5866k7 a;
    public final NQ b;
    public final InterfaceC8007rm0 c;
    public final InterfaceC8007rm0 d;
    public final InterfaceC8007rm0 e;
    public final InterfaceC8007rm0 f;
    public final InterfaceC8007rm0 g;
    public final InterfaceC8007rm0 h;
    public final InterfaceC8007rm0 i;
    public final InterfaceC7058oN j;
    public float k;
    public float l;
    public final InterfaceC8007rm0 m;
    public final InterfaceC8007rm0 n;
    public final InterfaceC8007rm0 o;
    public final BD p;

    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ float I;
        public final /* synthetic */ InterfaceC5866k7 J;

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC9535xD B;
            public final /* synthetic */ C5902kF0 C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC9535xD interfaceC9535xD, C5902kF0 c5902kF0) {
                super(1);
                this.B = interfaceC9535xD;
                this.C = c5902kF0;
            }

            public final void a(F6 f6) {
                G10.g(f6, "$this$animateTo");
                this.B.a(((Number) f6.o()).floatValue() - this.C.B);
                this.C.B = ((Number) f6.o()).floatValue();
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((F6) obj);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(float f, InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.I = f;
            this.J = interfaceC5866k7;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            b bVar = XZ0.this.new b(this.I, this.J, interfaceC1416Ks);
            bVar.G = obj;
            return bVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            try {
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    InterfaceC9535xD interfaceC9535xD = (InterfaceC9535xD) this.G;
                    C5902kF0 c5902kF0 = new C5902kF0();
                    c5902kF0.B = ((Number) XZ0.this.g.getValue()).floatValue();
                    XZ0.this.h.setValue(AbstractC0527Cg.b(this.I));
                    XZ0.this.A(true);
                    F6 f6B = L6.b(c5902kF0.B, 0.0f, 2, null);
                    Float fB = AbstractC0527Cg.b(this.I);
                    InterfaceC5866k7 interfaceC5866k7 = this.J;
                    a aVar = new a(interfaceC9535xD, c5902kF0);
                    this.F = 1;
                    if (F6.f(f6B, fB, interfaceC5866k7, null, aVar, this, 4, null) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                XZ0.this.h.setValue(null);
                XZ0.this.A(false);
                return G91.a;
            } catch (Throwable th) {
                XZ0.this.h.setValue(null);
                XZ0.this.A(false);
                throw th;
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9535xD interfaceC9535xD, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(interfaceC9535xD, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class c implements InterfaceC7337pN {
        public final /* synthetic */ Object B;
        public final /* synthetic */ XZ0 C;
        public final /* synthetic */ InterfaceC5866k7 D;

        public static final class a extends AbstractC1623Ms {
            public Object E;
            public Object F;
            public /* synthetic */ Object G;
            public int I;

            public a(InterfaceC1416Ks interfaceC1416Ks) {
                super(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) {
                this.G = obj;
                this.I |= Integer.MIN_VALUE;
                return c.this.c(null, this);
            }
        }

        public c(Object obj, XZ0 xz0, InterfaceC5866k7 interfaceC5866k7) {
            this.B = obj;
            this.C = xz0;
            this.D = interfaceC5866k7;
        }

        /* JADX WARN: Removed duplicated region for block: B:28:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x00ef  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0120  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // com.daaw.InterfaceC7337pN
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(java.util.Map r7, com.daaw.InterfaceC1416Ks r8) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 300
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.XZ0.c.c(java.util.Map, com.daaw.Ks):java.lang.Object");
        }
    }

    public static final class d extends AbstractC4192e90 implements NQ {
        public d() {
            super(1);
        }

        public final void a(float f) {
            float fFloatValue = ((Number) XZ0.this.g.getValue()).floatValue() + f;
            float fK = AbstractC8417tE0.k(fFloatValue, XZ0.this.r(), XZ0.this.q());
            float f2 = fFloatValue - fK;
            BI0 bi0T = XZ0.this.t();
            XZ0.this.e.setValue(Float.valueOf(fK + (bi0T != null ? bi0T.a(f2) : 0.0f)));
            XZ0.this.f.setValue(Float.valueOf(f2));
            XZ0.this.g.setValue(Float.valueOf(fFloatValue));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).floatValue());
            return G91.a;
        }
    }

    public static final class e extends AbstractC4192e90 implements LQ {
        public e() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Map invoke() {
            return XZ0.this.l();
        }
    }

    public static final class f implements InterfaceC7337pN {
        public final /* synthetic */ float C;

        public f(float f) {
            this.C = f;
        }

        @Override // com.daaw.InterfaceC7337pN
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object c(Map map, InterfaceC1416Ks interfaceC1416Ks) {
            Float fE = WZ0.e(map, XZ0.this.o());
            G10.d(fE);
            float fFloatValue = fE.floatValue();
            Object obj = map.get(AbstractC0527Cg.b(WZ0.c(((Number) XZ0.this.s().getValue()).floatValue(), fFloatValue, map.keySet(), XZ0.this.u(), this.C, XZ0.this.v())));
            if (obj != null && ((Boolean) XZ0.this.n().invoke(obj)).booleanValue()) {
                Object objJ = XZ0.j(XZ0.this, obj, null, interfaceC1416Ks, 2, null);
                return objJ == I10.c() ? objJ : G91.a;
            }
            XZ0 xz0 = XZ0.this;
            Object objH = xz0.h(fFloatValue, xz0.m(), interfaceC1416Ks);
            return objH == I10.c() ? objH : G91.a;
        }
    }

    public static final class g extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public float G;
        public /* synthetic */ Object H;
        public int J;

        public g(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.H = obj;
            this.J |= Integer.MIN_VALUE;
            return XZ0.this.y(null, null, this);
        }
    }

    public static final class h extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ float H;
        public final /* synthetic */ XZ0 I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(float f, XZ0 xz0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = f;
            this.I = xz0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            h hVar = new h(this.H, this.I, interfaceC1416Ks);
            hVar.G = obj;
            return hVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            ((InterfaceC9535xD) this.G).a(this.H - ((Number) this.I.g.getValue()).floatValue());
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC9535xD interfaceC9535xD, InterfaceC1416Ks interfaceC1416Ks) {
            return ((h) a(interfaceC9535xD, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class i implements InterfaceC7058oN {
        public final /* synthetic */ InterfaceC7058oN B;

        public static final class a implements InterfaceC7337pN {
            public final /* synthetic */ InterfaceC7337pN B;

            /* JADX INFO: renamed from: com.daaw.XZ0$i$a$a, reason: collision with other inner class name */
            public static final class C0130a extends AbstractC1623Ms {
                public /* synthetic */ Object E;
                public int F;

                public C0130a(InterfaceC1416Ks interfaceC1416Ks) {
                    super(interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) {
                    this.E = obj;
                    this.F |= Integer.MIN_VALUE;
                    return a.this.c(null, this);
                }
            }

            public a(InterfaceC7337pN interfaceC7337pN) {
                this.B = interfaceC7337pN;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // com.daaw.InterfaceC7337pN
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object c(java.lang.Object r5, com.daaw.InterfaceC1416Ks r6) throws java.lang.Throwable {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.daaw.XZ0.i.a.C0130a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.daaw.XZ0$i$a$a r0 = (com.daaw.XZ0.i.a.C0130a) r0
                    int r1 = r0.F
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.F = r1
                    goto L18
                L13:
                    com.daaw.XZ0$i$a$a r0 = new com.daaw.XZ0$i$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.E
                    java.lang.Object r1 = com.daaw.I10.c()
                    int r2 = r0.F
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    com.daaw.AbstractC4801gJ0.b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    com.daaw.AbstractC4801gJ0.b(r6)
                    com.daaw.pN r6 = r4.B
                    r2 = r5
                    java.util.Map r2 = (java.util.Map) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L48
                    r0.F = r3
                    java.lang.Object r5 = r6.c(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    com.daaw.G91 r5 = com.daaw.G91.a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.XZ0.i.a.c(java.lang.Object, com.daaw.Ks):java.lang.Object");
            }
        }

        public i(InterfaceC7058oN interfaceC7058oN) {
            this.B = interfaceC7058oN;
        }

        @Override // com.daaw.InterfaceC7058oN
        public Object a(InterfaceC7337pN interfaceC7337pN, InterfaceC1416Ks interfaceC1416Ks) {
            Object objA = this.B.a(new a(interfaceC7337pN), interfaceC1416Ks);
            return objA == I10.c() ? objA : G91.a;
        }
    }

    public static final class j extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final j B = new j();

        public j() {
            super(2);
        }

        public final Float a(float f, float f2) {
            return Float.valueOf(0.0f);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a(((Number) obj).floatValue(), ((Number) obj2).floatValue());
        }
    }

    public XZ0(Object obj, InterfaceC5866k7 interfaceC5866k7, NQ nq) {
        G10.g(interfaceC5866k7, "animationSpec");
        G10.g(nq, "confirmStateChange");
        this.a = interfaceC5866k7;
        this.b = nq;
        this.c = AbstractC9046vU0.d(obj, null, 2, null);
        this.d = AbstractC9046vU0.d(Boolean.FALSE, null, 2, null);
        Float fValueOf = Float.valueOf(0.0f);
        this.e = AbstractC9046vU0.d(fValueOf, null, 2, null);
        this.f = AbstractC9046vU0.d(fValueOf, null, 2, null);
        this.g = AbstractC9046vU0.d(fValueOf, null, 2, null);
        this.h = AbstractC9046vU0.d(null, null, 2, null);
        this.i = AbstractC9046vU0.d(AbstractC1473Lg0.h(), null, 2, null);
        this.j = AbstractC7894rN.n(new i(AbstractC7923rU0.j(new e())), 1);
        this.k = Float.NEGATIVE_INFINITY;
        this.l = Float.POSITIVE_INFINITY;
        this.m = AbstractC9046vU0.d(j.B, null, 2, null);
        this.n = AbstractC9046vU0.d(fValueOf, null, 2, null);
        this.o = AbstractC9046vU0.d(null, null, 2, null);
        this.p = AbstractC10093zD.a(new d());
    }

    public static /* synthetic */ Object j(XZ0 xz0, Object obj, InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks, int i2, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateTo");
        }
        if ((i2 & 2) != 0) {
            interfaceC5866k7 = xz0.a;
        }
        return xz0.i(obj, interfaceC5866k7, interfaceC1416Ks);
    }

    public final void A(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void B(Object obj) {
        this.c.setValue(obj);
    }

    public final void C(BI0 bi0) {
        this.o.setValue(bi0);
    }

    public final void D(InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC3429bR, "<set-?>");
        this.m.setValue(interfaceC3429bR);
    }

    public final void E(float f2) {
        this.n.setValue(Float.valueOf(f2));
    }

    public final Object F(float f2, InterfaceC1416Ks interfaceC1416Ks) {
        Object objA = AD.a(this.p, null, new h(f2, this, null), interfaceC1416Ks, 1, null);
        return objA == I10.c() ? objA : G91.a;
    }

    public final Object h(float f2, InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks) {
        Object objA = AD.a(this.p, null, new b(f2, interfaceC5866k7, null), interfaceC1416Ks, 1, null);
        return objA == I10.c() ? objA : G91.a;
    }

    public final Object i(Object obj, InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks) {
        Object objA = this.j.a(new c(obj, this, interfaceC5866k7), interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }

    public final void k(Map map) {
        G10.g(map, "newAnchors");
        if (l().isEmpty()) {
            Float fE = WZ0.e(map, o());
            if (fE == null) {
                throw new IllegalArgumentException("The initial value must have an associated anchor.");
            }
            this.e.setValue(fE);
            this.g.setValue(fE);
        }
    }

    public final Map l() {
        return (Map) this.i.getValue();
    }

    public final InterfaceC5866k7 m() {
        return this.a;
    }

    public final NQ n() {
        return this.b;
    }

    public final Object o() {
        return this.c.getValue();
    }

    public final BD p() {
        return this.p;
    }

    public final float q() {
        return this.l;
    }

    public final float r() {
        return this.k;
    }

    public final InterfaceC6258lW0 s() {
        return this.e;
    }

    public final BI0 t() {
        return (BI0) this.o.getValue();
    }

    public final InterfaceC3429bR u() {
        return (InterfaceC3429bR) this.m.getValue();
    }

    public final float v() {
        return ((Number) this.n.getValue()).floatValue();
    }

    public final boolean w() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object x(float f2, InterfaceC1416Ks interfaceC1416Ks) {
        Object objA = this.j.a(new f(f2), interfaceC1416Ks);
        return objA == I10.c() ? objA : G91.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x009f, code lost:
    
        if (F(r10, r0) == r1) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0218  */
    /* JADX WARN: Type inference failed for: r10v21, types: [float] */
    /* JADX WARN: Type inference failed for: r10v76, types: [float] */
    /* JADX WARN: Type inference failed for: r10v78, types: [float] */
    /* JADX WARN: Type inference failed for: r10v83 */
    /* JADX WARN: Type inference failed for: r10v84 */
    /* JADX WARN: Type inference failed for: r10v85 */
    /* JADX WARN: Type inference failed for: r10v86 */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object y(java.util.Map r10, java.util.Map r11, com.daaw.InterfaceC1416Ks r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 640
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.XZ0.y(java.util.Map, java.util.Map, com.daaw.Ks):java.lang.Object");
    }

    public final void z(Map map) {
        G10.g(map, "<set-?>");
        this.i.setValue(map);
    }
}
