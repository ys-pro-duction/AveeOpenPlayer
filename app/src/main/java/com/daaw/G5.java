package com.daaw;

import android.view.View;
import com.daaw.AbstractC0584Cu0;
import com.daaw.InterfaceC4943gp;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class G5 {

    public static final class a extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ QB B;

        /* JADX INFO: renamed from: com.daaw.G5$a$a, reason: collision with other inner class name */
        public static final class C0061a implements InterfaceC8973vC {
            public final /* synthetic */ QB a;

            public C0061a(QB qb) {
                this.a = qb;
            }

            @Override // com.daaw.InterfaceC8973vC
            public void a() {
                this.a.dismiss();
                this.a.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(QB qb) {
            super(1);
            this.B = qb;
        }

        @Override // com.daaw.NQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC8973vC invoke(C9252wC c9252wC) {
            G10.g(c9252wC, "$this$DisposableEffect");
            this.B.show();
            return new C0061a(this.B);
        }
    }

    public static final class b extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ QB B;
        public final /* synthetic */ LQ C;
        public final /* synthetic */ PB D;
        public final /* synthetic */ EnumC7560q90 E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(QB qb, LQ lq, PB pb, EnumC7560q90 enumC7560q90) {
            super(0);
            this.B = qb;
            this.C = lq;
            this.D = pb;
            this.E = enumC7560q90;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m7invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m7invoke() {
            this.B.f(this.C, this.D, this.E);
        }
    }

    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ PB C;
        public final /* synthetic */ InterfaceC3429bR D;
        public final /* synthetic */ int E;
        public final /* synthetic */ int F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LQ lq, PB pb, InterfaceC3429bR interfaceC3429bR, int i, int i2) {
            super(2);
            this.B = lq;
            this.C = pb;
            this.D = interfaceC3429bR;
            this.E = i;
            this.F = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            G5.a(this.B, this.C, this.D, interfaceC5781jp, this.E | 1, this.F);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC6258lW0 B;

        public static final class a extends AbstractC4192e90 implements NQ {
            public static final a B = new a();

            public a() {
                super(1);
            }

            public final void a(CP0 cp0) {
                G10.g(cp0, "$this$semantics");
                AP0.a(cp0);
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((CP0) obj);
                return G91.a;
            }
        }

        public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ InterfaceC6258lW0 B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC6258lW0 interfaceC6258lW0) {
                super(2);
                this.B = interfaceC6258lW0;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                } else {
                    G5.b(this.B).invoke(interfaceC5781jp, 0);
                }
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC6258lW0 interfaceC6258lW0) {
            super(2);
            this.B = interfaceC6258lW0;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
            } else {
                G5.c(AbstractC8182sP0.b(InterfaceC1073Hk0.m, false, a.B, 1, null), AbstractC1815Oo.b(interfaceC5781jp, -533674951, true, new b(this.B)), interfaceC5781jp, 48, 0);
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class e extends AbstractC4192e90 implements LQ {
        public static final e B = new e();

        public e() {
            super(0);
        }

        @Override // com.daaw.LQ
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class f implements InterfaceC0957Gh0 {
        public static final f a = new f();

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ List B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list) {
                super(1);
                this.B = list;
            }

            public final void a(AbstractC0584Cu0.a aVar) {
                G10.g(aVar, "$this$layout");
                List list = this.B;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    AbstractC0584Cu0.a.n(aVar, (AbstractC0584Cu0) list.get(i), 0, 0, 0.0f, 4, null);
                }
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((AbstractC0584Cu0.a) obj);
                return G91.a;
            }
        }

        @Override // com.daaw.InterfaceC0957Gh0
        public final InterfaceC1061Hh0 a(InterfaceC1269Jh0 interfaceC1269Jh0, List list, long j) {
            Object obj;
            G10.g(interfaceC1269Jh0, "$this$Layout");
            G10.g(list, "measurables");
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i = 0; i < size; i++) {
                arrayList.add(((InterfaceC0645Dh0) list.get(i)).G(j));
            }
            Object obj2 = null;
            int i2 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int iQ0 = ((AbstractC0584Cu0) obj).q0();
                int iM = AbstractC1599Mm.m(arrayList);
                if (1 <= iM) {
                    int i3 = 1;
                    while (true) {
                        Object obj3 = arrayList.get(i3);
                        int iQ02 = ((AbstractC0584Cu0) obj3).q0();
                        if (iQ0 < iQ02) {
                            obj = obj3;
                            iQ0 = iQ02;
                        }
                        if (i3 == iM) {
                            break;
                        }
                        i3++;
                    }
                }
            }
            AbstractC0584Cu0 abstractC0584Cu0 = (AbstractC0584Cu0) obj;
            int iQ03 = abstractC0584Cu0 != null ? abstractC0584Cu0.q0() : C6079kr.p(j);
            if (!arrayList.isEmpty()) {
                Object obj4 = arrayList.get(0);
                int iL0 = ((AbstractC0584Cu0) obj4).l0();
                int iM2 = AbstractC1599Mm.m(arrayList);
                if (1 <= iM2) {
                    while (true) {
                        Object obj5 = arrayList.get(i2);
                        int iL02 = ((AbstractC0584Cu0) obj5).l0();
                        if (iL0 < iL02) {
                            obj4 = obj5;
                            iL0 = iL02;
                        }
                        if (i2 == iM2) {
                            break;
                        }
                        i2++;
                    }
                }
                obj2 = obj4;
            }
            AbstractC0584Cu0 abstractC0584Cu02 = (AbstractC0584Cu0) obj2;
            return AbstractC1165Ih0.b(interfaceC1269Jh0, iQ03, abstractC0584Cu02 != null ? abstractC0584Cu02.l0() : C6079kr.o(j), null, new a(arrayList), 4, null);
        }
    }

    public static final class g extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ InterfaceC3429bR C;
        public final /* synthetic */ int D;
        public final /* synthetic */ int E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC3429bR interfaceC3429bR, int i, int i2) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = interfaceC3429bR;
            this.D = i;
            this.E = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            G5.c(this.B, this.C, interfaceC5781jp, this.D | 1, this.E);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(LQ lq, PB pb, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        int i3;
        PB pb2;
        int i4;
        G10.g(lq, "onDismissRequest");
        G10.g(interfaceC3429bR, "content");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-2032877254);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(lq) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                pb2 = pb;
                int i5 = interfaceC5781jpQ.P(pb2) ? 32 : 16;
                i3 |= i5;
            } else {
                pb2 = pb;
            }
            i3 |= i5;
        } else {
            pb2 = pb;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= interfaceC5781jpQ.P(interfaceC3429bR) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i3 & 731) == 146 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            interfaceC5781jpQ.p();
            if ((i & 1) != 0 && !interfaceC5781jpQ.F()) {
                interfaceC5781jpQ.B();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
            } else if ((i2 & 2) != 0) {
                i3 &= -113;
                pb2 = new PB(false, false, null, 7, null);
            }
            interfaceC5781jpQ.N();
            View view = (View) interfaceC5781jpQ.O(B5.i());
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jpQ.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jpQ.O(AbstractC2259Sp.g());
            AbstractC1300Jp abstractC1300JpD = AbstractC3540bp.d(interfaceC5781jpQ, 0);
            InterfaceC6258lW0 interfaceC6258lW0I = AbstractC7923rU0.i(interfaceC3429bR, interfaceC5781jpQ, (i3 >> 6) & 14);
            UUID uuid = (UUID) BG0.b(new Object[0], null, null, e.B, interfaceC5781jpQ, 3080, 6);
            interfaceC5781jpQ.e(511388516);
            boolean zP = interfaceC5781jpQ.P(view) | interfaceC5781jpQ.P(interfaceC4988gz);
            Object objF = interfaceC5781jpQ.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                G10.f(uuid, "dialogId");
                i4 = 0;
                QB qb = new QB(lq, pb2, view, enumC7560q90, interfaceC4988gz, uuid);
                qb.c(abstractC1300JpD, AbstractC1815Oo.c(488261145, true, new d(interfaceC6258lW0I)));
                interfaceC5781jpQ.H(qb);
                objF = qb;
            } else {
                i4 = 0;
            }
            interfaceC5781jpQ.L();
            QB qb2 = (QB) objF;
            AbstractC8420tF.a(qb2, new a(qb2), interfaceC5781jpQ, 8);
            AbstractC8420tF.g(new b(qb2, lq, pb2, enumC7560q90), interfaceC5781jpQ, i4);
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new c(lq, pb2, interfaceC3429bR, i, i2));
    }

    public static final InterfaceC3429bR b(InterfaceC6258lW0 interfaceC6258lW0) {
        return (InterfaceC3429bR) interfaceC6258lW0.getValue();
    }

    public static final void c(InterfaceC1073Hk0 interfaceC1073Hk0, InterfaceC3429bR interfaceC3429bR, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        int i3;
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-1177876616);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(interfaceC1073Hk0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= interfaceC5781jpQ.P(interfaceC3429bR) ? 32 : 16;
        }
        if ((i3 & 91) == 18 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            if (i4 != 0) {
                interfaceC1073Hk0 = InterfaceC1073Hk0.m;
            }
            f fVar = f.a;
            interfaceC5781jpQ.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jpQ.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jpQ.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jpQ.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
            LQ lqA = aVar.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (!AbstractC2988Zp0.a(interfaceC5781jpQ.v())) {
                AbstractC3540bp.c();
            }
            interfaceC5781jpQ.s();
            if (interfaceC5781jpQ.n()) {
                interfaceC5781jpQ.E(lqA);
            } else {
                interfaceC5781jpQ.G();
            }
            interfaceC5781jpQ.u();
            InterfaceC5781jp interfaceC5781jpA = AbstractC5987ka1.a(interfaceC5781jpQ);
            AbstractC5987ka1.b(interfaceC5781jpA, fVar, aVar.d());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar.b());
            AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar.c());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar.f());
            interfaceC5781jpQ.i();
            interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jpQ)), interfaceC5781jpQ, 0);
            interfaceC5781jpQ.e(2058660585);
            interfaceC3429bR.invoke(interfaceC5781jpQ, Integer.valueOf((i5 >> 9) & 14));
            interfaceC5781jpQ.L();
            interfaceC5781jpQ.M();
            interfaceC5781jpQ.L();
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new g(interfaceC1073Hk0, interfaceC3429bR, i, i2));
    }
}
