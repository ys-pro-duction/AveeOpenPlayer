package com.daaw;

import com.daaw.AbstractC4629fi;
import com.daaw.AbstractC5674jS;
import com.daaw.S;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.daaw.xA0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C9524xA0 extends AbstractC5674jS.d implements InterfaceC2130Rj0 {
    public static final C9524xA0 K;
    public static InterfaceC2792Xs0 L = new a();
    public final AbstractC4629fi D;
    public int E;
    public int F;
    public List G;
    public List H;
    public byte I;
    public int J;

    /* JADX INFO: renamed from: com.daaw.xA0$a */
    public static class a extends Z {
        @Override // com.daaw.InterfaceC2792Xs0
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public C9524xA0 c(C9687xm c9687xm, C6763nJ c6763nJ) {
            return new C9524xA0(c9687xm, c6763nJ);
        }
    }

    static {
        C9524xA0 c9524xA0 = new C9524xA0(true);
        K = c9524xA0;
        c9524xA0.T();
    }

    public static C9524xA0 K() {
        return K;
    }

    private void T() {
        this.F = 6;
        List list = Collections.EMPTY_LIST;
        this.G = list;
        this.H = list;
    }

    public static b U() {
        return b.u();
    }

    public static b V(C9524xA0 c9524xA0) {
        return U().j(c9524xA0);
    }

    @Override // com.daaw.InterfaceC2130Rj0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public C9524xA0 b() {
        return K;
    }

    public int M() {
        return this.F;
    }

    public OA0 O(int i) {
        return (OA0) this.G.get(i);
    }

    public int P() {
        return this.G.size();
    }

    public List Q() {
        return this.G;
    }

    public List R() {
        return this.H;
    }

    public boolean S() {
        return (this.E & 1) == 1;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public b d() {
        return U();
    }

    @Override // com.daaw.InterfaceC2026Qj0
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public b f() {
        return V(this);
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public int c() {
        int i = this.J;
        if (i != -1) {
            return i;
        }
        int iO = (this.E & 1) == 1 ? C0343Am.o(1, this.F) : 0;
        for (int i2 = 0; i2 < this.G.size(); i2++) {
            iO += C0343Am.r(2, (InterfaceC2026Qj0) this.G.get(i2));
        }
        int iP = 0;
        for (int i3 = 0; i3 < this.H.size(); i3++) {
            iP += C0343Am.p(((Integer) this.H.get(i3)).intValue());
        }
        int size = iO + iP + (R().size() * 2) + w() + this.D.size();
        this.J = size;
        return size;
    }

    @Override // com.daaw.InterfaceC2130Rj0
    public final boolean e() {
        byte b2 = this.I;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i = 0; i < P(); i++) {
            if (!O(i).e()) {
                this.I = (byte) 0;
                return false;
            }
        }
        if (u()) {
            this.I = (byte) 1;
            return true;
        }
        this.I = (byte) 0;
        return false;
    }

    @Override // com.daaw.InterfaceC2026Qj0
    public void g(C0343Am c0343Am) throws IOException {
        c();
        AbstractC5674jS.d.a aVarB = B();
        if ((this.E & 1) == 1) {
            c0343Am.Z(1, this.F);
        }
        for (int i = 0; i < this.G.size(); i++) {
            c0343Am.c0(2, (InterfaceC2026Qj0) this.G.get(i));
        }
        for (int i2 = 0; i2 < this.H.size(); i2++) {
            c0343Am.Z(31, ((Integer) this.H.get(i2)).intValue());
        }
        aVarB.a(19000, c0343Am);
        c0343Am.h0(this.D);
    }

    public C9524xA0(AbstractC5674jS.c cVar) {
        super(cVar);
        this.I = (byte) -1;
        this.J = -1;
        this.D = cVar.i();
    }

    public C9524xA0(boolean z) {
        this.I = (byte) -1;
        this.J = -1;
        this.D = AbstractC4629fi.B;
    }

    public C9524xA0(C9687xm c9687xm, C6763nJ c6763nJ) {
        this.I = (byte) -1;
        this.J = -1;
        T();
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
                        } else if (iJ == 18) {
                            if ((i & 2) != 2) {
                                this.G = new ArrayList();
                                i |= 2;
                            }
                            this.G.add(c9687xm.t(OA0.O, c6763nJ));
                        } else if (iJ == 248) {
                            if ((i & 4) != 4) {
                                this.H = new ArrayList();
                                i |= 4;
                            }
                            this.H.add(Integer.valueOf(c9687xm.r()));
                        } else if (iJ != 250) {
                            if (!r(c9687xm, c0343AmI, c6763nJ, iJ)) {
                            }
                        } else {
                            int i2 = c9687xm.i(c9687xm.z());
                            if ((i & 4) != 4 && c9687xm.e() > 0) {
                                this.H = new ArrayList();
                                i |= 4;
                            }
                            while (c9687xm.e() > 0) {
                                this.H.add(Integer.valueOf(c9687xm.r()));
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

    /* JADX INFO: renamed from: com.daaw.xA0$b */
    public static final class b extends AbstractC5674jS.c implements InterfaceC2130Rj0 {
        public int E;
        public int F = 6;
        public List G;
        public List H;

        public b() {
            List list = Collections.EMPTY_LIST;
            this.G = list;
            this.H = list;
            x();
        }

        public static b u() {
            return new b();
        }

        private void w() {
            if ((this.E & 4) != 4) {
                this.H = new ArrayList(this.H);
                this.E |= 4;
            }
        }

        public b A(int i) {
            this.E |= 1;
            this.F = i;
            return this;
        }

        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public C9524xA0 a() {
            C9524xA0 c9524xA0R = r();
            if (c9524xA0R.e()) {
                return c9524xA0R;
            }
            throw S.a.h(c9524xA0R);
        }

        public C9524xA0 r() {
            C9524xA0 c9524xA0 = new C9524xA0(this);
            int i = (this.E & 1) != 1 ? 0 : 1;
            c9524xA0.F = this.F;
            if ((this.E & 2) == 2) {
                this.G = DesugarCollections.unmodifiableList(this.G);
                this.E &= -3;
            }
            c9524xA0.G = this.G;
            if ((this.E & 4) == 4) {
                this.H = DesugarCollections.unmodifiableList(this.H);
                this.E &= -5;
            }
            c9524xA0.H = this.H;
            c9524xA0.E = i;
            return c9524xA0;
        }

        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public b clone() {
            return u().j(r());
        }

        public final void v() {
            if ((this.E & 2) != 2) {
                this.G = new ArrayList(this.G);
                this.E |= 2;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // com.daaw.InterfaceC2026Qj0.a
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public com.daaw.C9524xA0.b N(com.daaw.C9687xm r3, com.daaw.C6763nJ r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                com.daaw.Xs0 r1 = com.daaw.C9524xA0.L     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                java.lang.Object r3 = r1.c(r3, r4)     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
                com.daaw.xA0 r3 = (com.daaw.C9524xA0) r3     // Catch: java.lang.Throwable -> Lf com.daaw.Q10 -> L11
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
                com.daaw.xA0 r4 = (com.daaw.C9524xA0) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: com.daaw.C9524xA0.b.N(com.daaw.xm, com.daaw.nJ):com.daaw.xA0$b");
        }

        @Override // com.daaw.AbstractC5674jS.b
        /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
        public b j(C9524xA0 c9524xA0) {
            if (c9524xA0 == C9524xA0.K()) {
                return this;
            }
            if (c9524xA0.S()) {
                A(c9524xA0.M());
            }
            if (!c9524xA0.G.isEmpty()) {
                if (this.G.isEmpty()) {
                    this.G = c9524xA0.G;
                    this.E &= -3;
                } else {
                    v();
                    this.G.addAll(c9524xA0.G);
                }
            }
            if (!c9524xA0.H.isEmpty()) {
                if (this.H.isEmpty()) {
                    this.H = c9524xA0.H;
                    this.E &= -5;
                } else {
                    w();
                    this.H.addAll(c9524xA0.H);
                }
            }
            o(c9524xA0);
            k(i().m(c9524xA0.D));
            return this;
        }

        private void x() {
        }
    }
}
