package com.daaw;

/* JADX INFO: renamed from: com.daaw.Uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2463Uo {
    public static final C2463Uo a = new C2463Uo();
    public static InterfaceC3429bR b = AbstractC1815Oo.c(1600257891, false, a.B);

    /* JADX INFO: renamed from: com.daaw.Uo$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final a B = new a();

        public a() {
            super(2);
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(1600257891, i, -1, "com.daaw.avee.composables.dialogs.ComposableSingletons$MoreTemplatesDialogKt.lambda-1.<anonymous> (MoreTemplatesDialog.kt:190)");
            }
            NX.a(AbstractC0368As0.c(AbstractC3374bD0.v, interfaceC5781jp, 0), "Close", AT0.o(InterfaceC1073Hk0.m, C6460mD.l(20)), C2559Vm.b.d(), interfaceC5781jp, 3512, 0);
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
