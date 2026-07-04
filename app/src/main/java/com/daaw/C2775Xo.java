package com.daaw;

/* JADX INFO: renamed from: com.daaw.Xo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2775Xo {
    public static final C2775Xo a = new C2775Xo();
    public static InterfaceC3986dR b = AbstractC1815Oo.c(996639038, false, a.B);

    /* JADX INFO: renamed from: com.daaw.Xo$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final a B = new a();

        public a() {
            super(3);
        }

        public final void a(XT0 xt0, InterfaceC5781jp interfaceC5781jp, int i) {
            int i2;
            G10.g(xt0, "it");
            if ((i & 14) == 0) {
                i2 = i | (interfaceC5781jp.P(xt0) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 91) == 18 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(996639038, i2, -1, "androidx.compose.material.ComposableSingletons$SnackbarHostKt.lambda-1.<anonymous> (SnackbarHost.kt:153)");
            }
            AbstractC3442bU0.d(xt0, null, false, null, 0L, 0L, 0L, 0.0f, interfaceC5781jp, i2 & 14, 254);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            AbstractC6314li0.a(obj);
            a(null, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
            return G91.a;
        }
    }

    public final InterfaceC3986dR a() {
        return b;
    }
}
