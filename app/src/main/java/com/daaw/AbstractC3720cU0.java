package com.daaw;

/* JADX INFO: renamed from: com.daaw.cU0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3720cU0 {
    public static final a e = new a(null);
    public static final int f = 8;
    public C4566fU0 a;
    public int b;
    public boolean c;
    public int d;

    /* JADX INFO: renamed from: com.daaw.cU0$a */
    public static final class a {

        /* JADX INFO: renamed from: com.daaw.cU0$a$a, reason: collision with other inner class name */
        public static final class C0160a implements InterfaceC9424wp0 {
            public final /* synthetic */ InterfaceC3429bR a;

            public C0160a(InterfaceC3429bR interfaceC3429bR) {
                this.a = interfaceC3429bR;
            }

            @Override // com.daaw.InterfaceC9424wp0
            public final void a() {
                InterfaceC3429bR interfaceC3429bR = this.a;
                synchronized (AbstractC5124hU0.C()) {
                    AbstractC5124hU0.g.remove(interfaceC3429bR);
                    G91 g91 = G91.a;
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.cU0$a$b */
        public static final class b implements InterfaceC9424wp0 {
            public final /* synthetic */ NQ a;

            public b(NQ nq) {
                this.a = nq;
            }

            @Override // com.daaw.InterfaceC9424wp0
            public final void a() {
                NQ nq = this.a;
                synchronized (AbstractC5124hU0.C()) {
                    AbstractC5124hU0.h.remove(nq);
                }
                AbstractC5124hU0.x();
            }
        }

        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final AbstractC3720cU0 a() {
            return AbstractC5124hU0.z((AbstractC3720cU0) AbstractC5124hU0.b.a(), null, 2, null);
        }

        public final AbstractC3720cU0 b() {
            return AbstractC5124hU0.B();
        }

        public final void c() {
            AbstractC5124hU0.B().n();
        }

        public final Object d(NQ nq, NQ nq2, LQ lq) {
            AbstractC3720cU0 d51;
            G10.g(lq, "block");
            if (nq == null && nq2 == null) {
                return lq.invoke();
            }
            AbstractC3720cU0 abstractC3720cU0 = (AbstractC3720cU0) AbstractC5124hU0.b.a();
            if (abstractC3720cU0 == null || (abstractC3720cU0 instanceof C7729qm0)) {
                d51 = new D51(abstractC3720cU0 instanceof C7729qm0 ? (C7729qm0) abstractC3720cU0 : null, nq, nq2, true);
            } else {
                if (nq == null) {
                    return lq.invoke();
                }
                d51 = abstractC3720cU0.v(nq);
            }
            try {
                AbstractC3720cU0 abstractC3720cU0K = d51.k();
                try {
                    return lq.invoke();
                } finally {
                    d51.r(abstractC3720cU0K);
                }
            } finally {
                d51.d();
            }
        }

        public final InterfaceC9424wp0 e(InterfaceC3429bR interfaceC3429bR) {
            G10.g(interfaceC3429bR, "observer");
            AbstractC5124hU0.w(AbstractC5124hU0.a);
            synchronized (AbstractC5124hU0.C()) {
                AbstractC5124hU0.g.add(interfaceC3429bR);
            }
            return new C0160a(interfaceC3429bR);
        }

        public final InterfaceC9424wp0 f(NQ nq) {
            G10.g(nq, "observer");
            synchronized (AbstractC5124hU0.C()) {
                AbstractC5124hU0.h.add(nq);
            }
            AbstractC5124hU0.x();
            return new b(nq);
        }

        public final void g() {
            boolean z;
            synchronized (AbstractC5124hU0.C()) {
                z = false;
                if (((C7082oT) AbstractC5124hU0.i.get()).C() != null) {
                    if (!r1.isEmpty()) {
                        z = true;
                    }
                }
            }
            if (z) {
                AbstractC5124hU0.x();
            }
        }

        public final C7729qm0 h(NQ nq, NQ nq2) {
            C7729qm0 c7729qm0N;
            AbstractC3720cU0 abstractC3720cU0B = AbstractC5124hU0.B();
            C7729qm0 c7729qm0 = abstractC3720cU0B instanceof C7729qm0 ? (C7729qm0) abstractC3720cU0B : null;
            if (c7729qm0 == null || (c7729qm0N = c7729qm0.N(nq, nq2)) == null) {
                throw new IllegalStateException("Cannot create a mutable snapshot of an read-only snapshot");
            }
            return c7729qm0N;
        }

        public final AbstractC3720cU0 i(NQ nq) {
            return AbstractC5124hU0.B().v(nq);
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC3720cU0(int i, C4566fU0 c4566fU0, AbstractC2911Yw abstractC2911Yw) {
        this(i, c4566fU0);
    }

    public final void b() {
        synchronized (AbstractC5124hU0.C()) {
            c();
            q();
            G91 g91 = G91.a;
        }
    }

    public void c() {
        AbstractC5124hU0.d = AbstractC5124hU0.d.y(f());
    }

    public void d() {
        this.c = true;
        synchronized (AbstractC5124hU0.C()) {
            p();
            G91 g91 = G91.a;
        }
    }

    public final boolean e() {
        return this.c;
    }

    public int f() {
        return this.b;
    }

    public C4566fU0 g() {
        return this.a;
    }

    public abstract NQ h();

    public abstract boolean i();

    public abstract NQ j();

    public AbstractC3720cU0 k() {
        AbstractC3720cU0 abstractC3720cU0 = (AbstractC3720cU0) AbstractC5124hU0.b.a();
        AbstractC5124hU0.b.b(this);
        return abstractC3720cU0;
    }

    public abstract void l(AbstractC3720cU0 abstractC3720cU0);

    public abstract void m(AbstractC3720cU0 abstractC3720cU0);

    public abstract void n();

    public abstract void o(InterfaceC10170zW0 interfaceC10170zW0);

    public final void p() {
        int i = this.d;
        if (i >= 0) {
            AbstractC5124hU0.Q(i);
            this.d = -1;
        }
    }

    public void q() {
        p();
    }

    public void r(AbstractC3720cU0 abstractC3720cU0) {
        AbstractC5124hU0.b.b(abstractC3720cU0);
    }

    public final void s(boolean z) {
        this.c = z;
    }

    public void t(int i) {
        this.b = i;
    }

    public void u(C4566fU0 c4566fU0) {
        G10.g(c4566fU0, "<set-?>");
        this.a = c4566fU0;
    }

    public abstract AbstractC3720cU0 v(NQ nq);

    public final int w() {
        int i = this.d;
        this.d = -1;
        return i;
    }

    public final void x() {
        if (this.c) {
            throw new IllegalArgumentException("Cannot use a disposed snapshot");
        }
    }

    public AbstractC3720cU0(int i, C4566fU0 c4566fU0) {
        this.a = c4566fU0;
        this.b = i;
        this.d = i != 0 ? AbstractC5124hU0.U(i, g()) : -1;
    }
}
