package com.daaw;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes.dex */
public final class F6 {
    public final InterfaceC3626c71 a;
    public final Object b;
    public final C6433m7 c;
    public final InterfaceC8007rm0 d;
    public final InterfaceC8007rm0 e;
    public final C0665Dm0 f;
    public final BV0 g;
    public final AbstractC8664u7 h;
    public final AbstractC8664u7 i;
    public AbstractC8664u7 j;
    public AbstractC8664u7 k;

    public static final class a extends SZ0 implements NQ {
        public Object F;
        public Object G;
        public int H;
        public final /* synthetic */ Object J;
        public final /* synthetic */ InterfaceC4460f7 K;
        public final /* synthetic */ long L;
        public final /* synthetic */ NQ M;

        /* JADX INFO: renamed from: com.daaw.F6$a$a, reason: collision with other inner class name */
        public static final class C0060a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ F6 B;
            public final /* synthetic */ C6433m7 C;
            public final /* synthetic */ NQ D;
            public final /* synthetic */ C5620jF0 E;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0060a(F6 f6, C6433m7 c6433m7, NQ nq, C5620jF0 c5620jF0) {
                super(1);
                this.B = f6;
                this.C = c6433m7;
                this.D = nq;
                this.E = c5620jF0;
            }

            public final void a(C5584j7 c5584j7) {
                G10.g(c5584j7, "$this$animate");
                PZ0.e(c5584j7, this.B.l());
                Object objH = this.B.h(c5584j7.e());
                if (G10.c(objH, c5584j7.e())) {
                    NQ nq = this.D;
                    if (nq == null) {
                        return;
                    }
                    nq.invoke(this.B);
                    return;
                }
                this.B.l().u(objH);
                this.C.u(objH);
                NQ nq2 = this.D;
                if (nq2 != null) {
                    nq2.invoke(this.B);
                }
                c5584j7.a();
                this.E.B = true;
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((C5584j7) obj);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, InterfaceC4460f7 interfaceC4460f7, long j, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
            super(1, interfaceC1416Ks);
            this.J = obj;
            this.K = interfaceC4460f7;
            this.L = j;
            this.M = nq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            C6433m7 c6433m7;
            C5620jF0 c5620jF0;
            Object objC = I10.c();
            int i = this.H;
            try {
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    F6.this.l().v((AbstractC8664u7) F6.this.n().a().invoke(this.J));
                    F6.this.t(this.K.g());
                    F6.this.s(true);
                    C6433m7 c6433m7B = AbstractC6712n7.b(F6.this.l(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    C5620jF0 c5620jF02 = new C5620jF0();
                    InterfaceC4460f7 interfaceC4460f7 = this.K;
                    long j = this.L;
                    C0060a c0060a = new C0060a(F6.this, c6433m7B, this.M, c5620jF02);
                    this.F = c6433m7B;
                    this.G = c5620jF02;
                    this.H = 1;
                    if (PZ0.b(c6433m7B, interfaceC4460f7, j, c0060a, this) == objC) {
                        return objC;
                    }
                    c6433m7 = c6433m7B;
                    c5620jF0 = c5620jF02;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c5620jF0 = (C5620jF0) this.G;
                    c6433m7 = (C6433m7) this.F;
                    AbstractC4801gJ0.b(obj);
                }
                EnumC4749g7 enumC4749g7 = c5620jF0.B ? EnumC4749g7.BoundReached : EnumC4749g7.Finished;
                F6.this.j();
                return new C5307i7(c6433m7, enumC4749g7);
            } catch (CancellationException e) {
                F6.this.j();
                throw e;
            }
        }

        public final InterfaceC1416Ks u(InterfaceC1416Ks interfaceC1416Ks) {
            return F6.this.new a(this.J, this.K, this.L, this.M, interfaceC1416Ks);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) u(interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class b extends SZ0 implements NQ {
        public int F;
        public final /* synthetic */ Object H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            super(1, interfaceC1416Ks);
            this.H = obj;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            F6.this.j();
            Object objH = F6.this.h(this.H);
            F6.this.l().u(objH);
            F6.this.t(objH);
            return G91.a;
        }

        public final InterfaceC1416Ks u(InterfaceC1416Ks interfaceC1416Ks) {
            return F6.this.new b(this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1416Ks interfaceC1416Ks) {
            return ((b) u(interfaceC1416Ks)).q(G91.a);
        }
    }

    public F6(Object obj, InterfaceC3626c71 interfaceC3626c71, Object obj2) {
        G10.g(interfaceC3626c71, "typeConverter");
        this.a = interfaceC3626c71;
        this.b = obj2;
        this.c = new C6433m7(interfaceC3626c71, obj, null, 0L, 0L, false, 60, null);
        this.d = AbstractC9046vU0.d(Boolean.FALSE, null, 2, null);
        this.e = AbstractC9046vU0.d(obj, null, 2, null);
        this.f = new C0665Dm0();
        this.g = new BV0(0.0f, 0.0f, obj2, 3, null);
        AbstractC8664u7 abstractC8664u7I = i(obj, Float.NEGATIVE_INFINITY);
        this.h = abstractC8664u7I;
        AbstractC8664u7 abstractC8664u7I2 = i(obj, Float.POSITIVE_INFINITY);
        this.i = abstractC8664u7I2;
        this.j = abstractC8664u7I;
        this.k = abstractC8664u7I2;
    }

    public static /* synthetic */ Object f(F6 f6, Object obj, InterfaceC5866k7 interfaceC5866k7, Object obj2, NQ nq, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj3) {
        if ((i & 2) != 0) {
            interfaceC5866k7 = f6.k();
        }
        InterfaceC5866k7 interfaceC5866k72 = interfaceC5866k7;
        if ((i & 4) != 0) {
            obj2 = f6.p();
        }
        Object obj4 = obj2;
        if ((i & 8) != 0) {
            nq = null;
        }
        return f6.e(obj, interfaceC5866k72, obj4, nq, interfaceC1416Ks);
    }

    public final Object e(Object obj, InterfaceC5866k7 interfaceC5866k7, Object obj2, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        return r(AbstractC5028h7.a(interfaceC5866k7, n(), o(), obj, obj2), obj2, nq, interfaceC1416Ks);
    }

    public final InterfaceC6258lW0 g() {
        return this.c;
    }

    public final Object h(Object obj) {
        if (G10.c(this.j, this.h) && G10.c(this.k, this.i)) {
            return obj;
        }
        AbstractC8664u7 abstractC8664u7 = (AbstractC8664u7) this.a.a().invoke(obj);
        int iB = abstractC8664u7.b();
        int i = 0;
        boolean z = false;
        while (i < iB) {
            int i2 = i + 1;
            if (abstractC8664u7.a(i) < this.j.a(i) || abstractC8664u7.a(i) > this.k.a(i)) {
                abstractC8664u7.e(i, AbstractC8417tE0.k(abstractC8664u7.a(i), this.j.a(i), this.k.a(i)));
                z = true;
            }
            i = i2;
        }
        return z ? this.a.b().invoke(abstractC8664u7) : obj;
    }

    public final AbstractC8664u7 i(Object obj, float f) {
        AbstractC8664u7 abstractC8664u7 = (AbstractC8664u7) this.a.a().invoke(obj);
        int iB = abstractC8664u7.b();
        for (int i = 0; i < iB; i++) {
            abstractC8664u7.e(i, f);
        }
        return abstractC8664u7;
    }

    public final void j() {
        C6433m7 c6433m7 = this.c;
        c6433m7.p().d();
        c6433m7.s(Long.MIN_VALUE);
        s(false);
    }

    public final BV0 k() {
        return this.g;
    }

    public final C6433m7 l() {
        return this.c;
    }

    public final Object m() {
        return this.e.getValue();
    }

    public final InterfaceC3626c71 n() {
        return this.a;
    }

    public final Object o() {
        return this.c.getValue();
    }

    public final Object p() {
        return this.a.b().invoke(q());
    }

    public final AbstractC8664u7 q() {
        return this.c.p();
    }

    public final Object r(InterfaceC4460f7 interfaceC4460f7, Object obj, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        return C0665Dm0.e(this.f, null, new a(obj, interfaceC4460f7, l().m(), nq, null), interfaceC1416Ks, 1, null);
    }

    public final void s(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void t(Object obj) {
        this.e.setValue(obj);
    }

    public final Object u(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = C0665Dm0.e(this.f, null, new b(obj, null), interfaceC1416Ks, 1, null);
        return objE == I10.c() ? objE : G91.a;
    }

    public /* synthetic */ F6(Object obj, InterfaceC3626c71 interfaceC3626c71, Object obj2, int i, AbstractC2911Yw abstractC2911Yw) {
        this(obj, interfaceC3626c71, (i & 4) != 0 ? null : obj2);
    }
}
