package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.KA0;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class BA0 extends AbstractC5674jS implements InterfaceC2130Rj0 {
    public static final BA0 N;
    public static InterfaceC2792Xs0 O = new a();
    public final AbstractC4629fi C;
    public int D;
    public int E;
    public int F;
    public c G;
    public KA0 H;
    public int I;
    public List J;
    public List K;
    public byte L;
    public int M;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public BA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new BA0(c9687xm, c6763nJ);
        }
    }

    public enum c implements AbstractC3595c10.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);

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
                return TRUE;
            }
            if (i == 1) {
                return FALSE;
            }
            if (i != 2) {
                return null;
            }
            return NULL;
        }

        @Override // com.daaw.AbstractC3595c10.a
        public final int b() {
            return this.B;
        }
    }

    static {
        BA0 ba0 = new BA0(true);
        N = ba0;
        ba0.V();
    }

    public static BA0 I() {
        return N;
    }

    private void V() {
        this.E = 0;
        this.F = 0;
        this.G = c.TRUE;
        this.H = KA0.b0();
        this.I = 0;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
    }

    public static b W() {
        return b.p();
    }

    public static b X(BA0 ba0) {
        return W().j(ba0);
    }

    public BA0 F(int i) {
        return (BA0) this.J.get(i);
    }

    public int G() {
        return this.J.size();
    }

    public c H() {
        return this.G;
    }

    public int J() {
        return this.E;
    }

    public KA0 K() {
        return this.H;
    }

    public int L() {
        return this.I;
    }

    public BA0 M(int i) {
        return (BA0) this.K.get(i);
    }

    public int O() {
        return this.K.size();
    }

    public int P() {
        return this.F;
    }

    public boolean Q() {
        return (this.D & 4) == 4;
    }

    public boolean R() {
        return (this.D & 1) == 1;
    }

    public boolean S() {
        return (this.D & 8) == 8;
    }

    public boolean T() {
        return (this.D & 16) == 16;
    }

    public boolean U() {
        return (this.D & 2) == 2;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public b d() {
        return W();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b f() {
        return X(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.M;
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
            iO += C0343Am.r(4, this.H);
        }
        if ((this.D & 16) == 16) {
            iO += C0343Am.o(5, this.I);
        }
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            iO += C0343Am.r(6, (InterfaceC2026Qj0) this.J.get(i2));
        }
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            iO += C0343Am.r(7, (InterfaceC2026Qj0) this.K.get(i3));
        }
        int size = iO + this.C.size();
        this.M = size;
        return size;
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
        if (S() && !K().e()) {
            this.L = (byte) 0;
            return false;
        }
        for (int i = 0; i < G(); i++) {
            if (!F(i).e()) {
                this.L = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < O(); i2++) {
            if (!M(i2).e()) {
                this.L = (byte) 0;
                return false;
            }
        }
        this.L = (byte) 1;
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
            c0343Am.c0(4, this.H);
        }
        if ((this.D & 16) == 16) {
            c0343Am.Z(5, this.I);
        }
        for (int i = 0; i < this.J.size(); i++) {
            c0343Am.c0(6, (InterfaceC2026Qj0) this.J.get(i));
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            c0343Am.c0(7, (InterfaceC2026Qj0) this.K.get(i2));
        }
        c0343Am.h0(this.C);
    }

    public BA0(AbstractC5674jS.b bVar) {
        super(bVar);
        this.L = (byte) -1;
        this.M = -1;
        this.C = bVar.i();
    }

    public BA0(boolean z) {
        this.L = (byte) -1;
        this.M = -1;
        this.C = AbstractC4629fi.B;
    }

    public BA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.L = (byte) -1;
        this.M = -1;
        V();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        int i = 0;
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
                        } else if (iJ == 34) {
                            KA0.c cVarF = (this.D & 8) == 8 ? this.H.f() : null;
                            KA0 ka0 = (KA0) c9687xm.t(KA0.W, c6763nJ);
                            this.H = ka0;
                            if (cVarF != null) {
                                cVarF.j(ka0);
                                this.H = cVarF.r();
                            }
                            this.D |= 8;
                        } else if (iJ == 40) {
                            this.D |= 16;
                            this.I = c9687xm.r();
                        } else if (iJ == 50) {
                            if ((i & 32) != 32) {
                                this.J = new ArrayList();
                                i |= 32;
                            }
                            this.J.add(c9687xm.t(O, c6763nJ));
                        } else if (iJ != 58) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            if ((i & 64) != 64) {
                                this.K = new ArrayList();
                                i |= 64;
                            }
                            this.K.add(c9687xm.t(O, c6763nJ));
                        }
                    }
                    z = true;
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i & 32) == 32) {
                    this.J = DesugarCollections.unmodifiableList(this.J);
                }
                if ((i & 64) == 64) {
                    this.K = DesugarCollections.unmodifiableList(this.K);
                }
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
        if ((i & 32) == 32) {
            this.J = DesugarCollections.unmodifiableList(this.J);
        }
        if ((i & 64) == 64) {
            this.K = DesugarCollections.unmodifiableList(this.K);
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
        public c F = c.TRUE;
        public KA0 G = KA0.b0();
        public int H;
        public List I;
        public List J;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.I = list;
            this.J = list;
            t();
        }

        public static b p() {
            return new b();
        }

        public b A(int i) {
            this.C |= 2;
            this.E = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public BA0 a() {
            BA0 ba0N = n();
            if (ba0N.e()) {
                return ba0N;
            }
            throw S.a.h(ba0N);
        }

        public BA0 n() {
            BA0 ba0 = new BA0(this);
            int i = this.C;
            int i2 = (i & 1) != 1 ? 0 : 1;
            ba0.E = this.D;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            ba0.F = this.E;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ba0.G = this.F;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            ba0.H = this.G;
            if ((i & 16) == 16) {
                i2 |= 16;
            }
            ba0.I = this.H;
            if ((this.C & 32) == 32) {
                this.I = DesugarCollections.unmodifiableList(this.I);
                this.C &= -33;
            }
            ba0.J = this.I;
            if ((this.C & 64) == 64) {
                this.J = DesugarCollections.unmodifiableList(this.J);
                this.C &= -65;
            }
            ba0.K = this.J;
            ba0.D = i2;
            return ba0;
        }

        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return p().j(n());
        }

        public final void q() {
            if ((this.C & 32) != 32) {
                this.I = new ArrayList(this.I);
                this.C |= 32;
            }
        }

        public final void r() {
            if ((this.C & 64) != 64) {
                this.J = new ArrayList(this.J);
                this.C |= 64;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.BA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.BA0.O     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.BA0 r3 = (com.daaw.BA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.BA0 r4 = (com.daaw.BA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.BA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.BA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public b j(BA0 ba0) {
            if (ba0 == BA0.I()) {
                return this;
            }
            if (ba0.R()) {
                y(ba0.J());
            }
            if (ba0.U()) {
                A(ba0.P());
            }
            if (ba0.Q()) {
                x(ba0.H());
            }
            if (ba0.S()) {
                w(ba0.K());
            }
            if (ba0.T()) {
                z(ba0.L());
            }
            if (!ba0.J.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = ba0.J;
                    this.C &= -33;
                } else {
                    q();
                    this.I.addAll(ba0.J);
                }
            }
            if (!ba0.K.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = ba0.K;
                    this.C &= -65;
                } else {
                    r();
                    this.J.addAll(ba0.K);
                }
            }
            k(i().m(ba0.C));
            return this;
        }

        public b w(KA0 ka0) {
            if ((this.C & 8) != 8 || this.G == KA0.b0()) {
                this.G = ka0;
            } else {
                this.G = KA0.C0(this.G).j(ka0).r();
            }
            this.C |= 8;
            return this;
        }

        public b x(c cVar) {
            cVar.getClass();
            this.C |= 4;
            this.F = cVar;
            return this;
        }

        public b y(int i) {
            this.C |= 1;
            this.D = i;
            return this;
        }

        public b z(int i) {
            this.C |= 16;
            this.H = i;
            return this;
        }

        private void t() {
        }
    }
}
