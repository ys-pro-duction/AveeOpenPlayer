package com.daaw;

/* JADX INFO: renamed from: com.daaw.mh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6588mh0 {

    /* JADX INFO: renamed from: com.daaw.mh0$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C5596j91 B;
        public final /* synthetic */ InterfaceC3429bR C;
        public final /* synthetic */ int D;

        /* JADX INFO: renamed from: com.daaw.mh0$a$a, reason: collision with other inner class name */
        public static final class C0214a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ InterfaceC3429bR B;
            public final /* synthetic */ int C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0214a(InterfaceC3429bR interfaceC3429bR, int i) {
                super(2);
                this.B = interfaceC3429bR;
                this.C = i;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                    return;
                }
                if (AbstractC6348lp.O()) {
                    AbstractC6348lp.Z(181426554, i, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:80)");
                }
                AbstractC7146oh0.a(this.B, interfaceC5781jp, (this.C >> 9) & 14);
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
        public a(C5596j91 c5596j91, InterfaceC3429bR interfaceC3429bR, int i) {
            super(2);
            this.B = c5596j91;
            this.C = interfaceC3429bR;
            this.D = i;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            if ((i & 11) == 2 && interfaceC5781jp.t()) {
                interfaceC5781jp.B();
                return;
            }
            if (AbstractC6348lp.O()) {
                AbstractC6348lp.Z(-1740102967, i, -1, "androidx.compose.material.MaterialTheme.<anonymous> (MaterialTheme.kt:79)");
            }
            AbstractC8641u21.a(this.B.a(), AbstractC1815Oo.b(interfaceC5781jp, 181426554, true, new C0214a(this.C, this.D)), interfaceC5781jp, 48);
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

    /* JADX INFO: renamed from: com.daaw.mh0$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C7454pn B;
        public final /* synthetic */ C5596j91 C;
        public final /* synthetic */ ER0 D;
        public final /* synthetic */ InterfaceC3429bR E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C7454pn c7454pn, C5596j91 c5596j91, ER0 er0, InterfaceC3429bR interfaceC3429bR, int i, int i2) {
            super(2);
            this.B = c7454pn;
            this.C = c5596j91;
            this.D = er0;
            this.E = interfaceC3429bR;
            this.F = i;
            this.G = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC6588mh0.a(this.B, this.C, this.D, this.E, interfaceC5781jp, this.F | 1, this.G);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.daaw.C7454pn r41, com.daaw.C5596j91 r42, com.daaw.ER0 r43, com.daaw.InterfaceC3429bR r44, com.daaw.InterfaceC5781jp r45, int r46, int r47) {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.AbstractC6588mh0.a(com.daaw.pn, com.daaw.j91, com.daaw.ER0, com.daaw.bR, com.daaw.jp, int, int):void");
    }
}
