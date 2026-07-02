package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.daaw.C2559Vm;
import com.daaw.D7;
import com.daaw.H3;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC4943gp;
import com.daaw.J11;
import com.daaw.SO;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;

/* JADX INFO: renamed from: com.daaw.gD, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4776gD {

    /* JADX INFO: renamed from: com.daaw.gD$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;
        public final /* synthetic */ Context D;

        /* JADX INFO: renamed from: com.daaw.gD$a$a, reason: collision with other inner class name */
        public static final class C0175a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ LQ B;
            public final /* synthetic */ int C;
            public final /* synthetic */ Context D;

            /* JADX INFO: renamed from: com.daaw.gD$a$a$a, reason: collision with other inner class name */
            public static final class C0176a extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ Context B;
                public final /* synthetic */ LQ C;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0176a(Context context, LQ lq) {
                    super(0);
                    this.B = context;
                    this.C = lq;
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m49invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m49invoke() {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse("https://ko-fi.com/aveemusicplayer"));
                    this.B.startActivity(intent);
                    this.C.invoke();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0175a(LQ lq, int i, Context context) {
                super(2);
                this.B = lq;
                this.C = i;
                this.D = context;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                    return;
                }
                if (AbstractC6348lp.O()) {
                    AbstractC6348lp.Z(-599096341, i, -1, "com.daaw.avee.composables.dialogs.DonationDialog.<anonymous>.<anonymous> (DonationDialog.kt:59)");
                }
                InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
                InterfaceC1073Hk0 interfaceC1073Hk0M = AT0.m(aVar, 0.0f, 1, null);
                H3.a aVar2 = H3.a;
                H3 h3A = aVar2.a();
                LQ lq = this.B;
                int i2 = this.C;
                Context context = this.D;
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
                float f = 10;
                AbstractC6823nY.a(AbstractC0368As0.c(AbstractC3374bD0.d, interfaceC5781jp, 0), null, AbstractC0356Ap0.b(AT0.o(aVar, C6460mD.l(220)), C6460mD.l(f), C6460mD.l(f)), null, InterfaceC7479ps.a.b(), 0.0f, null, interfaceC5781jp, 24632, 104);
                long jD = T21.d(10);
                C2559Vm.a aVar4 = C2559Vm.b;
                AbstractC8641u21.c("Thank you ❤️", AbstractC0356Ap0.b(ST.c(aVar, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -45.0f, 0.0f, 0L, null, false, null, 0L, 0L, 65279, null), C6460mD.l(15), C6460mD.l(-15)), aVar4.d(), jD, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65520);
                float f2 = 8;
                InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC0356Ap0.b(c9936yg.b(aVar, aVar2.i()), C6460mD.l(-8), C6460mD.l(f2));
                C2255So c2255So = C2255So.a;
                LX.a(lq, interfaceC1073Hk0B, false, null, c2255So.a(), interfaceC5781jp, (i2 & 14) | 24576, 12);
                InterfaceC1073Hk0 interfaceC1073Hk0B2 = c9936yg.b(AT0.s(aVar, C6460mD.l(RCHTTPStatusCodes.UNSUCCESSFUL)), aVar2.j());
                H3.b bVarC = aVar2.c();
                interfaceC5781jp.e(-483455358);
                InterfaceC0957Gh0 interfaceC0957Gh0A = AbstractC8011rn.a(C1032Ha.a.d(), bVarC, interfaceC5781jp, 48);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz2 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q902 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd12 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                LQ lqA2 = aVar3.a();
                InterfaceC3986dR interfaceC3986dRA2 = B90.a(interfaceC1073Hk0B2);
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
                float f3 = 16;
                TU0.a(AT0.n(aVar, C6460mD.l(f3)), interfaceC5781jp, 6);
                long jD2 = T21.d(34);
                SO.a aVar5 = SO.C;
                SO soA = aVar5.a();
                J11.a aVar6 = J11.b;
                AbstractC8641u21.c("Love the beats?", null, 0L, jD2, null, soA, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 199686, 0, 64982);
                TU0.a(AT0.n(aVar, C6460mD.l(f2)), interfaceC5781jp, 6);
                D7.a aVar7 = new D7.a(0, 1, null);
                aVar7.a("If AVEE makes your day,\n");
                int iD = aVar7.d(new XU0(0L, 0L, aVar5.a(), (PO) null, (QO) null, (AbstractC7898rO) null, (String) null, 0L, (C1671Ne) null, (C4437f21) null, (C4884gd0) null, 0L, (P11) null, (C4265eR0) null, 16379, (AbstractC2911Yw) null));
                try {
                    aVar7.a("support our work by buying us a coffee");
                    G91 g91 = G91.a;
                    aVar7.c(iD);
                    AbstractC8641u21.b(aVar7.e(), null, 0L, T21.d(16), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, null, interfaceC5781jp, 3072, 0, 130550);
                    TU0.a(AT0.n(aVar, C6460mD.l(f2)), interfaceC5781jp, 6);
                    AbstractC8641u21.c("Every cup helps us,\n create more awesome for you!", null, C2559Vm.m(aVar4.c(), 0.8f, 0.0f, 0.0f, 0.0f, 14, null), T21.d(14), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                    TU0.a(AT0.n(aVar, C6460mD.l(f3)), interfaceC5781jp, 6);
                    AbstractC2851Yh.a(new C0176a(context, lq), null, false, null, null, null, null, C2643Wh.a.a(aVar4.a(), 0L, 0L, 0L, interfaceC5781jp, (C2643Wh.l << 12) | 6, 14), null, c2255So.b(), interfaceC5781jp, 805306368, 382);
                    TU0.a(AT0.n(aVar, C6460mD.l(f3)), interfaceC5781jp, 6);
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.M();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.M();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    if (AbstractC6348lp.O()) {
                        AbstractC6348lp.Y();
                    }
                } catch (Throwable th) {
                    aVar7.c(iD);
                    throw th;
                }
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LQ lq, int i, Context context) {
            super(2);
            this.B = lq;
            this.C = i;
            this.D = context;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-1682726233, i, -1, "com.daaw.avee.composables.dialogs.DonationDialog.<anonymous> (DonationDialog.kt:53)");
            }
            OZ0.a(AbstractC4082dm.a(AT0.s(InterfaceC1073Hk0.m, C6460mD.l(500)), AbstractC4805gK0.c(C6460mD.l(4))), null, C2559Vm.b.h(), 0L, null, 0.0f, AbstractC1815Oo.b(interfaceC5781jp, -599096341, true, new C0175a(this.B, this.C, this.D)), interfaceC5781jp, 1573248, 58);
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

    /* JADX INFO: renamed from: com.daaw.gD$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LQ lq, int i) {
            super(2);
            this.B = lq;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC4776gD.a(this.B, interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(LQ lq, InterfaceC5781jp interfaceC5781jp, int i) {
        int i2;
        LQ lq2;
        G10.g(lq, "onDismiss");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-826736034);
        if ((i & 14) == 0) {
            i2 = (interfaceC5781jpQ.P(lq) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) == 2 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
            lq2 = lq;
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-826736034, i2, -1, "com.daaw.avee.composables.dialogs.DonationDialog (DonationDialog.kt:46)");
            }
            lq2 = lq;
            G5.a(lq2, new PB(false, false, null, false, 7, null), AbstractC1815Oo.b(interfaceC5781jpQ, -1682726233, true, new a(lq, i2, (Context) interfaceC5781jpQ.O(B5.g()))), interfaceC5781jpQ, (i2 & 14) | 432, 0);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new b(lq2, i));
    }
}
