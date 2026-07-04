package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.NA0;
import com.daaw.QA0;
import com.daaw.S;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class FA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final FA0 M;
    public static InterfaceC2792Xs0 N = new a();
    public final AbstractC4629fi D;
    public int E;
    public List F;
    public List G;
    public List H;
    public NA0 I;
    public QA0 J;
    public byte K;
    public int L;

    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public FA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new FA0(c9687xm, c6763nJ);
        }
    }

    static {
        FA0 fa0 = new FA0(true);
        M = fa0;
        fa0.d0();
    }

    public static FA0 O() {
        return M;
    }

    private void d0() {
        List list = Collections.EMPTY_LIST;
        this.F = list;
        this.G = list;
        this.H = list;
        this.I = NA0.z();
        this.J = QA0.x();
    }

    public static b e0() {
        return b.u();
    }

    public static b f0(FA0 fa0) {
        return e0().j(fa0);
    }

    public static FA0 h0(InputStream inputStream, C6763nJ c6763nJ) {
        return (FA0) N.b(inputStream, c6763nJ);
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public FA0 b() {
        return M;
    }

    public CA0 Q(int i) {
        return (CA0) this.F.get(i);
    }

    public int R() {
        return this.F.size();
    }

    public List S() {
        return this.F;
    }

    public HA0 T(int i) {
        return (HA0) this.G.get(i);
    }

    public int U() {
        return this.G.size();
    }

    public List V() {
        return this.G;
    }

    public LA0 W(int i) {
        return (LA0) this.H.get(i);
    }

    public int X() {
        return this.H.size();
    }

    public List Y() {
        return this.H;
    }

    public NA0 Z() {
        return this.I;
    }

    public QA0 a0() {
        return this.J;
    }

    public boolean b0() {
        return (this.E & 1) == 1;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.L;
        if (i != -1) {
            return i;
        }
        int iR = 0;
        for (int i2 = 0; i2 < this.F.size(); i2++) {
            iR += C0343Am.r(3, (InterfaceC2026Qj0) this.F.get(i2));
        }
        for (int i3 = 0; i3 < this.G.size(); i3++) {
            iR += C0343Am.r(4, (InterfaceC2026Qj0) this.G.get(i3));
        }
        for (int i4 = 0; i4 < this.H.size(); i4++) {
            iR += C0343Am.r(5, (InterfaceC2026Qj0) this.H.get(i4));
        }
        if ((this.E & 1) == 1) {
            iR += C0343Am.r(30, this.I);
        }
        if ((this.E & 2) == 2) {
            iR += C0343Am.r(32, this.J);
        }
        int iW = iR + w() + this.D.size();
        this.L = iW;
        return iW;
    }

    public boolean c0() {
        return (this.E & 2) == 2;
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
        for (int i = 0; i < R(); i++) {
            if (!Q(i).e()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < U(); i2++) {
            if (!T(i2).e()) {
                this.K = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < X(); i3++) {
            if (!W(i3).e()) {
                this.K = (byte) 0;
                return false;
            }
        }
        if (b0() && !Z().e()) {
            this.K = (byte) 0;
            return false;
        }
        if (u()) {
            this.K = (byte) 1;
            return true;
        }
        this.K = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        for (int i = 0; i < this.F.size(); i++) {
            c0343Am.c0(3, (InterfaceC2026Qj0) this.F.get(i));
        }
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            c0343Am.c0(4, (InterfaceC2026Qj0) this.G.get(i2));
        }
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            c0343Am.c0(5, (InterfaceC2026Qj0) this.H.get(i3));
        }
        if ((this.E & 1) == 1) {
            c0343Am.c0(30, this.I);
        }
        if ((this.E & 2) == 2) {
            c0343Am.c0(32, this.J);
        }
        aVarB.a(RCHTTPStatusCodes.SUCCESS, c0343Am);
        c0343Am.h0(this.D);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public b d() {
        return e0();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public b f() {
        return f0(this);
    }

    public FA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.K = (byte) -1;
        this.L = -1;
        this.D = cVar.i();
    }

    public FA0(boolean z) {
        this.K = (byte) -1;
        this.L = -1;
        this.D = AbstractC4629fi.B;
    }

    public FA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.K = (byte) -1;
        this.L = -1;
        d0();
        AbstractC4629fi.b bVarG = AbstractC4629fi.G();
        C0343Am c0343AmI = C0343Am.I(bVarG, 1);
        boolean z = false;
        int i = 0;
        while (!z) {
            try {
                try {
                    int iJ = c9687xm.J();
                    if (iJ != 0) {
                        if (iJ == 26) {
                            if ((i & 1) != 1) {
                                this.F = new ArrayList();
                                i |= 1;
                            }
                            this.F.add(c9687xm.t(CA0.X, c6763nJ));
                        } else if (iJ == 34) {
                            if ((i & 2) != 2) {
                                this.G = new ArrayList();
                                i |= 2;
                            }
                            this.G.add(c9687xm.t(HA0.X, c6763nJ));
                        } else if (iJ != 42) {
                            if (iJ == 242) {
                                NA0.b bVarJ = (this.E & 1) == 1 ? this.I.f() : null;
                                NA0 na0 = (NA0) c9687xm.t(NA0.J, c6763nJ);
                                this.I = na0;
                                if (bVarJ != null) {
                                    bVarJ.j(na0);
                                    this.I = bVarJ.n();
                                }
                                this.E |= 1;
                            } else if (iJ != 258) {
                                if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                                }
                            } else {
                                QA0.b bVarE = (this.E & 2) == 2 ? this.J.f() : null;
                                QA0 qa0 = (QA0) c9687xm.t(QA0.H, c6763nJ);
                                this.J = qa0;
                                if (bVarE != null) {
                                    bVarE.j(qa0);
                                    this.J = bVarE.n();
                                }
                                this.E |= 2;
                            }
                        } else {
                            if ((i & 4) != 4) {
                                this.H = new ArrayList();
                                i |= 4;
                            }
                            this.H.add(c9687xm.t(LA0.R, c6763nJ));
                        }
                    }
                    z = true;
                } catch (Q10 e) {
                    throw e.i(this);
                } catch (IOException e2) {
                    throw new Q10(e2.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if ((i & 1) == 1) {
                    this.F = DesugarCollections.unmodifiableList(this.F);
                }
                if ((i & 2) == 2) {
                    this.G = DesugarCollections.unmodifiableList(this.G);
                }
                if ((i & 4) == 4) {
                    this.H = DesugarCollections.unmodifiableList(this.H);
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
        if ((i & 1) == 1) {
            this.F = DesugarCollections.unmodifiableList(this.F);
        }
        if ((i & 2) == 2) {
            this.G = DesugarCollections.unmodifiableList(this.G);
        }
        if ((i & 4) == 4) {
            this.H = DesugarCollections.unmodifiableList(this.H);
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
        public List F;
        public List G;
        public List H;
        public NA0 I;
        public QA0 J;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.F = list;
            this.G = list;
            this.H = list;
            this.I = NA0.z();
            this.J = QA0.x();
            y();
        }

        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.E & 1) != 1) {
                this.F = new ArrayList(this.F);
                this.E |= 1;
            }
        }

        private void w() {
            if ((this.E & 2) != 2) {
                this.G = new ArrayList(this.G);
                this.E |= 2;
            }
        }

        private void x() {
            if ((this.E & 4) != 4) {
                this.H = new ArrayList(this.H);
                this.E |= 4;
            }
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
        public b j(FA0 fa0) {
            if (fa0 == FA0.O()) {
                return this;
            }
            if (!fa0.F.isEmpty()) {
                if (this.F.isEmpty()) {
                    this.F = fa0.F;
                    this.E &= -2;
                } else {
                    v();
                    this.F.addAll(fa0.F);
                }
            }
            if (!fa0.G.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = fa0.G;
                    this.E &= -3;
                } else {
                    w();
                    this.G.addAll(fa0.G);
                }
            }
            if (!fa0.H.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = fa0.H;
                    this.E &= -5;
                } else {
                    x();
                    this.H.addAll(fa0.H);
                }
            }
            if (fa0.b0()) {
                B(fa0.Z());
            }
            if (fa0.c0()) {
                C(fa0.a0());
            }
            o(fa0);
            k(i().m(fa0.D));
            return this;
        }

        public b B(NA0 na0) {
            if ((this.E & 8) != 8 || this.I == NA0.z()) {
                this.I = na0;
            } else {
                this.I = NA0.H(this.I).j(na0).n();
            }
            this.E |= 8;
            return this;
        }

        public b C(QA0 qa0) {
            if ((this.E & 16) != 16 || this.J == QA0.x()) {
                this.J = qa0;
            } else {
                this.J = QA0.C(this.J).j(qa0).n();
            }
            this.E |= 16;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public FA0 a() {
            FA0 fa0R = r();
            if (fa0R.e()) {
                return fa0R;
            }
            throw S.a.h(fa0R);
        }

        public FA0 r() {
            FA0 fa0 = new FA0(this);
            int i = this.E;
            if ((i & 1) == 1) {
                this.F = DesugarCollections.unmodifiableList(this.F);
                this.E &= -2;
            }
            fa0.F = this.F;
            if ((this.E & 2) == 2) {
                this.G = DesugarCollections.unmodifiableList(this.G);
                this.E &= -3;
            }
            fa0.G = this.G;
            if ((this.E & 4) == 4) {
                this.H = DesugarCollections.unmodifiableList(this.H);
                this.E &= -5;
            }
            fa0.H = this.H;
            int i2 = (i & 8) != 8 ? 0 : 1;
            fa0.I = this.I;
            if ((i & 16) == 16) {
                i2 |= 2;
            }
            fa0.J = this.J;
            fa0.E = i2;
            return fa0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.FA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.FA0.N     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.FA0 r3 = (com.daaw.FA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.FA0 r4 = (com.daaw.FA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.FA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.FA0$b");
        }

        private void y() {
        }
    }
}
