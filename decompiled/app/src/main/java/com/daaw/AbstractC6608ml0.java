package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.daaw.C1032Ha;
import com.daaw.C2559Vm;
import com.daaw.CJ;
import com.daaw.H3;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC2110Re0;
import com.daaw.InterfaceC4943gp;
import com.daaw.SO;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.ml0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6608ml0 {

    /* JADX INFO: renamed from: com.daaw.ml0$a */
    public static final class a extends AbstractC4192e90 implements LQ {
        public static final a B = new a();

        public a() {
            super(0);
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m59invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m59invoke() {
        }
    }

    /* JADX INFO: renamed from: com.daaw.ml0$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;
        public final /* synthetic */ InterfaceC9648xe0 D;
        public final /* synthetic */ InterfaceC1880Pe0 E;
        public final /* synthetic */ Context F;

        /* JADX INFO: renamed from: com.daaw.ml0$b$a */
        public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ LQ B;
            public final /* synthetic */ int C;
            public final /* synthetic */ InterfaceC9648xe0 D;
            public final /* synthetic */ InterfaceC1880Pe0 E;
            public final /* synthetic */ Context F;

            /* JADX INFO: renamed from: com.daaw.ml0$b$a$a, reason: collision with other inner class name */
            public static final class C0215a extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ InterfaceC9648xe0 B;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0215a(InterfaceC9648xe0 interfaceC9648xe0) {
                    super(0);
                    this.B = interfaceC9648xe0;
                }

                @Override // com.daaw.LQ
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Float invoke() {
                    return Float.valueOf(AbstractC6608ml0.c(this.B));
                }
            }

            /* JADX INFO: renamed from: com.daaw.ml0$b$a$b, reason: collision with other inner class name */
            public static final class C0216b extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ String B;
                public final /* synthetic */ Context C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0216b(String str, Context context) {
                    super(0);
                    this.B = str;
                    this.C = context;
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m60invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m60invoke() {
                    this.C.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.B)));
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LQ lq, int i, InterfaceC9648xe0 interfaceC9648xe0, InterfaceC1880Pe0 interfaceC1880Pe0, Context context) {
                super(2);
                this.B = lq;
                this.C = i;
                this.D = interfaceC9648xe0;
                this.E = interfaceC1880Pe0;
                this.F = context;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                    return;
                }
                if (AbstractC6348lp.O()) {
                    AbstractC6348lp.Z(-451024703, i, -1, "com.daaw.avee.composables.dialogs.MoreTemplatesDialog.<anonymous>.<anonymous> (MoreTemplatesDialog.kt:74)");
                }
                InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
                InterfaceC1073Hk0 interfaceC1073Hk0M = AT0.m(aVar, 0.0f, 1, null);
                H3.a aVar2 = H3.a;
                H3 h3A = aVar2.a();
                LQ lq = this.B;
                int i2 = this.C;
                InterfaceC9648xe0 interfaceC9648xe0 = this.D;
                InterfaceC1880Pe0 interfaceC1880Pe0 = this.E;
                Context context = this.F;
                interfaceC5781jp.e(733328855);
                InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(h3A, false, interfaceC5781jp, 6);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                InterfaceC4943gp.a aVar3 = InterfaceC4943gp.d;
                LQ lqA = aVar3.a();
                InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0M);
                if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                    AbstractC3540bp.c();
                }
                interfaceC5781jp.s();
                if (interfaceC5781jp.n()) {
                    interfaceC5781jp.E(lqA);
                } else {
                    interfaceC5781jp.G();
                }
                interfaceC5781jp.u();
                InterfaceC5781jp interfaceC5781jpA = AbstractC5987ka1.a(interfaceC5781jp);
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0H, aVar3.d());
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar3.b());
                AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar3.c());
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar3.f());
                interfaceC5781jp.i();
                interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-2137368960);
                C9936yg c9936yg = C9936yg.a;
                float f = 1;
                InterfaceC1073Hk0 interfaceC1073Hk0D = AbstractC6085ks0.d(AT0.m(aVar, 0.0f, 1, null), C6460mD.l(f));
                float fL = C6460mD.l(f);
                C2559Vm.a aVar4 = C2559Vm.b;
                float f2 = 4;
                InterfaceC1073Hk0 interfaceC1073Hk0E = AbstractC7140og.e(interfaceC1073Hk0D, fL, aVar4.d(), AbstractC4805gK0.c(C6460mD.l(f2)));
                H3.b bVarC = aVar2.c();
                interfaceC5781jp.e(-483455358);
                C1032Ha c1032Ha = C1032Ha.a;
                InterfaceC0957Gh0 interfaceC0957Gh0A = AbstractC8011rn.a(c1032Ha.d(), bVarC, interfaceC5781jp, 48);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz2 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q902 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd12 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                LQ lqA2 = aVar3.a();
                InterfaceC3986dR interfaceC3986dRA2 = B90.a(interfaceC1073Hk0E);
                if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                    AbstractC3540bp.c();
                }
                interfaceC5781jp.s();
                if (interfaceC5781jp.n()) {
                    interfaceC5781jp.E(lqA2);
                } else {
                    interfaceC5781jp.G();
                }
                interfaceC5781jp.u();
                InterfaceC5781jp interfaceC5781jpA2 = AbstractC5987ka1.a(interfaceC5781jp);
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC0957Gh0A, aVar3.d());
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC4988gz2, aVar3.b());
                AbstractC5987ka1.b(interfaceC5781jpA2, enumC7560q902, aVar3.c());
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC2733Xd12, aVar3.f());
                interfaceC5781jp.i();
                interfaceC3986dRA2.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-1163856341);
                C8848un c8848un = C8848un.a;
                TU0.a(AT0.n(aVar, C6460mD.l(8)), interfaceC5781jp, 6);
                H3 h3B = aVar2.b();
                InterfaceC1073Hk0 interfaceC1073Hk0S = AT0.s(aVar, C6460mD.l(100));
                interfaceC5781jp.e(733328855);
                InterfaceC0957Gh0 interfaceC0957Gh0H2 = AbstractC9378wg.h(h3B, false, interfaceC5781jp, 6);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz3 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q903 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd13 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                LQ lqA3 = aVar3.a();
                InterfaceC3986dR interfaceC3986dRA3 = B90.a(interfaceC1073Hk0S);
                if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                    AbstractC3540bp.c();
                }
                interfaceC5781jp.s();
                if (interfaceC5781jp.n()) {
                    interfaceC5781jp.E(lqA3);
                } else {
                    interfaceC5781jp.G();
                }
                interfaceC5781jp.u();
                InterfaceC5781jp interfaceC5781jpA3 = AbstractC5987ka1.a(interfaceC5781jp);
                AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC0957Gh0H2, aVar3.d());
                AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC4988gz3, aVar3.b());
                AbstractC5987ka1.b(interfaceC5781jpA3, enumC7560q903, aVar3.c());
                AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC2733Xd13, aVar3.f());
                interfaceC5781jp.i();
                interfaceC3986dRA3.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-2137368960);
                C0737Ee0 c0737Ee0B = AbstractC6608ml0.b(interfaceC1880Pe0);
                interfaceC5781jp.e(1157296644);
                boolean zP = interfaceC5781jp.P(interfaceC9648xe0);
                Object objF = interfaceC5781jp.f();
                if (zP || objF == InterfaceC5781jp.a.a()) {
                    objF = new C0215a(interfaceC9648xe0);
                    interfaceC5781jp.H(objF);
                }
                interfaceC5781jp.L();
                Context context2 = context;
                AbstractC9369we0.a(c0737Ee0B, (LQ) objF, AT0.o(aVar, C6460mD.l(40)), false, false, false, null, false, null, null, InterfaceC7479ps.a.a(), false, interfaceC5781jp, 392, 6, 3064);
                FC.a(null, AbstractC3530bn.c(4278764287L), C6460mD.l(f), 0.0f, interfaceC5781jp, 432, 9);
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.M();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                long jD = T21.d(20);
                long jD2 = aVar4.d();
                SO.a aVar5 = SO.C;
                AbstractC8641u21.c("Hey Creator!", AbstractC0356Ap0.c(aVar, 0.0f, C6460mD.l(-4), 1, null), jD2, jD, null, aVar5.a(), null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 200118, 0, 65488);
                TU0.a(AT0.n(aVar, C6460mD.l(f2)), interfaceC5781jp, 6);
                AbstractC8641u21.c("WANT MORE TEMPLATES?", null, aVar4.h(), T21.d(34), null, aVar5.a(), null, 0L, null, J11.g(J11.b.a()), 0L, 0, false, 0, null, new O21(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, new C4265eR0(C2559Vm.m(aVar4.h(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC0460Bp0.a(0.0f, 0.0f), 16.0f, null), null, null, 0L, null, 253951, null), interfaceC5781jp, 200070, 196608, 32210);
                TU0.a(AT0.n(aVar, C6460mD.l(12)), interfaceC5781jp, 6);
                AbstractC8641u21.c("follow us", null, AbstractC3530bn.c(4278764287L), T21.d(18), null, aVar5.a(), null, 0L, null, null, 0L, 0, false, 0, null, new O21(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, new C4265eR0(C2559Vm.m(aVar4.h(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), AbstractC0460Bp0.a(0.0f, 0.0f), 8.0f, null), null, null, 0L, null, 253951, null), interfaceC5781jp, 200070, 196608, 32722);
                TU0.a(AT0.n(aVar, C6460mD.l(6)), interfaceC5781jp, 6);
                float f3 = 0.0f;
                Object obj = null;
                InterfaceC1073Hk0 interfaceC1073Hk0M2 = AT0.m(aVar, 0.0f, 1, null);
                C1032Ha.e eVarA = c1032Ha.a();
                interfaceC5781jp.e(693286680);
                InterfaceC0957Gh0 interfaceC0957Gh0A2 = AbstractC6768nK0.a(eVarA, aVar2.g(), interfaceC5781jp, 6);
                int i3 = -1323940314;
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz4 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q904 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd14 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                LQ lqA4 = aVar3.a();
                InterfaceC3986dR interfaceC3986dRA4 = B90.a(interfaceC1073Hk0M2);
                if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                    AbstractC3540bp.c();
                }
                interfaceC5781jp.s();
                if (interfaceC5781jp.n()) {
                    interfaceC5781jp.E(lqA4);
                } else {
                    interfaceC5781jp.G();
                }
                interfaceC5781jp.u();
                InterfaceC5781jp interfaceC5781jpA4 = AbstractC5987ka1.a(interfaceC5781jp);
                AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC0957Gh0A2, aVar3.d());
                AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC4988gz4, aVar3.b());
                AbstractC5987ka1.b(interfaceC5781jpA4, enumC7560q904, aVar3.c());
                AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC2733Xd14, aVar3.f());
                interfaceC5781jp.i();
                interfaceC3986dRA4.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-678309503);
                C7326pK0 c7326pK0 = C7326pK0.a;
                DJ dj = DJ.a;
                Map mapK = AbstractC1473Lg0.k(D61.a(dj.c(), "https://www.youtube.com/channel/UCHXLzig13cuN15uigifLK7w"), D61.a(dj.a(), "https://www.instagram.com/avee.musicplayer/profilecard/?igsh=d2sweTQwMnV1M2Fw"), D61.a(dj.b(), "https://www.tiktok.com/@avee.musicplayer?_t=8qK4mOiiBAf&_r=1"));
                interfaceC5781jp.e(62603077);
                for (Map.Entry entry : mapK.entrySet()) {
                    CJ.a aVar6 = (CJ.a) entry.getKey();
                    String str = (String) entry.getValue();
                    InterfaceC1073Hk0.a aVar7 = InterfaceC1073Hk0.m;
                    InterfaceC1073Hk0 interfaceC1073Hk0O = AT0.o(AbstractC6085ks0.f(aVar7, C6460mD.l(f2), f3, 2, obj), C6460mD.l(30));
                    C2559Vm.a aVar8 = C2559Vm.b;
                    Context context3 = context2;
                    InterfaceC1073Hk0 interfaceC1073Hk0E2 = AbstractC1388Kl.e(AbstractC3763ce.a(interfaceC1073Hk0O, aVar8.h(), AbstractC4805gK0.a(50)), false, null, null, new C0216b(str, context3), 7, null);
                    interfaceC5781jp.e(733328855);
                    H3.a aVar9 = H3.a;
                    InterfaceC0957Gh0 interfaceC0957Gh0H3 = AbstractC9378wg.h(aVar9.j(), false, interfaceC5781jp, 0);
                    interfaceC5781jp.e(i3);
                    InterfaceC4988gz interfaceC4988gz5 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q905 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd15 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    InterfaceC4943gp.a aVar10 = InterfaceC4943gp.d;
                    LQ lqA5 = aVar10.a();
                    InterfaceC3986dR interfaceC3986dRA5 = B90.a(interfaceC1073Hk0E2);
                    if (!AbstractC2988Zp0.a(interfaceC5781jp.v())) {
                        AbstractC3540bp.c();
                    }
                    interfaceC5781jp.s();
                    if (interfaceC5781jp.n()) {
                        interfaceC5781jp.E(lqA5);
                    } else {
                        interfaceC5781jp.G();
                    }
                    interfaceC5781jp.u();
                    InterfaceC5781jp interfaceC5781jpA5 = AbstractC5987ka1.a(interfaceC5781jp);
                    AbstractC5987ka1.b(interfaceC5781jpA5, interfaceC0957Gh0H3, aVar10.d());
                    AbstractC5987ka1.b(interfaceC5781jpA5, interfaceC4988gz5, aVar10.b());
                    AbstractC5987ka1.b(interfaceC5781jpA5, enumC7560q905, aVar10.c());
                    AbstractC5987ka1.b(interfaceC5781jpA5, interfaceC2733Xd15, aVar10.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA5.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-2137368960);
                    BJ.a(aVar6, C9936yg.a.b(aVar7, aVar9.b()), C6460mD.l(20), aVar8.a(), interfaceC5781jp, CJ.a.c | 3456, 0);
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.M();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    context2 = context3;
                    f3 = 0.0f;
                    obj = null;
                    i3 = -1323940314;
                }
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.M();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                InterfaceC1073Hk0.a aVar11 = InterfaceC1073Hk0.m;
                TU0.a(AT0.n(aVar11, C6460mD.l(20)), interfaceC5781jp, 6);
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.M();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                AbstractC6823nY.a(AbstractC0368As0.c(AbstractC3374bD0.c, interfaceC5781jp, 0), "Cat Image", AT0.o(aVar11, C6460mD.l(120)), null, null, 0.0f, null, interfaceC5781jp, 440, 120);
                LX.a(lq, AbstractC0356Ap0.b(c9936yg.b(aVar11, H3.a.i()), C6460mD.l(-8), C6460mD.l(8)), false, null, C2463Uo.a.a(), interfaceC5781jp, (i2 & 14) | 24576, 12);
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.M();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                if (AbstractC6348lp.O()) {
                    AbstractC6348lp.Y();
                }
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LQ lq, int i, InterfaceC9648xe0 interfaceC9648xe0, InterfaceC1880Pe0 interfaceC1880Pe0, Context context) {
            super(2);
            this.B = lq;
            this.C = i;
            this.D = interfaceC9648xe0;
            this.E = interfaceC1880Pe0;
            this.F = context;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(1512885373, i, -1, "com.daaw.avee.composables.dialogs.MoreTemplatesDialog.<anonymous> (MoreTemplatesDialog.kt:68)");
            }
            OZ0.a(AbstractC4082dm.a(AT0.s(InterfaceC1073Hk0.m, C6460mD.l(500)), AbstractC4805gK0.c(C6460mD.l(4))), null, C2559Vm.b.a(), 0L, null, 0.0f, AbstractC1815Oo.b(interfaceC5781jp, -451024703, true, new a(this.B, this.C, this.D, this.E, this.F)), interfaceC5781jp, 1573248, 58);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.ml0$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(LQ lq, int i) {
            super(2);
            this.B = lq;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC6608ml0.a(this.B, interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(LQ lq, InterfaceC5781jp interfaceC5781jp, int i) {
        int i2;
        G10.g(lq, "onDismiss");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-1732037772);
        if ((i & 14) == 0) {
            i2 = (interfaceC5781jpQ.P(lq) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-1732037772, i2, -1, "com.daaw.avee.composables.dialogs.MoreTemplatesDialog (MoreTemplatesDialog.kt:58)");
            }
            InterfaceC1880Pe0 interfaceC1880Pe0R = AbstractC9827yG0.r(InterfaceC2110Re0.a.a(InterfaceC2110Re0.a.b(GD0.F)), null, null, null, null, null, interfaceC5781jpQ, 0, 62);
            InterfaceC9648xe0 interfaceC9648xe0C = Z6.c(b(interfaceC1880Pe0R), false, false, null, 0.0f, Integer.MAX_VALUE, null, false, interfaceC5781jpQ, 196616, 222);
            interfaceC5781jpQ = interfaceC5781jpQ;
            G5.a(a.B, new PB(false, false, null, false, 7, null), AbstractC1815Oo.b(interfaceC5781jpQ, 1512885373, true, new b(lq, i2, interfaceC9648xe0C, interfaceC1880Pe0R, (Context) interfaceC5781jpQ.O(B5.g()))), interfaceC5781jpQ, 438, 0);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new c(lq, i));
    }

    public static final C0737Ee0 b(InterfaceC1880Pe0 interfaceC1880Pe0) {
        return (C0737Ee0) interfaceC1880Pe0.getValue();
    }

    public static final float c(InterfaceC9648xe0 interfaceC9648xe0) {
        return ((Number) interfaceC9648xe0.getValue()).floatValue();
    }
}
