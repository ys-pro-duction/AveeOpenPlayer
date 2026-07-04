package com.daaw;

import com.daaw.ZN;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;

/* JADX INFO: loaded from: classes.dex */
public abstract class XN {
    public static final C6732nB0 a = AbstractC1592Mk0.a(a.B);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final YN invoke() {
            return null;
        }
    }

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NQ nq) {
            super(1);
            this.B = nq;
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

    public static final class c extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ SN B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(SN sn) {
            super(0);
            this.B = sn;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m37invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m37invoke() {
            YN ynK = this.B.k();
            if (ynK != null) {
                ynK.c(this.B.j());
            }
        }
    }

    public static final void a(VN vn) {
        G10.g(vn, "<this>");
        vn.o(true);
        ZN.a aVar = ZN.b;
        vn.n(aVar.a());
        vn.j(aVar.a());
        vn.l(aVar.a());
        vn.r(aVar.a());
        vn.p(aVar.a());
        vn.g(aVar.a());
        vn.q(aVar.a());
        vn.f(aVar.a());
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "scope");
        return interfaceC1073Hk0.g(new YN(nq, AbstractC5550j00.c() ? new b(nq) : AbstractC5550j00.a()));
    }

    public static final C6732nB0 c() {
        return a;
    }

    public static final void d(SN sn) {
        C1620Mr0 snapshotObserver;
        G10.g(sn, "<this>");
        K90 k90Q = sn.q();
        if (k90Q == null) {
            return;
        }
        a(sn.j());
        InterfaceC1413Kr0 interfaceC1413Kr0K0 = k90Q.X0().k0();
        if (interfaceC1413Kr0K0 != null && (snapshotObserver = interfaceC1413Kr0K0.getSnapshotObserver()) != null) {
            snapshotObserver.e(sn, SN.Q.a(), new c(sn));
        }
        e(sn, sn.j());
    }

    public static final void e(SN sn, VN vn) {
        G10.g(sn, "<this>");
        G10.g(vn, DiagnosticsEntry.Event.PROPERTIES_KEY);
        if (vn.b()) {
            AbstractC4820gO.a(sn);
        } else {
            AbstractC4820gO.e(sn);
        }
    }
}
