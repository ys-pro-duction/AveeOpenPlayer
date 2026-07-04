package com.daaw;

/* JADX INFO: renamed from: com.daaw.qo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7739qo0 implements Comparable {
    public static final a F = new a(null);
    public static b G = b.Stripe;
    public final E90 B;
    public final E90 C;
    public final C3103aF0 D;
    public final EnumC7560q90 E;

    /* JADX INFO: renamed from: com.daaw.qo0$a */
    public static final class a {
        public /* synthetic */ a(AbstractC2911Yw abstractC2911Yw) {
            this();
        }

        public final void a(b bVar) {
            G10.g(bVar, "<set-?>");
            C7739qo0.G = bVar;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.qo0$b */
    public enum b {
        Stripe,
        Location
    }

    /* JADX INFO: renamed from: com.daaw.qo0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C3103aF0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C3103aF0 c3103aF0) {
            super(1);
            this.B = c3103aF0;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E90 e90) {
            G10.g(e90, "it");
            K90 k90E = DP0.e(e90);
            return Boolean.valueOf(k90E.C() && !G10.c(this.B, AbstractC7281p90.b(k90E)));
        }
    }

    /* JADX INFO: renamed from: com.daaw.qo0$d */
    public static final class d extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C3103aF0 B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(C3103aF0 c3103aF0) {
            super(1);
            this.B = c3103aF0;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(E90 e90) {
            G10.g(e90, "it");
            K90 k90E = DP0.e(e90);
            return Boolean.valueOf(k90E.C() && !G10.c(this.B, AbstractC7281p90.b(k90E)));
        }
    }

    public C7739qo0(E90 e90, E90 e902) {
        G10.g(e90, "subtreeRoot");
        G10.g(e902, "node");
        this.B = e90;
        this.C = e902;
        this.E = e90.getLayoutDirection();
        K90 k90V = e90.V();
        K90 k90E = DP0.e(e902);
        C3103aF0 c3103aF0A = null;
        if (k90V.C() && k90E.C()) {
            c3103aF0A = AbstractC6723n90.a(k90V, k90E, false, 2, null);
        }
        this.D = c3103aF0A;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(C7739qo0 c7739qo0) {
        G10.g(c7739qo0, "other");
        C3103aF0 c3103aF0 = this.D;
        if (c3103aF0 == null) {
            return 1;
        }
        if (c7739qo0.D == null) {
            return -1;
        }
        if (G == b.Stripe) {
            if (c3103aF0.c() - c7739qo0.D.i() <= 0.0f) {
                return -1;
            }
            if (this.D.i() - c7739qo0.D.c() >= 0.0f) {
                return 1;
            }
        }
        if (this.E == EnumC7560q90.Ltr) {
            float f = this.D.f() - c7739qo0.D.f();
            if (f != 0.0f) {
                return f < 0.0f ? -1 : 1;
            }
        } else {
            float fG = this.D.g() - c7739qo0.D.g();
            if (fG != 0.0f) {
                return fG < 0.0f ? 1 : -1;
            }
        }
        float fI = this.D.i() - c7739qo0.D.i();
        if (fI != 0.0f) {
            return fI < 0.0f ? -1 : 1;
        }
        float fE = this.D.e() - c7739qo0.D.e();
        if (fE != 0.0f) {
            return fE < 0.0f ? 1 : -1;
        }
        float fJ = this.D.j() - c7739qo0.D.j();
        if (fJ != 0.0f) {
            return fJ < 0.0f ? 1 : -1;
        }
        C3103aF0 c3103aF0B = AbstractC7281p90.b(DP0.e(this.C));
        C3103aF0 c3103aF0B2 = AbstractC7281p90.b(DP0.e(c7739qo0.C));
        E90 e90A = DP0.a(this.C, new c(c3103aF0B));
        E90 e90A2 = DP0.a(c7739qo0.C, new d(c3103aF0B2));
        return (e90A == null || e90A2 == null) ? e90A != null ? 1 : -1 : new C7739qo0(this.B, e90A).compareTo(new C7739qo0(c7739qo0.B, e90A2));
    }

    public final E90 g() {
        return this.C;
    }
}
