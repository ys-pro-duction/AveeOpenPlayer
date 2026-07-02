package com.daaw;

/* JADX INFO: renamed from: com.daaw.So, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2255So {
    public static final C2255So a = new C2255So();
    public static InterfaceC3429bR b = AbstractC1815Oo.c(404364557, false, a.B);
    public static InterfaceC3986dR c = AbstractC1815Oo.c(-607707433, false, b.B);

    /* JADX INFO: renamed from: com.daaw.So$a */
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
                AbstractC6348lp.Z(404364557, i, -1, "com.daaw.avee.composables.dialogs.ComposableSingletons$DonationDialogKt.lambda-1.<anonymous> (DonationDialog.kt:87)");
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

    /* JADX INFO: renamed from: com.daaw.So$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final b B = new b();

        public b() {
            super(3);
        }

        public final void a(InterfaceC7047oK0 interfaceC7047oK0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(interfaceC7047oK0, "$this$Button");
            if ((i & 81) == 16 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-607707433, i, -1, "com.daaw.avee.composables.dialogs.ComposableSingletons$DonationDialogKt.lambda-2.<anonymous> (DonationDialog.kt:136)");
            }
            AbstractC8641u21.c("Buy us a coffee ☕", null, C2559Vm.b.h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, null, null, interfaceC5781jp, 390, 0, 65530);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((InterfaceC7047oK0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
            return G91.a;
        }
    }

    public final InterfaceC3429bR a() {
        return b;
    }

    public final InterfaceC3986dR b() {
        return c;
    }
}
