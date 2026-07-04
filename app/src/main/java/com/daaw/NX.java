package com.daaw;

import com.daaw.C2871Ym;
import com.daaw.InterfaceC1073Hk0;

/* JADX INFO: loaded from: classes.dex */
public abstract class NX {
    public static final InterfaceC1073Hk0 a = AT0.o(InterfaceC1073Hk0.m, C6460mD.l(24));

    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ AbstractC9718xs0 B;
        public final /* synthetic */ String C;
        public final /* synthetic */ InterfaceC1073Hk0 D;
        public final /* synthetic */ long E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC9718xs0 abstractC9718xs0, String str, InterfaceC1073Hk0 interfaceC1073Hk0, long j, int i, int i2) {
            super(2);
            this.B = abstractC9718xs0;
            this.C = str;
            this.D = interfaceC1073Hk0;
            this.E = j;
            this.F = i;
            this.G = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            NX.a(this.B, this.C, this.D, this.E, interfaceC5781jp, this.F | 1, this.G);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ String B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str) {
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

    public static final void a(AbstractC9718xs0 abstractC9718xs0, String str, InterfaceC1073Hk0 interfaceC1073Hk0, long j, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        int i3;
        long jM;
        int i4;
        InterfaceC1073Hk0 interfaceC1073Hk0B;
        G10.g(abstractC9718xs0, "painter");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-1142959010);
        InterfaceC1073Hk0 interfaceC1073Hk02 = (i2 & 4) != 0 ? InterfaceC1073Hk0.m : interfaceC1073Hk0;
        if ((i2 & 8) != 0) {
            i3 = i;
            i4 = i3 & (-7169);
            jM = C2559Vm.m(((C2559Vm) interfaceC5781jpQ.O(AbstractC2787Xr.a())).w(), ((Number) interfaceC5781jpQ.O(AbstractC2579Vr.a())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null);
        } else {
            i3 = i;
            jM = j;
            i4 = i3;
        }
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Z(-1142959010, i4, -1, "androidx.compose.material.Icon (Icon.kt:114)");
        }
        C2871Ym c2871YmB = C2559Vm.o(jM, C2559Vm.b.g()) ? null : C2871Ym.a.b(C2871Ym.b, jM, 0, 2, null);
        interfaceC5781jpQ.e(1547385429);
        if (str != null) {
            InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
            interfaceC5781jpQ.e(1157296644);
            boolean zP = interfaceC5781jpQ.P(str);
            Object objF = interfaceC5781jpQ.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new b(str);
                interfaceC5781jpQ.H(objF);
            }
            interfaceC5781jpQ.L();
            interfaceC1073Hk0B = AbstractC8182sP0.b(aVar, false, (NQ) objF, 1, null);
        } else {
            interfaceC1073Hk0B = InterfaceC1073Hk0.m;
        }
        interfaceC5781jpQ.L();
        AbstractC9378wg.a(AbstractC10276zs0.b(b(ST.d(interfaceC1073Hk02), abstractC9718xs0), abstractC9718xs0, false, null, InterfaceC7479ps.a.b(), 0.0f, c2871YmB, 22, null).g(interfaceC1073Hk0B), interfaceC5781jpQ, 0);
        if (AbstractC6348lp.O()) {
            AbstractC6348lp.Y();
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new a(abstractC9718xs0, str, interfaceC1073Hk02, jM, i3, i2));
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, AbstractC9718xs0 abstractC9718xs0) {
        return interfaceC1073Hk0.g((C9879yT0.f(abstractC9718xs0.h(), C9879yT0.b.a()) || c(abstractC9718xs0.h())) ? a : InterfaceC1073Hk0.m);
    }

    public static final boolean c(long j) {
        return Float.isInfinite(C9879yT0.i(j)) && Float.isInfinite(C9879yT0.g(j));
    }
}
