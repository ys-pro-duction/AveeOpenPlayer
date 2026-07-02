package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class PZ0 {

    public static final class a extends AbstractC1623Ms {
        public Object E;
        public Object F;
        public Object G;
        public Object H;
        public /* synthetic */ Object I;
        public int J;

        public a(InterfaceC1416Ks interfaceC1416Ks) {
            super(interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) {
            this.I = obj;
            this.J |= Integer.MIN_VALUE;
            return PZ0.b(null, null, 0L, null, this);
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C6748nF0 B;
        public final /* synthetic */ Object C;
        public final /* synthetic */ InterfaceC4460f7 D;
        public final /* synthetic */ AbstractC8664u7 E;
        public final /* synthetic */ C6433m7 F;
        public final /* synthetic */ NQ G;

        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ C6433m7 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C6433m7 c6433m7) {
                super(0);
                this.B = c6433m7;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m27invoke() {
                this.B.t(false);
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m27invoke();
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6748nF0 c6748nF0, Object obj, InterfaceC4460f7 interfaceC4460f7, AbstractC8664u7 abstractC8664u7, C6433m7 c6433m7, NQ nq) {
            super(1);
            this.B = c6748nF0;
            this.C = obj;
            this.D = interfaceC4460f7;
            this.E = abstractC8664u7;
            this.F = c6433m7;
            this.G = nq;
        }

        public final void a(long j) {
            C6748nF0 c6748nF0 = this.B;
            C5584j7 c5584j7 = new C5584j7(this.C, this.D.c(), this.E, j, this.D.g(), j, true, new a(this.F));
            PZ0.d(c5584j7, j, this.D, this.F, this.G);
            c6748nF0.B = c5584j7;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return G91.a;
        }
    }

    public static final class c extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ C6433m7 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C6433m7 c6433m7) {
            super(0);
            this.B = c6433m7;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m28invoke() {
            this.B.t(false);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m28invoke();
            return G91.a;
        }
    }

    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C6748nF0 B;
        public final /* synthetic */ InterfaceC4460f7 C;
        public final /* synthetic */ C6433m7 D;
        public final /* synthetic */ NQ E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C6748nF0 c6748nF0, InterfaceC4460f7 interfaceC4460f7, C6433m7 c6433m7, NQ nq) {
            super(1);
            this.B = c6748nF0;
            this.C = interfaceC4460f7;
            this.D = c6433m7;
            this.E = nq;
        }

        public final void a(long j) {
            Object obj = this.B.B;
            G10.d(obj);
            PZ0.d((C5584j7) obj, j, this.C, this.D, this.E);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a(((Number) obj).longValue());
            return G91.a;
        }
    }

    public static final class e extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(NQ nq) {
            super(1);
            this.B = nq;
        }

        public final Object a(long j) {
            return this.B.invoke(Long.valueOf(j));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(com.daaw.C6433m7 r22, com.daaw.InterfaceC4460f7 r23, long r24, com.daaw.NQ r26, com.daaw.InterfaceC1416Ks r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.PZ0.b(com.daaw.m7, com.daaw.f7, long, com.daaw.NQ, com.daaw.Ks):java.lang.Object");
    }

    public static final Object c(InterfaceC4460f7 interfaceC4460f7, NQ nq, InterfaceC1416Ks interfaceC1416Ks) {
        return interfaceC4460f7.a() ? CZ.a(nq, interfaceC1416Ks) : AbstractC5481il0.b(new e(nq), interfaceC1416Ks);
    }

    public static final void d(C5584j7 c5584j7, long j, InterfaceC4460f7 interfaceC4460f7, C6433m7 c6433m7, NQ nq) {
        c5584j7.i(j);
        long jD = j - c5584j7.d();
        c5584j7.k(interfaceC4460f7.f(jD));
        c5584j7.l(interfaceC4460f7.d(jD));
        if (interfaceC4460f7.e(jD)) {
            c5584j7.h(c5584j7.c());
            c5584j7.j(false);
        }
        e(c5584j7, c6433m7);
        nq.invoke(c5584j7);
    }

    public static final void e(C5584j7 c5584j7, C6433m7 c6433m7) {
        G10.g(c5584j7, "<this>");
        G10.g(c6433m7, "state");
        c6433m7.u(c5584j7.e());
        AbstractC8950v7.b(c6433m7.p(), c5584j7.f());
        c6433m7.r(c5584j7.b());
        c6433m7.s(c5584j7.c());
        c6433m7.t(c5584j7.g());
    }
}
