package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import com.google.android.gms.ads.AdRequest;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes4.dex */
public final class KA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final KA0 V;
    public static InterfaceC2792Xs0 W = new a();
    public final AbstractC4629fi D;
    public int E;
    public List F;
    public boolean G;
    public int H;
    public KA0 I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public KA0 O;
    public int P;
    public KA0 Q;
    public int R;
    public int S;
    public byte T;
    public int U;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public KA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new KA0(c9687xm, c6763nJ);
        }
    }

    static {
        KA0 ka0 = new KA0(true);
        V = ka0;
        ka0.A0();
    }

    private void A0() {
        this.F = Collections.EMPTY_LIST;
        this.G = false;
        this.H = 0;
        this.I = b0();
        this.J = 0;
        this.K = 0;
        this.L = 0;
        this.M = 0;
        this.N = 0;
        this.O = b0();
        this.P = 0;
        this.Q = b0();
        this.R = 0;
        this.S = 0;
    }

    public static c B0() {
        return c.u();
    }

    public static c C0(KA0 ka0) {
        return B0().j(ka0);
    }

    public static KA0 b0() {
        return V;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public c d() {
        return B0();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: E0, reason: merged with bridge method [inline-methods] */
    public c f() {
        return C0(this);
    }

    public KA0 V() {
        return this.Q;
    }

    public int W() {
        return this.R;
    }

    public b X(int i) {
        return (b) this.F.get(i);
    }

    public int Y() {
        return this.F.size();
    }

    public List Z() {
        return this.F;
    }

    public int a0() {
        return this.K;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.U;
        if (i != -1) {
            return i;
        }
        int iO = (this.E & 4096) == 4096 ? C0343Am.o(1, this.S) : 0;
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            iO += C0343Am.r(2, (InterfaceC2026Qj0) this.F.get(i2));
        }
        if ((this.E & 1) == 1) {
            iO += C0343Am.a(3, this.G);
        }
        if ((this.E & 2) == 2) {
            iO += C0343Am.o(4, this.H);
        }
        if ((this.E & 4) == 4) {
            iO += C0343Am.r(5, this.I);
        }
        if ((this.E & 16) == 16) {
            iO += C0343Am.o(6, this.K);
        }
        if ((this.E & 32) == 32) {
            iO += C0343Am.o(7, this.L);
        }
        if ((this.E & 8) == 8) {
            iO += C0343Am.o(8, this.J);
        }
        if ((this.E & 64) == 64) {
            iO += C0343Am.o(9, this.M);
        }
        if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            iO += C0343Am.r(10, this.O);
        }
        if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            iO += C0343Am.o(11, this.P);
        }
        if ((this.E & 128) == 128) {
            iO += C0343Am.o(12, this.N);
        }
        if ((this.E & 1024) == 1024) {
            iO += C0343Am.r(13, this.Q);
        }
        if ((this.E & 2048) == 2048) {
            iO += C0343Am.o(14, this.R);
        }
        int iW = iO + w() + this.D.size();
        this.U = iW;
        return iW;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public KA0 b() {
        return V;
    }

    public int d0() {
        return this.S;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.T;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < Y(); i++) {
            if (!X(i).e()) {
                this.T = (byte) 0;
                return false;
            }
        }
        if (s0() && !f0().e()) {
            this.T = (byte) 0;
            return false;
        }
        if (v0() && !i0().e()) {
            this.T = (byte) 0;
            return false;
        }
        if (n0() && !V().e()) {
            this.T = (byte) 0;
            return false;
        }
        if (u()) {
            this.T = (byte) 1;
            return true;
        }
        this.T = (byte) 0;
        return false;
    }

    public int e0() {
        return this.H;
    }

    public KA0 f0() {
        return this.I;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 4096) == 4096) {
            c0343Am.Z(1, this.S);
        }
        for (int i = 0; i < this.F.size(); i++) {
            c0343Am.c0(2, (InterfaceC2026Qj0) this.F.get(i));
        }
        if ((this.E & 1) == 1) {
            c0343Am.K(3, this.G);
        }
        if ((this.E & 2) == 2) {
            c0343Am.Z(4, this.H);
        }
        if ((this.E & 4) == 4) {
            c0343Am.c0(5, this.I);
        }
        if ((this.E & 16) == 16) {
            c0343Am.Z(6, this.K);
        }
        if ((this.E & 32) == 32) {
            c0343Am.Z(7, this.L);
        }
        if ((this.E & 8) == 8) {
            c0343Am.Z(8, this.J);
        }
        if ((this.E & 64) == 64) {
            c0343Am.Z(9, this.M);
        }
        if ((this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
            c0343Am.c0(10, this.O);
        }
        if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
            c0343Am.Z(11, this.P);
        }
        if ((this.E & 128) == 128) {
            c0343Am.Z(12, this.N);
        }
        if ((this.E & 1024) == 1024) {
            c0343Am.c0(13, this.Q);
        }
        if ((this.E & 2048) == 2048) {
            c0343Am.Z(14, this.R);
        }
        aVarB.a(RCHTTPStatusCodes.SUCCESS, c0343Am);
        c0343Am.h0(this.D);
    }

    public int g0() {
        return this.J;
    }

    public boolean h0() {
        return this.G;
    }

    public KA0 i0() {
        return this.O;
    }

    public int j0() {
        return this.P;
    }

    public int k0() {
        return this.N;
    }

    public int l0() {
        return this.L;
    }

    public int m0() {
        return this.M;
    }

    public boolean n0() {
        return (this.E & 1024) == 1024;
    }

    public boolean o0() {
        return (this.E & 2048) == 2048;
    }

    public boolean p0() {
        return (this.E & 16) == 16;
    }

    public boolean q0() {
        return (this.E & 4096) == 4096;
    }

    public boolean r0() {
        return (this.E & 2) == 2;
    }

    public boolean s0() {
        return (this.E & 4) == 4;
    }

    public boolean t0() {
        return (this.E & 8) == 8;
    }

    public boolean u0() {
        return (this.E & 1) == 1;
    }

    public boolean v0() {
        return (this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256;
    }

    public boolean w0() {
        return (this.E & AdRequest.MAX_CONTENT_URL_LENGTH) == 512;
    }

    public boolean x0() {
        return (this.E & 128) == 128;
    }

    public boolean y0() {
        return (this.E & 32) == 32;
    }

    public boolean z0() {
        return (this.E & 64) == 64;
    }

    public static final class b extends AbstractC5674jS implements InterfaceC2130Rj0 {
        public static final b J;
        public static InterfaceC2792Xs0 K = new a();
        public final AbstractC4629fi C;
        public int D;
        public c E;
        public KA0 F;
        public int G;
        public byte H;
        public int I;

        public static class a extends Z {
            @Override // com.daaw.InterfaceC2792Xs0
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public b c(C9687xm c9687xm, C6763nJ c6763nJ) {
                return new b(c9687xm, c6763nJ);
            }
        }

        public enum c implements AbstractC3595c10.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);

            public static AbstractC3595c10.b G = new a();
            public final int B;

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
                if (i == 0) {
                    return IN;
                }
                if (i == 1) {
                    return OUT;
                }
                if (i == 2) {
                    return INV;
                }
                if (i != 3) {
                    return null;
                }
                return STAR;
            }

            @Override // com.daaw.AbstractC3595c10.a
            public final int b() {
                return this.B;
            }
        }

        static {
            b bVar = new b(true);
            J = bVar;
            bVar.G();
        }

        private void G() {
            this.E = c.INV;
            this.F = KA0.b0();
            this.G = 0;
        }

        public static C0087b H() {
            return C0087b.p();
        }

        public static C0087b I(b bVar) {
            return H().j(bVar);
        }

        public static b z() {
            return J;
        }

        public c A() {
            return this.E;
        }

        public KA0 B() {
            return this.F;
        }

        public int C() {
            return this.G;
        }

        public boolean D() {
            return (this.D & 1) == 1;
        }

        public boolean E() {
            return (this.D & 2) == 2;
        }

        public boolean F() {
            return (this.D & 4) == 4;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
        public C0087b d() {
            return H();
        }

        @Override // com.daaw.InterfaceC2026Qj0
        /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
        public C0087b f() {
            return I(this);
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public int c() {
            int i = this.I;
            if (i != -1) {
                return i;
            }
            int iH = (this.D & 1) == 1 ? C0343Am.h(1, this.E.b()) : 0;
            if ((this.D & 2) == 2) {
                iH += C0343Am.r(2, this.F);
            }
            if ((this.D & 4) == 4) {
                iH += C0343Am.o(3, this.G);
            }
            int size = iH + this.C.size();
            this.I = size;
            return size;
        }

        @Override // com.daaw.InterfaceC2130Rj0
        public final boolean e() {
            byte b = this.H;
            if (b == 1) {
                return true;
            }
            if (b == 0) {
                return false;
            }
            if (!E() || B().e()) {
                this.H = (byte) 1;
                return true;
            }
            this.H = (byte) 0;
            return false;
        }

        @Override // com.daaw.InterfaceC2026Qj0
        public void g(C0343Am c0343Am) throws IOException {
            c();
            if ((this.D & 1) == 1) {
                c0343Am.R(1, this.E.b());
            }
            if ((this.D & 2) == 2) {
                c0343Am.c0(2, this.F);
            }
            if ((this.D & 4) == 4) {
                c0343Am.Z(3, this.G);
            }
            c0343Am.h0(this.C);
        }

        public b(AbstractC5674jS.b bVar) {
            super(bVar);
            this.H = (byte) -1;
            this.I = -1;
            this.C = bVar.i();
        }

        public b(boolean z) {
            this.H = (byte) -1;
            this.I = -1;
            this.C = AbstractC4629fi.B;
        }

        public b(C9687xm c9687xm, C6763nJ c6763nJ) {
            this.H = (byte) -1;
            this.I = -1;
            G();
            AbstractC4629fi.b bVarG = AbstractC4629fi.G();
            C0343Am c0343AmI = C0343Am.I(bVarG, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        try {
                            int iJ = c9687xm.J();
                            if (iJ != 0) {
                                if (iJ == 8) {
                                    int iM = c9687xm.m();
                                    c cVarA = c.a(iM);
                                    if (cVarA == null) {
                                        c0343AmI.n0(iJ);
                                        c0343AmI.n0(iM);
                                    } else {
                                        this.D |= 1;
                                        this.E = cVarA;
                                    }
                                } else if (iJ == 18) {
                                    c cVarF = (this.D & 2) == 2 ? this.F.f() : null;
                                    KA0 ka0 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                                    this.F = ka0;
                                    if (cVarF != null) {
                                        cVarF.j(ka0);
                                        this.F = cVarF.r();
                                    }
                                    this.D |= 2;
                                } else if (iJ != 24) {
                                    if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                    }
                                } else {
                                    this.D |= 4;
                                    this.G = c9687xm.r();
                                }
                            }
                            z = true;
                        } catch (Q10 e) {
                            throw e.i(this);
                        }
                    } catch (IOException e2) {
                        throw new Q10(e2.getMessage()).i(this);
                    }
                } catch (Throwable th) {
                    try {
                        c0343AmI.H();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.C = bVarG.l();
                        throw th2;
                    }
                    this.C = bVarG.l();
                    n();
                    throw th;
                }
            }
            try {
                c0343AmI.H();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.C = bVarG.l();
                throw th3;
            }
            this.C = bVarG.l();
            n();
        }

        /* JADX INFO: renamed from: com.daaw.KA0$b$b, reason: collision with other inner class name */
        public static final class C0087b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
            public int C;
            public c D = c.INV;
            public KA0 E = KA0.b0();
            public int F;

            public C0087b() {
                q();
            }

            public static C0087b p() {
                return new C0087b();
            }

            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
            public b a() {
                b bVarN = n();
                if (bVarN.e()) {
                    return bVarN;
                }
                throw S.a.h(bVarN);
            }

            public b n() {
                b bVar = new b(this);
                int i = this.C;
                int i2 = (i & 1) != 1 ? 0 : 1;
                bVar.E = this.D;
                if ((i & 2) == 2) {
                    i2 |= 2;
                }
                bVar.F = this.E;
                if ((i & 4) == 4) {
                    i2 |= 4;
                }
                bVar.G = this.F;
                bVar.D = i2;
                return bVar;
            }

            /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
            public C0087b clone() {
                return p().j(n());
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // com.daaw.InterfaceC2026Qj0.a
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public com.daaw.KA0.b.C0087b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    com.daaw.Xs0 r1 = com.daaw.KA0.b.K     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                    com.daaw.KA0$b r3 = (com.daaw.KA0.b) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                    com.daaw.KA0$b r4 = (com.daaw.KA0.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: com.daaw.KA0.b.C0087b.N(com.daaw.xm, com.daaw.nJ):com.daaw.KA0$b$b");
            }

            @Override // com.daaw.AbstractC5674jS.b
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public C0087b j(b bVar) {
                if (bVar == b.z()) {
                    return this;
                }
                if (bVar.D()) {
                    v(bVar.A());
                }
                if (bVar.E()) {
                    u(bVar.B());
                }
                if (bVar.F()) {
                    w(bVar.C());
                }
                k(i().m(bVar.C));
                return this;
            }

            public C0087b u(KA0 ka0) {
                if ((this.C & 2) != 2 || this.E == KA0.b0()) {
                    this.E = ka0;
                } else {
                    this.E = KA0.C0(this.E).j(ka0).r();
                }
                this.C |= 2;
                return this;
            }

            public C0087b v(c cVar) {
                cVar.getClass();
                this.C |= 1;
                this.D = cVar;
                return this;
            }

            public C0087b w(int i) {
                this.C |= 4;
                this.F = i;
                return this;
            }

            private void q() {
            }
        }
    }

    public KA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.T = (byte) -1;
        this.U = -1;
        this.D = cVar.i();
    }

    public KA0(boolean z) {
        this.T = (byte) -1;
        this.U = -1;
        this.D = AbstractC4629fi.B;
    }

    public KA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        c cVarF;
        this.T = (byte) -1;
        this.U = -1;
        A0();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    switch (iJ) {
                        case 0:
                            z = true;
                            break;
                        case 8:
                            this.E |= 4096;
                            this.S = c9687xm.r();
                            break;
                        case C6564mc1.BYTES_VALUE_FIELD_NUMBER /* 18 */:
                            if (!z2) {
                                this.F = new ArrayList();
                                z2 = true;
                            }
                            this.F.add(c9687xm.t(b.K, c6763nJ));
                            break;
                        case 24:
                            this.E |= 1;
                            this.G = c9687xm.j();
                            break;
                        case 32:
                            this.E |= 2;
                            this.H = c9687xm.r();
                            break;
                        case 42:
                            cVarF = (this.E & 4) == 4 ? this.I.f() : null;
                            KA0 ka0 = (KA0) c9687xm.t(W, c6763nJ);
                            this.I = ka0;
                            if (cVarF != null) {
                                cVarF.j(ka0);
                                this.I = cVarF.r();
                            }
                            this.E |= 4;
                            break;
                        case 48:
                            this.E |= 16;
                            this.K = c9687xm.r();
                            break;
                        case 56:
                            this.E |= 32;
                            this.L = c9687xm.r();
                            break;
                        case 64:
                            this.E |= 8;
                            this.J = c9687xm.r();
                            break;
                        case 72:
                            this.E |= 64;
                            this.M = c9687xm.r();
                            break;
                        case 82:
                            cVarF = (this.E & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256 ? this.O.f() : null;
                            KA0 ka02 = (KA0) c9687xm.t(W, c6763nJ);
                            this.O = ka02;
                            if (cVarF != null) {
                                cVarF.j(ka02);
                                this.O = cVarF.r();
                            }
                            this.E |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
                            break;
                        case 88:
                            this.E |= AdRequest.MAX_CONTENT_URL_LENGTH;
                            this.P = c9687xm.r();
                            break;
                        case 96:
                            this.E |= 128;
                            this.N = c9687xm.r();
                            break;
                        case 106:
                            cVarF = (this.E & 1024) == 1024 ? this.Q.f() : null;
                            KA0 ka03 = (KA0) c9687xm.t(W, c6763nJ);
                            this.Q = ka03;
                            if (cVarF != null) {
                                cVarF.j(ka03);
                                this.Q = cVarF.r();
                            }
                            this.E |= 1024;
                            break;
                        case 112:
                            this.E |= 2048;
                            this.R = c9687xm.r();
                            break;
                        default:
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                z = true;
                            }
                            break;
                    }
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (z2) {
                    this.F = DesugarCollections.unmodifiableList(this.F);
                }
                try {
                    c0343AmI.H();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.D = bVarG.l();
                    throw th2;
                }
                this.D = bVarG.l();
                n();
                throw th;
            }
        }
        if (z2) {
            this.F = DesugarCollections.unmodifiableList(this.F);
        }
        try {
            c0343AmI.H();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.D = bVarG.l();
            throw th3;
        }
        this.D = bVarG.l();
        n();
    }

    public static final class c extends AbstractC5674jS.c implements InterfaceC2130Rj0 {
        public int E;
        public boolean G;
        public int H;
        public int J;
        public int K;
        public int L;
        public int M;
        public int N;
        public int P;
        public int R;
        public int S;
        public List F = Collections.EMPTY_LIST;
        public KA0 I = KA0.b0();
        public KA0 O = KA0.b0();
        public KA0 Q = KA0.b0();

        public c() {
            w();
        }

        public static c u() {
            return new c();
        }

        private void v() {
            if ((this.E & 1) != 1) {
                this.F = new ArrayList(this.F);
                this.E |= 1;
            }
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public c j(KA0 ka0) {
            if (ka0 == KA0.b0()) {
                return this;
            }
            if (!ka0.F.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = ka0.F;
                    this.E &= -2;
                } else {
                    v();
                    this.F.addAll(ka0.F);
                }
            }
            if (ka0.u0()) {
                J(ka0.h0());
            }
            if (ka0.r0()) {
                G(ka0.e0());
            }
            if (ka0.s0()) {
                y(ka0.f0());
            }
            if (ka0.t0()) {
                H(ka0.g0());
            }
            if (ka0.p0()) {
                D(ka0.a0());
            }
            if (ka0.y0()) {
                M(ka0.l0());
            }
            if (ka0.z0()) {
                O(ka0.m0());
            }
            if (ka0.x0()) {
                L(ka0.k0());
            }
            if (ka0.v0()) {
                B(ka0.i0());
            }
            if (ka0.w0()) {
                K(ka0.j0());
            }
            if (ka0.n0()) {
                x(ka0.V());
            }
            if (ka0.o0()) {
                C(ka0.W());
            }
            if (ka0.q0()) {
                E(ka0.d0());
            }
            o(ka0);
            k(i().m(ka0.D));
            return this;
        }

        public c B(KA0 ka0) {
            if ((this.E & AdRequest.MAX_CONTENT_URL_LENGTH) != 512 || this.O == KA0.b0()) {
                this.O = ka0;
            } else {
                this.O = KA0.C0(this.O).j(ka0).r();
            }
            this.E |= AdRequest.MAX_CONTENT_URL_LENGTH;
            return this;
        }

        public c C(int i) {
            this.E |= 4096;
            this.R = i;
            return this;
        }

        public c D(int i) {
            this.E |= 32;
            this.K = i;
            return this;
        }

        public c E(int i) {
            this.E |= 8192;
            this.S = i;
            return this;
        }

        public c G(int i) {
            this.E |= 4;
            this.H = i;
            return this;
        }

        public c H(int i) {
            this.E |= 16;
            this.J = i;
            return this;
        }

        public c J(boolean z) {
            this.E |= 2;
            this.G = z;
            return this;
        }

        public c K(int i) {
            this.E |= 1024;
            this.P = i;
            return this;
        }

        public c L(int i) {
            this.E |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            this.N = i;
            return this;
        }

        public c M(int i) {
            this.E |= 64;
            this.L = i;
            return this;
        }

        public c O(int i) {
            this.E |= 128;
            this.M = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public KA0 a() {
            KA0 ka0R = r();
            if (ka0R.e()) {
                return ka0R;
            }
            throw S.a.h(ka0R);
        }

        public KA0 r() {
            KA0 ka0 = new KA0(this);
            int i = this.E;
            if ((i & 1) == 1) {
                this.F = DesugarCollections.unmodifiableList(this.F);
                this.E &= -2;
            }
            ka0.F = this.F;
            int i2 = (i & 2) != 2 ? 0 : 1;
            ka0.G = this.G;
            if ((i & 4) == 4) {
                i2 |= 2;
            }
            ka0.H = this.H;
            if ((i & 8) == 8) {
                i2 |= 4;
            }
            ka0.I = this.I;
            if ((i & 16) == 16) {
                i2 |= 8;
            }
            ka0.J = this.J;
            if ((i & 32) == 32) {
                i2 |= 16;
            }
            ka0.K = this.K;
            if ((i & 64) == 64) {
                i2 |= 32;
            }
            ka0.L = this.L;
            if ((i & 128) == 128) {
                i2 |= 64;
            }
            ka0.M = this.M;
            if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 256) {
                i2 |= 128;
            }
            ka0.N = this.N;
            if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) == 512) {
                i2 |= PSKKeyManager.MAX_KEY_LENGTH_BYTES;
            }
            ka0.O = this.O;
            if ((i & 1024) == 1024) {
                i2 |= AdRequest.MAX_CONTENT_URL_LENGTH;
            }
            ka0.P = this.P;
            if ((i & 2048) == 2048) {
                i2 |= 1024;
            }
            ka0.Q = this.Q;
            if ((i & 4096) == 4096) {
                i2 |= 2048;
            }
            ka0.R = this.R;
            if ((i & 8192) == 8192) {
                i2 |= 4096;
            }
            ka0.S = this.S;
            ka0.E = i2;
            return ka0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public c clone() {
            return u().j(r());
        }

        public c x(KA0 ka0) {
            if ((this.E & 2048) != 2048 || this.Q == KA0.b0()) {
                this.Q = ka0;
            } else {
                this.Q = KA0.C0(this.Q).j(ka0).r();
            }
            this.E |= 2048;
            return this;
        }

        public c y(KA0 ka0) {
            if ((this.E & 8) != 8 || this.I == KA0.b0()) {
                this.I = ka0;
            } else {
                this.I = KA0.C0(this.I).j(ka0).r();
            }
            this.E |= 8;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.KA0.c N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.KA0.W     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.KA0 r3 = (com.daaw.KA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.KA0 r4 = (com.daaw.KA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.KA0.c.N(com.daaw.xm, com.daaw.nJ):com.daaw.KA0$c");
        }

        private void w() {
        }
    }
}
