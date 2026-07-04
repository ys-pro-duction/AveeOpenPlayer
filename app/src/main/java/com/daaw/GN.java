package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class GN {

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ NQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(NQ nq) {
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

    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ NQ B;

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC8007rm0 B;
            public final /* synthetic */ NQ C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC8007rm0 interfaceC8007rm0, NQ nq) {
                super(1);
                this.B = interfaceC8007rm0;
                this.C = nq;
            }

            public final void a(InterfaceC3974dO interfaceC3974dO) {
                G10.g(interfaceC3974dO, "it");
                if (G10.c(this.B.getValue(), interfaceC3974dO)) {
                    return;
                }
                this.B.setValue(interfaceC3974dO);
                this.C.invoke(interfaceC3974dO);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((InterfaceC3974dO) obj);
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(NQ nq) {
            super(3);
            this.B = nq;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-1741761824);
            interfaceC5781jp.e(-492369756);
            Object objF = interfaceC5781jp.f();
            if (objF == InterfaceC5781jp.a.a()) {
                objF = AbstractC9046vU0.d(null, null, 2, null);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            InterfaceC1073Hk0 interfaceC1073Hk0B = JN.b(InterfaceC1073Hk0.m, new a((InterfaceC8007rm0) objF, this.B));
            interfaceC5781jp.L();
            return interfaceC1073Hk0B;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, NQ nq) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(nq, "onFocusChanged");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a(nq) : AbstractC5550j00.a(), new b(nq));
    }
}
