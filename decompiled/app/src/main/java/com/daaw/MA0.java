package com.daaw;

import com.daaw.AbstractC3595c10;
import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class MA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final MA0 O;
    public static InterfaceC2792Xs0 P = new a();
    public final AbstractC4629fi D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public c I;
    public List J;
    public List K;
    public int L;
    public byte M;
    public int N;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public MA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new MA0(c9687xm, c6763nJ);
        }
    }

    public enum c implements AbstractC3595c10.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);

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
                return IN;
            }
            if (i == 1) {
                return OUT;
            }
            if (i != 2) {
                return null;
            }
            return INV;
        }

        @Override // com.daaw.AbstractC3595c10.a
        public final int b() {
            return this.B;
        }
    }

    static {
        MA0 ma0 = new MA0(true);
        O = ma0;
        ma0.c0();
    }

    public static MA0 O() {
        return O;
    }

    private void c0() {
        this.F = 0;
        this.G = 0;
        this.H = false;
        this.I = c.INV;
        List list = Collections.EMPTY_LIST;
        this.J = list;
        this.K = list;
    }

    public static b d0() {
        return b.u();
    }

    public static b e0(MA0 ma0) {
        return d0().j(ma0);
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public MA0 b() {
        return O;
    }

    public int Q() {
        return this.F;
    }

    public int R() {
        return this.G;
    }

    public boolean S() {
        return this.H;
    }

    public KA0 T(int i) {
        return (KA0) this.J.get(i);
    }

    public int U() {
        return this.J.size();
    }

    public List V() {
        return this.K;
    }

    public List W() {
        return this.J;
    }

    public c X() {
        return this.I;
    }

    public boolean Y() {
        return (this.E & 1) == 1;
    }

    public boolean Z() {
        return (this.E & 2) == 2;
    }

    public boolean a0() {
        return (this.E & 4) == 4;
    }

    public boolean b0() {
        return (this.E & 8) == 8;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.N;
        if (i != -1) {
            return i;
        }
        int iO = (this.E & 1) == 1 ? C0343Am.o(1, this.F) : 0;
        if ((this.E & 2) == 2) {
            iO += C0343Am.o(2, this.G);
        }
        if ((this.E & 4) == 4) {
            iO += C0343Am.a(3, this.H);
        }
        if ((this.E & 8) == 8) {
            iO += C0343Am.h(4, this.I.b());
        }
        for (int i2 = 0; i2 < this.J.size(); i2++) {
            iO += C0343Am.r(5, (InterfaceC2026Qj0) this.J.get(i2));
        }
        int iP = 0;
        for (int i3 = 0; i3 < this.K.size(); i3++) {
            iP += C0343Am.p(((Integer) this.K.get(i3)).intValue());
        }
        int iP2 = iO + iP;
        if (!V().isEmpty()) {
            iP2 = iP2 + 1 + C0343Am.p(iP);
        }
        this.L = iP;
        int iW = iP2 + w() + this.D.size();
        this.N = iW;
        return iW;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.M;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (!Y()) {
            this.M = (byte) 0;
            return false;
        }
        if (!Z()) {
            this.M = (byte) 0;
            return false;
        }
        for (int i = 0; i < U(); i++) {
            if (!T(i).e()) {
                this.M = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.M = (byte) 1;
            return true;
        }
        this.M = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return d0();
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
            c0343Am.K(3, this.H);
        }
        if ((this.E & 8) == 8) {
            c0343Am.R(4, this.I.b());
        }
        for (int i = 0; i < this.J.size(); i++) {
            c0343Am.c0(5, (InterfaceC2026Qj0) this.J.get(i));
        }
        if (V().size() > 0) {
            c0343Am.n0(50);
            c0343Am.n0(this.L);
        }
        for (int i2 = 0; i2 < this.K.size(); i2++) {
            c0343Am.a0(((Integer) this.K.get(i2)).intValue());
        }
        aVarB.a(1000, c0343Am);
        c0343Am.h0(this.D);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return e0(this);
    }

    public MA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.L = -1;
        this.M = (byte) -1;
        this.N = -1;
        this.D = cVar.i();
    }

    public MA0(boolean z) {
        this.L = -1;
        this.M = (byte) -1;
        this.N = -1;
        this.D = AbstractC4629fi.B;
    }

    public MA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.L = -1;
        this.M = (byte) -1;
        this.N = -1;
        c0();
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
                            this.E |= 1;
                            this.F = c9687xm.r();
                        } else if (iJ == 16) {
                            this.E |= 2;
                            this.G = c9687xm.r();
                        } else if (iJ == 24) {
                            this.E |= 4;
                            this.H = c9687xm.j();
                        } else if (iJ == 32) {
                            int iM = c9687xm.m();
                            c cVarA = c.a(iM);
                            if (cVarA == null) {
                                c0343AmI.n0(iJ);
                                c0343AmI.n0(iM);
                            } else {
                                this.E |= 8;
                                this.I = cVarA;
                            }
                        } else if (iJ == 42) {
                            if ((i & 16) != 16) {
                                this.J = new ArrayList();
                                i |= 16;
                            }
                            this.J.add(c9687xm.t(KA0.W, c6763nJ));
                        } else if (iJ == 48) {
                            if ((i & 32) != 32) {
                                this.K = new ArrayList();
                                i |= 32;
                            }
                            this.K.add(Integer.valueOf(c9687xm.r()));
                        } else if (iJ != 50) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            int i2 = c9687xm.i(c9687xm.z());
                            if ((i & 32) != 32 && c9687xm.e() > 0) {
                                this.K = new ArrayList();
                                i |= 32;
                            }
                            while (c9687xm.e() > 0) {
                                this.K.add(Integer.valueOf(c9687xm.r()));
                            }
                            c9687xm.h(i2);
                        }
                    }
                    z = true;
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i & 16) == 16) {
                    this.J = DesugarCollections.unmodifiableList(this.J);
                }
                if ((i & 32) == 32) {
                    this.K = DesugarCollections.unmodifiableList(this.K);
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
        if ((i & 16) == 16) {
            this.J = DesugarCollections.unmodifiableList(this.J);
        }
        if ((i & 32) == 32) {
            this.K = DesugarCollections.unmodifiableList(this.K);
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
        public boolean H;
        public c I = c.INV;
        public List J;
        public List K;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.J = list;
            this.K = list;
            x();
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

        public b C(boolean z) {
            this.E |= 4;
            this.H = z;
            return this;
        }

        public b D(c cVar) {
            cVar.getClass();
            this.E |= 8;
            this.I = cVar;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public MA0 a() {
            MA0 ma0R = r();
            if (ma0R.e()) {
                return ma0R;
            }
            throw S.a.h(ma0R);
        }

        public MA0 r() {
            MA0 ma0 = new MA0(this);
            int i = this.E;
            int i2 = (i & 1) != 1 ? 0 : 1;
            ma0.F = this.F;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            ma0.G = this.G;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ma0.H = this.H;
            if ((i & 8) == 8) {
                i2 |= 8;
            }
            ma0.I = this.I;
            if ((this.E & 16) == 16) {
                this.J = DesugarCollections.unmodifiableList(this.J);
                this.E &= -17;
            }
            ma0.J = this.J;
            if ((this.E & 32) == 32) {
                this.K = DesugarCollections.unmodifiableList(this.K);
                this.E &= -33;
            }
            ma0.K = this.K;
            ma0.E = i2;
            return ma0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        public final void v() {
            if ((this.E & 32) != 32) {
                this.K = new ArrayList(this.K);
                this.E |= 32;
            }
        }

        public final void w() {
            if ((this.E & 16) != 16) {
                this.J = new ArrayList(this.J);
                this.E |= 16;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.MA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.MA0.P     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.MA0 r3 = (com.daaw.MA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.MA0 r4 = (com.daaw.MA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.MA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.MA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b j(MA0 ma0) {
            if (ma0 == MA0.O()) {
                return this;
            }
            if (ma0.Y()) {
                A(ma0.Q());
            }
            if (ma0.Z()) {
                B(ma0.R());
            }
            if (ma0.a0()) {
                C(ma0.S());
            }
            if (ma0.b0()) {
                D(ma0.X());
            }
            if (!ma0.J.isEmpty()) {
                if (this.J.isEmpty()) {
                    this.J = ma0.J;
                    this.E &= -17;
                } else {
                    w();
                    this.J.addAll(ma0.J);
                }
            }
            if (!ma0.K.isEmpty()) {
                if (this.K.isEmpty()) {
                    this.K = ma0.K;
                    this.E &= -33;
                } else {
                    v();
                    this.K.addAll(ma0.K);
                }
            }
            o(ma0);
            k(i().m(ma0.D));
            return this;
        }

        private void x() {
        }
    }
}
