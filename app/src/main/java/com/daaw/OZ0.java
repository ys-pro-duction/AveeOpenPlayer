package com.daaw;

import com.daaw.InterfaceC4943gp;

/* JADX INFO: loaded from: classes.dex */
public abstract class OZ0 {

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ InterfaceC5391iR0 C;
        public final /* synthetic */ long D;
        public final /* synthetic */ float E;
        public final /* synthetic */ int F;
        public final /* synthetic */ float G;
        public final /* synthetic */ InterfaceC3429bR H;

        /* JADX INFO: renamed from: com.daaw.OZ0$a$a, reason: collision with other inner class name */
        public static final class C0103a extends AbstractC4192e90 implements NQ {
            public static final C0103a B = new C0103a();

            public C0103a() {
                super(1);
            }

            public final void a(CP0 cp0) {
                G10.g(cp0, "$this$semantics");
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((CP0) obj);
                return G91.a;
            }
        }

        public static final class b extends SZ0 implements InterfaceC3429bR {
            public int F;

            public b(InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new b(interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                I10.c();
                if (this.F != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
                return ((b) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5391iR0 interfaceC5391iR0, long j, float f, int i, AbstractC7419pg abstractC7419pg, float f2, InterfaceC3429bR interfaceC3429bR) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = interfaceC5391iR0;
            this.D = j;
            this.E = f;
            this.F = i;
            this.G = f2;
            this.H = interfaceC3429bR;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-1822160838, i, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:116)");
            }
            InterfaceC1073Hk0 interfaceC1073Hk0B = UZ0.b(AbstractC8182sP0.a(OZ0.e(this.B, this.C, OZ0.f(this.D, (PF) interfaceC5781jp.O(QF.d()), this.E, interfaceC5781jp, (this.F >> 6) & 14), null, this.G), false, C0103a.B), G91.a, new b(null));
            InterfaceC3429bR interfaceC3429bR = this.H;
            int i2 = this.F;
            interfaceC5781jp.e(733328855);
            InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(H3.a.j(), true, interfaceC5781jp, 48);
            interfaceC5781jp.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
            LQ lqA = aVar.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0B);
            if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                AbstractC3540bp.c();
            }
            interfaceC5781jp.s();
            if (interfaceC5781jp.n()) {
                interfaceC5781jp.E(lqA);
            } else {
                interfaceC5781jp.G();
            }
            interfaceC5781jp.u();
            InterfaceC5781jp interfaceC5781jpA = AbstractC5987ka1.a(interfaceC5781jp);
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0H, aVar.d());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar.b());
            AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar.c());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar.f());
            interfaceC5781jp.i();
            interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
            interfaceC5781jp.e(2058660585);
            interfaceC5781jp.e(-2137368960);
            C9936yg c9936yg = C9936yg.a;
            interfaceC5781jp.e(1539610176);
            interfaceC3429bR.invoke(interfaceC5781jp, Integer.valueOf((i2 >> 18) & 14));
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            interfaceC5781jp.M();
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ InterfaceC5391iR0 C;
        public final /* synthetic */ long D;
        public final /* synthetic */ long E;
        public final /* synthetic */ float F;
        public final /* synthetic */ InterfaceC3429bR G;
        public final /* synthetic */ int H;
        public final /* synthetic */ int I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5391iR0 interfaceC5391iR0, long j, long j2, AbstractC7419pg abstractC7419pg, float f, InterfaceC3429bR interfaceC3429bR, int i, int i2) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = interfaceC5391iR0;
            this.D = j;
            this.E = j2;
            this.F = f;
            this.G = interfaceC3429bR;
            this.H = i;
            this.I = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            OZ0.a(this.B, this.C, this.D, this.E, null, this.F, this.G, interfaceC5781jp, this.H | 1, this.I);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ InterfaceC5391iR0 C;
        public final /* synthetic */ long D;
        public final /* synthetic */ float E;
        public final /* synthetic */ int F;
        public final /* synthetic */ float G;
        public final /* synthetic */ InterfaceC4650fm0 H;
        public final /* synthetic */ boolean I;
        public final /* synthetic */ LQ J;
        public final /* synthetic */ InterfaceC3429bR K;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5391iR0 interfaceC5391iR0, long j, float f, int i, AbstractC7419pg abstractC7419pg, float f2, InterfaceC4650fm0 interfaceC4650fm0, boolean z, LQ lq, InterfaceC3429bR interfaceC3429bR) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = interfaceC5391iR0;
            this.D = j;
            this.E = f;
            this.F = i;
            this.G = f2;
            this.H = interfaceC4650fm0;
            this.I = z;
            this.J = lq;
            this.K = interfaceC3429bR;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(2031491085, i, -1, "androidx.compose.material.Surface.<anonymous> (Surface.kt:224)");
            }
            InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC1388Kl.b(OZ0.e(N41.b(this.B), this.C, OZ0.f(this.D, (PF) interfaceC5781jp.O(QF.d()), this.E, interfaceC5781jp, (this.F >> 12) & 14), null, this.G), this.H, KJ0.e(false, 0.0f, 0L, interfaceC5781jp, 0, 7), (8 & 4) != 0 ? true : this.I, (8 & 8) != 0 ? null : null, (8 & 16) != 0 ? null : OJ0.g(OJ0.b.a()), this.J);
            InterfaceC3429bR interfaceC3429bR = this.K;
            int i2 = this.F;
            interfaceC5781jp.e(733328855);
            InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(H3.a.j(), true, interfaceC5781jp, 48);
            interfaceC5781jp.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
            LQ lqA = aVar.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0B);
            if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                AbstractC3540bp.c();
            }
            interfaceC5781jp.s();
            if (interfaceC5781jp.n()) {
                interfaceC5781jp.E(lqA);
            } else {
                interfaceC5781jp.G();
            }
            interfaceC5781jp.u();
            InterfaceC5781jp interfaceC5781jpA = AbstractC5987ka1.a(interfaceC5781jp);
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0H, aVar.d());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar.b());
            AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar.c());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar.f());
            interfaceC5781jp.i();
            interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
            interfaceC5781jp.e(2058660585);
            interfaceC5781jp.e(-2137368960);
            C9936yg c9936yg = C9936yg.a;
            interfaceC5781jp.e(-390905273);
            interfaceC3429bR.invoke(interfaceC5781jp, Integer.valueOf((i2 >> 27) & 14));
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            interfaceC5781jp.M();
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ InterfaceC1073Hk0 C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ InterfaceC5391iR0 E;
        public final /* synthetic */ long F;
        public final /* synthetic */ long G;
        public final /* synthetic */ float H;
        public final /* synthetic */ InterfaceC4650fm0 I;
        public final /* synthetic */ InterfaceC3429bR J;
        public final /* synthetic */ int K;
        public final /* synthetic */ int L;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LQ lq, InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, InterfaceC5391iR0 interfaceC5391iR0, long j, long j2, AbstractC7419pg abstractC7419pg, float f, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC3429bR interfaceC3429bR, int i, int i2) {
            super(2);
            this.B = lq;
            this.C = interfaceC1073Hk0;
            this.D = z;
            this.E = interfaceC5391iR0;
            this.F = j;
            this.G = j2;
            this.H = f;
            this.I = interfaceC4650fm0;
            this.J = interfaceC3429bR;
            this.K = i;
            this.L = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            OZ0.b(this.B, this.C, this.D, this.E, this.F, this.G, null, this.H, this.I, this.J, interfaceC5781jp, this.K | 1, this.L);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ef A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.daaw.InterfaceC1073Hk0 r24, com.daaw.InterfaceC5391iR0 r25, long r26, long r28, com.daaw.AbstractC7419pg r30, float r31, com.daaw.InterfaceC3429bR r32, com.daaw.InterfaceC5781jp r33, int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 509
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.OZ0.a(com.daaw.Hk0, com.daaw.iR0, long, long, com.daaw.pg, float, com.daaw.bR, com.daaw.jp, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x029e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0148  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(com.daaw.LQ r31, com.daaw.InterfaceC1073Hk0 r32, boolean r33, com.daaw.InterfaceC5391iR0 r34, long r35, long r37, com.daaw.AbstractC7419pg r39, float r40, com.daaw.InterfaceC4650fm0 r41, com.daaw.InterfaceC3429bR r42, com.daaw.InterfaceC5781jp r43, int r44, int r45) {
        /*
            Method dump skipped, instruction units count: 686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.OZ0.b(com.daaw.LQ, com.daaw.Hk0, boolean, com.daaw.iR0, long, long, com.daaw.pg, float, com.daaw.fm0, com.daaw.bR, com.daaw.jp, int, int):void");
    }

    public static final InterfaceC1073Hk0 e(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5391iR0 interfaceC5391iR0, long j, AbstractC7419pg abstractC7419pg, float f) {
        return AbstractC4082dm.a(AbstractC3763ce.a(AbstractC4554fR0.b(interfaceC1073Hk0, f, interfaceC5391iR0, false, 0L, 0L, 24, null).g(InterfaceC1073Hk0.m), j, interfaceC5391iR0), interfaceC5391iR0);
    }

    public static final long f(long j, PF pf, float f, InterfaceC5781jp interfaceC5781jp, int i) {
        InterfaceC5781jp interfaceC5781jp2;
        long jA;
        interfaceC5781jp.e(1561611256);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(1561611256, i, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:632)");
        }
        if (!C2559Vm.o(j, C6309lh0.a.a(interfaceC5781jp, 6).n()) || pf == null) {
            interfaceC5781jp2 = interfaceC5781jp;
            jA = j;
        } else {
            interfaceC5781jp2 = interfaceC5781jp;
            jA = pf.a(j, f, interfaceC5781jp2, (i & 14) | ((i >> 3) & 112) | ((i << 3) & 896));
        }
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp2.L();
        return jA;
    }
}
