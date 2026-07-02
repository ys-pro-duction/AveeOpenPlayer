package com.daaw;

import com.daaw.InterfaceC5781jp;

/* JADX INFO: renamed from: com.daaw.qx, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7780qx implements InterfaceC6221lN {
    public final float a;
    public final float b;
    public final float c;
    public final float d;

    /* JADX INFO: renamed from: com.daaw.qx$a */
    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ Z00 G;
        public final /* synthetic */ C9325wU0 H;

        /* JADX INFO: renamed from: com.daaw.qx$a$a, reason: collision with other inner class name */
        public static final class C0227a implements InterfaceC7337pN {
            public final /* synthetic */ C9325wU0 B;

            public C0227a(C9325wU0 c9325wU0) {
                this.B = c9325wU0;
            }

            @Override // com.daaw.InterfaceC7337pN
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object c(Y00 y00, InterfaceC1416Ks interfaceC1416Ks) {
                if (y00 instanceof C7094oW) {
                    this.B.add(y00);
                } else if (y00 instanceof C7373pW) {
                    this.B.remove(((C7373pW) y00).a());
                } else if (y00 instanceof LN) {
                    this.B.add(y00);
                } else if (y00 instanceof MN) {
                    this.B.remove(((MN) y00).a());
                } else if (y00 instanceof C6115kz0) {
                    this.B.add(y00);
                } else if (y00 instanceof C6394lz0) {
                    this.B.remove(((C6394lz0) y00).a());
                } else if (y00 instanceof C5827jz0) {
                    this.B.remove(((C5827jz0) y00).a());
                }
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Z00 z00, C9325wU0 c9325wU0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = z00;
            this.H = c9325wU0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, this.H, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC7058oN interfaceC7058oNB = this.G.b();
                C0227a c0227a = new C0227a(this.H);
                this.F = 1;
                if (interfaceC7058oNB.a(c0227a, this) == objC) {
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

    /* JADX INFO: renamed from: com.daaw.qx$b */
    public static final class b extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ F6 G;
        public final /* synthetic */ C7780qx H;
        public final /* synthetic */ float I;
        public final /* synthetic */ Y00 J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(F6 f6, C7780qx c7780qx, float f, Y00 y00, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = f6;
            this.H = c7780qx;
            this.I = f;
            this.J = y00;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new b(this.G, this.H, this.I, this.J, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                float fQ = ((C6460mD) this.G.m()).q();
                Y00 ln = null;
                if (C6460mD.n(fQ, this.H.b)) {
                    ln = new C6115kz0(C9982yp0.b.c(), null);
                } else if (C6460mD.n(fQ, this.H.c)) {
                    ln = new C7094oW();
                } else if (C6460mD.n(fQ, this.H.d)) {
                    ln = new LN();
                }
                F6 f6 = this.G;
                float f = this.I;
                Y00 y00 = this.J;
                this.F = 1;
                if (OF.d(f6, f, ln, y00, this) == objC) {
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
            return ((b) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public /* synthetic */ C7780qx(float f, float f2, float f3, float f4, AbstractC2911Yw abstractC2911Yw) {
        this(f, f2, f3, f4);
    }

    @Override // com.daaw.InterfaceC6221lN
    public InterfaceC6258lW0 a(Z00 z00, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(z00, "interactionSource");
        interfaceC5781jp.e(-478475335);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-478475335, i, -1, "androidx.compose.material.DefaultFloatingActionButtonElevation.elevation (FloatingActionButton.kt:269)");
        }
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
        if (objF == aVar.a()) {
            objF = AbstractC7923rU0.b();
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        C9325wU0 c9325wU0 = (C9325wU0) objF;
        int i2 = i & 14;
        interfaceC5781jp.e(511388516);
        boolean zP = interfaceC5781jp.P(z00) | interfaceC5781jp.P(c9325wU0);
        Object objF2 = interfaceC5781jp.f();
        if (zP || objF2 == aVar.a()) {
            objF2 = new a(z00, c9325wU0, null);
            interfaceC5781jp.H(objF2);
        }
        interfaceC5781jp.L();
        AbstractC8420tF.c(z00, (InterfaceC3429bR) objF2, interfaceC5781jp, i2 | 64);
        Y00 y00 = (Y00) AbstractC2455Um.r0(c9325wU0);
        float f = y00 instanceof C6115kz0 ? this.b : y00 instanceof C7094oW ? this.c : y00 instanceof LN ? this.d : this.a;
        interfaceC5781jp.e(-492369756);
        Object objF3 = interfaceC5781jp.f();
        if (objF3 == aVar.a()) {
            Object f6 = new F6(C6460mD.g(f), AbstractC2521Vc1.b(C6460mD.C), null, 4, null);
            interfaceC5781jp.H(f6);
            objF3 = f6;
        }
        interfaceC5781jp.L();
        F6 f62 = (F6) objF3;
        AbstractC8420tF.c(C6460mD.g(f), new b(f62, this, f, y00, null), interfaceC5781jp, 64);
        InterfaceC6258lW0 interfaceC6258lW0G = f62.g();
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return interfaceC6258lW0G;
    }

    public C7780qx(float f, float f2, float f3, float f4) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }
}
