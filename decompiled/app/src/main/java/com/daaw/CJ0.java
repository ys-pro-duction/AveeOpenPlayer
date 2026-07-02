package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public final class CJ0 {
    public C9982yp0 a;
    public final float b;
    public final boolean c;
    public Float d;
    public Float e;
    public C9982yp0 f;
    public final F6 g;
    public final F6 h;
    public final F6 i;
    public final InterfaceC1396Kn j;
    public final InterfaceC8007rm0 k;
    public final InterfaceC8007rm0 l;

    public static final class a extends AbstractC1623Ms {
        public Object E;
        public /* synthetic */ Object F;
        public int H;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.F = obj;
            this.H |= Integer.MIN_VALUE;
            return CJ0.this.d(this);
        }
    }

    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ CJ0 G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CJ0 cj0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = cj0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new a(this.G, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    F6 f6 = this.G.g;
                    Float fB = AbstractC0527Cg.b(1.0f);
                    Y61 y61D = AbstractC6154l7.d(75, 0, AbstractC4495fF.b(), 2, null);
                    this.F = 1;
                    if (F6.f(f6, fB, y61D, null, null, this, 12, null) == objC) {
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

        /* JADX INFO: renamed from: com.daaw.CJ0$b$b, reason: collision with other inner class name */
        public static final class C0053b extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ CJ0 G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0053b(CJ0 cj0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = cj0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new C0053b(this.G, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    F6 f6 = this.G.h;
                    Float fB = AbstractC0527Cg.b(1.0f);
                    Y61 y61D = AbstractC6154l7.d(225, 0, AbstractC4495fF.a(), 2, null);
                    this.F = 1;
                    if (F6.f(f6, fB, y61D, null, null, this, 12, null) == objC) {
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
                return ((C0053b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        public static final class c extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ CJ0 G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(CJ0 cj0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = cj0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new c(this.G, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    F6 f6 = this.G.i;
                    Float fB = AbstractC0527Cg.b(1.0f);
                    Y61 y61D = AbstractC6154l7.d(225, 0, AbstractC4495fF.b(), 2, null);
                    this.F = 1;
                    if (F6.f(f6, fB, y61D, null, null, this, 12, null) == objC) {
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

        public b(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            b bVar = CJ0.this.new b(interfaceC1416Ks);
            bVar.G = obj;
            return bVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            InterfaceC7484pt interfaceC7484pt = (InterfaceC7484pt) this.G;
            AbstractC9104vh.d(interfaceC7484pt, null, null, new a(CJ0.this, null), 3, null);
            AbstractC9104vh.d(interfaceC7484pt, null, null, new C0053b(CJ0.this, null), 3, null);
            return AbstractC9104vh.d(interfaceC7484pt, null, null, new c(CJ0.this, null), 3, null);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class c extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ CJ0 G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(CJ0 cj0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = cj0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new a(this.G, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    F6 f6 = this.G.g;
                    Float fB = AbstractC0527Cg.b(0.0f);
                    Y61 y61D = AbstractC6154l7.d(150, 0, AbstractC4495fF.b(), 2, null);
                    this.F = 1;
                    if (F6.f(f6, fB, y61D, null, null, this, 12, null) == objC) {
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

        public c(InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            c cVar = CJ0.this.new c(interfaceC1416Ks);
            cVar.G = obj;
            return cVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            return AbstractC9104vh.d((InterfaceC7484pt) this.G, null, null, new a(CJ0.this, null), 3, null);
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((c) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public /* synthetic */ CJ0(C9982yp0 c9982yp0, float f, boolean z, AbstractC2911Yw abstractC2911Yw) {
        this(c9982yp0, f, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006f, code lost:
    
        if (r2.g(r0) != r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(com.daaw.InterfaceC1416Ks r7) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r7 instanceof com.daaw.CJ0.a
            if (r0 == 0) goto L13
            r0 = r7
            com.daaw.CJ0$a r0 = (com.daaw.CJ0.a) r0
            int r1 = r0.H
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.H = r1
            goto L18
        L13:
            com.daaw.CJ0$a r0 = new com.daaw.CJ0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.F
            java.lang.Object r1 = com.daaw.I10.c()
            int r2 = r0.H
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            com.daaw.AbstractC4801gJ0.b(r7)
            goto L72
        L2f:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L37:
            java.lang.Object r2 = r0.E
            com.daaw.CJ0 r2 = (com.daaw.CJ0) r2
            com.daaw.AbstractC4801gJ0.b(r7)
            goto L66
        L3f:
            java.lang.Object r2 = r0.E
            com.daaw.CJ0 r2 = (com.daaw.CJ0) r2
            com.daaw.AbstractC4801gJ0.b(r7)
            goto L56
        L47:
            com.daaw.AbstractC4801gJ0.b(r7)
            r0.E = r6
            r0.H = r5
            java.lang.Object r7 = r6.f(r0)
            if (r7 != r1) goto L55
            goto L71
        L55:
            r2 = r6
        L56:
            r2.l(r5)
            com.daaw.Kn r7 = r2.j
            r0.E = r2
            r0.H = r4
            java.lang.Object r7 = r7.w0(r0)
            if (r7 != r1) goto L66
            goto L71
        L66:
            r7 = 0
            r0.E = r7
            r0.H = r3
            java.lang.Object r7 = r2.g(r0)
            if (r7 != r1) goto L72
        L71:
            return r1
        L72:
            com.daaw.G91 r7 = com.daaw.G91.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.CJ0.d(com.daaw.Ks):java.lang.Object");
    }

    public final void e(OD od, long j) {
        G10.g(od, "$this$draw");
        if (this.d == null) {
            this.d = Float.valueOf(DJ0.b(od.a()));
        }
        if (this.e == null) {
            this.e = Float.isNaN(this.b) ? Float.valueOf(DJ0.a(od, this.c, od.a())) : Float.valueOf(od.O(this.b));
        }
        if (this.a == null) {
            this.a = C9982yp0.d(od.b0());
        }
        if (this.f == null) {
            this.f = C9982yp0.d(AbstractC0460Bp0.a(C9879yT0.i(od.a()) / 2.0f, C9879yT0.g(od.a()) / 2.0f));
        }
        float fFloatValue = (!i() || j()) ? ((Number) this.g.o()).floatValue() : 1.0f;
        Float f = this.d;
        G10.d(f);
        float fFloatValue2 = f.floatValue();
        Float f2 = this.e;
        G10.d(f2);
        float fA = AbstractC7425ph0.a(fFloatValue2, f2.floatValue(), ((Number) this.h.o()).floatValue());
        C9982yp0 c9982yp0 = this.a;
        G10.d(c9982yp0);
        float fL = C9982yp0.l(c9982yp0.t());
        C9982yp0 c9982yp02 = this.f;
        G10.d(c9982yp02);
        float fA2 = AbstractC7425ph0.a(fL, C9982yp0.l(c9982yp02.t()), ((Number) this.i.o()).floatValue());
        C9982yp0 c9982yp03 = this.a;
        G10.d(c9982yp03);
        float fM = C9982yp0.m(c9982yp03.t());
        C9982yp0 c9982yp04 = this.f;
        G10.d(c9982yp04);
        long jA = AbstractC0460Bp0.a(fA2, AbstractC7425ph0.a(fM, C9982yp0.m(c9982yp04.t()), ((Number) this.i.o()).floatValue()));
        long jM = C2559Vm.m(j, C2559Vm.p(j) * fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
        if (!this.c) {
            ND.d(od, jM, fA, jA, 0.0f, null, null, 0, 120, null);
            return;
        }
        float fI = C9879yT0.i(od.a());
        float fG = C9879yT0.g(od.a());
        int iB = AbstractC4360em.a.b();
        ID idR = od.R();
        long jA2 = idR.a();
        idR.d().i();
        idR.b().b(0.0f, 0.0f, fI, fG, iB);
        ND.d(od, jM, fA, jA, 0.0f, null, null, 0, 120, null);
        idR.d().o();
        idR.c(jA2);
    }

    public final Object f(InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = AbstractC7763qt.e(new b(null), interfaceC1416Ks);
        return objE == I10.c() ? objE : G91.a;
    }

    public final Object g(InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = AbstractC7763qt.e(new c(null), interfaceC1416Ks);
        return objE == I10.c() ? objE : G91.a;
    }

    public final void h() {
        k(true);
        this.j.B0(G91.a);
    }

    public final boolean i() {
        return ((Boolean) this.l.getValue()).booleanValue();
    }

    public final boolean j() {
        return ((Boolean) this.k.getValue()).booleanValue();
    }

    public final void k(boolean z) {
        this.l.setValue(Boolean.valueOf(z));
    }

    public final void l(boolean z) {
        this.k.setValue(Boolean.valueOf(z));
    }

    public CJ0(C9982yp0 c9982yp0, float f, boolean z) {
        this.a = c9982yp0;
        this.b = f;
        this.c = z;
        this.g = L6.b(0.0f, 0.0f, 2, null);
        this.h = L6.b(0.0f, 0.0f, 2, null);
        this.i = L6.b(0.0f, 0.0f, 2, null);
        this.j = AbstractC1603Mn.a(null);
        Boolean bool = Boolean.FALSE;
        this.k = AbstractC9046vU0.d(bool, null, 2, null);
        this.l = AbstractC9046vU0.d(bool, null, 2, null);
    }
}
