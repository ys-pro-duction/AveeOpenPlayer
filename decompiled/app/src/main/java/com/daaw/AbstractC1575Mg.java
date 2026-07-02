package com.daaw;

/* JADX INFO: renamed from: com.daaw.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1575Mg {

    /* JADX INFO: renamed from: com.daaw.Mg$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC1368Kg B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC1368Kg interfaceC1368Kg) {
            super(1);
            this.B = interfaceC1368Kg;
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

    /* JADX INFO: renamed from: com.daaw.Mg$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ InterfaceC1368Kg B;

        /* JADX INFO: renamed from: com.daaw.Mg$b$a */
        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ InterfaceC1368Kg B;
            public final /* synthetic */ C1679Ng C;

            /* JADX INFO: renamed from: com.daaw.Mg$b$a$a, reason: collision with other inner class name */
            public static final class C0092a implements InterfaceC8973vC {
                public final /* synthetic */ InterfaceC1368Kg a;
                public final /* synthetic */ C1679Ng b;

                public C0092a(InterfaceC1368Kg interfaceC1368Kg, C1679Ng c1679Ng) {
                    this.a = interfaceC1368Kg;
                    this.b = c1679Ng;
                }

                @Override // com.daaw.InterfaceC8973vC
                public void a() {
                    ((C1472Lg) this.a).b().w(this.b);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC1368Kg interfaceC1368Kg, C1679Ng c1679Ng) {
                super(1);
                this.B = interfaceC1368Kg;
                this.C = c1679Ng;
            }

            @Override // com.daaw.NQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final InterfaceC8973vC invoke(C9252wC c9252wC) {
                G10.g(c9252wC, "$this$DisposableEffect");
                ((C1472Lg) this.B).b().d(this.C);
                return new C0092a(this.B, this.C);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1368Kg interfaceC1368Kg) {
            super(3);
            this.B = interfaceC1368Kg;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-992853993);
            InterfaceC1160Ig interfaceC1160IgB = AbstractC1783Og.b(interfaceC5781jp, 0);
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(interfaceC1160IgB);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new C1679Ng(interfaceC1160IgB);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            C1679Ng c1679Ng = (C1679Ng) objF;
            InterfaceC1368Kg interfaceC1368Kg = this.B;
            if (interfaceC1368Kg instanceof C1472Lg) {
                AbstractC8420tF.a(interfaceC1368Kg, new a(interfaceC1368Kg, c1679Ng), interfaceC5781jp, 0);
            }
            interfaceC5781jp.L();
            return c1679Ng;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1368Kg a() {
        return new C1472Lg();
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC1368Kg interfaceC1368Kg) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(interfaceC1368Kg, "bringIntoViewRequester");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a(interfaceC1368Kg) : AbstractC5550j00.a(), new b(interfaceC1368Kg));
    }
}
