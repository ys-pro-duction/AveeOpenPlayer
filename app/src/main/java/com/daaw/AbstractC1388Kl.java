package com.daaw;

import android.view.KeyEvent;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC5781jp;

/* JADX INFO: renamed from: com.daaw.Kl, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1388Kl {

    /* JADX INFO: renamed from: com.daaw.Kl$a */
    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ InterfaceC8007rm0 B;
        public final /* synthetic */ InterfaceC4650fm0 C;

        /* JADX INFO: renamed from: com.daaw.Kl$a$a, reason: collision with other inner class name */
        public static final class C0089a implements InterfaceC8973vC {
            public final /* synthetic */ InterfaceC8007rm0 a;
            public final /* synthetic */ InterfaceC4650fm0 b;

            public C0089a(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
                this.a = interfaceC8007rm0;
                this.b = interfaceC4650fm0;
            }

            @Override // com.daaw.InterfaceC8973vC
            public void a() {
                C6115kz0 c6115kz0 = (C6115kz0) this.a.getValue();
                if (c6115kz0 != null) {
                    this.b.c(new C5827jz0(c6115kz0));
                    this.a.setValue(null);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC8007rm0 interfaceC8007rm0, InterfaceC4650fm0 interfaceC4650fm0) {
            super(1);
            this.B = interfaceC8007rm0;
            this.C = interfaceC4650fm0;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8973vC invoke(C9252wC c9252wC) {
            G10.g(c9252wC, "$this$DisposableEffect");
            return new C0089a(this.B, this.C);
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kl$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC4650fm0 B;
        public final /* synthetic */ InterfaceC8007rm0 C;
        public final /* synthetic */ int D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, int i) {
            super(2);
            this.B = interfaceC4650fm0;
            this.C = interfaceC8007rm0;
            this.D = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC1388Kl.a(this.B, this.C, interfaceC5781jp, this.D | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kl$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ String C;
        public final /* synthetic */ OJ0 D;
        public final /* synthetic */ LQ E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z, String str, OJ0 oj0, LQ lq) {
            super(3);
            this.B = z;
            this.C = str;
            this.D = oj0;
            this.E = lq;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(-756081143);
            InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
            InterfaceC9344wZ interfaceC9344wZ = (InterfaceC9344wZ) interfaceC5781jp.O(AbstractC9902yZ.a());
            interfaceC5781jp.e(-492369756);
            Object objF = interfaceC5781jp.f();
            if (objF == InterfaceC5781jp.a.a()) {
                objF = AbstractC3038a10.a();
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC1388Kl.b(aVar, (InterfaceC4650fm0) objF, interfaceC9344wZ, this.B, this.C, this.D, this.E);
            interfaceC5781jp.L();
            return interfaceC1073Hk0B;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kl$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3986dR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ boolean C;
        public final /* synthetic */ InterfaceC4650fm0 D;
        public final /* synthetic */ InterfaceC9344wZ E;
        public final /* synthetic */ String F;
        public final /* synthetic */ OJ0 G;

        /* JADX INFO: renamed from: com.daaw.Kl$d$a */
        public static final class a implements InterfaceC1385Kk0 {
            public final /* synthetic */ InterfaceC8007rm0 B;

            public a(InterfaceC8007rm0 interfaceC8007rm0) {
                this.B = interfaceC8007rm0;
            }

            @Override // com.daaw.InterfaceC1073Hk0
            public /* synthetic */ boolean I(NQ nq) {
                return AbstractC1177Ik0.a(this, nq);
            }

            @Override // com.daaw.InterfaceC1385Kk0
            public void e(InterfaceC1904Pk0 interfaceC1904Pk0) {
                G10.g(interfaceC1904Pk0, "scope");
                this.B.setValue(interfaceC1904Pk0.a(AbstractC3418bO0.a()));
            }

            @Override // com.daaw.InterfaceC1073Hk0
            public /* synthetic */ Object f(Object obj, InterfaceC3429bR interfaceC3429bR) {
                return AbstractC1177Ik0.c(this, obj, interfaceC3429bR);
            }

            @Override // com.daaw.InterfaceC1073Hk0
            public /* synthetic */ InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0) {
                return AbstractC0969Gk0.a(this, interfaceC1073Hk0);
            }

            @Override // com.daaw.InterfaceC1073Hk0
            public /* synthetic */ Object x(Object obj, InterfaceC3429bR interfaceC3429bR) {
                return AbstractC1177Ik0.b(this, obj, interfaceC3429bR);
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kl$d$b */
        public static final class b extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ InterfaceC8007rm0 B;
            public final /* synthetic */ LQ C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC8007rm0 interfaceC8007rm0, LQ lq) {
                super(0);
                this.B = interfaceC8007rm0;
                this.C = lq;
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(((Boolean) this.B.getValue()).booleanValue() || ((Boolean) this.C.invoke()).booleanValue());
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kl$d$c */
        public static final class c extends SZ0 implements InterfaceC3429bR {
            public int F;
            public /* synthetic */ Object G;
            public final /* synthetic */ boolean H;
            public final /* synthetic */ InterfaceC4650fm0 I;
            public final /* synthetic */ InterfaceC8007rm0 J;
            public final /* synthetic */ InterfaceC6258lW0 K;
            public final /* synthetic */ InterfaceC6258lW0 L;

            /* JADX INFO: renamed from: com.daaw.Kl$d$c$a */
            public static final class a extends SZ0 implements InterfaceC3986dR {
                public int F;
                public /* synthetic */ Object G;
                public /* synthetic */ long H;
                public final /* synthetic */ boolean I;
                public final /* synthetic */ InterfaceC4650fm0 J;
                public final /* synthetic */ InterfaceC8007rm0 K;
                public final /* synthetic */ InterfaceC6258lW0 L;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(boolean z, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC1416Ks interfaceC1416Ks) {
                    super(3, interfaceC1416Ks);
                    this.I = z;
                    this.J = interfaceC4650fm0;
                    this.K = interfaceC8007rm0;
                    this.L = interfaceC6258lW0;
                }

                @Override // com.daaw.InterfaceC3986dR
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
                    return u((InterfaceC5268hz0) obj, ((C9982yp0) obj2).t(), (InterfaceC1416Ks) obj3);
                }

                @Override // com.daaw.AbstractC7409pe
                public final Object q(Object obj) throws Throwable {
                    Object objC = I10.c();
                    int i = this.F;
                    if (i == 0) {
                        AbstractC4801gJ0.b(obj);
                        InterfaceC5268hz0 interfaceC5268hz0 = (InterfaceC5268hz0) this.G;
                        long j = this.H;
                        if (this.I) {
                            InterfaceC4650fm0 interfaceC4650fm0 = this.J;
                            InterfaceC8007rm0 interfaceC8007rm0 = this.K;
                            InterfaceC6258lW0 interfaceC6258lW0 = this.L;
                            this.F = 1;
                            if (AbstractC1388Kl.i(interfaceC5268hz0, j, interfaceC4650fm0, interfaceC8007rm0, interfaceC6258lW0, this) == objC) {
                                return objC;
                            }
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC4801gJ0.b(obj);
                    }
                    return G91.a;
                }

                public final Object u(InterfaceC5268hz0 interfaceC5268hz0, long j, InterfaceC1416Ks interfaceC1416Ks) {
                    a aVar = new a(this.I, this.J, this.K, this.L, interfaceC1416Ks);
                    aVar.G = interfaceC5268hz0;
                    aVar.H = j;
                    return aVar.q(G91.a);
                }
            }

            /* JADX INFO: renamed from: com.daaw.Kl$d$c$b */
            public static final class b extends AbstractC4192e90 implements NQ {
                public final /* synthetic */ boolean B;
                public final /* synthetic */ InterfaceC6258lW0 C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(boolean z, InterfaceC6258lW0 interfaceC6258lW0) {
                    super(1);
                    this.B = z;
                    this.C = interfaceC6258lW0;
                }

                public final void a(long j) {
                    if (this.B) {
                        ((LQ) this.C.getValue()).invoke();
                    }
                }

                @Override // com.daaw.NQ
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    a(((C9982yp0) obj).t());
                    return G91.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(boolean z, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC6258lW0 interfaceC6258lW02, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = z;
                this.I = interfaceC4650fm0;
                this.J = interfaceC8007rm0;
                this.K = interfaceC6258lW0;
                this.L = interfaceC6258lW02;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                c cVar = new c(this.H, this.I, this.J, this.K, this.L, interfaceC1416Ks);
                cVar.G = obj;
                return cVar;
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                Object objC = I10.c();
                int i = this.F;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    InterfaceC9740xx0 interfaceC9740xx0 = (InterfaceC9740xx0) this.G;
                    a aVar = new a(this.H, this.I, this.J, this.K, null);
                    b bVar = new b(this.H, this.L);
                    this.F = 1;
                    if (Y01.i(interfaceC9740xx0, aVar, bVar, this) == objC) {
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
            public final Object invoke(InterfaceC9740xx0 interfaceC9740xx0, InterfaceC1416Ks interfaceC1416Ks) {
                return ((c) a(interfaceC9740xx0, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LQ lq, boolean z, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC9344wZ interfaceC9344wZ, String str, OJ0 oj0) {
            super(3);
            this.B = lq;
            this.C = z;
            this.D = interfaceC4650fm0;
            this.E = interfaceC9344wZ;
            this.F = str;
            this.G = oj0;
        }

        public final InterfaceC1073Hk0 a(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC1073Hk0, "$this$composed");
            interfaceC5781jp.e(92076020);
            InterfaceC6258lW0 interfaceC6258lW0I = AbstractC7923rU0.i(this.B, interfaceC5781jp, 0);
            interfaceC5781jp.e(-492369756);
            Object objF = interfaceC5781jp.f();
            InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
            if (objF == aVar.a()) {
                objF = AbstractC9046vU0.d(null, null, 2, null);
                interfaceC5781jp.H(objF);
            }
            interfaceC5781jp.L();
            InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
            interfaceC5781jp.e(1841981204);
            if (this.C) {
                AbstractC1388Kl.a(this.D, interfaceC8007rm0, interfaceC5781jp, 48);
            }
            interfaceC5781jp.L();
            LQ lqD = AbstractC1492Ll.d(interfaceC5781jp, 0);
            interfaceC5781jp.e(-492369756);
            Object objF2 = interfaceC5781jp.f();
            if (objF2 == aVar.a()) {
                objF2 = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
                interfaceC5781jp.H(objF2);
            }
            interfaceC5781jp.L();
            InterfaceC8007rm0 interfaceC8007rm02 = (InterfaceC8007rm0) objF2;
            InterfaceC6258lW0 interfaceC6258lW0I2 = AbstractC7923rU0.i(new b(interfaceC8007rm02, lqD), interfaceC5781jp, 0);
            InterfaceC1073Hk0.a aVar2 = InterfaceC1073Hk0.m;
            InterfaceC1073Hk0 interfaceC1073Hk0C = UZ0.c(aVar2, this.D, Boolean.valueOf(this.C), new c(this.C, this.D, interfaceC8007rm0, interfaceC6258lW0I2, interfaceC6258lW0I, null));
            interfaceC5781jp.e(-492369756);
            Object objF3 = interfaceC5781jp.f();
            if (objF3 == aVar.a()) {
                objF3 = new a(interfaceC8007rm02);
                interfaceC5781jp.H(objF3);
            }
            interfaceC5781jp.L();
            InterfaceC1073Hk0 interfaceC1073Hk0F = AbstractC1388Kl.f(aVar2.g((InterfaceC1073Hk0) objF3), interfaceC1073Hk0C, this.D, this.E, this.C, this.F, this.G, null, null, this.B);
            interfaceC5781jp.L();
            return interfaceC1073Hk0F;
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return a((InterfaceC1073Hk0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kl$e */
    public static final class e extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ String C;
        public final /* synthetic */ OJ0 D;
        public final /* synthetic */ LQ E;
        public final /* synthetic */ InterfaceC9344wZ F;
        public final /* synthetic */ InterfaceC4650fm0 G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(boolean z, String str, OJ0 oj0, LQ lq, InterfaceC9344wZ interfaceC9344wZ, InterfaceC4650fm0 interfaceC4650fm0) {
            super(1);
            this.B = z;
            this.C = str;
            this.D = oj0;
            this.E = lq;
            this.F = interfaceC9344wZ;
            this.G = interfaceC4650fm0;
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

    /* JADX INFO: renamed from: com.daaw.Kl$f */
    public static final class f extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ String C;
        public final /* synthetic */ OJ0 D;
        public final /* synthetic */ LQ E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(boolean z, String str, OJ0 oj0, LQ lq) {
            super(1);
            this.B = z;
            this.C = str;
            this.D = oj0;
            this.E = lq;
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

    /* JADX INFO: renamed from: com.daaw.Kl$g */
    public static final class g extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ OJ0 B;
        public final /* synthetic */ String C;
        public final /* synthetic */ LQ D;
        public final /* synthetic */ String E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ LQ G;

        /* JADX INFO: renamed from: com.daaw.Kl$g$a */
        public static final class a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ LQ B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LQ lq) {
                super(0);
                this.B = lq;
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.B.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX INFO: renamed from: com.daaw.Kl$g$b */
        public static final class b extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ LQ B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(LQ lq) {
                super(0);
                this.B = lq;
            }

            @Override // com.daaw.LQ
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                this.B.invoke();
                return Boolean.TRUE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(OJ0 oj0, String str, LQ lq, String str2, boolean z, LQ lq2) {
            super(1);
            this.B = oj0;
            this.C = str;
            this.D = lq;
            this.E = str2;
            this.F = z;
            this.G = lq2;
        }

        public final void a(CP0 cp0) {
            G10.g(cp0, "$this$semantics");
            OJ0 oj0 = this.B;
            if (oj0 != null) {
                AP0.p(cp0, oj0.m());
            }
            AP0.g(cp0, this.C, new a(this.G));
            LQ lq = this.D;
            if (lq != null) {
                AP0.i(cp0, this.E, new b(lq));
            }
            if (this.F) {
                return;
            }
            AP0.b(cp0);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((CP0) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kl$h */
    public static final class h extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ boolean B;
        public final /* synthetic */ LQ C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(boolean z, LQ lq) {
            super(1);
            this.B = z;
            this.C = lq;
        }

        public final Boolean a(KeyEvent keyEvent) {
            boolean z;
            G10.g(keyEvent, "it");
            if (this.B && AbstractC1492Ll.c(keyEvent)) {
                this.C.invoke();
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return a(((I70) obj).f());
        }
    }

    /* JADX INFO: renamed from: com.daaw.Kl$i */
    public static final class i extends SZ0 implements InterfaceC3429bR {
        public boolean F;
        public int G;
        public /* synthetic */ Object H;
        public final /* synthetic */ InterfaceC5268hz0 I;
        public final /* synthetic */ long J;
        public final /* synthetic */ InterfaceC4650fm0 K;
        public final /* synthetic */ InterfaceC8007rm0 L;
        public final /* synthetic */ InterfaceC6258lW0 M;

        /* JADX INFO: renamed from: com.daaw.Kl$i$a */
        public static final class a extends SZ0 implements InterfaceC3429bR {
            public Object F;
            public int G;
            public final /* synthetic */ InterfaceC6258lW0 H;
            public final /* synthetic */ long I;
            public final /* synthetic */ InterfaceC4650fm0 J;
            public final /* synthetic */ InterfaceC8007rm0 K;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC6258lW0 interfaceC6258lW0, long j, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
                super(2, interfaceC1416Ks);
                this.H = interfaceC6258lW0;
                this.I = j;
                this.J = interfaceC4650fm0;
                this.K = interfaceC8007rm0;
            }

            @Override // com.daaw.AbstractC7409pe
            public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
                return new a(this.H, this.I, this.J, this.K, interfaceC1416Ks);
            }

            @Override // com.daaw.AbstractC7409pe
            public final Object q(Object obj) throws Throwable {
                C6115kz0 c6115kz0;
                Object objC = I10.c();
                int i = this.G;
                if (i == 0) {
                    AbstractC4801gJ0.b(obj);
                    if (((Boolean) ((LQ) this.H.getValue()).invoke()).booleanValue()) {
                        long jB = AbstractC1492Ll.b();
                        this.G = 1;
                        if (AbstractC0391Ay.a(jB, this) != objC) {
                        }
                        return objC;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c6115kz0 = (C6115kz0) this.F;
                        AbstractC4801gJ0.b(obj);
                        this.K.setValue(c6115kz0);
                        return G91.a;
                    }
                    AbstractC4801gJ0.b(obj);
                }
                C6115kz0 c6115kz02 = new C6115kz0(this.I, null);
                InterfaceC4650fm0 interfaceC4650fm0 = this.J;
                this.F = c6115kz02;
                this.G = 2;
                if (interfaceC4650fm0.a(c6115kz02, this) != objC) {
                    c6115kz0 = c6115kz02;
                    this.K.setValue(c6115kz0);
                    return G91.a;
                }
                return objC;
            }

            @Override // com.daaw.InterfaceC3429bR
            /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
                return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC5268hz0 interfaceC5268hz0, long j, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.I = interfaceC5268hz0;
            this.J = j;
            this.K = interfaceC4650fm0;
            this.L = interfaceC8007rm0;
            this.M = interfaceC6258lW0;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            i iVar = new i(this.I, this.J, this.K, this.L, this.M, interfaceC1416Ks);
            iVar.H = obj;
            return iVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:31:0x00ae, code lost:
        
            if (r3.a(r2, r17) != r1) goto L42;
         */
        /* JADX WARN: Code restructure failed: missing block: B:40:0x00d2, code lost:
        
            if (r4.a(r5, r17) == r1) goto L41;
         */
        /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r18) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 221
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC1388Kl.i.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((i) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final void a(InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC5781jp interfaceC5781jp, int i2) {
        int i3;
        G10.g(interfaceC4650fm0, "interactionSource");
        G10.g(interfaceC8007rm0, "pressedInteraction");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1761107222);
        if ((i2 & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(interfaceC4650fm0) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= interfaceC5781jpQ.P(interfaceC8007rm0) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            interfaceC5781jpQ.e(511388516);
            boolean zP = interfaceC5781jpQ.P(interfaceC8007rm0) | interfaceC5781jpQ.P(interfaceC4650fm0);
            Object objF = interfaceC5781jpQ.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new a(interfaceC8007rm0, interfaceC4650fm0);
                interfaceC5781jpQ.H(objF);
            }
            interfaceC5781jpQ.L();
            AbstractC8420tF.a(interfaceC4650fm0, (NQ) objF, interfaceC5781jpQ, i3 & 14);
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new b(interfaceC4650fm0, interfaceC8007rm0, i2));
    }

    public static final InterfaceC1073Hk0 b(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC9344wZ interfaceC9344wZ, boolean z, String str, OJ0 oj0, LQ lq) {
        InterfaceC4650fm0 interfaceC4650fm02;
        InterfaceC9344wZ interfaceC9344wZ2;
        boolean z2;
        String str2;
        OJ0 oj02;
        LQ lq2;
        NQ nqA;
        G10.g(interfaceC1073Hk0, "$this$clickable");
        G10.g(interfaceC4650fm0, "interactionSource");
        G10.g(lq, "onClick");
        if (AbstractC5550j00.c()) {
            interfaceC9344wZ2 = interfaceC9344wZ;
            z2 = z;
            str2 = str;
            oj02 = oj0;
            nqA = new e(z2, str2, oj02, lq, interfaceC9344wZ2, interfaceC4650fm0);
            lq2 = lq;
            interfaceC4650fm02 = interfaceC4650fm0;
        } else {
            interfaceC4650fm02 = interfaceC4650fm0;
            interfaceC9344wZ2 = interfaceC9344wZ;
            z2 = z;
            str2 = str;
            oj02 = oj0;
            lq2 = lq;
            nqA = AbstractC5550j00.a();
        }
        return AbstractC5500ip.a(interfaceC1073Hk0, nqA, new d(lq2, z2, interfaceC4650fm02, interfaceC9344wZ2, str2, oj02));
    }

    public static final InterfaceC1073Hk0 d(InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, String str, OJ0 oj0, LQ lq) {
        G10.g(interfaceC1073Hk0, "$this$clickable");
        G10.g(lq, "onClick");
        return AbstractC5500ip.a(interfaceC1073Hk0, AbstractC5550j00.c() ? new f(z, str, oj0, lq) : AbstractC5550j00.a(), new c(z, str, oj0, lq));
    }

    public static /* synthetic */ InterfaceC1073Hk0 e(InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, String str, OJ0 oj0, LQ lq, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = true;
        }
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            oj0 = null;
        }
        return d(interfaceC1073Hk0, z, str, oj0, lq);
    }

    public static final InterfaceC1073Hk0 f(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC1073Hk0 interfaceC1073Hk02, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC9344wZ interfaceC9344wZ, boolean z, String str, OJ0 oj0, String str2, LQ lq, LQ lq2) {
        G10.g(interfaceC1073Hk0, "$this$genericClickableWithoutGesture");
        G10.g(interfaceC1073Hk02, "gestureModifiers");
        G10.g(interfaceC4650fm0, "interactionSource");
        G10.g(lq2, "onClick");
        return AbstractC5378iO.c(AbstractC7930rW.a(AbstractC9902yZ.b(h(g(interfaceC1073Hk0, oj0, str, lq, str2, z, lq2), z, lq2), interfaceC4650fm0, interfaceC9344wZ), interfaceC4650fm0, z), z, interfaceC4650fm0).g(interfaceC1073Hk02);
    }

    public static final InterfaceC1073Hk0 g(InterfaceC1073Hk0 interfaceC1073Hk0, OJ0 oj0, String str, LQ lq, String str2, boolean z, LQ lq2) {
        return AbstractC8182sP0.a(interfaceC1073Hk0, true, new g(oj0, str, lq, str2, z, lq2));
    }

    public static final InterfaceC1073Hk0 h(InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, LQ lq) {
        return R70.b(interfaceC1073Hk0, new h(z, lq));
    }

    public static final Object i(InterfaceC5268hz0 interfaceC5268hz0, long j, InterfaceC4650fm0 interfaceC4650fm0, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC6258lW0 interfaceC6258lW0, InterfaceC1416Ks interfaceC1416Ks) {
        Object objE = AbstractC7763qt.e(new i(interfaceC5268hz0, j, interfaceC4650fm0, interfaceC8007rm0, interfaceC6258lW0, null), interfaceC1416Ks);
        return objE == I10.c() ? objE : G91.a;
    }
}
