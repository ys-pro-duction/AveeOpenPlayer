package com.daaw;

import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.zg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC10215zg {

    /* JADX INFO: renamed from: com.daaw.zg$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC0957Gh0 B;
        public final /* synthetic */ InterfaceC3986dR C;
        public final /* synthetic */ int D;

        /* JADX INFO: renamed from: com.daaw.zg$a$a, reason: collision with other inner class name */
        public static final class C0259a extends AbstractC4192e90 implements InterfaceC3429bR {
            public final /* synthetic */ InterfaceC3986dR B;
            public final /* synthetic */ C0423Bg C;
            public final /* synthetic */ int D;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0259a(InterfaceC3986dR interfaceC3986dR, C0423Bg c0423Bg, int i) {
                super(2);
                this.B = interfaceC3986dR;
                this.C = c0423Bg;
                this.D = i;
            }

            public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
                if ((i & 11) == 2 && interfaceC5781jp.t()) {
                    interfaceC5781jp.B();
                } else {
                    this.B.invoke(this.C, interfaceC5781jp, Integer.valueOf((this.D >> 6) & 112));
                }
            }

            @Override // com.daaw.InterfaceC3429bR
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
                return G91.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC0957Gh0 interfaceC0957Gh0, InterfaceC3986dR interfaceC3986dR, int i) {
            super(2);
            this.B = interfaceC0957Gh0;
            this.C = interfaceC3986dR;
            this.D = i;
        }

        public final InterfaceC1061Hh0 a(XY0 xy0, long j) {
            G10.g(xy0, "$this$SubcomposeLayout");
            return this.B.a(xy0, xy0.A(G91.a, AbstractC1815Oo.c(-1945019079, true, new C0259a(this.C, new C0423Bg(xy0, j, null), this.D))), j);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((XY0) obj, ((C6079kr) obj2).s());
        }
    }

    /* JADX INFO: renamed from: com.daaw.zg$b */
    public static final class b extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ InterfaceC1073Hk0 B;
        public final /* synthetic */ H3 C;
        public final /* synthetic */ boolean D;
        public final /* synthetic */ InterfaceC3986dR E;
        public final /* synthetic */ int F;
        public final /* synthetic */ int G;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC1073Hk0 interfaceC1073Hk0, H3 h3, boolean z, InterfaceC3986dR interfaceC3986dR, int i, int i2) {
            super(2);
            this.B = interfaceC1073Hk0;
            this.C = h3;
            this.D = z;
            this.E = interfaceC3986dR;
            this.F = i;
            this.G = i2;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC10215zg.a(this.B, this.C, this.D, this.E, interfaceC5781jp, this.F | 1, this.G);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(InterfaceC1073Hk0 interfaceC1073Hk0, H3 h3, boolean z, InterfaceC3986dR interfaceC3986dR, InterfaceC5781jp interfaceC5781jp, int i, int i2) {
        int i3;
        G10.g(interfaceC3986dR, "content");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(1781813501);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (interfaceC5781jpQ.P(interfaceC1073Hk0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= interfaceC5781jpQ.P(h3) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= interfaceC5781jpQ.c(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 7168) == 0) {
            i3 |= interfaceC5781jpQ.P(interfaceC3986dR) ? 2048 : 1024;
        }
        if ((i3 & 5851) == 1170 && interfaceC5781jpQ.t()) {
            interfaceC5781jpQ.B();
        } else {
            if (i4 != 0) {
                interfaceC1073Hk0 = InterfaceC1073Hk0.m;
            }
            if (i5 != 0) {
                h3 = H3.a.j();
            }
            if (i6 != 0) {
                z = false;
            }
            InterfaceC0957Gh0 interfaceC0957Gh0H = AbstractC9378wg.h(h3, z, interfaceC5781jpQ, (i3 >> 3) & 126);
            interfaceC5781jpQ.e(511388516);
            boolean zP = interfaceC5781jpQ.P(interfaceC3986dR) | interfaceC5781jpQ.P(interfaceC0957Gh0H);
            Object objF = interfaceC5781jpQ.f();
            if (zP || objF == InterfaceC5781jp.a.a()) {
                objF = new a(interfaceC0957Gh0H, interfaceC3986dR, i3);
                interfaceC5781jpQ.H(objF);
            }
            interfaceC5781jpQ.L();
            VY0.a(interfaceC1073Hk0, (InterfaceC3429bR) objF, interfaceC5781jpQ, i3 & 14, 0);
        }
        InterfaceC1073Hk0 interfaceC1073Hk02 = interfaceC1073Hk0;
        H3 h32 = h3;
        boolean z2 = z;
        QN0 qn0Z = interfaceC5781jpQ.z();
        if (qn0Z == null) {
            return;
        }
        qn0Z.a(new b(interfaceC1073Hk02, h32, z2, interfaceC3986dR, i, i2));
    }
}
