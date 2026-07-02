package com.daaw;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.daaw.C1032Ha;
import com.daaw.C2559Vm;
import com.daaw.CJ;
import com.daaw.H3;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC4943gp;
import java.util.Map;

/* JADX INFO: renamed from: com.daaw.To, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2359To {
    public static final C2359To a = new C2359To();
    public static InterfaceC3429bR b = AbstractC1815Oo.c(1334672575, false, a.B);

    /* JADX INFO: renamed from: com.daaw.To$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        /* JADX INFO: renamed from: com.daaw.To$a$a, reason: collision with other inner class name */
        public static final class C0120a extends AbstractC4192e90 implements LQ {
            public final /* synthetic */ String B;
            public final /* synthetic */ Context C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0120a(String str, Context context) {
                super(0);
                this.B = str;
                this.C = context;
            }

            @Override // com.daaw.LQ
            public /* bridge */ /* synthetic */ Object invoke() {
                m32invoke();
                return G91.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m32invoke() {
                this.C.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.B)));
            }
        }

        public a() {
            super(2);
        }

        /* JADX WARN: Type inference failed for: r8v0 */
        /* JADX WARN: Type inference failed for: r8v1, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r8v5 */
        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            InterfaceC5781jp interfaceC5781jp2 = interfaceC5781jp;
            ?? r8 = 0;
            int i2 = 2;
            if ((i & 11) == 2 && interfaceC5781jp2.t()) {
                interfaceC5781jp2.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(1334672575, i, -1, "com.daaw.avee.ComposableSingletons$MainActivityKt.lambda-1.<anonymous> (MainActivity.kt:371)");
            }
            Context context = (Context) interfaceC5781jp2.O(B5.g());
            float f = 0.0f;
            Object obj = null;
            InterfaceC1073Hk0 interfaceC1073Hk0I = AT0.i(AT0.m(InterfaceC1073Hk0.m, 0.0f, 1, null), 0.0f, 1, null);
            C1032Ha.e eVarA = C1032Ha.a.a();
            H3.c cVarD = H3.a.d();
            interfaceC5781jp2.e(693286680);
            InterfaceC0957Gh0 interfaceC0957Gh0A = AbstractC6768nK0.a(eVarA, cVarD, interfaceC5781jp2, 54);
            interfaceC5781jp2.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp2.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp2.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp2.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
            LQ lqA = aVar.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0I);
            if (!AbstractC2988Zp0.a(interfaceC5781jp2.v())) {
                AbstractC3540bp.c();
            }
            interfaceC5781jp2.s();
            if (interfaceC5781jp2.n()) {
                interfaceC5781jp2.E(lqA);
            } else {
                interfaceC5781jp2.G();
            }
            interfaceC5781jp2.u();
            InterfaceC5781jp interfaceC5781jpA = AbstractC5987ka1.a(interfaceC5781jp2);
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC0957Gh0A, aVar.d());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC4988gz, aVar.b());
            AbstractC5987ka1.b(interfaceC5781jpA, enumC7560q90, aVar.c());
            AbstractC5987ka1.b(interfaceC5781jpA, interfaceC2733Xd1, aVar.f());
            interfaceC5781jp2.i();
            interfaceC3986dRA.invoke(GT0.a(GT0.b(interfaceC5781jp2)), interfaceC5781jp2, 0);
            interfaceC5781jp2.e(2058660585);
            interfaceC5781jp2.e(-678309503);
            C7326pK0 c7326pK0 = C7326pK0.a;
            DJ dj = DJ.a;
            Map mapK = AbstractC1473Lg0.k(D61.a(dj.c(), "https://www.youtube.com/channel/UCHXLzig13cuN15uigifLK7w"), D61.a(dj.a(), "https://www.instagram.com/avee.musicplayer/profilecard/?igsh=d2sweTQwMnV1M2Fw"), D61.a(dj.b(), "https://www.tiktok.com/@avee.musicplayer?_t=8qK4mOiiBAf&_r=1"));
            interfaceC5781jp2.e(-772413376);
            for (Map.Entry entry : mapK.entrySet()) {
                CJ.a aVar2 = (CJ.a) entry.getKey();
                String str = (String) entry.getValue();
                InterfaceC1073Hk0.a aVar3 = InterfaceC1073Hk0.m;
                InterfaceC1073Hk0 interfaceC1073Hk0O = AT0.o(AbstractC6085ks0.f(aVar3, C6460mD.l(10), f, i2, obj), C6460mD.l(40));
                C2559Vm.a aVar4 = C2559Vm.b;
                InterfaceC1073Hk0 interfaceC1073Hk0E = AbstractC1388Kl.e(AbstractC3763ce.b(interfaceC1073Hk0O, aVar4.f(), null, 2, null), false, null, null, new C0120a(str, context), 7, null);
                interfaceC5781jp2.e(733328855);
                H3.a aVar5 = H3.a;
                InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(aVar5.j(), r8, interfaceC5781jp2, r8);
                interfaceC5781jp2.e(-1323940314);
                InterfaceC4988gz interfaceC4988gz2 = (InterfaceC4988gz) interfaceC5781jp2.O(AbstractC2259Sp.d());
                EnumC7560q90 enumC7560q902 = (EnumC7560q90) interfaceC5781jp2.O(AbstractC2259Sp.g());
                InterfaceC2733Xd1 interfaceC2733Xd12 = (InterfaceC2733Xd1) interfaceC5781jp2.O(AbstractC2259Sp.i());
                InterfaceC4943gp.a aVar6 = InterfaceC4943gp.d;
                LQ lqA2 = aVar6.a();
                InterfaceC3986dR interfaceC3986dRA2 = B90.a(interfaceC1073Hk0E);
                if (!AbstractC2988Zp0.a(interfaceC5781jp2.v())) {
                    AbstractC3540bp.c();
                }
                interfaceC5781jp2.s();
                if (interfaceC5781jp2.n()) {
                    interfaceC5781jp2.E(lqA2);
                } else {
                    interfaceC5781jp2.G();
                }
                interfaceC5781jp2.u();
                InterfaceC5781jp interfaceC5781jpA2 = AbstractC5987ka1.a(interfaceC5781jp2);
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC0957Gh0H, aVar6.d());
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC4988gz2, aVar6.b());
                AbstractC5987ka1.b(interfaceC5781jpA2, enumC7560q902, aVar6.c());
                AbstractC5987ka1.b(interfaceC5781jpA2, interfaceC2733Xd12, aVar6.f());
                interfaceC5781jp2.i();
                interfaceC3986dRA2.invoke(GT0.a(GT0.b(interfaceC5781jp2)), interfaceC5781jp2, 0);
                interfaceC5781jp2.e(2058660585);
                interfaceC5781jp2.e(-2137368960);
                BJ.a(aVar2, C9936yg.a.b(aVar3, aVar5.b()), C6460mD.l(30), aVar4.a(), interfaceC5781jp2, CJ.a.c | 3456, 0);
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp.M();
                interfaceC5781jp.L();
                interfaceC5781jp.L();
                interfaceC5781jp2 = interfaceC5781jp;
                r8 = 0;
                i2 = 2;
                f = 0.0f;
                obj = null;
            }
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

    public final InterfaceC3429bR a() {
        return b;
    }
}
