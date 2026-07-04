package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC4943gp;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.nY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6823nY {

    /* JADX INFO: renamed from: com.daaw.nY$a */
    public static final class a implements InterfaceC0957Gh0 {
        public static final a a = new a();

        /* JADX INFO: renamed from: com.daaw.nY$a$a, reason: collision with other inner class name */
        public static final class C0219a extends AbstractC4192e90 implements NQ {
            public static final C0219a B = new C0219a();

            public C0219a() {
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
            G10.g(interfaceC1269Jh0, "$this$Layout");
            G10.g(list, "<anonymous parameter 0>");
            return AbstractC1165Ih0.b(interfaceC1269Jh0, C6079kr.p(j), C6079kr.o(j), null, C0219a.B, 4, null);
        }
    }

    /* JADX INFO: renamed from: com.daaw.nY$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ AbstractC9718xs0 B;
        public final /* synthetic */ String C;
        public final /* synthetic */ InterfaceC1073Hk0 D;
        public final /* synthetic */ H3 E;
        public final /* synthetic */ InterfaceC7479ps F;
        public final /* synthetic */ float G;
        public final /* synthetic */ C2871Ym H;
        public final /* synthetic */ int I;
        public final /* synthetic */ int J;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC9718xs0 abstractC9718xs0, String str, InterfaceC1073Hk0 interfaceC1073Hk0, H3 h3, InterfaceC7479ps interfaceC7479ps, float f, C2871Ym c2871Ym, int i, int i2) {
            super(2);
            this.B = abstractC9718xs0;
            this.C = str;
            this.D = interfaceC1073Hk0;
            this.E = h3;
            this.F = interfaceC7479ps;
            this.G = f;
            this.H = c2871Ym;
            this.I = i;
            this.J = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC6823nY.a(this.B, this.C, this.D, this.E, this.F, this.G, this.H, interfaceC5781jp, this.I | 1, this.J);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.nY$c */
    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ String B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.B = str;
        }

        public final void a(CP0 cp0) {
            G10.g(cp0, "$this$semantics");
            AP0.l(cp0, this.B);
            AP0.p(cp0, OJ0.b.c());
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CP0) obj);
            return G91.a;
        }
    }

    public static final void a(AbstractC9718xs0 abstractC9718xs0, String str, InterfaceC1073Hk0 interfaceC1073Hk0, H3 h3, InterfaceC7479ps interfaceC7479ps, float f, C2871Ym c2871Ym, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        InterfaceC1073Hk0 interfaceC1073Hk0B;
        G10.g(abstractC9718xs0, "painter");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1142754848);
        InterfaceC1073Hk0 interfaceC1073Hk02 = (i2 & 4) != 0 ? InterfaceC1073Hk0.m : interfaceC1073Hk0;
        H3 h3B = (i2 & 8) != 0 ? H3.a.b() : h3;
        InterfaceC7479ps interfaceC7479psB = (i2 & 16) != 0 ? InterfaceC7479ps.a.b() : interfaceC7479ps;
        float f2 = (i2 & 32) != 0 ? 1.0f : f;
        C2871Ym c2871Ym2 = (i2 & 64) != 0 ? null : c2871Ym;
        interfaceC5781jpQ.e(-816794123);
        if (str != null) {
            InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
            interfaceC5781jpQ.e(1157296644);
            boolean zP = interfaceC5781jpQ.P(str);
            Object objF = interfaceC5781jpQ.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new c(str);
                interfaceC5781jpQ.H(objF);
            }
            interfaceC5781jpQ.L();
            interfaceC1073Hk0B = AbstractC8182sP0.b(aVar, false, (NQ) objF, 1, null);
        } else {
            interfaceC1073Hk0B = InterfaceC1073Hk0.m;
        }
        interfaceC5781jpQ.L();
        InterfaceC1073Hk0 interfaceC1073Hk0B2 = AbstractC10276zs0.b(AbstractC4082dm.b(interfaceC1073Hk02.g(interfaceC1073Hk0B)), abstractC9718xs0, false, h3B, interfaceC7479psB, f2, c2871Ym2, 2, null);
        a aVar2 = a.a;
        interfaceC5781jpQ.e(-1323940314);
        InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jpQ.O(AbstractC2259Sp.d());
        EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jpQ.O(AbstractC2259Sp.g());
        InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jpQ.O(AbstractC2259Sp.i());
        InterfaceC4943gp.a aVar3 = InterfaceC4943gp.d;
        LQ lqA = aVar3.a();
        InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0B2);
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
        AbstractC5987ka1.b(interfaceC5781jpA, aVar2, aVar3.d());
        AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar3.b());
        AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar3.c());
        AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar3.f());
        interfaceC5781jpQ.i();
        interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jpQ)), interfaceC5781jpQ, 0);
        interfaceC5781jpQ.e(2058660585);
        interfaceC5781jpQ.e(-2077995625);
        interfaceC5781jpQ.L();
        interfaceC5781jpQ.L();
        interfaceC5781jpQ.M();
        interfaceC5781jpQ.L();
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new b(abstractC9718xs0, str, interfaceC1073Hk02, h3B, interfaceC7479psB, f2, c2871Ym2, i, i2));
    }
}
