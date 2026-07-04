package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class JN {
    public static final C6732nB0 a = AbstractC1592Mk0.a(a.B);

    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final KN invoke() {
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

    public static final class c extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ NQ B;

        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ KN B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(KN kn) {
                super(0);
                this.B = kn;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m10invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m10invoke() {
                this.B.h();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(NQ nq) {
            super(3);
            this.B = nq;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(607036704);
            NQ nq = this.B;
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(nq);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new KN(nq);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            KN kn = (KN) objF;
            AbstractC8420tF.g(new a(kn), interfaceC5781jp, 0);
            interfaceC5781jp.L();
            return kn;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final C6732nB0 a() {
        return a;
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "onFocusEvent");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new b(nq) : AbstractC5550j00.a(), new c(nq));
    }
}
