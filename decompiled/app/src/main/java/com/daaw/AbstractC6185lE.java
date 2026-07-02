package com.daaw;

import com.daaw.H3;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC4943gp;
import com.daaw.WZ0;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Map;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.lE, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6185lE {
    public static final float a = C6460mD.l(56);
    public static final float b = C6460mD.l(RCHTTPStatusCodes.BAD_REQUEST);
    public static final Y61 c = new Y61(PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0, null, 6, null);

    /* JADX INFO: renamed from: com.daaw.lE$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ C6743nE B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ int D;
        public final /* synthetic */ long E;
        public final /* synthetic */ InterfaceC5391iR0 F;
        public final /* synthetic */ long G;
        public final /* synthetic */ long H;
        public final /* synthetic */ float I;
        public final /* synthetic */ InterfaceC3429bR J;
        public final /* synthetic */ InterfaceC7484pt K;
        public final /* synthetic */ InterfaceC3986dR L;

        /* JADX INFO: renamed from: com.daaw.lE$a$a, reason: collision with other inner class name */
        public static final class C0205a extends AbstractC4192e90 implements InterfaceC3429bR {
            public static final C0205a B = new C0205a();

            public C0205a() {
                super(2);
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC8367t31 invoke(EnumC7022oE enumC7022oE, EnumC7022oE enumC7022oE2) {
                G10.g(enumC7022oE, "<anonymous parameter 0>");
                G10.g(enumC7022oE2, "<anonymous parameter 1>");
                return new DP(0.5f);
            }
        }

        /* JADX INFO: renamed from: com.daaw.lE$a$b */
        public static final class b extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ boolean B;
            public final /* synthetic */ C6743nE C;
            public final /* synthetic */ InterfaceC7484pt D;

            /* JADX INFO: renamed from: com.daaw.lE$a$b$a, reason: collision with other inner class name */
            public static final class C0206a extends SZ0 implements InterfaceC3429bR {
                public int F;
                public final /* synthetic */ C6743nE G;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0206a(C6743nE c6743nE, InterfaceC1416Ks interfaceC1416Ks) {
                    super(2, interfaceC1416Ks);
                    this.G = c6743nE;
                }

                @Override // com.daaw.AbstractC7409pe
                public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                    return new C0206a(this.G, interfaceC1416Ks);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.F;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        C6743nE c6743nE = this.G;
                        this.F = 1;
                        if (c6743nE.b(this) == objC) {
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
                    return ((C0206a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(boolean z, C6743nE c6743nE, InterfaceC7484pt interfaceC7484pt) {
                super(0);
                this.B = z;
                this.C = c6743nE;
                this.D = interfaceC7484pt;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m57invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m57invoke() {
                if (this.B && ((Boolean) this.C.e().n().invoke(EnumC7022oE.Closed)).booleanValue()) {
                    AbstractC9104vh.d(this.D, null, null, new C0206a(this.C, null), 3, null);
                }
            }
        }

        /* JADX INFO: renamed from: com.daaw.lE$a$c */
        public static final class c extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ float B;
            public final /* synthetic */ float C;
            public final /* synthetic */ C6743nE D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(float f, float f2, C6743nE c6743nE) {
                super(0);
                this.B = f;
                this.C = f2;
                this.D = c6743nE;
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Float invoke() {
                return Float.valueOf(AbstractC6185lE.h(this.B, this.C, ((Number) this.D.d().getValue()).floatValue()));
            }
        }

        /* JADX INFO: renamed from: com.daaw.lE$a$d */
        public static final class d extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ C6743nE B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(C6743nE c6743nE) {
                super(1);
                this.B = c6743nE;
            }

            public final long a(InterfaceC4988gz interfaceC4988gz) {
                G10.g(interfaceC4988gz, "$this$offset");
                return E00.a(AbstractC8261sh0.b(((Number) this.B.d().getValue()).floatValue()), 0);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return D00.b(a((InterfaceC4988gz) obj));
            }
        }

        /* JADX INFO: renamed from: com.daaw.lE$a$e */
        public static final class e extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ String B;
            public final /* synthetic */ C6743nE C;
            public final /* synthetic */ InterfaceC7484pt D;

            /* JADX INFO: renamed from: com.daaw.lE$a$e$a, reason: collision with other inner class name */
            public static final class C0207a extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ C6743nE B;
                public final /* synthetic */ InterfaceC7484pt C;

                /* JADX INFO: renamed from: com.daaw.lE$a$e$a$a, reason: collision with other inner class name */
                public static final class C0208a extends SZ0 implements InterfaceC3429bR {
                    public int F;
                    public final /* synthetic */ C6743nE G;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0208a(C6743nE c6743nE, InterfaceC1416Ks interfaceC1416Ks) {
                        super(2, interfaceC1416Ks);
                        this.G = c6743nE;
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                        return new C0208a(this.G, interfaceC1416Ks);
                    }

                    @Override // com.daaw.AbstractC7409pe
                    public final Object q(Object obj) throws Throwable {
                        Object objC = I10.c();
                        int i = this.F;
                        if (i == 0) {
                            AbstractC4801gJ0.b(obj);
                            C6743nE c6743nE = this.G;
                            this.F = 1;
                            if (c6743nE.b(this) == objC) {
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
                        return ((C0208a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0207a(C6743nE c6743nE, InterfaceC7484pt interfaceC7484pt) {
                    super(0);
                    this.B = c6743nE;
                    this.C = interfaceC7484pt;
                }

                @Override // com.daaw.LQ
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    if (((Boolean) this.B.e().n().invoke(EnumC7022oE.Closed)).booleanValue()) {
                        AbstractC9104vh.d(this.C, null, null, new C0208a(this.B, null), 3, null);
                    }
                    return Boolean.TRUE;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String str, C6743nE c6743nE, InterfaceC7484pt interfaceC7484pt) {
                super(1);
                this.B = str;
                this.C = c6743nE;
                this.D = interfaceC7484pt;
            }

            public final void a(CP0 cp0) {
                G10.g(cp0, "$this$semantics");
                AP0.o(cp0, this.B);
                if (this.C.f()) {
                    AP0.d(cp0, null, new C0207a(this.C, this.D), 1, null);
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((CP0) obj);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.lE$a$f */
        public static final class f extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ InterfaceC3986dR B;
            public final /* synthetic */ int C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(InterfaceC3986dR interfaceC3986dR, int i) {
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
                    AbstractC6348lp.Z(-1941234439, i, -1, "androidx.compose.material.ModalDrawer.<anonymous>.<anonymous>.<anonymous> (Drawer.kt:458)");
                }
                InterfaceC1073Hk0 interfaceC1073Hk0K = AT0.k(InterfaceC1073Hk0.m, 0.0f, 1, null);
                InterfaceC3986dR interfaceC3986dR = this.B;
                int i2 = ((this.C << 9) & 7168) | 6;
                interfaceC5781jp.e(-483455358);
                InterfaceC0957Gh0 interfaceC0957Gh0A = AbstractC8011rn.a(C1032Ha.a.d(), H3.a.f(), interfaceC5781jp, 0);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
                LQ lqA = aVar.a();
                InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0K);
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
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0A, aVar.d());
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar.b());
                AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar.c());
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar.f());
                interfaceC5781jp.i();
                interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-1163856341);
                interfaceC3986dR.invoke(C8848un.a, interfaceC5781jp, Integer.valueOf(((i2 >> 6) & 112) | 6));
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

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6743nE c6743nE, boolean z, int i, long j, InterfaceC5391iR0 interfaceC5391iR0, long j2, long j3, float f2, InterfaceC3429bR interfaceC3429bR, InterfaceC7484pt interfaceC7484pt, InterfaceC3986dR interfaceC3986dR) {
            super(3);
            this.B = c6743nE;
            this.C = z;
            this.D = i;
            this.E = j;
            this.F = interfaceC5391iR0;
            this.G = j2;
            this.H = j3;
            this.I = f2;
            this.J = interfaceC3429bR;
            this.K = interfaceC7484pt;
            this.L = interfaceC3986dR;
        }

        public final void a(InterfaceC0319Ag interfaceC0319Ag, InterfaceC5781jp interfaceC5781jp, int i) {
            int i2;
            G10.g(interfaceC0319Ag, "$this$BoxWithConstraints");
            if ((i & 14) == 0) {
                i2 = (interfaceC5781jp.P(interfaceC0319Ag) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(816674999, i, -1, "androidx.compose.material.ModalDrawer.<anonymous> (Drawer.kt:386)");
            }
            long jA = interfaceC0319Ag.a();
            if (!C6079kr.j(jA)) {
                throw new IllegalStateException("Drawer shouldn't have infinite width");
            }
            float f2 = -C6079kr.n(jA);
            Map mapK = AbstractC1473Lg0.k(D61.a(Float.valueOf(f2), EnumC7022oE.Closed), D61.a(Float.valueOf(0.0f), EnumC7022oE.Open));
            boolean z = interfaceC5781jp.O(AbstractC2259Sp.g()) == EnumC7560q90.Rtl;
            InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
            InterfaceC1073Hk0 interfaceC1073Hk0F = WZ0.f(aVar, this.B.e(), mapK, EnumC5792jr0.Horizontal, (32 & 8) != 0 ? true : this.C, (32 & 16) != 0 ? false : z, (32 & 32) != 0 ? null : null, (32 & 64) != 0 ? WZ0.a.B : C0205a.B, (32 & 128) != 0 ? VZ0.c(VZ0.a, mapK.keySet(), 0.0f, 0.0f, 6, null) : null, (32 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? VZ0.a.a() : AbstractC6185lE.b);
            C6743nE c6743nE = this.B;
            int i3 = this.D;
            long j = this.E;
            InterfaceC5391iR0 interfaceC5391iR0 = this.F;
            long j2 = this.G;
            long j3 = this.H;
            float f3 = this.I;
            InterfaceC3429bR interfaceC3429bR = this.J;
            boolean z2 = this.C;
            InterfaceC7484pt interfaceC7484pt = this.K;
            InterfaceC3986dR interfaceC3986dR = this.L;
            interfaceC5781jp.e(733328855);
            H3.a aVar2 = H3.a;
            InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(aVar2.j(), false, interfaceC5781jp, 0);
            interfaceC5781jp.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar3 = InterfaceC4943gp.d;
            LQ lqA = aVar3.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0F);
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
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0H, aVar3.d());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar3.b());
            AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar3.c());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar3.f());
            interfaceC5781jp.i();
            interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
            interfaceC5781jp.e(2058660585);
            interfaceC5781jp.e(-2137368960);
            C9936yg c9936yg = C9936yg.a;
            interfaceC5781jp.e(-1263168067);
            interfaceC5781jp.e(733328855);
            InterfaceC0957Gh0 interfaceC0957Gh0H2 = AbstractC9378wg.h(aVar2.j(), false, interfaceC5781jp, 0);
            interfaceC5781jp.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz2 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q902 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd12 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            LQ lqA2 = aVar3.a();
            InterfaceC3986dR interfaceC3986dRA2 = B90.a(aVar);
            if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                AbstractC3540bp.c();
            }
            interfaceC5781jp.s();
            if (interfaceC5781jp.n()) {
                interfaceC5781jp.E(lqA2);
            } else {
                interfaceC5781jp.G();
            }
            interfaceC5781jp.u();
            InterfaceC5781jp interfaceC5781jpA2 = AbstractC5987ka1.a(interfaceC5781jp);
            AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC0957Gh0H2, aVar3.d());
            AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC4988gz2, aVar3.b());
            AbstractC5987ka1.b(interfaceC5781jpA2, enumC7560q902, aVar3.c());
            AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC2733Xd12, aVar3.f());
            interfaceC5781jp.i();
            interfaceC3986dRA2.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
            interfaceC5781jp.e(2058660585);
            interfaceC5781jp.e(-2137368960);
            interfaceC5781jp.e(32495683);
            interfaceC3429bR.invoke(interfaceC5781jp, Integer.valueOf((i3 >> 27) & 14));
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            interfaceC5781jp.M();
            interfaceC5781jp.L();
            interfaceC5781jp.L();
            boolean zF = c6743nE.f();
            b bVar = new b(z2, c6743nE, interfaceC7484pt);
            Object objValueOf = Float.valueOf(f2);
            Object objValueOf2 = Float.valueOf(0.0f);
            interfaceC5781jp.e(1618982084);
            boolean zP = interfaceC5781jp.P(objValueOf) | interfaceC5781jp.P(objValueOf2) | interfaceC5781jp.P(c6743nE);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new c(f2, 0.0f, c6743nE);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            AbstractC6185lE.b(zF, bVar, (LQ) objF, j, interfaceC5781jp, (i3 >> 15) & 7168);
            String strA = EY0.a(AbstractC7382pY0.a.e(), interfaceC5781jp, 6);
            InterfaceC4988gz interfaceC4988gz3 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            InterfaceC1073Hk0 interfaceC1073Hk0Q = AT0.q(aVar, interfaceC4988gz3.H(C6079kr.p(jA)), interfaceC4988gz3.H(C6079kr.o(jA)), interfaceC4988gz3.H(C6079kr.n(jA)), interfaceC4988gz3.H(C6079kr.m(jA)));
            interfaceC5781jp.e(1157296644);
            boolean zP2 = interfaceC5781jp.P(c6743nE);
            Object objF2 = interfaceC5781jp.f();
            if (zP2 || objF2 == InterfaceC5781jp.a.a()) {
                objF2 = new d(c6743nE);
                interfaceC5781jp.H(objF2);
            }
            interfaceC5781jp.L();
            int i4 = i3 >> 12;
            OZ0.a(AbstractC8182sP0.b(AbstractC6085ks0.h(AbstractC0356Ap0.a(interfaceC1073Hk0Q, (NQ) objF2), 0.0f, 0.0f, AbstractC6185lE.a, 0.0f, 11, null), false, new e(strA, c6743nE, interfaceC7484pt), 1, null), interfaceC5391iR0, j2, j3, null, f3, AbstractC1815Oo.b(interfaceC5781jp, -1941234439, true, new f(interfaceC3986dR, i3)), interfaceC5781jp, ((i3 >> 9) & 112) | 1572864 | (i4 & 896) | (i4 & 7168) | (458752 & i3), 16);
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
            a((InterfaceC0319Ag) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lE$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC3986dR B;
        public final /* synthetic */ InterfaceC1073Hk0 C;
        public final /* synthetic */ C6743nE D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ InterfaceC5391iR0 F;
        public final /* synthetic */ float G;
        public final /* synthetic */ long H;
        public final /* synthetic */ long I;
        public final /* synthetic */ long J;
        public final /* synthetic */ InterfaceC3429bR K;
        public final /* synthetic */ int L;
        public final /* synthetic */ int M;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3986dR interfaceC3986dR, InterfaceC1073Hk0 interfaceC1073Hk0, C6743nE c6743nE, boolean z, InterfaceC5391iR0 interfaceC5391iR0, float f, long j, long j2, long j3, InterfaceC3429bR interfaceC3429bR, int i, int i2) {
            super(2);
            this.B = interfaceC3986dR;
            this.C = interfaceC1073Hk0;
            this.D = c6743nE;
            this.E = z;
            this.F = interfaceC5391iR0;
            this.G = f;
            this.H = j;
            this.I = j2;
            this.J = j3;
            this.K = interfaceC3429bR;
            this.L = i;
            this.M = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC6185lE.a(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, this.J, this.K, interfaceC5781jp, this.L | 1, this.M);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lE$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ long B;
        public final /* synthetic */ LQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j, LQ lq) {
            super(1);
            this.B = j;
            this.C = lq;
        }

        public final void a(OD od) {
            G10.g(od, "$this$Canvas");
            ND.h(od, this.B, 0L, 0L, ((Number) this.C.invoke()).floatValue(), null, null, 0, 118, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OD) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lE$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ LQ C;
        public final /* synthetic */ LQ D;
        public final /* synthetic */ long E;
        public final /* synthetic */ int F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(boolean z, LQ lq, LQ lq2, long j, int i) {
            super(2);
            this.B = z;
            this.C = lq;
            this.D = lq2;
            this.E = j;
            this.F = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC6185lE.b(this.B, this.C, this.D, this.E, interfaceC5781jp, this.F | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lE$e */
    public static final class e extends SZ0 implements InterfaceC3429bR {
        public int F;
        public /* synthetic */ Object G;
        public final /* synthetic */ LQ H;

        /* JADX INFO: renamed from: com.daaw.lE$e$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ LQ B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LQ lq) {
                super(1);
                this.B = lq;
            }

            public final void a(long j) {
                this.B.invoke();
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((C9982yp0) obj).t());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LQ lq, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.H = lq;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            e eVar = new e(this.H, interfaceC1416Ks);
            eVar.G = obj;
            return eVar;
        }

        @Override // com.daaw.AbstractC7409pe
        public final Object q(Object obj) throws Throwable {
            Object objC = I10.c();
            int i = this.F;
            if (i == 0) {
                AbstractC4801gJ0.b(obj);
                InterfaceC9740xx0 interfaceC9740xx0 = (InterfaceC9740xx0) this.G;
                a aVar = new a(this.H);
                this.F = 1;
                if (Y01.k(interfaceC9740xx0, null, null, null, aVar, this, 7, null) == objC) {
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
        public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
            return ((e) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
        }
    }

    /* JADX INFO: renamed from: com.daaw.lE$f */
    public static final class f extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ String B;
        public final /* synthetic */ LQ C;

        /* JADX INFO: renamed from: com.daaw.lE$f$a */
        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ LQ B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LQ lq) {
                super(0);
                this.B = lq;
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.B.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, LQ lq) {
            super(1);
            this.B = str;
            this.C = lq;
        }

        public final void a(CP0 cp0) {
            G10.g(cp0, "$this$semantics");
            AP0.l(cp0, this.B);
            AP0.h(cp0, null, new a(this.C), 1, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CP0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lE$g */
    public static final class g extends AbstractC4192e90 implements NQ {
        public static final g B = new g();

        public g() {
            super(1);
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(EnumC7022oE enumC7022oE) {
            G10.g(enumC7022oE, "it");
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.daaw.lE$h */
    public static final class h extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ EnumC7022oE B;
        public final /* synthetic */ NQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(EnumC7022oE enumC7022oE, NQ nq) {
            super(0);
            this.B = enumC7022oE;
            this.C = nq;
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C6743nE invoke() {
            return new C6743nE(this.B, this.C);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0106  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.daaw.InterfaceC3986dR r25, com.daaw.InterfaceC1073Hk0 r26, com.daaw.C6743nE r27, boolean r28, com.daaw.InterfaceC5391iR0 r29, float r30, long r31, long r33, long r35, com.daaw.InterfaceC3429bR r37, com.daaw.InterfaceC5781jp r38, int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 703
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6185lE.a(com.daaw.dR, com.daaw.Hk0, com.daaw.nE, boolean, com.daaw.iR0, float, long, long, long, com.daaw.bR, com.daaw.jp, int, int):void");
    }

    public static final void b(boolean z, LQ lq, LQ lq2, long j, InterfaceC5781jp interfaceC5781jp, int i) {
        int i2;
        InterfaceC1073Hk0 interfaceC1073Hk0A;
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1983403750);
        if ((i & 14) == 0) {
            i2 = (interfaceC5781jpQ.c(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= interfaceC5781jpQ.P(lq) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            i2 |= interfaceC5781jpQ.P(lq2) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i & 7168) == 0) {
            i2 |= interfaceC5781jpQ.l(j) ? 2048 : 1024;
        }
        if ((i2 & 5851) == 1170 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(1983403750, i2, -1, "androidx.compose.material.Scrim (Drawer.kt:654)");
            }
            String strA = EY0.a(AbstractC7382pY0.a.a(), interfaceC5781jpQ, 6);
            interfaceC5781jpQ.e(1010554047);
            if (z) {
                InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
                interfaceC5781jpQ.e(1157296644);
                boolean zP = interfaceC5781jpQ.P(lq);
                Object objF = interfaceC5781jpQ.f();
                if (zP || objF == InterfaceC5781jp.a.a()) {
                    objF = new e(lq, null);
                    interfaceC5781jpQ.H(objF);
                }
                interfaceC5781jpQ.L();
                InterfaceC1073Hk0 interfaceC1073Hk0B = UZ0.b(aVar, lq, (InterfaceC3429bR) objF);
                interfaceC5781jpQ.e(511388516);
                boolean zP2 = interfaceC5781jpQ.P(strA) | interfaceC5781jpQ.P(lq);
                Object objF2 = interfaceC5781jpQ.f();
                if (zP2 || objF2 == InterfaceC5781jp.a.a()) {
                    objF2 = new f(strA, lq);
                    interfaceC5781jpQ.H(objF2);
                }
                interfaceC5781jpQ.L();
                interfaceC1073Hk0A = AbstractC8182sP0.a(interfaceC1073Hk0B, true, (NQ) objF2);
            } else {
                interfaceC1073Hk0A = InterfaceC1073Hk0.m;
            }
            interfaceC5781jpQ.L();
            InterfaceC1073Hk0 interfaceC1073Hk0G = AT0.k(InterfaceC1073Hk0.m, 0.0f, 1, null).g(interfaceC1073Hk0A);
            C2559Vm c2559VmI = C2559Vm.i(j);
            interfaceC5781jpQ.e(511388516);
            boolean zP3 = interfaceC5781jpQ.P(c2559VmI) | interfaceC5781jpQ.P(lq2);
            Object objF3 = interfaceC5781jpQ.f();
            if (zP3 || objF3 == InterfaceC5781jp.a.a()) {
                objF3 = new c(j, lq2);
                interfaceC5781jpQ.H(objF3);
            }
            interfaceC5781jpQ.L();
            AbstractC7713qj.a(interfaceC1073Hk0G, (NQ) objF3, interfaceC5781jpQ, 0);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new d(z, lq, lq2, j, i));
    }

    public static final float h(float f2, float f3, float f4) {
        return AbstractC8417tE0.k((f4 - f2) / (f3 - f2), 0.0f, 1.0f);
    }

    public static final C6743nE i(EnumC7022oE enumC7022oE, NQ nq, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        G10.g(enumC7022oE, "initialValue");
        interfaceC5781jp.e(-1435874229);
        if ((i2 & 2) != 0) {
            nq = g.B;
        }
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-1435874229, i, -1, "androidx.compose.material.rememberDrawerState (Drawer.kt:316)");
        }
        Object[] objArr = new Object[0];
        InterfaceC3692cN0 interfaceC3692cN0A = C6743nE.b.a(nq);
        interfaceC5781jp.e(511388516);
        boolean zP = interfaceC5781jp.P(enumC7022oE) | interfaceC5781jp.P(nq);
        Object objF = interfaceC5781jp.f();
        if (zP || objF == InterfaceC5781jp.a.a()) {
            objF = new h(enumC7022oE, nq);
            interfaceC5781jp.H(objF);
        }
        interfaceC5781jp.L();
        C6743nE c6743nE = (C6743nE) BG0.b(objArr, interfaceC3692cN0A, null, (LQ) objF, interfaceC5781jp, 72, 4);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        interfaceC5781jp.L();
        return c6743nE;
    }
}
