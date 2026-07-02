package com.daaw;

/* JADX INFO: renamed from: com.daaw.Cu0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0584Cu0 implements InterfaceC1373Kh0 {
    public int B;
    public int C;
    public long D = J00.a(0, 0);
    public long E = AbstractC0697Du0.b;

    /* JADX INFO: renamed from: com.daaw.Cu0$a */
    public static abstract class a {
        public static final C0054a a = new C0054a(null);
        public static EnumC7560q90 b = EnumC7560q90.Ltr;
        public static int c;

        /* JADX INFO: renamed from: com.daaw.Cu0$a$a, reason: collision with other inner class name */
        public static final class C0054a extends a {
            public /* synthetic */ C0054a(AbstractC2911Yw abstractC2911Yw) {
                this();
            }

            @Override // com.daaw.AbstractC0584Cu0.a
            public EnumC7560q90 g() {
                return a.b;
            }

            @Override // com.daaw.AbstractC0584Cu0.a
            public int h() {
                return a.c;
            }

            public C0054a() {
            }
        }

        public static /* synthetic */ void j(a aVar, AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.i(abstractC0584Cu0, i, i2, f);
        }

        public static /* synthetic */ void l(a aVar, AbstractC0584Cu0 abstractC0584Cu0, long j, float f, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: place-70tqf50");
            }
            if ((i & 2) != 0) {
                f = 0.0f;
            }
            aVar.k(abstractC0584Cu0, j, f);
        }

        public static /* synthetic */ void n(a aVar, AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelative");
            }
            if ((i3 & 4) != 0) {
                f = 0.0f;
            }
            aVar.m(abstractC0584Cu0, i, i2, f);
        }

        public static /* synthetic */ void p(a aVar, AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f, NQ nq, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeRelativeWithLayer");
            }
            float f2 = (i3 & 4) != 0 ? 0.0f : f;
            if ((i3 & 8) != 0) {
                nq = AbstractC0697Du0.a;
            }
            aVar.o(abstractC0584Cu0, i, i2, f2, nq);
        }

        public static /* synthetic */ void r(a aVar, AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f, NQ nq, int i3, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: placeWithLayer");
            }
            float f2 = (i3 & 4) != 0 ? 0.0f : f;
            if ((i3 & 8) != 0) {
                nq = AbstractC0697Du0.a;
            }
            aVar.q(abstractC0584Cu0, i, i2, f2, nq);
        }

        public abstract EnumC7560q90 g();

        public abstract int h();

        public final void i(AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f) {
            G10.g(abstractC0584Cu0, "<this>");
            long jA = E00.a(i, i2);
            long jK0 = abstractC0584Cu0.k0();
            abstractC0584Cu0.r0(E00.a(D00.f(jA) + D00.f(jK0), D00.g(jA) + D00.g(jK0)), f, null);
        }

        public final void k(AbstractC0584Cu0 abstractC0584Cu0, long j, float f) {
            G10.g(abstractC0584Cu0, "$this$place");
            long jK0 = abstractC0584Cu0.k0();
            abstractC0584Cu0.r0(E00.a(D00.f(j) + D00.f(jK0), D00.g(j) + D00.g(jK0)), f, null);
        }

        public final void m(AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f) {
            G10.g(abstractC0584Cu0, "<this>");
            long jA = E00.a(i, i2);
            if (g() == EnumC7560q90.Ltr || h() == 0) {
                long jK0 = abstractC0584Cu0.k0();
                abstractC0584Cu0.r0(E00.a(D00.f(jA) + D00.f(jK0), D00.g(jA) + D00.g(jK0)), f, null);
            } else {
                long jA2 = E00.a((h() - I00.g(abstractC0584Cu0.D)) - D00.f(jA), D00.g(jA));
                long jK02 = abstractC0584Cu0.k0();
                abstractC0584Cu0.r0(E00.a(D00.f(jA2) + D00.f(jK02), D00.g(jA2) + D00.g(jK02)), f, null);
            }
        }

        public final void o(AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f, NQ nq) {
            G10.g(abstractC0584Cu0, "<this>");
            G10.g(nq, "layerBlock");
            long jA = E00.a(i, i2);
            if (g() == EnumC7560q90.Ltr || h() == 0) {
                long jK0 = abstractC0584Cu0.k0();
                abstractC0584Cu0.r0(E00.a(D00.f(jA) + D00.f(jK0), D00.g(jA) + D00.g(jK0)), f, nq);
            } else {
                long jA2 = E00.a((h() - I00.g(abstractC0584Cu0.D)) - D00.f(jA), D00.g(jA));
                long jK02 = abstractC0584Cu0.k0();
                abstractC0584Cu0.r0(E00.a(D00.f(jA2) + D00.f(jK02), D00.g(jA2) + D00.g(jK02)), f, nq);
            }
        }

        public final void q(AbstractC0584Cu0 abstractC0584Cu0, int i, int i2, float f, NQ nq) {
            G10.g(abstractC0584Cu0, "<this>");
            G10.g(nq, "layerBlock");
            long jA = E00.a(i, i2);
            long jK0 = abstractC0584Cu0.k0();
            abstractC0584Cu0.r0(E00.a(D00.f(jA) + D00.f(jK0), D00.g(jA) + D00.g(jK0)), f, nq);
        }

        public final void s(AbstractC0584Cu0 abstractC0584Cu0, long j, float f, NQ nq) {
            G10.g(abstractC0584Cu0, "$this$placeWithLayer");
            G10.g(nq, "layerBlock");
            long jK0 = abstractC0584Cu0.k0();
            abstractC0584Cu0.r0(E00.a(D00.f(j) + D00.f(jK0), D00.g(j) + D00.g(jK0)), f, nq);
        }
    }

    public final long k0() {
        return E00.a((this.B - I00.g(this.D)) / 2, (this.C - I00.f(this.D)) / 2);
    }

    public final int l0() {
        return this.C;
    }

    public int m0() {
        return I00.f(this.D);
    }

    public final long n0() {
        return this.D;
    }

    public int o0() {
        return I00.g(this.D);
    }

    public final long p0() {
        return this.E;
    }

    public final int q0() {
        return this.B;
    }

    public abstract void r0(long j, float f, NQ nq);

    public final void s0() {
        this.B = AbstractC8417tE0.l(I00.g(this.D), C6079kr.p(this.E), C6079kr.n(this.E));
        this.C = AbstractC8417tE0.l(I00.f(this.D), C6079kr.o(this.E), C6079kr.m(this.E));
    }

    public final void t0(long j) {
        if (I00.e(this.D, j)) {
            return;
        }
        this.D = j;
        s0();
    }

    public final void u0(long j) {
        if (C6079kr.g(this.E, j)) {
            return;
        }
        this.E = j;
        s0();
    }
}
