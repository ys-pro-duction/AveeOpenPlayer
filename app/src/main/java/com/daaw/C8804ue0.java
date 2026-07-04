package com.daaw;

import com.revenuecat.purchases.common.UtilsKt;

/* JADX INFO: renamed from: com.daaw.ue0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C8804ue0 implements InterfaceC8525te0 {
    public final InterfaceC8007rm0 B = AbstractC9046vU0.d(Boolean.FALSE, null, 2, null);
    public final InterfaceC8007rm0 C = AbstractC9046vU0.d(Float.valueOf(0.0f), null, 2, null);
    public final InterfaceC8007rm0 D = AbstractC9046vU0.d(1, null, 2, null);
    public final InterfaceC8007rm0 E = AbstractC9046vU0.d(1, null, 2, null);
    public final InterfaceC8007rm0 F = AbstractC9046vU0.d(null, null, 2, null);
    public final InterfaceC8007rm0 G = AbstractC9046vU0.d(Float.valueOf(1.0f), null, 2, null);
    public final InterfaceC8007rm0 H = AbstractC9046vU0.d(null, null, 2, null);
    public final InterfaceC8007rm0 I = AbstractC9046vU0.d(Long.MIN_VALUE, null, 2, null);
    public final InterfaceC6258lW0 J = AbstractC7923rU0.a(new d());
    public final InterfaceC6258lW0 K = AbstractC7923rU0.a(new e());
    public final C0769Em0 L = new C0769Em0();

    /* JADX INFO: renamed from: com.daaw.ue0$a */
    public static final class a extends SZ0 implements NQ {
        public int F;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;
        public final /* synthetic */ float J;
        public final /* synthetic */ C0737Ee0 K;
        public final /* synthetic */ float L;
        public final /* synthetic */ boolean M;
        public final /* synthetic */ EnumC0520Ce0 N;

        /* JADX INFO: renamed from: com.daaw.ue0$a$a, reason: collision with other inner class name */
        public static final class C0239a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public final /* synthetic */ EnumC0520Ce0 G;
            public final /* synthetic */ U30 H;
            public final /* synthetic */ int I;
            public final /* synthetic */ int J;
            public final /* synthetic */ C8804ue0 K;

            /* JADX INFO: renamed from: com.daaw.ue0$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0240a {
                public static final /* synthetic */ int[] a;

                static {
                    int[] iArr = new int[EnumC0520Ce0.values().length];
                    iArr[EnumC0520Ce0.OnIterationFinish.ordinal()] = 1;
                    a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0239a(EnumC0520Ce0 enumC0520Ce0, U30 u30, int i, int i2, C8804ue0 c8804ue0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.G = enumC0520Ce0;
                this.H = u30;
                this.I = i;
                this.J = i2;
                this.K = c8804ue0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new C0239a(this.G, this.H, this.I, this.J, this.K, interfaceC1416Ks);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:15:0x0034 A[ADDED_TO_REGION, REMOVE] */
            /* JADX WARN: Removed duplicated region for block: B:18:0x0040 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0049  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x003e -> B:19:0x0041). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // com.daaw.AbstractC7409pe
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object q(java.lang.Object r4) {
                /*
                    r3 = this;
                    java.lang.Object r0 = com.daaw.I10.c()
                    int r1 = r3.F
                    r2 = 1
                    if (r1 == 0) goto L17
                    if (r1 != r2) goto Lf
                    com.daaw.AbstractC4801gJ0.b(r4)
                    goto L41
                Lf:
                    java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r4.<init>(r0)
                    throw r4
                L17:
                    com.daaw.AbstractC4801gJ0.b(r4)
                L1a:
                    com.daaw.Ce0 r4 = r3.G
                    int[] r1 = com.daaw.C8804ue0.a.C0239a.C0240a.a
                    int r4 = r4.ordinal()
                    r4 = r1[r4]
                    if (r4 != r2) goto L34
                    com.daaw.U30 r4 = r3.H
                    boolean r4 = r4.d()
                    if (r4 == 0) goto L31
                    int r4 = r3.I
                    goto L36
                L31:
                    int r4 = r3.J
                    goto L36
                L34:
                    int r4 = r3.I
                L36:
                    com.daaw.ue0 r1 = r3.K
                    r3.F = r2
                    java.lang.Object r4 = com.daaw.C8804ue0.e(r1, r4, r3)
                    if (r4 != r0) goto L41
                    return r0
                L41:
                    java.lang.Boolean r4 = (java.lang.Boolean) r4
                    boolean r4 = r4.booleanValue()
                    if (r4 != 0) goto L1a
                    com.daaw.G91 r4 = com.daaw.G91.a
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.C8804ue0.a.C0239a.q(java.lang.Object):java.lang.Object");
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((C0239a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX INFO: renamed from: com.daaw.ue0$a$b */
        public /* synthetic */ class b {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC0520Ce0.values().length];
                iArr[EnumC0520Ce0.OnIterationFinish.ordinal()] = 1;
                iArr[EnumC0520Ce0.Immediately.ordinal()] = 2;
                a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i, int i2, float f, AbstractC0633De0 abstractC0633De0, C0737Ee0 c0737Ee0, float f2, boolean z, EnumC0520Ce0 enumC0520Ce0, InterfaceC1416Ks interfaceC1416Ks) {
            super(1, interfaceC1416Ks);
            this.H = i;
            this.I = i2;
            this.J = f;
            this.K = c0737Ee0;
            this.L = f2;
            this.M = z;
            this.N = enumC0520Ce0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            InterfaceC4684ft interfaceC4684ft;
            Object objC = I10.c();
            int i = this.F;
            try {
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    C8804ue0.this.E(this.H);
                    C8804ue0.this.F(this.I);
                    C8804ue0.this.J(this.J);
                    C8804ue0.this.C(null);
                    C8804ue0.this.D(this.K);
                    C8804ue0.this.I(this.L);
                    if (!this.M) {
                        C8804ue0.this.G(Long.MIN_VALUE);
                    }
                    if (this.K == null) {
                        C8804ue0.this.H(false);
                        return G91.a;
                    }
                    if (Float.isInfinite(this.J)) {
                        C8804ue0 c8804ue0 = C8804ue0.this;
                        c8804ue0.I(c8804ue0.y());
                        C8804ue0.this.H(false);
                        C8804ue0.this.E(this.I);
                        return G91.a;
                    }
                    C8804ue0.this.H(true);
                    int i2 = b.a[this.N.ordinal()];
                    if (i2 == 1) {
                        interfaceC4684ft = C8296so0.C;
                    } else {
                        if (i2 != 2) {
                            throw new C6902no0();
                        }
                        interfaceC4684ft = C5905kG.B;
                    }
                    C0239a c0239a = new C0239a(this.N, AbstractC3053a40.k(getContext()), this.I, this.H, C8804ue0.this, null);
                    this.F = 1;
                    if (AbstractC8539th.f(interfaceC4684ft, c0239a, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                AbstractC3053a40.i(getContext());
                C8804ue0.this.H(false);
                return G91.a;
            } catch (Throwable th) {
                C8804ue0.this.H(false);
                throw th;
            }
        }

        public final InterfaceC1416Ks u(InterfaceC1416Ks interfaceC1416Ks) {
            return C8804ue0.this.new a(this.H, this.I, this.J, null, this.K, this.L, this.M, this.N, interfaceC1416Ks);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) u(interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ue0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.C = i;
        }

        public final Boolean a(long j) {
            return Boolean.valueOf(C8804ue0.this.B(this.C, j));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ue0$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i) {
            super(1);
            this.C = i;
        }

        public final Boolean a(long j) {
            return Boolean.valueOf(C8804ue0.this.B(this.C, j));
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((Number) obj).longValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ue0$d */
    public static final class d extends AbstractC4192e90 implements LQ {
        public d() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            float f = 0.0f;
            if (C8804ue0.this.j() != null) {
                if (C8804ue0.this.c() < 0.0f) {
                    C8804ue0.this.l();
                } else {
                    C8804ue0.this.l();
                    f = 1.0f;
                }
            }
            return Float.valueOf(f);
        }
    }

    /* JADX INFO: renamed from: com.daaw.ue0$e */
    public static final class e extends AbstractC4192e90 implements LQ {
        public e() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf(C8804ue0.this.h() == C8804ue0.this.b() && C8804ue0.this.g() == C8804ue0.this.y());
        }
    }

    /* JADX INFO: renamed from: com.daaw.ue0$f */
    public static final class f extends SZ0 implements NQ {
        public int F;
        public final /* synthetic */ C0737Ee0 H;
        public final /* synthetic */ float I;
        public final /* synthetic */ int J;
        public final /* synthetic */ boolean K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(C0737Ee0 c0737Ee0, float f, int i, boolean z, InterfaceC1416Ks interfaceC1416Ks) {
            super(1, interfaceC1416Ks);
            this.H = c0737Ee0;
            this.I = f;
            this.J = i;
            this.K = z;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            if (this.F != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            C8804ue0.this.D(this.H);
            C8804ue0.this.I(this.I);
            C8804ue0.this.E(this.J);
            C8804ue0.this.H(false);
            if (this.K) {
                C8804ue0.this.G(Long.MIN_VALUE);
            }
            return G91.a;
        }

        public final InterfaceC1416Ks u(InterfaceC1416Ks interfaceC1416Ks) {
            return C8804ue0.this.new f(this.H, this.I, this.J, this.K, interfaceC1416Ks);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1416Ks interfaceC1416Ks) {
            return ((f) u(interfaceC1416Ks)).q(G91.a);
        }
    }

    @Override // com.daaw.InterfaceC6258lW0
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public Float getValue() {
        return Float.valueOf(g());
    }

    public final boolean B(int i, long j) {
        C0737Ee0 c0737Ee0J = j();
        if (c0737Ee0J == null) {
            return true;
        }
        long jZ = z() == Long.MIN_VALUE ? 0L : j - z();
        G(j);
        l();
        l();
        float fD = ((jZ / ((long) UtilsKt.MICROS_MULTIPLIER)) / c0737Ee0J.d()) * c();
        float fG = c() < 0.0f ? 0.0f - (g() + fD) : (g() + fD) - 1.0f;
        if (fG < 0.0f) {
            I(AbstractC8417tE0.k(g(), 0.0f, 1.0f) + fD);
        } else {
            float f2 = 1.0f - 0.0f;
            int i2 = (int) (fG / f2);
            int i3 = i2 + 1;
            if (h() + i3 > i) {
                I(y());
                E(i);
                return false;
            }
            E(h() + i3);
            float f3 = fG - (i2 * f2);
            I(c() < 0.0f ? 1.0f - f3 : 0.0f + f3);
        }
        return true;
    }

    public final void C(AbstractC0633De0 abstractC0633De0) {
        this.F.setValue(abstractC0633De0);
    }

    public final void D(C0737Ee0 c0737Ee0) {
        this.H.setValue(c0737Ee0);
    }

    public final void E(int i) {
        this.D.setValue(Integer.valueOf(i));
    }

    public final void F(int i) {
        this.E.setValue(Integer.valueOf(i));
    }

    public final void G(long j) {
        this.I.setValue(Long.valueOf(j));
    }

    public final void H(boolean z) {
        this.B.setValue(Boolean.valueOf(z));
    }

    public final void I(float f2) {
        this.C.setValue(Float.valueOf(f2));
    }

    public final void J(float f2) {
        this.G.setValue(Float.valueOf(f2));
    }

    @Override // com.daaw.InterfaceC9648xe0
    public int b() {
        return ((Number) this.E.getValue()).intValue();
    }

    @Override // com.daaw.InterfaceC9648xe0
    public float c() {
        return ((Number) this.G.getValue()).floatValue();
    }

    @Override // com.daaw.InterfaceC8525te0
    public Object d(C0737Ee0 c0737Ee0, int i, int i2, float f2, AbstractC0633De0 abstractC0633De0, float f3, boolean z, EnumC0520Ce0 enumC0520Ce0, boolean z2, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = C0769Em0.e(this.L, null, new a(i, i2, f2, abstractC0633De0, c0737Ee0, f3, z, enumC0520Ce0, null), interfaceC1416Ks, 1, null);
        return objE == I10.c() ? objE : G91.a;
    }

    @Override // com.daaw.InterfaceC9648xe0
    public float g() {
        return ((Number) this.C.getValue()).floatValue();
    }

    @Override // com.daaw.InterfaceC9648xe0
    public int h() {
        return ((Number) this.D.getValue()).intValue();
    }

    @Override // com.daaw.InterfaceC9648xe0
    public C0737Ee0 j() {
        return (C0737Ee0) this.H.getValue();
    }

    @Override // com.daaw.InterfaceC9648xe0
    public AbstractC0633De0 l() {
        AbstractC6314li0.a(this.F.getValue());
        return null;
    }

    @Override // com.daaw.InterfaceC8525te0
    public Object n(C0737Ee0 c0737Ee0, float f2, int i, boolean z, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = C0769Em0.e(this.L, null, new f(c0737Ee0, f2, i, z, null), interfaceC1416Ks, 1, null);
        return objE == I10.c() ? objE : G91.a;
    }

    public final Object x(int i, InterfaceC1416Ks interfaceC1416Ks) {
        return i == Integer.MAX_VALUE ? CZ.a(new b(i), interfaceC1416Ks) : AbstractC5481il0.b(new c(i), interfaceC1416Ks);
    }

    public final float y() {
        return ((Number) this.J.getValue()).floatValue();
    }

    public long z() {
        return ((Number) this.I.getValue()).longValue();
    }
}
