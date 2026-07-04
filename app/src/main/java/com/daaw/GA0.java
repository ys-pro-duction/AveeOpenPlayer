package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.FA0;
import com.daaw.IA0;
import com.daaw.JA0;
import com.daaw.S;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class GA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final GA0 L;
    public static InterfaceC2792Xs0 M = new a();
    public final AbstractC4629fi D;
    public int E;
    public JA0 F;
    public IA0 G;
    public FA0 H;
    public List I;
    public byte J;
    public int K;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public GA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new GA0(c9687xm, c6763nJ);
        }
    }

    static {
        GA0 ga0 = new GA0(true);
        L = ga0;
        ga0.W();
    }

    public static GA0 O() {
        return L;
    }

    private void W() {
        this.F = JA0.x();
        this.G = IA0.x();
        this.H = FA0.O();
        this.I = Collections.EMPTY_LIST;
    }

    public static b X() {
        return b.u();
    }

    public static b Y(GA0 ga0) {
        return X().j(ga0);
    }

    public static GA0 a0(InputStream inputStream, C6763nJ c6763nJ) {
        return (GA0) M.b(inputStream, c6763nJ);
    }

    public C9245wA0 K(int i) {
        return (C9245wA0) this.I.get(i);
    }

    public int L() {
        return this.I.size();
    }

    public List M() {
        return this.I;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public GA0 b() {
        return L;
    }

    public FA0 Q() {
        return this.H;
    }

    public IA0 R() {
        return this.G;
    }

    public JA0 S() {
        return this.F;
    }

    public boolean T() {
        return (this.E & 4) == 4;
    }

    public boolean U() {
        return (this.E & 2) == 2;
    }

    public boolean V() {
        return (this.E & 1) == 1;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public b d() {
        return X();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return Y(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.K;
        if (i != -1) {
            return i;
        }
        int iR = (this.E & 1) == 1 ? C0343Am.r(1, this.F) : 0;
        if ((this.E & 2) == 2) {
            iR += C0343Am.r(2, this.G);
        }
        if ((this.E & 4) == 4) {
            iR += C0343Am.r(3, this.H);
        }
        for (int i2 = 0; i2 < this.I.size(); i2++) {
            iR += C0343Am.r(4, (InterfaceC2026Qj0) this.I.get(i2));
        }
        int iW = iR + w() + this.D.size();
        this.K = iW;
        return iW;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.J;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (U() && !R().e()) {
            this.J = (byte) 0;
            return false;
        }
        if (T() && !Q().e()) {
            this.J = (byte) 0;
            return false;
        }
        for (int i = 0; i < L(); i++) {
            if (!K(i).e()) {
                this.J = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.J = (byte) 1;
            return true;
        }
        this.J = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 1) == 1) {
            c0343Am.c0(1, this.F);
        }
        if ((this.E & 2) == 2) {
            c0343Am.c0(2, this.G);
        }
        if ((this.E & 4) == 4) {
            c0343Am.c0(3, this.H);
        }
        for (int i = 0; i < this.I.size(); i++) {
            c0343Am.c0(4, (InterfaceC2026Qj0) this.I.get(i));
        }
        aVarB.a(RCHTTPStatusCodes.SUCCESS, c0343Am);
        c0343Am.h0(this.D);
    }

    public GA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.J = (byte) -1;
        this.K = -1;
        this.D = cVar.i();
    }

    public GA0(boolean z) {
        this.J = (byte) -1;
        this.K = -1;
        this.D = AbstractC4629fi.B;
    }

    public GA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.J = (byte) -1;
        this.K = -1;
        W();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ == 10) {
                            JA0.b bVarE = (this.E & 1) == 1 ? this.F.f() : null;
                            JA0 ja0 = (JA0) c9687xm.t(JA0.H, c6763nJ);
                            this.F = ja0;
                            if (bVarE != null) {
                                bVarE.j(ja0);
                                this.F = bVarE.n();
                            }
                            this.E |= 1;
                        } else if (iJ == 18) {
                            IA0.b bVarE2 = (this.E & 2) == 2 ? this.G.f() : null;
                            IA0 ia0 = (IA0) c9687xm.t(IA0.H, c6763nJ);
                            this.G = ia0;
                            if (bVarE2 != null) {
                                bVarE2.j(ia0);
                                this.G = bVarE2.n();
                            }
                            this.E |= 2;
                        } else if (iJ == 26) {
                            FA0.b bVarF = (this.E & 4) == 4 ? this.H.f() : null;
                            FA0 fa0 = (FA0) c9687xm.t(FA0.N, c6763nJ);
                            this.H = fa0;
                            if (bVarF != null) {
                                bVarF.j(fa0);
                                this.H = bVarF.r();
                            }
                            this.E |= 4;
                        } else if (iJ != 34) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            if ((i & 8) != 8) {
                                this.I = new ArrayList();
                                i = 8;
                            }
                            this.I.add(c9687xm.t(C9245wA0.m0, c6763nJ));
                        }
                    }
                    z = true;
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i & 8) == 8) {
                    this.I = DesugarCollections.unmodifiableList(this.I);
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
        if ((i & 8) == 8) {
            this.I = DesugarCollections.unmodifiableList(this.I);
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
        public JA0 F = JA0.x();
        public IA0 G = IA0.x();
        public FA0 H = FA0.O();
        public List I = Collections.EMPTY_LIST;

        public b() {
            w();
        }

        public static b u() {
            return new b();
        }

        public b A(IA0 ia0) {
            if ((this.E & 2) != 2 || this.G == IA0.x()) {
                this.G = ia0;
            } else {
                this.G = IA0.C(this.G).j(ia0).n();
            }
            this.E |= 2;
            return this;
        }

        public b B(JA0 ja0) {
            if ((this.E & 1) != 1 || this.F == JA0.x()) {
                this.F = ja0;
            } else {
                this.F = JA0.C(this.F).j(ja0).n();
            }
            this.E |= 1;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public GA0 a() {
            GA0 ga0R = r();
            if (ga0R.e()) {
                return ga0R;
            }
            throw S.a.h(ga0R);
        }

        public GA0 r() {
            GA0 ga0 = new GA0(this);
            int i = this.E;
            int i2 = (i & 1) != 1 ? 0 : 1;
            ga0.F = this.F;
            if ((i & 2) == 2) {
                i2 |= 2;
            }
            ga0.G = this.G;
            if ((i & 4) == 4) {
                i2 |= 4;
            }
            ga0.H = this.H;
            if ((this.E & 8) == 8) {
                this.I = DesugarCollections.unmodifiableList(this.I);
                this.E &= -9;
            }
            ga0.I = this.I;
            ga0.E = i2;
            return ga0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        public final void v() {
            if ((this.E & 8) != 8) {
                this.I = new ArrayList(this.I);
                this.E |= 8;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.GA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.GA0.M     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.GA0 r3 = (com.daaw.GA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.GA0 r4 = (com.daaw.GA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.GA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.GA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public b j(GA0 ga0) {
            if (ga0 == GA0.O()) {
                return this;
            }
            if (ga0.V()) {
                B(ga0.S());
            }
            if (ga0.U()) {
                A(ga0.R());
            }
            if (ga0.T()) {
                z(ga0.Q());
            }
            if (!ga0.I.isEmpty()) {
                if (this.I.isEmpty()) {
                    this.I = ga0.I;
                    this.E &= -9;
                } else {
                    v();
                    this.I.addAll(ga0.I);
                }
            }
            o(ga0);
            k(i().m(ga0.D));
            return this;
        }

        public b z(FA0 fa0) {
            if ((this.E & 4) != 4 || this.H == FA0.O()) {
                this.H = fa0;
            } else {
                this.H = FA0.f0(this.H).j(fa0).r();
            }
            this.E |= 4;
            return this;
        }

        private void w() {
        }
    }
}
