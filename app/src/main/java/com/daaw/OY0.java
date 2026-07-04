package com.daaw;

import android.os.Handler;
import android.os.Looper;
import com.android.billingclient.api.f;
import com.daaw.C1032Ha;
import com.daaw.C2559Vm;
import com.daaw.D7;
import com.daaw.H3;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC4943gp;
import com.daaw.InterfaceC5781jp;
import com.daaw.J11;
import com.daaw.OY0;
import com.daaw.SO;
import com.daaw.avee.MainActivity;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public abstract class OY0 {
    public static final long a = AbstractC3530bn.c(4278236415L);

    public static final class a extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ LQ G;
        public final /* synthetic */ InterfaceC8007rm0 H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(LQ lq, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = lq;
            this.H = interfaceC8007rm0;
        }

        public static final G91 z(LQ lq, Boolean bool) {
            G10.d(bool);
            if (bool.booleanValue()) {
                lq.invoke();
            }
            return G91.a;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new a(this.G, this.H, interfaceC1416Ks);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r5.F
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L36
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                com.daaw.AbstractC4801gJ0.b(r6)
                com.daaw.Fg1 r6 = com.daaw.WB0.o
                com.daaw.LQ r1 = r5.G
                com.daaw.NY0 r3 = new com.daaw.NY0
                r3.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r6.b(r3, r1)
            L2b:
                r5.F = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = com.daaw.AbstractC0391Ay.a(r3, r5)
                if (r6 != r0) goto L36
                return r0
            L36:
                com.daaw.rm0 r6 = r5.H
                boolean r1 = com.daaw.OY0.j(r6)
                r1 = r1 ^ r2
                com.daaw.OY0.k(r6, r1)
                goto L2b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.OY0.a.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((a) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class b extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ LQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LQ lq) {
            super(0);
            this.B = lq;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m18invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m18invoke() {
            this.B.invoke();
        }
    }

    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;
        public final /* synthetic */ InterfaceC8007rm0 D;
        public final /* synthetic */ f.c E;
        public final /* synthetic */ String F;
        public final /* synthetic */ String G;

        public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ LQ B;
            public final /* synthetic */ int C;
            public final /* synthetic */ InterfaceC8007rm0 D;
            public final /* synthetic */ f.c E;
            public final /* synthetic */ String F;
            public final /* synthetic */ String G;

            /* JADX INFO: renamed from: com.daaw.OY0$c$a$a, reason: collision with other inner class name */
            public static final class C0097a extends AbstractC4192e90 implements InterfaceC3429bR {
                public final /* synthetic */ LQ B;
                public final /* synthetic */ int C;
                public final /* synthetic */ InterfaceC8007rm0 D;
                public final /* synthetic */ f.c E;
                public final /* synthetic */ String F;
                public final /* synthetic */ String G;

                /* JADX INFO: renamed from: com.daaw.OY0$c$a$a$a, reason: collision with other inner class name */
                public static final class C0098a extends AbstractC4192e90 implements LQ {
                    public static final C0098a B = new C0098a();

                    public C0098a() {
                        super(0);
                    }

                    @Override // com.daaw.LQ
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m19invoke();
                        return G91.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m19invoke() {
                        MY0.a.a().a("premium_1month30discount");
                    }
                }

                /* JADX INFO: renamed from: com.daaw.OY0$c$a$a$b */
                public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
                    public final /* synthetic */ f.c B;
                    public final /* synthetic */ String C;
                    public final /* synthetic */ String D;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(f.c cVar, String str, String str2) {
                        super(2);
                        this.B = cVar;
                        this.C = str;
                        this.D = str2;
                    }

                    public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                        if ((i & 11) == 2 && interfaceC5781jp.t()) {
                            interfaceC5781jp.B();
                            return;
                        }
                        if (AbstractC6348lp.O()) {
                            AbstractC6348lp.Z(1287036382, i, -1, "com.daaw.avee.composables.dialogs.Discount30SubDialog.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SubDialogs.kt:315)");
                        }
                        H3 h3B = H3.a.b();
                        String strA = null;
                        InterfaceC1073Hk0 interfaceC1073Hk0K = AT0.k(InterfaceC1073Hk0.m, 0.0f, 1, null);
                        f.c cVar = this.B;
                        String str = this.C;
                        String str2 = this.D;
                        interfaceC5781jp.e(733328855);
                        InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(h3B, false, interfaceC5781jp, 6);
                        interfaceC5781jp.e(-1323940314);
                        InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                        EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                        InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                        InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
                        LQ lqA = aVar.a();
                        InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0K);
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
                        AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0H, aVar.d());
                        AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar.b());
                        AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar.c());
                        AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar.f());
                        interfaceC5781jp.i();
                        interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                        interfaceC5781jp.e(2058660585);
                        interfaceC5781jp.e(-2137368960);
                        C9936yg c9936yg = C9936yg.a;
                        D7.a aVar2 = new D7.a(0, 1, null);
                        aVar2.a((cVar != null ? AbstractC1445Kz0.a(cVar) : null) + str + "/month");
                        int iD = aVar2.d(new XU0(0L, 0L, (SO) null, (PO) null, (QO) null, (AbstractC7898rO) null, (String) null, 0L, (C1671Ne) null, (C4437f21) null, (C4884gd0) null, 0L, P11.b.a(), (C4265eR0) null, 12287, (AbstractC2911Yw) null));
                        if (cVar != null) {
                            try {
                                strA = AbstractC1445Kz0.a(cVar);
                            } catch (Throwable th) {
                                aVar2.c(iD);
                                throw th;
                            }
                        }
                        aVar2.a(" (" + strA + str2 + ")");
                        G91 g91 = G91.a;
                        aVar2.c(iD);
                        AbstractC8641u21.b(aVar2.e(), null, C2559Vm.b.a(), T21.d(16), null, SO.C.a(), null, 0L, null, J11.g(J11.b.a()), 0L, 0, false, 0, null, null, null, interfaceC5781jp, 200064, 0, 130514);
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

                /* JADX INFO: renamed from: com.daaw.OY0$c$a$a$c, reason: collision with other inner class name */
                public static final class C0099c extends AbstractC4192e90 implements LQ {
                    public final /* synthetic */ LQ B;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0099c(LQ lq) {
                        super(0);
                        this.B = lq;
                    }

                    public static final void c() {
                        MainActivity.T0.a(4);
                    }

                    @Override // com.daaw.LQ
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m20invoke();
                        return G91.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m20invoke() {
                        this.B.invoke();
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.PY0
                            @Override // java.lang.Runnable
                            public final void run() {
                                OY0.c.a.C0097a.C0099c.c();
                            }
                        }, 150L);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0097a(LQ lq, int i, InterfaceC8007rm0 interfaceC8007rm0, f.c cVar, String str, String str2) {
                    super(2);
                    this.B = lq;
                    this.C = i;
                    this.D = interfaceC8007rm0;
                    this.E = cVar;
                    this.F = str;
                    this.G = str2;
                }

                public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                    if ((i & 11) == 2 && interfaceC5781jp.t()) {
                        interfaceC5781jp.B();
                        return;
                    }
                    if (AbstractC6348lp.O()) {
                        AbstractC6348lp.Z(514494896, i, -1, "com.daaw.avee.composables.dialogs.Discount30SubDialog.<anonymous>.<anonymous>.<anonymous> (SubDialogs.kt:257)");
                    }
                    InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
                    C2559Vm.a aVar2 = C2559Vm.b;
                    InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC3763ce.b(aVar, aVar2.a(), null, 2, null);
                    LQ lq = this.B;
                    int i2 = this.C;
                    InterfaceC8007rm0 interfaceC8007rm0 = this.D;
                    f.c cVar = this.E;
                    String str = this.F;
                    String str2 = this.G;
                    interfaceC5781jp.e(-483455358);
                    C1032Ha c1032Ha = C1032Ha.a;
                    C1032Ha.k kVarD = c1032Ha.d();
                    H3.a aVar3 = H3.a;
                    InterfaceC0957Gh0 interfaceC0957Gh0A = AbstractC8011rn.a(kVarD, aVar3.f(), interfaceC5781jp, 0);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    InterfaceC4943gp.a aVar4 = InterfaceC4943gp.d;
                    LQ lqA = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0B);
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
                    AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0A, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-1163856341);
                    C8848un c8848un = C8848un.a;
                    InterfaceC1073Hk0 interfaceC1073Hk0M = AT0.m(AbstractC8290sn.a(c8848un, aVar, 1.0f, false, 2, null), 0.0f, 1, null);
                    interfaceC5781jp.e(733328855);
                    InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(aVar3.j(), false, interfaceC5781jp, 0);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz2 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q902 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd12 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    LQ lqA2 = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA2 = B90.a(interfaceC1073Hk0M);
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
                    AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC0957Gh0H, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC4988gz2, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA2, enumC7560q902, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC2733Xd12, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA2.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-2137368960);
                    C9936yg c9936yg = C9936yg.a;
                    AbstractC6823nY.a(AbstractC0368As0.c(AbstractC3374bD0.e, interfaceC5781jp, 0), null, c9936yg.b(AbstractC0356Ap0.c(AT0.o(aVar, C6460mD.l(120)), C6460mD.l(10), 0.0f, 2, null), aVar3.a()), null, null, 0.0f, null, interfaceC5781jp, 56, 120);
                    C1032Ha.e eVarA = c1032Ha.a();
                    H3.b bVarC = aVar3.c();
                    InterfaceC1073Hk0 interfaceC1073Hk0B2 = c9936yg.b(aVar, aVar3.h());
                    interfaceC5781jp.e(-483455358);
                    InterfaceC0957Gh0 interfaceC0957Gh0A2 = AbstractC8011rn.a(eVarA, bVarC, interfaceC5781jp, 54);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz3 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q903 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd13 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    LQ lqA3 = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA3 = B90.a(interfaceC1073Hk0B2);
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
                    AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC0957Gh0A2, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC4988gz3, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA3, enumC7560q903, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC2733Xd13, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA3.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-1163856341);
                    long jD = T21.d(36);
                    SO.a aVar5 = SO.C;
                    SO soA = aVar5.a();
                    long jH = aVar2.h();
                    J11.a aVar6 = J11.b;
                    AbstractC8641u21.c("Woohoo!", AbstractC6085ks0.h(aVar, 0.0f, C6460mD.l(16), 0.0f, 0.0f, 13, null), jH, jD, null, soA, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 200118, 0, 64976);
                    AbstractC8641u21.c("You've unlocked an exclusive discount! 🎉", null, aVar2.d(), T21.d(14), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                    AbstractC8641u21.c("-30%", null, OY0.b(interfaceC8007rm0) ? OY0.a : aVar2.h(), T21.d(48), null, aVar5.a(), null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 199686, 0, 64978);
                    TU0.a(AT0.n(aVar, C6460mD.l(18)), interfaceC5781jp, 6);
                    OZ0.a(AbstractC1388Kl.e(AT0.s(AT0.n(aVar, C6460mD.l(44)), C6460mD.l(170)), false, null, null, C0098a.B, 7, null), AbstractC4805gK0.c(C6460mD.l(4)), AbstractC3530bn.c(4293969748L), 0L, null, 0.0f, AbstractC1815Oo.b(interfaceC5781jp, 1287036382, true, new b(cVar, str, str2)), interfaceC5781jp, 1573248, 56);
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.M();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    LX.a(lq, AbstractC0356Ap0.b(c9936yg.b(aVar, aVar3.i()), C6460mD.l(-8), C6460mD.l(8)), false, null, C2879Yo.a.c(), interfaceC5781jp, (i2 & 14) | 24576, 12);
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.M();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    H3.b bVarC2 = aVar3.c();
                    InterfaceC1073Hk0 interfaceC1073Hk0B3 = AbstractC3763ce.b(AT0.m(AbstractC8290sn.a(c8848un, aVar, 1.0f, false, 2, null), 0.0f, 1, null), aVar2.h(), null, 2, null);
                    interfaceC5781jp.e(-483455358);
                    InterfaceC0957Gh0 interfaceC0957Gh0A3 = AbstractC8011rn.a(c1032Ha.d(), bVarC2, interfaceC5781jp, 48);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz4 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q904 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd14 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    LQ lqA4 = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA4 = B90.a(interfaceC1073Hk0B3);
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
                    AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC0957Gh0A3, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC4988gz4, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA4, enumC7560q904, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC2733Xd14, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA4.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-1163856341);
                    float f = 8;
                    TU0.a(AT0.n(aVar, C6460mD.l(f)), interfaceC5781jp, 6);
                    AbstractC8641u21.c((cVar != null ? AbstractC1445Kz0.a(cVar) : null) + str + "/month for 6 months", null, aVar2.d(), T21.d(12), null, aVar5.a(), null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 200064, 0, 64978);
                    AbstractC8641u21.c("Cancel anytime, but we know happiness is hard to let go! 😉", null, aVar2.d(), T21.d(12), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                    TU0.a(AT0.n(aVar, C6460mD.l(f)), interfaceC5781jp, 6);
                    AbstractC8641u21.c("Grab all the PRO features now!", null, aVar2.a(), T21.d(16), null, aVar5.a(), null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 200070, 0, 64978);
                    TU0.a(AT0.n(aVar, C6460mD.l((float) 2)), interfaceC5781jp, 6);
                    C1032Ha.e eVarB = c1032Ha.b();
                    H3.b bVarC3 = aVar3.c();
                    InterfaceC1073Hk0 interfaceC1073Hk0H = AbstractC6085ks0.h(AT0.m(aVar, 0.0f, 1, null), C6460mD.l(32), 0.0f, 0.0f, 0.0f, 14, null);
                    interfaceC5781jp.e(-483455358);
                    InterfaceC0957Gh0 interfaceC0957Gh0A4 = AbstractC8011rn.a(eVarB, bVarC3, interfaceC5781jp, 54);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz5 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q905 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd15 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    LQ lqA5 = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA5 = B90.a(interfaceC1073Hk0H);
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
                    AbstractC5987ka1.b(interfaceC5781jpA5, interfaceC0957Gh0A4, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA5, interfaceC4988gz5, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA5, enumC7560q905, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA5, interfaceC2733Xd15, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA5.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-1163856341);
                    AbstractC8641u21.c("🚀 Full Video Control", null, aVar2.a(), T21.d(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65522);
                    AbstractC8641u21.c("🎨 Full customization options", null, aVar2.a(), T21.d(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65522);
                    AbstractC8641u21.c("✏️  Your Visualizer, Your Rules", null, aVar2.a(), T21.d(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65522);
                    AbstractC8641u21.c("🎵 Mute the Logo", null, aVar2.a(), T21.d(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65522);
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    interfaceC5781jp.M();
                    interfaceC5781jp.L();
                    interfaceC5781jp.L();
                    float f2 = 16;
                    TU0.a(AT0.n(aVar, C6460mD.l(f2)), interfaceC5781jp, 6);
                    long jD2 = T21.d(14);
                    long jA = aVar2.a();
                    int iA = aVar6.a();
                    interfaceC5781jp.e(1157296644);
                    boolean zP = interfaceC5781jp.P(lq);
                    Object objF = interfaceC5781jp.f();
                    if (zP || objF == InterfaceC5781jp.a.a()) {
                        objF = new C0099c(lq);
                        interfaceC5781jp.H(objF);
                    }
                    interfaceC5781jp.L();
                    AbstractC8641u21.c("VIEW ALL PLANS", AbstractC1388Kl.e(aVar, false, null, null, (LQ) objF, 7, null), jA, jD2, null, null, null, 0L, null, J11.g(iA), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65008);
                    TU0.a(AT0.n(aVar, C6460mD.l(4)), interfaceC5781jp, 6);
                    AbstractC8641u21.c("Subscription will be renewed automatically.\nYou can cancel subscription 24 hours before\nthe end of the purchase period.\nTo manage or cancel use your Google Play settings.", null, aVar2.d(), T21.d(8), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                    TU0.a(AT0.n(aVar, C6460mD.l(f2)), interfaceC5781jp, 6);
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
                }

                @Override // com.daaw.InterfaceC3429bR
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                    return G91.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LQ lq, int i, InterfaceC8007rm0 interfaceC8007rm0, f.c cVar, String str, String str2) {
                super(2);
                this.B = lq;
                this.C = i;
                this.D = interfaceC8007rm0;
                this.E = cVar;
                this.F = str;
                this.G = str2;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                    return;
                }
                if (AbstractC6348lp.O()) {
                    AbstractC6348lp.Z(-785594260, i, -1, "com.daaw.avee.composables.dialogs.Discount30SubDialog.<anonymous>.<anonymous> (SubDialogs.kt:250)");
                }
                OZ0.a(AT0.n(AT0.s(InterfaceC1073Hk0.m, C6460mD.l(500)), C6460mD.l(530)), AbstractC4805gK0.c(C6460mD.l(4)), C2559Vm.b.a(), 0L, null, 0.0f, AbstractC1815Oo.b(interfaceC5781jp, 514494896, true, new C0097a(this.B, this.C, this.D, this.E, this.F, this.G)), interfaceC5781jp, 1573254, 56);
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
        public c(LQ lq, int i, InterfaceC8007rm0 interfaceC8007rm0, f.c cVar, String str, String str2) {
            super(2);
            this.B = lq;
            this.C = i;
            this.D = interfaceC8007rm0;
            this.E = cVar;
            this.F = str;
            this.G = str2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(1226880664, i, -1, "com.daaw.avee.composables.dialogs.Discount30SubDialog.<anonymous> (SubDialogs.kt:249)");
            }
            AbstractC6588mh0.a(null, null, null, AbstractC1815Oo.b(interfaceC5781jp, -785594260, true, new a(this.B, this.C, this.D, this.E, this.F, this.G)), interfaceC5781jp, 3072, 7);
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

    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(LQ lq, int i) {
            super(2);
            this.B = lq;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            OY0.a(this.B, interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class e extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ LQ G;
        public final /* synthetic */ InterfaceC8007rm0 H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(LQ lq, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = lq;
            this.H = interfaceC8007rm0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final G91 z(LQ lq, Boolean bool) {
            G10.d(bool);
            if (bool.booleanValue()) {
                lq.invoke();
            }
            return G91.a;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new e(this.G, this.H, interfaceC1416Ks);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r5.F
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L36
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                com.daaw.AbstractC4801gJ0.b(r6)
                com.daaw.Fg1 r6 = com.daaw.WB0.o
                com.daaw.LQ r1 = r5.G
                com.daaw.QY0 r3 = new com.daaw.QY0
                r3.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r6.b(r3, r1)
            L2b:
                r5.F = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = com.daaw.AbstractC0391Ay.a(r3, r5)
                if (r6 != r0) goto L36
                return r0
            L36:
                com.daaw.rm0 r6 = r5.H
                boolean r1 = com.daaw.OY0.l(r6)
                r1 = r1 ^ r2
                com.daaw.OY0.m(r6, r1)
                goto L2b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.OY0.e.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((e) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class f extends AbstractC4192e90 implements LQ {
        public final /* synthetic */ LQ B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(LQ lq) {
            super(0);
            this.B = lq;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m21invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m21invoke() {
            this.B.invoke();
        }
    }

    public static final class g extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;
        public final /* synthetic */ InterfaceC8007rm0 D;
        public final /* synthetic */ String E;
        public final /* synthetic */ f.c F;
        public final /* synthetic */ String G;

        public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ LQ B;
            public final /* synthetic */ int C;
            public final /* synthetic */ InterfaceC8007rm0 D;
            public final /* synthetic */ String E;
            public final /* synthetic */ f.c F;
            public final /* synthetic */ String G;

            /* JADX INFO: renamed from: com.daaw.OY0$g$a$a, reason: collision with other inner class name */
            public static final class C0100a extends AbstractC4192e90 implements InterfaceC3429bR {
                public final /* synthetic */ LQ B;
                public final /* synthetic */ int C;
                public final /* synthetic */ InterfaceC8007rm0 D;
                public final /* synthetic */ String E;
                public final /* synthetic */ f.c F;
                public final /* synthetic */ String G;

                /* JADX INFO: renamed from: com.daaw.OY0$g$a$a$a, reason: collision with other inner class name */
                public static final class C0101a extends AbstractC4192e90 implements LQ {
                    public static final C0101a B = new C0101a();

                    public C0101a() {
                        super(0);
                    }

                    @Override // com.daaw.LQ
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m22invoke();
                        return G91.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m22invoke() {
                        MY0.a.a().a("premium_1month90discount");
                    }
                }

                /* JADX INFO: renamed from: com.daaw.OY0$g$a$a$b */
                public static final class b extends AbstractC4192e90 implements LQ {
                    public final /* synthetic */ LQ B;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(LQ lq) {
                        super(0);
                        this.B = lq;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final void c() {
                        MainActivity.T0.a(4);
                    }

                    @Override // com.daaw.LQ
                    public /* bridge */ /* synthetic */ Object invoke() {
                        m23invoke();
                        return G91.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m23invoke() {
                        this.B.invoke();
                        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.RY0
                            @Override // java.lang.Runnable
                            public final void run() {
                                OY0.g.a.C0100a.b.c();
                            }
                        }, 150L);
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0100a(LQ lq, int i, InterfaceC8007rm0 interfaceC8007rm0, String str, f.c cVar, String str2) {
                    super(2);
                    this.B = lq;
                    this.C = i;
                    this.D = interfaceC8007rm0;
                    this.E = str;
                    this.F = cVar;
                    this.G = str2;
                }

                public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                    String strA;
                    if ((i & 11) == 2 && interfaceC5781jp.t()) {
                        interfaceC5781jp.B();
                        return;
                    }
                    if (AbstractC6348lp.O()) {
                        AbstractC6348lp.Z(-1859170695, i, -1, "com.daaw.avee.composables.dialogs.Discount70PercentDialog.<anonymous>.<anonymous>.<anonymous> (SubDialogs.kt:453)");
                    }
                    InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
                    C2559Vm.a aVar2 = C2559Vm.b;
                    InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC3763ce.b(aVar, aVar2.a(), null, 2, null);
                    LQ lq = this.B;
                    int i2 = this.C;
                    InterfaceC8007rm0 interfaceC8007rm0 = this.D;
                    String str = this.E;
                    f.c cVar = this.F;
                    String str2 = this.G;
                    interfaceC5781jp.e(-483455358);
                    C1032Ha c1032Ha = C1032Ha.a;
                    C1032Ha.k kVarD = c1032Ha.d();
                    H3.a aVar3 = H3.a;
                    InterfaceC0957Gh0 interfaceC0957Gh0A = AbstractC8011rn.a(kVarD, aVar3.f(), interfaceC5781jp, 0);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    InterfaceC4943gp.a aVar4 = InterfaceC4943gp.d;
                    LQ lqA = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0B);
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
                    AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0A, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-1163856341);
                    C8848un c8848un = C8848un.a;
                    InterfaceC1073Hk0 interfaceC1073Hk0M = AT0.m(AbstractC8290sn.a(c8848un, aVar, 2.0f, false, 2, null), 0.0f, 1, null);
                    interfaceC5781jp.e(733328855);
                    InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(aVar3.j(), false, interfaceC5781jp, 0);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz2 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q902 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd12 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    LQ lqA2 = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA2 = B90.a(interfaceC1073Hk0M);
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
                    AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC0957Gh0H, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC4988gz2, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA2, enumC7560q902, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC2733Xd12, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA2.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-2137368960);
                    C9936yg c9936yg = C9936yg.a;
                    AbstractC6823nY.a(AbstractC0368As0.c(AbstractC3374bD0.e, interfaceC5781jp, 0), null, c9936yg.b(AbstractC0356Ap0.c(AT0.o(aVar, C6460mD.l(120)), C6460mD.l(10), 0.0f, 2, null), aVar3.a()), null, null, 0.0f, null, interfaceC5781jp, 56, 120);
                    C1032Ha.e eVarA = c1032Ha.a();
                    H3.b bVarC = aVar3.c();
                    InterfaceC1073Hk0 interfaceC1073Hk0B2 = c9936yg.b(aVar, aVar3.h());
                    interfaceC5781jp.e(-483455358);
                    InterfaceC0957Gh0 interfaceC0957Gh0A2 = AbstractC8011rn.a(eVarA, bVarC, interfaceC5781jp, 54);
                    interfaceC5781jp.e(-1323940314);
                    InterfaceC4988gz interfaceC4988gz3 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                    EnumC7560q90 enumC7560q903 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                    InterfaceC2733Xd1 interfaceC2733Xd13 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                    LQ lqA3 = aVar4.a();
                    InterfaceC3986dR interfaceC3986dRA3 = B90.a(interfaceC1073Hk0B2);
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
                    AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC0957Gh0A2, aVar4.d());
                    AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC4988gz3, aVar4.b());
                    AbstractC5987ka1.b(interfaceC5781jpA3, enumC7560q903, aVar4.c());
                    AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC2733Xd13, aVar4.f());
                    interfaceC5781jp.i();
                    interfaceC3986dRA3.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                    interfaceC5781jp.e(2058660585);
                    interfaceC5781jp.e(-1163856341);
                    long jD = T21.d(50);
                    SO.a aVar5 = SO.C;
                    SO soA = aVar5.a();
                    long jH = aVar2.h();
                    J11.a aVar6 = J11.b;
                    AbstractC8641u21.c("Hey!", null, jH, jD, null, soA, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 200070, 0, 64978);
                    TU0.a(AT0.n(aVar, C6460mD.l(4)), interfaceC5781jp, 6);
                    AbstractC8641u21.c("You've unlocked a SPECIAL DEAL! 🤯", null, aVar2.d(), T21.d(18), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                    AbstractC8641u21.c("All PRO features", null, aVar2.h(), T21.d(18), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                    float f = 2;
                    TU0.a(AT0.n(aVar, C6460mD.l(f)), interfaceC5781jp, 6);
                    AbstractC8641u21.c("70% off", null, OY0.e(interfaceC8007rm0) ? OY0.a : aVar2.h(), T21.d(54), null, aVar5.a(), null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 199686, 0, 64978);
                    TU0.a(AT0.n(aVar, C6460mD.l(f)), interfaceC5781jp, 6);
                    D7.a aVar7 = new D7.a(0, 1, null);
                    aVar7.a("just ");
                    int iD = aVar7.d(new XU0(OY0.a, 0L, (SO) null, (PO) null, (QO) null, (AbstractC7898rO) null, (String) null, 0L, (C1671Ne) null, (C4437f21) null, (C4884gd0) null, 0L, (P11) null, (C4265eR0) null, 16382, (AbstractC2911Yw) null));
                    if (cVar != null) {
                        try {
                            strA = AbstractC1445Kz0.a(cVar);
                        } catch (Throwable th) {
                            throw th;
                        }
                    } else {
                        strA = null;
                    }
                    aVar7.a(str + " " + strA);
                    G91 g91 = G91.a;
                    aVar7.c(iD);
                    iD = aVar7.d(new XU0(0L, 0L, aVar5.a(), (PO) null, (QO) null, (AbstractC7898rO) null, (String) null, 0L, (C1671Ne) null, (C4437f21) null, (C4884gd0) null, 0L, (P11) null, (C4265eR0) null, 16379, (AbstractC2911Yw) null));
                    try {
                        aVar7.a("/ FOR FIRST MONTH");
                        aVar7.c(iD);
                        AbstractC8641u21.b(aVar7.e(), null, aVar2.h(), T21.d(14), null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, null, interfaceC5781jp, 3456, 0, 131058);
                        float f2 = 8;
                        TU0.a(AT0.n(aVar, C6460mD.l(f2)), interfaceC5781jp, 6);
                        InterfaceC2539Vh interfaceC2539VhA = C2643Wh.a.a(AbstractC3530bn.c(4293969748L), 0L, 0L, 0L, interfaceC5781jp, (C2643Wh.l << 12) | 6, 14);
                        InterfaceC1073Hk0 interfaceC1073Hk0N = AT0.n(AT0.s(aVar, C6460mD.l(180)), C6460mD.l(50));
                        C0101a c0101a = C0101a.B;
                        C2879Yo c2879Yo = C2879Yo.a;
                        AbstractC2851Yh.a(c0101a, interfaceC1073Hk0N, false, null, null, null, null, interfaceC2539VhA, null, c2879Yo.d(), interfaceC5781jp, 805306422, 380);
                        TU0.a(AT0.n(aVar, C6460mD.l(f2)), interfaceC5781jp, 6);
                        AbstractC8641u21.c("Happiness is just a click away!", null, aVar2.d(), T21.d(14), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                        interfaceC5781jp.L();
                        interfaceC5781jp.L();
                        interfaceC5781jp.M();
                        interfaceC5781jp.L();
                        interfaceC5781jp.L();
                        LX.a(lq, AbstractC0356Ap0.b(c9936yg.b(aVar, aVar3.i()), C6460mD.l(-8), C6460mD.l(8)), false, null, c2879Yo.e(), interfaceC5781jp, (i2 & 14) | 24576, 12);
                        interfaceC5781jp.L();
                        interfaceC5781jp.L();
                        interfaceC5781jp.M();
                        interfaceC5781jp.L();
                        interfaceC5781jp.L();
                        H3.b bVarC2 = aVar3.c();
                        InterfaceC1073Hk0 interfaceC1073Hk0B3 = AbstractC3763ce.b(AT0.m(AbstractC8290sn.a(c8848un, aVar, 1.0f, false, 2, null), 0.0f, 1, null), aVar2.h(), null, 2, null);
                        interfaceC5781jp.e(-483455358);
                        InterfaceC0957Gh0 interfaceC0957Gh0A3 = AbstractC8011rn.a(c1032Ha.d(), bVarC2, interfaceC5781jp, 48);
                        interfaceC5781jp.e(-1323940314);
                        InterfaceC4988gz interfaceC4988gz4 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                        EnumC7560q90 enumC7560q904 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                        InterfaceC2733Xd1 interfaceC2733Xd14 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                        LQ lqA4 = aVar4.a();
                        InterfaceC3986dR interfaceC3986dRA4 = B90.a(interfaceC1073Hk0B3);
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
                        AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC0957Gh0A3, aVar4.d());
                        AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC4988gz4, aVar4.b());
                        AbstractC5987ka1.b(interfaceC5781jpA4, enumC7560q904, aVar4.c());
                        AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC2733Xd14, aVar4.f());
                        interfaceC5781jp.i();
                        interfaceC3986dRA4.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                        interfaceC5781jp.e(2058660585);
                        interfaceC5781jp.e(-1163856341);
                        TU0.a(AT0.n(aVar, C6460mD.l(4)), interfaceC5781jp, 6);
                        AbstractC8641u21.c((cVar != null ? AbstractC1445Kz0.a(cVar) : null) + str + "/for first month", null, 0L, T21.d(13), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3072, 0, 65014);
                        AbstractC8641u21.c("Then " + (cVar != null ? AbstractC1445Kz0.a(cVar) : null) + str2 + "/month", null, 0L, T21.d(13), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3072, 0, 65014);
                        AbstractC8641u21.c("Cancel anytime, but we know happiness is hard to let go! 😉", null, 0L, T21.d(13), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3078, 0, 65014);
                        TU0.a(AT0.n(aVar, C6460mD.l((float) 8)), interfaceC5781jp, 6);
                        long jD2 = T21.d(13);
                        SO soA2 = aVar5.a();
                        long jA = aVar2.a();
                        int iA = aVar6.a();
                        interfaceC5781jp.e(1157296644);
                        boolean zP = interfaceC5781jp.P(lq);
                        Object objF = interfaceC5781jp.f();
                        if (zP || objF == InterfaceC5781jp.a.a()) {
                            objF = new b(lq);
                            interfaceC5781jp.H(objF);
                        }
                        interfaceC5781jp.L();
                        AbstractC8641u21.c("VIEW ALL PLANS", AbstractC1388Kl.e(aVar, false, null, null, (LQ) objF, 7, null), jA, jD2, null, soA2, null, 0L, null, J11.g(iA), 0L, 0, false, 0, null, null, interfaceC5781jp, 200070, 0, 64976);
                        TU0.a(AT0.n(aVar, C6460mD.l(2)), interfaceC5781jp, 6);
                        AbstractC8641u21.c("Subscription will be renewed automatically.\nYou can cancel subscription 24 hours before\nthe end of the purchase period.\nTo manage or cancel use your Google Play settings.", null, aVar2.d(), T21.d(12), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
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
                    } finally {
                        aVar7.c(iD);
                    }
                }

                @Override // com.daaw.InterfaceC3429bR
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                    return G91.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(LQ lq, int i, InterfaceC8007rm0 interfaceC8007rm0, String str, f.c cVar, String str2) {
                super(2);
                this.B = lq;
                this.C = i;
                this.D = interfaceC8007rm0;
                this.E = str;
                this.F = cVar;
                this.G = str2;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                    return;
                }
                if (AbstractC6348lp.O()) {
                    AbstractC6348lp.Z(905955125, i, -1, "com.daaw.avee.composables.dialogs.Discount70PercentDialog.<anonymous>.<anonymous> (SubDialogs.kt:446)");
                }
                OZ0.a(AT0.n(AT0.s(InterfaceC1073Hk0.m, C6460mD.l(500)), C6460mD.l(530)), AbstractC4805gK0.c(C6460mD.l(4)), C2559Vm.b.a(), 0L, null, 0.0f, AbstractC1815Oo.b(interfaceC5781jp, -1859170695, true, new C0100a(this.B, this.C, this.D, this.E, this.F, this.G)), interfaceC5781jp, 1573254, 56);
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
        public g(LQ lq, int i, InterfaceC8007rm0 interfaceC8007rm0, String str, f.c cVar, String str2) {
            super(2);
            this.B = lq;
            this.C = i;
            this.D = interfaceC8007rm0;
            this.E = str;
            this.F = cVar;
            this.G = str2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-1732722847, i, -1, "com.daaw.avee.composables.dialogs.Discount70PercentDialog.<anonymous> (SubDialogs.kt:445)");
            }
            AbstractC6588mh0.a(null, null, null, AbstractC1815Oo.b(interfaceC5781jp, 905955125, true, new a(this.B, this.C, this.D, this.E, this.F, this.G)), interfaceC5781jp, 3072, 7);
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

    public static final class h extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ LQ B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(LQ lq, int i) {
            super(2);
            this.B = lq;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            OY0.d(this.B, interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final class i extends SZ0 implements InterfaceC3429bR {
        public int F;
        public final /* synthetic */ NQ G;
        public final /* synthetic */ InterfaceC8007rm0 H;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(NQ nq, InterfaceC8007rm0 interfaceC8007rm0, InterfaceC1416Ks interfaceC1416Ks) {
            super(2, interfaceC1416Ks);
            this.G = nq;
            this.H = interfaceC8007rm0;
        }

        public static final G91 z(NQ nq, Boolean bool) {
            G10.d(bool);
            if (bool.booleanValue()) {
                nq.invoke(Boolean.TRUE);
            }
            return G91.a;
        }

        @Override // com.daaw.AbstractC7409pe
        public final InterfaceC1416Ks a(Object obj, InterfaceC1416Ks interfaceC1416Ks) {
            return new i(this.G, this.H, interfaceC1416Ks);
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0033 -> B:12:0x0036). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // com.daaw.AbstractC7409pe
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object q(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = com.daaw.I10.c()
                int r1 = r5.F
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                com.daaw.AbstractC4801gJ0.b(r6)
                goto L36
            Lf:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L17:
                com.daaw.AbstractC4801gJ0.b(r6)
                com.daaw.Fg1 r6 = com.daaw.WB0.o
                com.daaw.NQ r1 = r5.G
                com.daaw.SY0 r3 = new com.daaw.SY0
                r3.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r6.b(r3, r1)
            L2b:
                r5.F = r2
                r3 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = com.daaw.AbstractC0391Ay.a(r3, r5)
                if (r6 != r0) goto L36
                return r0
            L36:
                com.daaw.rm0 r6 = r5.H
                boolean r1 = com.daaw.OY0.n(r6)
                r1 = r1 ^ r2
                com.daaw.OY0.o(r6, r1)
                goto L2b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.OY0.i.q(java.lang.Object):java.lang.Object");
        }

        @Override // com.daaw.InterfaceC3429bR
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC7484pt interfaceC7484pt, InterfaceC1416Ks interfaceC1416Ks) {
            return ((i) a(interfaceC7484pt, interfaceC1416Ks)).q(G91.a);
        }
    }

    public static final class j extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ int C;
        public final /* synthetic */ InterfaceC8007rm0 D;
        public final /* synthetic */ f.c E;

        public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ NQ B;
            public final /* synthetic */ int C;
            public final /* synthetic */ InterfaceC8007rm0 D;
            public final /* synthetic */ f.c E;

            /* JADX INFO: renamed from: com.daaw.OY0$j$a$a, reason: collision with other inner class name */
            public static final class C0102a extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ NQ B;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0102a(NQ nq) {
                    super(0);
                    this.B = nq;
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m24invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m24invoke() {
                    this.B.invoke(Boolean.FALSE);
                }
            }

            public static final class b extends AbstractC4192e90 implements LQ {
                public static final b B = new b();

                public b() {
                    super(0);
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m25invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m25invoke() {
                    MY0.a.a().a("premium_1month_trial");
                }
            }

            public static final class c extends AbstractC4192e90 implements LQ {
                public final /* synthetic */ NQ B;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(NQ nq) {
                    super(0);
                    this.B = nq;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void c() {
                    MainActivity.T0.a(4);
                }

                @Override // com.daaw.LQ
                public /* bridge */ /* synthetic */ Object invoke() {
                    m26invoke();
                    return G91.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m26invoke() {
                    this.B.invoke(Boolean.FALSE);
                    new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.daaw.TY0
                        @Override // java.lang.Runnable
                        public final void run() {
                            OY0.j.a.c.c();
                        }
                    }, 150L);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(NQ nq, int i, InterfaceC8007rm0 interfaceC8007rm0, f.c cVar) {
                super(2);
                this.B = nq;
                this.C = i;
                this.D = interfaceC8007rm0;
                this.E = cVar;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                String strA;
                char c2;
                String strA2;
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                    return;
                }
                if (AbstractC6348lp.O()) {
                    AbstractC6348lp.Z(-223002701, i, -1, "com.daaw.avee.composables.dialogs.SubDialogFullscreen.<anonymous>.<anonymous> (SubDialogs.kt:86)");
                }
                InterfaceC1073Hk0.a aVar = InterfaceC1073Hk0.m;
                InterfaceC1073Hk0 interfaceC1073Hk0K = AT0.k(aVar, 0.0f, 1, null);
                C2559Vm.a aVar2 = C2559Vm.b;
                InterfaceC1073Hk0 interfaceC1073Hk0B = AbstractC3763ce.b(interfaceC1073Hk0K, aVar2.a(), null, 2, null);
                C1032Ha c1032Ha = C1032Ha.a;
                C1032Ha.e eVarB = c1032Ha.b();
                H3.a aVar3 = H3.a;
                H3.b bVarC = aVar3.c();
                NQ nq = this.B;
                InterfaceC8007rm0 interfaceC8007rm0 = this.D;
                f.c cVar = this.E;
                interfaceC5781jp.e(-483455358);
                InterfaceC0957Gh0 interfaceC0957Gh0A = AbstractC8011rn.a(eVarB, bVarC, interfaceC5781jp, 54);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                InterfaceC4943gp.a aVar4 = InterfaceC4943gp.d;
                LQ lqA = aVar4.a();
                InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0B);
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
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0A, aVar4.d());
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar4.b());
                AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar4.c());
                AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar4.f());
                interfaceC5781jp.i();
                interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-1163856341);
                InterfaceC1073Hk0 interfaceC1073Hk0M = AT0.m(AbstractC8290sn.a(C8848un.a, aVar, 1.0f, false, 2, null), 0.0f, 1, null);
                interfaceC5781jp.e(733328855);
                InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(aVar3.j(), false, interfaceC5781jp, 0);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz2 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q902 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd12 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                LQ lqA2 = aVar4.a();
                InterfaceC3986dR interfaceC3986dRA2 = B90.a(interfaceC1073Hk0M);
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
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC0957Gh0H, aVar4.d());
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC4988gz2, aVar4.b());
                AbstractC5987ka1.b(interfaceC5781jpA2, enumC7560q902, aVar4.c());
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC2733Xd12, aVar4.f());
                interfaceC5781jp.i();
                interfaceC3986dRA2.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-2137368960);
                C9936yg c9936yg = C9936yg.a;
                AbstractC6823nY.a(AbstractC0368As0.c(AbstractC3374bD0.e, interfaceC5781jp, 0), "", AT0.h(c9936yg.b(aVar, aVar3.a()), 0.28f), null, null, 0.0f, null, interfaceC5781jp, 56, 120);
                InterfaceC1073Hk0 interfaceC1073Hk0K2 = AT0.k(aVar, 0.0f, 1, null);
                C1032Ha.e eVarA = c1032Ha.a();
                H3.b bVarC2 = aVar3.c();
                interfaceC5781jp.e(-483455358);
                InterfaceC0957Gh0 interfaceC0957Gh0A2 = AbstractC8011rn.a(eVarA, bVarC2, interfaceC5781jp, 54);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz3 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q903 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd13 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                LQ lqA3 = aVar4.a();
                InterfaceC3986dR interfaceC3986dRA3 = B90.a(interfaceC1073Hk0K2);
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
                AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC0957Gh0A2, aVar4.d());
                AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC4988gz3, aVar4.b());
                AbstractC5987ka1.b(interfaceC5781jpA3, enumC7560q903, aVar4.c());
                AbstractC5987ka1.b(interfaceC5781jpA3, interfaceC2733Xd13, aVar4.f());
                interfaceC5781jp.i();
                interfaceC3986dRA3.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-1163856341);
                long jD = T21.d(54);
                SO.a aVar5 = SO.C;
                SO soA = aVar5.a();
                long jH = aVar2.h();
                J11.a aVar6 = J11.b;
                AbstractC8641u21.c("Hey there!", null, jH, jD, null, soA, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 200070, 0, 64978);
                AbstractC8641u21.c("Happiness comes from within", null, aVar2.d(), T21.d(16), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                TU0.a(AT0.n(aVar, C6460mD.l(16)), interfaceC5781jp, 6);
                AbstractC8641u21.c("Get", null, OY0.h(interfaceC8007rm0) ? OY0.a : aVar2.h(), T21.d(28), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3078, 0, 65010);
                AbstractC8641u21.c("PREMIUM", null, OY0.h(interfaceC8007rm0) ? OY0.a : aVar2.h(), T21.d(48), null, aVar5.a(), null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 199686, 0, 64978);
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.M();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.e(1157296644);
                boolean zP = interfaceC5781jp.P(nq);
                Object objF = interfaceC5781jp.f();
                if (zP || objF == InterfaceC5781jp.a.a()) {
                    objF = new C0102a(nq);
                    interfaceC5781jp.H(objF);
                }
                interfaceC5781jp.L();
                LQ lq = (LQ) objF;
                InterfaceC1073Hk0 interfaceC1073Hk0B2 = AbstractC0356Ap0.b(c9936yg.b(aVar, aVar3.i()), C6460mD.l(-8), C6460mD.l(8));
                C2879Yo c2879Yo = C2879Yo.a;
                LX.a(lq, interfaceC1073Hk0B2, false, null, c2879Yo.a(), interfaceC5781jp, 24576, 12);
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.M();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                H3.b bVarC3 = aVar3.c();
                InterfaceC1073Hk0 interfaceC1073Hk0B3 = AbstractC3763ce.b(AT0.m(aVar, 0.0f, 1, null), aVar2.h(), null, 2, null);
                interfaceC5781jp.e(-483455358);
                InterfaceC0957Gh0 interfaceC0957Gh0A3 = AbstractC8011rn.a(c1032Ha.d(), bVarC3, interfaceC5781jp, 48);
                interfaceC5781jp.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz4 = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q904 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd14 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
                LQ lqA4 = aVar4.a();
                InterfaceC3986dR interfaceC3986dRA4 = B90.a(interfaceC1073Hk0B3);
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
                AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC0957Gh0A3, aVar4.d());
                AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC4988gz4, aVar4.b());
                AbstractC5987ka1.b(interfaceC5781jpA4, enumC7560q904, aVar4.c());
                AbstractC5987ka1.b(interfaceC5781jpA4, interfaceC2733Xd14, aVar4.f());
                interfaceC5781jp.i();
                interfaceC3986dRA4.invoke(GT0.a(GT0.b(interfaceC5781jp)), interfaceC5781jp, 0);
                interfaceC5781jp.e(2058660585);
                interfaceC5781jp.e(-1163856341);
                TU0.a(AT0.n(aVar, C6460mD.l(12)), interfaceC5781jp, 6);
                BigDecimal scale = null;
                AbstractC8641u21.c("3 days free trial", null, aVar2.d(), T21.d(14), null, aVar5.a(), null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 200070, 0, 64978);
                C4293eY0 c4293eY0 = C4293eY0.a;
                String str = "";
                if (cVar == null || (strA = AbstractC1445Kz0.a(cVar)) == null) {
                    strA = "";
                }
                Object scale2 = cVar != null ? new BigDecimal(String.valueOf(AbstractC1445Kz0.b(cVar))).setScale(2, RoundingMode.HALF_UP) : null;
                Object obj = "0.00";
                if (scale2 == null) {
                    scale2 = "0.00";
                } else {
                    G10.d(scale2);
                }
                if (cVar != null && (strA2 = AbstractC1445Kz0.a(cVar)) != null) {
                    str = strA2;
                }
                if (cVar != null) {
                    c2 = 2;
                    scale = new BigDecimal(String.valueOf(AbstractC1445Kz0.b(cVar) / ((double) 30))).setScale(2, RoundingMode.HALF_UP);
                } else {
                    c2 = 2;
                }
                if (scale != null) {
                    G10.d(scale);
                    obj = scale;
                }
                Object[] objArr = new Object[4];
                objArr[0] = strA;
                objArr[1] = scale2;
                objArr[c2] = str;
                objArr[3] = obj;
                String str2 = String.format("%s%s/month after free trial (equivalent to %s%s/day)", Arrays.copyOf(objArr, 4));
                G10.f(str2, "format(...)");
                AbstractC8641u21.c(str2, null, aVar2.d(), T21.d(14), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3456, 0, 65010);
                float f = 16;
                TU0.a(AT0.n(aVar, C6460mD.l(f)), interfaceC5781jp, 6);
                AbstractC2851Yh.a(b.B, AT0.n(AT0.s(aVar, C6460mD.l(RCHTTPStatusCodes.UNSUCCESSFUL)), C6460mD.l(50)), false, null, null, null, null, C2643Wh.a.a(AbstractC3530bn.c(4293969748L), 0L, 0L, 0L, interfaceC5781jp, (C2643Wh.l << 12) | 6, 14), null, c2879Yo.b(), interfaceC5781jp, 805306422, 380);
                TU0.a(AT0.n(aVar, C6460mD.l(f)), interfaceC5781jp, 6);
                long jD2 = T21.d(16);
                long jA = aVar2.a();
                int iA = aVar6.a();
                interfaceC5781jp.e(1157296644);
                boolean zP2 = interfaceC5781jp.P(nq);
                Object objF2 = interfaceC5781jp.f();
                if (zP2 || objF2 == InterfaceC5781jp.a.a()) {
                    objF2 = new c(nq);
                    interfaceC5781jp.H(objF2);
                }
                interfaceC5781jp.L();
                AbstractC8641u21.c("VIEW ALL PLANS", AbstractC1388Kl.e(aVar, false, null, null, (LQ) objF2, 7, null), jA, jD2, null, null, null, 0L, null, J11.g(iA), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65008);
                TU0.a(AT0.n(aVar, C6460mD.l(f)), interfaceC5781jp, 6);
                AbstractC8641u21.c("The trial can be used once\nThe subscription will be billed automatically after the free trial.\nCancel during the trial period will not be charged.\nFor billed period cancelation, please visit GooglePlay 24 hours in advance.", null, aVar2.d(), T21.d(12), null, null, null, 0L, null, J11.g(aVar6.a()), 0L, 0, false, 0, null, null, interfaceC5781jp, 3462, 0, 65010);
                TU0.a(AT0.n(aVar, C6460mD.l(24)), interfaceC5781jp, 6);
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
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(NQ nq, int i, InterfaceC8007rm0 interfaceC8007rm0, f.c cVar) {
            super(2);
            this.B = nq;
            this.C = i;
            this.D = interfaceC8007rm0;
            this.E = cVar;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(543285871, i, -1, "com.daaw.avee.composables.dialogs.SubDialogFullscreen.<anonymous> (SubDialogs.kt:82)");
            }
            OZ0.a(AT0.k(InterfaceC1073Hk0.m, 0.0f, 1, null), null, C2559Vm.b.a(), 0L, null, 0.0f, AbstractC1815Oo.b(interfaceC5781jp, -223002701, true, new a(this.B, this.C, this.D, this.E)), interfaceC5781jp, 1573254, 58);
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

    public static final class k extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ NQ B;
        public final /* synthetic */ int C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(NQ nq, int i) {
            super(2);
            this.B = nq;
            this.C = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            OY0.g(this.B, interfaceC5781jp, this.C | 1);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(LQ lq, InterfaceC5781jp interfaceC5781jp, int i2) {
        int i3;
        LQ lq2;
        InterfaceC5781jp interfaceC5781jp2;
        G10.g(lq, "onDismiss");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1992773057);
        if ((i2 & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(lq) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
            lq2 = lq;
            interfaceC5781jp2 = interfaceC5781jpQ;
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(1992773057, i3, -1, "com.daaw.avee.composables.dialogs.Discount30SubDialog (SubDialogs.kt:228)");
            }
            com.android.billingclient.api.f fVarO = ((WB0) C7833r80.a.a().e().b().c(AbstractC5624jG0.b(WB0.class), null, null)).O("premium_1month90discount");
            f.c cVarC = fVarO != null ? AbstractC1445Kz0.c(fVarO) : null;
            Object scale = cVarC != null ? new BigDecimal(String.valueOf(AbstractC1445Kz0.b(cVarC))).setScale(2, RoundingMode.HALF_UP) : null;
            if (scale == null) {
                scale = "0.00";
            }
            String strValueOf = String.valueOf(scale);
            BigDecimal scale2 = cVarC != null ? new BigDecimal(String.valueOf(AbstractC1445Kz0.b(cVarC) * 0.7d)).setScale(2, RoundingMode.HALF_UP) : null;
            String strValueOf2 = String.valueOf(scale2 != null ? scale2 : "0.00");
            interfaceC5781jpQ.e(-492369756);
            Object objF = interfaceC5781jpQ.f();
            InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
            if (objF == aVar.a()) {
                objF = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
                interfaceC5781jpQ.H(objF);
            }
            interfaceC5781jpQ.L();
            InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
            Boolean bool = Boolean.TRUE;
            interfaceC5781jpQ.e(511388516);
            boolean zP = interfaceC5781jpQ.P(lq) | interfaceC5781jpQ.P(interfaceC8007rm0);
            Object objF2 = interfaceC5781jpQ.f();
            if (zP || objF2 == aVar.a()) {
                objF2 = new a(lq, interfaceC8007rm0, null);
                interfaceC5781jpQ.H(objF2);
            }
            interfaceC5781jpQ.L();
            AbstractC8420tF.c(bool, (InterfaceC3429bR) objF2, interfaceC5781jpQ, 70);
            interfaceC5781jpQ.e(1157296644);
            boolean zP2 = interfaceC5781jpQ.P(lq);
            Object objF3 = interfaceC5781jpQ.f();
            if (zP2 || objF3 == aVar.a()) {
                objF3 = new b(lq);
                interfaceC5781jpQ.H(objF3);
            }
            interfaceC5781jpQ.L();
            PB pb = new PB(false, false, null, false, 7, null);
            c cVar = new c(lq, i3, interfaceC8007rm0, cVarC, strValueOf2, strValueOf);
            lq2 = lq;
            interfaceC5781jp2 = interfaceC5781jpQ;
            G5.a((LQ) objF3, pb, AbstractC1815Oo.b(interfaceC5781jpQ, 1226880664, true, cVar), interfaceC5781jp2, 432, 0);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jp2.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new d(lq2, i2));
    }

    public static final boolean b(InterfaceC8007rm0 interfaceC8007rm0) {
        return ((Boolean) interfaceC8007rm0.getValue()).booleanValue();
    }

    public static final void c(InterfaceC8007rm0 interfaceC8007rm0, boolean z) {
        interfaceC8007rm0.setValue(Boolean.valueOf(z));
    }

    public static final void d(LQ lq, InterfaceC5781jp interfaceC5781jp, int i2) {
        int i3;
        LQ lq2;
        InterfaceC5781jp interfaceC5781jp2;
        G10.g(lq, "onDismiss");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-713188854);
        if ((i2 & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(lq) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
            lq2 = lq;
            interfaceC5781jp2 = interfaceC5781jpQ;
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-713188854, i3, -1, "com.daaw.avee.composables.dialogs.Discount70PercentDialog (SubDialogs.kt:424)");
            }
            com.android.billingclient.api.f fVarO = ((WB0) C7833r80.a.a().e().b().c(AbstractC5624jG0.b(WB0.class), null, null)).O("premium_1month90discount");
            f.c cVarC = fVarO != null ? AbstractC1445Kz0.c(fVarO) : null;
            Object scale = cVarC != null ? new BigDecimal(String.valueOf(AbstractC1445Kz0.b(cVarC))).setScale(2, RoundingMode.HALF_UP) : null;
            if (scale == null) {
                scale = "0.00";
            }
            String strValueOf = String.valueOf(scale);
            BigDecimal scale2 = cVarC != null ? new BigDecimal(String.valueOf(AbstractC1445Kz0.b(cVarC) * 0.3d)).setScale(2, RoundingMode.HALF_UP) : null;
            String strValueOf2 = String.valueOf(scale2 != null ? scale2 : "0.00");
            interfaceC5781jpQ.e(-492369756);
            Object objF = interfaceC5781jpQ.f();
            InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
            if (objF == aVar.a()) {
                objF = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
                interfaceC5781jpQ.H(objF);
            }
            interfaceC5781jpQ.L();
            InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
            Boolean bool = Boolean.TRUE;
            interfaceC5781jpQ.e(511388516);
            boolean zP = interfaceC5781jpQ.P(lq) | interfaceC5781jpQ.P(interfaceC8007rm0);
            Object objF2 = interfaceC5781jpQ.f();
            if (zP || objF2 == aVar.a()) {
                objF2 = new e(lq, interfaceC8007rm0, null);
                interfaceC5781jpQ.H(objF2);
            }
            interfaceC5781jpQ.L();
            AbstractC8420tF.c(bool, (InterfaceC3429bR) objF2, interfaceC5781jpQ, 70);
            interfaceC5781jpQ.e(1157296644);
            boolean zP2 = interfaceC5781jpQ.P(lq);
            Object objF3 = interfaceC5781jpQ.f();
            if (zP2 || objF3 == aVar.a()) {
                objF3 = new f(lq);
                interfaceC5781jpQ.H(objF3);
            }
            interfaceC5781jpQ.L();
            PB pb = new PB(false, false, null, false, 7, null);
            g gVar = new g(lq, i3, interfaceC8007rm0, strValueOf2, cVarC, strValueOf);
            lq2 = lq;
            interfaceC5781jp2 = interfaceC5781jpQ;
            G5.a((LQ) objF3, pb, AbstractC1815Oo.b(interfaceC5781jpQ, -1732722847, true, gVar), interfaceC5781jp2, 432, 0);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jp2.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new h(lq2, i2));
    }

    public static final boolean e(InterfaceC8007rm0 interfaceC8007rm0) {
        return ((Boolean) interfaceC8007rm0.getValue()).booleanValue();
    }

    public static final void f(InterfaceC8007rm0 interfaceC8007rm0, boolean z) {
        interfaceC8007rm0.setValue(Boolean.valueOf(z));
    }

    public static final void g(NQ nq, InterfaceC5781jp interfaceC5781jp, int i2) {
        int i3;
        G10.g(nq, "onDismiss");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(-1415549797);
        if ((i2 & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(nq) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) == 2 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-1415549797, i3, -1, "com.daaw.avee.composables.dialogs.SubDialogFullscreen (SubDialogs.kt:67)");
            }
            com.android.billingclient.api.f fVarO = ((WB0) C7833r80.a.a().e().b().c(AbstractC5624jG0.b(WB0.class), null, null)).O("premium_1month_trial");
            f.c cVarC = fVarO != null ? AbstractC1445Kz0.c(fVarO) : null;
            interfaceC5781jpQ.e(-492369756);
            Object objF = interfaceC5781jpQ.f();
            InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
            if (objF == aVar.a()) {
                objF = AbstractC9046vU0.d(Boolean.TRUE, null, 2, null);
                interfaceC5781jpQ.H(objF);
            }
            interfaceC5781jpQ.L();
            InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF;
            Boolean bool = Boolean.TRUE;
            interfaceC5781jpQ.e(511388516);
            boolean zP = interfaceC5781jpQ.P(nq) | interfaceC5781jpQ.P(interfaceC8007rm0);
            Object objF2 = interfaceC5781jpQ.f();
            if (zP || objF2 == aVar.a()) {
                objF2 = new i(nq, interfaceC8007rm0, null);
                interfaceC5781jpQ.H(objF2);
            }
            interfaceC5781jpQ.L();
            AbstractC8420tF.c(bool, (InterfaceC3429bR) objF2, interfaceC5781jpQ, 70);
            AbstractC6588mh0.a(null, null, null, AbstractC1815Oo.b(interfaceC5781jpQ, 543285871, true, new j(nq, i3, interfaceC8007rm0, cVarC)), interfaceC5781jpQ, 3072, 7);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new k(nq, i2));
    }

    public static final boolean h(InterfaceC8007rm0 interfaceC8007rm0) {
        return ((Boolean) interfaceC8007rm0.getValue()).booleanValue();
    }

    public static final void i(InterfaceC8007rm0 interfaceC8007rm0, boolean z) {
        interfaceC8007rm0.setValue(Boolean.valueOf(z));
    }
}
