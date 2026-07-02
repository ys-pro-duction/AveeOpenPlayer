package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class PA0 extends AbstractC5674jS implements InterfaceC2130Rj0 {
    public static final PA0 M;
    public static InterfaceC2792Xs0 N = new a();
    public final AbstractC4629fi C;
    public int D;
    public int E;
    public int F;
    public c G;
    public int H;
    public int I;
    public d J;
    public byte K;
    public int L;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public PA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new PA0(c9687xm, c6763nJ);
        }
    }

    public enum c implements AbstractC3595c10.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);

        public static AbstractC3595c10.b F = new a();
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
                return WARNING;
            }
            if (i == 1) {
                return ERROR;
            }
            if (i != 2) {
                return null;
            }
            return HIDDEN;
        }

        @Override // com.daaw.AbstractC3595c10.a
        public final int b() {
            return this.B;
        }
    }

    public enum d implements AbstractC3595c10.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);

        public static AbstractC3595c10.b F = new a();
        public final int B;

        public static class a implements AbstractC3595c10.b {
            @Override // com.daaw.AbstractC3595c10.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public d a(int i) {
                return d.a(i);
            }
        }

        d(int i, int i2) {
            this.B = i2;
        }

        public static d a(int i) {
            if (i == 0) {
                return LANGUAGE_VERSION;
            }
            if (i == 1) {
                return COMPILER_VERSION;
            }
            if (i != 2) {
                return null;
            }
            return API_VERSION;
        }

        @Override // com.daaw.AbstractC3595c10.a
        public final int b() {
            return this.B;
        }
    }

    static {
        PA0 pa0 = new PA0(true);
        M = pa0;
        pa0.Q();
    }

    public static PA0 C() {
        return M;
    }

    private void Q() {
        this.E = 0;
        this.F = 0;
        this.G = c.ERROR;
        this.H = 0;
        this.I = 0;
        this.J = d.LANGUAGE_VERSION;
    }

    public static b R() {
        return b.p();
    }

    public static b S(PA0 pa0) {
        return R().j(pa0);
    }

    public int D() {
        return this.H;
    }

    public c E() {
        return this.G;
    }

    public int F() {
        return this.I;
    }

    public int G() {
        return this.E;
    }

    public int H() {
        return this.F;
    }

    public d I() {
        return this.J;
    }

    public boolean J() {
        return (this.D & 8) == 8;
    }

    public boolean K() {
        return (this.D & 4) == 4;
    }

    public boolean L() {
        return (this.D & 16) == 16;
    }

    public boolean M() {
        return (this.D & 1) == 1;
    }

    public boolean O() {
        return (this.D & 2) == 2;
    }

    public boolean P() {
        return (this.D & 32) == 32;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public b d() {
        return R();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: U, reason: merged with bridge method [inline-methods] */
    public b f() {
        return S(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int iO = (this.D & 1) == 1 ? C0343Am.o(1, this.E) : 0;
        if ((this.D & 2) == 2) {
            iO += C0343Am.o(2, this.F);
        }
        if ((this.D & 4) == 4) {
            iO += C0343Am.h(3, this.G.b());
        }
        if ((this.D & 8) == 8) {
            iO += C0343Am.o(4, this.H);
        }
        if ((this.D & 16) == 16) {
            iO += C0343Am.o(5, this.I);
        }
        if ((this.D & 32) == 32) {
            iO += C0343Am.h(6, this.J.b());
        }
        int size = iO + this.C.size();
        this.L = size;
        return size;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.K;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.K = (byte) 1;
        return true;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        if ((this.D & 1) == 1) {
            c0343Am.Z(1, this.E);
        }
        if ((this.D & 2) == 2) {
            c0343Am.Z(2, this.F);
        }
        if ((this.D & 4) == 4) {
            c0343Am.R(3, this.G.b());
        }
        if ((this.D & 8) == 8) {
            c0343Am.Z(4, this.H);
        }
        if ((this.D & 16) == 16) {
            c0343Am.Z(5, this.I);
        }
        if ((this.D & 32) == 32) {
            c0343Am.R(6, this.J.b());
        }
        c0343Am.h0(this.C);
    }

    public PA0(AbstractC5674jS.b bVar) {
        super(bVar);
        this.K = (byte) -1;
        this.L = -1;
        this.C = bVar.i();
    }

    public PA0(boolean z) {
        this.K = (byte) -1;
        this.L = -1;
        this.C = AbstractC4629fi.B;
    }

    public PA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.K = (byte) -1;
        this.L = -1;
        Q();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ == 8) {
                            this.D |= 1;
                            this.E = c9687xm.r();
                        } else if (iJ == 16) {
                            this.D |= 2;
                            this.F = c9687xm.r();
                        } else if (iJ == 24) {
                            int iM = c9687xm.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                c0343AmI.n0(iJ);
                                c0343AmI.n0(iM);
                            } else {
                                this.D |= 4;
                                this.G = cVarA;
                            }
                        } else if (iJ == 32) {
                            this.D |= 8;
                            this.H = c9687xm.r();
                        } else if (iJ == 40) {
                            this.D |= 16;
                            this.I = c9687xm.r();
                        } else if (iJ != 48) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            int iM2 = c9687xm.m();
                            d dVarA = d.a(iM2);
                            if (dVarA == null) {
                                c0343AmI.n0(iJ);
                                c0343AmI.n0(iM2);
                            } else {
                                this.D |= 32;
                                this.J = dVarA;
                            }
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

    public static final class b extends AbstractC5674jS.b implements InterfaceC2130Rj0 {
        public int C;
        public int D;
        public int E;
        public int G;
        public int H;
        public c F = c.ERROR;
        public d I = d.LANGUAGE_VERSION;

        public b() {
            q();
        }

        public static b p() {
            return new b();
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public PA0 a() {
            PA0 pa0N = n();
            if (pa0N.e()) {
                return pa0N;
            }
            throw S.a.h(pa0N);
        }

        public PA0 n() {
            PA0 pa0 = new PA0(this);
            int i = this.C;
            int i2 = (i & 1) != 1 ? 0 : 1;
            pa0.E = this.D;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            pa0.F = this.E;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            pa0.G = this.F;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            pa0.H = this.G;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            pa0.I = this.H;
            if ((i & 32) == 32) {
                i2 |= 32;
            }
            pa0.J = this.I;
            pa0.D = i2;
            return pa0;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.PA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.PA0.N     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.PA0 r3 = (com.daaw.PA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.PA0 r4 = (com.daaw.PA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.PA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.PA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b j(PA0 pa0) {
            if (pa0 == PA0.C()) {
                return this;
            }
            if (pa0.M()) {
                x(pa0.G());
            }
            if (pa0.O()) {
                y(pa0.H());
            }
            if (pa0.K()) {
                v(pa0.E());
            }
            if (pa0.J()) {
                u(pa0.D());
            }
            if (pa0.L()) {
                w(pa0.F());
            }
            if (pa0.P()) {
                z(pa0.I());
            }
            k(i().m(pa0.C));
            return this;
        }

        public b u(int i) {
            this.C |= 8;
            this.G = i;
            return this;
        }

        public b v(c cVar) {
            cVar.getClass();
            this.C |= 4;
            this.F = cVar;
            return this;
        }

        public b w(int i) {
            this.C |= 16;
            this.H = i;
            return this;
        }

        public b x(int i) {
            this.C |= 1;
            this.D = i;
            return this;
        }

        public b y(int i) {
            this.C |= 2;
            this.E = i;
            return this;
        }

        public b z(d dVar) {
            dVar.getClass();
            this.C |= 32;
            this.I = dVar;
            return this;
        }

        private void q() {
        }
    }
}
