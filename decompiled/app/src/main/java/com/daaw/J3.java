package com.daaw;

import com.daaw.AbstractC0584Cu0;
import com.daaw.C6460mD;

/* JADX INFO: loaded from: classes.dex */
public abstract class J3 {

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ I3 B;
        public final /* synthetic */ float C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;
        public final /* synthetic */ AbstractC0584Cu0 G;
        public final /* synthetic */ int H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I3 i3, float f, int i, int i2, int i4, AbstractC0584Cu0 abstractC0584Cu0, int i5) {
            super(1);
            this.B = i3;
            this.C = f;
            this.D = i;
            this.E = i2;
            this.F = i4;
            this.G = abstractC0584Cu0;
            this.H = i5;
        }

        public final void a(AbstractC0584Cu0.a aVar) {
            int iQ0;
            int iL0;
            G10.g(aVar, "$this$layout");
            if (J3.d(this.B)) {
                iQ0 = 0;
            } else {
                iQ0 = !C6460mD.n(this.C, C6460mD.C.b()) ? this.D : (this.E - this.F) - this.G.q0();
            }
            if (J3.d(this.B)) {
                iL0 = !C6460mD.n(this.C, C6460mD.C.b()) ? this.D : (this.H - this.F) - this.G.l0();
            } else {
                iL0 = 0;
            }
            AbstractC0584Cu0.a.n(aVar, this.G, iQ0, iL0, 0.0f, 4, null);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((AbstractC0584Cu0.a) obj);
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ I3 B;
        public final /* synthetic */ float C;
        public final /* synthetic */ float D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(I3 i3, float f, float f2) {
            super(1);
            this.B = i3;
            this.C = f;
            this.D = f2;
        }

        public final void a(AbstractC6120l00 abstractC6120l00) {
            G10.g(abstractC6120l00, "$this$null");
            throw null;
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            AbstractC6314li0.a(obj);
            a(null);
            return G91.a;
        }
    }

    public static final InterfaceC1061Hh0 c(InterfaceC1269Jh0 interfaceC1269Jh0, I3 i3, float f, float f2, InterfaceC0645Dh0 interfaceC0645Dh0, long j) {
        AbstractC0584Cu0 abstractC0584Cu0G = interfaceC0645Dh0.G(d(i3) ? C6079kr.e(j, 0, 0, 0, 0, 11, null) : C6079kr.e(j, 0, 0, 0, 0, 14, null));
        int iR = abstractC0584Cu0G.r(i3);
        if (iR == Integer.MIN_VALUE) {
            iR = 0;
        }
        int iL0 = d(i3) ? abstractC0584Cu0G.l0() : abstractC0584Cu0G.q0();
        int iM = d(i3) ? C6079kr.m(j) : C6079kr.n(j);
        C6460mD.a aVar = C6460mD.C;
        int i = iM - iL0;
        int iL = AbstractC8417tE0.l((!C6460mD.n(f, aVar.b()) ? interfaceC1269Jh0.V(f) : 0) - iR, 0, i);
        int iL2 = AbstractC8417tE0.l(((!C6460mD.n(f2, aVar.b()) ? interfaceC1269Jh0.V(f2) : 0) - iL0) + iR, 0, i - iL);
        int iQ0 = d(i3) ? abstractC0584Cu0G.q0() : Math.max(abstractC0584Cu0G.q0() + iL + iL2, C6079kr.p(j));
        int iMax = d(i3) ? Math.max(abstractC0584Cu0G.l0() + iL + iL2, C6079kr.o(j)) : abstractC0584Cu0G.l0();
        int i2 = iQ0;
        return AbstractC1165Ih0.b(interfaceC1269Jh0, i2, iMax, null, new a(i3, f, iL, i2, iL2, abstractC0584Cu0G, iMax), 4, null);
    }

    public static final boolean d(I3 i3) {
        return i3 instanceof C6536mW;
    }

    public static final InterfaceC1073Hk0 e(InterfaceC1073Hk0 interfaceC1073Hk0, I3 i3, float f, float f2) {
        G10.g(interfaceC1073Hk0, "$this$paddingFrom");
        G10.g(i3, "alignmentLine");
        return interfaceC1073Hk0.g(new L3(i3, f, f2, AbstractC5550j00.c() ? new b(i3, f, f2) : AbstractC5550j00.a(), null));
    }

    public static /* synthetic */ InterfaceC1073Hk0 f(InterfaceC1073Hk0 interfaceC1073Hk0, I3 i3, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = C6460mD.C.b();
        }
        if ((i & 4) != 0) {
            f2 = C6460mD.C.b();
        }
        return e(interfaceC1073Hk0, i3, f, f2);
    }

    public static final InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0, float f, float f2) {
        InterfaceC1073Hk0 interfaceC1073Hk02;
        InterfaceC1073Hk0 interfaceC1073Hk0F;
        G10.g(interfaceC1073Hk0, "$this$paddingFromBaseline");
        C6460mD.a aVar = C6460mD.C;
        if (C6460mD.n(f2, aVar.b())) {
            interfaceC1073Hk02 = interfaceC1073Hk0;
            interfaceC1073Hk0F = InterfaceC1073Hk0.m;
        } else {
            interfaceC1073Hk0F = f(interfaceC1073Hk0, K3.b(), 0.0f, f2, 2, null);
            interfaceC1073Hk02 = interfaceC1073Hk0;
        }
        return interfaceC1073Hk02.g(interfaceC1073Hk0F).g(!C6460mD.n(f, aVar.b()) ? f(interfaceC1073Hk02, K3.a(), f, 0.0f, 4, null) : InterfaceC1073Hk0.m);
    }
}
