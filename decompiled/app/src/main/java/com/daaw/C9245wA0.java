package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import com.google.android.gms.ads.AdRequest;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: renamed from: com.daaw.wA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9245wA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final C9245wA0 l0;
    public static InterfaceC2792Xs0 m0 = new a();
    public final AbstractC4629fi D;
    public int E;
    public int F;
    public int G;
    public int H;
    public List I;
    public List J;
    public List K;
    public int L;
    public List M;
    public int N;
    public List O;
    public List P;
    public int Q;
    public List R;
    public List S;
    public List T;
    public List U;
    public List V;
    public List W;
    public int X;
    public int Y;
    public KA0 Z;
    public int a0;
    public List b0;
    public int c0;
    public List d0;
    public List e0;
    public int f0;
    public NA0 g0;
    public List h0;
    public QA0 i0;
    public byte j0;
    public int k0;

    /* JADX INFO: renamed from: com.daaw.wA0$a */
    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C9245wA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new C9245wA0(c9687xm, c6763nJ);
        }
    }

    /* JADX INFO: renamed from: com.daaw.wA0$c */
    public enum c implements AbstractC3595c10.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);

        public static AbstractC3595c10.b J = new a();
        public final int B;

        /* JADX INFO: renamed from: com.daaw.wA0$c$a */
        public static class a implements AbstractC3595c10.b {
            @Override // com.daaw.AbstractC3595c10.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public c a(int i) {
                return c.a(i);
            }
        }

        c(int i, int i2) {
            this.B = i2;
        }

        public static c a(int i) {
            switch (i) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // com.daaw.AbstractC3595c10.a
        public final int b() {
            return this.B;
        }
    }

    static {
        C9245wA0 c9245wA0 = new C9245wA0(true);
        l0 = c9245wA0;
        c9245wA0.w1();
    }

    public static C9245wA0 A1(InputStream inputStream, C6763nJ c6763nJ) {
        return (C9245wA0) m0.b(inputStream, c6763nJ);
    }

    public static C9245wA0 C0() {
        return l0;
    }

    private void w1() {
        this.F = 6;
        this.G = 0;
        this.H = 0;
        List list = Collections.EMPTY_LIST;
        this.I = list;
        this.J = list;
        this.K = list;
        this.M = list;
        this.O = list;
        this.P = list;
        this.R = list;
        this.S = list;
        this.T = list;
        this.U = list;
        this.V = list;
        this.W = list;
        this.Y = 0;
        this.Z = KA0.b0();
        this.a0 = 0;
        this.b0 = list;
        this.d0 = list;
        this.e0 = list;
        this.g0 = NA0.z();
        this.h0 = list;
        this.i0 = QA0.x();
    }

    public static b x1() {
        return b.u();
    }

    public static b y1(C9245wA0 c9245wA0) {
        return x1().j(c9245wA0);
    }

    public List A0() {
        return this.P;
    }

    public List B0() {
        return this.O;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: B1, reason: merged with bridge method [inline-methods] */
    public b f() {
        return y1(this);
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public C9245wA0 b() {
        return l0;
    }

    public AA0 E0(int i) {
        return (AA0) this.V.get(i);
    }

    public int F0() {
        return this.V.size();
    }

    public List G0() {
        return this.V;
    }

    public int H0() {
        return this.F;
    }

    public int I0() {
        return this.G;
    }

    public CA0 J0(int i) {
        return (CA0) this.S.get(i);
    }

    public int K0() {
        return this.S.size();
    }

    public List L0() {
        return this.S;
    }

    public int M0() {
        return this.Y;
    }

    public KA0 N0() {
        return this.Z;
    }

    public int O0() {
        return this.a0;
    }

    public int P0() {
        return this.b0.size();
    }

    public List Q0() {
        return this.b0;
    }

    public KA0 R0(int i) {
        return (KA0) this.d0.get(i);
    }

    public int S0() {
        return this.d0.size();
    }

    public int T0() {
        return this.e0.size();
    }

    public List U0() {
        return this.e0;
    }

    public List V0() {
        return this.d0;
    }

    public List W0() {
        return this.M;
    }

    public HA0 X0(int i) {
        return (HA0) this.T.get(i);
    }

    public int Y0() {
        return this.T.size();
    }

    public List Z0() {
        return this.T;
    }

    public List a1() {
        return this.W;
    }

    public KA0 b1(int i) {
        return (KA0) this.J.get(i);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.k0;
        if (i != -1) {
            return i;
        }
        int iO = (this.E & 1) == 1 ? C0343Am.o(1, this.F) : 0;
        int iP = 0;
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            iP += C0343Am.p(((Integer) this.K.get(i2)).intValue());
        }
        int iR = iO + iP;
        if (!d1().isEmpty()) {
            iR = iR + 1 + C0343Am.p(iP);
        }
        this.L = iP;
        if ((this.E & 2) == 2) {
            iR += C0343Am.o(3, this.G);
        }
        if ((this.E & 4) == 4) {
            iR += C0343Am.o(4, this.H);
        }
        for (int i3 = 0; i3 < this.I.size(); i3++) {
            iR += C0343Am.r(5, (InterfaceC2026Qj0) this.I.get(i3));
        }
        for (int i4 = 0; i4 < this.J.size(); i4++) {
            iR += C0343Am.r(6, (InterfaceC2026Qj0) this.J.get(i4));
        }
        int iP2 = 0;
        for (int i5 = 0; i5 < this.M.size(); i5++) {
            iP2 += C0343Am.p(((Integer) this.M.get(i5)).intValue());
        }
        int iR2 = iR + iP2;
        if (!W0().isEmpty()) {
            iR2 = iR2 + 1 + C0343Am.p(iP2);
        }
        this.N = iP2;
        for (int i6 = 0; i6 < this.R.size(); i6++) {
            iR2 += C0343Am.r(8, (InterfaceC2026Qj0) this.R.get(i6));
        }
        for (int i7 = 0; i7 < this.S.size(); i7++) {
            iR2 += C0343Am.r(9, (InterfaceC2026Qj0) this.S.get(i7));
        }
        for (int i8 = 0; i8 < this.T.size(); i8++) {
            iR2 += C0343Am.r(10, (InterfaceC2026Qj0) this.T.get(i8));
        }
        for (int i9 = 0; i9 < this.U.size(); i9++) {
            iR2 += C0343Am.r(11, (InterfaceC2026Qj0) this.U.get(i9));
        }
        for (int i10 = 0; i10 < this.V.size(); i10++) {
            iR2 += C0343Am.r(13, (InterfaceC2026Qj0) this.V.get(i10));
        }
        int iP3 = 0;
        for (int i11 = 0; i11 < this.W.size(); i11++) {
            iP3 += C0343Am.p(((Integer) this.W.get(i11)).intValue());
        }
        int iR3 = iR2 + iP3;
        if (!a1().isEmpty()) {
            iR3 = iR3 + 2 + C0343Am.p(iP3);
        }
        this.X = iP3;
        if ((this.E & 8) == 8) {
            iR3 += C0343Am.o(17, this.Y);
        }
        if ((this.E & 16) == 16) {
            iR3 += C0343Am.r(18, this.Z);
        }
        if ((this.E & 32) == 32) {
            iR3 += C0343Am.o(19, this.a0);
        }
        for (int i12 = 0; i12 < this.O.size(); i12++) {
            iR3 += C0343Am.r(20, (InterfaceC2026Qj0) this.O.get(i12));
        }
        int iP4 = 0;
        for (int i13 = 0; i13 < this.P.size(); i13++) {
            iP4 += C0343Am.p(((Integer) this.P.get(i13)).intValue());
        }
        int iP5 = iR3 + iP4;
        if (!A0().isEmpty()) {
            iP5 = iP5 + 2 + C0343Am.p(iP4);
        }
        this.Q = iP4;
        int iP6 = 0;
        for (int i14 = 0; i14 < this.b0.size(); i14++) {
            iP6 += C0343Am.p(((Integer) this.b0.get(i14)).intValue());
        }
        int iR4 = iP5 + iP6;
        if (!Q0().isEmpty()) {
            iR4 = iR4 + 2 + C0343Am.p(iP6);
        }
        this.c0 = iP6;
        for (int i15 = 0; i15 < this.d0.size(); i15++) {
            iR4 += C0343Am.r(23, (InterfaceC2026Qj0) this.d0.get(i15));
        }
        int iP7 = 0;
        for (int i16 = 0; i16 < this.e0.size(); i16++) {
            iP7 += C0343Am.p(((Integer) this.e0.get(i16)).intValue());
        }
        int iR5 = iR4 + iP7;
        if (!U0().isEmpty()) {
            iR5 = iR5 + 2 + C0343Am.p(iP7);
        }
        this.f0 = iP7;
        if ((this.E & 64) == 64) {
            iR5 += C0343Am.r(30, this.g0);
        }
        int iP8 = 0;
        for (int i17 = 0; i17 < this.h0.size(); i17++) {
            iP8 += C0343Am.p(((Integer) this.h0.get(i17)).intValue());
        }
        int size = iR5 + iP8 + (m1().size() * 2);
        if ((this.E & 128) == 128) {
            size += C0343Am.r(32, this.i0);
        }
        int iW = size + w() + this.D.size();
        this.k0 = iW;
        return iW;
    }

    public int c1() {
        return this.J.size();
    }

    public List d1() {
        return this.K;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.j0;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!q1()) {
            this.j0 = (byte) 0;
            return false;
        }
        for (int i = 0; i < j1(); i++) {
            if (!i1(i).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < c1(); i2++) {
            if (!b1(i2).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < z0(); i3++) {
            if (!y0(i3).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < w0(); i4++) {
            if (!v0(i4).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < K0(); i5++) {
            if (!J0(i5).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < Y0(); i6++) {
            if (!X0(i6).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < g1(); i7++) {
            if (!f1(i7).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < F0(); i8++) {
            if (!E0(i8).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        if (s1() && !N0().e()) {
            this.j0 = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < S0(); i9++) {
            if (!R0(i9).e()) {
                this.j0 = (byte) 0;
                return false;
            }
        }
        if (u1() && !l1().e()) {
            this.j0 = (byte) 0;
            return false;
        }
        if (u()) {
            this.j0 = (byte) 1;
            return true;
        }
        this.j0 = (byte) 0;
        return false;
    }

    public List e1() {
        return this.J;
    }

    public LA0 f1(int i) {
        return (LA0) this.U.get(i);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 1) == 1) {
            c0343Am.Z(1, this.F);
        }
        if (d1().size() > 0) {
            c0343Am.n0(18);
            c0343Am.n0(this.L);
        }
        for (int i = 0; i < this.K.size(); i++) {
            c0343Am.a0(((Integer) this.K.get(i)).intValue());
        }
        if ((this.E & 2) == 2) {
            c0343Am.Z(3, this.G);
        }
        if ((this.E & 4) == 4) {
            c0343Am.Z(4, this.H);
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            c0343Am.c0(5, (InterfaceC2026Qj0) this.I.get(i2));
        }
        for (int i3 = 0; i3 < this.J.size(); i3++) {
            c0343Am.c0(6, (InterfaceC2026Qj0) this.J.get(i3));
        }
        if (W0().size() > 0) {
            c0343Am.n0(58);
            c0343Am.n0(this.N);
        }
        for (int i4 = 0; i4 < this.M.size(); i4++) {
            c0343Am.a0(((Integer) this.M.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.R.size(); i5++) {
            c0343Am.c0(8, (InterfaceC2026Qj0) this.R.get(i5));
        }
        for (int i6 = 0; i6 < this.S.size(); i6++) {
            c0343Am.c0(9, (InterfaceC2026Qj0) this.S.get(i6));
        }
        for (int i7 = 0; i7 < this.T.size(); i7++) {
            c0343Am.c0(10, (InterfaceC2026Qj0) this.T.get(i7));
        }
        for (int i8 = 0; i8 < this.U.size(); i8++) {
            c0343Am.c0(11, (InterfaceC2026Qj0) this.U.get(i8));
        }
        for (int i9 = 0; i9 < this.V.size(); i9++) {
            c0343Am.c0(13, (InterfaceC2026Qj0) this.V.get(i9));
        }
        if (a1().size() > 0) {
            c0343Am.n0(130);
            c0343Am.n0(this.X);
        }
        for (int i10 = 0; i10 < this.W.size(); i10++) {
            c0343Am.a0(((Integer) this.W.get(i10)).intValue());
        }
        if ((this.E & 8) == 8) {
            c0343Am.Z(17, this.Y);
        }
        if ((this.E & 16) == 16) {
            c0343Am.c0(18, this.Z);
        }
        if ((this.E & 32) == 32) {
            c0343Am.Z(19, this.a0);
        }
        for (int i11 = 0; i11 < this.O.size(); i11++) {
            c0343Am.c0(20, (InterfaceC2026Qj0) this.O.get(i11));
        }
        if (A0().size() > 0) {
            c0343Am.n0(170);
            c0343Am.n0(this.Q);
        }
        for (int i12 = 0; i12 < this.P.size(); i12++) {
            c0343Am.a0(((Integer) this.P.get(i12)).intValue());
        }
        if (Q0().size() > 0) {
            c0343Am.n0(178);
            c0343Am.n0(this.c0);
        }
        for (int i13 = 0; i13 < this.b0.size(); i13++) {
            c0343Am.a0(((Integer) this.b0.get(i13)).intValue());
        }
        for (int i14 = 0; i14 < this.d0.size(); i14++) {
            c0343Am.c0(23, (InterfaceC2026Qj0) this.d0.get(i14));
        }
        if (U0().size() > 0) {
            c0343Am.n0(194);
            c0343Am.n0(this.f0);
        }
        for (int i15 = 0; i15 < this.e0.size(); i15++) {
            c0343Am.a0(((Integer) this.e0.get(i15)).intValue());
        }
        if ((this.E & 64) == 64) {
            c0343Am.c0(30, this.g0);
        }
        for (int i16 = 0; i16 < this.h0.size(); i16++) {
            c0343Am.Z(31, ((Integer) this.h0.get(i16)).intValue());
        }
        if ((this.E & 128) == 128) {
            c0343Am.c0(32, this.i0);
        }
        aVarB.a(19000, c0343Am);
        c0343Am.h0(this.D);
    }

    public int g1() {
        return this.U.size();
    }

    public List h1() {
        return this.U;
    }

    public MA0 i1(int i) {
        return (MA0) this.I.get(i);
    }

    public int j1() {
        return this.I.size();
    }

    public List k1() {
        return this.I;
    }

    public NA0 l1() {
        return this.g0;
    }

    public List m1() {
        return this.h0;
    }

    public QA0 n1() {
        return this.i0;
    }

    public boolean o1() {
        return (this.E & 4) == 4;
    }

    public boolean p1() {
        return (this.E & 1) == 1;
    }

    public boolean q1() {
        return (this.E & 2) == 2;
    }

    public boolean r1() {
        return (this.E & 8) == 8;
    }

    public boolean s1() {
        return (this.E & 16) == 16;
    }

    public boolean t1() {
        return (this.E & 32) == 32;
    }

    public int u0() {
        return this.H;
    }

    public boolean u1() {
        return (this.E & 64) == 64;
    }

    public C9524xA0 v0(int i) {
        return (C9524xA0) this.R.get(i);
    }

    public boolean v1() {
        return (this.E & 128) == 128;
    }

    public int w0() {
        return this.R.size();
    }

    public List x0() {
        return this.R;
    }

    public KA0 y0(int i) {
        return (KA0) this.O.get(i);
    }

    public int z0() {
        return this.O.size();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: z1, reason: merged with bridge method [inline-methods] */
    public b d() {
        return x1();
    }

    public C9245wA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.L = -1;
        this.N = -1;
        this.Q = -1;
        this.X = -1;
        this.c0 = -1;
        this.f0 = -1;
        this.j0 = (byte) -1;
        this.k0 = -1;
        this.D = cVar.i();
    }

    public C9245wA0(boolean z) {
        this.L = -1;
        this.N = -1;
        this.Q = -1;
        this.X = -1;
        this.c0 = -1;
        this.f0 = -1;
        this.j0 = (byte) -1;
        this.k0 = -1;
        this.D = AbstractC4629fi.B;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9245wA0(com.daaw.C9687xm r22, com.daaw.C6763nJ r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1758
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9245wA0.<init>(com.daaw.xm, com.daaw.nJ):void");
    }

    /* JADX INFO: renamed from: com.daaw.wA0$b */
    public static final class b extends AbstractC5674jS.c implements InterfaceC2130Rj0 {
        public int E;
        public int F = 6;
        public int G;
        public int H;
        public List I;
        public List J;
        public List K;
        public List L;
        public List M;
        public List N;
        public List O;
        public List P;
        public List Q;
        public List R;
        public List S;
        public List T;
        public int U;
        public KA0 V;
        public int W;
        public List X;
        public List Y;
        public List Z;
        public NA0 a0;
        public List b0;
        public QA0 c0;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.I = list;
            this.J = list;
            this.K = list;
            this.L = list;
            this.M = list;
            this.N = list;
            this.O = list;
            this.P = list;
            this.Q = list;
            this.R = list;
            this.S = list;
            this.T = list;
            this.V = KA0.b0();
            this.X = list;
            this.Y = list;
            this.Z = list;
            this.a0 = NA0.z();
            this.b0 = list;
            this.c0 = QA0.x();
            O();
        }

        public static b u() {
            return new b();
        }

        public final void A() {
            if ((this.E & 262144) != 262144) {
                this.X = new ArrayList(this.X);
                this.E |= 262144;
            }
        }

        public final void B() {
            if ((this.E & 1048576) != 1048576) {
                this.Z = new ArrayList(this.Z);
                this.E |= 1048576;
            }
        }

        public final void C() {
            if ((this.E & 524288) != 524288) {
                this.Y = new ArrayList(this.Y);
                this.E |= 524288;
            }
        }

        public final void D() {
            if ((this.E & 64) != 64) {
                this.L = new ArrayList(this.L);
                this.E |= 64;
            }
        }

        public final void E() {
            if ((this.E & 2048) != 2048) {
                this.Q = new ArrayList(this.Q);
                this.E |= 2048;
            }
        }

        public final void G() {
            if ((this.E & 16384) != 16384) {
                this.T = new ArrayList(this.T);
                this.E |= 16384;
            }
        }

        public final void H() {
            if ((this.E & 32) != 32) {
                this.K = new ArrayList(this.K);
                this.E |= 32;
            }
        }

        public final void J() {
            if ((this.E & 16) != 16) {
                this.J = new ArrayList(this.J);
                this.E |= 16;
            }
        }

        public final void K() {
            if ((this.E & 4096) != 4096) {
                this.R = new ArrayList(this.R);
                this.E |= 4096;
            }
        }

        public final void L() {
            if ((this.E & 8) != 8) {
                this.I = new ArrayList(this.I);
                this.E |= 8;
            }
        }

        public final void M() {
            if ((this.E & 4194304) != 4194304) {
                this.b0 = new ArrayList(this.b0);
                this.E |= 4194304;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.C9245wA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.C9245wA0.m0     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.wA0 r3 = (com.daaw.C9245wA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                if (r3 == 0) goto Le
                r2.j(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                com.daaw.Qj0 r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                com.daaw.wA0 r4 = (com.daaw.C9245wA0) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.j(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9245wA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.wA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: Q, reason: merged with bridge method [inline-methods] */
        public b j(C9245wA0 c9245wA0) {
            if (c9245wA0 == C9245wA0.C0()) {
                return this;
            }
            if (c9245wA0.p1()) {
                X(c9245wA0.H0());
            }
            if (c9245wA0.q1()) {
                Y(c9245wA0.I0());
            }
            if (c9245wA0.o1()) {
                W(c9245wA0.u0());
            }
            if (!c9245wA0.I.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = c9245wA0.I;
                    this.E &= -9;
                } else {
                    L();
                    this.I.addAll(c9245wA0.I);
                }
            }
            if (!c9245wA0.J.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = c9245wA0.J;
                    this.E &= -17;
                } else {
                    J();
                    this.J.addAll(c9245wA0.J);
                }
            }
            if (!c9245wA0.K.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = c9245wA0.K;
                    this.E &= -33;
                } else {
                    H();
                    this.K.addAll(c9245wA0.K);
                }
            }
            if (!c9245wA0.M.isEmpty()) {
                if (this.L.isEmpty()) {
                    this.L = c9245wA0.M;
                    this.E &= -65;
                } else {
                    D();
                    this.L.addAll(c9245wA0.M);
                }
            }
            if (!c9245wA0.O.isEmpty()) {
                if (this.M.isEmpty()) {
                    this.M = c9245wA0.O;
                    this.E &= -129;
                } else {
                    x();
                    this.M.addAll(c9245wA0.O);
                }
            }
            if (!c9245wA0.P.isEmpty()) {
                if (this.N.isEmpty()) {
                    this.N = c9245wA0.P;
                    this.E &= -257;
                } else {
                    w();
                    this.N.addAll(c9245wA0.P);
                }
            }
            if (!c9245wA0.R.isEmpty()) {
                if (this.O.isEmpty()) {
                    this.O = c9245wA0.R;
                    this.E &= -513;
                } else {
                    v();
                    this.O.addAll(c9245wA0.R);
                }
            }
            if (!c9245wA0.S.isEmpty()) {
                if (this.P.isEmpty()) {
                    this.P = c9245wA0.S;
                    this.E &= -1025;
                } else {
                    z();
                    this.P.addAll(c9245wA0.S);
                }
            }
            if (!c9245wA0.T.isEmpty()) {
                if (this.Q.isEmpty()) {
                    this.Q = c9245wA0.T;
                    this.E &= -2049;
                } else {
                    E();
                    this.Q.addAll(c9245wA0.T);
                }
            }
            if (!c9245wA0.U.isEmpty()) {
                if (this.R.isEmpty()) {
                    this.R = c9245wA0.U;
                    this.E &= -4097;
                } else {
                    K();
                    this.R.addAll(c9245wA0.U);
                }
            }
            if (!c9245wA0.V.isEmpty()) {
                if (this.S.isEmpty()) {
                    this.S = c9245wA0.V;
                    this.E &= -8193;
                } else {
                    y();
                    this.S.addAll(c9245wA0.V);
                }
            }
            if (!c9245wA0.W.isEmpty()) {
                if (this.T.isEmpty()) {
                    this.T = c9245wA0.W;
                    this.E &= -16385;
                } else {
                    G();
                    this.T.addAll(c9245wA0.W);
                }
            }
            if (c9245wA0.r1()) {
                Z(c9245wA0.M0());
            }
            if (c9245wA0.s1()) {
                S(c9245wA0.N0());
            }
            if (c9245wA0.t1()) {
                a0(c9245wA0.O0());
            }
            if (!c9245wA0.b0.isEmpty()) {
                if (this.X.isEmpty()) {
                    this.X = c9245wA0.b0;
                    this.E &= -262145;
                } else {
                    A();
                    this.X.addAll(c9245wA0.b0);
                }
            }
            if (!c9245wA0.d0.isEmpty()) {
                if (this.Y.isEmpty()) {
                    this.Y = c9245wA0.d0;
                    this.E &= -524289;
                } else {
                    C();
                    this.Y.addAll(c9245wA0.d0);
                }
            }
            if (!c9245wA0.e0.isEmpty()) {
                if (this.Z.isEmpty()) {
                    this.Z = c9245wA0.e0;
                    this.E &= -1048577;
                } else {
                    B();
                    this.Z.addAll(c9245wA0.e0);
                }
            }
            if (c9245wA0.u1()) {
                T(c9245wA0.l1());
            }
            if (!c9245wA0.h0.isEmpty()) {
                if (this.b0.isEmpty()) {
                    this.b0 = c9245wA0.h0;
                    this.E &= -4194305;
                } else {
                    M();
                    this.b0.addAll(c9245wA0.h0);
                }
            }
            if (c9245wA0.v1()) {
                V(c9245wA0.n1());
            }
            o(c9245wA0);
            k(i().m(c9245wA0.D));
            return this;
        }

        public b S(KA0 ka0) {
            if ((this.E & 65536) != 65536 || this.V == KA0.b0()) {
                this.V = ka0;
            } else {
                this.V = KA0.C0(this.V).j(ka0).r();
            }
            this.E |= 65536;
            return this;
        }

        public b T(NA0 na0) {
            if ((this.E & 2097152) != 2097152 || this.a0 == NA0.z()) {
                this.a0 = na0;
            } else {
                this.a0 = NA0.H(this.a0).j(na0).n();
            }
            this.E |= 2097152;
            return this;
        }

        public b V(QA0 qa0) {
            if ((this.E & 8388608) != 8388608 || this.c0 == QA0.x()) {
                this.c0 = qa0;
            } else {
                this.c0 = QA0.C(this.c0).j(qa0).n();
            }
            this.E |= 8388608;
            return this;
        }

        public b W(int i) {
            this.E |= 4;
            this.H = i;
            return this;
        }

        public b X(int i) {
            this.E |= 1;
            this.F = i;
            return this;
        }

        public b Y(int i) {
            this.E |= 2;
            this.G = i;
            return this;
        }

        public b Z(int i) {
            this.E |= 32768;
            this.U = i;
            return this;
        }

        public b a0(int i) {
            this.E |= 131072;
            this.W = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C9245wA0 a() {
            C9245wA0 c9245wA0R = r();
            if (c9245wA0R.e()) {
                return c9245wA0R;
            }
            throw S.a.h(c9245wA0R);
        }

        public C9245wA0 r() {
            C9245wA0 c9245wA0 = new C9245wA0(this);
            int i = this.E;
            int i2 = (i & 1) != 1 ? 0 : 1;
            c9245wA0.F = this.F;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            c9245wA0.G = this.G;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            c9245wA0.H = this.H;
            if ((this.E & 8) == 8) {
                this.I = DesugarCollections.unmodifiableList(this.I);
                this.E &= -9;
            }
            c9245wA0.I = this.I;
            if ((this.E & 16) == 16) {
                this.J = DesugarCollections.unmodifiableList(this.J);
                this.E &= -17;
            }
            c9245wA0.J = this.J;
            if ((this.E & 32) == 32) {
                this.K = DesugarCollections.unmodifiableList(this.K);
                this.E &= -33;
            }
            c9245wA0.K = this.K;
            if ((this.E & 64) == 64) {
                this.L = DesugarCollections.unmodifiableList(this.L);
                this.E &= -65;
            }
            c9245wA0.M = this.L;
            if ((this.E & 128) == 128) {
                this.M = DesugarCollections.unmodifiableList(this.M);
                this.E &= -129;
            }
            c9245wA0.O = this.M;
            if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                this.N = DesugarCollections.unmodifiableList(this.N);
                this.E &= -257;
            }
            c9245wA0.P = this.N;
            if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                this.O = DesugarCollections.unmodifiableList(this.O);
                this.E &= -513;
            }
            c9245wA0.R = this.O;
            if ((this.E & 1024) == 1024) {
                this.P = DesugarCollections.unmodifiableList(this.P);
                this.E &= -1025;
            }
            c9245wA0.S = this.P;
            if ((this.E & 2048) == 2048) {
                this.Q = DesugarCollections.unmodifiableList(this.Q);
                this.E &= -2049;
            }
            c9245wA0.T = this.Q;
            if ((this.E & 4096) == 4096) {
                this.R = DesugarCollections.unmodifiableList(this.R);
                this.E &= -4097;
            }
            c9245wA0.U = this.R;
            if ((this.E & 8192) == 8192) {
                this.S = DesugarCollections.unmodifiableList(this.S);
                this.E &= -8193;
            }
            c9245wA0.V = this.S;
            if ((this.E & 16384) == 16384) {
                this.T = DesugarCollections.unmodifiableList(this.T);
                this.E &= -16385;
            }
            c9245wA0.W = this.T;
            if ((i & 32768) == 32768) {
                i2 |= 8;
            }
            c9245wA0.Y = this.U;
            if ((i & 65536) == 65536) {
                i2 |= 16;
            }
            c9245wA0.Z = this.V;
            if ((i & 131072) == 131072) {
                i2 |= 32;
            }
            c9245wA0.a0 = this.W;
            if ((this.E & 262144) == 262144) {
                this.X = DesugarCollections.unmodifiableList(this.X);
                this.E &= -262145;
            }
            c9245wA0.b0 = this.X;
            if ((this.E & 524288) == 524288) {
                this.Y = DesugarCollections.unmodifiableList(this.Y);
                this.E &= -524289;
            }
            c9245wA0.d0 = this.Y;
            if ((this.E & 1048576) == 1048576) {
                this.Z = DesugarCollections.unmodifiableList(this.Z);
                this.E &= -1048577;
            }
            c9245wA0.e0 = this.Z;
            if ((i & 2097152) == 2097152) {
                i2 |= 64;
            }
            c9245wA0.g0 = this.a0;
            if ((this.E & 4194304) == 4194304) {
                this.b0 = DesugarCollections.unmodifiableList(this.b0);
                this.E &= -4194305;
            }
            c9245wA0.h0 = this.b0;
            if ((i & 8388608) == 8388608) {
                i2 |= 128;
            }
            c9245wA0.i0 = this.c0;
            c9245wA0.E = i2;
            return c9245wA0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        public final void v() {
            if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) != 512) {
                this.O = new ArrayList(this.O);
                this.E |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
        }

        public final void w() {
            if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 256) {
                this.N = new ArrayList(this.N);
                this.E |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
        }

        public final void x() {
            if ((this.E & 128) != 128) {
                this.M = new ArrayList(this.M);
                this.E |= 128;
            }
        }

        public final void y() {
            if ((this.E & 8192) != 8192) {
                this.S = new ArrayList(this.S);
                this.E |= 8192;
            }
        }

        public final void z() {
            if ((this.E & 1024) != 1024) {
                this.P = new ArrayList(this.P);
                this.E |= 1024;
            }
        }

        private void O() {
        }
    }
}
