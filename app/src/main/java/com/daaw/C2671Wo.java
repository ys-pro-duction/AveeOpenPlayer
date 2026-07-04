package com.daaw;

/* JADX INFO: renamed from: com.daaw.Wo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2671Wo {
    public static final C2671Wo a = new C2671Wo();
    public static InterfaceC3429bR b = AbstractC1815Oo.c(2069405901, false, a.B);
    public static InterfaceC3429bR c = AbstractC1815Oo.c(-231850563, false, b.B);
    public static InterfaceC3986dR d = AbstractC1815Oo.c(-147687984, false, c.B);
    public static InterfaceC3429bR e = AbstractC1815Oo.c(-900670499, false, d.B);

    /* JADX INFO: renamed from: com.daaw.Wo$a */
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
                AbstractC6348lp.Z(2069405901, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-1.<anonymous> (Scaffold.kt:161)");
            }
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

    /* JADX INFO: renamed from: com.daaw.Wo$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final b B = new b();

        public b() {
            super(2);
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-231850563, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-2.<anonymous> (Scaffold.kt:162)");
            }
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

    /* JADX INFO: renamed from: com.daaw.Wo$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3986dR {
        public static final c B = new c();

        public c() {
            super(3);
        }

        public final void a(C3163aU0 c3163aU0, InterfaceC5781jp interfaceC5781jp, int i) {
            G10.g(c3163aU0, "it");
            if ((i & 14) == 0) {
                i |= interfaceC5781jp.P(c3163aU0) ? 4 : 2;
            }
            if ((i & 91) == 18 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-147687984, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-3.<anonymous> (Scaffold.kt:163)");
            }
            ZT0.b(c3163aU0, null, null, interfaceC5781jp, i & 14, 6);
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Y();
            }
        }

        @Override // com.daaw.InterfaceC3986dR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C3163aU0) obj, (InterfaceC5781jp) obj2, ((Number) obj3).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.Wo$d */
    public static final class d extends AbstractC4192e90 implements InterfaceC3429bR {
        public static final d B = new d();

        public d() {
            super(2);
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-900670499, i, -1, "androidx.compose.material.ComposableSingletons$ScaffoldKt.lambda-4.<anonymous> (Scaffold.kt:164)");
            }
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

    public final InterfaceC3429bR b() {
        return c;
    }

    public final InterfaceC3986dR c() {
        return d;
    }

    public final InterfaceC3429bR d() {
        return e;
    }
}
