package com.daaw;

import android.graphics.Matrix;
import com.daaw.InterfaceC5781jp;
import com.google.android.gms.ads.AdRequest;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.we0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC9369we0 {

    /* JADX INFO: renamed from: com.daaw.we0$a */
    public static final class a extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C0737Ee0 B;
        public final /* synthetic */ LQ C;
        public final /* synthetic */ InterfaceC1073Hk0 D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ WG0 H;
        public final /* synthetic */ boolean I;
        public final /* synthetic */ H3 J;
        public final /* synthetic */ InterfaceC7479ps K;
        public final /* synthetic */ boolean L;
        public final /* synthetic */ int M;
        public final /* synthetic */ int N;
        public final /* synthetic */ int O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C0737Ee0 c0737Ee0, LQ lq, InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, boolean z2, boolean z3, WG0 wg0, boolean z4, AbstractC4894gf0 abstractC4894gf0, H3 h3, InterfaceC7479ps interfaceC7479ps, boolean z5, int i, int i2, int i3) {
            super(2);
            this.B = c0737Ee0;
            this.C = lq;
            this.D = interfaceC1073Hk0;
            this.E = z;
            this.F = z2;
            this.G = z3;
            this.H = wg0;
            this.I = z4;
            this.J = h3;
            this.K = interfaceC7479ps;
            this.L = z5;
            this.M = i;
            this.N = i2;
            this.O = i3;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC9369we0.a(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, null, this.J, this.K, this.L, interfaceC5781jp, this.M | 1, this.N, this.O);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.we0$b */
    public static final class b extends AbstractC4192e90 implements NQ {
        public final /* synthetic */ C0737Ee0 B;
        public final /* synthetic */ InterfaceC7479ps C;
        public final /* synthetic */ H3 D;
        public final /* synthetic */ Matrix E;
        public final /* synthetic */ C4615ff0 F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ WG0 H;
        public final /* synthetic */ boolean I;
        public final /* synthetic */ boolean J;
        public final /* synthetic */ boolean K;
        public final /* synthetic */ boolean L;
        public final /* synthetic */ LQ M;
        public final /* synthetic */ InterfaceC8007rm0 N;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C0737Ee0 c0737Ee0, InterfaceC7479ps interfaceC7479ps, H3 h3, Matrix matrix, C4615ff0 c4615ff0, boolean z, WG0 wg0, AbstractC4894gf0 abstractC4894gf0, boolean z2, boolean z3, boolean z4, boolean z5, LQ lq, InterfaceC8007rm0 interfaceC8007rm0) {
            super(1);
            this.B = c0737Ee0;
            this.C = interfaceC7479ps;
            this.D = h3;
            this.E = matrix;
            this.F = c4615ff0;
            this.G = z;
            this.H = wg0;
            this.I = z2;
            this.J = z3;
            this.K = z4;
            this.L = z5;
            this.M = lq;
            this.N = interfaceC8007rm0;
        }

        public final void a(OD od) {
            G10.g(od, "$this$Canvas");
            C0737Ee0 c0737Ee0 = this.B;
            InterfaceC7479ps interfaceC7479ps = this.C;
            H3 h3 = this.D;
            Matrix matrix = this.E;
            C4615ff0 c4615ff0 = this.F;
            boolean z = this.G;
            WG0 wg0 = this.H;
            boolean z2 = this.I;
            boolean z3 = this.J;
            boolean z4 = this.K;
            boolean z5 = this.L;
            LQ lq = this.M;
            InterfaceC8007rm0 interfaceC8007rm0 = this.N;
            InterfaceC6318lj interfaceC6318ljD = od.R().d();
            long jA = BT0.a(c0737Ee0.b().width(), c0737Ee0.b().height());
            long jA2 = J00.a(AbstractC8261sh0.b(C9879yT0.i(od.a())), AbstractC8261sh0.b(C9879yT0.g(od.a())));
            long jA3 = interfaceC7479ps.a(jA, od.a());
            long jA4 = h3.a(AbstractC9369we0.e(jA, jA3), jA2, od.getLayoutDirection());
            matrix.reset();
            matrix.preTranslate(D00.f(jA4), D00.g(jA4));
            matrix.preScale(AbstractC5934kN0.b(jA3), AbstractC5934kN0.c(jA3));
            c4615ff0.y(z);
            c4615ff0.B0(wg0);
            c4615ff0.j0(c0737Ee0);
            AbstractC9369we0.c(interfaceC8007rm0);
            c4615ff0.y0(z2);
            c4615ff0.h0(z3);
            c4615ff0.p0(z4);
            c4615ff0.i0(z5);
            c4615ff0.A0(((Number) lq.invoke()).floatValue());
            c4615ff0.setBounds(0, 0, c0737Ee0.b().width(), c0737Ee0.b().height());
            c4615ff0.w(AbstractC3614c5.c(interfaceC6318ljD), matrix);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((OD) obj);
            return G91.a;
        }
    }

    /* JADX INFO: renamed from: com.daaw.we0$c */
    public static final class c extends AbstractC4192e90 implements InterfaceC3429bR {
        public final /* synthetic */ C0737Ee0 B;
        public final /* synthetic */ LQ C;
        public final /* synthetic */ InterfaceC1073Hk0 D;
        public final /* synthetic */ boolean E;
        public final /* synthetic */ boolean F;
        public final /* synthetic */ boolean G;
        public final /* synthetic */ WG0 H;
        public final /* synthetic */ boolean I;
        public final /* synthetic */ H3 J;
        public final /* synthetic */ InterfaceC7479ps K;
        public final /* synthetic */ boolean L;
        public final /* synthetic */ int M;
        public final /* synthetic */ int N;
        public final /* synthetic */ int O;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(C0737Ee0 c0737Ee0, LQ lq, InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, boolean z2, boolean z3, WG0 wg0, boolean z4, AbstractC4894gf0 abstractC4894gf0, H3 h3, InterfaceC7479ps interfaceC7479ps, boolean z5, int i, int i2, int i3) {
            super(2);
            this.B = c0737Ee0;
            this.C = lq;
            this.D = interfaceC1073Hk0;
            this.E = z;
            this.F = z2;
            this.G = z3;
            this.H = wg0;
            this.I = z4;
            this.J = h3;
            this.K = interfaceC7479ps;
            this.L = z5;
            this.M = i;
            this.N = i2;
            this.O = i3;
        }

        public final void a(InterfaceC5781jp interfaceC5781jp, int i) {
            AbstractC9369we0.a(this.B, this.C, this.D, this.E, this.F, this.G, this.H, this.I, null, this.J, this.K, this.L, interfaceC5781jp, this.M | 1, this.N, this.O);
        }

        @Override // com.daaw.InterfaceC3429bR
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((InterfaceC5781jp) obj, ((Number) obj2).intValue());
            return G91.a;
        }
    }

    public static final void a(C0737Ee0 c0737Ee0, LQ lq, InterfaceC1073Hk0 interfaceC1073Hk0, boolean z, boolean z2, boolean z3, WG0 wg0, boolean z4, AbstractC4894gf0 abstractC4894gf0, H3 h3, InterfaceC7479ps interfaceC7479ps, boolean z5, InterfaceC5781jp interfaceC5781jp, int i, int i2, int i3) {
        InterfaceC5781jp interfaceC5781jp2;
        G10.g(lq, "progress");
        InterfaceC5781jp interfaceC5781jpQ = interfaceC5781jp.q(185150517);
        InterfaceC1073Hk0 interfaceC1073Hk02 = (i3 & 4) != 0 ? InterfaceC1073Hk0.m : interfaceC1073Hk0;
        boolean z6 = (i3 & 8) != 0 ? false : z;
        boolean z7 = (i3 & 16) != 0 ? false : z2;
        boolean z8 = (i3 & 32) != 0 ? false : z3;
        WG0 wg02 = (i3 & 64) != 0 ? WG0.AUTOMATIC : wg0;
        boolean z9 = (i3 & 128) != 0 ? false : z4;
        AbstractC4894gf0 abstractC4894gf02 = (i3 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? null : abstractC4894gf0;
        H3 h3B = (i3 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0 ? H3.a.b() : h3;
        InterfaceC7479ps interfaceC7479psB = (i3 & 1024) != 0 ? InterfaceC7479ps.a.b() : interfaceC7479ps;
        boolean z10 = (i3 & 2048) != 0 ? true : z5;
        interfaceC5781jpQ.e(-3687241);
        Object objF = interfaceC5781jpQ.f();
        InterfaceC5781jp.a aVar = InterfaceC5781jp.a;
        if (objF == aVar.a()) {
            objF = new C4615ff0();
            interfaceC5781jpQ.H(objF);
        }
        interfaceC5781jpQ.L();
        C4615ff0 c4615ff0 = (C4615ff0) objF;
        interfaceC5781jpQ.e(-3687241);
        Object objF2 = interfaceC5781jpQ.f();
        if (objF2 == aVar.a()) {
            objF2 = new Matrix();
            interfaceC5781jpQ.H(objF2);
        }
        interfaceC5781jpQ.L();
        Matrix matrix = (Matrix) objF2;
        interfaceC5781jpQ.e(-3687241);
        Object objF3 = interfaceC5781jpQ.f();
        if (objF3 == aVar.a()) {
            objF3 = AbstractC9046vU0.d(null, null, 2, null);
            interfaceC5781jpQ.H(objF3);
        }
        interfaceC5781jpQ.L();
        InterfaceC8007rm0 interfaceC8007rm0 = (InterfaceC8007rm0) objF3;
        interfaceC5781jpQ.e(185151250);
        if (c0737Ee0 == null || c0737Ee0.d() == 0.0f) {
            AbstractC4894gf0 abstractC4894gf03 = abstractC4894gf02;
            boolean z11 = z6;
            interfaceC5781jpQ.L();
            QN0 qn0Z = interfaceC5781jpQ.z();
            if (qn0Z == null) {
                interfaceC5781jp2 = interfaceC5781jpQ;
            } else {
                interfaceC5781jp2 = interfaceC5781jpQ;
                qn0Z.a(new a(c0737Ee0, lq, interfaceC1073Hk02, z11, z7, z8, wg02, z9, abstractC4894gf03, h3B, interfaceC7479psB, z10, i, i2, i3));
            }
            AbstractC9378wg.a(interfaceC1073Hk02, interfaceC5781jp2, (i >> 6) & 14);
            return;
        }
        interfaceC5781jpQ.L();
        float fE = AbstractC0301Ab1.e();
        AbstractC4894gf0 abstractC4894gf04 = abstractC4894gf02;
        boolean z12 = z6;
        AbstractC7713qj.a(AT0.p(interfaceC1073Hk02, C6460mD.l(c0737Ee0.b().width() / fE), C6460mD.l(c0737Ee0.b().height() / fE)), new b(c0737Ee0, interfaceC7479psB, h3B, matrix, c4615ff0, z8, wg02, abstractC4894gf02, z6, z7, z9, z10, lq, interfaceC8007rm0), interfaceC5781jpQ, 0);
        QN0 qn0Z2 = interfaceC5781jpQ.z();
        if (qn0Z2 == null) {
            return;
        }
        qn0Z2.a(new c(c0737Ee0, lq, interfaceC1073Hk02, z12, z7, z8, wg02, z9, abstractC4894gf04, h3B, interfaceC7479psB, z10, i, i2, i3));
    }

    public static final AbstractC4894gf0 b(InterfaceC8007rm0 interfaceC8007rm0) {
        AbstractC6314li0.a(interfaceC8007rm0.getValue());
        return null;
    }

    public static final /* synthetic */ AbstractC4894gf0 c(InterfaceC8007rm0 interfaceC8007rm0) {
        b(interfaceC8007rm0);
        return null;
    }

    public static final long e(long j, long j2) {
        return J00.a((int) (C9879yT0.i(j) * AbstractC5934kN0.b(j2)), (int) (C9879yT0.g(j) * AbstractC5934kN0.c(j2)));
    }
}
