package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.KA0;
import com.daaw.S;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class OA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final OA0 N;
    public static InterfaceC2792Xs0 O = new a();
    public final AbstractC4629fi D;
    public int E;
    public int F;
    public int G;
    public KA0 H;
    public int I;
    public KA0 J;
    public int K;
    public byte L;
    public int M;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public OA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new OA0(c9687xm, c6763nJ);
        }
    }

    static {
        OA0 oa0 = new OA0(true);
        N = oa0;
        oa0.a0();
    }

    public static OA0 L() {
        return N;
    }

    private void a0() {
        this.F = 0;
        this.G = 0;
        this.H = KA0.b0();
        this.I = 0;
        this.J = KA0.b0();
        this.K = 0;
    }

    public static b b0() {
        return b.u();
    }

    public static b c0(OA0 oa0) {
        return b0().j(oa0);
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public OA0 b() {
        return N;
    }

    public int O() {
        return this.F;
    }

    public int P() {
        return this.G;
    }

    public KA0 Q() {
        return this.H;
    }

    public int R() {
        return this.I;
    }

    public KA0 S() {
        return this.J;
    }

    public int T() {
        return this.K;
    }

    public boolean U() {
        return (this.E & 1) == 1;
    }

    public boolean V() {
        return (this.E & 2) == 2;
    }

    public boolean W() {
        return (this.E & 4) == 4;
    }

    public boolean X() {
        return (this.E & 8) == 8;
    }

    public boolean Y() {
        return (this.E & 16) == 16;
    }

    public boolean Z() {
        return (this.E & 32) == 32;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.M;
        if (i != -1) {
            return i;
        }
        int iO = (this.E & 1) == 1 ? C0343Am.o(1, this.F) : 0;
        if ((this.E & 2) == 2) {
            iO += C0343Am.o(2, this.G);
        }
        if ((this.E & 4) == 4) {
            iO += C0343Am.r(3, this.H);
        }
        if ((this.E & 16) == 16) {
            iO += C0343Am.r(4, this.J);
        }
        if ((this.E & 8) == 8) {
            iO += C0343Am.o(5, this.I);
        }
        if ((this.E & 32) == 32) {
            iO += C0343Am.o(6, this.K);
        }
        int iW = iO + w() + this.D.size();
        this.M = iW;
        return iW;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: d0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return b0();
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.L;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!V()) {
            this.L = (byte) 0;
            return false;
        }
        if (W() && !Q().e()) {
            this.L = (byte) 0;
            return false;
        }
        if (Y() && !S().e()) {
            this.L = (byte) 0;
            return false;
        }
        if (u()) {
            this.L = (byte) 1;
            return true;
        }
        this.L = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return c0(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 1) == 1) {
            c0343Am.Z(1, this.F);
        }
        if ((this.E & 2) == 2) {
            c0343Am.Z(2, this.G);
        }
        if ((this.E & 4) == 4) {
            c0343Am.c0(3, this.H);
        }
        if ((this.E & 16) == 16) {
            c0343Am.c0(4, this.J);
        }
        if ((this.E & 8) == 8) {
            c0343Am.Z(5, this.I);
        }
        if ((this.E & 32) == 32) {
            c0343Am.Z(6, this.K);
        }
        aVarB.a(RCHTTPStatusCodes.SUCCESS, c0343Am);
        c0343Am.h0(this.D);
    }

    public OA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.L = (byte) -1;
        this.M = -1;
        this.D = cVar.i();
    }

    public OA0(boolean z) {
        this.L = (byte) -1;
        this.M = -1;
        this.D = AbstractC4629fi.B;
    }

    public OA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        KA0.c cVarF;
        this.L = (byte) -1;
        this.M = -1;
        a0();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.E |= 1;
                            this.F = c9687xm.r();
                        } else if (iJ != 16) {
                            if (iJ == 26) {
                                cVarF = (this.E & 4) == 4 ? this.H.f() : null;
                                KA0 ka0 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                                this.H = ka0;
                                if (cVarF != null) {
                                    cVarF.j(ka0);
                                    this.H = cVarF.r();
                                }
                                this.E |= 4;
                            } else if (iJ == 34) {
                                cVarF = (this.E & 16) == 16 ? this.J.f() : null;
                                KA0 ka02 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                                this.J = ka02;
                                if (cVarF != null) {
                                    cVarF.j(ka02);
                                    this.J = cVarF.r();
                                }
                                this.E |= 16;
                            } else if (iJ == 40) {
                                this.E |= 8;
                                this.I = c9687xm.r();
                            } else if (iJ != 48) {
                                if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                }
                            } else {
                                this.E |= 32;
                                this.K = c9687xm.r();
                            }
                        } else {
                            this.E |= 2;
                            this.G = c9687xm.r();
                        }
                    }
                    z = true;
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
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

    public static final class b extends AbstractC5674jS.c implements InterfaceC2130Rj0 {
        public int E;
        public int F;
        public int G;
        public int I;
        public int K;
        public KA0 H = KA0.b0();
        public KA0 J = KA0.b0();

        public b() {
            v();
        }

        public static b u() {
            return new b();
        }

        public b A(int i) {
            this.E |= 1;
            this.F = i;
            return this;
        }

        public b B(int i) {
            this.E |= 2;
            this.G = i;
            return this;
        }

        public b C(int i) {
            this.E |= 8;
            this.I = i;
            return this;
        }

        public b D(int i) {
            this.E |= 32;
            this.K = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public OA0 a() {
            OA0 oa0R = r();
            if (oa0R.e()) {
                return oa0R;
            }
            throw S.a.h(oa0R);
        }

        public OA0 r() {
            OA0 oa0 = new OA0(this);
            int i = this.E;
            int i2 = (i & 1) != 1 ? 0 : 1;
            oa0.F = this.F;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            oa0.G = this.G;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            oa0.H = this.H;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            oa0.I = this.I;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            oa0.J = this.J;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            oa0.K = this.K;
            oa0.E = i2;
            return oa0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.OA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.OA0.O     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.OA0 r3 = (com.daaw.OA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.OA0 r4 = (com.daaw.OA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.OA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.OA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public b j(OA0 oa0) {
            if (oa0 == OA0.L()) {
                return this;
            }
            if (oa0.U()) {
                A(oa0.O());
            }
            if (oa0.V()) {
                B(oa0.P());
            }
            if (oa0.W()) {
                y(oa0.Q());
            }
            if (oa0.X()) {
                C(oa0.R());
            }
            if (oa0.Y()) {
                z(oa0.S());
            }
            if (oa0.Z()) {
                D(oa0.T());
            }
            o(oa0);
            k(i().m(oa0.D));
            return this;
        }

        public b y(KA0 ka0) {
            if ((this.E & 4) != 4 || this.H == KA0.b0()) {
                this.H = ka0;
            } else {
                this.H = KA0.C0(this.H).j(ka0).r();
            }
            this.E |= 4;
            return this;
        }

        public b z(KA0 ka0) {
            if ((this.E & 16) != 16 || this.J == KA0.b0()) {
                this.J = ka0;
            } else {
                this.J = KA0.C0(this.J).j(ka0).r();
            }
            this.E |= 16;
            return this;
        }

        private void v() {
        }
    }
}
