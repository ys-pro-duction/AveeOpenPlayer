package com.daaw;

import com.daaw.InterfaceC4943gp;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class ZT0 {

    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ List B;
        public final /* synthetic */ JJ C;

        /* JADX INFO: renamed from: com.daaw.ZT0$a$a, reason: collision with other inner class name */
        public static final class C0138a extends AbstractC4192e90 implements NQ {

            /* JADX INFO: renamed from: com.daaw.ZT0$a$a$a, reason: collision with other inner class name */
            public static final class C0139a extends AbstractC4192e90 implements LQ {
                public C0139a(XT0 xt0) {
                    super(0);
                }

                @Override // com.daaw.LQ
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    throw null;
                }
            }

            public C0138a(XT0 xt0) {
                super(1);
            }

            public final void a(CP0 cp0) {
                G10.g(cp0, "$this$semantics");
                AP0.n(cp0, C10196zc0.b.b());
                AP0.d(cp0, null, new C0139a(null), 1, null);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((CP0) obj);
                return G91.a;
            }
        }

        public static final class b extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ JJ B;

            /* JADX INFO: renamed from: com.daaw.ZT0$a$b$a, reason: collision with other inner class name */
            public static final class C0140a extends AbstractC4192e90 implements NQ {
                public C0140a(XT0 xt0) {
                    super(1);
                }

                @Override // com.daaw.NQ
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(IJ ij) {
                    G10.g(ij, "it");
                    return Boolean.valueOf(G10.c(ij.c(), null));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(XT0 xt0, JJ jj) {
                super(0);
                this.B = jj;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m38invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m38invoke() {
                if (G10.c(null, this.B.a())) {
                    return;
                }
                AbstractC2141Rm.G(this.B.b(), new C0140a(null));
                UE0 ue0C = this.B.c();
                if (ue0C != null) {
                    ue0C.invalidate();
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(XT0 xt0, XT0 xt02, List list, JJ jj) {
            super(3);
            this.B = list;
            this.C = jj;
        }

        public final void a(InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i) {
            int i2;
            G10.g(interfaceC3429bR, "children");
            if ((i & 14) == 0) {
                i2 = i | (interfaceC5781jp.P(interfaceC3429bR) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-94104314, i2, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:270)");
            }
            boolean zC = G10.c(null, null);
            int i3 = zC ? 150 : 75;
            int i4 = (!zC || AbstractC2455Um.b0(this.B).size() == 1) ? 0 : 75;
            InterfaceC6258lW0 interfaceC6258lW0F = ZT0.f(AbstractC6154l7.c(i3, i4, AbstractC4495fF.b()), zC, new b(null, this.C), interfaceC5781jp, 0, 0);
            InterfaceC6258lW0 interfaceC6258lW0G = ZT0.g(AbstractC6154l7.c(i3, i4, AbstractC4495fF.a()), zC, interfaceC5781jp, 0);
            InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC8182sP0.b(ST.c(InterfaceC1073Hk0.m, ((Number) interfaceC6258lW0G.getValue()).floatValue(), ((Number) interfaceC6258lW0G.getValue()).floatValue(), ((Number) interfaceC6258lW0F.getValue()).floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65528, null), false, new C0138a(null), 1, null);
            interfaceC5781jp.e(733328855);
            InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(H3.a.j(), false, interfaceC5781jp, 0);
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
            interfaceC5781jp.e(-421978688);
            interfaceC3429bR.invoke(interfaceC5781jp, Integer.valueOf(i2 & 14));
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

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC3429bR) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC3986dR B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3986dR interfaceC3986dR, XT0 xt0, int i) {
            super(2);
            this.B = interfaceC3986dR;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(2041982076, i, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:319)");
            }
            InterfaceC3986dR interfaceC3986dR = this.B;
            G10.d(null);
            interfaceC3986dR.invoke(null, interfaceC5781jp, Integer.valueOf((this.C >> 3) & 112));
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

    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ InterfaceC3986dR C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(XT0 xt0, InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC3986dR interfaceC3986dR, int i, int i2) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = interfaceC3986dR;
            this.D = i;
            this.E = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            ZT0.a(null, this.B, this.C, interfaceC5781jp, this.D | 1, this.E);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class d extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ InterfaceC8076s1 G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(XT0 xt0, InterfaceC8076s1 interfaceC8076s1, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = interfaceC8076s1;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new d(null, this.G, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                return G91.a;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC4801gJ0.b(obj);
            throw null;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((d) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class e extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C3163aU0 B;
        public final /* synthetic */ InterfaceC1073Hk0 C;
        public final /* synthetic */ InterfaceC3986dR D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C3163aU0 c3163aU0, InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC3986dR interfaceC3986dR, int i, int i2) {
            super(2);
            this.B = c3163aU0;
            this.C = interfaceC1073Hk0;
            this.D = interfaceC3986dR;
            this.E = i;
            this.F = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            ZT0.b(this.B, this.C, this.D, interfaceC5781jp, this.E | 1, this.F);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class f extends AbstractC4192e90 implements LQ {
        public static final f B = new f();

        public f() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m39invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m39invoke() {
        }
    }

    public static final class g extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ F6 G;
        public final /* synthetic */ boolean H;
        public final /* synthetic */ InterfaceC5866k7 I;
        public final /* synthetic */ LQ J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(F6 f6, boolean z, InterfaceC5866k7 interfaceC5866k7, LQ lq, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = f6;
            this.H = z;
            this.I = interfaceC5866k7;
            this.J = lq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new g(this.G, this.H, this.I, this.J, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            g gVar;
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                F6 f6 = this.G;
                Float fB = AbstractC0527Cg.b(this.H ? 1.0f : 0.0f);
                InterfaceC5866k7 interfaceC5866k7 = this.I;
                this.F = 1;
                gVar = this;
                if (F6.f(f6, fB, interfaceC5866k7, null, null, gVar, 12, null) == objC) {
                    return objC;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC4801gJ0.b(obj);
                gVar = this;
            }
            gVar.J.invoke();
            return G91.a;
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((g) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class h extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ F6 G;
        public final /* synthetic */ boolean H;
        public final /* synthetic */ InterfaceC5866k7 I;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(F6 f6, boolean z, InterfaceC5866k7 interfaceC5866k7, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = f6;
            this.H = z;
            this.I = interfaceC5866k7;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new h(this.G, this.H, this.I, interfaceC1416Ks);
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                F6 f6 = this.G;
                Float fB = AbstractC0527Cg.b(this.H ? 1.0f : 0.8f);
                InterfaceC5866k7 interfaceC5866k7 = this.I;
                this.F = 1;
                if (F6.f(f6, fB, interfaceC5866k7, null, null, this, 12, null) == objC) {
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
            return ((h) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01da A[LOOP:2: B:70:0x01d8->B:71:0x01da, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x022f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.daaw.XT0 r18, com.daaw.InterfaceC1073Hk0 r19, com.daaw.InterfaceC3986dR r20, com.daaw.InterfaceC5781jp r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 570
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.ZT0.a(com.daaw.XT0, com.daaw.Hk0, com.daaw.dR, com.daaw.jp, int, int):void");
    }

    public static final void b(C3163aU0 c3163aU0, InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC3986dR interfaceC3986dR, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        int i3;
        InterfaceC1073Hk0 interfaceC1073Hk02;
        InterfaceC3986dR interfaceC3986dR2;
        G10.g(c3163aU0, "hostState");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(431012348);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(c3163aU0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= interfaceC5781jpQ.P(interfaceC1073Hk0) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= interfaceC5781jpQ.P(interfaceC3986dR) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
            interfaceC1073Hk02 = interfaceC1073Hk0;
            interfaceC3986dR2 = interfaceC3986dR;
        } else {
            if (i4 != 0) {
                interfaceC1073Hk0 = InterfaceC1073Hk0.m;
            }
            if (i5 != 0) {
                interfaceC3986dR = C2775Xo.a.a();
            }
            InterfaceC3986dR interfaceC3986dR3 = interfaceC3986dR;
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(431012348, i3, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:150)");
            }
            c3163aU0.a();
            AbstractC8420tF.c(null, new d(null, (InterfaceC8076s1) interfaceC5781jpQ.O(AbstractC2259Sp.c()), null), interfaceC5781jpQ, 64);
            c3163aU0.a();
            InterfaceC1073Hk0 interfaceC1073Hk03 = interfaceC1073Hk0;
            a(null, interfaceC1073Hk03, interfaceC3986dR3, interfaceC5781jpQ, i3 & 1008, 0);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
            interfaceC1073Hk02 = interfaceC1073Hk03;
            interfaceC3986dR2 = interfaceC3986dR3;
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new e(c3163aU0, interfaceC1073Hk02, interfaceC3986dR2, i, i2));
    }

    public static final InterfaceC6258lW0 f(InterfaceC5866k7 interfaceC5866k7, boolean z, LQ lq, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        interfaceC5781jp.e(1016418159);
        if ((i2 & 4) != 0) {
            lq = f.B;
        }
        LQ lq2 = lq;
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(1016418159, i, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:342)");
        }
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            objF = L6.b(!z ? 1.0f : 0.0f, 0.0f, 2, null);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        F6 f6 = (F6) objF;
        AbstractC8420tF.c(Boolean.valueOf(z), new g(f6, z, interfaceC5866k7, lq2, null), interfaceC5781jp, ((i >> 3) & 14) | 64);
        InterfaceC6258lW0 interfaceC6258lW0G = f6.g();
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return interfaceC6258lW0G;
    }

    public static final InterfaceC6258lW0 g(InterfaceC5866k7 interfaceC5866k7, boolean z, InterfaceC5781jp interfaceC5781jp, int i) {
        interfaceC5781jp.e(2003504988);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(2003504988, i, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:359)");
        }
        interfaceC5781jp.e(-492369756);
        Object objF = interfaceC5781jp.f();
        if (objF == InterfaceC5781jp.a.a()) {
            objF = L6.b(!z ? 1.0f : 0.8f, 0.0f, 2, null);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        F6 f6 = (F6) objF;
        AbstractC8420tF.c(Boolean.valueOf(z), new h(f6, z, interfaceC5866k7, null), interfaceC5781jp, ((i >> 3) & 14) | 64);
        InterfaceC6258lW0 interfaceC6258lW0G = f6.g();
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return interfaceC6258lW0G;
    }
}
