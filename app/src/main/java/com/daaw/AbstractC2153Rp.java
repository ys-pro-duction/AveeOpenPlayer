package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import java.util.Arrays;

/* JADX INFO: renamed from: com.daaw.Rp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2153Rp {

    /* JADX INFO: renamed from: com.daaw.Rp$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C7011oB0[] B;
        public final /* synthetic */ InterfaceC3429bR C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C7011oB0[] c7011oB0Arr, InterfaceC3429bR interfaceC3429bR, int i) {
            super(2);
            this.B = c7011oB0Arr;
            this.C = interfaceC3429bR;
            this.D = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            C7011oB0[] c7011oB0Arr = this.B;
            AbstractC2153Rp.a((C7011oB0[]) Arrays.copyOf(c7011oB0Arr, c7011oB0Arr.length), this.C, interfaceC5781jp, this.D | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(C7011oB0[] c7011oB0Arr, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i) {
        G10.g(c7011oB0Arr, DiagnosticsEntry.Histogram.VALUES_KEY);
        G10.g(interfaceC3429bR, "content");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-1390796515);
        interfaceC5781jpQ.x(c7011oB0Arr);
        interfaceC3429bR.invoke(interfaceC5781jpQ, Integer.valueOf((i >> 3) & 14));
        interfaceC5781jpQ.D();
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new a(c7011oB0Arr, interfaceC3429bR, i));
    }

    public static final AbstractC6453mB0 b(InterfaceC7645qU0 interfaceC7645qU0, LQ lq) {
        G10.g(interfaceC7645qU0, "policy");
        G10.g(lq, "defaultFactory");
        return new VE(interfaceC7645qU0, lq);
    }

    public static /* synthetic */ AbstractC6453mB0 c(InterfaceC7645qU0 interfaceC7645qU0, LQ lq, int i, Object obj) {
        if ((i & 1) != 0) {
            interfaceC7645qU0 = AbstractC7923rU0.k();
        }
        return b(interfaceC7645qU0, lq);
    }

    public static final AbstractC6453mB0 d(LQ lq) {
        G10.g(lq, "defaultFactory");
        return new XW0(lq);
    }
}
