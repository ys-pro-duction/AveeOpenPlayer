package com.daaw;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* JADX INFO: renamed from: com.daaw.sP0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8182sP0 {

    /* JADX INFO: renamed from: com.daaw.sP0$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ NQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, NQ nq) {
            super(1);
            this.B = z;
            this.C = nq;
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

    /* JADX INFO: renamed from: com.daaw.sP0$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ NQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z, NQ nq) {
            super(3);
            this.B = z;
            this.C = nq;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-140499264);
            interfaceC5781jp.e(-492369756);
            Object objF = interfaceC5781jp.f();
            if (objF == InterfaceC5781jp.a.a()) {
                objF = Integer.valueOf(C7903rP0.D.a());
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            C7903rP0 c7903rP0 = new C7903rP0(((Number) objF).intValue(), this.B, false, this.C);
            interfaceC5781jp.L();
            return c7903rP0;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, NQ nq) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, DiagnosticsEntry.Event.PROPERTIES_KEY);
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a(z, nq) : AbstractC5550j00.a(), new b(z, nq));
    }

    public static /* synthetic */ InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, NQ nq, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return a(interfaceC1073Hk0, z, nq);
    }
}
