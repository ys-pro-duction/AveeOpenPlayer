package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.InterfaceC4943gp;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.wg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9378wg {
    public static final InterfaceC0957Gh0 a = d(H3.a.j(), false);
    public static final InterfaceC0957Gh0 b = b.a;

    /* JADX INFO: renamed from: com.daaw.wg$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1073Hk0 interfaceC1073Hk0, int i) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC9378wg.a(this.B, interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.wg$b */
    public static final class b implements InterfaceC0957Gh0 {
        public static final b a = new b();

        /* JADX INFO: renamed from: com.daaw.wg$b$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public static final a B = new a();

            public a() {
                super(1);
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                G10.g(aVar, "$this$layout");
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public final InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            G10.g(interfaceC1269Jh0, "$this$MeasurePolicy");
            G10.g(list, "<anonymous parameter 0>");
            return AbstractC1165Ih0.b(interfaceC1269Jh0, C6079kr.p(j), C6079kr.o(j), null, a.B, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wg$c */
    public static final class c implements InterfaceC0957Gh0 {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ H3 b;

        /* JADX INFO: renamed from: com.daaw.wg$c$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public static final a B = new a();

            public a() {
                super(1);
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                G10.g(aVar, "$this$layout");
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.wg$c$b */
        public static final class b extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ AbstractC0584Cu0 B;
            public final /* synthetic */ InterfaceC0645Dh0 C;
            public final /* synthetic */ InterfaceC1269Jh0 D;
            public final /* synthetic */ int E;
            public final /* synthetic */ int F;
            public final /* synthetic */ H3 G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(AbstractC0584Cu0 abstractC0584Cu0, InterfaceC0645Dh0 interfaceC0645Dh0, InterfaceC1269Jh0 interfaceC1269Jh0, int i, int i2, H3 h3) {
                super(1);
                this.B = abstractC0584Cu0;
                this.C = interfaceC0645Dh0;
                this.D = interfaceC1269Jh0;
                this.E = i;
                this.F = i2;
                this.G = h3;
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                G10.g(aVar, "$this$layout");
                AbstractC9378wg.g(aVar, this.B, this.C, this.D.getLayoutDirection(), this.E, this.F, this.G);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        /* JADX INFO: renamed from: com.daaw.wg$c$c, reason: collision with other inner class name */
        public static final class C0249c extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ AbstractC0584Cu0[] B;
            public final /* synthetic */ List C;
            public final /* synthetic */ InterfaceC1269Jh0 D;
            public final /* synthetic */ C6190lF0 E;
            public final /* synthetic */ C6190lF0 F;
            public final /* synthetic */ H3 G;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0249c(AbstractC0584Cu0[] abstractC0584Cu0Arr, List list, InterfaceC1269Jh0 interfaceC1269Jh0, C6190lF0 c6190lF0, C6190lF0 c6190lF02, H3 h3) {
                super(1);
                this.B = abstractC0584Cu0Arr;
                this.C = list;
                this.D = interfaceC1269Jh0;
                this.E = c6190lF0;
                this.F = c6190lF02;
                this.G = h3;
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                AbstractC0584Cu0.a aVar2 = aVar;
                G10.g(aVar2, "$this$layout");
                AbstractC0584Cu0[] abstractC0584Cu0Arr = this.B;
                List list = this.C;
                InterfaceC1269Jh0 interfaceC1269Jh0 = this.D;
                C6190lF0 c6190lF0 = this.E;
                C6190lF0 c6190lF02 = this.F;
                H3 h3 = this.G;
                int length = abstractC0584Cu0Arr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    AbstractC0584Cu0 abstractC0584Cu0 = abstractC0584Cu0Arr[i2];
                    int i3 = i + 1;
                    if (abstractC0584Cu0 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
                    }
                    AbstractC9378wg.g(aVar2, abstractC0584Cu0, (InterfaceC0645Dh0) list.get(i), interfaceC1269Jh0.getLayoutDirection(), c6190lF0.B, c6190lF02.B, h3);
                    i2++;
                    aVar2 = aVar;
                    i = i3;
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        public c(boolean z, H3 h3) {
            this.a = z;
            this.b = h3;
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public final InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            long j2;
            int iP;
            int iO;
            AbstractC0584Cu0 abstractC0584Cu0G;
            G10.g(interfaceC1269Jh0, "$this$MeasurePolicy");
            G10.g(list, "measurables");
            if (list.isEmpty()) {
                return AbstractC1165Ih0.b(interfaceC1269Jh0, C6079kr.p(j), C6079kr.o(j), null, a.B, 4, null);
            }
            if (this.a) {
                j2 = j;
            } else {
                j2 = j;
                j = C6079kr.e(j2, 0, 0, 0, 0, 10, null);
            }
            if (list.size() == 1) {
                InterfaceC0645Dh0 interfaceC0645Dh0 = (InterfaceC0645Dh0) list.get(0);
                if (AbstractC9378wg.f(interfaceC0645Dh0)) {
                    iP = C6079kr.p(j2);
                    iO = C6079kr.o(j2);
                    abstractC0584Cu0G = interfaceC0645Dh0.G(C6079kr.b.c(C6079kr.p(j2), C6079kr.o(j2)));
                } else {
                    abstractC0584Cu0G = interfaceC0645Dh0.G(j);
                    iP = Math.max(C6079kr.p(j2), abstractC0584Cu0G.q0());
                    iO = Math.max(C6079kr.o(j2), abstractC0584Cu0G.l0());
                }
                int i = iP;
                int i2 = iO;
                return AbstractC1165Ih0.b(interfaceC1269Jh0, i, i2, null, new b(abstractC0584Cu0G, interfaceC0645Dh0, interfaceC1269Jh0, i, i2, this.b), 4, null);
            }
            AbstractC0584Cu0[] abstractC0584Cu0Arr = new AbstractC0584Cu0[list.size()];
            C6190lF0 c6190lF0 = new C6190lF0();
            c6190lF0.B = C6079kr.p(j2);
            C6190lF0 c6190lF02 = new C6190lF0();
            c6190lF02.B = C6079kr.o(j2);
            int size = list.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                InterfaceC0645Dh0 interfaceC0645Dh02 = (InterfaceC0645Dh0) list.get(i3);
                if (AbstractC9378wg.f(interfaceC0645Dh02)) {
                    z = true;
                } else {
                    AbstractC0584Cu0 abstractC0584Cu0G2 = interfaceC0645Dh02.G(j);
                    abstractC0584Cu0Arr[i3] = abstractC0584Cu0G2;
                    c6190lF0.B = Math.max(c6190lF0.B, abstractC0584Cu0G2.q0());
                    c6190lF02.B = Math.max(c6190lF02.B, abstractC0584Cu0G2.l0());
                }
            }
            if (z) {
                int i4 = c6190lF0.B;
                int i5 = i4 != Integer.MAX_VALUE ? i4 : 0;
                int i6 = c6190lF02.B;
                long jA = AbstractC6916nr.a(i5, i4, i6 != Integer.MAX_VALUE ? i6 : 0, i6);
                int size2 = list.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    InterfaceC0645Dh0 interfaceC0645Dh03 = (InterfaceC0645Dh0) list.get(i7);
                    if (AbstractC9378wg.f(interfaceC0645Dh03)) {
                        abstractC0584Cu0Arr[i7] = interfaceC0645Dh03.G(jA);
                    }
                }
            }
            return AbstractC1165Ih0.b(interfaceC1269Jh0, c6190lF0.B, c6190lF02.B, null, new C0249c(abstractC0584Cu0Arr, list, interfaceC1269Jh0, c6190lF0, c6190lF02, this.b), 4, null);
        }
    }

    public static final void a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
        int i2;
        G10.g(interfaceC1073Hk0, "modifier");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-211209833);
        if ((i & 14) == 0) {
            i2 = (interfaceC5781jpQ.P(interfaceC1073Hk0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            InterfaceC0957Gh0 interfaceC0957Gh0 = b;
            interfaceC5781jpQ.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jpQ.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jpQ.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jpQ.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
            LQ lqA = aVar.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0);
            if (!AbstractC2988Zp0.a(interfaceC5781jpQ.v())) {
                AbstractC3540bp.c();
            }
            interfaceC5781jpQ.s();
            if (interfaceC5781jpQ.n()) {
                interfaceC5781jpQ.E(lqA);
            } else {
                interfaceC5781jpQ.G();
            }
            interfaceC5781jpQ.u();
            InterfaceC5781jp interfaceC5781jpA = AbstractC5987ka1.a(interfaceC5781jpQ);
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0, aVar.d());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar.b());
            AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar.c());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar.f());
            interfaceC5781jpQ.i();
            interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jpQ)), interfaceC5781jpQ, 0);
            interfaceC5781jpQ.e(2058660585);
            interfaceC5781jpQ.e(1021196736);
            interfaceC5781jpQ.L();
            interfaceC5781jpQ.L();
            interfaceC5781jpQ.M();
            interfaceC5781jpQ.L();
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new a(interfaceC1073Hk0, i));
    }

    public static final InterfaceC0957Gh0 d(H3 h3, boolean z) {
        G10.g(h3, "alignment");
        return new c(z, h3);
    }

    public static final C9099vg e(InterfaceC0645Dh0 interfaceC0645Dh0) {
        Object objL = interfaceC0645Dh0.L();
        if (objL instanceof C9099vg) {
            return (C9099vg) objL;
        }
        return null;
    }

    public static final boolean f(InterfaceC0645Dh0 interfaceC0645Dh0) {
        C9099vg c9099vgE = e(interfaceC0645Dh0);
        if (c9099vgE != null) {
            return c9099vgE.d();
        }
        return false;
    }

    public static final void g(AbstractC0584Cu0.a aVar, AbstractC0584Cu0 abstractC0584Cu0, InterfaceC0645Dh0 interfaceC0645Dh0, EnumC7560q90 enumC7560q90, int i, int i2, H3 h3) {
        H3 h3C;
        C9099vg c9099vgE = e(interfaceC0645Dh0);
        AbstractC0584Cu0.a.l(aVar, abstractC0584Cu0, ((c9099vgE == null || (h3C = c9099vgE.c()) == null) ? h3 : h3C).a(J00.a(abstractC0584Cu0.q0(), abstractC0584Cu0.l0()), J00.a(i, i2), enumC7560q90), 0.0f, 2, null);
    }

    public static final InterfaceC0957Gh0 h(H3 h3, boolean z, InterfaceC5781jp interfaceC5781jp, int i) {
        InterfaceC0957Gh0 interfaceC0957Gh0;
        G10.g(h3, "alignment");
        interfaceC5781jp.e(56522820);
        if (!G10.c(h3, H3.a.j()) || z) {
            Boolean boolValueOf = Boolean.valueOf(z);
            interfaceC5781jp.e(511388516);
            boolean zP = interfaceC5781jp.P(boolValueOf) | interfaceC5781jp.P(h3);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = d(h3, z);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            interfaceC0957Gh0 = (InterfaceC0957Gh0) objF;
        } else {
            interfaceC0957Gh0 = a;
        }
        interfaceC5781jp.L();
        return interfaceC0957Gh0;
    }
}
