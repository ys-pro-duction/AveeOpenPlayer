package com.daaw;

/* JADX INFO: loaded from: classes.dex */
public abstract class UZ0 {
    public static final C4134dx0 a = new C4134dx0(AbstractC1599Mm.k());

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Object B;
        public final /* synthetic */ InterfaceC3429bR C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Object obj, InterfaceC3429bR interfaceC3429bR) {
            super(1);
            this.B = obj;
            this.C = interfaceC3429bR;
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

    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Object B;
        public final /* synthetic */ Object C;
        public final /* synthetic */ InterfaceC3429bR D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Object obj, Object obj2, InterfaceC3429bR interfaceC3429bR) {
            super(1);
            this.B = obj;
            this.C = obj2;
            this.D = interfaceC3429bR;
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

    public static final class c extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ Object[] B;
        public final /* synthetic */ InterfaceC3429bR C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Object[] objArr, InterfaceC3429bR interfaceC3429bR) {
            super(1);
            this.B = objArr;
            this.C = interfaceC3429bR;
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

    public static final class d extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Object B;
        public final /* synthetic */ InterfaceC3429bR C;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ TZ0 H;
            public final /* synthetic */ InterfaceC3429bR I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TZ0 tz0, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = tz0;
                this.I = interfaceC3429bR;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, interfaceC1416Ks);
                aVar.G = obj;
                return aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    this.H.t0((InterfaceC7484pt) this.G);
                    InterfaceC3429bR interfaceC3429bR = this.I;
                    TZ0 tz0 = this.H;
                    this.F = 1;
                    if (interfaceC3429bR.invoke(tz0, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Object obj, InterfaceC3429bR interfaceC3429bR) {
            super(3);
            this.B = obj;
            this.C = interfaceC3429bR;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-906157935);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(interfaceC4988gz);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new TZ0(interfaceC2733Xd1, interfaceC4988gz);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            TZ0 tz0 = (TZ0) objF;
            AbstractC8420tF.d(tz0, this.B, new a(tz0, this.C, null), interfaceC5781jp, 64);
            interfaceC5781jp.L();
            return tz0;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class e extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Object B;
        public final /* synthetic */ Object C;
        public final /* synthetic */ InterfaceC3429bR D;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ TZ0 H;
            public final /* synthetic */ InterfaceC3429bR I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TZ0 tz0, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = tz0;
                this.I = interfaceC3429bR;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, interfaceC1416Ks);
                aVar.G = obj;
                return aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    this.H.t0((InterfaceC7484pt) this.G);
                    InterfaceC3429bR interfaceC3429bR = this.I;
                    TZ0 tz0 = this.H;
                    this.F = 1;
                    if (interfaceC3429bR.invoke(tz0, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Object obj, Object obj2, InterfaceC3429bR interfaceC3429bR) {
            super(3);
            this.B = obj;
            this.C = obj2;
            this.D = interfaceC3429bR;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(1175567217);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(interfaceC4988gz);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new TZ0(interfaceC2733Xd1, interfaceC4988gz);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            TZ0 tz0 = (TZ0) objF;
            AbstractC8420tF.e(tz0, this.B, this.C, new a(tz0, this.D, null), interfaceC5781jp, 576);
            interfaceC5781jp.L();
            return tz0;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final class f extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ Object[] B;
        public final /* synthetic */ InterfaceC3429bR C;

        public static final class a extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ TZ0 H;
            public final /* synthetic */ InterfaceC3429bR I;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(TZ0 tz0, InterfaceC3429bR interfaceC3429bR, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = tz0;
                this.I = interfaceC3429bR;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                a aVar = new a(this.H, this.I, interfaceC1416Ks);
                aVar.G = obj;
                return aVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    this.H.t0((InterfaceC7484pt) this.G);
                    InterfaceC3429bR interfaceC3429bR = this.I;
                    TZ0 tz0 = this.H;
                    this.F = 1;
                    if (interfaceC3429bR.invoke(tz0, this) == objC) {
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC4801gJ0.b(obj);
                }
                return G91.a;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object[] objArr, InterfaceC3429bR interfaceC3429bR) {
            super(3);
            this.B = objArr;
            this.C = interfaceC3429bR;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(664422852);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            interfaceC5781jp.e(1157296644);
            boolean zP = interfaceC5781jp.P(interfaceC4988gz);
            Object objF = interfaceC5781jp.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new TZ0(interfaceC2733Xd1, interfaceC4988gz);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            Object[] objArr = this.B;
            InterfaceC3429bR interfaceC3429bR = this.C;
            TZ0 tz0 = (TZ0) objF;
            C9608xV0 c9608xV0 = new C9608xV0(2);
            c9608xV0.a(tz0);
            c9608xV0.b(objArr);
            AbstractC8420tF.f(c9608xV0.d(new Object[c9608xV0.c()]), new a(tz0, interfaceC3429bR, null), interfaceC5781jp, 8);
            interfaceC5781jp.L();
            return tz0;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, Object obj, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(interfaceC3429bR, "block");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new a(obj, interfaceC3429bR) : AbstractC5550j00.a(), new d(obj, interfaceC3429bR));
    }

    public static final InterfaceC1073Hk0 c(InterfaceC1073Hk0 interfaceC1073Hk0, Object obj, Object obj2, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(interfaceC3429bR, "block");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new b(obj, obj2, interfaceC3429bR) : AbstractC5550j00.a(), new e(obj, obj2, interfaceC3429bR));
    }

    public static final InterfaceC1073Hk0 d(InterfaceC1073Hk0 interfaceC1073Hk0, Object[] objArr, InterfaceC3429bR interfaceC3429bR) {
        G10.g(interfaceC1073Hk0, "<this>");
        G10.g(objArr, "keys");
        G10.g(interfaceC3429bR, "block");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new c(objArr, interfaceC3429bR) : AbstractC5550j00.a(), new f(objArr, interfaceC3429bR));
    }
}
