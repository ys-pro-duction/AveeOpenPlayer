package com.daaw.avee.composables;

import android.os.Bundle;
import com.daaw.AT0;
import com.daaw.AbstractActivityC5776jo;
import com.daaw.AbstractC1504Lo;
import com.daaw.AbstractC1815Oo;
import com.daaw.AbstractC2259Sp;
import com.daaw.AbstractC2988Zp0;
import com.daaw.AbstractC3540bp;
import com.daaw.AbstractC3785ci1;
import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC5987ka1;
import com.daaw.AbstractC6348lp;
import com.daaw.AbstractC7738qo;
import com.daaw.AbstractC9378wg;
import com.daaw.B90;
import com.daaw.C9936yg;
import com.daaw.EnumC7560q90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.GT0;
import com.daaw.H3;
import com.daaw.InterfaceC0957Gh0;
import com.daaw.InterfaceC1073Hk0;
import com.daaw.InterfaceC2733Xd1;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC3986dR;
import com.daaw.InterfaceC4943gp;
import com.daaw.InterfaceC4988gz;
import com.daaw.InterfaceC5781jp;
import com.daaw.LQ;
import com.daaw.NQ;
import com.daaw.OY0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/daaw/avee/composables/ComposableActivity;", "Lcom/daaw/jo;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "Lcom/daaw/G91;", "onCreate", "(Landroid/os/Bundle;)V", "X", "a", "app_standardRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class ComposableActivity extends AbstractActivityC5776jo {

    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ String B;
        public final /* synthetic */ ComposableActivity C;

        public static final class a extends AbstractC4192e90 implements NQ {
            public final /* synthetic */ ComposableActivity B;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(ComposableActivity composableActivity) {
                super(1);
                this.B = composableActivity;
            }

            public final void a(boolean z) {
                this.B.finish();
            }

            @Override // com.daaw.NQ
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a(((Boolean) obj).booleanValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, ComposableActivity composableActivity) {
            super(2);
            this.B = str;
            this.C = composableActivity;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(320292469, i, -1, "com.daaw.avee.composables.ComposableActivity.onCreate.<anonymous> (ComposableActivity.kt:25)");
            }
            InterfaceC1073Hk0 interfaceC1073Hk0A = AbstractC3785ci1.a(AT0.k(InterfaceC1073Hk0.m, 0.0f, 1, null));
            String str = this.B;
            ComposableActivity composableActivity = this.C;
            interfaceC5781jp.e(733328855);
            InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(H3.a.j(), false, interfaceC5781jp, 0);
            interfaceC5781jp.e(-1323940314);
            InterfaceC4988gz interfaceC4988gz = (InterfaceC4988gz) interfaceC5781jp.O(AbstractC2259Sp.d());
            EnumC7560q90 enumC7560q90 = (EnumC7560q90) interfaceC5781jp.O(AbstractC2259Sp.g());
            InterfaceC2733Xd1 interfaceC2733Xd1 = (InterfaceC2733Xd1) interfaceC5781jp.O(AbstractC2259Sp.i());
            InterfaceC4943gp.a aVar = InterfaceC4943gp.d;
            LQ lqA = aVar.a();
            InterfaceC3986dR interfaceC3986dRA = B90.a(interfaceC1073Hk0A);
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
            if (G10.c(str, "sub_dialog")) {
                interfaceC5781jp.e(1713221310);
                interfaceC5781jp.e(1157296644);
                boolean zP = interfaceC5781jp.P(composableActivity);
                Object objF = interfaceC5781jp.f();
                if (zP || objF == InterfaceC5781jp.a.a()) {
                    objF = new a(composableActivity);
                    interfaceC5781jp.H(objF);
                }
                interfaceC5781jp.L();
                OY0.g((NQ) objF, interfaceC5781jp, 0);
                interfaceC5781jp.L();
            } else {
                interfaceC5781jp.e(1713221412);
                AbstractC1504Lo.a(interfaceC5781jp, 0);
                interfaceC5781jp.L();
            }
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

    @Override // com.daaw.AbstractActivityC5776jo, com.daaw.AbstractActivityC7459po, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String stringExtra = getIntent().getStringExtra("screen_name");
        if (stringExtra == null) {
            stringExtra = "sub_dialog";
        }
        AbstractC7738qo.b(this, null, AbstractC1815Oo.c(320292469, true, new b(stringExtra, this)), 1, null);
    }
}
